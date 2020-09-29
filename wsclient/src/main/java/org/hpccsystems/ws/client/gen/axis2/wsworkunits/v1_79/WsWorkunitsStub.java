/**
 * WsWorkunitsStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79;


/*
 *  WsWorkunitsStub java implementation
 */
public class WsWorkunitsStub extends org.apache.axis2.client.Stub
    implements WsWorkunits {
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
    public WsWorkunitsStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public WsWorkunitsStub(
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
    public WsWorkunitsStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "http://10.173.160.101:8010/WsWorkunits?ver_=1.79");
    }

    /**
     * Default Constructor
     */
    public WsWorkunitsStub() throws org.apache.axis2.AxisFault {
        this("http://10.173.160.101:8010/WsWorkunits?ver_=1.79");
    }

    /**
     * Constructor taking the target endpoint
     */
    public WsWorkunitsStub(java.lang.String targetEndpoint)
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
        _service = new org.apache.axis2.description.AxisService("WsWorkunits" +
                getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[80];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQuerysetAliasAction"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUGetStats"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQueryDetails"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUListArchiveFiles"));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUCopyQuerySet"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUPublishWorkunit"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQueryConfig"));
        _service.addOperation(__operation);

        _operations[6] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUCompileECL"));
        _service.addOperation(__operation);

        _operations[7] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUProtect"));
        _service.addOperation(__operation);

        _operations[8] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUListLocalFileRequired"));
        _service.addOperation(__operation);

        _operations[9] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wURecreateQuery"));
        _service.addOperation(__operation);

        _operations[10] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUCheckFeatures"));
        _service.addOperation(__operation);

        _operations[11] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUCreateAndUpdate"));
        _service.addOperation(__operation);

        _operations[12] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUGraphInfo"));
        _service.addOperation(__operation);

        _operations[13] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUGetGraphNameAndTypes"));
        _service.addOperation(__operation);

        _operations[14] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUListQueriesUsingFile"));
        _service.addOperation(__operation);

        _operations[15] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUSyntaxCheckECL"));
        _service.addOperation(__operation);

        _operations[16] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUDeployWorkunit"));
        _service.addOperation(__operation);

        _operations[17] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUCreateZAPInfo"));
        _service.addOperation(__operation);

        _operations[18] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUUpdateQueryEntry"));
        _service.addOperation(__operation);

        _operations[19] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUResultBin"));
        _service.addOperation(__operation);

        _operations[20] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUShowScheduled"));
        _service.addOperation(__operation);

        _operations[21] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUGetArchiveFile"));
        _service.addOperation(__operation);

        _operations[22] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUFullResult"));
        _service.addOperation(__operation);

        _operations[23] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQuerysetExport"));
        _service.addOperation(__operation);

        _operations[24] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wULightWeightQuery"));
        _service.addOperation(__operation);

        _operations[25] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQueryDetailsLightWeight"));
        _service.addOperation(__operation);

        _operations[26] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQuerysetDetails"));
        _service.addOperation(__operation);

        _operations[27] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUSchedule"));
        _service.addOperation(__operation);

        _operations[28] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUClusterJobQueueLOG"));
        _service.addOperation(__operation);

        _operations[29] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUResultSummary"));
        _service.addOperation(__operation);

        _operations[30] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUGetPlugins"));
        _service.addOperation(__operation);

        _operations[31] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQuery"));
        _service.addOperation(__operation);

        _operations[32] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUAbort"));
        _service.addOperation(__operation);

        _operations[33] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUWaitComplete"));
        _service.addOperation(__operation);

        _operations[34] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUResultView"));
        _service.addOperation(__operation);

        _operations[35] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUInfo"));
        _service.addOperation(__operation);

        _operations[36] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUDetailsMeta"));
        _service.addOperation(__operation);

        _operations[37] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUDelete"));
        _service.addOperation(__operation);

        _operations[38] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQueryGetSummaryStats"));
        _service.addOperation(__operation);

        _operations[39] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUClusterJobSummaryXLS"));
        _service.addOperation(__operation);

        _operations[40] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUCopyLogicalFiles"));
        _service.addOperation(__operation);

        _operations[41] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUGetGraph"));
        _service.addOperation(__operation);

        _operations[42] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUGetNumFileToCopy"));
        _service.addOperation(__operation);

        _operations[43] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQuerysetImport"));
        _service.addOperation(__operation);

        _operations[44] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUDetails"));
        _service.addOperation(__operation);

        _operations[45] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUCDebug"));
        _service.addOperation(__operation);

        _operations[46] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUEclDefinitionAction"));
        _service.addOperation(__operation);

        _operations[47] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUUpdate"));
        _service.addOperation(__operation);

        _operations[48] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUGetDependancyTrees"));
        _service.addOperation(__operation);

        _operations[49] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUGetThorJobList"));
        _service.addOperation(__operation);

        _operations[50] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQuerysetQueryAction"));
        _service.addOperation(__operation);

        _operations[51] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUWaitCompiled"));
        _service.addOperation(__operation);

        _operations[52] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUResubmit"));
        _service.addOperation(__operation);

        _operations[53] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUGraphTiming"));
        _service.addOperation(__operation);

        _operations[54] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUGVCGraphInfo"));
        _service.addOperation(__operation);

        _operations[55] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUResult"));
        _service.addOperation(__operation);

        _operations[56] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQuerysets"));
        _service.addOperation(__operation);

        _operations[57] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "gVCAjaxGraph"));
        _service.addOperation(__operation);

        _operations[58] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUProcessGraph"));
        _service.addOperation(__operation);

        _operations[59] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUExport"));
        _service.addOperation(__operation);

        _operations[60] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "ping"));
        _service.addOperation(__operation);

        _operations[61] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUInfoDetails"));
        _service.addOperation(__operation);

        _operations[62] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUJobList"));
        _service.addOperation(__operation);

        _operations[63] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUCreate"));
        _service.addOperation(__operation);

        _operations[64] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUAction"));
        _service.addOperation(__operation);

        _operations[65] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUListQueries"));
        _service.addOperation(__operation);

        _operations[66] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQueryFiles"));
        _service.addOperation(__operation);

        _operations[67] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQueryGetGraph"));
        _service.addOperation(__operation);

        _operations[68] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUClusterJobXLS"));
        _service.addOperation(__operation);

        _operations[69] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUGetThorJobQueue"));
        _service.addOperation(__operation);

        _operations[70] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wURun"));
        _service.addOperation(__operation);

        _operations[71] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUFile"));
        _service.addOperation(__operation);

        _operations[72] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUQuerysetCopyQuery"));
        _service.addOperation(__operation);

        _operations[73] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUGetZAPInfo"));
        _service.addOperation(__operation);

        _operations[74] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUClusterJobQueueXLS"));
        _service.addOperation(__operation);

        _operations[75] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUMultiQuerysetDetails"));
        _service.addOperation(__operation);

        _operations[76] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUAddLocalFileToWorkunit"));
        _service.addOperation(__operation);

        _operations[77] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUPushEvent"));
        _service.addOperation(__operation);

        _operations[78] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsworkunits", "wUSubmit"));
        _service.addOperation(__operation);

        _operations[79] = __operation;
    }

    //populates the faults
    private void populateFaults() {
        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetAliasAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetAliasAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetAliasAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetStats"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetStats"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetStats"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUListArchiveFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUListArchiveFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUListArchiveFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCopyQuerySet"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCopyQuerySet"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCopyQuerySet"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUPublishWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUPublishWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUPublishWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryConfig"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryConfig"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryConfig"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCompileECL"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCompileECL"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCompileECL"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUProtect"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUProtect"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUProtect"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUListLocalFileRequired"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUListLocalFileRequired"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUListLocalFileRequired"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WURecreateQuery"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WURecreateQuery"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WURecreateQuery"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCheckFeatures"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCheckFeatures"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCheckFeatures"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCreateAndUpdate"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCreateAndUpdate"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCreateAndUpdate"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGraphInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGraphInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGraphInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetGraphNameAndTypes"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetGraphNameAndTypes"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetGraphNameAndTypes"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUListQueriesUsingFile"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUListQueriesUsingFile"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUListQueriesUsingFile"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUSyntaxCheckECL"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUSyntaxCheckECL"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUSyntaxCheckECL"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUDeployWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUDeployWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUDeployWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCreateZAPInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCreateZAPInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCreateZAPInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUUpdateQueryEntry"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUUpdateQueryEntry"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUUpdateQueryEntry"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUResultBin"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUResultBin"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUResultBin"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUShowScheduled"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUShowScheduled"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUShowScheduled"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetArchiveFile"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetArchiveFile"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetArchiveFile"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUFullResult"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUFullResult"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUFullResult"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetExport"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetExport"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetExport"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WULightWeightQuery"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WULightWeightQuery"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WULightWeightQuery"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryDetailsLightWeight"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryDetailsLightWeight"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryDetailsLightWeight"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUSchedule"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUSchedule"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUSchedule"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUClusterJobQueueLOG"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUClusterJobQueueLOG"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUClusterJobQueueLOG"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUResultSummary"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUResultSummary"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUResultSummary"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetPlugins"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetPlugins"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetPlugins"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUQuery"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUQuery"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUQuery"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUAbort"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUAbort"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUAbort"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUWaitComplete"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUWaitComplete"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUWaitComplete"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUResultView"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUResultView"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUResultView"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUDetailsMeta"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUDetailsMeta"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUDetailsMeta"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUDelete"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUDelete"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUDelete"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryGetSummaryStats"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryGetSummaryStats"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryGetSummaryStats"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUClusterJobSummaryXLS"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUClusterJobSummaryXLS"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUClusterJobSummaryXLS"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCopyLogicalFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCopyLogicalFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUCopyLogicalFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetGraph"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetGraph"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetGraph"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetNumFileToCopy"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetNumFileToCopy"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetNumFileToCopy"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetImport"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetImport"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetImport"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUCDebug"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUCDebug"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUCDebug"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUEclDefinitionAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUEclDefinitionAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUEclDefinitionAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUUpdate"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUUpdate"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUUpdate"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetDependancyTrees"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetDependancyTrees"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetDependancyTrees"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetThorJobList"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetThorJobList"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetThorJobList"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetQueryAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetQueryAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetQueryAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUWaitCompiled"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUWaitCompiled"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUWaitCompiled"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUResubmit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUResubmit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUResubmit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGraphTiming"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGraphTiming"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGraphTiming"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGVCGraphInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGVCGraphInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGVCGraphInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUResult"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUResult"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUResult"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysets"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysets"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysets"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "GVCAjaxGraph"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "GVCAjaxGraph"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "GVCAjaxGraph"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUProcessGraph"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUProcessGraph"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUProcessGraph"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUExport"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUExport"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUExport"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUInfoDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUInfoDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUInfoDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUJobList"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUJobList"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUJobList"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUCreate"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUCreate"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUCreate"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUListQueries"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUListQueries"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUListQueries"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryGetGraph"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryGetGraph"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQueryGetGraph"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUClusterJobXLS"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUClusterJobXLS"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUClusterJobXLS"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetThorJobQueue"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetThorJobQueue"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetThorJobQueue"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WURun"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WURun"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WURun"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUFile"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUFile"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUFile"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetCopyQuery"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetCopyQuery"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUQuerysetCopyQuery"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetZAPInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetZAPInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUGetZAPInfo"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUClusterJobQueueXLS"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUClusterJobQueueXLS"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUClusterJobQueueXLS"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUMultiQuerysetDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUMultiQuerysetDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUMultiQuerysetDetails"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUAddLocalFileToWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUAddLocalFileToWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUAddLocalFileToWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUPushEvent"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUPushEvent"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                "WUPushEvent"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUSubmit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUSubmit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WUSubmit"),
            "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions");
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQuerysetAliasAction
     * @param wUQuerysetAliasAction4
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetAliasActionResponse wUQuerysetAliasAction(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetAliasAction wUQuerysetAliasAction4)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQuerysetAliasAction?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQuerysetAliasAction4,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUQuerysetAliasAction")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits",
                        "WUQuerysetAliasAction"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetAliasActionResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetAliasActionResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQuerysetAliasAction"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysetAliasAction"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysetAliasAction"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUGetStats
     * @param wUGetStats6
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStatsResponse wUGetStats(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStats wUGetStats6)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUGetStats?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUGetStats6,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUGetStats")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUGetStats"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStatsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStatsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUGetStats"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetStats"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetStats"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQueryDetails
     * @param wUQueryDetails8
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsResponse wUQueryDetails(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetails wUQueryDetails8)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQueryDetails?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQueryDetails8,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUQueryDetails")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUQueryDetails"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQueryDetails"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQueryDetails"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQueryDetails"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUListArchiveFiles
     * @param wUListArchiveFiles10
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFilesResponse wUListArchiveFiles(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFiles wUListArchiveFiles10)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUListArchiveFiles?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUListArchiveFiles10,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUListArchiveFiles")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUListArchiveFiles"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFilesResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFilesResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUListArchiveFiles"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUListArchiveFiles"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUListArchiveFiles"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUCopyQuerySet
     * @param wUCopyQuerySet12
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySetResponse wUCopyQuerySet(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySet wUCopyQuerySet12)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUCopyQuerySet?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUCopyQuerySet12,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUCopyQuerySet")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUCopyQuerySet"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySetResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySetResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUCopyQuerySet"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCopyQuerySet"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCopyQuerySet"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUPublishWorkunit
     * @param wUPublishWorkunit14
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunitResponse wUPublishWorkunit(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunit wUPublishWorkunit14)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUPublishWorkunit?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUPublishWorkunit14,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUPublishWorkunit")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUPublishWorkunit"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunitResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunitResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUPublishWorkunit"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUPublishWorkunit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUPublishWorkunit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQueryConfig
     * @param wUQueryConfig16
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfigResponse wUQueryConfig(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfig wUQueryConfig16)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQueryConfig?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQueryConfig16,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUQueryConfig")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUQueryConfig"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfigResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfigResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQueryConfig"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQueryConfig"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQueryConfig"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUCompileECL
     * @param wUCompileECL18
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECLResponse wUCompileECL(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECL wUCompileECL18)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUCompileECL?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUCompileECL18,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUCompileECL")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUCompileECL"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECLResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECLResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUCompileECL"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCompileECL"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCompileECL"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUProtect
     * @param wUProtect20
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtectResponse wUProtect(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtect wUProtect20)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUProtect?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUProtect20,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUProtect")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUProtect"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtectResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtectResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUProtect"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUProtect"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUProtect"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUListLocalFileRequired
     * @param wUListLocalFileRequired22
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequiredResponse wUListLocalFileRequired(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequired wUListLocalFileRequired22)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUListLocalFileRequired?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUListLocalFileRequired22,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUListLocalFileRequired")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits",
                        "WUListLocalFileRequired"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequiredResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequiredResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUListLocalFileRequired"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUListLocalFileRequired"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUListLocalFileRequired"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wURecreateQuery
     * @param wURecreateQuery24
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQueryResponse wURecreateQuery(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQuery wURecreateQuery24)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WURecreateQuery?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wURecreateQuery24,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wURecreateQuery")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WURecreateQuery"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQueryResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQueryResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WURecreateQuery"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WURecreateQuery"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WURecreateQuery"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUCheckFeatures
     * @param wUCheckFeatures26
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeaturesResponse wUCheckFeatures(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeatures wUCheckFeatures26)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUCheckFeatures?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUCheckFeatures26,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUCheckFeatures")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUCheckFeatures"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeaturesResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeaturesResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUCheckFeatures"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCheckFeatures"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCheckFeatures"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUCreateAndUpdate
     * @param wUCreateAndUpdate28
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateResponse wUCreateAndUpdate(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateAndUpdate wUCreateAndUpdate28)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUCreateAndUpdate?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUCreateAndUpdate28,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUCreateAndUpdate")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUCreateAndUpdate"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUCreateAndUpdate"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCreateAndUpdate"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCreateAndUpdate"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUGraphInfo
     * @param wUGraphInfo30
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfoResponse wUGraphInfo(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfo wUGraphInfo30)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUGraphInfo?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUGraphInfo30,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUGraphInfo")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUGraphInfo"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfoResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfoResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUGraphInfo"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGraphInfo"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGraphInfo"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUGetGraphNameAndTypes
     * @param wUGetGraphNameAndTypes32
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypesResponse wUGetGraphNameAndTypes(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypes wUGetGraphNameAndTypes32)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUGetGraphNameAndTypes?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUGetGraphNameAndTypes32,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUGetGraphNameAndTypes")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits",
                        "WUGetGraphNameAndTypes"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypesResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypesResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUGetGraphNameAndTypes"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUGetGraphNameAndTypes"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUGetGraphNameAndTypes"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUListQueriesUsingFile
     * @param wUListQueriesUsingFile34
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFileResponse wUListQueriesUsingFile(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFile wUListQueriesUsingFile34)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUListQueriesUsingFile?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUListQueriesUsingFile34,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUListQueriesUsingFile")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits",
                        "WUListQueriesUsingFile"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFileResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFileResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUListQueriesUsingFile"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUListQueriesUsingFile"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUListQueriesUsingFile"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUSyntaxCheckECL
     * @param wUSyntaxCheckECL36
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckResponse wUSyntaxCheckECL(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckECL wUSyntaxCheckECL36)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUSyntaxCheckECL?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUSyntaxCheckECL36,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUSyntaxCheckECL")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUSyntaxCheckECL"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUSyntaxCheckECL"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUSyntaxCheckECL"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUSyntaxCheckECL"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUDeployWorkunit
     * @param wUDeployWorkunit38
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunitResponse wUDeployWorkunit(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunit wUDeployWorkunit38)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUDeployWorkunit?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUDeployWorkunit38,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUDeployWorkunit")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUDeployWorkunit"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunitResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunitResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUDeployWorkunit"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUDeployWorkunit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUDeployWorkunit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUCreateZAPInfo
     * @param wUCreateZAPInfo40
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfoResponse wUCreateZAPInfo(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfo wUCreateZAPInfo40)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUCreateZAPInfo?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUCreateZAPInfo40,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUCreateZAPInfo")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUCreateZAPInfo"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfoResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfoResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUCreateZAPInfo"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCreateZAPInfo"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCreateZAPInfo"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUUpdateQueryEntry
     * @param wUUpdateQueryEntry42
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntryResponse wUUpdateQueryEntry(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntry wUUpdateQueryEntry42)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUUpdateQueryEntry?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUUpdateQueryEntry42,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUUpdateQueryEntry")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUUpdateQueryEntry"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntryResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntryResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUUpdateQueryEntry"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUUpdateQueryEntry"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUUpdateQueryEntry"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUResultBin
     * @param wUResultBin44
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBinResponse wUResultBin(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBin wUResultBin44)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUResultBin?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUResultBin44,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUResultBin")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUResultBin"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBinResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBinResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUResultBin"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUResultBin"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUResultBin"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUShowScheduled
     * @param wUShowScheduled46
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduledResponse wUShowScheduled(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduled wUShowScheduled46)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUShowScheduled?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUShowScheduled46,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUShowScheduled")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUShowScheduled"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduledResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduledResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUShowScheduled"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUShowScheduled"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUShowScheduled"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUGetArchiveFile
     * @param wUGetArchiveFile48
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFileResponse wUGetArchiveFile(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFile wUGetArchiveFile48)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUGetArchiveFile?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUGetArchiveFile48,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUGetArchiveFile")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUGetArchiveFile"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFileResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFileResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUGetArchiveFile"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetArchiveFile"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetArchiveFile"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUFullResult
     * @param wUFullResult50
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResultResponse wUFullResult(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResult wUFullResult50)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUFullResult?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUFullResult50,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUFullResult")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUFullResult"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResultResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResultResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUFullResult"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUFullResult"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUFullResult"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQuerysetExport
     * @param wUQuerysetExport52
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExportResponse wUQuerysetExport(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExport wUQuerysetExport52)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQuerysetExport?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQuerysetExport52,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUQuerysetExport")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUQuerysetExport"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExportResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExportResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQuerysetExport"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysetExport"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysetExport"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wULightWeightQuery
     * @param wULightWeightQuery54
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQueryResponse wULightWeightQuery(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQuery wULightWeightQuery54)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WULightWeightQuery?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wULightWeightQuery54,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wULightWeightQuery")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WULightWeightQuery"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQueryResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQueryResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WULightWeightQuery"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WULightWeightQuery"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WULightWeightQuery"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQueryDetailsLightWeight
     * @param wUQueryDetailsLightWeight56
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsResponse wUQueryDetailsLightWeight(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsLightWeight wUQueryDetailsLightWeight56)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQueryDetailsLightWeight?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQueryDetailsLightWeight56,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUQueryDetailsLightWeight")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits",
                        "WUQueryDetailsLightWeight"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQueryDetailsLightWeight"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUQueryDetailsLightWeight"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUQueryDetailsLightWeight"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQuerysetDetails
     * @param wUQuerysetDetails58
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetDetailsResponse wUQuerysetDetails(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetDetails wUQuerysetDetails58)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQuerysetDetails?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQuerysetDetails58,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUQuerysetDetails")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUQuerysetDetails"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetDetailsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetDetailsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQuerysetDetails"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysetDetails"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysetDetails"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUSchedule
     * @param wUSchedule60
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScheduleResponse wUSchedule(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSchedule wUSchedule60)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUSchedule?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUSchedule60,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUSchedule")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUSchedule"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScheduleResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScheduleResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUSchedule"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUSchedule"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUSchedule"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUClusterJobQueueLOG
     * @param wUClusterJobQueueLOG62
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOGResponse wUClusterJobQueueLOG(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOG wUClusterJobQueueLOG62)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUClusterJobQueueLOG?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUClusterJobQueueLOG62,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUClusterJobQueueLOG")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUClusterJobQueueLOG"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOGResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOGResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUClusterJobQueueLOG"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUClusterJobQueueLOG"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUClusterJobQueueLOG"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUResultSummary
     * @param wUResultSummary64
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummaryResponse wUResultSummary(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummary wUResultSummary64)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUResultSummary?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUResultSummary64,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUResultSummary")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUResultSummary"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummaryResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummaryResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUResultSummary"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUResultSummary"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUResultSummary"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUGetPlugins
     * @param wUGetPlugins66
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPluginsResponse wUGetPlugins(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPlugins wUGetPlugins66)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUGetPlugins?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUGetPlugins66,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUGetPlugins")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUGetPlugins"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPluginsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPluginsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUGetPlugins"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetPlugins"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetPlugins"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQuery
     * @param wUQuery68
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryResponse wUQuery(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuery wUQuery68)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQuery?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQuery68,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUQuery")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUQuery"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQuery"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuery"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuery"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUAbort
     * @param wUAbort70
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbortResponse wUAbort(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbort wUAbort70)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUAbort?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUAbort70,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUAbort")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUAbort"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbortResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbortResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUAbort"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUAbort"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUAbort"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUWaitComplete
     * @param wUWaitComplete72
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitResponse wUWaitComplete(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitComplete wUWaitComplete72)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[34].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUWaitComplete?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUWaitComplete72,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUWaitComplete")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUWaitComplete"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUWaitComplete"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUWaitComplete"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUWaitComplete"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUResultView
     * @param wUResultView74
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultViewResponse wUResultView(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultView wUResultView74)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[35].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUResultView?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUResultView74,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUResultView")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUResultView"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultViewResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultViewResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUResultView"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUResultView"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUResultView"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUInfo
     * @param wUInfo76
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoResponse wUInfo(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfo wUInfo76)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[36].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUInfo?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUInfo76,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUInfo")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUInfo"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUInfo"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUInfo"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUInfo"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUDetailsMeta
     * @param wUDetailsMeta78
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMetaResponse wUDetailsMeta(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMeta wUDetailsMeta78)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[37].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUDetailsMeta?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUDetailsMeta78,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUDetailsMeta")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUDetailsMeta"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMetaResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMetaResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUDetailsMeta"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUDetailsMeta"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUDetailsMeta"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUDelete
     * @param wUDelete80
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeleteResponse wUDelete(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDelete wUDelete80)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[38].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUDelete?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUDelete80,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUDelete")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUDelete"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeleteResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeleteResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUDelete"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUDelete"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUDelete"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQueryGetSummaryStats
     * @param wUQueryGetSummaryStats82
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStatsResponse wUQueryGetSummaryStats(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStats wUQueryGetSummaryStats82)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[39].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQueryGetSummaryStats?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQueryGetSummaryStats82,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUQueryGetSummaryStats")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits",
                        "WUQueryGetSummaryStats"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStatsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStatsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQueryGetSummaryStats"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUQueryGetSummaryStats"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUQueryGetSummaryStats"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUClusterJobSummaryXLS
     * @param wUClusterJobSummaryXLS84
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLSResponse wUClusterJobSummaryXLS(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLS wUClusterJobSummaryXLS84)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[40].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUClusterJobSummaryXLS?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUClusterJobSummaryXLS84,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUClusterJobSummaryXLS")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits",
                        "WUClusterJobSummaryXLS"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLSResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLSResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUClusterJobSummaryXLS"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUClusterJobSummaryXLS"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUClusterJobSummaryXLS"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUCopyLogicalFiles
     * @param wUCopyLogicalFiles86
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFilesResponse wUCopyLogicalFiles(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFiles wUCopyLogicalFiles86)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[41].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUCopyLogicalFiles?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUCopyLogicalFiles86,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUCopyLogicalFiles")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalFiles"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFilesResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFilesResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUCopyLogicalFiles"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCopyLogicalFiles"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCopyLogicalFiles"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUGetGraph
     * @param wUGetGraph88
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphResponse wUGetGraph(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraph wUGetGraph88)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[42].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUGetGraph?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUGetGraph88,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUGetGraph")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUGetGraph"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUGetGraph"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetGraph"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetGraph"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUGetNumFileToCopy
     * @param wUGetNumFileToCopy90
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopyResponse wUGetNumFileToCopy(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopy wUGetNumFileToCopy90)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[43].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUGetNumFileToCopy?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUGetNumFileToCopy90,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUGetNumFileToCopy")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUGetNumFileToCopy"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopyResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopyResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUGetNumFileToCopy"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetNumFileToCopy"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetNumFileToCopy"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQuerysetImport
     * @param wUQuerysetImport92
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImportResponse wUQuerysetImport(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImport wUQuerysetImport92)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[44].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQuerysetImport?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQuerysetImport92,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUQuerysetImport")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUQuerysetImport"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImportResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImportResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQuerysetImport"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysetImport"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysetImport"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUDetails
     * @param wUDetails94
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsResponse wUDetails(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetails wUDetails94)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[45].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUDetails?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUDetails94,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUDetails")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUDetails"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUDetails"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUDetails"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUDetails"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUCDebug
     * @param wUCDebug96
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDebugResponse wUCDebug(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCDebug wUCDebug96)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[46].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUCDebug?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUCDebug96,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUCDebug")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUCDebug"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDebugResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDebugResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUCDebug"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCDebug"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCDebug"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUEclDefinitionAction
     * @param wUEclDefinitionAction98
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionActionResponse wUEclDefinitionAction(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionAction wUEclDefinitionAction98)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[47].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUEclDefinitionAction?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUEclDefinitionAction98,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUEclDefinitionAction")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits",
                        "WUEclDefinitionAction"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionActionResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionActionResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUEclDefinitionAction"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUEclDefinitionAction"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUEclDefinitionAction"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUUpdate
     * @param wUUpdate100
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateResponse wUUpdate(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdate wUUpdate100)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[48].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUUpdate?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUUpdate100,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUUpdate")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUUpdate"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUUpdate"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUUpdate"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUUpdate"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUGetDependancyTrees
     * @param wUGetDependancyTrees102
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTreesResponse wUGetDependancyTrees(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTrees wUGetDependancyTrees102)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[49].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUGetDependancyTrees?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUGetDependancyTrees102,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUGetDependancyTrees")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUGetDependancyTrees"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTreesResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTreesResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUGetDependancyTrees"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetDependancyTrees"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetDependancyTrees"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUGetThorJobList
     * @param wUGetThorJobList104
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobListResponse wUGetThorJobList(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobList wUGetThorJobList104)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[50].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUGetThorJobList?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUGetThorJobList104,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUGetThorJobList")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUGetThorJobList"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobListResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobListResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUGetThorJobList"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetThorJobList"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetThorJobList"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQuerysetQueryAction
     * @param wUQuerysetQueryAction106
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetQueryActionResponse wUQuerysetQueryAction(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetQueryAction wUQuerysetQueryAction106)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[51].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQuerysetQueryAction?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQuerysetQueryAction106,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUQuerysetQueryAction")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits",
                        "WUQuerysetQueryAction"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetQueryActionResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetQueryActionResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQuerysetQueryAction"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysetQueryAction"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysetQueryAction"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUWaitCompiled
     * @param wUWaitCompiled108
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitResponse wUWaitCompiled(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitCompiled wUWaitCompiled108)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[52].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUWaitCompiled?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUWaitCompiled108,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUWaitCompiled")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUWaitCompiled"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUWaitCompiled"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUWaitCompiled"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUWaitCompiled"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUResubmit
     * @param wUResubmit110
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmitResponse wUResubmit(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmit wUResubmit110)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[53].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUResubmit?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUResubmit110,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUResubmit")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUResubmit"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmitResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmitResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUResubmit"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUResubmit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUResubmit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUGraphTiming
     * @param wUGraphTiming112
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTimingResponse wUGraphTiming(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTiming wUGraphTiming112)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[54].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUGraphTiming?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUGraphTiming112,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUGraphTiming")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUGraphTiming"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTimingResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTimingResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUGraphTiming"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGraphTiming"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGraphTiming"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUGVCGraphInfo
     * @param wUGVCGraphInfo114
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfoResponse wUGVCGraphInfo(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfo wUGVCGraphInfo114)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[55].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUGVCGraphInfo?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUGVCGraphInfo114,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUGVCGraphInfo")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUGVCGraphInfo"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfoResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfoResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUGVCGraphInfo"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGVCGraphInfo"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGVCGraphInfo"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUResult
     * @param wUResult116
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultResponse wUResult(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResult wUResult116)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[56].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUResult?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUResult116,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUResult")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUResult"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUResult"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUResult"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUResult"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQuerysets
     * @param wUQuerysets118
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetsResponse wUQuerysets(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysets wUQuerysets118)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[57].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQuerysets?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQuerysets118,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUQuerysets")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUQuerysets"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQuerysets"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysets"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysets"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#gVCAjaxGraph
     * @param gVCAjaxGraph120
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraphResponse gVCAjaxGraph(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraph gVCAjaxGraph120)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[58].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/GVCAjaxGraph?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    gVCAjaxGraph120,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "gVCAjaxGraph")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "GVCAjaxGraph"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraphResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraphResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GVCAjaxGraph"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GVCAjaxGraph"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GVCAjaxGraph"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUProcessGraph
     * @param wUProcessGraph122
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraphResponse wUProcessGraph(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraph wUProcessGraph122)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[59].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUProcessGraph?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUProcessGraph122,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUProcessGraph")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUProcessGraph"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraphResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraphResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUProcessGraph"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUProcessGraph"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUProcessGraph"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUExport
     * @param wUExport124
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExportResponse wUExport(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExport wUExport124)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[60].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUExport?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUExport124,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUExport")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUExport"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExportResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExportResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUExport"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUExport"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUExport"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#ping
     * @param ping126
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunitsPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Ping ping126)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[61].getName());
            _operationClient.getOptions().setAction("WsWorkunits/Ping?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    ping126,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "ping")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "Ping"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunitsPingResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunitsPingResponse) object;
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

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUInfoDetails
     * @param wUInfoDetails128
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoResponse wUInfoDetails(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoDetails wUInfoDetails128)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[62].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUInfoDetails?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUInfoDetails128,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUInfoDetails")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUInfoDetails"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUInfoDetails"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUInfoDetails"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUInfoDetails"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUJobList
     * @param wUJobList130
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobListResponse wUJobList(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobList wUJobList130)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[63].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUJobList?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUJobList130,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUJobList")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUJobList"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobListResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobListResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUJobList"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUJobList"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUJobList"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUCreate
     * @param wUCreate132
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateResponse wUCreate(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreate wUCreate132)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[64].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUCreate?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUCreate132,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUCreate")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUCreate"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUCreate"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCreate"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUCreate"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUAction
     * @param wUAction134
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUActionResponse wUAction(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAction wUAction134)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[65].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUAction?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUAction134,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUAction")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUAction"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUActionResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUActionResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUAction"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUAction"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUAction"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUListQueries
     * @param wUListQueries136
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesResponse wUListQueries(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueries wUListQueries136)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[66].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUListQueries?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUListQueries136,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUListQueries")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUListQueries"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUListQueries"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUListQueries"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUListQueries"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQueryFiles
     * @param wUQueryFiles138
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFilesResponse wUQueryFiles(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFiles wUQueryFiles138)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[67].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQueryFiles?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQueryFiles138,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUQueryFiles")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUQueryFiles"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFilesResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFilesResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQueryFiles"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQueryFiles"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQueryFiles"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQueryGetGraph
     * @param wUQueryGetGraph140
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraphResponse wUQueryGetGraph(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraph wUQueryGetGraph140)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[68].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQueryGetGraph?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQueryGetGraph140,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUQueryGetGraph")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUQueryGetGraph"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraphResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraphResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQueryGetGraph"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQueryGetGraph"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQueryGetGraph"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUClusterJobXLS
     * @param wUClusterJobXLS142
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLSResponse wUClusterJobXLS(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLS wUClusterJobXLS142)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[69].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUClusterJobXLS?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUClusterJobXLS142,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUClusterJobXLS")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUClusterJobXLS"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLSResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLSResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUClusterJobXLS"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUClusterJobXLS"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUClusterJobXLS"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUGetThorJobQueue
     * @param wUGetThorJobQueue144
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueueResponse wUGetThorJobQueue(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueue wUGetThorJobQueue144)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[70].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUGetThorJobQueue?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUGetThorJobQueue144,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUGetThorJobQueue")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUGetThorJobQueue"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueueResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueueResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUGetThorJobQueue"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetThorJobQueue"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetThorJobQueue"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wURun
     * @param wURun146
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURunResponse wURun(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURun wURun146)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[71].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WURun?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wURun146,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wURun")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WURun"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURunResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURunResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WURun"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WURun"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WURun"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUFile
     * @param wUFile148
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULogFileResponse wUFile(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFile wUFile148)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[72].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUFile?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUFile148,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUFile")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUFile"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULogFileResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULogFileResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUFile"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUFile"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUFile"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUQuerysetCopyQuery
     * @param wUQuerysetCopyQuery150
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetCopyQueryResponse wUQuerysetCopyQuery(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetCopyQuery wUQuerysetCopyQuery150)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[73].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUQuerysetCopyQuery?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUQuerysetCopyQuery150,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUQuerysetCopyQuery")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUQuerysetCopyQuery"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetCopyQueryResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetCopyQueryResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUQuerysetCopyQuery"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysetCopyQuery"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUQuerysetCopyQuery"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUGetZAPInfo
     * @param wUGetZAPInfo152
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfoResponse wUGetZAPInfo(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfo wUGetZAPInfo152)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[74].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUGetZAPInfo?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUGetZAPInfo152,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUGetZAPInfo")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUGetZAPInfo"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfoResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfoResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUGetZAPInfo"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetZAPInfo"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUGetZAPInfo"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUClusterJobQueueXLS
     * @param wUClusterJobQueueXLS154
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLSResponse wUClusterJobQueueXLS(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLS wUClusterJobQueueXLS154)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[75].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUClusterJobQueueXLS?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUClusterJobQueueXLS154,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUClusterJobQueueXLS")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUClusterJobQueueXLS"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLSResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLSResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUClusterJobQueueXLS"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUClusterJobQueueXLS"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUClusterJobQueueXLS"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUMultiQuerysetDetails
     * @param wUMultiQuerysetDetails156
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerySetDetailsResponse wUMultiQuerysetDetails(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerysetDetails wUMultiQuerysetDetails156)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[76].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUMultiQuerysetDetails?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUMultiQuerysetDetails156,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUMultiQuerysetDetails")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits",
                        "WUMultiQuerysetDetails"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerySetDetailsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerySetDetailsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUMultiQuerysetDetails"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUMultiQuerysetDetails"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUMultiQuerysetDetails"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUAddLocalFileToWorkunit
     * @param wUAddLocalFileToWorkunit158
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunitResponse wUAddLocalFileToWorkunit(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunit wUAddLocalFileToWorkunit158)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[77].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUAddLocalFileToWorkunit?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUAddLocalFileToWorkunit158,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits",
                            "wUAddLocalFileToWorkunit")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits",
                        "WUAddLocalFileToWorkunit"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunitResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunitResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUAddLocalFileToWorkunit"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUAddLocalFileToWorkunit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "WUAddLocalFileToWorkunit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUPushEvent
     * @param wUPushEvent160
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEventResponse wUPushEvent(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEvent wUPushEvent160)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[78].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUPushEvent?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUPushEvent160,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUPushEvent")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUPushEvent"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEventResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEventResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUPushEvent"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUPushEvent"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUPushEvent"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunits#wUSubmit
     * @param wUSubmit162
     * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmitResponse wUSubmit(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmit wUSubmit162)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[79].getName());
            _operationClient.getOptions()
                            .setAction("WsWorkunits/WUSubmit?ver_=1.79");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wUSubmit162,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsworkunits", "wUSubmit")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WUSubmit"));

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
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmitResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmitResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "WUSubmit"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUSubmit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "WUSubmit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.EspSoapFault) ex;
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

    //http://10.173.160.101:8010/WsWorkunits?ver_=1.79
    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetAliasAction param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetAliasAction.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetAliasActionResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetAliasActionResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStats param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStats.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStatsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStatsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetails param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetails.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFiles param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFiles.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFilesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFilesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySet param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySet.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySetResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySetResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunit param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunit.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunitResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunitResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfig param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfig.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfigResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfigResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECL param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECL.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECLResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECLResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtect param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtect.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtectResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtectResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequired param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequired.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequiredResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequiredResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQuery param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQuery.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQueryResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQueryResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeatures param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeatures.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeaturesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeaturesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateAndUpdate param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateAndUpdate.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfo param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfo.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfoResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfoResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypes param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypes.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFile param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFile.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFileResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFileResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckECL param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckECL.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunit param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunit.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunitResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunitResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfo param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfo.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfoResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfoResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntry param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntry.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntryResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntryResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBin param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBin.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBinResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBinResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduled param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduled.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduledResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduledResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFile param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFile.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFileResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFileResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResult param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResult.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResultResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResultResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExport param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExport.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExportResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExportResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQuery param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQuery.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQueryResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQueryResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsLightWeight param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsLightWeight.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetDetails param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetDetails.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetDetailsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetDetailsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSchedule param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSchedule.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScheduleResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScheduleResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOG param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOG.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOGResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOGResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummary param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummary.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummaryResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummaryResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPlugins param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPlugins.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPluginsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPluginsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuery param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuery.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbort param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbort.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbortResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbortResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitComplete param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitComplete.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultView param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultView.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultViewResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultViewResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfo param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfo.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMeta param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMeta.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMetaResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMetaResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDelete param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDelete.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeleteResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeleteResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStats param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStats.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStatsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStatsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLS param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLS.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLSResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLSResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFiles param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFiles.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFilesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFilesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraph param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraph.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopy param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopy.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopyResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopyResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImport param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImport.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImportResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImportResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetails param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetails.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCDebug param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCDebug.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDebugResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDebugResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionAction param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionAction.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionActionResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionActionResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdate param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdate.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTrees param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTrees.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTreesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTreesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobList param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobList.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobListResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobListResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetQueryAction param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetQueryAction.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetQueryActionResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetQueryActionResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitCompiled param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitCompiled.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmit param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmit.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmitResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmitResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTiming param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTiming.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTimingResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTimingResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfo param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfo.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfoResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfoResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResult param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResult.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysets param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysets.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraph param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraph.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraphResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraphResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraph param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraph.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraphResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraphResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExport param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExport.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExportResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExportResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Ping param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Ping.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunitsPingResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunitsPingResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoDetails param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoDetails.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobList param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobList.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobListResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobListResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreate param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreate.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAction param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAction.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUActionResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUActionResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueries param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueries.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFiles param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFiles.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFilesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFilesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraph param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraph.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraphResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraphResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLS param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLS.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLSResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLSResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueue param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueue.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueueResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueueResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURun param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURun.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURunResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURunResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFile param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFile.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULogFileResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULogFileResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetCopyQuery param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetCopyQuery.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetCopyQueryResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetCopyQueryResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfo param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfo.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfoResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfoResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLS param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLS.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLSResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLSResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerysetDetails param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerysetDetails.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerySetDetailsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerySetDetailsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunit param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunit.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunitResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunitResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEvent param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEvent.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEventResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEventResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmit param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmit.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmitResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmitResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetAliasAction param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetAliasAction.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStats param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStats.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetails param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetails.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFiles param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFiles.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySet param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySet.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunit param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunit.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfig param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfig.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECL param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECL.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtect param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtect.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequired param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequired.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQuery param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQuery.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeatures param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeatures.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateAndUpdate param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateAndUpdate.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfo param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfo.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypes param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypes.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFile param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFile.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckECL param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckECL.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunit param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunit.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfo param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfo.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntry param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntry.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBin param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBin.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduled param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduled.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFile param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFile.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResult param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResult.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExport param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExport.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQuery param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQuery.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsLightWeight param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsLightWeight.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetDetails param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetDetails.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSchedule param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSchedule.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOG param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOG.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummary param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummary.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPlugins param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPlugins.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuery param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuery.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbort param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbort.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitComplete param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitComplete.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultView param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultView.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfo param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfo.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMeta param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMeta.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDelete param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDelete.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStats param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStats.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLS param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLS.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFiles param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFiles.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraph param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraph.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopy param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopy.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImport param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImport.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetails param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetails.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCDebug param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCDebug.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionAction param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionAction.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdate param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdate.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTrees param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTrees.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobList param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobList.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetQueryAction param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetQueryAction.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitCompiled param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitCompiled.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmit param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmit.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTiming param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTiming.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfo param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfo.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResult param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResult.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysets param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysets.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraph param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraph.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraph param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraph.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExport param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExport.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Ping param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Ping.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoDetails param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoDetails.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobList param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobList.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreate param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreate.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAction param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAction.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueries param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueries.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFiles param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFiles.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraph param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraph.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLS param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLS.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueue param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueue.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURun param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURun.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFile param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFile.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetCopyQuery param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetCopyQuery.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfo param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfo.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLS param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLS.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerysetDetails param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerysetDetails.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunit param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunit.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEvent param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEvent.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmit param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmit.MY_QNAME,
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
            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Exceptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraph.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraph.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraphResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.GVCAjaxGraphResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Ping.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.Ping.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunitsPingResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunitsPingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbort.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbort.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbortResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAbortResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAction.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAction.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUActionResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUActionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunit.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunitResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUAddLocalFileToWorkunitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCDebug.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCDebug.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeatures.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeatures.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeaturesResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCheckFeaturesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOG.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOG.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOGResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueLOGResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLS.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLS.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLSResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobQueueXLSResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLS.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLS.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLSResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobSummaryXLSResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLS.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLS.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLSResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUClusterJobXLSResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECL.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECL.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECLResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCompileECLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFiles.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFiles.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFilesResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyLogicalFilesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySet.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySet.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySetResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCopyQuerySetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreate.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateAndUpdate.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateAndUpdate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfo.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfoResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUCreateZAPInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDebugResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDebugResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDelete.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDelete.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeleteResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeleteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunit.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunitResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDeployWorkunitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetails.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetails.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMeta.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMeta.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMetaResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsMetaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUDetailsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionAction.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionAction.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionActionResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUEclDefinitionActionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExport.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExportResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUExportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFile.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFile.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResult.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResult.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResultResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUFullResultResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFile.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFile.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFileResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetArchiveFileResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTrees.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTrees.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTreesResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetDependancyTreesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraph.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraph.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypes.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypes.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypesResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphNameAndTypesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetGraphResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopy.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopyResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetNumFileToCopyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPlugins.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPlugins.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPluginsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetPluginsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStats.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStats.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStatsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetStatsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobList.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobListResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueue.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueue.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueueResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetThorJobQueueResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfo.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfoResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGetZAPInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfo.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfoResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTiming.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTiming.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTimingResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGraphTimingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfo.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfoResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUGVCGraphInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfo.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoDetails.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoDetails.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobList.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobListResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUJobListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQuery.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQuery.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQueryResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULightWeightQueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFiles.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFiles.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFilesResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListArchiveFilesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequired.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequired.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequiredResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListLocalFileRequiredResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueries.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFile.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFile.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFileResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUListQueriesUsingFileResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULogFileResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WULogFileResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerysetDetails.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerysetDetails.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerySetDetailsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUMultiQuerySetDetailsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraph.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraph.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraphResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProcessGraphResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtect.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtect.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtectResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUProtectResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunit.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunitResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPublishWorkunitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEvent.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEvent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEventResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPushEventResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuery.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuery.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfig.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfig.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfigResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryConfigResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetails.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetails.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsLightWeight.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsLightWeight.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryDetailsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFiles.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFiles.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFilesResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryFilesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraph.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraph.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraphResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetGraphResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStats.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStats.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStatsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryGetSummaryStatsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetAliasAction.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetAliasAction.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetAliasActionResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetAliasActionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetCopyQuery.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetCopyQuery.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetCopyQueryResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetCopyQueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetDetails.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetDetails.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetDetailsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetDetailsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExport.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExportResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetExportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImport.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImportResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetImportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetQueryAction.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetQueryAction.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetQueryActionResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerySetQueryActionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysets.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysets.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUQuerysetsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQuery.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQuery.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQueryResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURecreateQueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmit.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmitResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResubmitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResult.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResult.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBin.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBin.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBinResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultBinResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummary.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummaryResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultSummaryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultView.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultView.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultViewResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUResultViewResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURun.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURun.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURunResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WURunResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSchedule.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSchedule.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScheduleResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScheduleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduled.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduled.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduledResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUShowScheduledResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmit.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmitResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSubmitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckECL.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckECL.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUSyntaxCheckResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdate.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntry.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntry.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntryResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateQueryEntryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitCompiled.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitCompiled.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitComplete.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitComplete.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUWaitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }
}

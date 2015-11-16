/**
 * WsWorkunitsServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WsWorkunitsServiceSoapStub extends org.apache.axis.client.Stub implements org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[65];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GVCAjaxGraph");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GVCAjaxGraph"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">GVCAjaxGraph"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.GVCAjaxGraph.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">GVCAjaxGraphResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.GVCAjaxGraphResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GVCAjaxGraphResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUAbort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUAbort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAbort"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAbort.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAbortResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAbortResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUAbortResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAction"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAction.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUActionResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUActionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUActionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUAddLocalFileToWorkunit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUAddLocalFileToWorkunit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAddLocalFileToWorkunit"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAddLocalFileToWorkunit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAddLocalFileToWorkunitResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAddLocalFileToWorkunitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUAddLocalFileToWorkunitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUCDebug");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCDebug"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCDebug"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCDebug.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDebugResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDebugResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDebugResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUCheckFeatures");
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCheckFeaturesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCheckFeaturesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCheckFeaturesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUClusterJobQueueLOG");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobQueueLOG"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueLOG"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueLOG.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueLOGResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueLOGResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobQueueLOGResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUClusterJobQueueXLS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobQueueXLS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueXLS"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueXLS.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueXLSResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueXLSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobQueueXLSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUClusterJobSummaryXLS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobSummaryXLS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobSummaryXLS"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobSummaryXLS.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobSummaryXLSResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobSummaryXLSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobSummaryXLSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUClusterJobXLS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobXLS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobXLS"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobXLS.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobXLSResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobXLSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobXLSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUCompileECL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCompileECL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCompileECL"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCompileECL.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCompileECLResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCompileECLResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCompileECLResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUCopyLogicalFiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalFiles"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyLogicalFiles"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalFiles.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyLogicalFilesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalFilesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalFilesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUCopyQuerySet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyQuerySet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyQuerySet"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyQuerySet.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyQuerySetResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyQuerySetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyQuerySetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUCreate");
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCreateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUCreateAndUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCreateAndUpdate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateAndUpdate"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateAndUpdate.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUUpdateResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUCreateZAPInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCreateZAPInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateZAPInfo"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateZAPInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateZAPInfoResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateZAPInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCreateZAPInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDelete"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDelete"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDelete.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDeleteResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeleteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDeleteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUDeployWorkunit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDeployWorkunit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDeployWorkunit"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeployWorkunit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDeployWorkunitResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeployWorkunitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDeployWorkunitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUExport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUExport"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUExport"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExport.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUExportResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUExportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUFile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUFile"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUFile.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WULogFileResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULogFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogFileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUGVCGraphInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGVCGraphInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGVCGraphInfo"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGVCGraphInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGVCGraphInfoResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGVCGraphInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGVCGraphInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUGetArchiveFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetArchiveFile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetArchiveFile"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetArchiveFile.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetArchiveFileResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetArchiveFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetArchiveFileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUGetDependancyTrees");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetDependancyTrees"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetDependancyTrees"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetDependancyTrees.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetDependancyTreesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetDependancyTreesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetDependancyTreesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUGetGraph");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetGraph"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraph"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraph.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraphResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetGraphResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUGetGraphNameAndTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetGraphNameAndTypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraphNameAndTypes"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphNameAndTypes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraphNameAndTypesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphNameAndTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetGraphNameAndTypesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUGetStats");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetStats"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetStats"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetStats.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetStatsResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetStatsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetStatsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUGetZAPInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetZAPInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetZAPInfo"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetZAPInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetZAPInfoResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetZAPInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetZAPInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUGraphInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGraphInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphInfo"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphInfoResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGraphInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUGraphTiming");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGraphTiming"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphTiming"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphTiming.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphTimingResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphTimingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGraphTimingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfo"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfoResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUInfoDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUInfoDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfoDetails"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoDetails.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfoResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUJobList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUJobList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUJobList"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUJobList.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUJobListResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUJobListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUJobListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WULightWeightQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULightWeightQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WULightWeightQuery"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULightWeightQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WULightWeightQueryResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULightWeightQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULightWeightQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUListArchiveFiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUListArchiveFiles"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListArchiveFiles"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListArchiveFiles.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListArchiveFilesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListArchiveFilesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUListArchiveFilesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUListLocalFileRequired");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUListLocalFileRequired"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListLocalFileRequired"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListLocalFileRequired.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListLocalFileRequiredResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListLocalFileRequiredResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUListLocalFileRequiredResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUListQueries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUListQueries"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListQueries"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueries.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListQueriesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUListQueriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUListQueriesUsingFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUListQueriesUsingFile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListQueriesUsingFile"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesUsingFile.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListQueriesUsingFileResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesUsingFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUListQueriesUsingFileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUMultiQuerysetDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUMultiQuerysetDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUMultiQuerysetDetails"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUMultiQuerysetDetails.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUMultiQuerySetDetailsResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUMultiQuerySetDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUMultiQuerySetDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUProcessGraph");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUProcessGraph"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProcessGraph"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProcessGraph.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProcessGraphResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProcessGraphResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUProcessGraphResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUProtect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUProtect"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProtect"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProtect.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProtectResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProtectResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUProtectResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUPublishWorkunit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPublishWorkunit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPublishWorkunit"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPublishWorkunit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPublishWorkunitResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPublishWorkunitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPublishWorkunitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUPushEvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPushEvent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPushEvent"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPushEvent.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPushEventResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPushEventResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPushEventResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuery"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUQueryConfig");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryConfig"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryConfig"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryConfig.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryConfigResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryConfigResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryConfigResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUQueryDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryDetails"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryDetails.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryDetailsResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUQueryFiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryFiles"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryFiles"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryFiles.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryFilesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryFilesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryFilesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUQueryGetGraph");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryGetGraph"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryGetGraph"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryGetGraph.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryGetGraphResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryGetGraphResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryGetGraphResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUQuerysetAliasAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerysetAliasAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetAliasAction"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetAliasAction.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetAliasActionResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetAliasActionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetAliasActionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUQuerysetCopyQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerysetCopyQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetCopyQuery"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetCopyQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetCopyQueryResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetCopyQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetCopyQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUQuerysetDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerysetDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetDetails"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetDetails.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetDetailsResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUQuerysetQueryAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerysetQueryAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetQueryAction"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetQueryAction.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetQueryActionResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetQueryActionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetQueryActionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUQuerysets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerysets"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysets"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysets.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetsResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerysetsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUResubmit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResubmit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResubmit"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResubmit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResubmitResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResubmitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResubmitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResult"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResult"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResult.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUResultBin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultBin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultBin"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultBin.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultBinResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultBinResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultBinResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUResultSummary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultSummary"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultSummary"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultSummary.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultSummaryResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultSummaryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultSummaryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUResultView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultView"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultView"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultView.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultViewResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultViewResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultViewResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WURun");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WURun"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WURun"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WURun.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WURunResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WURunResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WURunResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUSchedule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSchedule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSchedule"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSchedule.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUScheduleResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUScheduleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUScheduleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUShowScheduled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUShowScheduled"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUShowScheduled"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUShowScheduled.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUShowScheduledResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUShowScheduledResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUShowScheduledResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUSubmit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSubmit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSubmit"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSubmit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSubmitResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSubmitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSubmitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUSyntaxCheckECL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSyntaxCheckECL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSyntaxCheckECL"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSyntaxCheckECL.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSyntaxCheckResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSyntaxCheckResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSyntaxCheckResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUUpdate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUUpdate"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdate.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUUpdateResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUWaitCompiled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUWaitCompiled"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitCompiled"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitCompiled.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUWaitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WUWaitComplete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUWaitComplete"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitComplete"), org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitComplete.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUWaitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
                      "wsworkunits.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
                      true
                     ));
        _operations[64] = oper;

    }

    public WsWorkunitsServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WsWorkunitsServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WsWorkunitsServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUCompileECLResponse>Dependencies");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUECLAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUECLAttribute");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLAttribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUCopyLogicalFilesResponse>ClusterFiles");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalClusterFileSections[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalClusterFileSections");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUCopyQuerySetResponse>CopiedQueries");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUCopyQuerySetResponse>ExistingQueries");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUGetGraphNameAndTypesResponse>GraphNameAndTypes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NameAndType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NameAndType");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphNameAndType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUInfoResponse>ResultViews");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "View");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUListArchiveFilesResponse>ArchiveModules");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUArchiveModule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUArchiveModule");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArchiveModule");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUListArchiveFilesResponse>Files");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUArchiveFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUArchiveFile");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "File");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUPublishWorkunitResponse>ClusterFiles");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalClusterFileSections[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalClusterFileSections");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUQueryConfigResponse>Results");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryConfigResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryConfigResult");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUQueryDetailsResponse>SuperFiles");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySuperFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySuperFile");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SuperFile");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUQueryDetailsResponse>WsEclAddresses");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Address");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUQueryFilesResponse>Files");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.FileUsedByQuery[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FileUsedByQuery");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "File");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUQuerysetAliasAction>Aliases");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetAliasActionItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAliasActionItem");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Alias");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUQuerySetAliasActionResponse>Results");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetAliasActionResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAliasActionResult");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUQuerysetQueryAction>Queries");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQueryActionItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryActionItem");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Query");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUQuerySetQueryActionResponse>Results");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQueryActionResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryActionResult");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUResubmitResponse>WUs");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ResubmittedWU[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResubmittedWU");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WU");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">ECLWorkunit>AllowedClusters");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AllowedCluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">ECLWorkunit>ResourceURLs");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "URL");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">GVCAjaxGraph");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.GVCAjaxGraph.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">GVCAjaxGraphResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.GVCAjaxGraphResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">QuerySuperFile>SubFiles");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "File");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAbort");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAbort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAbortResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAbortResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAction");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUActionResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUActionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAddLocalFileToWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAddLocalFileToWorkunit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAddLocalFileToWorkunitResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAddLocalFileToWorkunitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUArchiveModule>ArchiveModules");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUArchiveModule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUArchiveModule");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArchiveModule");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUArchiveModule>Files");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUArchiveFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUArchiveFile");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "File");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCDebug");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCDebug.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCheckFeaturesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCheckFeaturesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueLOG");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueLOG.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueLOGResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueLOGResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueXLS");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueXLS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueXLSResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueXLSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobSummaryXLS");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobSummaryXLS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobSummaryXLSResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobSummaryXLSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobXLS");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobXLS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobXLSResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobXLSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCompileECL");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCompileECL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCompileECLResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCompileECLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyLogicalFiles");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalFiles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyLogicalFilesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalFilesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyQuerySet");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyQuerySet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyQuerySetResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyQuerySetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateAndUpdate");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateAndUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateZAPInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateZAPInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateZAPInfoResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateZAPInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDebugResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDebugResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDelete");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDelete.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDeleteResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeleteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDeployWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeployWorkunit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDeployWorkunitResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeployWorkunitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUExport");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUExportResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetArchiveFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetArchiveFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetArchiveFileResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetArchiveFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetDependancyTrees");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetDependancyTrees.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetDependancyTreesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetDependancyTreesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraph");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraph.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraphNameAndTypes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphNameAndTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraphNameAndTypesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphNameAndTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraphResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetStats");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetStats.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetStatsResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetStatsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetZAPInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetZAPInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetZAPInfoResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetZAPInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphInfoResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphTiming");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphTiming.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphTimingResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphTimingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGVCGraphInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGVCGraphInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGVCGraphInfoResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGVCGraphInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfoDetails");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfoResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUJobList");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUJobList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUJobListResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUJobListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WULightWeightQuery");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULightWeightQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WULightWeightQueryResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULightWeightQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListArchiveFiles");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListArchiveFiles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListArchiveFilesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListArchiveFilesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListLocalFileRequired");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListLocalFileRequired.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListLocalFileRequiredResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListLocalFileRequiredResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListQueries");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListQueriesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListQueriesUsingFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesUsingFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListQueriesUsingFileResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesUsingFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WULogFileResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULogFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUMultiQuerysetDetails");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUMultiQuerysetDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUMultiQuerySetDetailsResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUMultiQuerySetDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProcessGraph");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProcessGraph.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProcessGraphResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProcessGraphResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProtect");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProtect.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProtectResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProtectResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPublishWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPublishWorkunit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPublishWorkunitResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPublishWorkunitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPushEvent");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPushEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPushEventResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPushEventResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuery");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryConfig");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryConfigResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryConfigResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryDetails");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryDetailsResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryFiles");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryFiles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryFilesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryFilesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryGetGraph");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryGetGraph.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryGetGraphResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryGetGraphResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetAliasAction");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetAliasAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetAliasActionResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetAliasActionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetCopyQuery");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetCopyQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetCopyQueryResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetCopyQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetDetails");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetDetailsResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetQueryAction");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetQueryAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetQueryActionResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetQueryActionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysets");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysets.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetsResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResubmit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResubmit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResubmitResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResubmitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResult");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultBin");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultBin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultBinResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultBinResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultSummary");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultSummaryResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultSummaryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultView");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultViewResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultViewResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WURun");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WURun.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WURunResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WURunResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSchedule");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUScheduleResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUScheduleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUShowScheduled");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUShowScheduled.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUShowScheduledResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUShowScheduledResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSubmit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSubmit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSubmitResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSubmitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSyntaxCheckECL");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSyntaxCheckECL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSyntaxCheckResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSyntaxCheckResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUUpdate");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUUpdateResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitCompiled");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitCompiled.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitComplete");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitComplete.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfApplicationValue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfClusterQueryState");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ClusterQueryState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterQueryState");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterQueryState");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfDebugValue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.DebugValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValue");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLException[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLException");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLException");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLGraph");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLGraph[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraph");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraph");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLGraphEx");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLGraphEx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraphEx");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraphEx");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLHelpFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLHelpFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLHelpFile");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLHelpFile");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLJob");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLJob[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLJob");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLJob");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLResult");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLResult");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLSchemaItem");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLSchemaItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSchemaItem");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSchemaItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLSourceFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLSourceFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSourceFile");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSourceFile");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLTimer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLTimer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimer");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLTimingData");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLTimingData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimingData");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimingData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLWorkflow");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkflow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkflow");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkflow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkunit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunit");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLWorkunitLW");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkunitLW[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunitLW");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunitLW");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfLogicalFileUpload");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.LogicalFileUpload[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFileUpload");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFileUpload");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfNamedValue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NamedValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NamedValue");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NamedValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfQuerySet");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfQuerySetAlias");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetAlias[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAlias");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAlias");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfQuerySetQuery");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQuery[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQuery");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQuery");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfQueryUsingFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QueryUsingFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryUsingFile");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryUsingFile");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfScheduledWU");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ScheduledWU[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScheduledWU");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScheduledWU");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfServerInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ServerInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ServerInfo");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ServerInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfTargetQueriesUsingFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.TargetQueriesUsingFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TargetQueriesUsingFile");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TargetQueriesUsingFile");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfThorLogInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ThorLogInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorLogInfo");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorLogInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfWUActionResult");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUActionResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUActionResult");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUActionResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfWULogicalFileCopyInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULogicalFileCopyInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfWUQuerySetDetail");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetDetail");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfWUStatisticItem");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUStatisticItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUStatisticItem");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUStatisticItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterQueryState");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ClusterQueryState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.DebugValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DeploymentFeatures");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.DeploymentFeatures.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraph");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLGraph.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraphEx");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLGraphEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLHelpFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLHelpFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLJob");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLQuery");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLResult");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSchemaItem");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLSchemaItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSourceFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLSourceFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLTimer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimingData");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLTimingData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkflow");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkflow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkunit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunitLW");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkunitLW.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWUActions");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWUActions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.EspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EspStringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FileUsedByQuery");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.FileUsedByQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFileUpload");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.LogicalFileUpload.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NameAndType");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NameAndType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NamedValue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NamedValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAlias");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetAlias.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAliasActionItem");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetAliasActionItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAliasActionResult");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetAliasActionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAliasActionTypes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetAliasActionTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQuery");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryActionItem");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQueryActionItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryActionResult");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQueryActionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryActionTypes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQueryActionTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryClientState");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQueryClientState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySuperFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySuperFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryUsingFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QueryUsingFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResubmittedWU");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ResubmittedWU.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScheduledWU");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ScheduledWU.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ServerInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ServerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TargetQueriesUsingFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.TargetQueriesUsingFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorLogInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ThorLogInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUActionResult");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUActionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUArchiveFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUArchiveFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUArchiveModule");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUArchiveModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalClusterFileSections");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalClusterFileSections.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUECLAttribute");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUECLAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUExceptionSeverity");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExceptionSeverity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULogicalFileCopyInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryConfigResult");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryConfigResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetDetail");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetFilterType");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUStatisticItem");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUStatisticItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.GVCAjaxGraphResponse GVCAjaxGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.GVCAjaxGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/GVCAjaxGraph?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GVCAjaxGraph"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.GVCAjaxGraphResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.GVCAjaxGraphResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.GVCAjaxGraphResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAbortResponse WUAbort(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAbort parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUAbort?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUAbort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAbortResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAbortResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAbortResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUActionResponse WUAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUAction?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUActionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUActionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUActionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAddLocalFileToWorkunitResponse WUAddLocalFileToWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAddLocalFileToWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUAddLocalFileToWorkunit?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUAddLocalFileToWorkunit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAddLocalFileToWorkunitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAddLocalFileToWorkunitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAddLocalFileToWorkunitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDebugResponse WUCDebug(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCDebug parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUCDebug?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUCDebug"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDebugResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDebugResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDebugResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCheckFeaturesResponse WUCheckFeatures() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUCheckFeatures?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUCheckFeatures"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCheckFeaturesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCheckFeaturesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCheckFeaturesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueLOGResponse WUClusterJobQueueLOG(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueLOG parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUClusterJobQueueLOG?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUClusterJobQueueLOG"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueLOGResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueLOGResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueLOGResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueXLSResponse WUClusterJobQueueXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUClusterJobQueueXLS?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUClusterJobQueueXLS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueXLSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueXLSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueXLSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobSummaryXLSResponse WUClusterJobSummaryXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobSummaryXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUClusterJobSummaryXLS?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUClusterJobSummaryXLS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobSummaryXLSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobSummaryXLSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobSummaryXLSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobXLSResponse WUClusterJobXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUClusterJobXLS?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUClusterJobXLS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobXLSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobXLSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobXLSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCompileECLResponse WUCompileECL(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCompileECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUCompileECL?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUCompileECL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCompileECLResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCompileECLResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCompileECLResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalFilesResponse WUCopyLogicalFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUCopyLogicalFiles?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUCopyLogicalFiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalFilesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalFilesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalFilesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyQuerySetResponse WUCopyQuerySet(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyQuerySet parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUCopyQuerySet?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUCopyQuerySet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyQuerySetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyQuerySetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyQuerySetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateResponse WUCreate() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUCreate?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse WUCreateAndUpdate(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateAndUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUCreateAndUpdate?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUCreateAndUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateZAPInfoResponse WUCreateZAPInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateZAPInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUCreateZAPInfo?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUCreateZAPInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateZAPInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateZAPInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateZAPInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeleteResponse WUDelete(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDelete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUDelete?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeleteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeleteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeleteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeployWorkunitResponse WUDeployWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeployWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUDeployWorkunit?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUDeployWorkunit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeployWorkunitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeployWorkunitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeployWorkunitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExportResponse WUExport(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExport parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUExport?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUExport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULogFileResponse WUFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUFile?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULogFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULogFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULogFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGVCGraphInfoResponse WUGVCGraphInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGVCGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUGVCGraphInfo?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUGVCGraphInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGVCGraphInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGVCGraphInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGVCGraphInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetArchiveFileResponse WUGetArchiveFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetArchiveFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUGetArchiveFile?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUGetArchiveFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetArchiveFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetArchiveFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetArchiveFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetDependancyTreesResponse WUGetDependancyTrees(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetDependancyTrees parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUGetDependancyTrees?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUGetDependancyTrees"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetDependancyTreesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetDependancyTreesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetDependancyTreesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphResponse WUGetGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUGetGraph?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUGetGraph"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphNameAndTypesResponse WUGetGraphNameAndTypes(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphNameAndTypes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUGetGraphNameAndTypes?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUGetGraphNameAndTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphNameAndTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphNameAndTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphNameAndTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetStatsResponse WUGetStats(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetStats parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUGetStats?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUGetStats"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetStatsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetStatsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetStatsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetZAPInfoResponse WUGetZAPInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetZAPInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUGetZAPInfo?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUGetZAPInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetZAPInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetZAPInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetZAPInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphInfoResponse WUGraphInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUGraphInfo?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUGraphInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphTimingResponse WUGraphTiming(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphTiming parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUGraphTiming?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUGraphTiming"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphTimingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphTimingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphTimingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse WUInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUInfo?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse WUInfoDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUInfoDetails?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUInfoDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUJobListResponse WUJobList(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUJobList parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUJobList?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUJobList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUJobListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUJobListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUJobListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULightWeightQueryResponse WULightWeightQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULightWeightQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WULightWeightQuery?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WULightWeightQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULightWeightQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULightWeightQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULightWeightQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListArchiveFilesResponse WUListArchiveFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListArchiveFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUListArchiveFiles?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUListArchiveFiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListArchiveFilesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListArchiveFilesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListArchiveFilesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListLocalFileRequiredResponse WUListLocalFileRequired(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListLocalFileRequired parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUListLocalFileRequired?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUListLocalFileRequired"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListLocalFileRequiredResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListLocalFileRequiredResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListLocalFileRequiredResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesResponse WUListQueries(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueries parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUListQueries?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUListQueries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesUsingFileResponse WUListQueriesUsingFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesUsingFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUListQueriesUsingFile?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUListQueriesUsingFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesUsingFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesUsingFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesUsingFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUMultiQuerySetDetailsResponse WUMultiQuerysetDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUMultiQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUMultiQuerysetDetails?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUMultiQuerysetDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUMultiQuerySetDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUMultiQuerySetDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUMultiQuerySetDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProcessGraphResponse WUProcessGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProcessGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUProcessGraph?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUProcessGraph"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProcessGraphResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProcessGraphResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProcessGraphResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProtectResponse WUProtect(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProtect parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUProtect?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUProtect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProtectResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProtectResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProtectResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPublishWorkunitResponse WUPublishWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPublishWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUPublishWorkunit?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUPublishWorkunit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPublishWorkunitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPublishWorkunitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPublishWorkunitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPushEventResponse WUPushEvent(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPushEvent parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUPushEvent?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUPushEvent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPushEventResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPushEventResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPushEventResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryResponse WUQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUQuery?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryConfigResponse WUQueryConfig(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryConfig parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUQueryConfig?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUQueryConfig"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryConfigResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryConfigResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryConfigResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryDetailsResponse WUQueryDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUQueryDetails?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUQueryDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryFilesResponse WUQueryFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUQueryFiles?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUQueryFiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryFilesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryFilesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryFilesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryGetGraphResponse WUQueryGetGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUQueryGetGraph?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUQueryGetGraph"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryGetGraphResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryGetGraphResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryGetGraphResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetAliasActionResponse WUQuerysetAliasAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetAliasAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUQuerysetAliasAction?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUQuerysetAliasAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetAliasActionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetAliasActionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetAliasActionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetCopyQueryResponse WUQuerysetCopyQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetCopyQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUQuerysetCopyQuery?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUQuerysetCopyQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetCopyQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetCopyQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetCopyQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetDetailsResponse WUQuerysetDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUQuerysetDetails?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUQuerysetDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetQueryActionResponse WUQuerysetQueryAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetQueryAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUQuerysetQueryAction?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUQuerysetQueryAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetQueryActionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetQueryActionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetQueryActionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetsResponse WUQuerysets(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysets parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUQuerysets?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUQuerysets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResubmitResponse WUResubmit(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUResubmit?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUResubmit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResubmitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResubmitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResubmitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultResponse WUResult(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResult parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUResult?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultBinResponse WUResultBin(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultBin parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUResultBin?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUResultBin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultBinResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultBinResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultBinResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultSummaryResponse WUResultSummary(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultSummary parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUResultSummary?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUResultSummary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultSummaryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultSummaryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultSummaryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultViewResponse WUResultView(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultView parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUResultView?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUResultView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultViewResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultViewResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultViewResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WURunResponse WURun(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WURun parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WURun?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WURun"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WURunResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WURunResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WURunResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUScheduleResponse WUSchedule(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSchedule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUSchedule?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUSchedule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUScheduleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUScheduleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUScheduleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUShowScheduledResponse WUShowScheduled(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUShowScheduled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUShowScheduled?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUShowScheduled"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUShowScheduledResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUShowScheduledResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUShowScheduledResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSubmitResponse WUSubmit(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUSubmit?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUSubmit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSubmitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSubmitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSubmitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSyntaxCheckResponse WUSyntaxCheckECL(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSyntaxCheckECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUSyntaxCheckECL?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUSyntaxCheckECL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSyntaxCheckResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSyntaxCheckResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSyntaxCheckResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse WUUpdate(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUUpdate?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitResponse WUWaitCompiled(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitCompiled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUWaitCompiled?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUWaitCompiled"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitResponse WUWaitComplete(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitComplete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsWorkunits/WUWaitComplete?ver_=1.56");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WUWaitComplete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}

/**
 * WsSMCServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_21;

public class WsSMCServiceSoapStub extends org.apache.axis.client.Stub implements org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[20];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Activity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Activity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">Activity"), org.hpccsystems.ws.client.gen.wssmc.v1_21.Activity.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">ActivityResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.ActivityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActivityResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BrowseResources");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BrowseResources"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">BrowseResources"), org.hpccsystems.ws.client.gen.wssmc.v1_21.BrowseResources.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">BrowseResourcesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.BrowseResourcesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BrowseResourcesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ClearQueue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ClearQueue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">ClearQueue"), org.hpccsystems.ws.client.gen.wssmc.v1_21.ClearQueue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCQueueResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCQueueResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatusServerInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "GetStatusServerInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">GetStatusServerInfo"), org.hpccsystems.ws.client.gen.wssmc.v1_21.GetStatusServerInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">GetStatusServerInfoResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.GetStatusServerInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "GetStatusServerInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetThorQueueAvailability");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "GetThorQueueAvailability"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">GetThorQueueAvailability"), org.hpccsystems.ws.client.gen.wssmc.v1_21.GetThorQueueAvailability.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">GetThorQueueAvailabilityResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.GetThorQueueAvailabilityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "GetThorQueueAvailabilityResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Index");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Index"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">Index"), org.hpccsystems.ws.client.gen.wssmc.v1_21.Index.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCIndexResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCIndexResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCIndexResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LockQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "LockQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">LockQuery"), org.hpccsystems.ws.client.gen.wssmc.v1_21.LockQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">LockQueryResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.LockQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "LockQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MoveJobBack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "MoveJobBack"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobBack"), org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobBack.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCJobResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCJobResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MoveJobDown");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "MoveJobDown"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobDown"), org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobDown.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCJobResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCJobResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MoveJobFront");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "MoveJobFront"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobFront"), org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobFront.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCJobResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCJobResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MoveJobUp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "MoveJobUp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobUp"), org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobUp.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCJobResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCJobResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NotInCommunityEdition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "NotInCommunityEdition"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">NotInCommunityEdition"), org.hpccsystems.ws.client.gen.wssmc.v1_21.NotInCommunityEdition.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">NotInCommunityEditionResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.NotInCommunityEditionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "NotInCommunityEditionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PauseQueue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "PauseQueue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">PauseQueue"), org.hpccsystems.ws.client.gen.wssmc.v1_21.PauseQueue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCQueueResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCQueueResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Ping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Ping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">Ping"), org.hpccsystems.ws.client.gen.wssmc.v1_21.Ping.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">WsSMCPingResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCPingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "WsSMCPingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RemoveJob"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">RemoveJob"), org.hpccsystems.ws.client.gen.wssmc.v1_21.RemoveJob.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCJobResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCJobResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResumeQueue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ResumeQueue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">ResumeQueue"), org.hpccsystems.ws.client.gen.wssmc.v1_21.ResumeQueue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCQueueResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCQueueResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RoxieControlCmd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieControlCmd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">RoxieControlCmd"), org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmd.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">RoxieControlCmdResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieControlCmdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetBanner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SetBanner"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SetBanner"), org.hpccsystems.ws.client.gen.wssmc.v1_21.SetBanner.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SetBannerResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.SetBannerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SetBannerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetJobPriority");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SetJobPriority"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SetJobPriority"), org.hpccsystems.ws.client.gen.wssmc.v1_21.SetJobPriority.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCPriorityResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCPriorityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCPriorityResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StopQueue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "StopQueue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">StopQueue"), org.hpccsystems.ws.client.gen.wssmc.v1_21.StopQueue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCQueueResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCQueueResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "wssmc.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    public WsSMCServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WsSMCServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WsSMCServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">>RoxieControlCmdResponse>Endpoints");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlEndpointInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieControlEndpointInfo");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Endpoint");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">Activity");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.Activity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">ActivityResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.ActivityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">BrowseResources");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.BrowseResources.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">BrowseResourcesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.BrowseResourcesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">ClearQueue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.ClearQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">GetStatusServerInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.GetStatusServerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">GetStatusServerInfoResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.GetStatusServerInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">GetThorQueueAvailability");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.GetThorQueueAvailability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">GetThorQueueAvailabilityResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.GetThorQueueAvailabilityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">Index");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.Index.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">LockQuery");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.LockQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">LockQueryResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.LockQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobBack");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobBack.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobDown");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobDown.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobFront");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobFront.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobUp");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobUp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">NotInCommunityEdition");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.NotInCommunityEdition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">NotInCommunityEditionResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.NotInCommunityEditionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">PauseQueue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.PauseQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">Ping");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.Ping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">RemoveJob");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.RemoveJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">ResumeQueue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.ResumeQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">RoxieControlCmd");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">RoxieControlCmdResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SetBanner");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.SetBanner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SetBannerResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.SetBannerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SetJobPriority");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.SetJobPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCIndexResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCIndexResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCJobResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCPriorityResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCPriorityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCQueueResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">StopQueue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.StopQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">WsSMCPingResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCPingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActiveWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.ActiveWorkunit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfActiveWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.ActiveWorkunit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActiveWorkunit");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActiveWorkunit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfDFUJob");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.DFUJob[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DFUJob");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DFUJob");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfHPCCResource");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.HPCCResource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResource");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResource");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfHPCCResourceRepository");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.HPCCResourceRepository[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResourceRepository");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResourceRepository");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfLock");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.Lock[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Lock");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Lock");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfServerJobQueue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.ServerJobQueue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueue");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfSMCJob");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJob[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCJob");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCJob");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfTargetCluster");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.TargetCluster[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TargetCluster");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TargetCluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfThorCluster");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.ThorCluster[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorCluster");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorCluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DFUJob");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.DFUJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "EspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.EspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "EspStringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResource");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.HPCCResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResourceRepository");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.HPCCResourceRepository.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Lock");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.Lock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "LockModes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.LockModes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieControlCmdType");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieControlEndpointInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlEndpointInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.ServerJobQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCJob");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "StatusServerInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.StatusServerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TargetCluster");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.TargetCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorCluster");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.wssmc.v1_21.ThorCluster.class;
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

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.ActivityResponse activity(org.hpccsystems.ws.client.gen.wssmc.v1_21.Activity parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/Activity?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Activity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.ActivityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.ActivityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.ActivityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.BrowseResourcesResponse browseResources(org.hpccsystems.ws.client.gen.wssmc.v1_21.BrowseResources parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/BrowseResources?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BrowseResources"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.BrowseResourcesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.BrowseResourcesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.BrowseResourcesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse clearQueue(org.hpccsystems.ws.client.gen.wssmc.v1_21.ClearQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/ClearQueue?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ClearQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.GetStatusServerInfoResponse getStatusServerInfo(org.hpccsystems.ws.client.gen.wssmc.v1_21.GetStatusServerInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/GetStatusServerInfo?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetStatusServerInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.GetStatusServerInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.GetStatusServerInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.GetStatusServerInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.GetThorQueueAvailabilityResponse getThorQueueAvailability(org.hpccsystems.ws.client.gen.wssmc.v1_21.GetThorQueueAvailability parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/GetThorQueueAvailability?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetThorQueueAvailability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.GetThorQueueAvailabilityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.GetThorQueueAvailabilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.GetThorQueueAvailabilityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCIndexResponse index(org.hpccsystems.ws.client.gen.wssmc.v1_21.Index parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/Index?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Index"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCIndexResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCIndexResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCIndexResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.LockQueryResponse lockQuery(org.hpccsystems.ws.client.gen.wssmc.v1_21.LockQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/LockQuery?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LockQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.LockQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.LockQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.LockQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse moveJobBack(org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobBack parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/MoveJobBack?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MoveJobBack"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse moveJobDown(org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobDown parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/MoveJobDown?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MoveJobDown"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse moveJobFront(org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobFront parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/MoveJobFront?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MoveJobFront"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse moveJobUp(org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobUp parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/MoveJobUp?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MoveJobUp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.NotInCommunityEditionResponse notInCommunityEdition(org.hpccsystems.ws.client.gen.wssmc.v1_21.NotInCommunityEdition parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/NotInCommunityEdition?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "NotInCommunityEdition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.NotInCommunityEditionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.NotInCommunityEditionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.NotInCommunityEditionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse pauseQueue(org.hpccsystems.ws.client.gen.wssmc.v1_21.PauseQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/PauseQueue?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PauseQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCPingResponse ping(org.hpccsystems.ws.client.gen.wssmc.v1_21.Ping parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/Ping?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Ping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCPingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCPingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCPingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse removeJob(org.hpccsystems.ws.client.gen.wssmc.v1_21.RemoveJob parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/RemoveJob?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RemoveJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse resumeQueue(org.hpccsystems.ws.client.gen.wssmc.v1_21.ResumeQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/ResumeQueue?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResumeQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmdResponse roxieControlCmd(org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmd parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/RoxieControlCmd?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RoxieControlCmd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SetBannerResponse setBanner(org.hpccsystems.ws.client.gen.wssmc.v1_21.SetBanner parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/SetBanner?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetBanner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SetBannerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SetBannerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.SetBannerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCPriorityResponse setJobPriority(org.hpccsystems.ws.client.gen.wssmc.v1_21.SetJobPriority parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/SetJobPriority?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetJobPriority"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCPriorityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCPriorityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCPriorityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse stopQueue(org.hpccsystems.ws.client.gen.wssmc.v1_21.StopQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/StopQueue?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "StopQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}

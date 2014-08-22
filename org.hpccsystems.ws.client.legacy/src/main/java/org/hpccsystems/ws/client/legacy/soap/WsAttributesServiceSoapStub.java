/**
 * WsAttributesServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.legacy.soap;

public class WsAttributesServiceSoapStub extends org.apache.axis.client.Stub implements org.hpccsystems.ws.client.legacy.soap.WsAttributesServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[23];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckinAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CheckinAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CheckinAttributes"), org.hpccsystems.ws.client.legacy.soap.CheckinAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckoutAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CheckoutAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CheckoutAttributes"), org.hpccsystems.ws.client.legacy.soap.CheckoutAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CreateAttribute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CreateAttribute"), org.hpccsystems.ws.client.legacy.soap.CreateAttribute.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CreateAttributeResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.CreateAttributeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CreateAttributeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CreateLabel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CreateLabel"), org.hpccsystems.ws.client.legacy.soap.CreateLabel.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CreateLabelResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.CreateLabelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CreateLabelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CreateModule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CreateModule"), org.hpccsystems.ws.client.legacy.soap.CreateModule.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CreateModuleResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.CreateModuleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CreateModuleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "DeleteAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">DeleteAttributes"), org.hpccsystems.ws.client.legacy.soap.DeleteAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "DeleteLabel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">DeleteLabel"), org.hpccsystems.ws.client.legacy.soap.DeleteLabel.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">DeleteLabelResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.DeleteLabelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "DeleteLabelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "DeleteModule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">DeleteModule"), org.hpccsystems.ws.client.legacy.soap.DeleteModule.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">DeleteModuleResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.DeleteModuleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "DeleteModuleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "FindAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">FindAttributes"), org.hpccsystems.ws.client.legacy.soap.FindAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">FindAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.FindAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "FindAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetAttribute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttribute"), org.hpccsystems.ws.client.legacy.soap.GetAttribute.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributeResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.GetAttributeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetAttributeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAttributeHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetAttributeHistory"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributeHistory"), org.hpccsystems.ws.client.legacy.soap.GetAttributeHistory.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributeHistoryResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.GetAttributeHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetAttributeHistoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAttributeLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetAttributeLabels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributeLabels"), org.hpccsystems.ws.client.legacy.soap.GetAttributeLabels.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributeLabelsResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.GetAttributeLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetAttributeLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributes"), org.hpccsystems.ws.client.legacy.soap.GetAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.GetAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetLabels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetLabels"), org.hpccsystems.ws.client.legacy.soap.GetLabels.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetLabelsResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.GetLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetModules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetModules"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetModules"), org.hpccsystems.ws.client.legacy.soap.GetModules.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetModulesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.GetModulesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetModulesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ImportAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ImportAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">ImportAttributes"), org.hpccsystems.ws.client.legacy.soap.ImportAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListAttributeTypes");
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">ListAttributeTypesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.ListAttributeTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ListAttributeTypesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RenameAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "RenameAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">RenameAttributes"), org.hpccsystems.ws.client.legacy.soap.RenameAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RenameModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "RenameModule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">RenameModule"), org.hpccsystems.ws.client.legacy.soap.RenameModule.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">RenameModuleResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.RenameModuleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "RenameModuleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RollbackAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "RollbackAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">RollbackAttributes"), org.hpccsystems.ws.client.legacy.soap.RollbackAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "SaveAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">SaveAttributes"), org.hpccsystems.ws.client.legacy.soap.SaveAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SupportsEarMark");
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">SupportsEarMarkResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.SupportsEarMarkResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "SupportsEarMarkResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "UpdateLabel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">UpdateLabel"), org.hpccsystems.ws.client.legacy.soap.UpdateLabel.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">UpdateLabelResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.legacy.soap.UpdateLabelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "UpdateLabelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
                      "wsattributes.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[22] = oper;

    }

    public WsAttributesServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WsAttributesServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WsAttributesServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">>ListAttributeTypesResponse>Types");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.AttributeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "AttributeType");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Type");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CheckinAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.CheckinAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CheckoutAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.CheckoutAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CreateAttribute");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.CreateAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CreateAttributeResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.CreateAttributeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CreateLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.CreateLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CreateLabelResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.CreateLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CreateModule");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.CreateModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CreateModuleResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.CreateModuleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">DeleteAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.DeleteAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">DeleteLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.DeleteLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">DeleteLabelResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.DeleteLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">DeleteModule");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.DeleteModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">DeleteModuleResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.DeleteModuleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">ECLAttribute>MatchedLines");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ECLTextLine[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLTextLine");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Line");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">FindAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.FindAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">FindAttributesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.FindAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttribute");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.GetAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributeHistory");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.GetAttributeHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributeHistoryResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.GetAttributeHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributeLabels");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.GetAttributeLabels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributeLabelsResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.GetAttributeLabelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributeResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.GetAttributeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.GetAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.GetAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetLabels");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.GetLabels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetLabelsResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.GetLabelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetModules");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.GetModules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetModulesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.GetModulesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">ImportAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ImportAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">ListAttributeTypesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ListAttributeTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">RenameAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.RenameAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">RenameModule");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.RenameModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">RenameModuleResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.RenameModuleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">RollbackAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.RollbackAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">SaveAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.SaveAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">SupportsEarMarkResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.SupportsEarMarkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">UpdateAttributesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">UpdateLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.UpdateLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">UpdateLabelResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.UpdateLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfCheckinAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.CheckinAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CheckinAttributeRequest");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CheckinAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfCheckoutAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.CheckoutAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CheckoutAttributeRequest");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CheckoutAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfDeleteAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.DeleteAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "DeleteAttributeRequest");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "DeleteAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfECLAttribute");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ECLAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLAttribute");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLAttribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfECLAttributeLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ECLAttributeLabel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLAttributeLabel");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLAttributeLabel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfECLLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ECLLabel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLLabel");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLLabel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfECLModule");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ECLModule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLModule");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLModule");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfImportAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ImportAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ImportAttributeRequest");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ImportAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfRenameAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.RenameAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "RenameAttributeRequest");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "RenameAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfRollbackAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.RollbackAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "RollbackAttributeRequest");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "RollbackAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfSaveAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.SaveAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "SaveAttributeRequest");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "SaveAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "AttributeType");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.AttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CheckinAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.CheckinAttributeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CheckoutAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.CheckoutAttributeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "DeleteAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.DeleteAttributeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLAttribute");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ECLAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLAttributeLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ECLAttributeLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ECLLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLModule");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ECLModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLTextLine");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ECLTextLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "EspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.EspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "EspStringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ImportAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.ImportAttributeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "RenameAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.RenameAttributeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "RollbackAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.RollbackAttributeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "SaveAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.legacy.soap.SaveAttributeRequest.class;
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

    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse checkinAttributes(org.hpccsystems.ws.client.legacy.soap.CheckinAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/CheckinAttributes?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckinAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse checkoutAttributes(org.hpccsystems.ws.client.legacy.soap.CheckoutAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/CheckoutAttributes?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckoutAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.CreateAttributeResponse createAttribute(org.hpccsystems.ws.client.legacy.soap.CreateAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/CreateAttribute?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.CreateAttributeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.CreateAttributeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.CreateAttributeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.CreateLabelResponse createLabel(org.hpccsystems.ws.client.legacy.soap.CreateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/CreateLabel?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.CreateLabelResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.CreateLabelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.CreateLabelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.CreateModuleResponse createModule(org.hpccsystems.ws.client.legacy.soap.CreateModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/CreateModule?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.CreateModuleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.CreateModuleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.CreateModuleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse deleteAttributes(org.hpccsystems.ws.client.legacy.soap.DeleteAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/DeleteAttributes?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.DeleteLabelResponse deleteLabel(org.hpccsystems.ws.client.legacy.soap.DeleteLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/DeleteLabel?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.DeleteLabelResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.DeleteLabelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.DeleteLabelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.DeleteModuleResponse deleteModule(org.hpccsystems.ws.client.legacy.soap.DeleteModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/DeleteModule?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.DeleteModuleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.DeleteModuleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.DeleteModuleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.FindAttributesResponse findAttributes(org.hpccsystems.ws.client.legacy.soap.FindAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/FindAttributes?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FindAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.FindAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.FindAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.FindAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.GetAttributeResponse getAttribute(org.hpccsystems.ws.client.legacy.soap.GetAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/GetAttribute?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.GetAttributeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.GetAttributeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.GetAttributeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.GetAttributeHistoryResponse getAttributeHistory(org.hpccsystems.ws.client.legacy.soap.GetAttributeHistory parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/GetAttributeHistory?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAttributeHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.GetAttributeHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.GetAttributeHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.GetAttributeHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.GetAttributeLabelsResponse getAttributeLabels(org.hpccsystems.ws.client.legacy.soap.GetAttributeLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/GetAttributeLabels?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAttributeLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.GetAttributeLabelsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.GetAttributeLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.GetAttributeLabelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.GetAttributesResponse getAttributes(org.hpccsystems.ws.client.legacy.soap.GetAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/GetAttributes?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.GetAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.GetAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.GetAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.GetLabelsResponse getLabels(org.hpccsystems.ws.client.legacy.soap.GetLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/GetLabels?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.GetLabelsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.GetLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.GetLabelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.GetModulesResponse getModules(org.hpccsystems.ws.client.legacy.soap.GetModules parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/GetModules?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetModules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.GetModulesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.GetModulesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.GetModulesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse importAttributes(org.hpccsystems.ws.client.legacy.soap.ImportAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/ImportAttributes?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ImportAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.ListAttributeTypesResponse listAttributeTypes() throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/ListAttributeTypes?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ListAttributeTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.ListAttributeTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.ListAttributeTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.ListAttributeTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse renameAttributes(org.hpccsystems.ws.client.legacy.soap.RenameAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/RenameAttributes?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RenameAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.RenameModuleResponse renameModule(org.hpccsystems.ws.client.legacy.soap.RenameModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/RenameModule?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RenameModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.RenameModuleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.RenameModuleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.RenameModuleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse rollbackAttributes(org.hpccsystems.ws.client.legacy.soap.RollbackAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/RollbackAttributes?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RollbackAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse saveAttributes(org.hpccsystems.ws.client.legacy.soap.SaveAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/SaveAttributes?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SaveAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.SupportsEarMarkResponse supportsEarMark() throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/SupportsEarMark?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SupportsEarMark"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.SupportsEarMarkResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.SupportsEarMarkResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.SupportsEarMarkResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.legacy.soap.UpdateLabelResponse updateLabel(org.hpccsystems.ws.client.legacy.soap.UpdateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/UpdateLabel?ver_=1.21");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateLabelResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.legacy.soap.UpdateLabelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.legacy.soap.UpdateLabelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}

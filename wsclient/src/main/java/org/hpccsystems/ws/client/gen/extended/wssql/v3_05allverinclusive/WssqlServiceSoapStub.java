/**
 * WssqlServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive;

public class WssqlServiceSoapStub extends org.apache.axis.client.Stub implements org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateTableAndLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "CreateTableAndLoadRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">CreateTableAndLoadRequest"), org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.CreateTableAndLoadRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">CreateTableAndLoadResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.CreateTableAndLoadResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "CreateTableAndLoadResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
                      "wssql.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Echo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EchoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">EchoRequest"), org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EchoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">EchoResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EchoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EchoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
                      "wssql.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExecutePreparedSQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ExecutePreparedSQLRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">ExecutePreparedSQLRequest"), org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecutePreparedSQLRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">ExecutePreparedSQLResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecutePreparedSQLResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ExecutePreparedSQLResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
                      "wssql.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExecuteSQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ExecuteSQLRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">ExecuteSQLRequest"), org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecuteSQLRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">ExecuteSQLResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecuteSQLResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ExecuteSQLResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
                      "wssql.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDBMetaData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "GetDBMetaDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetDBMetaDataRequest"), org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBMetaDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetDBMetaDataResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBMetaDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "GetDBMetaDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
                      "wssql.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDBSystemInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "GetDBSystemInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetDBSystemInfoRequest"), org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBSystemInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetDBSystemInfoResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBSystemInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "GetDBSystemInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
                      "wssql.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRelatedIndexes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "GetRelatedIndexesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetRelatedIndexesRequest"), org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetRelatedIndexesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetRelatedIndexesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetRelatedIndexesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "GetRelatedIndexesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
                      "wssql.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetResults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "GetResultsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetResultsRequest"), org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetResultsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetResultsResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetResultsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "GetResultsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
                      "wssql.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Ping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "wssqlPingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">wssqlPingRequest"), org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlPingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">wssqlPingResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlPingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "wssqlPingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
                      "wssql.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PrepareSQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "PrepareSQLRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">PrepareSQLRequest"), org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.PrepareSQLRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">PrepareSQLResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.PrepareSQLResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "PrepareSQLResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
                      "wssql.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetRelatedIndexes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "SetRelatedIndexesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">SetRelatedIndexesRequest"), org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.SetRelatedIndexesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">SetRelatedIndexesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.SetRelatedIndexesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "SetRelatedIndexesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
                      "wssql.ws.hpccsystems.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"), 
                      true
                     ));
        _operations[10] = oper;

    }

    public WssqlServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WssqlServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WssqlServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">>CreateTableAndLoadRequest>EclFields");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EclFieldDeclaration[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EclFieldDeclaration");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EclField");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">>ExecuteSQLRequest>AlternateClusters");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "AlternateCluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">>GetDBMetaDataResponse>ClusterNames");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ClusterName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">>GetDBMetaDataResponse>QuerySets");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.HPCCQuerySet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCQuerySet");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">>GetDBMetaDataResponse>Tables");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.HPCCTable[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCTable");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Table");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">>GetRelatedIndexesRequest>FileNames");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "FileName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">>GetRelatedIndexesResponse>RelatedIndexSets");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.RelatedIndexSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "RelatedIndexSet");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "RelatedIndexSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">>PrepareSQLRequest>AlternateClusters");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "AlternateCluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">>SetRelatedIndexesRequest>RelatedIndexSets");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.RelatedIndexSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "RelatedIndexSet");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "RelatedIndexSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">>SetRelatedIndexesResponse>RelatedIndexSets");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.RelatedIndexSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "RelatedIndexSet");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "RelatedIndexSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">CreateTableAndLoadRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.CreateTableAndLoadRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">CreateTableAndLoadResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.CreateTableAndLoadResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">DataType>Params");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.DataTypeParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DataTypeParam");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Param");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">DataTypeParam>Values");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Value");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">EchoRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EchoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">EchoResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EchoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">ECLWorkunit>AllowedClusters");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "AllowedCluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">ECLWorkunit>ResourceURLs");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "URL");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">ExecutePreparedSQLRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecutePreparedSQLRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">ExecutePreparedSQLResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecutePreparedSQLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">ExecuteSQLRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecuteSQLRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">ExecuteSQLResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecuteSQLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetDBMetaDataRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBMetaDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetDBMetaDataResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBMetaDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetDBSystemInfoRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBSystemInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetDBSystemInfoResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBSystemInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetRelatedIndexesRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetRelatedIndexesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetRelatedIndexesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetRelatedIndexesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetResultsRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetResultsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetResultsResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetResultsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">HPCCQuerySet>QuerySetAliases");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.QuerySetAliasMap[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySetAliasMap");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySetAlias");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">HPCCQuerySet>QuerySetQueries");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.PublishedQuery[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "PublishedQuery");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySetQuery");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">HPCCTable>Columns");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.HPCCColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCColumn");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Column");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">OutputDataset>OutParams");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.HPCCColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCColumn");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "OutParam");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">PrepareSQLRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.PrepareSQLRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">PrepareSQLResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.PrepareSQLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">QuerySignature>InParams");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.HPCCColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCColumn");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "InParam");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">QuerySignature>ResultSets");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.OutputDataset[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "OutputDataset");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ResultSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">RelatedIndexSet>Indexes");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Index");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">SetRelatedIndexesRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.SetRelatedIndexesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">SetRelatedIndexesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.SetRelatedIndexesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">wssqlPingRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlPingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">wssqlPingResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlPingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ApplicationValue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ApplicationValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfApplicationValue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ApplicationValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ApplicationValue");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ApplicationValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfDebugValue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.DebugValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DebugValue");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DebugValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfECLException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLException[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLException");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLException");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfECLGraph");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLGraph[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLGraph");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLGraph");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfECLHelpFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLHelpFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLHelpFile");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLHelpFile");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfECLResult");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLResult");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfECLSchemaItem");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLSchemaItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLSchemaItem");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLSchemaItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfECLSourceFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLSourceFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLSourceFile");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLSourceFile");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfECLTimer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLTimer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLTimer");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLTimer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfECLTimingData");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLTimingData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLTimingData");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLTimingData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfECLWorkflow");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLWorkflow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLWorkflow");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLWorkflow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfNamedValue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.NamedValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "NamedValue");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "NamedValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfThorLogInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ThorLogInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ThorLogInfo");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ThorLogInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DataSourceInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.DataSourceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DataType");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.DataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DataTypeParam");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.DataTypeParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DebugValue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.DebugValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EclFieldDeclaration");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EclFieldDeclaration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EclFieldType");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EclFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLGraph");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLGraph.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLHelpFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLHelpFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLQuery");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLResult");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLSchemaItem");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLSchemaItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLSourceFile");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLSourceFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLTimer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLTimer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLTimingData");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLTimingData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLWorkflow");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLWorkflow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ECLWorkunit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCColumn");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.HPCCColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCFieldType");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.HPCCFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCFileType");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.HPCCFileType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCQuerySet");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.HPCCQuerySet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCTable");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.HPCCTable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "NamedValue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.NamedValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "OutputDataset");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.OutputDataset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "PublishedQuery");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.PublishedQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySetAliasMap");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.QuerySetAliasMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySignature");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.QuerySignature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "RelatedIndexSet");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.RelatedIndexSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ThorLogInfo");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ThorLogInfo.class;
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

    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.CreateTableAndLoadResponse createTableAndLoad(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.CreateTableAndLoadRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("wssql/CreateTableAndLoad?ver_=3.05");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateTableAndLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.CreateTableAndLoadResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.CreateTableAndLoadResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.CreateTableAndLoadResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EchoResponse echo(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("wssql/Echo?ver_=3.05");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Echo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EchoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EchoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EchoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecutePreparedSQLResponse executePreparedSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecutePreparedSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("wssql/ExecutePreparedSQL?ver_=3.05");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ExecutePreparedSQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecutePreparedSQLResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecutePreparedSQLResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecutePreparedSQLResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecuteSQLResponse executeSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecuteSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("wssql/ExecuteSQL?ver_=3.05");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ExecuteSQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecuteSQLResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecuteSQLResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecuteSQLResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBMetaDataResponse getDBMetaData(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("wssql/GetDBMetaData?ver_=3.05");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDBMetaData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBMetaDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBMetaDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBMetaDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBSystemInfoResponse getDBSystemInfo(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBSystemInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("wssql/GetDBSystemInfo?ver_=3.05");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDBSystemInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBSystemInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBSystemInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBSystemInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetRelatedIndexesResponse getRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("wssql/GetRelatedIndexes?ver_=3.05");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetRelatedIndexes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetRelatedIndexesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetRelatedIndexesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetRelatedIndexesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetResultsResponse getResults(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetResultsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("wssql/GetResults?ver_=3.05");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetResults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetResultsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetResultsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetResultsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlPingResponse ping(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("wssql/Ping?ver_=3.05");
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
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlPingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlPingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlPingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.PrepareSQLResponse prepareSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.PrepareSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("wssql/PrepareSQL?ver_=3.05");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PrepareSQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.PrepareSQLResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.PrepareSQLResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.PrepareSQLResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.SetRelatedIndexesResponse setRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.SetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("wssql/SetRelatedIndexes?ver_=3.05");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetRelatedIndexes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.SetRelatedIndexesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.SetRelatedIndexesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.SetRelatedIndexesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}

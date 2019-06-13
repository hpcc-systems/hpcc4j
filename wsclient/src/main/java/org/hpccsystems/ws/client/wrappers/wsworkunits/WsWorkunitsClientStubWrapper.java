/*##############################################################################

HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
############################################################################## */

package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.BaseHPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;

/**
 * This wrapper class allows an HPCCWsDFUClient instance to connect to HPCC Clusters using different
 * versions of the platform.
 *
 */
public class WsWorkunitsClientStubWrapper
{
    private org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WsWorkunitsStub stub1_75                     = null;
    //private org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_74.WsWorkunitsStub stub1_74                     = null;
    private org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunitsStub stub1_69                     = null;
    private org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WsWorkunitsStub stub1_62                     = null;
    private org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WsWorkunitsStub stub1_58                     = null;
    private org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WsWorkunitsStub stub1_56                     = null;

    private Version platformVersion;
    private Connection connection;

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WsWorkunitsStub getLatest() throws AxisFault
    {
        return get1_75Stub();
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WsWorkunitsStub get1_75Stub() throws AxisFault
    {
        if (stub1_75 == null)
        {
            stub1_75 = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WsWorkunitsStub(connection.getBaseUrl()+HPCCWsWorkUnitsClient.WSWORKUNITSWSDLURI);
            stub1_75 = ((org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WsWorkunitsStub)BaseHPCCWsClient.setStubOptions(stub1_75, connection));
        }
        return stub1_75;
    }

//    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_74.WsWorkunitsStub get1_74Stub() throws AxisFault
//    {
//        if (stub1_74 == null)
//        {
//            stub1_74 = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_74.WsWorkunitsStub(connection.getBaseUrl()+HPCCWsWorkUnitsClient.WSWORKUNITSWSDLURI);
//            stub1_74 = ((org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_74.WsWorkunitsStub)BaseHPCCWsClient.setStubOptions(stub1_74, connection));
//        }
//        return stub1_74;
//    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunitsStub get1_69Stub() throws AxisFault
    {
        if (stub1_69 == null)
        {
            stub1_69 = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunitsStub(connection.getBaseUrl()+HPCCWsWorkUnitsClient.WSWORKUNITSWSDLURI);
            stub1_69 = ((org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunitsStub)BaseHPCCWsClient.setStubOptions(stub1_69, connection));
        }
        return stub1_69;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WsWorkunitsStub get1_62Stub() throws AxisFault
    {
        if (stub1_62 == null)
        {
            stub1_62 = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WsWorkunitsStub(connection.getBaseUrl()+HPCCWsWorkUnitsClient.WSWORKUNITSWSDLURI);
            stub1_62 = ((org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WsWorkunitsStub)BaseHPCCWsClient.setStubOptions(stub1_62, connection));
        }
        return stub1_62;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WsWorkunitsStub get1_58Stub() throws AxisFault
    {
        if (stub1_58 == null)
        {
            stub1_58 = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WsWorkunitsStub(connection.getBaseUrl()+HPCCWsWorkUnitsClient.WSWORKUNITSWSDLURI);
            stub1_58 = ((org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WsWorkunitsStub)BaseHPCCWsClient.setStubOptions(stub1_58, connection));
        }
        return stub1_58;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WsWorkunitsStub getVersion1_56Raw() throws AxisFault
    {
        if (stub1_56 == null)
        {
            stub1_56 = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WsWorkunitsStub(connection.getBaseUrl()+HPCCWsWorkUnitsClient.WSWORKUNITSWSDLURI);
            stub1_56 = ((org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WsWorkunitsStub)BaseHPCCWsClient.setStubOptions(stub1_56, connection));
        }
        return stub1_56;
    }

    public WsWorkunitsClientStubWrapper(Connection conn, Version targetVersion)
    {
        this.connection = conn;
        this.platformVersion = targetVersion;
    }

    private boolean useVersion1_69()
    {
        return platformVersion.major==6 && platformVersion.minor>=4;
    }

    private boolean useVersion1_58()
    {
        return platformVersion.major==6 && platformVersion.minor==0;
    }

    private boolean useVersion1_62()
    {
        return platformVersion.major==6 && platformVersion.minor==2;
    }

    private boolean useVersion1_75()
    {
        return platformVersion.major==7
                && (platformVersion.minor==0
                || platformVersion.minor>=2);
    }
    /**
     * @param params WUInfoRequestWrapper containing request info
     * @return a WUInfoResponseWrapper containing the response
     * @throws Exception if the WUInfo command fails or an unsupported version is specified
     */
    public WUInfoResponseWrapper WUInfo(WUInfoRequestWrapper params) throws Exception
    {
        try
        {
            if (useVersion1_58())
            {
                get1_58Stub();
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUInfoResponse response = stub1_58.wUInfo(params.getRawVersion1_58());

                return new WUInfoResponseWrapper(response);
            }
            else if (useVersion1_62())
            {
                get1_62Stub();
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUInfoResponse response = stub1_62.wUInfo(params.getRawVersion1_62());
                return new WUInfoResponseWrapper(response);
            }
            else if (useVersion1_69())
            {
                get1_69Stub();
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoResponse response = stub1_69.wUInfo(params.getRawVersion1_69());
                return new WUInfoResponseWrapper(response);
            }
            else if (useVersion1_75())
            {
                get1_75Stub();
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUInfoResponse response = stub1_75.wUInfo(params.getRaw());
                return new WUInfoResponseWrapper(response);
            }
        }
        catch (RemoteException e)
        {
            throw new Exception ("WUInfoResponseWrapper.WUInfo encountered RemoteException.", e);
        }

        throw new UnsupportedOperationException("Can only handle cluster versions 6 and 7, not version " + String.valueOf(platformVersion.major));
    }

    public WUUpdateResponseWrapper WUCreateAndUpdate(WUCreateAndUpdateWrapper params) throws Exception
    {
        if (useVersion1_58())
        {
            get1_58Stub();
            return new WUUpdateResponseWrapper(stub1_58.wUCreateAndUpdate(params.getRawVersion1_58()));
        }
        else if (useVersion1_62())
        {
            get1_62Stub();
            return new WUUpdateResponseWrapper(stub1_62.wUCreateAndUpdate(params.getRawVersion1_62()));
        }
        else if (useVersion1_69())
        {
            get1_69Stub();
            return new WUUpdateResponseWrapper(stub1_69.wUCreateAndUpdate(params.getRawVersion1_69()));
        }
        else if (useVersion1_75())
        {
            get1_75Stub();
            return new WUUpdateResponseWrapper(stub1_75.wUCreateAndUpdate(params.getRaw()));
        }
        else
        {
            throw new UnsupportedOperationException("Can only handle cluster versions 6 and 7, not version " + String.valueOf(platformVersion.major));
        }
    }

    public WUCreateResponseWrapper WUCreate(WUCreateRequestWrapper params) throws Exception
    {
        if (useVersion1_58())
        {
            get1_58Stub();
            return new WUCreateResponseWrapper(stub1_58.wUCreate(params.getRawVersion1_58()));
        }
        else if (useVersion1_62())
        {
            get1_62Stub();
            return new WUCreateResponseWrapper(stub1_62.wUCreate(params.getRawVersion1_62()));
        }
        else if (useVersion1_69())
        {
            get1_69Stub();
            return new WUCreateResponseWrapper(stub1_69.wUCreate(params.getRawVersion1_69()));
        }
        else if (useVersion1_75())
        {
            get1_75Stub();
            return new WUCreateResponseWrapper(stub1_75.wUCreate(params.getRaw()));
        }
        else
        {
            throw new UnsupportedOperationException("Can only handle cluster versions 6 and 7, not version " + String.valueOf(platformVersion.major));
        }
    }

    public WUUpdateResponseWrapper WUUpdate(WUUpdateRequestWrapper params) throws Exception
    {
        if (useVersion1_58())
        {
            get1_58Stub();
            return new WUUpdateResponseWrapper(stub1_58.wUUpdate(params.getRawVersion1_58()));
        }
        else if (useVersion1_62())
        {
            get1_62Stub();
            return new WUUpdateResponseWrapper(stub1_62.wUUpdate(params.getRawVersion1_62()));
        }
        else if (useVersion1_69())
        {
            get1_69Stub();
            return new WUUpdateResponseWrapper(stub1_69.wUUpdate(params.getRawVersion1_69()));
        }
        else if (useVersion1_75())
        {
            get1_75Stub();
            return new WUUpdateResponseWrapper(stub1_75.wUUpdate(params.getRaw()));
        }
        else
        {
            throw new UnsupportedOperationException("Can only handle cluster versions 6 and 7, not version " + String.valueOf(platformVersion.major));
        }
    }

    

///**
// * Converts EspException from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.EspException  in
// * @return EspException
// */
//private EspException convertEspException(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.EspException in)
//{
//    EspException out = new EspException();
//    if (in.getCode() != null) out.setCode(in.getCode());
//    if (in.getAudience() != null) out.setAudience(in.getAudience());
//    if (in.getSource() != null) out.setSource(in.getSource());
//    if (in.getMessage() != null) out.setMessage(in.getMessage());
//    return out;
//}
//
///**
// * Converts ArrayOfEspException from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException in
// * @return ArrayOfEspException
// */
//private ArrayOfEspException convertArrayOfEspException(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException in)
//{
//    if (in==null)
//    {
//        return null;
//    }
//
//    ArrayOfEspException out = new ArrayOfEspException();
//    if (in.getSource() != null) out.setSource(in.getSource());
//    if (in.getException() != null)
//    {
//        EspException[] temp_exceptions = new EspException[in.getException().length];
//        for (int i = 0; i < in.getException().length; i++)
//        {
//            temp_exceptions[i] = convertEspException(in.getException(i));
//        }
//        out.setException(temp_exceptions);
//    }
//    return out;
//}
//
///**
// * Converts ThorLogInfo from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ThorLogInfo in
// * @return ThorLogInfo
// */
//private ThorLogInfo convertThorLogInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ThorLogInfo in)
//{
//    ThorLogInfo out = new ThorLogInfo();
//    if (in.getProcessName() != null) out.setProcessName(in.getProcessName());
//    if (in.getClusterGroup() != null) out.setClusterGroup(in.getClusterGroup());
//    if (in.getLogDate() != null) out.setLogDate(in.getLogDate());
//    if (in.getNumberSlaves() != null) out.setNumberSlaves(in.getNumberSlaves());
//    return out;
//}
//
///**
// * Converts ECLQuery from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLQuery in
// * @return ECLQuery
// */
//private ECLQuery convertECLQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLQuery in)
//{
//    ECLQuery out = new ECLQuery();
//    if (in.getText() != null) out.setText(in.getText());
//    if (in.getCpp() != null) out.setCpp(in.getCpp());
//    if (in.getResTxt() != null) out.setResTxt(in.getResTxt());
//    if (in.getDll() != null) out.setDll(in.getDll());
//    if (in.getDll() != null) out.setThorLog(in.getThorLog());
//    if (in.getQueryMainDefinition() != null) out.setQueryMainDefinition(in.getQueryMainDefinition());
//    return out;
//}
//
///**
// * Converts ECLHelpFile from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLHelpFile in
// * @return ECLHelpFile
// */
//private ECLHelpFile convertECLHelpFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLHelpFile in)
//{
//    ECLHelpFile out = new ECLHelpFile();
//    if (in.getName() != null) out.setName(in.getName());
//    if (in.getType() != null) out.setType(in.getType());
//    if (in.getIPAddress() != null) out.setIPAddress(in.getIPAddress());
//    if (in.getDescription() != null) out.setDescription(in.getDescription());
//    if (in.getFileSize() != null) out.setFileSize(in.getFileSize());
//    if (in.getPID() != null) out.setPID(in.getPID());
//    // minActivityID and maxActivityId not supported in 1.56
//    return out;
//}
//
///**
// * Converts ECLException from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLException in
// * @return ECLException
// */
//private ECLException convertECLException(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLException in)
//{
//    ECLException out = new ECLException();
//    if (in.getSource() != null) out.setSource(in.getSource());
//    if (in.getSeverity() != null) out.setSeverity(in.getSeverity());
//    if (in.getCode() != null) out.setCode(in.getCode());
//    if (in.getMessage() != null) out.setMessage(in.getMessage());
//    if (in.getFileName() != null) out.setFileName(in.getFileName());
//    if (in.getLineNo() != null) out.setLineNo(in.getLineNo());
//    if (in.getColumn() != null) out.setColumn(in.getColumn());
//    return out;
//}
//
///**
// * Converts ECLGraph from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLGraph
// *            in
// * @return ECLGraph
// */
//private ECLGraph convertECLGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLGraph in)
//{
//    ECLGraph out = new ECLGraph();
//    if (in.getName() != null) out.setName(in.getName());
//    if (in.getLabel() != null) out.setLabel(in.getLabel());
//    if (in.getType() != null) out.setType(in.getType());
//    if (in.getRunning() != null) out.setRunning(in.getRunning());
//    if (in.getComplete() != null) out.setComplete(in.getComplete());
//    if (in.getFailed() != null) out.setFailed(in.getFailed());
//    if (in.getRunningId() != null) out.setRunningId(in.getRunningId());
//    if (in.getWhenStarted() != null) out.setWhenStarted(in.getWhenStarted());
//    if (in.getWhenFinished() != null) out.setWhenFinished(in.getWhenFinished());
//    return out;
//}
//
///**
// * Converts ECLSchemaItem from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLSchemaItem
// *            in
// * @return ECLSchemaItem
// */
//private ECLSchemaItem convertECLSchemaItem(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLSchemaItem in)
//{
//    ECLSchemaItem out = new ECLSchemaItem();
//    if (in.getColumnName() != null) out.setColumnName(in.getColumnName());
//    if (in.getColumnType() != null) out.setColumnType(in.getColumnType());
//    if (in.getColumnTypeCode() != null) out.setColumnTypeCode(in.getColumnTypeCode());
//    if (in.getIsConditional() != null) out.setIsConditional(in.getIsConditional());
//    return out;
//}
//
///**
// * Converts ECLResult from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLResult
// *            in
// * @return ECLResult
// */
//private ECLResult convertECLResult(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLResult in)
//{
//    ECLResult out = new ECLResult();
//    if (in.getName() != null) out.setName(in.getName());
//    if (in.getSequence() != null) out.setSequence(in.getSequence());
//    if (in.getValue() != null) out.setValue(in.getValue());
//    if (in.getLink() != null) out.setLink(in.getLink());
//    if (in.getFileName() != null) out.setFileName(in.getFileName());
//    if (in.getIsSupplied() != null) out.setIsSupplied(in.getIsSupplied());
//    if (in.getShowFileContent() != null) out.setShowFileContent(in.getShowFileContent());
//    if (in.getTotal() != null) out.setTotal(in.getTotal());
//    if (in.getXmlSchema() != null) out.setXmlSchema(in.getXmlSchema());
//    if (in.getECLSchemas() != null)
//    {
//        ECLSchemaItem[] teclschemaitems = new ECLSchemaItem[in.getECLSchemas().length];
//        for (int i = 0; i < in.getECLSchemas().length; i++)
//            teclschemaitems[i] = convertECLSchemaItem(in.getECLSchemas()[i]);
//        out.setECLSchemas(teclschemaitems);
//    }
//    return out;
//}
//
///**
// * Converts ECLSourceFile from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLSourceFile
// *            in
// * @return ECLSourceFile
// */
//private ECLSourceFile convertECLSourceFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLSourceFile in)
//{
//    ECLSourceFile out = new ECLSourceFile();
//    if (in.getFileCluster() != null) out.setFileCluster(in.getFileCluster());
//    if (in.getName() != null) out.setName(in.getName());
//    if (in.getIsSuperFile() != null) out.setIsSuperFile(in.getIsSuperFile());
//    if (in.getSubs() != null) out.setSubs(in.getSubs());
//    if (in.getCount() != null) out.setCount(in.getCount());
//    if (in.getECLSourceFiles() != null)
//    {
//        ECLSourceFile[] teclsourcefile = new ECLSourceFile[in.getECLSourceFiles().length];
//        for (int i = 0; i < in.getECLSourceFiles().length; i++)
//            teclsourcefile[i] = convertECLSourceFile(in.getECLSourceFiles()[i]);
//        out.setECLSourceFiles(teclsourcefile);
//    }
//    return out;
//}
//
///**
// * Converts ECLTimer from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLTimer
// *            in
// * @return ECLTimer
// */
//private ECLTimer convertECLTimer(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLTimer in)
//{
//    ECLTimer out = new ECLTimer();
//    if (in.getName() != null) out.setName(in.getName());
//    if (in.getValue() != null) out.setValue(in.getValue());
//    if (in.getCount() != null) out.setCount(in.getCount());
//    if (in.getGraphName() != null) out.setGraphName(in.getGraphName());
//    if (in.getSubGraphId() != null) out.setSubGraphId(in.getSubGraphId());
//    return out;
//}
//
///**
// * Converts DebugValue from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.DebugValue
// *            in
// * @return DebugValue
// */
//private DebugValue convertDebugValue(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.DebugValue in)
//{
//    DebugValue out = new DebugValue();
//    if (in.getName() != null) out.setName(in.getName());
//    if (in.getValue() != null) out.setValue(in.getValue());
//    return out;
//}
//
///**
// * Converts ApplicationValue from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue
// *            in
// * @return ApplicationValue
// */
//private ApplicationValue convertApplicationValue(
//        org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue in)
//{
//    ApplicationValue out = new ApplicationValue();
//    if (in.getApplication() != null) out.setApplication(in.getApplication());
//    if (in.getName() != null) out.setName(in.getName());
//    if (in.getValue() != null) out.setValue(in.getValue());
//    return out;
//}
//
///**
// * Converts ECLWorkflow from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkflow
// *            in
// * @return ECLWorkflow
// */
//private ECLWorkflow convertECLWorkflow(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkflow in)
//{
//    ECLWorkflow out = new ECLWorkflow();
//    if (in.getWFID() != null) out.setWFID(in.getWFID());
//    if (in.getEventName() != null) out.setEventName(in.getEventName());
//    if (in.getEventText() != null) out.setEventText(in.getEventText());
//    if (in.getCount() != null) out.setCount(in.getCount());
//    if (in.getCountRemaining() != null) out.setCountRemaining(in.getCountRemaining());
//    return out;
//}
//
///**
// * Converts ECLTimingData from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLTimingData
// *            in
// * @return ECLTimingData
// */
//private ECLTimingData convertECLTimingData(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLTimingData in)
//{
//    ECLTimingData out = new ECLTimingData();
//    if (in.getName() != null) out.setName(in.getName());
//    if (in.getGraphNum() != null) out.setGraphNum(in.getGraphNum());
//    if (in.getSubGraphNum() != null) out.setSubGraphNum(in.getSubGraphNum());
//    if (in.getGID() != null) out.setGID(in.getGID());
//    if (in.getMin() != null) out.setMin(in.getMin());
//    if (in.getMS() != null) out.setMS(in.getMS());
//    return out;
//}
//
///**
// * Converts ECLWorkunit from v1_56 to v1_58
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkunit
// *            in
// * @return ECLWorkunit
// */
//private ECLWorkunit convertECLWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkunit in)
//{
//    ECLWorkunit out = new ECLWorkunit();
//
//    if (in.getWuid() != null) out.setWuid(in.getWuid());
//    if (in.getOwner() != null) out.setOwner(in.getOwner());
//    if (in.getCluster() != null) out.setCluster(in.getCluster());
//    if (in.getRoxieCluster() != null) out.setRoxieCluster(in.getRoxieCluster());
//    if (in.getJobname() != null) out.setJobname(in.getJobname());
//    if (in.getQueue() != null) out.setQueue(in.getQueue());
//    if (in.getStateID() != null) out.setStateID(in.getStateID());
//    if (in.getState() != null) out.setState(in.getState());
//    if (in.getStateEx() != null) out.setStateEx(in.getStateEx());
//    if (in.getDescription() != null) out.setDescription(in.getDescription());
//    if (in.get_protected() != null) out.set_protected(in.get_protected());
//    if (in.getActive() != null) out.setActive(in.getActive());
//    if (in.getAction() != null) out.setAction(in.getAction());
//    if (in.getActionEx() != null) out.setActionEx(in.getActionEx());
//    if (in.getDateTimeScheduled() != null) out.setDateTimeScheduled(in.getDateTimeScheduled());
//    if (in.getPriorityClass() != null) out.setPriorityClass(in.getPriorityClass());
//    if (in.getPriorityLevel() != null) out.setPriorityLevel(in.getPriorityLevel());
//    if (in.getScope() != null) out.setScope(in.getScope());
//    if (in.getSnapshot() != null) out.setSnapshot(in.getSnapshot());
//    if (in.getResultLimit() != null) out.setResultLimit(in.getResultLimit());
//    if (in.getArchived() != null) out.setArchived(in.getArchived());
//    if (in.getIsPausing() != null) out.setIsPausing(in.getIsPausing());
//    if (in.getThorLCR() != null) out.setThorLCR(in.getThorLCR());
//    if (in.getEventSchedule() != null) out.setEventSchedule(in.getEventSchedule());
//    //RODRIGO
////    if (in.getHaveSubGraphTimings() != null) out.setHaveSubGraphTimings(in.getHaveSubGraphTimings());
//    if (in.getTotalClusterTime() != null) out.setTotalClusterTime(in.getTotalClusterTime());
//    if (in.getAllowedClusters() != null) out.setAllowedClusters(in.getAllowedClusters());
//    if (in.getErrorCount() != null) out.setErrorCount(in.getErrorCount());
//    if (in.getWarningCount() != null) out.setWarningCount(in.getWarningCount());
//    if (in.getInfoCount() != null) out.setInfoCount(in.getInfoCount());
//    if (in.getAlertCount() != null) out.setAlertCount(in.getAlertCount());
//    if (in.getGraphCount() != null) out.setGraphCount(in.getGraphCount());
//    if (in.getSourceFileCount() != null) out.setSourceFileCount(in.getSourceFileCount());
//    if (in.getResultCount() != null) out.setResultCount(in.getResultCount());
//    if (in.getVariableCount() != null) out.setVariableCount(in.getVariableCount());
//    if (in.getTimerCount() != null) out.setTimerCount(in.getTimerCount());
//    if (in.getHasDebugValue() != null) out.setHasDebugValue(in.getHasDebugValue());
//    if (in.getApplicationValueCount() != null) out.setApplicationValueCount(in.getApplicationValueCount());
//    if (in.getXmlParams() != null) out.setXmlParams(in.getXmlParams());
//    if (in.getAccessFlag() != null) out.setAccessFlag(in.getAccessFlag());
//    if (in.getClusterFlag() != null) out.setClusterFlag(in.getClusterFlag());
//    if (in.getHelpersDesc() != null) out.setHelpersDesc(in.getHelpersDesc());
//    if (in.getGraphsDesc() != null) out.setGraphsDesc(in.getGraphsDesc());
//    if (in.getSourceFilesDesc() != null) out.setSourceFilesDesc(in.getSourceFilesDesc());
//    if (in.getResultsDesc() != null) out.setResultsDesc(in.getResultsDesc());
//    if (in.getVariablesDesc() != null) out.setVariablesDesc(in.getVariablesDesc());
//    if (in.getTimersDesc() != null) out.setTimersDesc(in.getTimersDesc());
//    if (in.getDebugValuesDesc() != null) out.setDebugValuesDesc(in.getDebugValuesDesc());
//    if (in.getApplicationValuesDesc() != null) out.setApplicationValuesDesc(in.getApplicationValuesDesc());
//    if (in.getWorkflowsDesc() != null) out.setWorkflowsDesc(in.getWorkflowsDesc());
//    if (in.getHasArchiveQuery() != null) out.setHasArchiveQuery(in.getHasArchiveQuery());
//    if (in.getResourceURLs() != null) out.setResourceURLs(in.getResourceURLs());
//    if (in.getResultViewCount() != null) out.setResultViewCount(in.getResultViewCount());
//    if (in.getResourceURLCount() != null) out.setResourceURLCount(in.getResourceURLCount());
//    if (in.getDebugValueCount() != null) out.setDebugValueCount(in.getDebugValueCount());
//    if (in.getWorkflowCount() != null) out.setWorkflowCount(in.getWorkflowCount());
//    if (in.getQuery() != null) out.setQuery(convertECLQuery(in.getQuery()));
//
//    if (in.getThorLogList() != null)
//    {
//        ThorLogInfo[] tli = new ThorLogInfo[in.getThorLogList().length];
//        for (int i = 0; i < in.getThorLogList().length; i++)
//            tli[i] = convertThorLogInfo(in.getThorLogList()[i]);
//        out.setThorLogList(tli);
//    }
//    if (in.getHelpers() != null)
//    {
//        ECLHelpFile[] teclhf = new ECLHelpFile[in.getHelpers().length];
//        for (int i = 0; i < in.getHelpers().length; i++)
//            teclhf[i] = convertECLHelpFile(in.getHelpers()[i]);
//        out.setHelpers(teclhf);
//    }
//    if (in.getExceptions() != null)
//    {
//        ECLException[] te = new ECLException[in.getExceptions().length];
//        for (int i = 0; i < in.getExceptions().length; i++)
//            te[i] = convertECLException(in.getExceptions()[i]);
//        out.setExceptions(te);
//    }
//    if (in.getGraphs() != null)
//    {
//        ECLGraph[] tg = new ECLGraph[in.getGraphs().length];
//        for (int i = 0; i < in.getGraphs().length; i++)
//            tg[i] = convertECLGraph(in.getGraphs()[i]);
//        out.setGraphs(tg);
//    }
//
//    if (in.getSourceFiles() != null)
//    {
//        ECLSourceFile[] teclsf = new ECLSourceFile[in.getSourceFiles().length];
//        for (int i = 0; i < in.getSourceFiles().length; i++)
//            teclsf[i] = convertECLSourceFile(in.getSourceFiles()[i]);
//        out.setSourceFiles(teclsf);
//    }
//    if (in.getResults() != null)
//    {
//        ECLResult[] tresults = new ECLResult[in.getResults().length];
//        for (int i = 0; i < in.getResults().length; i++)
//            tresults[i] = convertECLResult(in.getResults()[i]);
//        out.setResults(tresults);
//    }
//    if (in.getVariables() != null)
//    {
//        ECLResult[] tvariables = new ECLResult[in.getVariables().length];
//        for (int i = 0; i < in.getVariables().length; i++)
//            tvariables[i] = convertECLResult(in.getVariables()[i]);
//        out.setVariables(tvariables);
//    }
//    if (in.getTimers() != null)
//    {
//        ECLTimer[] tecltimer = new ECLTimer[in.getTimers().length];
//        for (int i = 0; i < in.getTimers().length; i++)
//            tecltimer[i] = convertECLTimer(in.getTimers()[i]);
//        out.setTimers(tecltimer);
//    }
//    if (in.getDebugValues() != null)
//    {
//        DebugValue[] tdebugvalue = new DebugValue[in.getDebugValues().length];
//        for (int i = 0; i < in.getDebugValues().length; i++)
//            tdebugvalue[i] = convertDebugValue(in.getDebugValues()[i]);
//        out.setDebugValues(tdebugvalue);
//    }
//    if (in.getApplicationValues() != null)
//    {
//        ApplicationValue[] tapplicationvalues = new ApplicationValue[in.getApplicationValues().length];
//        for (int i = 0; i < in.getApplicationValues().length; i++)
//            tapplicationvalues[i] = convertApplicationValue(in.getApplicationValues()[i]);
//        out.setApplicationValues(tapplicationvalues);
//    }
//    if (in.getWorkflows() != null)
//    {
//        ECLWorkflow[] teclworkflows = new ECLWorkflow[in.getWorkflows().length];
//        for (int i = 0; i < in.getWorkflows().length; i++)
//            teclworkflows[i] = convertECLWorkflow(in.getWorkflows()[i]);
//        out.setWorkflows(teclworkflows);
//    }
//    if (in.getTimingData() != null)
//    {
//        ECLTimingData[] tecltimingdatas = new ECLTimingData[in.getTimingData().length];
//        for (int i = 0; i < in.getTimingData().length; i++)
//            tecltimingdatas[i] = convertECLTimingData(in.getTimingData()[i]);
//        out.setTimingData(tecltimingdatas);
//    }
//
//    return out;
//}
//
///**
// * Convert from latest wuquery response to 1.56 wuquery response
// *
// * @param org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryResponse
// *            in
// * @return WUQueryResponse
// */
//private WUQueryResponse convertWUQueryResponse(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryResponse in)
//{
//    WUQueryResponse out = new WUQueryResponse();
//
//    if (in.getType() != null) out.setType(in.getType());
//    if (in.getCluster() != null) out.setCluster(in.getCluster());
//    if (in.getRoxieCluster() != null) out.setRoxieCluster(in.getRoxieCluster());
//    if (in.getOwner() != null) out.setOwner(in.getOwner());
//    if (in.getState() != null) out.setState(in.getState());
//    if (in.getStartDate() != null) out.setStartDate(in.getStartDate());
//    if (in.getEndDate() != null) out.setEndDate(in.getEndDate());
//    if (in.getECL() != null) out.setECL(in.getECL());
//    if (in.getJobname() != null) out.setJobname(in.getJobname());
//    if (in.getLogicalFile() != null) out.setLogicalFile(in.getLogicalFile());
//    if (in.getLogicalFileSearchType() != null) out.setLogicalFileSearchType(in.getLogicalFileSearchType());
//    if (in.getCurrent() != null) out.setCurrent(in.getCurrent());
//    if (in.getNext() != null) out.setNext(in.getNext());
//    if (in.getCount() != null) out.setCount(in.getCount());
//    if (in.getPageSize() != null) out.setPageSize(in.getPageSize());
//    if (in.getPrevPage() != null) out.setPrevPage(in.getPrevPage());
//    if (in.getNextPage() != null) out.setNextPage(in.getNextPage());
//    if (in.getLastPage() != null) out.setLastPage(in.getLastPage());
//    if (in.getNumWUs() != null) out.setNumWUs(in.getNumWUs());
//    if (in.getFirst() != null) out.setFirst(in.getFirst());
//    if (in.getPageStartFrom() != null) out.setPageStartFrom(in.getPageStartFrom());
//    if (in.getPageEndAt() != null) out.setPageEndAt(in.getPageEndAt());
//    //RODRIGO
//    //if (in.getLastNDays() != null) out.setLastNDays(in.getLastNDays());
//    if (in.getSortby() != null) out.setSortby(in.getSortby());
//    if (in.getDescending() != null) out.setDescending(in.getDescending());
//    if (in.getBasicQuery() != null) out.setBasicQuery(in.getBasicQuery());
//    if (in.getFilters() != null) out.setFilters(in.getFilters());
//    if (in.getCacheHint() != null) out.setCacheHint(in.getCacheHint());
//    if (in.getExceptions() != null) out.setExceptions(convertArrayOfEspException(in.getExceptions()));
//    if (in.getWorkunits() != null)
//    {
//        ECLWorkunit[] tmpwu = new ECLWorkunit[in.getWorkunits().length];
//        for (int i = 0; i < in.getWorkunits().length; i++)
//            tmpwu[i] = convertECLWorkunit(in.getWorkunits()[i]);
//        out.setWorkunits(tmpwu);
//    }
//
//    return out;
//}
}

/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems®.

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
package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspStringArray;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefDirectoryWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefFileWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefMessageWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefNodeWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfuxref.DFUXRefUnusedFilesResponseWrapper;

/**
 * Facilitates XRef Logical File System actions on target HPCC instance.
 *
 * Actions include building XRef, listing lost/orphaned/unused files, and more.
 *
 */
public class HPCCWsDFUXRefClient extends BaseHPCCWsClient
{
    private static final Logger    log                = LogManager.getLogger(HPCCWsDFUXRefClient.class);

    public static final String     WSDFUXREFURI           = "/WsDFUXRef";
    private static int             DEFAULTSERVICEPORT = -1;
    private static String          WSDLURL            = null;
    private static final double    MIN_VER_SUPPORTED  = 1.02;

    public static double getMinVerSupported()
    {
        return MIN_VER_SUPPORTED;
    }

    public boolean isRuntimeVersionSupported()
    {
        return getTargetESPInterfaceVersion() >= MIN_VER_SUPPORTED;
    }

    /**
     * Load WSDLURL.
     */
    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new WsDFUXRefStub());
            DEFAULTSERVICEPORT = (new URL(WSDLURL)).getPort();
        }
        catch (AxisFault | MalformedURLException e)
        {
            log.error("Unable to establish original WSDL URL");
            log.error(e.getLocalizedMessage());
        }
    }

    /**
     * Gets the service URI.
     *
     * @return the service URI
     */
    public String getServiceURI()
    {
        return WSDFUXREFURI;
    }

    /**
     * Gets the service WSDLURL.
     *
     * @return the service WSDLURL
     */
    public static String getServiceWSDLURL()
    {
        if (WSDLURL == null)
        {
            loadWSDLURL();
        }

        return WSDLURL;
    }

    /**
     * Gets the service WSDL port.
     *
     * @return the service WSDL port
     */
    public static int getServiceWSDLPort()
    {
        if (WSDLURL == null)
        {
            loadWSDLURL();
        }

        return DEFAULTSERVICEPORT;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.BaseHPCCWsClient#getDefaultStub()
     */
    @Override
    public Stub getDefaultStub() throws AxisFault
    {
        return new WsDFUXRefStub();
    }

    /**
     * Gets the.
     *
     * @param connection
     *            the connection
     * @return the HPCC WSDFUXREF client
     */
    public static HPCCWsDFUXRefClient get(Connection connection)
    {
        return new HPCCWsDFUXRefClient(connection);
    }

    /**
     * Gets the.
     *
     * @param protocol
     *            the protocol
     * @param targetHost
     *            the target host
     * @param targetPort
     *            the target port
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @return the HPCC WSDFUXREF client
     */
    public static HPCCWsDFUXRefClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsDFUXRefClient(conn);
    }

    /**
     * Gets the.
     *
     * @param protocol
     *            the protocol
     * @param targetHost
     *            the target host
     * @param targetPort
     *            the target port
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @param timeout
     *            the timeout
     * @return the HPCC WSDFUXREF client
     */
    public static HPCCWsDFUXRefClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsDFUXRefClient(conn);
    }

    /**
     * Instantiates a new HPCC WSDFUXREF client.
     *
     * @param baseConnection
     *            the base connection
     */
    protected HPCCWsDFUXRefClient(Connection baseConnection)
    {
        initWsDFUXRefClientStub(baseConnection);
    }

    /**
     * Initializes the service's underlying stub Should only be used by constructors.
     *
     * @param conn
     *            -- All connection settings included
     */
    protected void initWsDFUXRefClientStub(Connection conn)
    {
        setActiveConnectionInfo(conn);
        try
        {
            stub = setStubOptions(new WsDFUXRefStub(conn.getBaseUrl() + WSDFUXREFURI), conn);
        }
        catch (Exception e)
        {
            stub = null;

            initErrMessage = "Could not initialize WsDFUXRefStub - Review all HPCC connection values";
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage += "\n" + e.getLocalizedMessage();
            }
        }

        if (stub != null && !isRuntimeVersionSupported())
        {
            stub = null;
            initErrMessage += "Attempting to connect to unsupported WsDFUXRef version: '" + getTargetESPInterfaceVersion() + "'; minimun supported: " + MIN_VER_SUPPORTED;
        }

        if (!initErrMessage.isEmpty())
            log.error(initErrMessage);

    }

    /**
     * @param processCluster
     * @param getFileDetails
     * @param checkPackageMaps
     * @return
     * @throws Exception
     */
    public DFUXRefUnusedFilesResponseWrapper unusedFiles(String processCluster, Boolean getFileDetails, Boolean checkPackageMaps) throws Exception
    {
        verifyStub();

        DFUXRefUnusedFilesRequest request = new DFUXRefUnusedFilesRequest();
        request.setProcessCluster(processCluster);
        if (checkPackageMaps != null)
            request.setCheckPackageMaps(checkPackageMaps);
        if (getFileDetails != null)
            request.setGetFileDetails(getFileDetails);

        DFUXRefUnusedFilesResponse resp = null;

        try
        {
            resp = ((WsDFUXRefStub) stub).dFUXRefUnusedFiles(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUXRefClient.unusedFiles(" + processCluster + ") encountered RemoteException.", e);
        }

        if (resp.getExceptions() != null)
        {
            ArrayOfEspException exceptions = resp.getExceptions();
            handleEspExceptions(new ArrayOfEspExceptionWrapper(exceptions), "Error fetching unusedFiles: '" + processCluster + "'");
        }

        return new DFUXRefUnusedFilesResponseWrapper(resp);
    }
    /**
     * @param cluster
     * @return
     * @throws Exception
     */
    public ArrayOfXRefFileWrapper orphanedFiles(String cluster) throws Exception
    {
        verifyStub();

        DFUXRefOrphanFilesQueryRequest request = new DFUXRefOrphanFilesQueryRequest();
        request.setCluster(cluster);

        DFUXRefOrphanFilesQueryResponse resp = null;

        try
        {
            resp = ((WsDFUXRefStub) stub).dFUXRefOrphanFiles(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUXRefClient.orphanedFiles(" + cluster + ") encountered RemoteException.", e);
        }

        return new ArrayOfXRefFileWrapper(resp.getDFUXRefOrphanFilesQueryResult());
    }

    /**
     * @param cluster
     * @return
     * @throws Exception
     */
    public ArrayOfXRefFileWrapper lostFiles(String cluster) throws Exception
    {
        verifyStub();

        DFUXRefLostFilesQueryRequest request = new DFUXRefLostFilesQueryRequest();
        request.setCluster(cluster);

        DFUXRefLostFilesQueryResponse resp = null;

        try
        {
            resp = ((WsDFUXRefStub) stub).dFUXRefLostFiles(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUXRefClient.lostFiles(" + cluster + ") encountered RemoteException.", e);
        }
        return new ArrayOfXRefFileWrapper(resp.getDFUXRefLostFilesQueryResult());
    }

    public ArrayOfXRefDirectoryWrapper directories(String cluster) throws Exception
    {
        verifyStub();

        DFUXRefDirectoriesQueryRequest request = new DFUXRefDirectoriesQueryRequest();
        request.setCluster(cluster);

        DFUXRefDirectoriesQueryResponse resp = null;

        try
        {
            resp = ((WsDFUXRefStub) stub).dFUXRefDirectories(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUXRefClient.directories(" + cluster + ") encountered RemoteException.", e);
        }


        return  new ArrayOfXRefDirectoryWrapper(resp.getDFUXRefDirectoriesQueryResult());
    }

    /**
     * Should provide either action or type
     * @param cluster
     * @param action "Attach", "Delete", "DeleteLogical"
     * @param type "Found", "Lost", "Orphan"
     * @param xrefFilesArray
     * @return
     * @throws Exception
     */
    public String action(String cluster, String action, String type, EspStringArray xrefFilesArray) throws Exception
    {
        verifyStub();

        DFUXRefArrayActionRequest request = new DFUXRefArrayActionRequest();
        request.setCluster(cluster);

        request.setAction(action);
        request.setType(type);
        request.setXRefFiles(xrefFilesArray);

        DFUXRefArrayActionResponse resp = null;

        try
        {
            resp = ((WsDFUXRefStub) stub).dFUXRefArrayAction(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUXRefClient.cleanDirectories(" + cluster + ") encountered RemoteException.", e);
        }

        return resp.getDFUXRefArrayActionResult();
    }

    /**
     * @param cluster
     * @return
     * @throws Exception
     */
    public void cleanDirectories(String cluster) throws Exception
    {
        verifyStub();

        DFUXRefCleanDirectoriesRequest request = new DFUXRefCleanDirectoriesRequest();
        request.setCluster(cluster);

        DFUXRefCleanDirectoriesResponse resp = null;

        try
        {
            resp = ((WsDFUXRefStub) stub).dFUXRefCleanDirectories(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUXRefClient.cleanDirectories(" + cluster + ") encountered RemoteException.", e);
        }

        if (resp.getExceptions() != null)
        {
            ArrayOfEspException exceptions = resp.getExceptions();
            handleEspExceptions(new ArrayOfEspExceptionWrapper(exceptions), "Error cleaning directories: '" + cluster + "'");
        }
    }

    /**
     * @return
     * @throws Exception
     */
    public String buildCancel() throws Exception
    {
        verifyStub();

        DFUXRefBuildCancelRequest request = new DFUXRefBuildCancelRequest();
        DFUXRefBuildCancelResponse resp = null;

        try
        {
            resp = ((WsDFUXRefStub) stub).dFUXRefBuildCancel(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUXRefClient.buildCancel() encountered RemoteException.", e);
        }

        return resp.getDFUXRefBuildCancelResult();
    }

    /**
     * @param cluster
     * @return
     * @throws Exception
     */
    public String build(String cluster) throws Exception
    {
        verifyStub();

        DFUXRefBuildRequest request = new DFUXRefBuildRequest();
        request.setCluster(cluster);

        DFUXRefBuildResponse resp = null;

        try
        {
            resp = ((WsDFUXRefStub) stub).dFUXRefBuild(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUXRefClient.build(" + cluster +")encountered RemoteException.", e);
        }

        return resp.getDFUXRefActionResult();
    }
    /**
     * @param cluster
     * @return
     * @throws Exception
     */
    public ArrayOfXRefFileWrapper foundFiles(String cluster) throws Exception
    {
        verifyStub();

        DFUXRefFoundFilesQueryRequest request = new DFUXRefFoundFilesQueryRequest();
        request.setCluster(cluster);

        DFUXRefFoundFilesQueryResponse resp = null;

        try
        {
            resp = ((WsDFUXRefStub) stub).dFUXRefFoundFiles(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUXRefClient.foundFiles(" + cluster +")encountered RemoteException.", e);
        }

        return new ArrayOfXRefFileWrapper(resp.getDFUXRefFoundFilesQueryResult());
    }

    /**
     * @param cluster
     * @return
     * @throws Exception
     */
    public ArrayOfXRefMessageWrapper messages(String cluster) throws Exception
    {
        verifyStub();

        DFUXRefMessagesQueryRequest request = new DFUXRefMessagesQueryRequest();
        request.setCluster(cluster);

        DFUXRefMessagesQueryResponse resp = null;

        try
        {
            resp = ((WsDFUXRefStub) stub).dFUXRefMessages(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUXRefClient.messages(" + cluster +") encountered RemoteException.", e);
        }

        return new ArrayOfXRefMessageWrapper(resp.getDFUXRefMessagesQueryResult());
    }

    /**
     * @return
     * @throws Exception
     */
    public ArrayOfXRefNodeWrapper list() throws Exception
    {
        verifyStub();

        DFUXRefListRequest request = new DFUXRefListRequest();

        DFUXRefListResponse resp = null;

        try
        {
            resp = ((WsDFUXRefStub) stub).dFUXRefList(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUXRefClient.list() encountered RemoteException.", e);
        }

        return new ArrayOfXRefNodeWrapper(resp.getDFUXRefListResult());
    }

    /**
     * Ping.
     *
     * @return true, if successful
     * @throws Exception
     *             the exception
     */
    public boolean ping() throws Exception
    {
        verifyStub();

        WsDFUXRefPingRequest request = new WsDFUXRefPingRequest();

        try
        {
            ((WsDFUXRefStub) stub).ping(request);
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
            return false;
        }

        return true;
    }
}

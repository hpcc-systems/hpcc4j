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
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildCancelRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildCancelResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefCleanDirectoriesRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefCleanDirectoriesResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefDirectoriesQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefDirectoriesQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefFoundFilesQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefFoundFilesQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefListRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefListResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefLostFilesQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefLostFilesQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefMessagesQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefMessagesQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefOrphanFilesQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefOrphanFilesQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.WsDFUXRefPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.WsDFUXRefStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.HpccContainerizedUnsupportedException;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefDirectoryWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefFileWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefMessageWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefNodeWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfuxref.DFUXRefUnusedFilesResponseWrapper;

import io.opentelemetry.instrumentation.annotations.SpanAttribute;
import io.opentelemetry.instrumentation.annotations.WithSpan;

/**
 * Facilitates XRef Logical File System actions on target HPCC instance.
 *
 * Actions include building XRef, listing lost/orphaned/unused files, and more.
 *
 * NOTE: Many WsDFUXRef methods are not supported on Containerized HPCC deployments.
 * The following methods are not supported in containerized HPCC:
 *  DFUXRefList: list all XRefNodes. Each Thor cluster or Roxie cluster in environment xml is an XRefNode. SuperFiles is an XRefNode.
 *  DFUXRefBuild: add an XRefNode to a job queue where XRef information will be generated for the XRefNode.
 *  DFUXRefLostFiles: list lost files in an XRefNode.
 *  DFUXRefFoundFiles: list found files in an XRefNode.
 *  DFUXRefOrphanFiles: list orphan files in an XRefNode.
 *  DFUXRefMessages: report messages ** in an XRefNode.
 *  DFUXRefDirectories: report directories in an XRefNode.
 *  DFUXRefArrayAction: take an action (attach, delete, etc.) on given XRef files.
 *  DFUXRefBuildCancel: dequeue all the jobs.
 *  DFUXRefCleanDirectories: remove empty directories in ** an XRefNode
 *  DFUXRefUnusedFiles: list unused files in a roxie XRefNode.
 */
 public class HPCCWsDFUXRefClient extends BaseHPCCWsClient
{
    private static final Logger    log                = LogManager.getLogger(HPCCWsDFUXRefClient.class);

    /** Constant <code>WSDFUXREFURI="/WsDFUXRef"</code> */
    public static final String     WSDFUXREFURI           = "/WsDFUXRef";
    private static int             DEFAULTSERVICEPORT = -1;
    private static String          WSDLURL            = null;
    private static final double    MIN_VER_SUPPORTED  = 1.02;

    /**
     * <p>getMinVerSupported.</p>
     *
     * @return a double.
     */
    public static double getMinVerSupported()
    {
        return MIN_VER_SUPPORTED;
    }

    /**
     * <p>isRuntimeVersionSupported.</p>
     *
     * @return a boolean.
     */
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
    /** {@inheritDoc} */
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
        initBaseWsClient(conn, false); //No need to preemptively fetch HPCC build version, Containerized mode

        try
        {
            stub = setStubOptions(new WsDFUXRefStub(conn.getBaseUrl() + WSDFUXREFURI), conn);
        }
        catch (AxisFault e)
        {
            stub = null;
            initErrMessage += "\nCould not initialize WsDFUXRefStub - Review all HPCC connection values";
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
     * <p>unusedFiles.</p>
     *
     * @param processCluster a {@link java.lang.String} object.
     * @param getFileDetails a {@link java.lang.Boolean} object.
     * @param checkPackageMaps a {@link java.lang.Boolean} object.
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link org.hpccsystems.ws.client.wrappers.gen.wsdfuxref.DFUXRefUnusedFilesResponseWrapper} object.
     */
    public DFUXRefUnusedFilesResponseWrapper unusedFiles(String processCluster, Boolean getFileDetails, Boolean checkPackageMaps) throws Exception
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("HPCCWsDFUXRefClient.unusedFiles not supported in CONTAINERIZED mode");

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
     * <p>orphanedFiles.</p>
     *
     * @param cluster a {@link java.lang.String} object.
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link org.hpccsystems.ws.client.wrappers.ArrayOfXRefFileWrapper} object.
     */
    public ArrayOfXRefFileWrapper orphanedFiles(String cluster) throws Exception
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("HPCCWsDFUXRefClient.foundFiles not supported in CONTAINERIZED mode");

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
     * <p>lostFiles.</p>
     *
     * @param cluster a {@link java.lang.String} object.
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link org.hpccsystems.ws.client.wrappers.ArrayOfXRefFileWrapper} object.
     */
    public ArrayOfXRefFileWrapper lostFiles(String cluster) throws Exception
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("HPCCWsDFUXRefClient.lostFiles not supported in CONTAINERIZED mode");

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

    /**
     * <p>directories.</p>
     *
     * @param cluster a {@link java.lang.String} object.
     * @return a {@link org.hpccsystems.ws.client.wrappers.ArrayOfXRefDirectoryWrapper} object.
     * @throws java.lang.Exception if any.
     */
    public ArrayOfXRefDirectoryWrapper directories(String cluster) throws Exception
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("HPCCWsDFUXRefClient.directories not supported in CONTAINERIZED mode");

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
     *
     * @param cluster a {@link java.lang.String} object.
     * @param action "Attach", "Delete", "DeleteLogical"
     * @param type "Found", "Lost", "Orphan"
     * @param xrefFilesArray a {@link org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray} object.
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link java.lang.String} object.
     */
    @WithSpan
    public String action(@SpanAttribute String cluster,@SpanAttribute  String action,@SpanAttribute  String type, EspStringArray xrefFilesArray) throws Exception
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("HPCCWsDFUXRefClient.action not supported in CONTAINERIZED mode");

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
     * <p>cleanDirectories.</p>
     *
     * @param cluster a {@link java.lang.String} object.
     * @throws Exception a {@link java.lang.Exception} object.
     */
    @WithSpan
    public void cleanDirectories(String cluster) throws Exception
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("HPCCWsDFUXRefClient.action not supported in CONTAINERIZED mode");

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
     * <p>buildCancel.</p>
     *
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link java.lang.String} object.
     */
    @WithSpan
    public String buildCancel() throws Exception
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("HPCCWsDFUXRefClient.buildCancel not supported in CONTAINERIZED mode");

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
     * <p>build.</p>
     *
     * @param cluster a {@link java.lang.String} object.
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link java.lang.String} object.
     */
    @WithSpan
    public String build(@SpanAttribute String cluster) throws Exception
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("HPCCWsDFUXRefClient.build not supported in CONTAINERIZED mode");

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
     * <p>foundFiles.</p>
     *
     * @param cluster a {@link java.lang.String} object.
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link org.hpccsystems.ws.client.wrappers.ArrayOfXRefFileWrapper} object.
     */
    @WithSpan
    public ArrayOfXRefFileWrapper foundFiles(@SpanAttribute String cluster) throws Exception
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("HPCCWsDFUXRefClient.foundFiles not supported in CONTAINERIZED mode");

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
     * <p>messages.</p>
     *
     * @param cluster a {@link java.lang.String} object.
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link org.hpccsystems.ws.client.wrappers.ArrayOfXRefMessageWrapper} object.
     */
    @WithSpan
    public ArrayOfXRefMessageWrapper messages(@SpanAttribute String cluster) throws Exception
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("HPCCWsDFUXRefClient.messages not supported in CONTAINERIZED mode");

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
     * <p>list.</p>
     *
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link org.hpccsystems.ws.client.wrappers.ArrayOfXRefNodeWrapper} object.
     */
    @WithSpan
    public ArrayOfXRefNodeWrapper list() throws Exception
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("HPCCWsDFUXRefClient.buildCancel not supported in CONTAINERIZED mode");

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
     * @throws Exception a {@link java.lang.Exception} object.
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

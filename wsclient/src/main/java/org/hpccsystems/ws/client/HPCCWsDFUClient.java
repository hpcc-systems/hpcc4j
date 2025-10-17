package org.hpccsystems.ws.client;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.Stub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddtoSuperfileResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUActionInfo;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFULogicalFile;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUActionInfo;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActions;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessV2Request;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateV2Request;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePublishRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePublishResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetDataColumnsRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetDataColumnsResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUInfoRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUInfoResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFULogicalFile;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.WsDfuPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.WsDfuStub;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EclRecordWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.AddtoSuperfileRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.AddtoSuperfileResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.DFUQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.DFUSearchDataRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.DFUSearchDataResponseWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUCreateFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileAccessInfoWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUInfoWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFULogicalFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUResultWrapper;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import io.opentelemetry.instrumentation.annotations.SpanAttribute;
import io.opentelemetry.instrumentation.annotations.WithSpan;

/**
 * Facilitates Logical File System actions on target HPCC Systems instance.
 *
 * Supported actions include fetching file information, file data, file listings,
 * creating, publishing and deleting files, and more.
 */
public class HPCCWsDFUClient extends BaseHPCCWsClient
{
    /*
     * Input values for DFUQuery FileType
     */
    public enum DFUQueryFileType
    {
        DFUQFT_SUPER_FILES_ONLY,
        DFUQFT_LOGICAL_FILES_ONLY,
        DFUQFT_NOT_IN_SUPERFILES;

        public String getText()
        {
            switch (this)
            {
            case DFUQFT_SUPER_FILES_ONLY:
                return "Superfiles Only";
            case DFUQFT_LOGICAL_FILES_ONLY:
                return "Logical Files Only";
            case DFUQFT_NOT_IN_SUPERFILES:
                return "Not in Superfiles";
            default:
                return "";
            }
        }
    }
    private static final Logger    log                = LogManager.getLogger(HPCCWsDFUClient.class);

    /** Constant <code>WSDFUURI="/WsDFU/"</code> */
    public static final String     WSDFUURI           = "/WsDFU/";
    /** Constant <code>ROW_ELEMENT="Row"</code> */
    public static final String     ROW_ELEMENT        = "Row";
    /** Constant <code>DATASET_ELEMENT="Dataset"</code> */
    public static final String     DATASET_ELEMENT    = "Dataset";

    private static int             DEFAULTSERVICEPORT = -1;
    private static String          WSDLURL            = null;

    /**
     * Load WSDLURL.
     */
    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new WsDfuStub());
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
        return WSDFUURI;
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
        return new WsDfuStub();
    }

    /**
     * Gets the.
     *
     * @param connection
     *            the connection
     * @return the HPCC ws DFU client
     */
    public static HPCCWsDFUClient get(Connection connection)
    {
        return new HPCCWsDFUClient(connection);
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
     * @return the HPCC ws DFU client
     */
    public static HPCCWsDFUClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsDFUClient(conn);
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
     * @return the HPCC ws DFU client
     */
    public static HPCCWsDFUClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsDFUClient(conn);
    }

    /**
     * Instantiates a new HPCC ws DFU client.
     *
     * @param baseConnection
     *            the base connection
     */
    protected HPCCWsDFUClient(Connection baseConnection)
    {
        initWsDFUClientStub(baseConnection);
    }

    /**
     * Initializes the service's underlying stub Should only be used by constructors.
     *
     * @param conn
     *            -- All connection settings included
     */
    protected void initWsDFUClientStub(Connection conn)
    {
        initBaseWsClient(conn, true); //Preemptively fetch HPCC build version, Containerized mode

        try
        {
            stub = setStubOptions(new WsDfuStub(conn.getBaseUrl() + WSDFUURI), conn);
        }
        catch (AxisFault e)
        {
            String connectionInfo = getConnectionInfo(conn);
            initErrMessage += "\nCould not initialize HPCCWsDFUStub - Review all HPCC connection values " + connectionInfo;
        }

        if (!initErrMessage.isEmpty())
            log.error(initErrMessage);
    }

    /**
     * Gets the file info.
     *
     * @param logicalname
     *            - logical file to get file info for, can start with '~' or not
     * @param clustername
     *            - Optional. If specified, the cluster on which to search for the file
     * @return a DFUInfoResponse object containing the file info
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public DFUInfoWrapper getFileInfo(String logicalname, String clustername) throws Exception, ArrayOfEspExceptionWrapper
    {
        return getFileInfo(logicalname, clustername, false, false);
    }

    /**
     * Gets the file info.
     *
     * @param logicalname
     *            logical file name, can start with ~
     * @param clustername
     *            optional, if specified the cluster name used in the search
     * @param jsonTypeInfo
     *            want record structure information returned as JSON
     * @param binTypeInfo
     *            want record structure information returned in binary format
     * @return the file info
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public DFUInfoWrapper getFileInfo(String logicalname, String clustername, boolean jsonTypeInfo, boolean binTypeInfo)
            throws Exception, ArrayOfEspExceptionWrapper
    {

        verifyStub(); // Throws exception if stub failed

        DFUInfoRequest request = new DFUInfoRequest();

        request.setName(logicalname);
        request.setIncludeBinTypeInfo(binTypeInfo);
        request.setIncludeJsonTypeInfo(jsonTypeInfo);

        if (clustername != null)
        {
            request.setCluster(clustername);
        }

        DFUInfoResponse response = null;

        try
        {
            response = ((WsDfuStub) stub).dFUInfo(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.getFileInfo(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform getFileInfo");
        }

        if (response.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not ListFiles");

        return new DFUInfoWrapper(response);
    }

    /**
     * Gets the file data.
     *
     * @param logicalname
     *            - logical file to retrieve data for
     * @param beginrow
     *            - beginning row to retrieve data from
     * @param numrows
     *            - number of rows of data to retrieve
     * @param clustername
     *            - Optional. If specified, the cluster on which to find the logical file.
     * @return an XML Element object holding the '&lt;Row&gt;' elements containing data.
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public NodeList getFileData(String logicalname, Long beginrow, Integer numrows, String clustername) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        DFUBrowseDataRequest request = new DFUBrowseDataRequest();

        request.setLogicalName(logicalname);
        if (clustername != null)
        {
            request.setCluster(clustername);
        }
        if (beginrow == null)
        {
            beginrow = (long) 0;
        }
        if (numrows == null)
        {
            numrows = 1;
        }

        request.setStart(beginrow);
        request.setCount(numrows);

        DFUBrowseDataResponse response = null;

        try
        {
            response = ((WsDfuStub) stub).dFUBrowseData(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.getFileData(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform getFileData");
        }

        if (response.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not getFileData");

        String xmlresult = response.getResult();
        if (!xmlresult.contains("<" + DATASET_ELEMENT)) return null;

        xmlresult = xmlresult.substring(xmlresult.indexOf("<" + DATASET_ELEMENT));
        try
        {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document dom = db.parse(new ByteArrayInputStream(xmlresult.getBytes()));
            NodeList ds = dom.getDocumentElement().getChildNodes();
            if (ds != null && ds.getLength() > 0)
            {
                return ds;
            }
        }
        catch (Exception e)
        {
            return null;
        }
        return null;
    }

    /**
     * Gets the files.
     *
     * @param scope
     *            - file scope/directory to return files for
     * @return an array of DFULogicalFile objects
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<DFULogicalFileWrapper> getFiles(String scope) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        List<DFULogicalFileWrapper> result = new ArrayList<DFULogicalFileWrapper>();
        DFUFileViewRequest request = new DFUFileViewRequest();

        request.setScope(scope);

        DFUFileViewResponse resp = null;

        try
        {
            resp = ((WsDfuStub) stub).dFUFileView(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.getFiles(" + scope + ") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform getFiles");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not getFiles");

        ArrayOfDFULogicalFile filesarray = resp.getDFULogicalFiles();

        if (filesarray != null)
        {
            DFULogicalFile[] files = filesarray.getDFULogicalFile();
            result = new ArrayList<DFULogicalFileWrapper>();
            for (int i = 0; i < files.length; i++)
            {
                result.add(new DFULogicalFileWrapper(files[i]));
            }
        }
        return result;
    }

    /**
     * Check superfile layouts.
     *
     * @param subfiles
     *            the subfiles
     * @param cluster
     *            the cluster
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    private void checkSuperfileLayouts(String[] subfiles, String cluster) throws Exception, ArrayOfEspExceptionWrapper
    {
        String eclrecord = null;
        String basefile = null;
        if (subfiles == null)
        {
            return;
        }
        for (int i = 0; i < subfiles.length; i++)
        {
            DFUInfoWrapper details = this.getFileInfo(subfiles[i], cluster);
            if (details == null || details.getFileDetail() == null)
            {
                continue;
            }
            String thisecl = details.getFileDetail().getEcl() == null ? "" : details.getFileDetail().getEcl();
            if (eclrecord == null)
            {
                basefile = subfiles[i];
                eclrecord = thisecl;
            }
            if (!thisecl.equals(eclrecord))
            {
                throw new Exception(basefile + " and " + subfiles[i] + " have different ecl layouts in the same superfile");
            }
        }
    }

    /**
     * Create super file
     *
     * @param superfilename super file name
     * @param subfiles sub files
     * @return Add to super file request object
     * @throws java.lang.Exception general exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper array of esp exception wrapper
     */
    public AddtoSuperfileResponseWrapper createSuperfile(String superfilename, String[] subfiles) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        AddtoSuperfileRequestWrapper request = new AddtoSuperfileRequestWrapper();

        request.setSuperfile(superfilename);
        request.setExistingFile(false);

        //wsdfu > 1.15
        String comadelimitedsubfiles = "";
        for (int i = 0; i < subfiles.length; i++)
        {
            if (i > 0)
                comadelimitedsubfiles += ", ";

            comadelimitedsubfiles += subfiles[i];
        }
        if (!comadelimitedsubfiles.isEmpty())
            request.setSubfiles(comadelimitedsubfiles);

        //wsdfu pre 1.15
        if ( subfiles != null && subfiles.length > 0)
        {
            request.setNames(Arrays.asList(subfiles));
        }

        return addToSuperFile(request);
    }

    /**
     * <p>addToSuperFile.</p>
     *
     * @param request - User provided request wrapper
     * @return add to super file response object
     * @throws java.lang.Exception general exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper array of esp exception wrapper
     */
    @WithSpan
    public AddtoSuperfileResponseWrapper addToSuperFile(AddtoSuperfileRequestWrapper request) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (request == null)
            throw new Exception("HPCCWsDFUClient.createSuperfile: request cannot be null");

        verifyStub(); // Throws exception if stub failed

        AddtoSuperfileResponse resp = null;

        try
        {
            resp = ((WsDfuStub) stub).addtoSuperfile(request.getRaw());
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.createSuperfile(" + request.getSuperfile() + ", subfiles) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform createSuperfile");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not perform createSuperfile");

        return new AddtoSuperfileResponseWrapper(resp);
    }

    /**
     * Gets the super file subfiles.
     *
     * @param filename
     *            the filename
     * @return the super file subfiles
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public String[] getSuperFileSubfiles(String filename) throws Exception, ArrayOfEspExceptionWrapper
    {
        SuperfileListRequest request = new SuperfileListRequest();
        request.setSuperfile(filename);

        SuperfileListResponse resp = null;

        try
        {
            resp = ((WsDfuStub) stub).superfileList(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.getSuperFile(" + filename + ") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not get getSuperFileList");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not get superfilelist");

        String[] result = new String[] { "" };

        EspStringArray subfilesarray = resp.getSubfiles();
        if (subfilesarray != null)
        {
            result = subfilesarray.getItem();
        }
        return result;
    }

    /**
     * Use this function to retrieve file metadata such as column information, for superfiles the metadata from the
     * first subfile will be returned.
     *
     * @param logicalname
     *            - Logical filename.
     * @param clustername
     *            - Optional - The cluster the logical filename is associated with.
     * @return ArrayList of DFUDataColumnInfo
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<DFUDataColumnWrapper> getFileMetaData(String logicalname, String clustername) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        List<DFUDataColumnWrapper> cols = new ArrayList<DFUDataColumnWrapper>();
        String eclrecord = null;
        // getFileMetadata fails for superfiles; use first subfile to retrieve record structure if this is the case
        // also retrieve ecl to extract extra information (xpath, maxlength) not in getFileMetadata
        try
        {
            DFUInfoWrapper details = this.getFileInfo(logicalname, clustername);
            if (details != null && details.getFileDetail() != null)
            {
                eclrecord = details.getFileDetail().getEcl();
                if (details.getFileDetail().getIsSuperfile())
                {
                    String[] subfiles = null;
                    try
                    {
                        subfiles = getSuperFileSubfiles(logicalname);
                    }
                    catch (Exception e)
                    {
                        log.info("Failure while verifying superfile list for '" + logicalname + "'");
                    }

                    // this throws an exception if different layouts exist in a superfile;
                    checkSuperfileLayouts(subfiles, clustername);

                    if (subfiles != null && subfiles.length != 0)
                    {
                        logicalname = subfiles[0];
                    }
                    else
                    {
                        throw new Exception(logicalname + " is a superfile with no subfiles, cannot determine file structure");
                    }
                }
            }
        }
        catch (Exception e)
        {
            String msg = "Error calling DFUInfo for " + logicalname + ":" + e.getMessage();
            log.error(msg);
            throw new Exception(msg, e);
        }

        DFUGetFileMetaDataRequest request = new DFUGetFileMetaDataRequest();

        request.setLogicalFileName(logicalname);

        if (clustername != null)
        {
            request.setClusterName(clustername);
        }

        DFUGetFileMetaDataResponse resp = null;

        try
        {
            resp = ((WsDfuStub) stub).dFUGetFileMetaData(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.getFileMetaDataInfo(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform getFileMetaDataInfo");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not getFileMetaDataInfo");

        if (resp == null || resp.getDataColumns() == null)
        {
            return cols;
        }

        DFUDataColumn[] datacolumns = resp.getDataColumns().getDFUDataColumn();

        for (int i = 0; i < datacolumns.length; i++)
        {
            cols.add(new DFUDataColumnWrapper(datacolumns[i]));
        }

        // attempt to add additional info in from ecl record
        try
        {
            if (eclrecord != null && !eclrecord.isEmpty())
            {
                EclRecordWrapper recinfo = DFUFileDetailWrapper.getRecordEcl(eclrecord);
                if (recinfo.getParseErrors().size() > 0)
                {
                    throw new Exception(String.join("\n", recinfo.getParseErrors()));
                }
                if (recinfo.getRecordsets().size() > 0 && recinfo.getRecordsets().containsKey(EclRecordWrapper.UNNAMED)
                        && recinfo.getRecordsets().get(EclRecordWrapper.UNNAMED).getChildColumns().size() == cols.size())
                {
                    for (int i = 0; i < cols.size(); i++)
                    {
                        DFUDataColumnWrapper base = cols.get(i);
                        DFUDataColumnWrapper extra = recinfo.getRecordsets().get(EclRecordWrapper.UNNAMED).getChildColumns().get(i);
                        if (base.getColumnLabel().equals(extra.getColumnLabel()))
                        {
                            base.setAnnotations(extra.getAnnotations());
                            base.setBlob(extra.isBlob());
                            base.setMaxlength(extra.getMaxlength());
                            base.setMaxcount(extra.getMaxcount());
                            base.setMaxSize(extra.getMaxSize());
                            base.setXmlDefaultVal(extra.getXmlDefaultVal());
                            base.setXpath(extra.getXpath());
                        }
                    }
                }
            }
        }
        catch (Exception e)
        {
            log.error("Could not parse ecl for " + logicalname + ", returning base metadata. Ecl:" + eclrecord);
        }

        return cols;
    }

    /**
     * Deprecated, use getFileMetaDataInfo() Use this function to retrieve file metadata such as column information.
     *
     * @param logicalname
     *            - Logical filename.
     * @param clustername
     *            - Optional - The cluster the logical filename is associated with.
     * @return Array of DFUDataColumns
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    // @Deprecated
    /* public DFUDataColumn[] getFileMetaData(String logicalname, String clustername) throws Exception {} */

    /**
     * <p>getFileDataColumns.</p>
     *
     * @param logicalname
     *            - logical filename to retrieve the dfu data columns for. Currently this method/service call functions
     *            for THOR files but will return nothing for CSV/XML/FLAT data files
     * @param clustername
     *            - optional. The cluster the logical filename is associated with.
     * @return ArrayList of DFUDataColumns
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<DFUDataColumnWrapper> getFileDataColumns(String logicalname, String clustername) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        DFUGetDataColumnsRequest request = new DFUGetDataColumnsRequest();

        request.setOpenLogicalName(logicalname);
        if (clustername != null) request.setCluster(clustername);

        DFUGetDataColumnsResponse resp = null;

        try
        {
            resp = ((WsDfuStub) stub).dFUGetDataColumns(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.getFileDataColumns(" + logicalname + "," + clustername + ") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform getFileDataColumns");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not perform getFileDataColumns");

        List<DFUDataColumnWrapper> cols = new ArrayList<DFUDataColumnWrapper>();

        // one of the few times reflection is more useful then it is confusing
        for (Method m : resp.getClass().getMethods())
        {
            if (m.getName().startsWith("getDFUDataKeyedColumns") && m.getParameterTypes().length == 0)
            {
                final Object r = m.invoke(resp);
                if (r != null)
                {
                    DFUDataColumn[] thesecols = (DFUDataColumn[]) r;
                    for (DFUDataColumn col : Arrays.asList(thesecols))
                    {
                        cols.add(new DFUDataColumnWrapper(col));
                    }
                }
            }
            if (m.getName().startsWith("getDFUDataNonKeyedColumns") && m.getParameterTypes().length == 0)
            {
                final Object r = m.invoke(resp);
                if (r != null)
                {
                    DFUDataColumn[] thesecols = (DFUDataColumn[]) r;
                    for (DFUDataColumn col : Arrays.asList(thesecols))
                    {
                        cols.add(new DFUDataColumnWrapper(col));
                    }
                }
            }
        }

        return cols;
    }

    /**
     * This method retrieves a list of columns for a THOR or CSV dataset. -if THOR, this is a straightforward service
     * call to get the columns. -if CSV, depending on whether or not the CSV was sprayed or output by thor, it may or
     * may not - have a record definition associated with it. If it doesn't, the number of fields in the CSV - is
     * calculated by retrieving the first line and splitting it on the separator, and returning - a list of string
     * Field1, Field2, etc. fields (that match the standard CSV field naming conventions.)
     *
     * @param datasetname
     *            - the name of the dataset to get dataset fields for. Can begin with '~' or not.
     * @param clusterName
     *            - optional. If given, the name of the cluster associated with the dataset.
     * @param fieldSeparator
     *            - optional. if given, and if the file being retrieved is a csv file, and if no field definitions exist
     *            for that csv,. this separator will be used rather than the separator defined during spraying when
     *            splitting up the first line of the file to define the number of fields
     * @return an ArrayList of DFUDataColumns containing the name and field type.
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public EclRecordWrapper getDatasetFields(String datasetname, String clusterName, String fieldSeparator)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        DFUFileDetailWrapper info = getFileDetails(datasetname, clusterName);
        if (fieldSeparator != null)
        {
            info.setCsvSeparate(fieldSeparator);
        }
        return info.deduceFields();
    }

    /**
     * Returns the first row of data for a dataset.
     *
     * @param datasetname
     *            - logical filename, with or without '~' at the beginning
     * @param clustername
     *            - optional. name of the cluster the file's associated with
     * @return a String of data representing the first row in the file.
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public String getFirstRow(String datasetname, String clustername) throws Exception, ArrayOfEspExceptionWrapper
    {
        NodeList rowdata = getFileData(datasetname, (long) 0, 1, clustername);
        if (rowdata != null && rowdata.getLength() > 0)
        {
            if (rowdata.item(0).hasChildNodes())
            {
                return rowdata.item(0).getFirstChild().getTextContent();
            }
            else
            {
                return rowdata.item(0).getTextContent();
            }
        }
        return null;
    }

    /**
     * Get array of logical files on target HPCC system based on input parameters.
     *
     * @param filename
     *            the filename
     * @param cluster
     *            --- NO LONGER USED ---
     * @param firstN
     *            the first N
     * @param pageStartFrom
     *            the page start from
     * @param pageSize
     *            the page size
     * @return the logical files
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<DFULogicalFileWrapper> getLogicalFiles(String filename, String cluster, int firstN, int pageStartFrom, int pageSize)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        DFUQueryRequest request = new DFUQueryRequest();

        if (filename != null) request.setLogicalName(filename);

        request.setFirstN(firstN);
        request.setPageStartFrom(pageStartFrom);
        request.setPageSize(pageSize);

        DFUQueryResponse resp = null;

        try
        {
            resp = ((WsDfuStub) stub).dFUQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.getLogicalFiles(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform getLogicalFiles");
        }

        List<DFULogicalFileWrapper> logicalfiles = new ArrayList<DFULogicalFileWrapper>();

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not getLogicalFiles");

        ArrayOfDFULogicalFile logicalfilesarray = resp.getDFULogicalFiles();
        if (logicalfilesarray != null)
        {
            DFULogicalFile[] dfulogicalfilesarray = logicalfilesarray.getDFULogicalFile();

            for (int i = 0; i < dfulogicalfilesarray.length; i++)
            {
                logicalfiles.add(new DFULogicalFileWrapper(dfulogicalfilesarray[i]));
            }
        }

        return logicalfiles;
    }


    /**
     * Return wrapped response from WsDFU DFUSearchData method requests.
     *
     * @throws Exception a {@link java.lang.Exception} object.
     * @throws ArrayOfEspExceptionWrapper a {@link org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper} object.
     * @param req a {@link org.hpccsystems.ws.client.wrappers.gen.wsdfu.DFUSearchDataRequestWrapper} object.
     * @return a {@link org.hpccsystems.ws.client.wrappers.gen.wsdfu.DFUSearchDataResponseWrapper} object.
     */
    public DFUSearchDataResponseWrapper getDFUData(DFUSearchDataRequestWrapper req) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        if (req == null)
            throw new Exception("DFUSearchDataRequesWrapper cannot be null!");

        DFUSearchDataResponse resp = null;

        try
        {
            resp = ((WsDfuStub) stub).dFUSearchData(req.getRaw());
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.getDFUData(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform getDFUData");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not getDFUData");

        return new DFUSearchDataResponseWrapper(resp);
    }

    /**
     * Deprecated - use DFUSearchDataResponseWrapper getDFUData(DFUSearchDataRequestWrapper req) instead
     * Return raw response from WsDFU DFUSearchData method requests.
     *
     * @param openLogicalName
     *            the open logical name
     * @param cluster
     *            the cluster
     * @param roxieSelections
     *            the roxie selections
     * @param chooseFile
     *            the choose file
     * @param count
     *            the count
     * @param schemaOnly
     *            the schema only
     * @param startIndex
     *            the start index
     * @return the DFU data
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @Deprecated
    public DFUSearchDataResponse getDFUData(String openLogicalName, String cluster, boolean roxieSelections, int chooseFile, int count,
            boolean schemaOnly, long startIndex) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        DFUSearchDataRequest request = new DFUSearchDataRequest();

        request.setOpenLogicalName(openLogicalName);
        request.setCluster(cluster);
        request.setRoxieSelections(roxieSelections);
        request.setChooseFile(chooseFile);
        request.setCount(count);
        request.setSchemaOnly(schemaOnly);
        request.setStartIndex(startIndex);

        DFUSearchDataResponse resp = null;

        try
        {
            resp = ((WsDfuStub) stub).dFUSearchData(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.getDFUData(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform getDFUData");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not getDFUData");

        return resp;
    }

    /**
     * Delete super file subfiles.
     *
     * @param superfile
     *            the superfile
     * @param subfiles
     *            the subfiles
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public void deleteSuperFileSubfiles(String superfile, List<String> subfiles) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        SuperfileActionRequest request = new SuperfileActionRequest();

        request.setAction("remove");
        request.setSuperfile(superfile);
        EspStringArray espsubfiles = new EspStringArray();
        for (String subfile : subfiles)
        {
            espsubfiles.addItem(subfile);
        }
        request.setSubfiles(espsubfiles);
        SuperfileActionResponse resp = null;
        try
        {
            resp = ((WsDfuStub) stub).superfileAction(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.deleteSuperFileSubfiles(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform deleteSuperFileSubfiles");
        }

        if (resp != null && resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not deleteSuperFileSubfiles");

        return;

    }

    /**
     * Delete files.
     *
     * @param files
     *            - list of filenames to delete - can use filename@cluster notation
     * @param cluster
     *            - name of cluster to delete from (will delete from all clusters if null)
     *            If provided, it is post-pended to files
     * @return list of results of file deletions
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<DFUResultWrapper> deleteFiles(Set<String> files, String cluster) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        DFUArrayActionRequest request = new DFUArrayActionRequest();

        request.setType(DFUArrayActions.Factory.fromValue("Delete"));
        EspStringArray logicalfilesarray = new EspStringArray();
        String[] filesarray = files.toArray(new String[files.size()]);

        if (cluster != null && !cluster.isEmpty())
        {
            for (int i = 0; i < filesarray.length; i++)
            {
                String fullfile = filesarray[i];
                String[] split = fullfile.split("::");
                String file = split[split.length - 1];

                int atIndex = file.indexOf('@');
                if (atIndex >= 0 && atIndex < file.length())
                    throw new Exception("Do not provide filename@cluster and cluster parameter: " + file + ", " + cluster);
                else
                    filesarray[i] = fullfile + "@" + cluster;
            }
        }

        logicalfilesarray.setItem(filesarray);

        request.setLogicalFiles(logicalfilesarray);

        DFUArrayActionResponse resp = null;

        try
        {
            resp = ((WsDfuStub) stub).dFUArrayAction(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.deleteFiles(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not deleteFiles");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not deleteFiles");

        List<DFUResultWrapper> results = new ArrayList<DFUResultWrapper>();

        ArrayOfDFUActionInfo actioninfoarray = resp.getActionResults();
        if (actioninfoarray != null)
        {
            DFUActionInfo[] actionresp = actioninfoarray.getDFUActionInfo();

            for (int i = 0; i < actionresp.length; i++)
            {
                results.add(new DFUResultWrapper(actionresp[i]));
            }
        }
        return results;
    }

    /**
     * searchFiles.
     *
     * @param logicalFilename
     *            - the filename to search for
     * @param cluster
     *            - the cluster to search on
     * @return - collection of files matching the logicalfilename passed in
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<DFULogicalFileWrapper> searchFiles(String logicalFilename, String cluster) throws Exception, ArrayOfEspExceptionWrapper
    {
       return searchFiles(logicalFilename,cluster,null,null);
    }

    /**
     * searchFiles
     *
     * @param logicalFilename
     *            - the filename to search for
     * @param cluster
     *            - the cluster to search on
     * @param pagesize
     *            - the size of the page
     * @param pageStartFrom
     *            - the location to search from
     * @return - collection of files matching the logicalfilename passed in
     * @throws java.lang.Exception general exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper array of esp exception wrapper
     */
    public List<DFULogicalFileWrapper> searchFiles(String logicalFilename, String cluster, Integer pagesize, Integer pageStartFrom) throws Exception, ArrayOfEspExceptionWrapper
    {
        return searchFiles(logicalFilename, cluster, pagesize, pageStartFrom, null);
    }

    /**
     * searchFiles
     *
     * @param logicalFilename
     *            - the filename to search for
     * @param cluster
     *            - the cluster to search on
     * @param pagesize
     *            - the size of the page
     * @param pageStartFrom
     *            - the location to search from
     * @param queryfiletype
     *            - the file type to query
     * @return - collection of files matching the logicalfilename passed in
     * @throws java.lang.Exception general exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper array of esp exception wrapper
     */
    public List<DFULogicalFileWrapper> searchFiles(String logicalFilename, String cluster, Integer pagesize, Integer pageStartFrom, DFUQueryFileType queryfiletype) throws Exception, ArrayOfEspExceptionWrapper
    {
        DFUQueryRequestWrapper request = new DFUQueryRequestWrapper();

        request.setNodeGroup(cluster);
        request.setLogicalName(logicalFilename);

        if (pagesize != null)
            request.setPageSize(pagesize);

        if (pageStartFrom != null)
            request.setPageStartFrom(pageStartFrom);

        if (queryfiletype != null)
            request.setFileType(queryfiletype.getText());

        return searchFiles(request);
    }

    /**
     * searchFiles
     *
     * Note, DFUQueryFileType.getText() can be used to populate DFUQueryRequestWrapper.setFileType
     * @param request - the search request
     * @return - collection of files matching the request passed in
     * @throws java.lang.Exception general exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper array of esp exception wrapper
     */
    public List<DFULogicalFileWrapper> searchFiles(DFUQueryRequestWrapper request) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        if (request.getLogicalName() != null && request.getLogicalName().startsWith("~"))
            request.setLogicalName(request.getLogicalName().substring(1));

        DFUQueryResponse resp = null;

        try
        {
            resp = ((WsDfuStub) stub).dFUQuery(request.getRaw());
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.searchFiles encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not SearchFiles");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not SearchFiles");

        List<DFULogicalFileWrapper> result = new ArrayList<DFULogicalFileWrapper>();
        ArrayOfDFULogicalFile logicalfilearray = resp.getDFULogicalFiles();
        if (logicalfilearray != null)
        {
            DFULogicalFile[] dfulogicalfilearray = logicalfilearray.getDFULogicalFile();

            for (int i = 0; i < dfulogicalfilearray.length; i++)
            {
                result.add(new DFULogicalFileWrapper(dfulogicalfilearray[i]));
            }
        }
        return result;
    }


    /**
     * getFileAccessBlob
     * The response is to be used in conjunction with DAFILESRV's rowservice distributed file read/write stream.
     * The response grants the holder access to the target file for the duration of 'expiryseconds' seconds
     * since the Accessblob is generated.
     *
     * @param filename
     *            - the name of the target file to be accessed
     * @param clustername
     *            - the name of the target file's HPCC cluster (can be empty)
     * @param expiryseconds
     *            - the number of seconds file access is granted
     * @param jobid
     *            - unique identifier for access token
     * @return - Access artifact to be propagated as part of DAFILESERV file access requests
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public String getFileAccessBlob(String filename, String clustername, int expiryseconds, String jobid) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (targetHPCCBuildVersion == null || stub == null)
            throw new Exception("WSDFU client not available" + (hasInitError() ? " - " + initErrMessage : ""));

        DFUFileAccessInfoWrapper fileaccessinfo = getFileAccess(filename, clustername, expiryseconds, jobid);
        if (fileaccessinfo == null) throw new Exception("Could not acquire file access for '" + filename + "' on cluster: '" + clustername + "'");

        return fileaccessinfo.getFileAccessInfoBlob();
    }



    /**
     * To be used in conjunction with DAFILESRV's rowservice distributed file read/write stream.
     * The response wrapper provides access to the 'accessblob' which grants the holder read access
     * to the target file for the duration of 'expiryseconds' seconds. Other access details can be
     * fetched from the wrapper.
     *
     * @param filename
     *            - the name of the target file to be accessed
     * @param clustername
     *            - the name of the target file's HPCC cluster (can be empty)
     * @param expiryseconds
     *            - the number of seconds file access is granted
     * @param jobid
     *            - unique identifier for access token
     * @return - Access artifact to be propagated as part of DAFILESERV file access requests
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public DFUFileAccessInfoWrapper getFileAccess(String filename, String clustername, int expiryseconds, String jobid)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        if (targetHPCCBuildVersion == null || stub == null)
            throw new Exception("WSDFU client not available" + (hasInitError() ? " - " + initErrMessage : ""));

        verifyStub(); // Throws exception if stub failed

        DFUFileAccessV2Request request = new DFUFileAccessV2Request();

        request.setCluster(clustername);
        request.setExpirySeconds(expiryseconds);
        request.setRequestId(jobid);
        request.setName(filename);
        request.setReturnTextResponse(true);

        DFUFileAccessResponse resp = null;

        try
        {
            resp = ((WsDfuStub) stub).dFUFileAccessV2(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("Error acquiring read access for: '" + clustername + "::" + filename + "'", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Error acquiring read access for: '" + clustername + "::" + filename + "'");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()),
                "Error acquiring read access for: '" + clustername + "::" + filename + "'");

        if (resp == null || resp.getAccessInfo() == null && (resp.getExceptions() == null || resp.getExceptions().getException().length == 0))
        {
            throw new Exception("Did not receive DFUFileAccess response");
        }

        return new DFUFileAccessInfoWrapper(resp.getAccessInfo(), resp.getType());
    }

    /**
     * Create a new (unpublished) dfu file with partition host mapping.
     * 
     * @deprecated This method was removed in HPCC4J 10.0.0 as it required HPCC Platform v7.0.0 (wsdfu v1_39) which is no longer supported.
     *             The partition host mapping feature was only available in HPCC Platform v7.0.0.
     *             
     *             <p><b>Migration:</b> Use {@link #createFileAndAcquireAccess(String, String, String, int, Boolean, DFUFileTypeWrapper, String)}
     *             without the partitionHostMap parameter. HPCC Platform versions &gt; 7.0.0 handle file part placement automatically.</p>
     *             
     *             <p><b>Example:</b></p>
     *             <pre>
     *             // Old code (no longer supported):
     *             // createFile(fileName, cluster, eclRecordDef, partitionHostMap, expirySeconds)
     *             
     *             // New code:
     *             createFileAndAcquireAccess(fileName, cluster, eclRecordDef, expirySeconds, false, null, null)
     *             </pre>
     *
     * @param fileName
     *            the file name
     * @param cluster
     *            the cluster
     * @param eclRecordDefinition
     *            the ecl record definition
     * @param partitionHostMap
     *            Array declaring the Filepart[i] to Node mapping (no longer supported)
     * @param expirySeconds
     *            the expiry seconds
     * @return the DFU create file wrapper
     * @throws java.lang.Exception
     *             always thrown - this method is no longer supported
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @Deprecated
    public DFUCreateFileWrapper createFile(String fileName, String cluster, String eclRecordDefinition, String[] partitionHostMap, int expirySeconds)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        throw new UnsupportedOperationException(
            "createFile() with partitionHostMap parameter is no longer supported. " +
            "This method required HPCC Platform v7.0.0 (wsdfu v1_39) which is no longer supported in HPCC4J 10.0.0+. " +
            "HPCC Platform versions > 7.0.0 handle file part placement automatically. " +
            "Use createFileAndAcquireAccess(fileName, cluster, eclRecordDefinition, expirySeconds, compressed, type, requestId) instead. " +
            "See migration guide: https://github.com/hpcc-systems/hpcc4j/blob/candidate-10.0.x/MIGRATION-10.0.md"
        );
    }

    /**
     * Create a new (unpublished), uncompressed dfu file. JSON based info will be requested -- appropriate for HPCC post 7.2.0
     *
     * DAFILESERV fileaccess token is requested
     *
     * @param fileName
     *            the file name
     * @param cluster
     *            the cluster
     * @param eclRecordDefinition
     *            the ecl record definition
     * @param expirySeconds
     *            the expiry seconds
     * @return the DFU create file wrapper
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public DFUCreateFileWrapper createFile(String fileName, String cluster, String eclRecordDefinition, int expirySeconds)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        return createFileAndAcquireAccess(fileName, cluster, eclRecordDefinition, expirySeconds, false, null, null);
    }

    /**
     * Create a new (unpublished) dfu file. JSON based info will be requested -- appropriate for HPCC post 7.2.0
     * DAFILESERV fileaccess token is requested
     *
     * @param fileName
     *            the file name
     * @param cluster
     *            the cluster
     * @param eclRecordDefinition
     *            the ecl record definition
     * @param expirySeconds
     *            the expiry seconds
     * @param compressed
     *            the compressed
     * @return the DFU create file wrapper
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public DFUCreateFileWrapper createFile(String fileName, String cluster, String eclRecordDefinition, int expirySeconds, Boolean compressed)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        return createFileAndAcquireAccess(fileName, cluster, eclRecordDefinition, expirySeconds, compressed, null, null);
    }

    /**
     * Create a new (unpublished) dfu file. JSON based info will be requested -- appropriate for HPCC post 7.2.0
     * DAFILESERV fileaccess token is requested
     *
     * @param fileName
     *            the file name
     * @param cluster
     *            the cluster
     * @param eclRecordDefinition
     *            the ecl record definition
     * @param expirySeconds
     *            the expiry seconds
     * @param compressed
     *            the compressed
     * @param filetype
     *            - for example DFUFileTypeWrapper.Csv
     * @param requestid
     *            the requestid
     * @return the DFU create file wrapper
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public DFUCreateFileWrapper createFile(String fileName, String cluster, String eclRecordDefinition, int expirySeconds, Boolean compressed,
            DFUFileTypeWrapper filetype, String requestid) throws Exception, ArrayOfEspExceptionWrapper
    {
        return createFileAndAcquireAccess(fileName, cluster, eclRecordDefinition, expirySeconds, compressed, filetype, requestid);
    }

    /**
     * Create a new (unpublished) dfu file. JSON based info will be requested -- appropriate for HPCC post 7.2.0
     * DAFILESERV fileaccess token is requested
     *
     * @param fileName
     *            the file name
     * @param cluster
     *            the cluster
     * @param eclRecordDefinition
     *            the ecl record definition
     * @param expirySeconds
     *            the expiry seconds
     * @param compressed
     *            the compressed
     * @param type
     *            - for example DFUFileTypeWrapper.Csv
     * @param requestId
     *            the request id
     * @return the DFU create file wrapper
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public DFUCreateFileWrapper createFileAndAcquireAccess(@SpanAttribute String fileName, @SpanAttribute  String cluster, @SpanAttribute  String eclRecordDefinition, @SpanAttribute  int expirySeconds,
            @SpanAttribute Boolean compressed, DFUFileTypeWrapper type, @SpanAttribute String requestId) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (targetHPCCBuildVersion == null || stub == null)
            throw new Exception("WSDFU client not available" + (hasInitError() ? " - " + initErrMessage : ""));

        verifyStub(); // Throws exception if stub failed

        DFUFileCreateV2Request request = new DFUFileCreateV2Request();

        request.setECLRecordDefinition(eclRecordDefinition);
        request.setCluster(cluster);
        request.setExpirySeconds(expirySeconds);
        request.setName(fileName);
        request.setReturnTextResponse(true);
        if (compressed != null) request.setCompressed(compressed);
        if (type != null) request.setType(type.getFUFileType());
        if (requestId != null) request.setRequestId(requestId);

        DFUFileCreateResponse resp = null;

        try
        {
            resp = ((WsDfuStub) stub).dFUFileCreateV2(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.createFileAndAcquireAccess(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Error creating DFU file: '" + cluster + "::" + fileName + "'");
        }

        if (resp == null || resp.getAccessInfo() == null && (resp.getExceptions() == null || resp.getExceptions().getException().length == 0))
        {
            throw new Exception("Did not receive DFUFileCreateResponse");
        }
        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()),
                "Error creating DFU file: '" + cluster + "::" + fileName + "'");

        if (resp.getFileId() == null)
        {
            throw new Exception("Invalid DFUFileCreateResponse. FildId is null.");
        }

        try
        {
            return new DFUCreateFileWrapper(resp);
        }
        catch (Exception e)
        {
            throw new Exception("createFileAndAcquireAccess('" + fileName +"', '"+cluster+"'): Could not wrap response from server", e);
        }
    }

    /**
     * Publishes file created by WsDFUCreateFile. Requires fileId returned from createfile method call
     *
     * @param fileId
     *            the file id
     * @param eclRecordDefinition
     *            the ecl record definition
     * @param totalRecords
     *            the total records
     * @param fileSize
     *            the file size
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public void publishFile(String fileId, String eclRecordDefinition, long totalRecords, long fileSize) throws Exception, ArrayOfEspExceptionWrapper
    {
        publishFile(fileId, eclRecordDefinition, totalRecords, fileSize, null);
    }

    /**
     * Publishes file created by WsDFUCreateFile. Requires fileId returned from createfile method call
     *
     * @param fileId
     *            the file id
     * @param eclRecordDefinition
     *            the ecl record definition
     * @param totalRecords
     *            the total records
     * @param fileSize
     *            the file size
     * @param overwrite
     *            the overwrite
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public void publishFile(@SpanAttribute String fileId, @SpanAttribute  String eclRecordDefinition, @SpanAttribute long totalRecords,@SpanAttribute  long fileSize, @SpanAttribute  Boolean overwrite)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        DFUFilePublishRequest request = new DFUFilePublishRequest();

        request.setECLRecordDefinition(eclRecordDefinition);
        request.setFileId(fileId);
        request.setFileSize(fileSize);
        request.setRecordCount(totalRecords);
        if (overwrite != null) request.setOverwrite(overwrite);

        DFUFilePublishResponse resp = null;

        try
        {
            resp = ((WsDfuStub) stub).dFUFilePublish(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.publishFile(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Error publishing DFU file: '" + fileId + "' \n" + e.getMessage());
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Error publishing DFU file: '" + fileId + "'");
    }

    /**
     * Gets the file details.
     *
     * @param logicalname
     *            - logical file to get file info for, can start with '~' or not
     * @param clustername
     *            - Optional. If specified, the cluster on which to search for the file
     * @return a DFUInfoResponse object containing the file info
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public DFUFileDetailWrapper getFileDetails(String logicalname, String clustername) throws Exception, ArrayOfEspExceptionWrapper
    {
        return this.getFileDetails(logicalname, clustername, false, false);
    }

    /**
     * Gets the file details.
     *
     * @param logicalname
     *            logical file for request, can start with ~
     * @param clustername
     *            optional
     * @param jsonTypeInfo
     *            true if record structure information in JSON format is to be returned
     * @param binTypeInfo
     *            true if record structure information in binary format is to be returned
     * @return DFUInfoResponse object containing the information
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan 
    public DFUFileDetailWrapper getFileDetails(@SpanAttribute String logicalname, @SpanAttribute  String clustername, @SpanAttribute boolean jsonTypeInfo, @SpanAttribute  boolean binTypeInfo)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        // try drea?
        // {
        DFUInfoWrapper resp = this.getFileInfo(logicalname, clustername, jsonTypeInfo, binTypeInfo);
        if (resp == null)
        {
            throw new FileNotFoundException(logicalname + " does not exist");
        }

        if (resp.getExceptions() != null) handleEspExceptions(resp.getExceptions(), "Retrieving file details");

        DFUFileDetailWrapper info = resp.getFileDetail();
        try
        {
            info.setFirstline(this.getFirstRow(logicalname, clustername));
        }
        catch (Exception e)
        {
            // error logged in getFirstRow, no need to log here
            info.setFirstline("");
        }

        if (info.getFilename() != null)
        {
            try
            {
                info.setColumns(getFileMetaData(logicalname, clustername));
            }
            catch (Exception e)
            {
                /*
                 * if (e.getException().length > 0 && e.getException(0).getMessage() != null
                 * && e.getException(0).getMessage().contains("not available in service WsDfu"))
                 * {
                 * // for clusters on version < 5.0.2, this service doesn't exist; do it the old fashioned way
                 * info.setColumns(this.getFileDataColumns(logicalname, clustername));
                 * }
                 * drea?
                 */
            }
        }
        if ((info.getEcl() == null || info.getEcl().isEmpty()) && info.getIsSuperfile() && info.getSubfiles() != null
                && info.getSubfiles().getItem().length != 0)
        {
            String[] strings = info.getSubfiles().getItem();
            DFUFileDetailWrapper subfile = this.getFileDetails(strings[0], info.getNodeGroup());
            if (subfile != null)
            {
                info.setEcl(subfile.getEcl());
                info.setColumns(subfile.getColumns());
                info.setContentType(subfile.getContentType());
                info.setFormat(subfile.getFormat());
            }
        }
        return info;
        /*
         * }
         * catch (ArrayOfEspException e)
         * {
         * if (e != null)
         * {
         * for (EspException espexception : e.getException())
         * {
         * log.error("Error retrieving file type for file: " + logicalname + ": "
         * + espexception.getSource() + espexception.getMessage());
         * }
         * }
         * throw e;
         * }
         */
    }

    /**
     * Ping.
     *
     * @return true, if successful
     * @throws java.lang.Exception
     *             the exception
     */
    public boolean ping() throws Exception
    {
        verifyStub();

        WsDfuPingRequest request = new WsDfuPingRequest();

        try
        {
            ((WsDfuStub) stub).ping(request);
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
            return false;
        }

        return true;
    }
}

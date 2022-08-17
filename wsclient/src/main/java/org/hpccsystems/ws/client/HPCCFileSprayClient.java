package org.hpccsystems.ws.client;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.Stub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.Copy;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.CopyResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWorkunitsActionResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDropZoneFilesRequest;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.Despray;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.DesprayResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZone;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFileSearchRequest;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFileSearchResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFilesRequest;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFilesResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspStringArray;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileListRequest;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileListResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileSprayPingRequest;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileSprayStub;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunit;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunits;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitsResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.PhysicalFileStruct;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.ProgressRequest;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.ProgressResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.Rename;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.RenameResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayFixed;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayFixedResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayVariable;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DelimitedDataOptions;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Sftp;
import org.hpccsystems.ws.client.utils.Utils;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DFUWorkunitsActionResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DesprayResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DesprayWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneFilesRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneFilesResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.EspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.GetDFUWorkunitResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.GetDFUWorkunitsResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.PhysicalFileStructWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.ProgressResponseWrapper;
import org.w3c.dom.Document;

/**
 * Facilitates File Spray related activities.
 * This includes listing available dropzones, uploading files to dropzone, listing files in a dropzone,
 * spraying files from dropzone and more.
 * This class can be enhanced to provide further service calls.
 */
public class HPCCFileSprayClient extends BaseHPCCWsClient
{
    private static final String               FILESPRAYWSDLURI       = "/FileSpray";
    private static final String               UPLOADURI              = FILESPRAYWSDLURI + "/UploadFile?upload_";
    private static final String               DOWNLOAD_URI           = FILESPRAYWSDLURI + "/DownloadFile?";
    private static final long                 MAX_FILE_WSUPLOAD_SIZE = 2000000000;
    private int                               BUFFER_LENGTH          = 1024;

    List<DropZoneWrapper>                     localDropZones         = null;
    private static Logger                     log                    = LogManager.getLogger(HPCCFileSprayClient.class);
    private static int                        DEFAULTSERVICEPORT     = -1;
    private static String                     WSDLURL                = null;

    private static final PhysicalFileStruct[] NO_FILES               = {};
    public static final Version               TrailingSlashPathHPCCVer = new Version(7, 12, 98); //First known HPCC version in which DZ paths are
                                                                                                 //expected to contain trailing slash

    /**
     * Load WSDLURL.
     */
    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new FileSprayStub());
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
        return FILESPRAYWSDLURI;
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
        return new FileSprayStub();
    }

    // from HPCC-Platform/dali/dfu/dfuwu.hpp DFUfileformat
    /**
     * Used to declare variable data format of file to be sprayed
     *
     */
    public enum SprayVariableFormat
    {
        DFUff_fixed (0),
        DFUff_csv (1),
        DFUff_ascii (1),
        DFUff_utf8 (2),
        DFUff_utf8n (3),
        DFUff_utf16 (4),
        DFUff_utf16le (5),
        DFUff_utf16be (6),
        DFUff_utf32 (7),
        DFUff_utf32le (8),
        DFUff_utf32be (9),
        DFUff_variable (10),
        DFUff_recfmvb (11),
        DFUff_recfmv (12),
        DFUff_variablebigendian (13);

        private final int id;

        /**
         * Instantiates a new spray variable format.
         *
         * @param id
         *            the id
         */
        SprayVariableFormat(int id)
        {
            this.id = id;
        }

        /**
         * Gets the value.
         *
         * @return the value
         */
        public int getValue()
        {
            return id;
        }

        private final static HashMap<String, SprayVariableFormat> mapVariableSprayFormatNameCode = new HashMap<String, SprayVariableFormat>();
        static
        {
            mapVariableSprayFormatNameCode.put("csv", SprayVariableFormat.DFUff_csv);
            mapVariableSprayFormatNameCode.put("ascii", SprayVariableFormat.DFUff_ascii);
            mapVariableSprayFormatNameCode.put("utf8", SprayVariableFormat.DFUff_utf8);
            mapVariableSprayFormatNameCode.put("utf16", SprayVariableFormat.DFUff_utf16);
            mapVariableSprayFormatNameCode.put("utf16le", SprayVariableFormat.DFUff_utf16le);
            mapVariableSprayFormatNameCode.put("utf16be", SprayVariableFormat.DFUff_utf16be);
            mapVariableSprayFormatNameCode.put("utf32", SprayVariableFormat.DFUff_utf32);
            mapVariableSprayFormatNameCode.put("utf32le", SprayVariableFormat.DFUff_utf32le);
            mapVariableSprayFormatNameCode.put("utf32be", SprayVariableFormat.DFUff_utf32be);
            mapVariableSprayFormatNameCode.put("variable", SprayVariableFormat.DFUff_variable);
            mapVariableSprayFormatNameCode.put("recfmvb", SprayVariableFormat.DFUff_recfmvb);
            mapVariableSprayFormatNameCode.put("recfmv", SprayVariableFormat.DFUff_recfmv);
            mapVariableSprayFormatNameCode.put("variablebigendian", SprayVariableFormat.DFUff_variablebigendian);
            mapVariableSprayFormatNameCode.put("fixed", SprayVariableFormat.DFUff_fixed);
        }

        /**
         * Convert var spray format name 2 code.
         *
         * @param varSprayFormatName
         *            the var spray format name
         * @return the spray variable format
         */
        public static SprayVariableFormat convertVarSprayFormatName2Code(String varSprayFormatName)
        {
            String lower = varSprayFormatName.toLowerCase();
            if (mapVariableSprayFormatNameCode.containsKey(lower))
                return mapVariableSprayFormatNameCode.get(lower);
            else
                return SprayVariableFormat.DFUff_fixed;
        }
    }

    /**
     * Gets a HPCCFileSprayClient connected to target HPCC Systems
     * as described by connection object.
     *
     * @param connection
     *            the connection
     * @return the HPCC file spray client
     */
    public static HPCCFileSprayClient get(Connection connection)
    {
        return new HPCCFileSprayClient(connection);
    }

    /**
     * Gets a HPCCFileSprayClient connected to target HPCC Systems
     * as described by connection parameters.
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
     * @return the HPCC file spray client
     */
    public static HPCCFileSprayClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        return new HPCCFileSprayClient(conn);
    }

    /**
     * Gets a HPCCFileSprayClient connected to target HPCC Systems
     * as described by connection parameters.
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
     * @return the HPCC file spray client
     */
    public static HPCCFileSprayClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCFileSprayClient(conn);
    }

    /**
     * Instantiates a new HPCC file spray client.
     *
     * @param baseConnection
     *            the base connection
     */
    protected HPCCFileSprayClient(Connection baseConnection)
    {
        initWsFileSprayStub(baseConnection);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param connection
     *            -- All connection settings included
     */
    private void initWsFileSprayStub(Connection connection)
    {
        try
        {
            HPCCWsSMCClient wssmc = HPCCWsSMCClient.get(connection);
            targetHPCCBuildVersion = new Version(wssmc.getHPCCBuild());

            setActiveConnectionInfo(connection);
            stub = setStubOptions(new FileSprayStub(connection.getBaseUrl() + FILESPRAYWSDLURI), connection);
        }
        catch (AxisFault e)
        {
            log.error("Could not initialize FileSprayStub- Review all HPCC connection values");
            e.printStackTrace();
        }
        catch (Exception e)
        {
            log.error("Could not initialize FileSprayStub- Review all HPCC connection values");
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage = e.getLocalizedMessage();
                log.error(e.getLocalizedMessage());
            }
        }
    }

    /**
     * Sends ping request to WsFileSpray service on target HPCC Systems instance.
     *
     * @return true, if successful
     * @throws java.lang.Exception
     *             the exception
     */
    public boolean ping() throws Exception
    {
        verifyStub();

        FileSprayPingRequest request = new FileSprayPingRequest();

        try
        {
            ((FileSprayStub) stub).ping(request);
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
            return false;
        }

        return true;
    }

    /**
     * Gets the file upload read buffer length.
     *
     * @return the upload file buffer length
     */
    public int getFileUploadReadBufferLength()
    {
        return BUFFER_LENGTH;
    }

    /**
     * Set the buffer length used to read files during upload process.
     *
     * @param length
     *            the new file upload read buffer length
     */
    public void setFileUploadReadBufferLength(int length)
    {
        BUFFER_LENGTH = length;
    }

    /**
     * Handle spray response.
     *
     * @param progressResponseWrapper
     *            the progress response wrapper
     * @param maxRetries
     *            the max retries
     * @param milliesBetweenRetry
     *            the millies between retry
     * @return true, if successful
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean handleSprayResponse(ProgressResponseWrapper progressResponseWrapper, int maxRetries, int milliesBetweenRetry)
            throws Exception, org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
    {
        boolean success = false;
        ProgressResponseWrapper progressResponse = null;
        org.hpccsystems.ws.client.wrappers.gen.filespray.ArrayOfEspExceptionWrapper exceptions = progressResponseWrapper.getExceptions();
        if (exceptions != null)
        {
            for (EspExceptionWrapper espexception : exceptions.getException())
            {
                log.error("Error spraying file: " + espexception.getSource() + espexception.getMessage());
            }
        }
        else
        {
            verifyStub();

            log.debug("Spray file DWUID: " + progressResponseWrapper.getWuid());
            progressResponse = getDfuProgress(progressResponseWrapper.getWuid());

            if (progressResponse.getExceptions() != null)
            {
                log.error("Spray progress status fetch failed.");
            }
            else
            {
                String state = progressResponse.getState();
                log.debug(progressResponse.getState());
                if (!state.equalsIgnoreCase("FAILED"))
                {
                    // this should be in a dedicated thread.
                    for (int i = 0; i < maxRetries && progressResponse.getPercentDone() < 100
                            && !progressResponse.getState().equalsIgnoreCase("FAILED"); i++)
                    {
                        log.debug(progressResponse.getProgressMessage());
                        progressResponse = getDfuProgress(progressResponseWrapper.getWuid());

                        try
                        {
                            if (milliesBetweenRetry <= 0) milliesBetweenRetry = 100;

                            Thread.sleep(milliesBetweenRetry);
                        }
                        catch (InterruptedException e)
                        {
                            throw new RuntimeException("Unexpected interrupt", e);
                        }
                    }
                    log.debug(progressResponse.getProgressMessage());
                    success = true;
                }
                else
                {
                    log.error("Spray failed.");
                }
                log.debug("Final summary from server: " + progressResponse.getSummaryMessage());

                log.info("Spray attempt completed, verify DWUID: " + progressResponseWrapper.getWuid());
            }
        }
        return success;
    }

    /**
     * Convenience static method, crates new delimited data format descriptor. Parameters not provided are csv defaulted
     *
     * @param recordTerminator
     *            the record terminator
     * @param fieldDelimiter
     *            the field delimiter
     * @param escapeSequence
     *            the escape sequence
     * @param quote
     *            the quote
     * @return the delimited data options
     */
    static public DelimitedDataOptions createDelimitedDataOptionsObject(String recordTerminator, String fieldDelimiter, String escapeSequence,
            String quote)
    {
        return new DelimitedDataOptions(recordTerminator, fieldDelimiter, escapeSequence, quote);
    }

    /*
     * sample response:
     * <?xml version="1.0" encoding="utf-8"?>
     * <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"
     * xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wsse="http://schemas.xmlsoap.org/ws/2002/04/secext">
     * <soap:Body>
     * <DropZoneFilesResponse xmlns="urn:hpccsystems:ws:filespray">
     * <NetAddress>10.0.2.15</NetAddress>
     * <Path>/var/lib/HPCCSystems/mydropzone/</Path>
     * <OS>1</OS>
     * <DropZones>
     * <DropZone>
     * <Name>mydropzone</Name>
     * <NetAddress>10.0.2.15</NetAddress>
     * <Path>/var/lib/HPCCSystems/mydropzone</Path>
     * <Computer>localhost</Computer>
     * <Linux>true</Linux>
     * </DropZone>
     * </DropZones>
     * <Files>
     * <PhysicalFileStruct>
     * <name>eula.1028.txt</name>
     * <isDir>0</isDir>
     * <filesize>17734</filesize>
     * <modifiedtime>2014-04-03 15:17:54</modifiedtime>
     * </PhysicalFileStruct>
     * </Files>
     * </DropZoneFilesResponse>
     * </soap:Body>
     * </soap:Envelope>
     */

    /**
     * Fetch local drop zones.
     *
     * @return List of all local drop zones on target HPCC system
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<DropZoneWrapper> fetchLocalDropZones() throws Exception, ArrayOfEspExceptionWrapper
    {
        return fetchDropZones("localhost");
    }

    /**
     * Fetch drop zones.
     *
     * @param dropzoneNetAddress
     *            the dropzone net address
     * @return list of all dropzones on dropzoneNetAddress
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<DropZoneWrapper> fetchDropZones(String dropzoneNetAddress) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        DropZoneFilesRequest request = new DropZoneFilesRequest();

        request.setNetAddress(dropzoneNetAddress);
        request.setDirectoryOnly(false);

        DropZoneFilesResponse resp = null;
        try
        {
            resp = ((FileSprayStub) stub).dropZoneFiles(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCFileSprayClient.fetchDropzones(" + dropzoneNetAddress + ") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not FetchDropzones");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not FetchDropzones");

        List<DropZoneWrapper> dropZonesWrapper = null;
        if (resp.getDropZones() != null)
        {
            dropZonesWrapper = new ArrayList<DropZoneWrapper>();
            DropZone[] dropZone = resp.getDropZones().getDropZone();
            for (int i = 0; i < dropZone.length; i++)
            {
                DropZoneWrapper currentDZ = new DropZoneWrapper(dropZone[i]);

                if(compatibilityCheck(TrailingSlashPathHPCCVer))
                {
                    currentDZ.setPath(Utils.ensureTrailingPathSlash(currentDZ.getPath(), currentDZ.getLinux()));
                }

                dropZonesWrapper.add(currentDZ);
            }
        }

        return dropZonesWrapper;
    }

    /**
     * Copy file.
     *
     * @param from
     *            the from
     * @param to
     *            the to
     * @param overwrite
     *            the overwrite
     * @return the string
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public String copyFile(String from, String to, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();
        Copy cp = new Copy();
        cp.setSourceLogicalName(from);
        cp.setDestLogicalName(to);
        cp.setOverwrite(overwrite);
        CopyResponse resp = null;
        try
        {
            resp = ((FileSprayStub) stub).copy(cp);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCFileSprayClient.copy(from,to,overwrite) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not copy file");
        }

        if (resp != null && resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not Copy File");

        return resp.getResult();
    }

    /**
     * Fetch drop zones.
     *
     * @param dzname
     *            the dzname
     * @param netaddress
     *            the netaddress
     * @param os
     *            the os
     * @param path
     *            the path
     * @param subfolder
     *            the subfolder
     * @param dironly
     *            the dironly
     * @param watchvisibleonely
     *            the watchvisibleonely
     * @return the drop zone files response wrapper
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public DropZoneFilesResponseWrapper fetchDropZones(String dzname, String netaddress, String os, String path, String subfolder, boolean dironly,
            boolean watchvisibleonely) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();
        DropZoneFilesRequest request = new DropZoneFilesRequest();

        request.setDirectoryOnly(dironly);
        request.setDropZoneName(dzname);
        request.setECLWatchVisibleOnly(watchvisibleonely);
        request.setNetAddress(netaddress);
        request.setOS(os);
        request.setPath(path);
        request.setSubfolder(subfolder);

        return fetchDropZones(new DropZoneFilesRequestWrapper(request));
    }

    /**
     * Fetch drop zones.
     *
     * @param szrequest
     *            the szrequest
     * @return the drop zone files response wrapper
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public DropZoneFilesResponseWrapper fetchDropZones(DropZoneFilesRequestWrapper szrequest) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (szrequest == null) throw new Exception("DropZoneFilesRequestWrapper null detected");

        verifyStub();

        DropZoneFilesResponse resp = null;
        try
        {
            resp = ((FileSprayStub) stub).dropZoneFiles(szrequest.getRaw());
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCFileSprayClient.fetchDropzones(DropZoneFilesRequestWrapper) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not FetchDropzones");
        }

        if (resp != null && resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not FetchDropzones");

        return new DropZoneFilesResponseWrapper(resp);
    }

    /**
     * Perform HPCC Drop Zone file search.
     *
     * @param dzname
     *            - Required, the name of the Drop Zone to query
     * @param netaddr
     *            - Required, the netaddress of the Drop Zone node to query
     * @param namefilter
     *            - Required, the wildcard based name-filter to query
     * @return the physical file struct[]
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public PhysicalFileStruct[] dzFileSearch(String dzname, String netaddr, String namefilter) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        DropZoneFileSearchRequest request = new DropZoneFileSearchRequest();

        request.setDropZoneName(dzname);
        request.setNameFilter(namefilter);
        request.setServer(netaddr);

        DropZoneFileSearchResponse resp = null;

        try
        {
            resp = ((FileSprayStub) stub).dropZoneFileSearch(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCFileSprayClient.dzFileSearch(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform DZFileSearch");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not perform DZFileSearch");

        if (resp.getFiles() == null) return NO_FILES;

        return resp.getFiles().getPhysicalFileStruct();
    }

    /**
     * Fetch list of files on a given dropzone's machine on the target HPCC System
     * Note: a logical dropzone can contain multiple machines.
     *
     * @param netAddress
     *            - Address of specific dropzone instance
     * @param path
     *            - The dropzone zone path on the local filesystem
     * @param OS
     *            - Optional, OS code
     * @return - Array of file descriptors
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<PhysicalFileStructWrapper> listFiles(String netAddress, String path, String OS) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        FileListRequest request = new FileListRequest();

        request.setNetaddr(netAddress);
        request.setPath(path);
        if (OS != null) request.setOS(OS);

        FileListResponse resp = null;

        try
        {
            resp = ((FileSprayStub) stub).fileList(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCFileSprayClient.listFiles(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not ListFiles");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not ListFiles");

        List<PhysicalFileStructWrapper> physicalFileStructWrappers = new ArrayList<PhysicalFileStructWrapper>();

        if (resp.getFiles() != null)
        {
            PhysicalFileStruct[] physicalFileStruct = resp.getFiles().getPhysicalFileStruct();
            if (physicalFileStruct != null && physicalFileStruct.length > 0)
            {
                for (int i = 0; i < physicalFileStruct.length; i++)
                {
                    physicalFileStructWrappers.add(new PhysicalFileStructWrapper(physicalFileStruct[i]));
                }
            }
        }

        return physicalFileStructWrappers;
    }

    /**
     * * Spray default CSV variable/delimited HPCC file, from the given dropzone address onto given cluster group.
     *
     * @param dropzoneNetAddress
     *            the dropzone net address
     * @param sourceFileName
     *            the source file name
     * @param targetFileName
     *            the target file name
     * @param prefix
     *            the prefix
     * @param destGroup
     *            the dest group
     * @param overwrite
     *            the overwrite
     * @return - Progress response at time of request
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ProgressResponseWrapper sprayVariable(String dropzoneNetAddress, String sourceFileName, String targetFileName, String prefix,
            String destGroup, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper
    {
        return sprayVariable(dropzoneNetAddress, DelimitedDataOptions.DefaultCSVDataOptions, sourceFileName, targetFileName, prefix, destGroup, overwrite);
    }

    /**
     * Spray variable/delimited HPCC file described in the give delimited data options, from the given dropzone address onto given cluster group.
     *
     * @param dropzoneNetAddress
     *            the dropzone net address
     * @param options
     *            the options
     * @param sourceFileName
     *            the source file name
     * @param targetFileName
     *            the target file name
     * @param prefix
     *            the prefix
     * @param destGroup
     *            the dest group
     * @param overwrite
     *            the overwrite
     * @return - Progress response at time of request
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ProgressResponseWrapper sprayVariable(String dropzoneNetAddress, DelimitedDataOptions options, String sourceFileName,
            String targetFileName, String prefix, String destGroup, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<DropZoneWrapper> targetDropZones = fetchDropZones(dropzoneNetAddress);

        if (targetDropZones == null)
            throw new Exception("Could not fetch target Dropzone");

        return sprayVariable(options, targetDropZones.get(0), sourceFileName, targetFileName, prefix, destGroup, overwrite);
    }

    /**
     * Spray variable/delimited HPCC file described in the give delimited data options, from local dropzone onto given cluster group.
     *
     * @param options
     *            the options
     * @param sourceFileName
     *            the source file name
     * @param targetFileName
     *            the target file name
     * @param prefix
     *            the prefix
     * @param destGroup
     *            the dest group
     * @param overwrite
     *            the overwrite
     * @param format
     *            - SprayVariableFormat object describing the file format
     * @return - Progress response at time of request
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ProgressResponseWrapper sprayVariableLocalDropZone(DelimitedDataOptions options, String sourceFileName, String targetFileName,
            String prefix, String destGroup, boolean overwrite, SprayVariableFormat format) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (localDropZones == null)
            localDropZones = fetchLocalDropZones();

        return sprayVariable(options, localDropZones.get(0), sourceFileName, targetFileName, prefix, destGroup, overwrite, format, null, null, null, null, null, null, null);
    }

    /**
     * Spray variable/delimited HPCC file described in the give delimited data options, from given dropzone onto given cluster group.
     *
     * @param options
     *            the options
     * @param targetDropZone
     *            the target drop zone
     * @param sourceFileName
     *            the source file name
     * @param targetFileName
     *            the target file name
     * @param prefix
     *            the prefix
     * @param destGroup
     *            the dest group
     * @param overwrite
     *            the overwrite
     * @return - Progress response at time of request
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ProgressResponseWrapper sprayVariable(DelimitedDataOptions options, DropZoneWrapper targetDropZone, String sourceFileName,
            String targetFileName, String prefix, String destGroup, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper
    {
        return sprayVariable(options, targetDropZone, sourceFileName, targetFileName, prefix, destGroup, overwrite, SprayVariableFormat.DFUff_csv,
                null, null, null, null, null, null, null);
    }

    /**
     * Spray variable/delimited HPCC file described in the give delimited data options, from given dropzone onto given cluster group.
     *
     * @param options
     *            the options
     * @param targetDropZone
     *            the target drop zone
     * @param sourceFileName
     *            the source file name
     * @param targetFileName
     *            the target file name
     * @param prefix
     *            the prefix
     * @param destGroup
     *            the dest group
     * @param overwrite
     *            the overwrite
     * @param format
     *            - SprayVariableFormat object describing the file format
     * @param sourceMaxRecordSize
     *            the source max record size
     * @param maxConnections
     *            the max connections
     * @param compress
     *            the compress
     * @param replicate
     *            the replicate
     * @param failIfNoSourceFile
     *            the fail if no source file
     * @param recordStructurePresent
     *            the record structure present
     * @param expireDays
     *            the expire days
     * @return - Progress response at time of request
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ProgressResponseWrapper sprayVariable(DelimitedDataOptions options, DropZoneWrapper targetDropZone, String sourceFileName,
            String targetFileName, String prefix, String destGroup, boolean overwrite, SprayVariableFormat format, Integer sourceMaxRecordSize,
            Integer maxConnections, Boolean compress, Boolean replicate, Boolean failIfNoSourceFile, Boolean recordStructurePresent,
            Integer expireDays) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        if (targetDropZone == null) throw new Exception("TargetDropZone object not available!");

        SprayVariable request = new SprayVariable();

        request.setSourceIP(targetDropZone.getNetAddress());
        request.setSourcePath(targetDropZone.getPath() + "/" + sourceFileName);
        request.setDestGroup(destGroup);
        request.setDestLogicalName(targetFileName);
        request.setOverwrite(overwrite);
        request.setSourceCsvEscape(options.getEscapeSequence());
        request.setSourceCsvSeparate(options.getFieldDelimiter());
        if (options.getFieldDelimiter().equals(","))
            request.setSourceCsvSeparate("\\,");
        else
            request.setSourceCsvSeparate(options.getFieldDelimiter());

        request.setSourceCsvQuote(options.getQuote());
        request.setSourceCsvTerminate(options.getRecordTerminator());
        request.setSourceFormat(format.getValue());

        if (sourceMaxRecordSize != null) request.setSourceMaxRecordSize(sourceMaxRecordSize);
        if (maxConnections != null) request.setMaxConnections(maxConnections);
        if (replicate != null) request.setReplicate(replicate);
        if (compress != null) request.setCompress(compress);
        if (failIfNoSourceFile != null) request.setFailIfNoSourceFile(failIfNoSourceFile);
        if (recordStructurePresent != null) request.setRecordStructurePresent(recordStructurePresent);
        if (expireDays != null) request.setExpireDays(expireDays);

        SprayResponse resp = null;

        try
        {
            resp = ((FileSprayStub) stub).sprayVariable(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCFileSprayClient.sprayVariable(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not SprayVariable");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not SprayVariable");

        return getDfuProgress(resp.getWuid());
    }

    /**
     * Spray XML data file from the first local dropzone onto given cluster group.
     * defaults to first local dropzone, row tag to "tag", source format to "ASCII"
     * default max record size
     *
     * @param sourceFileName
     *            the source file name
     * @param targetFileName
     *            the target file name
     * @param prefix
     *            the prefix
     * @param destGroup
     *            the dest group
     * @param overwrite
     *            the overwrite
     * @return ProgressResponse
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ProgressResponseWrapper sprayLocalXML(String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        if (localDropZones == null) localDropZones = fetchLocalDropZones();

        return sprayXML(localDropZones.get(0), sourceFileName, targetFileName, prefix, destGroup, "tag", overwrite, SprayVariableFormat.DFUff_ascii,
                null, null, null, null, null, null);
    }

    /**
     * Spray XML data file from the first local dropzone onto given cluster group.
     *
     * @param sourceFileName
     *            the source file name
     * @param targetFileName
     *            the target file name
     * @param prefix
     *            the prefix
     * @param destGroup
     *            the dest group
     * @param overwrite
     *            the overwrite
     * @param format
     *            the format
     * @param rowtag
     *            the rowtag
     * @param maxrecsize
     *            the maxrecsize
     * @return ProgressResponse
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ProgressResponseWrapper sprayLocalXML(String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite,
            SprayVariableFormat format, String rowtag, Integer maxrecsize) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (localDropZones == null) localDropZones = fetchLocalDropZones();

        return sprayXML(localDropZones.get(0), sourceFileName, targetFileName, prefix, destGroup, rowtag, overwrite, format, maxrecsize, null, null,
                null, null, null);
    }

    /**
     * Spray XML data file from the given dropzone onto given cluster group.
     *
     * @param targetDropZone
     *            the target drop zone
     * @param sourceFileName
     *            the source file name
     * @param targetFileName
     *            the target file name
     * @param prefix
     *            the prefix
     * @param destGroup
     *            the dest group
     * @param rowtag
     *            the rowtag
     * @param overwrite
     *            the overwrite
     * @param format
     *            the format
     * @param maxrecsize
     *            the maxrecsize
     * @param maxConnections
     *            the max connections
     * @param replicate
     *            the replicate
     * @param compress
     *            the compress
     * @param failIfNoSourceFile
     *            the fail if no source file
     * @param expireDays
     *            the expire days
     * @return ProgressResponse
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ProgressResponseWrapper sprayXML(DropZoneWrapper targetDropZone, String sourceFileName, String targetFileName, String prefix,
            String destGroup, String rowtag, boolean overwrite, SprayVariableFormat format, Integer maxrecsize, Integer maxConnections,
            Boolean replicate, Boolean compress, Boolean failIfNoSourceFile, Integer expireDays) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        if (targetDropZone == null) throw new Exception("TargetDropZone object not available!");

        SprayVariable request = new SprayVariable();

        request.setDestGroup(destGroup);
        request.setSourceIP(targetDropZone.getNetAddress());
        request.setSourcePath(targetDropZone.getPath() + "/" + sourceFileName);
        request.setDestLogicalName(targetFileName);
        request.setOverwrite(overwrite);
        request.setSourceFormat(format.getValue());
        request.setSourceMaxRecordSize(maxrecsize);
        request.setSourceRowTag(rowtag);

        if (maxConnections != null) request.setMaxConnections(maxConnections);
        if (replicate != null) request.setReplicate(replicate);
        if (compress != null) request.setCompress(compress);
        if (failIfNoSourceFile != null) request.setFailIfNoSourceFile(failIfNoSourceFile);
        if (expireDays != null) request.setExpireDays(expireDays);

        SprayResponse resp = null;

        try
        {
            resp = ((FileSprayStub) stub).sprayVariable(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCFileSprayClient.sprayXML(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not SprayXML");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not SprayXML");

        return getDfuProgress(resp.getWuid());
    }

    /**
     * Spray fixed file from first dropzone encountered on the given dropzone net address.
     *
     * @param dropzoneNetAddress
     *            the dropzone net address
     * @param sourceFileName
     *            the source file name
     * @param recordSize
     *            the record size
     * @param targetFileLabel
     *            the target file label
     * @param prefix
     *            the prefix
     * @param destGroup
     *            the dest group
     * @param overwrite
     *            the overwrite
     * @return - Progress response at time of request
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ProgressResponseWrapper sprayFixed(String dropzoneNetAddress, String sourceFileName, int recordSize, String targetFileLabel, String prefix,
            String destGroup, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<DropZoneWrapper> targetDropZones = fetchDropZones(dropzoneNetAddress);

        if (targetDropZones == null) throw new Exception("Could not fetch target Dropzone");

        return sprayFixed(targetDropZones.get(0), sourceFileName, recordSize, targetFileLabel, prefix, destGroup, overwrite, null, false, false,
                false, -1, null, null, null, null, null, null);
    }

    /**
     * Spray fixed file from first local dropzone encountered onto destination cluster group.
     *
     * @param sourceFileName
     *            the source file name
     * @param recordSize
     *            the record size
     * @param targetFileLabel
     *            the target file label
     * @param prefix
     *            the prefix
     * @param destGroup
     *            the dest group
     * @param overwrite
     *            the overwrite
     * @return - Progress response at time of request
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ProgressResponseWrapper sprayFixedLocalDropZone(String sourceFileName, int recordSize, String targetFileLabel, String prefix,
            String destGroup, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (localDropZones == null) localDropZones = fetchLocalDropZones();

        return sprayFixed(localDropZones.get(0), sourceFileName, recordSize, targetFileLabel, prefix, destGroup, overwrite, null, false, false, false,
                -1, null, null, null, null, null, null);
    }

    /**
     * Spray fixed file from the given target dropzone onto cluster destionation group.
     *
     * @param targetDropZone
     *            the target drop zone
     * @param sourceFileName
     *            the source file name
     * @param recordSize
     *            the record size
     * @param targetFileLabel
     *            the target file label
     * @param prefix
     *            the prefix
     * @param destGroup
     *            the dest group
     * @param overwrite
     *            the overwrite
     * @param maxConnections
     *            the max connections
     * @param compress
     *            the compress
     * @param replicate
     *            the replicate
     * @param failIfNoSourceFile
     *            the fail if no source file
     * @param expireDays
     *            the expire days
     * @param decryptKey
     *            the decrypt key
     * @param encryptKey
     *            the encrypt key
     * @param nosplit
     *            the nosplit
     * @param recordStructurePresent
     *            the record structure present
     * @param transferBufferSize
     *            the transfer buffer size
     * @param wrap
     *            the wrap
     * @return - Progress response at time of request
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ProgressResponseWrapper sprayFixed(DropZoneWrapper targetDropZone, String sourceFileName, int recordSize, String targetFileLabel,
            String prefix, String destGroup, boolean overwrite, Integer maxConnections, Boolean compress, Boolean replicate,
            Boolean failIfNoSourceFile, Integer expireDays, String decryptKey, String encryptKey, Boolean nosplit, Boolean recordStructurePresent,
            Integer transferBufferSize, Boolean wrap) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        if (targetDropZone == null) throw new Exception("TargetDropZone object not available!");

        SprayFixed request = new SprayFixed();

        request.setDestGroup(destGroup);
        request.setSourceRecordSize(recordSize);
        request.setSourceIP(targetDropZone.getNetAddress());
        request.setSourcePath(targetDropZone.getPath() + "/" + sourceFileName);
        request.setDestLogicalName(targetFileLabel);
        request.setOverwrite(overwrite);
        request.setPrefix(prefix);
        if (maxConnections != null) request.setMaxConnections(maxConnections);
        if (compress != null) request.setCompress(compress);
        if (replicate != null) request.setReplicate(replicate);
        if (failIfNoSourceFile != null) request.setFailIfNoSourceFile(failIfNoSourceFile);
        if (expireDays != null) request.setExpireDays(expireDays);
        if (decryptKey != null && !decryptKey.isEmpty()) request.setDecrypt(decryptKey);
        if (encryptKey != null && !encryptKey.isEmpty()) request.setEncrypt(encryptKey);
        if (nosplit != null) request.setNosplit(nosplit);
        if (recordStructurePresent != null) request.setRecordStructurePresent(recordStructurePresent);
        if (transferBufferSize != null) request.setTransferBufferSize(transferBufferSize);
        if (wrap != null) request.setWrap(wrap);

        SprayFixedResponse resp = null;

        try
        {
            resp = ((FileSprayStub) stub).sprayFixed(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCFileSprayClient.sprayFixed(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not SprayFixed");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not SprayFixed");

        return getDfuProgress(resp.getWuid());
    }

    /**
     * Get progress report for given DFU Work Unit.
     *
     * @param dfuwuid
     *            - The DFU Work unit number
     * @return - The Progress report at time of request
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ProgressResponseWrapper getDfuProgress(String dfuwuid) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        ProgressRequest request = new ProgressRequest();

        request.setWuid(dfuwuid);

        ProgressResponse resp = null;

        try
        {
            resp = ((FileSprayStub) stub).getDFUProgress(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCFileSprayClient.getDfuProgress(" + dfuwuid + ") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform GetDfuProgress");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not perform GetDfuProgress");

        return new ProgressResponseWrapper(resp);
    }

    /**
     * THIS IS NOT THE PREFERED WAY TO UPLOAD FILES ONTO HPCCSYSTEMS
     * ONLY USE THIS FUNCTION FOR SMALL FILES AND IN THE CASE YOU CANNOT PROVIDE
     * CREDENTIALS TO LOGON TO THE TARGET MACHINE
     * USE sftpPutFileOnTargetLandingZone(...) if possible
     *
     * Attempts to upload given file to HPCC System on the first dropzone encountered at the given address
     *
     * @param file
     *            - The File to upload
     * @param targetDropzoneAddress
     *            - The target dropzone address
     * @return - Boolean, success
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean uploadFile(File file, String targetDropzoneAddress) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<DropZoneWrapper> dropZones = fetchDropZones(targetDropzoneAddress);
        if (dropZones == null || dropZones.size() <= 0) throw new Exception("Could not fetch target dropzone information");
        return uploadFile(file, dropZones.get(0));
    }

    /**
     * THIS IS NOT THE PREFERED WAY TO UPLOAD FILES ONTO HPCCSYSTEMS
     * ONLY USE THIS FUNCTION FOR SMALL FILES AND IN THE CASE YOU CANNOT PROVIDE
     * CREDENTIALS TO LOGON TO THE TARGET MACHINE
     * USE sftpPutFileOnTargetLandingZone(...) if possible
     * Attempts to upload given file to HPCC System on the first local dropzone encountered
     *
     * @param file
     *            - The File to upload
     * @return - Boolean, success
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean uploadFileLocalDropZone(File file) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<DropZoneWrapper> fetchLocalDropZones = fetchLocalDropZones();
        if (fetchLocalDropZones == null || fetchLocalDropZones.size() <= 0) throw new Exception("Could not fetch local dropzone information");
        return uploadFile(file, fetchLocalDropZones.get(0));
    }

    static DocumentBuilder m_safeXMLDocBuilder = null;
    static XPathExpression m_uploadResultExpression = null;

    static protected void setupUploadResultParser() throws XPathExpressionException, ParserConfigurationException
    {
        if(m_uploadResultExpression != null && m_safeXMLDocBuilder != null)
            return;

        m_safeXMLDocBuilder = Utils.newSafeXMLDocBuilder();

        if (m_safeXMLDocBuilder == null)
            throw new XPathExpressionException ("Could not create new result XML parser");

        XPath xpath = XPathFactory.newInstance().newXPath();
        m_uploadResultExpression= xpath.compile("string(/UploadFilesResponse/UploadFileResults/DFUActionResult/Result)");

        if (m_uploadResultExpression == null)
            throw new XPathExpressionException ("Could not Compile versionXpathExpression");
    }

    /**
     * UPLOADS A FILE( UP TO 2GB FILE SIZES) TO THE SPECIFIED LANDING ZONE.
     *
     * @param uploadFile
     *            - The File to upload
     * @param dropZone
     *            - The target dropzone
     * @return - Boolean, success
     */
    public boolean uploadLargeFile(File uploadFile, DropZoneWrapper dropZone)
    {
        if (uploadFile == null || dropZone == null)
        {
            return false;
        }

        Boolean returnValue = true;
        URLConnection fileUploadConnection = null;
        URL fileUploadURL = null;
        String uploadurlbuilder = UPLOADURI;
        uploadurlbuilder += "&NetAddress=" + dropZone.getNetAddress();
        String path = dropZone.getPath().trim();
        if (!path.endsWith("/"))
            path += "/";
        uploadurlbuilder += "&Path=" + path;
        uploadurlbuilder += "&OS=" + (dropZone.getLinux().equalsIgnoreCase("true") ? "2" : "1");
        uploadurlbuilder += "&rawxml_=1";
        WritableByteChannel outchannel = null;
        FileChannel inChannel = null;
        OutputStream output = null;
        InputStream input = null;
        RandomAccessFile aFile = null;

        StringBuffer response = new StringBuffer();

        try
        {
            String boundary = Utils.createBoundary();
            fileUploadURL = new URL(wsconn.getUrl() + uploadurlbuilder);
            fileUploadConnection = Connection.createConnection(fileUploadURL);
            fileUploadConnection = fileUploadURL.openConnection();
            fileUploadConnection.setDoOutput(true);
            fileUploadConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
            fileUploadConnection.setRequestProperty("Authorization", wsconn.getBasicAuthString());
            output = fileUploadConnection.getOutputStream();

            Utils.startMulti(output, uploadFile.getName(), boundary, "");
            input = new FileInputStream(uploadFile.getAbsolutePath());

            ByteBuffer buffer = ByteBuffer.allocate(BUFFER_LENGTH * 16);

            aFile = new RandomAccessFile(uploadFile.getAbsolutePath(), "rw");
            inChannel = aFile.getChannel();
            outchannel = Channels.newChannel(output);
            try
            {
                while (inChannel.read(buffer) > 0)
                {
                    buffer.flip();
                    while (buffer.hasRemaining())
                    {
                        outchannel.write(buffer);
                    }
                    buffer.clear();
                }
            }
            catch (IOException e)
            {
                log.error("Encountered error while reading file: " + e.getLocalizedMessage());
                returnValue = false;
            }
            finally
            {
                Utils.closeMulti(output, boundary);
            }

            BufferedReader rreader = new BufferedReader(new InputStreamReader(fileUploadConnection.getInputStream()));

            String line = null;
            while ((line = rreader.readLine()) != null)
            {
                response.append(line);
            }
        }
        catch (MalformedURLException e)
        {
            log.error("There was a malformed URL: " + e.getLocalizedMessage());
            returnValue = false;
        }
        catch (IOException e)
        {
            log.error("There was an error opening the file: " + e.getLocalizedMessage());
            e.printStackTrace();
            returnValue = false;
        }
        finally
        {
            try
            {
                outchannel.close();
                inChannel.close();
                output.close();
                input.close();
                aFile.close();
            }
            catch (IOException e)
            {
                log.error("Encountered error while closing: " + e.getLocalizedMessage());
            }
        }

        if (response.length() > 0)
        {
            try
            {
                setupUploadResultParser(); // throws if expression or docbuilder == null

                Document document = m_safeXMLDocBuilder.parse(new ByteArrayInputStream(response.toString().getBytes(StandardCharsets.UTF_8)));

                String result = m_uploadResultExpression.evaluate(document);
                log.info("uploadLargeFile ( " + uploadFile + ") result: '" + result + "'");

                if (result.isEmpty() || !result.equalsIgnoreCase("Success"))
                    returnValue = false;
            }
            catch (Exception e)
            {
                log.error("Encountered error parsing uploadLargeFile response:\n" + e.getLocalizedMessage());
            }
        }
        else
            returnValue = false;

        return returnValue;
    }

    /**
     * THIS IS NOT THE PREFERED WAY TO UPLOAD FILES ONTO HPCCSYSTEMS
     * ONLY USE THIS FUNCTION FOR SMALL FILES AND IN THE CASE YOU CANNOT PROVIDE
     * CREDENTIALS TO LOGON TO THE TARGET MACHINE
     * USE sftpPutFileOnTargetLandingZone(...) if possible
     *
     * Attempts to upload given file to HPCC System on the given dropzone
     *
     * @param file
     *            - The File to upload
     * @param dropZone
     *            - The target HPCC file dropzone
     * @return - Boolean, success
     * @throws Exception
     *             the exception
     */
    private boolean uploadFile(File file, DropZoneWrapper dropZone) throws Exception
    {
        if (file == null) return false;
        String filename = file.getName();
        long length = file.length();

        if (length > MAX_FILE_WSUPLOAD_SIZE) throw new Exception("Uploading files of this magnitude is not supported, use SFTP based functions");

        InputStream fileInput = null;
        OutputStream uploadOutStream = null;
        URLConnection fileUploadConnection = null;
        URL fileUploadURL = null;
        String boundary = Utils.createBoundary();
        try
        {
            if (dropZone == null) throw new Exception("Dropzone information not available");

            String uploadurlbuilder = UPLOADURI;
            uploadurlbuilder += "&NetAddress=" + dropZone.getNetAddress();
            uploadurlbuilder += "&Path=" + dropZone.getPath();
            uploadurlbuilder += "&OS=" + (Utils.currentOSisLinux() ? "1" : "0");
            fileUploadURL = new URL(wsconn.getUrl() + uploadurlbuilder);
            fileUploadConnection = Connection.createConnection(fileUploadURL);

            if (wsconn.hasCredentials())
            {
                fileUploadConnection.setRequestProperty("Authorization", wsconn.getBasicAuthString());
            }

            fileUploadConnection.setRequestProperty("Content-Length", Long.toString(length));
            fileUploadConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
            uploadOutStream = fileUploadConnection.getOutputStream();
            Utils.startMulti(uploadOutStream, filename, boundary, "");

            fileInput = new FileInputStream(file);

            byte[] bytesReadFromFile = new byte[BUFFER_LENGTH];
            int bytesReadCount;
            while ((bytesReadCount = fileInput.read(bytesReadFromFile, 0, BUFFER_LENGTH)) != -1)
            {
                uploadOutStream.write(bytesReadFromFile, 0, bytesReadCount);
                uploadOutStream.flush();
            }
            Utils.closeMulti(uploadOutStream, boundary);
            StringBuffer response = new StringBuffer();
            BufferedReader rreader = new BufferedReader(new InputStreamReader(fileUploadConnection.getInputStream()));
            String line = null;

            while ((line = rreader.readLine()) != null)
                response.append(line);

            log.debug("File upload has finished, please fetch file list to verify upload");
        }
        catch (Exception e)
        {
            if (!fileUploadURL.equals(fileUploadConnection.getURL()))
            {
                log.error("HTTP Error reported on File upload related to a server redirect (" + fileUploadURL + " vs " + fileUploadConnection.getURL()
                        + "), please verify on server.", e);
            }
            else
            {
                log.error("Failed to upload file.", e);
            }

            return false;
        }
        finally
        {
            try
            {
                if (fileInput != null)
                {
                    fileInput.close();
                }
            }
            catch (IOException e)
            {}

            if (uploadOutStream != null)
            {
                try
                {
                    uploadOutStream.close();
                }
                catch (IOException e)
                {}
            }
        }
        return true;
    }

    /**
     * Attempts to download the specified file from a dropzone.
     *
     * @param outFile
     *            - The File to write to
     * @param dropZone
     *            - The target HPCC file dropzone
     * @param fileName
     *            - The file to download
     * @return - long, bytes transferred, -1 on error
     */
    public long downloadFile(File outFile, DropZoneWrapper dropZone, String fileName)
    {
        if (outFile == null)
        {
            log.error("File download failed. Valid output File object is required.");
            return -1;
        }

        if (fileName == null)
        {
            log.error("File download failed. No filename provided.");
            return -1;
        }

        long bytesTransferred = -1;
        try
        {
            FileOutputStream outputStream = new FileOutputStream(outFile);
            bytesTransferred = downloadFile(outputStream.getChannel(), dropZone, fileName);
            outputStream.close();
        }
        catch (Exception e)
        {
            log.error("File download failed with error message: " + e.getMessage());
        }

        return bytesTransferred;
    }

    /**
     * Attempts to download the specified file from a dropzone.
     *
     * @param outputChannel
     *            - The FileChannel to write to
     * @param dropZone
     *            - The target HPCC file dropzone
     * @param fileName
     *            - The file to download
     * @return - long, bytes transferred, -1 on error
     */
    public long downloadFile(FileChannel outputChannel, DropZoneWrapper dropZone, String fileName)
    {
        if (outputChannel == null)
        {
            log.error("File download failed. Output channel is required.");
            return -1;
        }

        if (dropZone == null)
        {
            log.error("File download failed. Dropzone is required.");
            return -1;
        }

        if (fileName == null)
        {
            log.error("File download failed. No filename provided.");
            return -1;
        }

        long fileSize = 0;
        try
        {
            List<PhysicalFileStructWrapper> filesInDropzone = listFiles(dropZone.getNetAddress(), dropZone.getPath(), null);

            boolean fileWasFound = false;
            for (int i = 0; i < filesInDropzone.size(); i++)
            {
                if (filesInDropzone.get(i).getName().equals(fileName))
                {
                    if (filesInDropzone.get(i).getIsDir())
                    {
                        throw new Exception("Specified file name: " + fileName + ", is a directory. Downloading directories is unsupported.");
                    }

                    fileWasFound = true;
                    fileSize = filesInDropzone.get(i).getFilesize();
                }
            }

            if (fileWasFound == false)
            {
                throw new Exception("Specified file was not found: " + fileName);
            }
        }
        catch (Exception e)
        {
            log.error("File download failed. Drop zone file enumeration failed with error: " + e.getMessage());
            return -1;
        }

        URL downloadURL = null;
        try
        {
            downloadURL = new URL(wsconn.getUrl() + DOWNLOAD_URI + "Name=" + fileName + "&NetAddress=" + dropZone.getNetAddress() + "&Path="
                    + dropZone.getPath() + "&OS=" + (Utils.currentOSisLinux() ? "1" : "0"));
        }
        catch (java.net.MalformedURLException e)
        {
            log.error("File download failed, due to malformed URL. Check dropzone path. Error message: " + e.getMessage());
            return -1;
        }

        long bytesTransferred = -1;
        try
        {
            ReadableByteChannel sourceChannel = Channels.newChannel(downloadURL.openStream());
            bytesTransferred = outputChannel.transferFrom(sourceChannel, 0, Long.MAX_VALUE);

            sourceChannel.close();
            outputChannel.close();
        }
        catch (IOException e)
        {
            log.error("Failed to download file with error: " + e.getMessage());
        }

        if (bytesTransferred < fileSize)
        {
            log.warn("File download fewer bytes transferred than expected. Transferred: " + bytesTransferred + " Expected: " + fileSize);
        }

        return bytesTransferred;
    }

    /**
     * Attempts to upload given file to HPCC Systems on the first dropzone encountered at the target HPCCSystem address.
     *
     * @param localFileName
     *            - The File to upload
     * @param targetFilename
     *            (optional) - The desired name for the uploaded file
     * @param machineLoginUserName
     *            - The user account name to log on to the target machine
     * @param password
     *            - The user account password to log on to the target machine
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public void sftpPutFileOnTargetLandingZone(String localFileName, String targetFilename, String machineLoginUserName, String password)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        sftpPutFileOnTargetLandingZone(localFileName, wsconn.getHost(), targetFilename, machineLoginUserName, password, null);
    }

    /**
     * Attempts to upload given file to HPCC Systems on the first dropzone encountered at the target HPCCSystem address.
     *
     * @param localFileName
     *            - The File to upload
     * @param targetFilename
     *            (optional) - The desired name for the uploaded file
     * @param machineLoginUserName
     *            - The user account name to log on to the target machine
     * @param password
     *            - The user account password to log on to the target machine
     * @param connconfig
     *            (optional) - Connection config options
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public void sftpPutFileOnTargetLandingZone(String localFileName, String targetFilename, String machineLoginUserName, String password,
            Properties connconfig) throws Exception, ArrayOfEspExceptionWrapper
    {
        sftpPutFileOnTargetLandingZone(localFileName, wsconn.getHost(), targetFilename, machineLoginUserName, password, connconfig);
    }

    /**
     * Attempts to upload given file to HPCC Systems on the first dropzone encountered at the given address.
     *
     * @param localFileName
     *            - The File to upload
     * @param targetDropzoneAddress
     *            - The target landing zone ip address
     * @param targetFilename
     *            (optional) - The desired name for the uploaded file
     * @param machineLoginUserName
     *            - The user account name to log on to the target machine
     * @param password
     *            - The user account password to log on to the target machine
     * @param connconfig
     *            (optional) - Connection config options
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public void sftpPutFileOnTargetLandingZone(String localFileName, String targetDropzoneAddress, String targetFilename, String machineLoginUserName,
            String password, Properties connconfig) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<DropZoneWrapper> dropZones = fetchDropZones(targetDropzoneAddress);
        if (dropZones == null || dropZones.size() <= 0) throw new Exception("Could not fetch target dropzone information");

        Sftp.lzPut(localFileName, targetDropzoneAddress, dropZones.get(0).getPath(), targetFilename, machineLoginUserName, password,
                dropZones.get(0).getLinux().equals("true"), connconfig);
    }

    /**
     * Attempts to fetch information regarding a DFU Workunit.
     *
     * @param workunitid
     *            the workunitid
     * @return the DFU workunit
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public GetDFUWorkunitResponseWrapper getDFUWorkunit(String workunitid) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        GetDFUWorkunit request = new GetDFUWorkunit();

        request.setWuid(workunitid);

        GetDFUWorkunitResponse response = null;
        try
        {
            response = ((FileSprayStub) stub).getDFUWorkunit(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCFileSprayClient.getDFUWorkunit(" + workunitid + ") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform GetDFUWorkunit");
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not perform GetDFUWorkunit");

        return new GetDFUWorkunitResponseWrapper(response);
    }

    /**
     * Attempts to fetch list of DFU Workunits.
     *
     * @param cluster
     *            the cluster
     * @param pagesize
     *            the pagesize
     * @return the DFU workunits
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public GetDFUWorkunitsResponseWrapper getDFUWorkunits(String cluster, Long pagesize) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        GetDFUWorkunits request = new GetDFUWorkunits();

        request.setPageSize(pagesize);
        request.setCluster(cluster);

        GetDFUWorkunitsResponse response = null;
        try
        {
            response = ((FileSprayStub) stub).getDFUWorkunits(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCFileSprayClient.getDFUWorkunits(" + cluster + "," + pagesize + ") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform GetDFUWorkunits");
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not perform GetDFUWorkunits");

        return new GetDFUWorkunitsResponseWrapper(response);
    }

    /**
     * Deletes a file from a drop zone
     *
     * @param dropzoneName
     *          - The name of the dropzone to delete from
     * @param fileNames
     *          - A List of names to delete from the drop zone
     * @param netAddress
     *          - The net address of the dropzone
     * @param path
     *          - The full path to the dropzone on the filesystem ie /var/lib/HPCCSystems/mydropzone
     * @param os
     *          - The os
     * @return response from dfu workunit
     * @throws java.lang.Exception if any.
     */
    public DFUWorkunitsActionResponseWrapper deleteDropZoneFiles(String dropzoneName, List<String> fileNames, String netAddress, String path, String os) throws Exception
    {
        verifyStub();

        EspStringArray espStringArray = new EspStringArray();
        fileNames.forEach(fileName -> espStringArray.addItem(fileName));

        DeleteDropZoneFilesRequest request = new DeleteDropZoneFilesRequest();
        request.setDropZoneName(dropzoneName);
        request.setNames(espStringArray);
        request.setNetAddress(netAddress);
        request.setPath(path);
        request.setOS(os);

        DFUWorkunitsActionResponse response = ((FileSprayStub)stub).deleteDropZoneFiles(request);

        return new DFUWorkunitsActionResponseWrapper(response);
    }

    /**
     * Renames HPCC logical file
     *
     * @param sourceFileName - The name of the file to rename
     * @param targetFilename - The new name for the file
     * @param overwrite      - Overwrite if targetfilename already exists
     * @return               - The resulting DFU workunit
     *                         Can be used to track progress and status via getDFUWorkunit(String) or getDfuProgress
     * @throws java.lang.Exception general exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper array of esp exception wrapper
     */
    public String renameLogicalFile(String sourceFileName, String targetFilename, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        Rename request = new Rename();

        request.setSrcname(sourceFileName);
        request.setDstname(targetFilename);
        request.setOverwrite(overwrite);

        RenameResponse resp = null;
        try
        {
            resp = ((FileSprayStub) stub).rename(request);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not rename file");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not rename file");

        return resp.getWuid();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.BaseHPCCWsClient#equals(java.lang.Object)
     */
    /** {@inheritDoc} */
    @Override
    public boolean equals(Object aThat)
    {
        boolean eq = super.equals(aThat);
        if (eq)
        {
            HPCCFileSprayClient that = (HPCCFileSprayClient) aThat;

            Options thatopt;
            try
            {
                Stub thatStub = that.verifyStub();
                thatopt = thatStub._getServiceClient().getOptions();
            }
            catch (Exception e)
            {
                thatopt = null;
            }

            if (thatopt == null) return false;

            EqualsUtil.areEqual(getFileUploadReadBufferLength(), that.getFileUploadReadBufferLength());
        }

        return eq;
    }

    /**
     * Despray HPCC logical file - see actual service page for field descriptions
     *
     * @param sourcelogicalname a {@link java.lang.String} object.
     * @param destinationIP a {@link java.lang.String} object.
     * @param destinationPath a {@link java.lang.String} object.
     * @throws Exception a {@link java.lang.Exception} object
     * @return a {@link java.lang.String} object.
     */
    public String despray(String sourcelogicalname, String destinationIP, String destinationPath) throws Exception
    {
        return despray(null, null, destinationIP, destinationPath, null, null, null, null, null, null, null, sourcelogicalname, null, null, null, null).getWuid();
    }

    /**
     * Despray HPCC logical file - see actual service page for field descriptions
     *
     * @param sourcelogicalname a {@link java.lang.String} object.
     * @param destinationIP a {@link java.lang.String} object.
     * @param destinationPath a {@link java.lang.String} object.
     * @param splitprefix a {@link java.lang.String} object.
     * @param overwrite a boolean.
     * @param singleconnection a boolean.
     * @throws Exception a {@link java.lang.Exception} object
     * @return a {@link java.lang.String} object.
     */
    public String despray(String sourcelogicalname, String destinationIP, String destinationPath, String splitprefix, boolean overwrite, boolean singleconnection) throws Exception
    {
        return despray(null, null,destinationIP, destinationPath, null, null, null, null, null, overwrite, singleconnection, sourcelogicalname, splitprefix, null, null, null).getWuid();
    }

    /**
     * Despray HPCC logical file - see actual service page for field descriptions
     *
     * @param compressed a {@link java.lang.Boolean} object.
     * @param decrypt a {@link java.lang.String} object.
     * @param destip a {@link java.lang.String} object.
     * @param destpath a {@link java.lang.String} object.
     * @param dfuserverqueue a {@link java.lang.String} object.
     * @param encrypt a {@link java.lang.String} object.
     * @param maxconnections a {@link java.lang.Integer} object.
     * @param multicopy a {@link java.lang.Boolean} object.
     * @param norecover a {@link java.lang.Boolean} object.
     * @param overwrite a {@link java.lang.Boolean} object.
     * @param singleconnection a {@link java.lang.Boolean} object.
     * @param sourcelogicalname a {@link java.lang.String} object.
     * @param splitprefix a {@link java.lang.String} object.
     * @param throttle a {@link java.lang.Integer} object.
     * @param transferbuffersize a {@link java.lang.Integer} object.
     * @param wrap a {@link java.lang.Boolean} object.
     * @throws Exception a {@link java.lang.Exception} object
     * @return a {@link org.hpccsystems.ws.client.wrappers.gen.filespray.DesprayResponseWrapper} object.
     */
    public DesprayResponseWrapper despray(Boolean compressed, String decrypt, String destip,
            String destpath, String dfuserverqueue, String encrypt,
            Integer maxconnections, Boolean multicopy, Boolean norecover, Boolean overwrite,
            Boolean singleconnection, String sourcelogicalname, String splitprefix,
            Integer throttle, Integer transferbuffersize, Boolean wrap) throws Exception
    {
        verifyStub();

        if (sourcelogicalname == null || sourcelogicalname.isEmpty())
            throw new Exception("HPCCFileSpray.despray: sourcelogicalname cannot be null nor empty");

        Despray despray = new Despray();
        despray.setSourceLogicalName(sourcelogicalname);

        if (compressed != null)
            despray.setCompress(compressed);
        if (decrypt != null)
            despray.setDecrypt(decrypt);
        if (destip != null)
            despray.setDestIP(destip);
        if (destpath != null)
            despray.setDestPath(destpath);
        if (dfuserverqueue != null)
            despray.setDFUServerQueue(dfuserverqueue);
        if (encrypt != null)
            despray.setEncrypt(encrypt);
        if (maxconnections != null)
            despray.setMaxConnections(maxconnections);
        if (multicopy != null)
            despray.setMultiCopy(multicopy);
        if (norecover != null)
            despray.setNorecover(norecover);
        if (overwrite != null)
            despray.setOverwrite(overwrite);
        if (singleconnection != null)
            despray.setSingleConnection(singleconnection);
        if (splitprefix != null)
            despray.setSplitprefix(splitprefix);
        if (throttle != null)
            despray.setThrottle(throttle);
        if (transferbuffersize != null)
            despray.setTransferBufferSize(transferbuffersize);
        if (wrap != null)
            despray.setWrap(wrap);

        DesprayResponse resp = null;

        try
        {
            resp = ((FileSprayStub) stub).despray(despray);
        }
        catch (RemoteException | EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not Despray file: '" + sourcelogicalname + "'");
            e.printStackTrace();
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not Despray file: '" + sourcelogicalname + "'");

        return new DesprayResponseWrapper(resp);
    }

    /**
     * Despray HPCC logical file
     *
     * @param desprayreq a {@link org.hpccsystems.ws.client.wrappers.gen.filespray.DesprayWrapper} object.
     * @throws Exception a {@link java.lang.Exception} object
     * @return a {@link org.hpccsystems.ws.client.wrappers.gen.filespray.DesprayResponseWrapper} object.
     */
    public DesprayResponseWrapper despray(DesprayWrapper desprayreq) throws Exception
    {
        if (desprayreq == null)
            throw new Exception("HPCCFileSpray.despray: desprayreq cannot be null");

        return despray(desprayreq.getCompress(), desprayreq.getDecrypt(), desprayreq.getDestIP(), desprayreq.getDestPath(), desprayreq.getDFUServerQueue(), desprayreq.getEncrypt(),
                desprayreq.getMaxConnections(), desprayreq.getMultiCopy(), desprayreq.getNorecover(), desprayreq.getOverwrite(), desprayreq.getSingleConnection(), desprayreq.getSourceLogicalName(),
                desprayreq.getSplitprefix(), desprayreq.getThrottle(), desprayreq.getTransferBufferSize(), desprayreq.getWrap());
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.BaseHPCCWsClient#hashCode()
     */
    /** {@inheritDoc} */
    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        return HashCodeUtil.hash(result, getFileUploadReadBufferLength());
    }
}

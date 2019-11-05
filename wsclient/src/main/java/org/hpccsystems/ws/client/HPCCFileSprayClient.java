package org.hpccsystems.ws.client;

import java.io.BufferedReader;
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
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.Stub;
import org.apache.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Copy;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.CopyResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZone;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchRequest;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFilesRequest;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFilesResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileListRequest;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileListResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileSprayPingRequest;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileSprayStub;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUWorkunit;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUWorkunitResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUWorkunits;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUWorkunitsResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.PhysicalFileStruct;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ProgressRequest;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ProgressResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.SprayFixed;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.SprayFixedResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.SprayResponse;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.SprayVariable;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DelimitedDataOptions;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Sftp;
import org.hpccsystems.ws.client.utils.Utils;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneFilesRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneFilesResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.EspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.GetDFUWorkunitResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.GetDFUWorkunitsResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.PhysicalFileStructWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.ProgressResponseWrapper;

/**
 * Use as soap client for HPCC wsFileSpray web service.
 * This includes uploading files to dropzone, listing files in a dropzone,
 * spraying files from dropzone and more.
 * This class can be enhanced to provide further service calls.
 *
 */
public class HPCCFileSprayClient extends BaseHPCCWsClient
{
    private static final String FILESPRAYWSDLURI       = "/FileSpray";
    private static final String UPLOADURI              = FILESPRAYWSDLURI + "/UploadFile?upload_";
    private static final String DOWNLOAD_URI           = FILESPRAYWSDLURI + "/DownloadFile?";
    private static final long   MAX_FILE_WSUPLOAD_SIZE = 2000000000;
    private int                 BUFFER_LENGTH          = 1024;

    List<DropZoneWrapper>                   localDropZones  = null;
    private static Logger               log = Logger.getLogger(HPCCFileSprayClient.class.getName());

    static
    {
        try
        {
            FileSprayStub defstub = new FileSprayStub();
            Options opt = defstub._getServiceClient().getOptions();
            ORIGINALURL = new URL(opt.getTo().getAddress());
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }

    //from HPCC-Platform/dali/dfu/dfuwu.hpp DFUfileformat
    public enum SprayVariableFormat
    {
        DFUff_fixed(0),
        DFUff_csv(1),
        DFUff_ascii(1),
        DFUff_utf8(2),
        DFUff_utf8n(3),
        DFUff_utf16(4),
        DFUff_utf16le(5),
        DFUff_utf16be(6),
        DFUff_utf32(7),
        DFUff_utf32le(8),
        DFUff_utf32be(9),
        DFUff_variable(10),
        DFUff_recfmvb(11),
        DFUff_recfmv(12),
        DFUff_variablebigendian(13);

        private final int id;
        SprayVariableFormat(int id) { this.id = id; }
        public int getValue() { return id; }

        private final static HashMap<String, SprayVariableFormat> mapVariableSprayFormatNameCode = new HashMap<String, SprayVariableFormat>();
        static
        {
            mapVariableSprayFormatNameCode.put("csv",                SprayVariableFormat.DFUff_csv);
            mapVariableSprayFormatNameCode.put("ascii",              SprayVariableFormat.DFUff_ascii);
            mapVariableSprayFormatNameCode.put("utf8",               SprayVariableFormat.DFUff_utf8);
            mapVariableSprayFormatNameCode.put("utf16",              SprayVariableFormat.DFUff_utf16);
            mapVariableSprayFormatNameCode.put("utf16le",            SprayVariableFormat.DFUff_utf16le);
            mapVariableSprayFormatNameCode.put("utf16be",            SprayVariableFormat.DFUff_utf16be);
            mapVariableSprayFormatNameCode.put("utf32",              SprayVariableFormat.DFUff_utf32);
            mapVariableSprayFormatNameCode.put("utf32le",            SprayVariableFormat.DFUff_utf32le);
            mapVariableSprayFormatNameCode.put("utf32be",            SprayVariableFormat.DFUff_utf32be);
            mapVariableSprayFormatNameCode.put("variable",           SprayVariableFormat.DFUff_variable);
            mapVariableSprayFormatNameCode.put("recfmvb",            SprayVariableFormat.DFUff_recfmvb);
            mapVariableSprayFormatNameCode.put("recfmv",             SprayVariableFormat.DFUff_recfmv);
            mapVariableSprayFormatNameCode.put("variablebigendian",  SprayVariableFormat.DFUff_variablebigendian);
            mapVariableSprayFormatNameCode.put("fixed",              SprayVariableFormat.DFUff_fixed);
        }

        public static SprayVariableFormat convertVarSprayFormatName2Code(String varSprayFormatName)
        {
            String lower = varSprayFormatName.toLowerCase();
            if(mapVariableSprayFormatNameCode.containsKey(lower))
                return mapVariableSprayFormatNameCode.get(lower);
            else
                return SprayVariableFormat.DFUff_fixed;
        }
    }

    public static HPCCFileSprayClient get(Connection connection)
    {
        return new HPCCFileSprayClient(connection);
    }

    public static HPCCFileSprayClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        return new HPCCFileSprayClient(conn);
    }

    public static HPCCFileSprayClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCFileSprayClient(conn);
    }

    protected HPCCFileSprayClient(Connection baseConnection)
    {
        initWsFileSprayStub(baseConnection);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param connection -- All connection settings included
     */
    private void initWsFileSprayStub(Connection connection)
    {
        try
        {
            fsconn = connection;
            stub = setStubOptions(new FileSprayStub(connection.getBaseUrl()+FILESPRAYWSDLURI), connection);
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

    public boolean ping() throws Exception
    {
        verifyStub();

        FileSprayPingRequest request = new FileSprayPingRequest();

        try
        {
            ((FileSprayStub)stub).ping(request);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }

    /**
     * @return the upload file buffer length
     */
    public int getFileUploadReadBufferLength()
    {
        return BUFFER_LENGTH;
    }

    /**
     * Set the buffer length used to read files during upload process
     * @param length
     */
    public void setFileUploadReadBufferLength(int length)
    {
        BUFFER_LENGTH = length;
    }

    /**
     * @param progressResponseWrapper
     * @param maxRetries
     * @param milliesBetweenRetry
     * @return
     * @throws Exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     */
    public boolean handleSprayResponse(ProgressResponseWrapper progressResponseWrapper, int maxRetries, int milliesBetweenRetry) throws Exception, org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
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
                    //this should be in a dedicated thread.
                    for  (int i = 0; i < maxRetries && progressResponse.getPercentDone() < 100 && !progressResponse.getState().equalsIgnoreCase("FAILED"); i++)
                    {
                        log.debug(progressResponse.getProgressMessage());
                        progressResponse = getDfuProgress(progressResponseWrapper.getWuid());

                        try
                        {
                            if (milliesBetweenRetry <= 0)
                                milliesBetweenRetry = 100;

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

                log.info("Spray attempt completed, verify DWUID: " +progressResponseWrapper.getWuid());
            }
        }
        return success;
    }

    /**
     * Convinience static method, crates new delmited data format descriptor. Parameters not provided are csv defaulted
     * @param recordTerminator
     * @param fieldDelimiter
     * @param escapeSequence
     * @param quote
     * @return
     */
    static public DelimitedDataOptions createDelimitedDataOptionsObject(String recordTerminator, String fieldDelimiter, String escapeSequence, String quote)
    {
        return new DelimitedDataOptions(recordTerminator, fieldDelimiter, escapeSequence, quote);
    }

    /*sample response:
     * <?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wsse="http://schemas.xmlsoap.org/ws/2002/04/secext">
 <soap:Body>
  <DropZoneFilesResponse xmlns="urn:hpccsystems:ws:filespray">
   <NetAddress>10.0.2.15</NetAddress>
   <Path>/var/lib/HPCCSystems/mydropzone/</Path>
   <OS>1</OS>
   <DropZones>
    <DropZone>
     <Name>mydropzone</Name>
     <NetAddress>10.0.2.15</NetAddress>
     <Path>/var/lib/HPCCSystems/mydropzone</Path>
     <Computer>localhost</Computer>
     <Linux>true</Linux>
    </DropZone>
   </DropZones>
   <Files>
    <PhysicalFileStruct>
     <name>eula.1028.txt</name>
     <isDir>0</isDir>
     <filesize>17734</filesize>
     <modifiedtime>2014-04-03 15:17:54</modifiedtime>
    </PhysicalFileStruct>
   </Files>
  </DropZoneFilesResponse>
 </soap:Body>
</soap:Envelope>
     */

    /**
     * @return List of all local drop zones on target HPCC system
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public List<DropZoneWrapper> fetchLocalDropZones() throws Exception, ArrayOfEspExceptionWrapper
    {
        return fetchDropZones("localhost");
    }

    /**
     * @param dropzoneNetAddress
     * @return list of all dropzones on dropzoneNetAddress
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
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
            resp = ((FileSprayStub)stub).dropZoneFiles(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCFileSprayClient.fetchDropzones("+dropzoneNetAddress+") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not FetchDropzones");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not FetchDropzones");

        List<DropZoneWrapper> dropZonesWrapper = null;
        if (resp.getDropZones() != null)
        {
            dropZonesWrapper =new ArrayList<DropZoneWrapper>();
            DropZone[] dropZone = resp.getDropZones().getDropZone();
            for (int i = 0; i < dropZone.length; i++)
            {
                dropZonesWrapper.add(new DropZoneWrapper(dropZone[i]));
            }
        }

        return dropZonesWrapper;
    }

    public String copyFile(String from,String to, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper 
    {
        verifyStub();
        Copy cp=new Copy();
        cp.setSourceLogicalName(from);
        cp.setDestLogicalName(to);
        cp.setOverwrite(overwrite);
        CopyResponse resp=null;
        try
        {
            resp = ((FileSprayStub)stub).copy(cp);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCFileSprayClient.copy(from,to,overwrite) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not copy file");
        }

        if (resp != null && resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not Copy File");

        return resp.getResult();
    }
    
    public DropZoneFilesResponseWrapper fetchDropZones(String dzname, String netaddress, String os, String path, String subfolder, boolean dironly, boolean watchvisibleonely) throws Exception, ArrayOfEspExceptionWrapper
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

    public DropZoneFilesResponseWrapper fetchDropZones(DropZoneFilesRequestWrapper szrequest) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (szrequest == null)
            throw new Exception("DropZoneFilesRequestWrapper null detected");

        verifyStub();

        DropZoneFilesResponse resp = null;
        try
        {
            resp = ((FileSprayStub)stub).dropZoneFiles(szrequest.getRaw());
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCFileSprayClient.fetchDropzones(DropZoneFilesRequestWrapper) encountered RemoteException.", e);
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
     * Perform HPCC Drop Zone file search
     * @param dzname - Required, the name of the Drop Zone to query
     * @param netaddr - Required, the netaddress of the Drop Zone node to query
     * @param namefilter - Required, the wildcard based name-filter to query
     * @return
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public PhysicalFileStruct [] dzFileSearch(String dzname, String netaddr, String namefilter) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        DropZoneFileSearchRequest request = new DropZoneFileSearchRequest();

        request.setDropZoneName(dzname);
        request.setNameFilter(namefilter);
        request.setServer(netaddr);

        DropZoneFileSearchResponse resp = null;

        try
        {
            resp = ((FileSprayStub)stub).dropZoneFileSearch(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCFileSprayClient.dzFileSearch(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform DZFileSearch");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not perform DZFileSearch");

         return resp.getFiles().getPhysicalFileStruct();
    }

    /**
     * Fetch list of files on a given dropzone's machine on the target HPCC System
     * Note: a logical dropzone can contain multiple machines
     * @param netAddress      - Address of specific dropzone instance
     * @param path            - The dropzone zone path on the local filesystem
     * @param OS              - Optional, OS code
     * @return                - Array of file descriptors
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public List<PhysicalFileStructWrapper> listFiles(String netAddress, String path, String OS) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        FileListRequest request = new FileListRequest();

        request.setNetaddr(netAddress);
        request.setPath(path);
        if (OS != null)
            request.setOS(OS);

        FileListResponse resp = null;

        try
        {
            resp = ((FileSprayStub)stub).fileList(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCFileSprayClient.listFiles(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not ListFiles");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not ListFiles");

        List<PhysicalFileStructWrapper> physicalFileStructWrappers = new ArrayList<PhysicalFileStructWrapper>();

        PhysicalFileStruct[] physicalFileStruct = resp.getFiles().getPhysicalFileStruct();
        if (physicalFileStruct != null && physicalFileStruct.length > 0)
        {
            for (int i = 0; i < physicalFileStruct.length; i++)
            {
                physicalFileStructWrappers.add(new PhysicalFileStructWrapper(physicalFileStruct[i]));
            }
        }

        return physicalFileStructWrappers;
    }

    /**
     *  * Spray default CSV variable/delimited HPCC file, from the given dropzone address onto given cluster group.
     * @param dropzoneNetAddress
     * @param sourceFileName
     * @param targetFileName
     * @param prefix
     * @param destGroup
     * @param overwrite
     * @return                 - Progress response at time of request
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public ProgressResponseWrapper sprayVariable(String dropzoneNetAddress, String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper
    {
        DelimitedDataOptions defaultcsv = new DelimitedDataOptions();
        return sprayVariable(dropzoneNetAddress, defaultcsv, sourceFileName, targetFileName, prefix, destGroup, overwrite);
    }

    /**
     * Spray variable/delimited HPCC file described in the give delimited data options, from the given dropzone address onto given cluster group.
     *
     * @param dropzoneNetAddress
     * @param options
     * @param sourceFileName
     * @param targetFileName
     * @param prefix
     * @param destGroup
     * @param overwrite
     * @return                 - Progress response at time of request
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public ProgressResponseWrapper sprayVariable(String dropzoneNetAddress,  DelimitedDataOptions options, String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<DropZoneWrapper> targetDropZones = fetchDropZones(dropzoneNetAddress);

        if (targetDropZones == null)
            throw new Exception("Could not fetch target Dropzone");

        return sprayVariable(options, targetDropZones.get(0), sourceFileName, targetFileName, prefix, destGroup, overwrite);
    }

    /**
     * Spray variable/delimited HPCC file described in the give delimited data options, from local dropzone onto given cluster group.
     * @param options
     * @param sourceFileName
     * @param targetFileName
     * @param prefix
     * @param destGroup
     * @param overwrite
     * @param format           - SprayVariableFormat object describing the file format
     * @return                 - Progress response at time of request
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public ProgressResponseWrapper sprayVariableLocalDropZone(DelimitedDataOptions options, String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite, SprayVariableFormat format) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (localDropZones == null)
            localDropZones = fetchLocalDropZones();

        return sprayVariable(options, localDropZones.get(0), sourceFileName, targetFileName, prefix, destGroup, overwrite, format, null, null, null, null, null, null, null);
    }

    /**
     * Spray variable/delimited HPCC file described in the give delimited data options, from given dropzone onto given cluster group.
     * @param options
     * @param targetDropZone
     * @param sourceFileName
     * @param targetFileName
     * @param prefix
     * @param destGroup
     * @param overwrite
     * @return                 - Progress response at time of request
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public ProgressResponseWrapper sprayVariable(DelimitedDataOptions options, DropZoneWrapper targetDropZone, String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper
    {
        return sprayVariable(options, targetDropZone, sourceFileName, targetFileName, prefix, destGroup, overwrite, SprayVariableFormat.DFUff_csv, null, null, null, null, null, null, null);
    }

    /**
     * Spray variable/delimited HPCC file described in the give delimited data options, from given dropzone onto given cluster group.
     * @param options
     * @param targetDropZone
     * @param sourceFileName
     * @param targetFileName
     * @param prefix
     * @param destGroup
     * @param overwrite
     * @param format           - SprayVariableFormat object describing the file format
     * @param sourceMaxRecordSize
     * @param maxConnections
     * @param compress
     * @param replicate
     * @param failIfNoSourceFile
     * @param recordStructurePresent
     * @param expireDays
     * @return                 - Progress response at time of request
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public ProgressResponseWrapper sprayVariable(DelimitedDataOptions options, DropZoneWrapper targetDropZone, String sourceFileName, String targetFileName, String prefix,
                                          String destGroup, boolean overwrite, SprayVariableFormat format, Integer sourceMaxRecordSize, Integer maxConnections,
                                          Boolean compress, Boolean replicate, Boolean failIfNoSourceFile, Boolean recordStructurePresent, Integer expireDays) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        if (targetDropZone == null)
            throw new Exception("TargetDropZone object not available!");

        SprayVariable request = new SprayVariable();

        request.setSourceIP(targetDropZone.getNetAddress());
        request.setSourcePath(targetDropZone.getPath()+"/"+sourceFileName);
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

        if (sourceMaxRecordSize != null)
            request.setSourceMaxRecordSize(sourceMaxRecordSize);
        if (maxConnections != null)
            request.setMaxConnections(maxConnections);
        if (replicate != null)
            request.setReplicate(replicate);
        if (compress != null)
            request.setCompress(compress);
        if (failIfNoSourceFile != null)
            request.setFailIfNoSourceFile(failIfNoSourceFile);
        if (recordStructurePresent != null)
            request.setRecordStructurePresent(recordStructurePresent);
        if (expireDays != null)
            request.setExpireDays(expireDays);

        SprayResponse resp = null;

        try
        {
            resp = ((FileSprayStub)stub).sprayVariable(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCFileSprayClient.sprayVariable(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not SprayVariable");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not SprayVariable");

        return getDfuProgress(resp.getWuid());
    }

    /**
     * Spray XML data file from the first local dropzone onto given cluster group.
     * defaults to first local dropzone, row tag to "tag", source format to "ASCII"
     * default max record size
     *
     * @param sourceFileName
     * @param targetFileName
     * @param prefix
     * @param destGroup
     * @param overwrite
     * @return ProgressResponse
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public ProgressResponseWrapper sprayLocalXML(String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (localDropZones == null)
            localDropZones = fetchLocalDropZones();

        return sprayXML(localDropZones.get(0), sourceFileName, targetFileName, prefix, destGroup, "tag", overwrite, SprayVariableFormat.DFUff_ascii, null, null, null, null, null, null);
    }

    /**
     * Spray XML data file from the first local dropzone onto given cluster group.
     *
     * @param sourceFileName
     * @param targetFileName
     * @param prefix
     * @param destGroup
     * @param overwrite
     * @param format
     * @param rowtag
     * @param maxrecsize
     * @return ProgressResponse
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public ProgressResponseWrapper sprayLocalXML(String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite, SprayVariableFormat format, String rowtag, Integer maxrecsize) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (localDropZones == null)
            localDropZones = fetchLocalDropZones();

        return sprayXML(localDropZones.get(0), sourceFileName, targetFileName, prefix, destGroup, rowtag, overwrite, format, maxrecsize, null, null, null, null, null);
    }

    /**
     * Spray XML data file from the given dropzone onto given cluster group.
     *
     * @param targetDropZone
     * @param sourceFileName
     * @param targetFileName
     * @param prefix
     * @param destGroup
     * @param overwrite
     * @param format
     * @param maxrecsize
     * @param rowtag
     * @param maxConnections
     * @param replicate
     * @param compress
     * @param failIfNoSourceFile
     * @param expireDays
     * @return ProgressResponse
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public ProgressResponseWrapper sprayXML(DropZoneWrapper targetDropZone, String sourceFileName, String targetFileName, String prefix, String destGroup, String rowtag,
                                     boolean overwrite, SprayVariableFormat format, Integer maxrecsize, Integer maxConnections, Boolean replicate,
                                     Boolean compress, Boolean failIfNoSourceFile, Integer expireDays) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        if (targetDropZone == null)
            throw new Exception("TargetDropZone object not available!");

        SprayVariable request = new SprayVariable();

        request.setDestGroup(destGroup);
        request.setSourceIP(targetDropZone.getNetAddress());
        request.setSourcePath(targetDropZone.getPath()+"/"+sourceFileName);
        request.setDestLogicalName(targetFileName);
        request.setOverwrite(overwrite);
        request.setSourceFormat(format.getValue());
        request.setSourceMaxRecordSize(maxrecsize);
        request.setSourceRowTag(rowtag);

        if (maxConnections != null)
            request.setMaxConnections(maxConnections);
        if (replicate != null)
            request.setReplicate(replicate);
        if (compress != null)
            request.setCompress(compress);
        if (failIfNoSourceFile != null)
            request.setFailIfNoSourceFile(failIfNoSourceFile);
        if (expireDays != null)
            request.setExpireDays(expireDays);

        SprayResponse resp = null;

        try
        {
            resp = ((FileSprayStub)stub).sprayVariable(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCFileSprayClient.sprayXML(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not SprayXML");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not SprayXML");

        return getDfuProgress(resp.getWuid());
    }

    /**
     * Spray fixed file from first dropzone encountered on the given dropzone net address
     * @param dropzoneNetAddress
     * @param sourceFileName
     * @param recordSize
     * @param targetFileLabel
     * @param prefix
     * @param destGroup
     * @param overwrite
     * @return                 - Progress response at time of request
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public ProgressResponseWrapper sprayFixed(String dropzoneNetAddress, String sourceFileName, int recordSize, String targetFileLabel, String prefix, String destGroup, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<DropZoneWrapper> targetDropZones = fetchDropZones(dropzoneNetAddress);

        if (targetDropZones == null)
            throw new Exception("Could not fetch target Dropzone");

        return sprayFixed(targetDropZones.get(0), sourceFileName, recordSize, targetFileLabel, prefix, destGroup, overwrite, null, false, false, false, -1, null, null, null, null, null, null );
    }

    /**
     * Spray fixed file from first local dropzone encountered onto destination cluster group
     * @param sourceFileName
     * @param recordSize
     * @param targetFileLabel
     * @param prefix
     * @param destGroup
     * @param overwrite
     * @return                 - Progress response at time of request
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public ProgressResponseWrapper sprayFixedLocalDropZone(String sourceFileName, int recordSize, String targetFileLabel, String prefix, String destGroup, boolean overwrite) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (localDropZones == null)
            localDropZones = fetchLocalDropZones();

        return sprayFixed(localDropZones.get(0), sourceFileName, recordSize, targetFileLabel, prefix, destGroup, overwrite, null, false, false, false, -1, null, null, null, null, null, null );
    }

    /**
     * Spray fixed file from the given target dropzone onto cluster destionation group
     *
     * @param targetDropZone
     * @param sourceFileName
     * @param recordSize
     * @param targetFileLabel
     * @param prefix
     * @param destGroup
     * @param overwrite
     * @param maxConnections
     * @param compress
     * @param replicate
     * @param failIfNoSourceFile
     * @param expireDays
     * @param decryptKey
     * @param encryptKey
     * @param nosplit
     * @param recordStructurePresent
     * @param transferBufferSize
     * @param wrap
     * @return                 - Progress response at time of request
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public ProgressResponseWrapper sprayFixed(DropZoneWrapper targetDropZone, String sourceFileName, int recordSize, String targetFileLabel, String prefix, String destGroup, boolean overwrite,
                                       Integer maxConnections, Boolean compress, Boolean replicate, Boolean failIfNoSourceFile, Integer expireDays, String decryptKey, String encryptKey,
                                       Boolean nosplit, Boolean recordStructurePresent, Integer transferBufferSize, Boolean wrap) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        if (targetDropZone == null)
            throw new Exception("TargetDropZone object not available!");

        SprayFixed request = new SprayFixed();

        request.setDestGroup(destGroup);
        request.setSourceRecordSize(recordSize);
        request.setSourceIP(targetDropZone.getNetAddress());
        request.setSourcePath(targetDropZone.getPath()+"/"+sourceFileName);
        request.setDestLogicalName(targetFileLabel);
        request.setOverwrite(overwrite);
        request.setPrefix(prefix);
        if (maxConnections != null)
            request.setMaxConnections(maxConnections);
        if (compress != null)
            request.setCompress(compress);
        if (replicate != null)
            request.setReplicate(replicate);
        if (failIfNoSourceFile != null)
            request.setFailIfNoSourceFile(failIfNoSourceFile);
        if (expireDays != null)
            request.setExpireDays(expireDays);
        if (decryptKey != null && !decryptKey.isEmpty())
            request.setDecrypt(decryptKey);
        if (encryptKey != null && !encryptKey.isEmpty())
            request.setEncrypt(encryptKey);
        if (nosplit != null)
            request.setNosplit(nosplit);
        if (recordStructurePresent != null)
            request.setRecordStructurePresent(recordStructurePresent);
        if (transferBufferSize != null)
            request.setTransferBufferSize(transferBufferSize);
        if (wrap != null)
            request.setWrap(wrap);

        SprayFixedResponse resp = null;

        try
        {
            resp = ((FileSprayStub)stub).sprayFixed(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCFileSprayClient.sprayFixed(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not SprayFixed");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not SprayFixed");

        return getDfuProgress(resp.getWuid());
     }

    /**
     * Get progress report for given DFU Work Unit
     * @param dfuwuid      - The DFU Work unit number
     * @return             - The Progress report at time of request
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public ProgressResponseWrapper getDfuProgress(String dfuwuid) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        ProgressRequest request = new ProgressRequest();

        request.setWuid(dfuwuid);

        ProgressResponse resp = null;

        try
        {
            resp = ((FileSprayStub)stub).getDFUProgress(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCFileSprayClient.getDfuProgress(" + dfuwuid +") encountered RemoteException.", e);
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
     * @param file
     *            - The File to upload
     * @param targetDropzoneAddress
     *            - The target dropzone address
     * @return - Boolean, success
     * @throws ArrayOfEspExceptionWrapper
     */
    public boolean uploadFile(File file, String targetDropzoneAddress) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<DropZoneWrapper> dropZones = fetchDropZones(targetDropzoneAddress);
        if (dropZones == null || dropZones.size() <= 0)
            throw new Exception("Could not fetch target dropzone information");
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
     * @throws ArrayOfEspExceptionWrapper
     */
    public boolean uploadFileLocalDropZone(File file) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<DropZoneWrapper> fetchLocalDropZones = fetchLocalDropZones();
        if (fetchLocalDropZones == null || fetchLocalDropZones.size() <= 0)
            throw new Exception("Could not fetch local dropzone information");
        return uploadFile(file, fetchLocalDropZones.get(0));
    }

    /**
     * UPLOADS A FILE( UP TO 2GB FILE SIZES) TO THE SPECIFIED LANDING ZONE
     * @param uploadFile
     *            - The File to upload
     * @param dropZone
     *            - The target dropzone
     * @return - Boolean, success
     */
    public boolean uploadLargeFile(File uploadFile, DropZoneWrapper dropZone)
    {
        if (uploadFile == null || dropZone == null){
            return false;
        }

        Boolean returnValue = true;
        URLConnection fileUploadConnection = null;
        URL fileUploadURL = null;
        String uploadurlbuilder = UPLOADURI;
        uploadurlbuilder += "&NetAddress=" + dropZone.getNetAddress();
        uploadurlbuilder += "&Path=" + dropZone.getPath();
        uploadurlbuilder += "&OS=" + (Utils.currentOSisLinux() ? "1" : "0");
        WritableByteChannel outchannel = null;
        FileChannel inChannel = null;
        OutputStream output = null;
        InputStream input = null;
        RandomAccessFile aFile = null;

        try
        {
            String boundary = Utils.createBoundary();
            fileUploadURL = new URL(fsconn.getUrl() + uploadurlbuilder);
            fileUploadConnection = Connection.createConnection(fileUploadURL);
            fileUploadConnection = fileUploadURL.openConnection();
            fileUploadConnection.setDoOutput(true);
            fileUploadConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
            fileUploadConnection.setRequestProperty("Authorization", fsconn.getBasicAuthString());
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

            StringBuffer response = new StringBuffer();
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
     * @param dropZones
     *            - The target HPCC file dropzone
     * @return - Boolean, success
     * @throws Exception
     */
    private boolean uploadFile(File file, DropZoneWrapper dropZone) throws Exception
    {
        if (file == null)
            return false;
        String filename = file.getName();
        long length = file.length();

        if (length > MAX_FILE_WSUPLOAD_SIZE)
            throw new Exception("Uploading files of this magnitude is not supported, use SFTP based functions");

        InputStream fileInput = null;
        OutputStream uploadOutStream = null;
        URLConnection fileUploadConnection = null;
        URL fileUploadURL = null;
        String boundary = Utils.createBoundary();
        try
        {
            if (dropZone == null)
                throw new Exception("Dropzone information not available");

            String uploadurlbuilder = UPLOADURI;
            uploadurlbuilder += "&NetAddress=" + dropZone.getNetAddress();
            uploadurlbuilder += "&Path=" + dropZone.getPath();
            uploadurlbuilder += "&OS=" + (Utils.currentOSisLinux() ? "1" : "0");
            fileUploadURL = new URL(fsconn.getUrl() + uploadurlbuilder);
            fileUploadConnection = Connection.createConnection(fileUploadURL);

            if (fsconn.hasCredentials())
            {
                fileUploadConnection.setRequestProperty("Authorization", fsconn.getBasicAuthString());
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
                log.error("HTTP Error reported on File upload related to a server redirect (" + fileUploadURL + " vs " + fileUploadConnection.getURL() + "), please verify on server.", e);
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
            catch (IOException e){}

            if (uploadOutStream != null)
            {
                try
                {
                    uploadOutStream.close();
                }
                catch (IOException e){}
            }
        }
        return true;
    }

    /**
     * Attempts to download the specified file from a dropzone
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
     * Attempts to download the specified file from a dropzone
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
                        throw new Exception("Specified file name: " + fileName
                                + ", is a directory. Downloading directories is unsupported.");
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
            downloadURL = new URL(
                    fsconn.getUrl() + DOWNLOAD_URI + "Name=" + fileName + "&NetAddress=" + dropZone.getNetAddress()
                            + "&Path=" + dropZone.getPath() + "&OS=" + (Utils.currentOSisLinux() ? "1" : "0"));
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
            log.warn("File download fewer bytes transferred than expected. Transferred: "
                      + bytesTransferred + " Expected: " + fileSize);
        }

        return bytesTransferred;
    }

    /**
     * Attempts to upload given file to HPCC Systems on the first dropzone encountered at the target HPCCSystem address
     * @param localFileName                  - The File to upload
     * @param targetFilename (optional)      - The desired name for the uploaded file
     * @param machineLoginUserName           - The user account name to log on to the target machine
     * @param password                       - The user account password to log on to the target machine
     * @throws ArrayOfEspExceptionWrapper
     */
    public void sftpPutFileOnTargetLandingZone(String localFileName, String targetFilename, String machineLoginUserName, String password) throws Exception, ArrayOfEspExceptionWrapper
    {
        sftpPutFileOnTargetLandingZone(localFileName, fsconn.getHost(), targetFilename, machineLoginUserName, password, null);
    }

    /**
     * Attempts to upload given file to HPCC Systems on the first dropzone encountered at the target HPCCSystem address
     * @param localFileName                  - The File to upload
     * @param targetFilename (optional)      - The desired name for the uploaded file
     * @param machineLoginUserName           - The user account name to log on to the target machine
     * @param password                       - The user account password to log on to the target machine
     * @param connconfig (optional)          - Connection config options
     * @throws ArrayOfEspExceptionWrapper
     */
    public void sftpPutFileOnTargetLandingZone(String localFileName, String targetFilename, String machineLoginUserName, String password, Properties connconfig) throws Exception, ArrayOfEspExceptionWrapper
    {
        sftpPutFileOnTargetLandingZone(localFileName, fsconn.getHost(), targetFilename, machineLoginUserName, password, connconfig);
    }

    /**
     * Attempts to upload given file to HPCC Systems on the first dropzone encountered at the given address
     * @param localFileName                  - The File to upload
     * @param targetDropzoneAddress          - The target landing zone ip address
     * @param targetFilename (optional)      - The desired name for the uploaded file
     * @param machineLoginUserName           - The user account name to log on to the target machine
     * @param password                       - The user account password to log on to the target machine
     * @param connconfig (optional)          - Connection config options
     * @throws ArrayOfEspExceptionWrapper
     */
    public void sftpPutFileOnTargetLandingZone(String localFileName, String targetDropzoneAddress, String targetFilename, String machineLoginUserName, String password, Properties connconfig) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<DropZoneWrapper> dropZones = fetchDropZones(targetDropzoneAddress);
        if (dropZones == null || dropZones.size() <= 0)
            throw new Exception("Could not fetch target dropzone information");

        Sftp.lzPut(localFileName, targetDropzoneAddress, dropZones.get(0).getPath(), targetFilename, machineLoginUserName, password, dropZones.get(0).getLinux().equals("true"), connconfig);
    }

    /**
     * Attempts to fetch information regarding a DFU Workunit
     *
     * @param workunitid
     * @return
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public GetDFUWorkunitResponseWrapper getDFUWorkunit(String workunitid) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        GetDFUWorkunit request = new GetDFUWorkunit();

        request.setWuid(workunitid);

        GetDFUWorkunitResponse response = null;
        try
        {
            response = ((FileSprayStub)stub).getDFUWorkunit(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCFileSprayClient.getDFUWorkunit("+workunitid+") encountered RemoteException.", e);
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
     * Attempts to fetch list of DFU Workunits
     *
     * @param cluster
     * @param pagesize
     * @return
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
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
            response = ((FileSprayStub)stub).getDFUWorkunits(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCFileSprayClient.getDFUWorkunits("+cluster+","+pagesize+") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform GetDFUWorkunits");
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not perform GetDFUWorkunits");

        return new GetDFUWorkunitsResponseWrapper(response);
    }

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
            catch(Exception e)
            {
                thatopt = null;
            }

            if (thatopt == null)
                return false;

            EqualsUtil.areEqual(getFileUploadReadBufferLength(), that.getFileUploadReadBufferLength());
        }

        return eq;
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        return HashCodeUtil.hash(result, getFileUploadReadBufferLength());
    }
}

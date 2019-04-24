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
import java.util.HashMap;
import java.util.Properties;

import org.apache.axis.client.Stub;
import org.apache.log4j.Logger;
import org.hpccsystems.ws.client.gen.filespray.v1_17.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.filespray.v1_17.DropZone;
import org.hpccsystems.ws.client.gen.filespray.v1_17.DropZoneFileSearchRequest;
import org.hpccsystems.ws.client.gen.filespray.v1_17.DropZoneFileSearchResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_17.DropZoneFilesRequest;
import org.hpccsystems.ws.client.gen.filespray.v1_17.DropZoneFilesResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_17.EspException;
import org.hpccsystems.ws.client.gen.filespray.v1_17.FileListRequest;
import org.hpccsystems.ws.client.gen.filespray.v1_17.FileListResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_17.FileSprayLocator;
import org.hpccsystems.ws.client.gen.filespray.v1_17.FileSprayServiceSoap;
import org.hpccsystems.ws.client.gen.filespray.v1_17.FileSprayServiceSoapProxy;
import org.hpccsystems.ws.client.gen.filespray.v1_17.GetDFUWorkunit;
import org.hpccsystems.ws.client.gen.filespray.v1_17.GetDFUWorkunitResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_17.GetDFUWorkunits;
import org.hpccsystems.ws.client.gen.filespray.v1_17.GetDFUWorkunitsResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_17.PhysicalFileStruct;
import org.hpccsystems.ws.client.gen.filespray.v1_17.ProgressRequest;
import org.hpccsystems.ws.client.gen.filespray.v1_17.ProgressResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_17.SprayFixed;
import org.hpccsystems.ws.client.gen.filespray.v1_17.SprayFixedResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_17.SprayResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_17.SprayVariable;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.DelimitedDataOptions;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Sftp;
import org.hpccsystems.ws.client.utils.Utils;

/**
 * Use as soap client for HPCC wsFileSpray web service.
 * This includes uploading files to dropzone, listing files in a dropzone,
 * spraying files from dropzone and more.
 * This class can be enhanced to provide further service calls.
 *
 */
public class HPCCFileSprayClient extends DataSingleton
{
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

    private static URL                  originalURL;
    private static Logger               log = Logger.getLogger(HPCCFileSprayClient.class.getName());

    public static URL getOriginalURL() throws MalformedURLException
    {
        if (originalURL == null)
            originalURL = new URL(getOriginalWSDLURL());

        return originalURL;
    }

    public static int getOriginalPort() throws MalformedURLException
    {
        return getOriginalURL().getPort();
    }

    public static HPCCFileSprayClient get(Connection connection)
    {
        return new HPCCFileSprayClient(connection);
    }

    private static final String FILESPRAYWSDLURI     = "/FileSpray";
    private static final String UPLOADURI           = FILESPRAYWSDLURI + "/UploadFile?upload_";
    private static final String DOWNLOAD_URI        = FILESPRAYWSDLURI + "/DownloadFile?";

    private int BUFFER_LENGTH = 1024;
    private static final long MAX_FILE_WSUPLOAD_SIZE = 2000000000;

    FileSprayServiceSoapProxy     fileSprayServiceSoapProxy    =  null;
    DropZone[] localDropZones = null;
    Connection fsconn;

    private boolean verbose = false;

    /**
     * @param verbose - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Provides soapproxy object for HPCCFileSprayClient which can be used to access
     * the web service methods directly
     * @return  soapproxy for HPCCFileSprayClient
     * @throws Exception if soapproxy not available
     */
    public FileSprayServiceSoapProxy getSoapProxy() throws Exception
    {
        if (fileSprayServiceSoapProxy != null)
            return fileSprayServiceSoapProxy;
        else
            throw new Exception("FileSpray Service Soap Proxy not available.");
    }

    /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static String getOriginalWSDLURL()
    {
        return (new FileSprayLocator()).getFileSprayServiceSoapAddress();
    }

    protected HPCCFileSprayClient(Connection baseConnection)
    {
       this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection.getUserName(), baseConnection.getPassword());
       fsconn = baseConnection;
    }

    protected HPCCFileSprayClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort);
        initWsFileSpraySoapProxy(address, user, pass);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL   Target service base URL
     * @param user      User credentials
     * @param pass      User credentials
     */
    private void initWsFileSpraySoapProxy(String baseURL, String user, String pass)
    {
        fileSprayServiceSoapProxy = new FileSprayServiceSoapProxy(baseURL + FILESPRAYWSDLURI);

        if (fileSprayServiceSoapProxy != null)
        {
            FileSprayServiceSoap fileSprayServiceSoap = fileSprayServiceSoapProxy.getFileSprayServiceSoap();
            if (fileSprayServiceSoap != null)
            {
                if (user != null && pass != null)
                    Connection.initStub((Stub) fileSprayServiceSoap, user, pass);
            }
        }
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
     */
    public DropZone[] fetchLocalDropZones() throws Exception
    {
        return fetchDropZones("localhost");
    }

    /**
     * @param dropzoneNetAddress
     * @return list of all dropzones on dropzoneNetAddress
     * @throws Exception
     */
    public DropZone[] fetchDropZones(String dropzoneNetAddress) throws Exception
    {
        getSoapProxy();

        DropZoneFilesRequest dzfr = new DropZoneFilesRequest();
        dzfr.setNetAddress(dropzoneNetAddress);
        dzfr.setDirectoryOnly(false);

        DropZoneFilesResponse resp = fileSprayServiceSoapProxy.dropZoneFiles(dzfr);
        ArrayOfEspException exceptions = resp.getExceptions();
        if (exceptions != null)
        {
            for (EspException espexception : exceptions.getException())
            {
                throw new Exception("Error fetching dropzone info: " + espexception.getSource() + espexception.getMessage());
            }
        }

        return  resp.getDropZones();
    }

    /**
     * Perform HPCC Drop Zone file search
     * @param dzname - Required, the name of the Drop Zone to query
     * @param netaddr - Required, the netaddress of the Drop Zone node to query
     * @param namefilter - Required, the wildcard based name-filter to query
     * @return
     * @throws Exception
     */
    public PhysicalFileStruct [] dzFileSearch(String dzname, String netaddr, String namefilter) throws Exception
    {
        getSoapProxy();

        DropZoneFileSearchRequest req = new DropZoneFileSearchRequest();
        req.setDropZoneName(dzname);
        req.setNameFilter(namefilter);
        req.setServer(netaddr);

        DropZoneFileSearchResponse resp = fileSprayServiceSoapProxy.dropZoneFileSearch(req);

         ArrayOfEspException exceptions = resp.getExceptions();
         if (exceptions != null)
         {
             for (EspException espexception : exceptions.getException())
             {
                 throw new Exception("Error fetching dropzone file info: " + espexception.getSource() + espexception.getMessage());
             }
         }
         return resp.getFiles();
    }

    /**
     * Fetch list of files on a given dropzone's machine on the target HPCC System
     * Note: a logical dropzone can contain multiple machines
     * @param netAddress      - Address of specific dropzone instance
     * @param path            - The dropzone zone path on the local filesystem
     * @param OS              - Optional, OS code
     * @return                - Array of file descriptors
     * @throws Exception
     */
    public PhysicalFileStruct[] listFiles(String netAddress, String path, String OS) throws Exception
    {
        getSoapProxy();

        FileListRequest flr = new FileListRequest();
        flr.setNetaddr(netAddress);
        flr.setPath(path);
        if (OS != null)
            flr.setOS(OS);

        FileListResponse resp = fileSprayServiceSoapProxy.fileList(flr);
        ArrayOfEspException exceptions = resp.getExceptions();
        if (exceptions != null)
        {
            for (EspException espexception : exceptions.getException())
            {
                throw new Exception("Error fetching dropzone file info: " + espexception.getSource() + espexception.getMessage());
            }
        }

        return resp.getFiles();
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
     */
    public ProgressResponse sprayVariable(String dropzoneNetAddress, String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite) throws Exception
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
     */
    public ProgressResponse sprayVariable(String dropzoneNetAddress,  DelimitedDataOptions options, String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite) throws Exception
    {
        DropZone[] targetDropZones = fetchDropZones(dropzoneNetAddress);

        if (targetDropZones == null)
            throw new Exception("Could not fetch target Dropzone");

        return sprayVariable(options, targetDropZones[0], sourceFileName, targetFileName, prefix, destGroup, overwrite);
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
     */
    public ProgressResponse sprayVariableLocalDropZone(DelimitedDataOptions options, String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite, SprayVariableFormat format) throws Exception
    {
        if (localDropZones == null)
            localDropZones = fetchLocalDropZones();

        return sprayVariable(options, localDropZones[0], sourceFileName, targetFileName, prefix, destGroup, overwrite, format, null, null, null, null, null, null, null);
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
     */
    public ProgressResponse sprayVariable(DelimitedDataOptions options, DropZone targetDropZone, String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite) throws Exception
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
     */
    public ProgressResponse sprayVariable(DelimitedDataOptions options, DropZone targetDropZone, String sourceFileName, String targetFileName, String prefix,
                                          String destGroup, boolean overwrite, SprayVariableFormat format, Integer sourceMaxRecordSize, Integer maxConnections,
                                          Boolean compress, Boolean replicate, Boolean failIfNoSourceFile, Boolean recordStructurePresent, Integer expireDays) throws Exception
    {
        getSoapProxy();

        if (targetDropZone == null)
            throw new Exception("TargetDropZone object not available!");

        SprayVariable svr = new SprayVariable();

        svr.setSourceIP(targetDropZone.getNetAddress());
        svr.setSourcePath(targetDropZone.getPath()+"/"+sourceFileName);
        svr.setDestGroup(destGroup);
        svr.setDestLogicalName(targetFileName);
        svr.setOverwrite(overwrite);
        svr.setSourceCsvEscape(options.getEscapeSequence());
        svr.setSourceCsvSeparate(options.getFieldDelimiter());
        if (options.getFieldDelimiter().equals(","))
            svr.setSourceCsvSeparate("\\,");
        else
            svr.setSourceCsvSeparate(options.getFieldDelimiter());

        svr.setSourceCsvQuote(options.getQuote());
        svr.setSourceCsvTerminate(options.getRecordTerminator());
        svr.setSourceFormat(format.getValue());

        if (sourceMaxRecordSize != null)
            svr.setSourceMaxRecordSize(sourceMaxRecordSize);
        if (maxConnections != null)
            svr.setMaxConnections(maxConnections);
        if (replicate != null)
            svr.setReplicate(replicate);
        if (compress != null)
            svr.setCompress(compress);
        if (failIfNoSourceFile != null)
            svr.setFailIfNoSourceFile(failIfNoSourceFile);
        if (recordStructurePresent != null)
            svr.setRecordStructurePresent(recordStructurePresent);
        if (expireDays != null)
            svr.setExpireDays(expireDays);

        SprayResponse resp = fileSprayServiceSoapProxy.sprayVariable(svr);

        ArrayOfEspException exceptions = resp.getExceptions();
        if (exceptions != null)
        {
            for (EspException espexception : exceptions.getException())
            {
                throw new Exception("Error spraying variable file: " + espexception.getSource() + espexception.getMessage());
            }
        }

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
     */
    public ProgressResponse sprayLocalXML(String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite) throws Exception
    {
        if (localDropZones == null)
            localDropZones = fetchLocalDropZones();

        return sprayXML(localDropZones[0], sourceFileName, targetFileName, prefix, destGroup, "tag", overwrite, SprayVariableFormat.DFUff_ascii, null, null, null, null, null, null);
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
     */
    public ProgressResponse sprayLocalXML(String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite, SprayVariableFormat format, String rowtag, Integer maxrecsize) throws Exception
    {
        if (localDropZones == null)
            localDropZones = fetchLocalDropZones();

        return sprayXML(localDropZones[0], sourceFileName, targetFileName, prefix, destGroup, rowtag, overwrite, format, maxrecsize, null, null, null, null, null);
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
     */
    public ProgressResponse sprayXML(DropZone targetDropZone, String sourceFileName, String targetFileName, String prefix, String destGroup, String rowtag,
                                     boolean overwrite, SprayVariableFormat format, Integer maxrecsize, Integer maxConnections, Boolean replicate,
                                     Boolean compress, Boolean failIfNoSourceFile, Integer expireDays) throws Exception
    {
        getSoapProxy();

        if (targetDropZone == null)
            throw new Exception("TargetDropZone object not available!");

        SprayVariable svr = new SprayVariable();

        svr.setDestGroup(destGroup);
        svr.setSourceIP(targetDropZone.getNetAddress());
        svr.setSourcePath(targetDropZone.getPath()+"/"+sourceFileName);
        svr.setDestLogicalName(targetFileName);
        svr.setOverwrite(overwrite);
        svr.setSourceFormat(format.getValue());
        svr.setSourceMaxRecordSize(maxrecsize);
        svr.setSourceRowTag(rowtag);

        if (maxConnections != null)
            svr.setMaxConnections(maxConnections);
        if (replicate != null)
            svr.setReplicate(replicate);
        if (compress != null)
            svr.setCompress(compress);
        if (failIfNoSourceFile != null)
            svr.setFailIfNoSourceFile(failIfNoSourceFile);
        if (expireDays != null)
            svr.setExpireDays(expireDays);

        SprayResponse resp = fileSprayServiceSoapProxy.sprayVariable(svr);

        ArrayOfEspException exceptions = resp.getExceptions();
        if (exceptions != null)
        {
            for (EspException espexception : exceptions.getException())
            {
                throw new Exception("Error spraying XML file: " + espexception.getSource() + espexception.getMessage());
            }
        }

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
     */
    public ProgressResponse sprayFixed(String dropzoneNetAddress, String sourceFileName, int recordSize, String targetFileLabel, String prefix, String destGroup, boolean overwrite) throws Exception
    {
        DropZone[] targetDropZones = fetchDropZones(dropzoneNetAddress);

        if (targetDropZones == null)
            throw new Exception("Could not fetch target Dropzone");

        return sprayFixed(targetDropZones[0], sourceFileName, recordSize, targetFileLabel, prefix, destGroup, overwrite, null, false, false, false, -1, null, null, null, null, null, null );
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
     */
    public ProgressResponse sprayFixedLocalDropZone(String sourceFileName, int recordSize, String targetFileLabel, String prefix, String destGroup, boolean overwrite) throws Exception
    {
        if (localDropZones == null)
            localDropZones = fetchLocalDropZones();

        return sprayFixed(localDropZones[0], sourceFileName, recordSize, targetFileLabel, prefix, destGroup, overwrite, null, false, false, false, -1, null, null, null, null, null, null );
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
     */
    public ProgressResponse sprayFixed(DropZone targetDropZone, String sourceFileName, int recordSize, String targetFileLabel, String prefix, String destGroup, boolean overwrite,
                                       Integer maxConnections, Boolean compress, Boolean replicate, Boolean failIfNoSourceFile, Integer expireDays, String decryptKey, String encryptKey,
                                       Boolean nosplit, Boolean recordStructurePresent, Integer transferBufferSize, Boolean wrap) throws Exception
    {
        getSoapProxy();

        if (targetDropZone == null)
            throw new Exception("TargetDropZone object not available!");

        SprayFixed sfr = new SprayFixed();
        sfr.setDestGroup(destGroup);
        sfr.setSourceRecordSize(recordSize);
        sfr.setSourceIP(targetDropZone.getNetAddress());
        sfr.setSourcePath(targetDropZone.getPath()+"/"+sourceFileName);
        sfr.setDestLogicalName(targetFileLabel);
        sfr.setOverwrite(overwrite);
        sfr.setPrefix(prefix);
        if (maxConnections != null)
            sfr.setMaxConnections(maxConnections);
        if (compress != null)
            sfr.setCompress(compress);
        if (replicate != null)
            sfr.setReplicate(replicate);
        if (failIfNoSourceFile != null)
            sfr.setFailIfNoSourceFile(failIfNoSourceFile);
        if (expireDays != null)
            sfr.setExpireDays(expireDays);
        if (decryptKey != null && !decryptKey.isEmpty())
            sfr.setDecrypt(decryptKey);
        if (encryptKey != null && !encryptKey.isEmpty())
            sfr.setEncrypt(encryptKey);
        if (nosplit != null)
            sfr.setNosplit(nosplit);
        if (recordStructurePresent != null)
            sfr.setRecordStructurePresent(recordStructurePresent);
        if (transferBufferSize != null)
            sfr.setTransferBufferSize(transferBufferSize);
        if (wrap != null)
            sfr.setWrap(wrap);

        SprayFixedResponse resp = fileSprayServiceSoapProxy.sprayFixed(sfr);
        ArrayOfEspException exceptions = resp.getExceptions();
        if (exceptions != null)
        {
            for (EspException espexception : exceptions.getException())
            {
                throw new Exception("Error fetching dropzone file info: " + espexception.getSource() + espexception.getMessage());
            }
        }

        return getDfuProgress(resp.getWuid());
     }

    /**
     * Get progress report for given DFU Work Unit
     * @param dfuwuid      - The DFU Work unit number
     * @return             - The Progress report at time of request
     * @throws Exception
     */
    public ProgressResponse  getDfuProgress(String dfuwuid) throws Exception
    {
        getSoapProxy();

        ProgressRequest pr = new ProgressRequest();
        pr.setWuid(dfuwuid);

        ProgressResponse resp = fileSprayServiceSoapProxy.getDFUProgress(pr);
        ArrayOfEspException exceptions = resp.getExceptions();
        if (exceptions != null)
        {
            for (EspException espexception : exceptions.getException())
            {
                throw new Exception("Error fetching dropzone file info: " + espexception.getSource() + espexception.getMessage());
            }
        }

        return resp;
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
     */
    public boolean uploadFile(File file, String targetDropzoneAddress) throws Exception
    {
        DropZone[] dropZones = fetchDropZones(targetDropzoneAddress);
        if (dropZones == null || dropZones.length <= 0)
            throw new Exception("Could not fetch target dropzone information");
        return uploadFile(file, dropZones[0]);
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
     */
    public boolean uploadFileLocalDropZone(File file) throws Exception
    {
        DropZone[] fetchLocalDropZones = fetchLocalDropZones();
        if (fetchLocalDropZones == null || fetchLocalDropZones.length <= 0)
            throw new Exception("Could not fetch local dropzone information");
        return uploadFile(file, fetchLocalDropZones[0]);
    }

    /**
     * UPLOADS A FILE( UP TO 2GB FILE SIZES) TO THE SPECIFIED LANDING ZONE
     * @param uploadFile
     *            - The File to upload
     * @param dropZone
     *            - The target dropzone
     * @return - Boolean, success
     */
    public boolean uploadLargeFile(File uploadFile, DropZone dropZone)
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
    private boolean uploadFile(File file, DropZone dropZone) throws Exception
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
            } else {
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
    public long downloadFile(File outFile, DropZone dropZone, String fileName)
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
    public long downloadFile(FileChannel outputChannel, DropZone dropZone, String fileName)
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
            PhysicalFileStruct[] filesInDropzone = listFiles(dropZone.getNetAddress(), dropZone.getPath(), null);

            boolean fileWasFound = false;
            for (int i = 0; i < filesInDropzone.length; i++)
            {
                if (filesInDropzone[i].getName().equals(fileName))
                {
                    if (filesInDropzone[i].getIsDir())
                    {
                        throw new Exception("Specified file name: " + fileName
                                + ", is a directory. Downloading directories is unsupported.");
                    }

                    fileWasFound = true;
                    fileSize = filesInDropzone[i].getFilesize();
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
            log.error("File download failed, due to malformed URL. Check dropzone path. Error message: "
                    + e.getMessage());
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
            log.warn("File download fewer bytes transferred than expected. Transferred: " + bytesTransferred
                    + " Expected: " + fileSize);
        }

        return bytesTransferred;
    }

    /**
     * Attempts to upload given file to HPCC Systems on the first dropzone encountered at the target HPCCSystem address
     * @param localFileName                  - The File to upload
     * @param targetFilename (optional)      - The desired name for the uploaded file
     * @param machineLoginUserName           - The user account name to log on to the target machine
     * @param password                       - The user account password to log on to the target machine
     */
    public void sftpPutFileOnTargetLandingZone(String localFileName, String targetFilename, String machineLoginUserName, String password) throws Exception
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
     */
    public void sftpPutFileOnTargetLandingZone(String localFileName, String targetFilename, String machineLoginUserName, String password, Properties connconfig) throws Exception
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
     */
    public void sftpPutFileOnTargetLandingZone(String localFileName, String targetDropzoneAddress, String targetFilename, String machineLoginUserName, String password, Properties connconfig) throws Exception
    {
        DropZone[] dropZones = fetchDropZones(targetDropzoneAddress);
        if (dropZones == null || dropZones.length <= 0)
            throw new Exception("Could not fetch target dropzone information");

        Sftp.lzPut(localFileName, targetDropzoneAddress, dropZones[0].getPath(), targetFilename, machineLoginUserName, password, dropZones[0].getLinux().equals("true"), connconfig);
    }

    /**
     * Attempts to fetch information regarding a DFU Workunit
     *
     * @param workunitid
     * @return
     * @throws Exception
     */
    public GetDFUWorkunitResponse getDFUWorkunit(String workunitid) throws Exception
    {
        getSoapProxy();

        GetDFUWorkunitResponse response = null;

        GetDFUWorkunit request = new GetDFUWorkunit();
        request.setWuid(workunitid);
        response = fileSprayServiceSoapProxy.getDFUWorkunit(request);

        return response;
    }

    /**
     * Attempts to fetch list of DFU Workunits
     *
     * @param cluster
     * @param pagesize
     * @return
     * @throws Exception
     */
    public GetDFUWorkunitsResponse getDFUWorkunits(String cluster, Long pagesize) throws Exception
    {
        getSoapProxy();

        GetDFUWorkunits request = new GetDFUWorkunits();
        request.setPageSize(pagesize);
        request.setCluster(cluster);

        return fileSprayServiceSoapProxy.getDFUWorkunits(request);
    }

    @Override
    protected boolean isComplete()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected void fastRefresh()
    {
        // TODO Auto-generated method stub
    }

    @Override
    protected void fullRefresh()
    {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof HPCCFileSprayClient))
        {
            return false;
        }

        HPCCFileSprayClient that = (HPCCFileSprayClient) aThat;
        FileSprayServiceSoapProxy thatSoapProxy;
        try
        {
            thatSoapProxy = that.getSoapProxy();
        }
        catch(Exception e)
        {
            thatSoapProxy = null;
        }

        return EqualsUtil.areEqual(fileSprayServiceSoapProxy.getEndpoint(), thatSoapProxy.getEndpoint()) &&
                EqualsUtil.areEqual(((Stub) fileSprayServiceSoapProxy.getFileSprayServiceSoap()).getUsername(), ((Stub) thatSoapProxy.getFileSprayServiceSoap()).getUsername()) &&
                EqualsUtil.areEqual(((Stub) fileSprayServiceSoapProxy.getFileSprayServiceSoap()).getPassword(), ((Stub) thatSoapProxy.getFileSprayServiceSoap()).getPassword());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, fileSprayServiceSoapProxy.getEndpoint());
        result = HashCodeUtil.hash(result, ((Stub)  fileSprayServiceSoapProxy.getFileSprayServiceSoap()).getUsername());
        result = HashCodeUtil.hash(result, ((Stub)  fileSprayServiceSoapProxy.getFileSprayServiceSoap()).getPassword());
        return result;
    }
}

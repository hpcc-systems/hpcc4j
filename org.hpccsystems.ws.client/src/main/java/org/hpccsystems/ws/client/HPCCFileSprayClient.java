package org.hpccsystems.ws.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.gen.filespray.v1_06.DropZone;
import org.hpccsystems.ws.client.gen.filespray.v1_06.DropZoneFilesRequest;
import org.hpccsystems.ws.client.gen.filespray.v1_06.DropZoneFilesResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_06.EspException;
import org.hpccsystems.ws.client.gen.filespray.v1_06.FileListRequest;
import org.hpccsystems.ws.client.gen.filespray.v1_06.FileListResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayServiceSoap;
import org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayServiceSoapProxy;
import org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunit;
import org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunitResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunits;
import org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunitsResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_06.PhysicalFileStruct;
import org.hpccsystems.ws.client.gen.filespray.v1_06.ProgressRequest;
import org.hpccsystems.ws.client.gen.filespray.v1_06.ProgressResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_06.SprayFixed;
import org.hpccsystems.ws.client.gen.filespray.v1_06.SprayFixedResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_06.SprayResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_06.SprayVariable;
import org.hpccsystems.ws.client.platform.DataSingleton;
import org.hpccsystems.ws.client.platform.DataSingletonCollection;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DelimitedDataOptions;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.FileFormat;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
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
    public static DataSingletonCollection All = new DataSingletonCollection();

    public static HPCCFileSprayClient get(Connection connection)
    {
        return (HPCCFileSprayClient) All.get(new HPCCFileSprayClient(connection));
    }

    public static HPCCFileSprayClient getNoCreate(Connection connection)
    {
        return (HPCCFileSprayClient) All.getNoCreate(new HPCCFileSprayClient(connection));
    }

    public static void remove(HPCCFileSprayClient p)
    {
        All.remove(p);
    }

    private static final String FILESPRAYWSDLURI     = "/FileSpray";
    private static final String UPLOADURI           = FILESPRAYWSDLURI + "/UploadFile?upload_";

    private int BUFFER_LENGTH = 1024;

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
        return (new org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayLocator()).getFileSprayServiceSoapAddress();
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
        DropZoneFilesRequest dzfr = new DropZoneFilesRequest();
        dzfr.setNetAddress(dropzoneNetAddress);
        dzfr.setDirectoryOnly(true);

        DropZoneFilesResponse resp = fileSprayServiceSoapProxy.dropZoneFiles(dzfr);
        org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException exceptions = resp.getExceptions();
        if (exceptions != null)
        {
            for (EspException espexception : exceptions.getException())
            {
                throw new Exception("Error fetching dropzone info: " + espexception.getSource() + espexception.getMessage());
            }
        }

        return  resp.getDropZones();
    }

    /*
    <?xml version="1.0" encoding="utf-8"?>
    <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wsse="http://schemas.xmlsoap.org/ws/2002/04/secext">
     <soap:Body>
      <FileListResponse xmlns="urn:hpccsystems:ws:filespray">
       <Netaddr>10.0.2.15</Netaddr>
       <Path>/var/lib/HPCCSystems/mydropzone</Path>
       <Mask/>
       <OS>0</OS>
       <DirectoryOnly>0</DirectoryOnly>
       <files>
        <PhysicalFileStruct>
         <name>eula.1028.txt</name>
         <isDir>0</isDir>
         <filesize>17734</filesize>
         <modifiedtime>2014-04-03 15:17:54</modifiedtime>
        </PhysicalFileStruct>
       </files>
      </FileListResponse>
     </soap:Body>
    </soap:Envelope>
      */

    /**
     * Fetch list of files on a give landingzone on the target HPCC System
     * @param netAddress      - Landingzone address
     * @param path            - The landing zone path on the local filesystem
     * @return                - Array of file descriptors
     * @throws Exception
     */
    public PhysicalFileStruct[] listFiles(String netAddress, String path, String OS) throws Exception
    {
        if (fileSprayServiceSoapProxy == null)
            throw new Exception("FileSpray Service Soap Proxy not available.");

        FileListRequest flr = new FileListRequest();
        flr.setNetaddr(netAddress);
        flr.setPath(path);
        if (OS != null)
            flr.setOS(OS);

        FileListResponse resp = fileSprayServiceSoapProxy.fileList(flr);
        org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException exceptions = resp.getExceptions();
        if (exceptions != null)
        {
            for (EspException espexception : exceptions.getException())
            {
                throw new Exception("Error fetching dropzone file info: " + espexception.getSource() + espexception.getMessage());
            }
        }

        return  resp.getFiles();
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
     * @return                 - Progress response at time of request
     * @throws Exception
     */
    public ProgressResponse sprayVariableLocalDropZone(DelimitedDataOptions options, String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite, FileFormat format) throws Exception
    {
        if (localDropZones == null)
            localDropZones = fetchLocalDropZones();

        return sprayVariable(options, localDropZones[0], sourceFileName, targetFileName, prefix, destGroup, overwrite, format);
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
        return sprayVariable(options, targetDropZone, sourceFileName, targetFileName, prefix, destGroup, overwrite, FileFormat.DFUff_csv);
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
    public ProgressResponse sprayVariable(DelimitedDataOptions options, DropZone targetDropZone, String sourceFileName, String targetFileName, String prefix, String destGroup, boolean overwrite, FileFormat format) throws Exception
    {
        if (fileSprayServiceSoapProxy == null)
            throw new Exception("FileSpray Service Soap Proxy not available.");

        if (targetDropZone == null)
            throw new Exception("TargetDropZone object not available!");

        SprayVariable svr = new SprayVariable();

        svr.setDestGroup(destGroup);
        svr.setSourceIP(targetDropZone.getNetAddress());
        svr.setSourcePath(targetDropZone.getPath()+"/"+sourceFileName);
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

        SprayResponse resp = fileSprayServiceSoapProxy.sprayVariable(svr);

        org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException exceptions = resp.getExceptions();
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

        return sprayFixed(targetDropZones[0], sourceFileName, recordSize, targetFileLabel, prefix, destGroup, overwrite);
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

        return sprayFixed(localDropZones[0], sourceFileName, recordSize, targetFileLabel, prefix, destGroup, overwrite);
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
     * @return                 - Progress response at time of request
     * @throws Exception
     */
    public ProgressResponse sprayFixed(DropZone targetDropZone, String sourceFileName, int recordSize, String targetFileLabel, String prefix, String destGroup, boolean overwrite) throws Exception
    {
        if (fileSprayServiceSoapProxy == null)
            throw new Exception("FileSpray Service Soap Proxy not available.");

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

        SprayFixedResponse resp = fileSprayServiceSoapProxy.sprayFixed(sfr);
        org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException exceptions = resp.getExceptions();
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
        if (fileSprayServiceSoapProxy == null)
            throw new Exception("FileSpray Service Soap Proxy not available.");

        ProgressRequest pr = new ProgressRequest();
        pr.setWuid(dfuwuid);

        ProgressResponse resp = fileSprayServiceSoapProxy.getDFUProgress(pr);
        org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException exceptions = resp.getExceptions();
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
     * Attempts to upload given file to HPCC System on the first dropzone encountered at the given address
     * @param file                  - The File to upload
     * @param targetDropzoneAddress - The target dropzone address
     * @return                      - Boolean, success
     */
    public boolean uploadFile(File file, String targetDropzoneAddress) throws Exception
    {
        DropZone[] dropZones = fetchDropZones(targetDropzoneAddress);
        if (dropZones == null || dropZones.length <= 0)
            throw new Exception("Could not fetch target dropzone information");

        return uploadFile(file, dropZones[0]);
    }

    /**
     * Attempts to upload given file to HPCC System on the first local dropzone encountered
     * @param file        - The File to upload
     * @return            - Boolean, success
     */
    public boolean uploadFileLocalDropZone(File file) throws Exception
    {
        DropZone[] fetchLocalDropZones = fetchLocalDropZones();
        if (fetchLocalDropZones == null || fetchLocalDropZones.length <= 0)
            throw new Exception("Could not fetch local dropzone information");

        return uploadFile(file, fetchLocalDropZones[0]);
    }

    /**
     * Attempts to upload given file to HPCC System on the given dropzone
     * @param file        - The File to upload
     * @param dropZones   - The target HPCC file dropzone
     * @return            - Boolean, success
     */
    private boolean uploadFile(File file, DropZone dropZone)
    {
        if (file == null)
            return false;

        String filename = file.getName();
        long length = file.length();

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

            if (fsconn.hasCredentials() )
            {
                fileUploadConnection.setRequestProperty ("Authorization", fsconn.getBasicAuthString());
            }

            fileUploadConnection.setRequestProperty("Content-Length",    Long.toString(length));
            fileUploadConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

            uploadOutStream = fileUploadConnection.getOutputStream();

            Utils.startMulti(uploadOutStream, filename, boundary, "");

            fileInput = new FileInputStream(file);

            byte[] bytesReadFromFile = new byte[BUFFER_LENGTH];
            int bytesReadCount;

            while ((bytesReadCount = fileInput.read(bytesReadFromFile, 0, BUFFER_LENGTH)) != -1)
            {
                uploadOutStream.write(bytesReadFromFile, 0, bytesReadCount);
            }

            Utils.closeMulti(uploadOutStream, boundary);

            StringBuffer response = new StringBuffer();
            BufferedReader rreader = new BufferedReader(new InputStreamReader(fileUploadConnection.getInputStream()));

            String line = null;

            while ((line = rreader.readLine()) != null)
                response.append(line);

            Utils.println(System.out, "File upload has finished, please fetch file list to verify upload", false, verbose);

        }
        catch (Exception e)
        {
            if (!fileUploadURL.equals(fileUploadConnection.getURL()))
            {
                Utils.println(System.err, "HTTP Error reported on File upload related to a server redirect, please verify on server.", false, verbose);
            }

            if (verbose)
                e.printStackTrace();

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

    public GetDFUWorkunitResponse getDFUWorkunit(String workunitid) throws Exception
    {
        if (fileSprayServiceSoapProxy == null)
            throw new Exception("FileSpray Service Soap Proxy not available.");

        GetDFUWorkunitResponse response = null;

        GetDFUWorkunit request = new GetDFUWorkunit();
        request.setWuid(workunitid);
        response = fileSprayServiceSoapProxy.getDFUWorkunit(request);

        return response;
    }

    public GetDFUWorkunitsResponse getDFUWorkunits(String cluster, Long pagesize) throws Exception
    {
        if (fileSprayServiceSoapProxy == null)
            throw new Exception("FileSpray Service Soap Proxy not available.");

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

package org.hpccsystems.ws.client;

import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Arrays;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileRequest;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileResponse;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.EspSoapFault;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataRequest;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataResponse;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataRequest;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataResponse;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WsFileIOPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WsFileIOStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;

import io.opentelemetry.instrumentation.annotations.SpanAttribute;
import io.opentelemetry.instrumentation.annotations.WithSpan;
import jakarta.activation.DataHandler;
import jakarta.activation.DataSource;
import jakarta.mail.util.ByteArrayDataSource;

/**
 * Facilitates File I/O actions on target HPCC instance.
 *
 * Actions supported include creating a new file, and appending data to a file in the given HPCC System.
 */
public class HPCCWsFileIOClient extends BaseHPCCWsClient
{
    private static final Logger log                    = LogManager.getLogger(HPCCWsFileIOClient.class);
    /** Constant <code>FILEIOWSDLURI="/WsFileIO"</code> */
    public static final String  FILEIOWSDLURI          = "/WsFileIO";

    private final int           defaultUploadChunkSize = 5000000;

    private static int          DEFAULTSERVICEPORT     = -1;
    private static String       WSDLURL                = null;

    /**
     * Load WSDLURL.
     */
    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new WsFileIOStub());
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
        return FILEIOWSDLURI;
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
        return new WsFileIOStub();
    }

    /**
     * Gets the.
     *
     * @param connection
     *            the connection
     * @return the HPCC ws file IO client
     */
    public static HPCCWsFileIOClient get(Connection connection)
    {
        return new HPCCWsFileIOClient(connection);
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
     * @return the HPCC ws file IO client
     */
    public static HPCCWsFileIOClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsFileIOClient(conn);
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
     * @return the HPCC ws file IO client
     */
    public static HPCCWsFileIOClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsFileIOClient(conn);
    }

    /**
     * Instantiates a new HPCC ws file IO client.
     *
     * @param baseConnection
     *            the base connection
     */
    protected HPCCWsFileIOClient(Connection baseConnection)
    {
        initWSFileIOStub(baseConnection);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param connection
     *            the connection
     */
    private void initWSFileIOStub(Connection connection)
    {
        try
        {
            initBaseWsClient(connection, false); //No need Preemptively fetch HPCC build version, Containerized mode
            stub = setStubOptions(new WsFileIOStub(connection.getBaseUrl() + FILEIOWSDLURI), connection);
        }
        catch (AxisFault e)
        {
            initErrMessage = "\nCould not initialize FileIOStub- Review all HPCC connection values";
            e.printStackTrace();
        }

        if (!initErrMessage.isEmpty())
            log.error(initErrMessage);
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

        WsFileIOPingRequest request = new WsFileIOPingRequest();
        try
        {
            ((WsFileIOStub) stub).ping(request);
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
            return false;
        }

        return true;
    }

    /**
     * @deprecated Due to change in server behavior
     *             Use boolean createHPCCFile(String fileName, String targetLandingZone, boolean overwritefile, String lzAddress) instead
     * Creates an HPCC file.
     *
     * @param fileName
     *            - The target HPCC file name
     * @param targetLandingZone
     *            - The LZ name, no longer the netaddress of the LZ. should be fetched from landingzones in filesprayclient
     * @param overwritefile
     *            - If the file exists, should it be overwritten?
     * @return true, if successful
     * @throws java.lang.Exception
     *             - Caller should handle exception in case of errors
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean createHPCCFile(String fileName, String targetLandingZone, boolean overwritefile) throws Exception, ArrayOfEspExceptionWrapper
    {
        return createHPCCFile(fileName, targetLandingZone, overwritefile, null);
    }

    /**
     * Creates an HPCC file.
     *
     * @param fileName
     *            - The target HPCC file name
     * @param targetLandingZone
     *            - The LZ name, no longer the netaddress of the LZ. should be fetched from landingzones in filesprayclient
     * @param overwritefile
     *            - If the file exists, should it be overwritten?
     * @param lzAddress
     *            - The Landing zone address
     * @return true, if successful
     * @throws java.lang.Exception
     *             - Caller should handle exception in case of errors
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public boolean createHPCCFile(@SpanAttribute String fileName, @SpanAttribute String targetLandingZone, boolean overwritefile,@SpanAttribute  String lzAddress) throws Exception, ArrayOfEspExceptionWrapper
    {
        boolean success = false;
        log.debug("Attempting to create HPCC File: " + fileName);

        if (targetLandingZone == null || targetLandingZone.isEmpty())
            throw new Exception("HPCCWsFileIOClient::createHPCCFile: targetLandingZone required!");

        if (fileName == null || fileName.isEmpty())
            throw new Exception("HPCCWsFileIOClient::createHPCCFile: fileName required!");

        verifyStub(); // Throws exception if stub failed

        CreateFileRequest request = new CreateFileRequest();

        request.setDestDropZone(targetLandingZone);
        request.setDestRelativePath(fileName);
        request.setOverwrite(overwritefile);
        if (lzAddress != null && !lzAddress.isEmpty())
            request.setDestNetAddress(lzAddress);

        CreateFileResponse resp = null;
        try
        {
            resp = ((WsFileIOStub) stub).createFile(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.createHPCCFile(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not createHPCCFile");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not createHPCCFile");

        String result = resp.getResult();
        log.info(result);
        // I wish there was a better way to do this
        if (!result.startsWith("Fail")) success = true;

        return success;
    }


    /**
     * Write HPCC file data.
     *
     * @param data
     *            - The data to write
     * @param dataTypeDescriptor Describes the data type to be written. Must be in Mime header format "image/jpeg", "text/plain", "application/octet-stream"
     *              String descriptor should include a charset parameter
     *              This parameter is required, but will be defaulted to generic "application/octet-stream"
     * @param fileName
     *            - The target HPCC file to write to
     * @param targetLandingZone
     *            - The "netaddress" of the target landing, can be localhost, should be fetched from landingzones in filesprayclient
     * @param append
     *            - Should this data be appended?
     * @param offset
     *            - At what offset should this be written - Specify 0 if necessary
     * @param uploadchunksize
     *            - Chunksize to upload the data
     * @param lzAddress
     *            - The Landing zone address
     * @return true, if successful
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean writeHPCCFileData(byte[] data, @SpanAttribute String dataTypeDescriptor, @SpanAttribute String fileName, @SpanAttribute String targetLandingZone,
            @SpanAttribute boolean append, @SpanAttribute long offset, @SpanAttribute int uploadchunksize, @SpanAttribute String lzAddress)
    throws Exception, ArrayOfEspExceptionWrapper
    {
        boolean success = true;
        if (dataTypeDescriptor == null || dataTypeDescriptor.isEmpty())
            dataTypeDescriptor = "application/octet-stream";

        log.debug("Attempting to write data to HPCC File: " + fileName + "Data type and encoding: " + dataTypeDescriptor);

        verifyStub(); // Throws exception if stub failed

        WriteFileDataRequest request = new WriteFileDataRequest();

        request.setAppend(append);
        request.setDestDropZone(targetLandingZone);
        request.setDestRelativePath(fileName);
        request.setOffset(offset);
        if (lzAddress != null && !lzAddress.isEmpty())
            request.setDestNetAddress(lzAddress);

        int dataindex = 0;
        int limit = uploadchunksize <= 0 ? defaultUploadChunkSize : uploadchunksize;
        int payloadsize = 0;
        int bytesleft = data.length;
        byte[] subdata = null;

        while (bytesleft > 0)
        {
            payloadsize = bytesleft >= limit ? limit : bytesleft;
            log.trace("Writing offset: " + dataindex + "\t size: " + payloadsize);

            subdata = Arrays.copyOfRange(data, dataindex, dataindex + payloadsize);
            dataindex += payloadsize;

            DataSource ds = new ByteArrayDataSource(subdata, dataTypeDescriptor);
            request.setData(new DataHandler(ds));
            request.setAppend(dataindex > 0);
            request.setOffset((long) dataindex);

            try
            {
                WriteFileDataResponse response = ((WsFileIOStub) stub).writeFileData(request);
                if (response.getExceptions() != null)
                    handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Failed to Write file");

                String result = response.getResult();
                log.debug(result);

                // Wish there was a better way - https://track.hpccsystems.com/browse/HPCC-21293
                if (!result.startsWith("Failed"))
                {
                    success = true;
                    bytesleft = bytesleft - subdata.length;
                }
                else
                {
                    bytesleft = 0;
                }
            }
            catch (Exception e)
            {
                log.error(e.getLocalizedMessage());
                return false;
            }
        }
        return success;
    }

    /**
     * @deprecated Due to change in underlying library behavior
     *             Use boolean writeHPCCFileData(byte[] data, String dataTypeDescriptor, String fileName, String targetLandingZone, boolean append, long offset, int uploadchunksize, String lzAddress)
     *             and provide a data type descriptor in mime header format
     * Write HPCC file data.
     *
     * @param data
     *            - The data to write
     * @param fileName
     *            - The target HPCC file to write to
     * @param targetLandingZone
     *            - The "netaddress" of the target landing, can be localhost, should be fetched from landingzones in filesprayclient
     * @param append
     *            - Should this data be appended?
     * @param offset
     *            - At what offset should this be written - Specify 0 if necessary
     * @param uploadchunksize
     *            - Chunksize to upload the data
     * @param lzAddress
     *            - The Landing zone address
     * @return true, if successful
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public boolean writeHPCCFileData(byte[] data, @SpanAttribute String fileName, @SpanAttribute String targetLandingZone,
                                     @SpanAttribute boolean append, @SpanAttribute long offset, @SpanAttribute int uploadchunksize, @SpanAttribute String lzAddress)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        return writeHPCCFileData(data, null, fileName, targetLandingZone, append, offset, uploadchunksize, lzAddress);
    }

    /**
     * @deprecated Due to change in server behavior
     *             Use boolean writeHPCCFileData(byte[] data, String fileName, String targetLandingZone, boolean append, long offset, int uploadchunksize, String lzAddress) instead
     * Write HPCC file data.
     *
     * @param data
     *            - The data to write
     * @param fileName
     *            - The target HPCC file to write to
     * @param targetLandingZone
     *            - The "netaddress" of the target landing, can be localhost, should be fetched from landingzones in filesprayclient
     * @param append
     *            - Should this data be appended?
     * @param offset
     *            - At what offset should this be written - Specify 0 if necessary
     * @param uploadchunksize
     *            - Chunksize to upload the data
     * @return true, if successful
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean writeHPCCFileData(byte[] data, String fileName, String targetLandingZone, boolean append, long offset, int uploadchunksize)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        return writeHPCCFileData(data, fileName, targetLandingZone, append, offset, uploadchunksize, null);
    }

    /**
     * Read file data.
     *
     * @param dropzone
     *            the dropzone
     * @param fileName
     *            the file name
     * @param datasize
     *            the datasize
     * @param offset
     *            the offset
     * @param dropzoneAddress
     *            the dropzone address (not needed in containerized mode)
     * @return the string
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public String readFileData(@SpanAttribute String dropzone,@SpanAttribute  String fileName,@SpanAttribute long datasize,
                               @SpanAttribute long offset, @SpanAttribute String dropzoneAddress) throws Exception, ArrayOfEspExceptionWrapper
    {
        ReadFileDataRequest readFileDataRequest = new ReadFileDataRequest();
        readFileDataRequest.setDestDropZone(dropzone);
        readFileDataRequest.setDestRelativePath(fileName);
        readFileDataRequest.setDataSize(datasize);
        readFileDataRequest.setOffset(offset);
        if (dropzoneAddress != null && !dropzoneAddress.isEmpty())
            readFileDataRequest.setDestNetAddress(dropzoneAddress);

        ReadFileDataResponse resp = null;
        try
        {
            resp = ((WsFileIOStub) stub).readFileData(readFileDataRequest);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsDFUClient.readFileData(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not ReadFiledata");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not ReadFiledata");

        String result = resp.getResult();
        if (result != null && !result.isEmpty() && !result.equals("ReadFileData done.")) // Account for ESP inline success/error
        {
            throw new EspSoapFault("HPCCWsFileIOClient.readfiledata error received: " + result);
        }

        String data = null;
        jakarta.activation.DataHandler handler = resp.getData();
        if (handler != null)
        {
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            handler.writeTo(output);
            data = output.toString();
        }

        return data;
    }

    /**
     * @deprecated Due to change in server behavior
     *             Use String readFileData(String dropzone, String fileName, long datasize, long offset, String dropzoneAddress) instead
     * Read file data.
     *
     * @param dropzone
     *            the dropzone
     * @param fileName
     *            the file name
     * @param datasize
     *            the datasize
     * @param offset
     *            the offset
     * @return the string
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public String readFileData(String dropzone, String fileName, long datasize, long offset) throws Exception, ArrayOfEspExceptionWrapper
    {
        return readFileData(dropzone, fileName, datasize, offset, null);
    }
}

package org.hpccsystems.ws.client;

import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Arrays;

import javax.activation.DataHandler;

import org.apache.axiom.attachments.ByteArrayDataSource;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.CreateFileRequest;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.CreateFileResponse;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.EspSoapFault;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.ReadFileDataRequest;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.ReadFileDataResponse;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.WriteFileDataRequest;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.WriteFileDataResponse;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.WsFileIOPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.WsFileIOStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;

/**
 * Use as soap client for HPCC WsFileIo web service.
 * This includes creating a new file, and appending data to a file in the given SHPCC System.
 *
 */
public class HPCCWsFileIOClient extends BaseHPCCWsClient
{
    private static final Logger log                    = LogManager.getLogger(HPCCWsFileIOClient.class);
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
    public static String getServiceURI()
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
            stub = setStubOptions(new WsFileIOStub(connection.getBaseUrl() + FILEIOWSDLURI), connection);
        }
        catch (AxisFault e)
        {
            log.error("Could not initialize FileIOStub- Review all HPCC connection values");
            e.printStackTrace();
        }
        catch (Exception e)
        {
            log.error("Could not initialize FileIOStub- Review all HPCC connection values");
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage = e.getLocalizedMessage();
                log.error(e.getLocalizedMessage());
            }
        }
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

        WsFileIOPingRequest request = new WsFileIOPingRequest();
        try
        {
            ((WsFileIOStub) stub).ping(request);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }

    /**
     * Creates the HPCC file.
     *
     * @param fileName
     *            - The target HPCC file name
     * @param targetLandingZone
     *            - The "netaddress" of the target landing, can be localhost, should be fetched from landingzones in filesprayclient
     * @param overwritefile
     *            - If the file exists, should it be overwritten?
     * @return true, if successful
     * @throws Exception
     *             - Caller should handle exception in case of errors
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean createHPCCFile(String fileName, String targetLandingZone, boolean overwritefile) throws Exception, ArrayOfEspExceptionWrapper
    {
        boolean success = false;
        log.debug("Attempting to create HPCC File: " + fileName);

        verifyStub(); // Throws exception if stub failed

        CreateFileRequest request = new CreateFileRequest();

        request.setDestDropZone(targetLandingZone);
        request.setDestRelativePath(fileName);
        request.setOverwrite(overwritefile);

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
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean writeHPCCFileData(byte[] data, String fileName, String targetLandingZone, boolean append, long offset, int uploadchunksize)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        boolean success = true;
        log.debug("Attempting to write data to HPCC File: " + fileName);

        verifyStub(); // Throws exception if stub failed

        WriteFileDataRequest request = new WriteFileDataRequest();

        request.setAppend(append);
        request.setDestDropZone(targetLandingZone);
        request.setDestRelativePath(fileName);
        request.setOffset(offset);

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

            ByteArrayDataSource ds = new ByteArrayDataSource(subdata);

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
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public String readFileData(String dropzone, String fileName, long datasize, long offset) throws Exception, ArrayOfEspExceptionWrapper
    {
        ReadFileDataRequest readFileDataRequest = new ReadFileDataRequest();
        readFileDataRequest.setDestDropZone(dropzone);
        readFileDataRequest.setDestRelativePath(fileName);
        readFileDataRequest.setDataSize(datasize);
        readFileDataRequest.setOffset(offset);

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
        DataHandler handler = resp.getData();
        if (handler != null)
        {
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            handler.writeTo(output);
            data = output.toString();
        }

        return data;
    }
}

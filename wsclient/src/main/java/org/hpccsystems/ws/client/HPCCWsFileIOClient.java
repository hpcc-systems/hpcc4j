package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Arrays;

import javax.activation.DataHandler;

import org.apache.axiom.attachments.ByteArrayDataSource;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.CreateFileRequest;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.CreateFileResponse;
import org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.EspSoapFault;
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
    private static final Logger         log = Logger.getLogger(HPCCWsFileIOClient.class.getName());
    public static final String FILEIOWSDLURI         = "/WsFileIO";

    private final int defaultUploadChunkSize = 5000000;

    static
    {
        try
        {
            WsFileIOStub defstub = new WsFileIOStub();
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

    public static HPCCWsFileIOClient get(Connection connection)
    {
        return new HPCCWsFileIOClient(connection);
    }

    public static HPCCWsFileIOClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsFileIOClient(conn);
    }

    public static HPCCWsFileIOClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsFileIOClient(conn);
    }

    protected HPCCWsFileIOClient(Connection baseConnection)
    {
        initWSFileIOStub(baseConnection);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     */
    private void initWSFileIOStub(Connection connection)
    {
        try
        {
            stub = setStubOptions(new WsFileIOStub(connection.getBaseUrl()+FILEIOWSDLURI), connection);
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

    public boolean ping() throws Exception
    {
        verifyStub();

        WsFileIOPingRequest request = new WsFileIOPingRequest();
        try
        {
            ((WsFileIOStub)stub).ping(request);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }

    /**
     * @param fileName             - The target HPCC file name
     * @param targetLandingZone    - The "netaddress" of the target landing, can be localhost, should be fetched from landingzones in filesprayclient
     * @param overwritefile        - If the file exists, should it be overwritten?
     * @return
     * @throws Exception           - Caller should handle exception in case of errors
     */
    public boolean createHPCCFile(String fileName, String targetLandingZone, boolean overwritefile) throws Exception
    {
        boolean success = false;
        log.debug("Attempting to create HPCC File: " + fileName);

        verifyStub(); //Throws exception if stub failed

        CreateFileRequest request = new CreateFileRequest();

        request.setDestDropZone(targetLandingZone);
        request.setDestRelativePath(fileName);
        request.setOverwrite(overwritefile);

        CreateFileResponse resp = null;
        try
        {
            resp = ((WsFileIOStub)stub).createFile(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsDFUClient.createHPCCFile(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not createHPCCFile");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not createHPCCFile");

        String result = resp.getResult();
        log.info(result);
        // I wish there was a better way to do this
        if (!result.startsWith("Fail"))
            success = true;

        return success;
    }

    /**
     * @param data                - The data to write
     * @param fileName            - The target HPCC file to write to
     * @param targetLandingZone   - The "netaddress" of the target landing, can be localhost, should be fetched from landingzones in filesprayclient
     * @param append              - Should this data be appended?
     * @param offset              - At what offset should this be written - Specify 0 if necessary
     * @param uploadchunksize     - Chunksize to upload the data
     * @return
     * @throws Exception
     */
    public boolean writeHPCCFileData(byte [] data, String fileName, String targetLandingZone, boolean append, long offset, int uploadchunksize) throws Exception
    {
        boolean success = true;
        log.debug("Attempting to write data to HPCC File: " + fileName);

        verifyStub(); //Throws exception if stub failed

        WriteFileDataRequest request = new WriteFileDataRequest();

        request.setAppend(append);
        request.setDestDropZone(targetLandingZone);
        request.setDestRelativePath(fileName);
        request.setOffset(offset);

        int dataindex = 0;
        int limit = uploadchunksize <= 0 ? defaultUploadChunkSize : uploadchunksize;
        int payloadsize = 0;
        int bytesleft = data.length;
        byte [] subdata = null;

        while (bytesleft > 0)
        {
            payloadsize = bytesleft >= limit ? limit : bytesleft;
            log.trace("Writing offset: "+dataindex+"\t size: " + payloadsize);

            subdata = Arrays.copyOfRange(data, dataindex, dataindex + payloadsize);
            dataindex += payloadsize;

            ByteArrayDataSource ds = new ByteArrayDataSource(subdata);

            request.setData(new DataHandler(ds));
            request.setAppend(dataindex > 0);
            request.setOffset((long)dataindex);

            try
            {
                WriteFileDataResponse response = ((WsFileIOStub)stub).writeFileData(request);
                if (response.getExceptions() != null)
                    handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Failed to Write file");

                String result = response.getResult();
                log.debug(result);

                //Wish there was a better way - https://track.hpccsystems.com/browse/HPCC-21293
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
}

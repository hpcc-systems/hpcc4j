package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.gen.wsfileio.v1_0.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.wsfileio.v1_0.CreateFileRequest;
import org.hpccsystems.ws.client.gen.wsfileio.v1_0.CreateFileResponse;
import org.hpccsystems.ws.client.gen.wsfileio.v1_0.WriteFileDataRequest;
import org.hpccsystems.ws.client.gen.wsfileio.v1_0.WriteFileDataResponse;
import org.hpccsystems.ws.client.gen.wsfileio.v1_0.WsFileIOServiceSoap;
import org.hpccsystems.ws.client.gen.wsfileio.v1_0.WsFileIOServiceSoapProxy;
import org.hpccsystems.ws.client.platform.DataSingleton;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils;

/**
 * Use as soap client for HPCC WsFileIo web service.
 * This includes creating a new file, and appending data to a file in the given SHPCC System.
 *
 */
public class HPCCWsFileIOClient extends DataSingleton
{
    private static URL                  originalURL;

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

    public static HPCCWsFileIOClient get(Connection connection)
    {
        return new HPCCWsFileIOClient(connection);
    }

    public static final String FILEIOWSDLURI         = "/WsFileIO";

    private WsFileIOServiceSoapProxy wsFileIOServiceSoapProxy    =  null;
    private boolean verbosemode = false;
    private final int defaultUploadChunkSize = 5000000;
    private boolean verbose = false;

    /**
     * @param verbose - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Provides soapproxy object for HPCCWsFileIOClient which can be used to access
     * the web service methods directly
     * @return  soapproxy for HPCCWsFileIOClient
     * @throws Exception if soapproxy not available.
     */
    public WsFileIOServiceSoapProxy getSoapProxy() throws Exception
    {
        if (wsFileIOServiceSoapProxy != null)
            return wsFileIOServiceSoapProxy;
        else
            throw new Exception("wsFileIOServiceSoapProxy not available.");
    }

    /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static String getOriginalWSDLURL()
    {
        return (new org.hpccsystems.ws.client.gen.wsfileio.v1_0.WsFileIOLocator()).getWsFileIOServiceSoapAddress();
    }

    protected HPCCWsFileIOClient(WsFileIOServiceSoapProxy wsFileIOServiceSoapProxy)
    {
        this.wsFileIOServiceSoapProxy = wsFileIOServiceSoapProxy;
    }

    protected HPCCWsFileIOClient(Connection baseConnection)
    {
       this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection.getUserName(), baseConnection.getPassword());
    }

    protected HPCCWsFileIOClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, FILEIOWSDLURI);

        initWSFileIOSoapProxy(address, user, pass);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL   Target service base URL
     * @param user      User credentials
     * @param pass      User credentials
     */
    private void initWSFileIOSoapProxy(String baseURL, String user, String pass)
    {
        wsFileIOServiceSoapProxy = new WsFileIOServiceSoapProxy(baseURL);
        if (wsFileIOServiceSoapProxy != null)
        {
                WsFileIOServiceSoap wsFileIOServiceSoap = wsFileIOServiceSoapProxy.getWsFileIOServiceSoap();
                if (wsFileIOServiceSoap != null)
                {
                    if (user != null && pass != null)
                        Connection.initStub((Stub) wsFileIOServiceSoap, user, pass);
                }
        }
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
        Utils.println(System.out, "Attempting to create HPCC File: " + fileName, false, verbosemode);

        if (wsFileIOServiceSoapProxy == null)
            throw new Exception ("wsFileIOServiceSoapProxy not available!");

        CreateFileRequest createfileparams = new CreateFileRequest();
        createfileparams.setDestDropZone(targetLandingZone);
        createfileparams.setDestRelativePath(fileName);
        createfileparams.setOverwrite(overwritefile);
        try
        {
            CreateFileResponse createFileResponse = wsFileIOServiceSoapProxy.createFile(createfileparams);

            ArrayOfEspException arrayOfEspExceptions = createFileResponse.getExceptions();
            if (arrayOfEspExceptions == null)
            {
                String result = createFileResponse.getResult();
                Utils.println(System.out, result, false, verbosemode);
                // I wish there was a better way to do this
                if (!result.startsWith("Fail"))
                {
                    success = true;
                }
            }
            else
            {
                org.hpccsystems.ws.client.gen.wsfileio.v1_0.EspException[] espexceptions = arrayOfEspExceptions.getException();
                for (org.hpccsystems.ws.client.gen.wsfileio.v1_0.EspException espexception : espexceptions)
                {
                    Utils.println(System.out, "\tESPException: " + espexception.getMessage(), false, verbosemode);
                }

            }
        }
        catch (ArrayOfEspException e)
        {
            e.printStackTrace();
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }

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
    public boolean writeHPCCFileData(byte []  data, String fileName, String targetLandingZone, boolean append, long offset, int uploadchunksize) throws Exception
    {
        boolean success = true;
        Utils.println(System.out, "Attempting to write data to HPCC File: " + fileName, false, verbosemode);

        if (wsFileIOServiceSoapProxy == null)
            throw new Exception ("wsFileIOServiceSoapProxy not available!");
        else
        {
            WriteFileDataRequest writefileparams = new WriteFileDataRequest();
            writefileparams.setAppend(append);
            writefileparams.setDestDropZone(targetLandingZone);
            writefileparams.setDestRelativePath(fileName);
            writefileparams.setOffset(offset);

            int dataindex = 0;
            int limit = uploadchunksize <= 0 ? defaultUploadChunkSize : uploadchunksize;
            long payloadsize = 0;
            long bytesleft = data.length;
            byte [] subdata = null;

            while (bytesleft > 0)
            {
                payloadsize = bytesleft >= limit ? limit : bytesleft;
                Utils.println(System.out, "Writing offset: "+dataindex+"\t size: "+((int)dataindex + (int)payloadsize), true, verbosemode);

                subdata = new byte [(int)payloadsize];
                for (int i = 0; i < payloadsize ; i++, dataindex++)
                    subdata[i] = data[dataindex];

                writefileparams.setData(subdata);
                writefileparams.setAppend(dataindex > 0);
                writefileparams.setOffset((long)dataindex);

                try
                {
                    WriteFileDataResponse writeFileDataResponse = wsFileIOServiceSoapProxy.writeFileData(writefileparams);
                    String result = writeFileDataResponse.getResult();

                    Utils.println(System.out, result, true, verbosemode);
                    //Wish there was a better way
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
                    Utils.println(System.out, e.getLocalizedMessage(), false, verbosemode);
                    return false;
                }
            }
        }
        return success;
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

        if (!(aThat instanceof HPCCWsFileIOClient))
        {
            return false;
        }

        HPCCWsFileIOClient that = (HPCCWsFileIOClient) aThat;
        WsFileIOServiceSoapProxy thatSoapProxy;
        try
        {
            thatSoapProxy = that.getSoapProxy();
        }
        catch(Exception e)
        {
            thatSoapProxy = null;
        }

        return EqualsUtil.areEqual(wsFileIOServiceSoapProxy.getEndpoint(), thatSoapProxy.getEndpoint()) &&
                EqualsUtil.areEqual(((Stub) wsFileIOServiceSoapProxy.getWsFileIOServiceSoap()).getUsername(), ((Stub) thatSoapProxy.getWsFileIOServiceSoap()).getUsername()) &&
                EqualsUtil.areEqual(((Stub) wsFileIOServiceSoapProxy.getWsFileIOServiceSoap()).getPassword(), ((Stub) thatSoapProxy.getWsFileIOServiceSoap()).getPassword());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, wsFileIOServiceSoapProxy.getEndpoint());
        result = HashCodeUtil.hash(result, ((Stub)  wsFileIOServiceSoapProxy.getWsFileIOServiceSoap()).getUsername());
        result = HashCodeUtil.hash(result, ((Stub)  wsFileIOServiceSoapProxy.getWsFileIOServiceSoap()).getPassword());
        return result;
    }

}

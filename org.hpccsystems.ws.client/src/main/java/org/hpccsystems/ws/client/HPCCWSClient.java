package org.hpccsystems.ws.client;

import java.io.File;
import java.rmi.RemoteException;
import java.util.List;

import org.hpccsystems.ws.client.gen.filespray.v1_06.DropZone;
import org.hpccsystems.ws.client.gen.filespray.v1_06.EspException;
import org.hpccsystems.ws.client.gen.filespray.v1_06.ProgressRequest;
import org.hpccsystems.ws.client.gen.filespray.v1_06.ProgressResponse;
import org.hpccsystems.ws.client.platform.DataSingleton;
import org.hpccsystems.ws.client.platform.DataSingletonCollection;
import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DelimitedDataOptions;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.FileFormat;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils;

/**
 *
 * The HPCCWSCLient attempts to abstract out as much of the details for some of the most common
 * HPCC ESP actions. More actions, and more flexibility can be added in the future.
 *
 * If neither the HPCCWSClient nor the Service specific client classes expose a desired action,
 * it can be executed by obtaining the SoapProxy from the appropriate client, an executing the
 * web service method request directly.
 *
 */
public class HPCCWSClient extends DataSingleton
{
    public static DataSingletonCollection All = new DataSingletonCollection();
    public static DataSingletonCollection SubClients = new DataSingletonCollection();

    public static HPCCWSClient get(String protocol, String targetWsECLWatchAddress, int targetWsECLWatchPort, String user, String password)
    {
        return (HPCCWSClient) All.get(new HPCCWSClient( protocol, targetWsECLWatchAddress, Integer.toString(targetWsECLWatchPort), user, password));
    }

    public static HPCCWSClient getNoCreate(String protocol, String targetWsECLWatchAddress, int targetWsECLWatchPort,String user, String password)
    {
        return (HPCCWSClient) All.getNoCreate(new HPCCWSClient(protocol, targetWsECLWatchAddress, Integer.toString(targetWsECLWatchPort), user, password));
    }

    public static void remove(HPCCWSClient p)
    {
        All.remove(p);
    }

    public static final String defaultTargetWsECLWatchHost      = "localhost";
    public static final String defaultTWsECLWatchPort           = "8010";
    public static final String defaultTWsECLWatchSSLPort        = "18010";

    private String targetDropzoneNetAddres = null;
    protected boolean verbosemode = false;
    protected Connection connection = null;
    private   Object connectionLock = new Object();

    /**
     * @return true if the client is set to be verbose
     */
    public boolean isVerbosemode()
    {
        return verbosemode;
    }

    /**
     * sets the client verbose mode.
     * @param verbosemode
     *
     */
    public void setVerbosemode(boolean verbosemode)
    {
        this.verbosemode = verbosemode;
    }

    /**
     *  Instantiates HPCCWSClient, attempts to establish all communications on http://localhost:8010
     */
    protected HPCCWSClient()
    {
        this(defaultTargetWsECLWatchHost,defaultTWsECLWatchPort);
    }

    /**
     *  Instantiates HPCCWSClient, attempts to establish all communications on <protocol>://localhost:<defaultportonprotocol>
     */
    protected HPCCWSClient(String protocol)
    {
        this(protocol, defaultTargetWsECLWatchHost, (protocol.equalsIgnoreCase("https") ? defaultTWsECLWatchSSLPort : defaultTWsECLWatchPort));
    }

    /**
     * Instantiates HPCCWSClient, communicates with HPCC on HTTP protocol
     * @param targetWsECLWatchAddress - The address of the WsECLWatch ESP on the Target HPCC System
     *                                  e.g. 192.168.1.100
     * @param targetWsECLWatchPort    - The port on which WsECLWatch ESP is listening on the Target HPCC System
     *                                  usually 8010
     */
    protected HPCCWSClient(String targetWsECLWatchAddress, String targetWsECLWatchPort)
    {
        this(Connection.protHttp, targetWsECLWatchAddress, targetWsECLWatchPort);
    }

    /**
     * Instantiates HPCCWSClient, communicates with HPCC over the given protocol
     * @param targetProtocol          - http | https
     * @param targetWsECLWatchAddress - The address of the WsECLWatch ESP on the Target HPCC System
     *                                  e.g. 192.168.1.100
     * @param targetWsECLWatchPort    - The port on which WsECLWatch ESP is listening on the Target HPCC System
     *                                  usually 8010
     */
    private HPCCWSClient(String protocol, String targetWsECLWatchAddress, String targetWsECLWatchPort)
    {
        connection = new Connection(protocol, targetWsECLWatchAddress, targetWsECLWatchPort);
    }

    /**
     * Instantiates HPCCWSClient, communicates with HPCC over http, and provides user/pass credentials
     *
     * @param targetWsECLWatchAddress - The address of the WsECLWatch ESP on the Target HPCC System
     *                                  e.g. 192.168.1.100
     * @param targetWsECLWatchPort    - The port on which WsECLWatch ESP is listening on the Target HPCC System
     *                                  usually 8010
     * @param username                - ESP Username
     * @param password                - ESP Password
     */
    private HPCCWSClient(String targetWsECLWatchAddress, String targetWsECLWatchPort, String username, String password)
    {
        this(Connection.protHttp, targetWsECLWatchAddress, targetWsECLWatchPort,  username, password);
    }

    /**
     * Instantiates HPCCWSClient, communicates with HPCC over given protocol, and provides user/pass credentials
     * @param protocol                - http | https
     * @param targetWsECLWatchAddress - The address of the WsECLWatch ESP on the Target HPCC System
     *                                  e.g. 192.168.1.100
     * @param targetWsECLWatchPort    - The port on which WsECLWatch ESP is listening on the Target HPCC System
     *                                  usually 8010
     * @param username                - ESP Username
     * @param password                - ESP Password
     */
    private HPCCWSClient( String protocol, String targetWsECLWatchAddress, String targetWsECLWatchPort, String username, String password)
    {
        connection = new Connection(protocol, targetWsECLWatchAddress, targetWsECLWatchPort);
        connection.setCredentials(username, password);
    }

    /**
     * Instantiates HPCCWSClient, uses contents of connection object to communicate with target HPCC System.
     * @param conn
     */
    private HPCCWSClient(Connection conn)
    {
        updateConnection(conn);
    }

    public synchronized void update(String protocol, String targetWsECLWatchAddress, String targetWsECLWatchPort, String username, String password)
    {
        Connection newConnection = new Connection(protocol, targetWsECLWatchAddress, targetWsECLWatchPort);
        newConnection.setCredentials(username, password);

        updateConnection(newConnection);
    }

    public synchronized void updateConnection(Connection conn)
    {
        synchronized (connectionLock)
        {
            connection = conn;
            SubClients.clear();
        }
    }

    protected Connection getConnection()
    {
        synchronized (connectionLock)
        {
            return connection;
        }
    }

    /**
     * Test availability of target HPCC ESP service
     * @param conn
     */
    public synchronized boolean pingServer() throws Exception
    {
        HPCCWsWorkUnitsClient wsWorkunitsClient = getWsWorkunitsClient();

        try
        {
            return wsWorkunitsClient.testWUQuery();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return false;
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCFileSprayClient logic.
     * @return Original WSDL version
     */
    public String getFileSprayClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCFileSprayClient.getOriginalWSDLURL());
    }


    /**
     * @return provides fileSprayClient for direct method execution
     * @throws Exception
     */
    public synchronized HPCCFileSprayClient getFileSprayClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCFileSprayClient) SubClients.get(new HPCCFileSprayClient(connection));
        }
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCWsFileIOClient logic.
     * @return Original WSDL version
     */
    public String getWsFileIOClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCWsFileIOClient.getOriginalWSDLURL());
    }

    /**
     * @return provides HPCCWsFileIOClient for direct method execution
     * @throws Exception
     */
    public synchronized HPCCWsFileIOClient getWsFileIOClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCWsFileIOClient) SubClients.get(new HPCCWsFileIOClient(connection));
        }
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCWsTopologyClient logic.
     * @return Original WSDL version
     */
    public String getWsTopologyClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCWsTopologyClient.getOriginalWSDLURL());
    }

    /**
     * @return provides HPCCWsTopologyClient object for direct method execution
     * @throws Exception
     */
    public synchronized HPCCWsTopologyClient getWsTopologyClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCWsTopologyClient) SubClients.get(new HPCCWsTopologyClient(connection));
        }
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCECLDirectClient logic.
     * @return Original WSDL version
     */
    public String getEclDirectClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCECLDirectClient.getOriginalWSDLURL());
    }

    /**
     * @return provides HPCCECLDirectClient for direct method execution
     * @throws Exception
     */
    public synchronized HPCCECLDirectClient getEclDirectClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCECLDirectClient) SubClients.get(new HPCCECLDirectClient(connection));
        }
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCWsSMCClient logic.
     * @return Original WSDL version
     */
    public String getwsDFUClientClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCWsDFUClient.getOriginalWSDLURL());
    }

    /**
     * @return provides wsDFUClient for direct method execution
     * @throws Exception
     */
    public synchronized HPCCWsDFUClient getWsDFUClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCWsDFUClient) SubClients.get(new HPCCWsDFUClient(connection));
        }
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCWsSMCClient logic.
     * @return Original WSDL version
     */
    public String getWsSMCClientClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCWsSMCClient.getOriginalWSDLURL());
    }

    /**
     * @return provides HPCCWsWorkUnitsClient for direct method execution
     * @throws Exception
     */
    public synchronized HPCCWsSMCClient getWsSMCClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCWsSMCClient) SubClients.get(new HPCCWsSMCClient(connection));
        }
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCWsWorkUnitsClient logic.
     * @return Original WSDL version
     */
    public String getWsWorkunitsClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCWsWorkUnitsClient.getOriginalWSDLURL());
    }

    /**
     * @return provides HPCCWsWorkUnitsClient for direct method execution
     * @throws Exception
     */
    public synchronized HPCCWsWorkUnitsClient getWsWorkunitsClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCWsWorkUnitsClient) SubClients.get(new HPCCWsWorkUnitsClient(connection));
        }
    }

    /**
     * Returns all the available cluster groups (hthor, thor, roxie, etc.) on the target HPCC System.
     * @return                      - The available cluster groups (hthor, thor, roxie, etc.) on the target HPCC System.
     * @throws Exception
     */
    public String[] getAvailableClusterGroups() throws Exception
    {
        HPCCWsTopologyClient hpccWsTopologyClient = HPCCWsTopologyClient.get(connection);

        try
        {
            if (hpccWsTopologyClient != null)
                return hpccWsTopologyClient.getValidTargetGroupNames();
            else
                throw new Exception("Could not initialize HPCC WsTopology Client");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Returns all the available target cluster names (mythor, myroxie, etc) given a cluster group type/name (thor, roxie, etc.)
     * @param clusterGroupType         - The cluster group type/name
     * @return                         - Names of all availabe target cluster in the given cluster group
     * @throws Exception
     */
    public String[] getAvailableClusterNames(String clusterGroupType) throws Exception
    {
        HPCCWsTopologyClient wsTopologyClient = getWsTopologyClient();

        if (wsTopologyClient != null)
            return wsTopologyClient.getValidTargetClusterNames(clusterGroupType);
        else
            throw new Exception("Could not initialize HPCC WsTopology Client");
    }

    /**
     * @return          - List of all available target cluster names (mythor, myroxie, etc) on this HPCC System
     * @throws Exception
     */
    public List<String> getAvailableTargetClusterNames() throws Exception
    {
        HPCCWsTopologyClient wsTopologyClient = getWsTopologyClient();

        if (wsTopologyClient != null)
            return wsTopologyClient.getValidTargetClusterNames();
        else
            throw new Exception("Could not initialize HPCC WsTopology Client");
    }

    /**
     * Spray a fixed record length data file onto a target cluster on the target HPCC System
     * @param fileName               - The existing file (on the target HPCC System) to spray
     * @param targetFileLabel        - The full label the sprayed file will be assigned
     * @param recordSize             - The record length
     * @param targetCluster          - The cluster on which to spray
     * @param overwritesprayedfile   - Boolean, overwrite possibly sprayed file of same name
     * @return                       - Boolean, success.
     */
    public boolean sprayFlatHPCCFile(String fileName, String targetFileLabel, int recordSize, String targetCluster, boolean overwritesprayedfile)
    {
        boolean success = true;

        try
        {
            HPCCFileSprayClient fileSprayClient = getFileSprayClient();

            if (fileSprayClient != null)
                success = handleSprayResponse(fileSprayClient.sprayFixedLocalDropZone(fileName, recordSize, targetFileLabel, "", targetCluster, overwritesprayedfile));
            else
                throw new Exception("Could not initialize HPCC fileSpray Client");
        }
        catch (org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException e)
        {
            Utils.println(System.out, "Error: Could not spray file" + e.getLocalizedMessage(),true, verbosemode);
        }
        catch (RemoteException e)
        {
            Utils.println(System.out, "Error: Could not spray file" + e.getLocalizedMessage(),true, verbosemode);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return success;
    }

    /**
     * Spray a variable/delimited data file onto a target cluster on the target HPCC System
     * @param fileName                - The existing file (on the target HPCC System) to spray
     * @param targetFileLabel         - The full label the sprayed file will be assigned
     * @param targetCluster           - The cluster on which to spray
     * @param escapedEscapeSequence   - The escape character sequence (must be escaped)
     * @param escapedFieldDelim       - The field delimiter (must be escaped)
      * @param escapedQuote            - The data quote (must be escaped)
      * @param escapedRecTerminator    - The record terminator sequence (must be escaped)
     * @param overwritesprayedfile    - Boolean, overwrite possibly sprayed file of same name
     * @return                        - Boolean, success.
     */
    public boolean sprayCustomCSVHPCCFile(String fileName, String targetFileLabel, String targetCluster, String escapedEscapeSequence, String escapedFieldDelim, String escapedQuote, String escapedRecTerminator, boolean overwritesprayedfile, FileFormat format)
    {
        boolean success = true;

        try
        {
            success = sprayVariableHPCCFile(fileName, targetFileLabel, targetCluster, new DelimitedDataOptions(escapedRecTerminator, escapedFieldDelim, escapedEscapeSequence, escapedQuote), overwritesprayedfile, format);
        }
        catch (Exception e)
        {
            Utils.println(System.out, "Error: Could not spray file", true, true);
            success = false;
        }

        return success;
    }

    /**
     * Spray a CSV delimited data file (default CSV options) onto a target cluster on the target HPCC System
     * @param fileName                - The existing file (on the target HPCC System) to spray
     * @param targetFileLabel         - The full label the sprayed file will be assigned
     * @param targetCluster           - The cluster on which to spray
     * @param overwritesprayedfile    - Boolean, overwrite possibly sprayed file of same name
     * @return                        - Boolean, success.
     */
    public boolean sprayDefaultCSVHPCCFile(String fileName, String targetFileLabel, String targetCluster, boolean overwritesprayedfile)
    {
        boolean success = false;

        try
        {
            //Another way is to create the enumeration from the string representation...
            //FileFormat.convertDFUFileFormatName2Code("csv");
            success = sprayVariableHPCCFile(fileName, targetFileLabel, targetCluster, new DelimitedDataOptions(), overwritesprayedfile, FileFormat.DFUff_csv); //could be
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return success;
    }

    /**
     * Spray a variable/delimited data file onto a target cluster on the target HPCC System
     * @param fileName                - The existing file (on the target HPCC System) to spray
     * @param targetFileLabel         - The full label the sprayed file will be assigned
     * @param targetCluster           - The cluster on which to spray
     * @param options                 - Delimited file description
     * @param overwritesprayedfile    - Boolean, overwrite possibly sprayed file of same name
     * @param format                  - FileFormat
     * @return                        - Boolean, success.
     */
    public boolean sprayVariableHPCCFile(String fileName, String targetFileLabel, String targetCluster, DelimitedDataOptions options, boolean overwritesprayedfile, FileFormat format)
    {
        boolean success = false;

        try
        {
            HPCCFileSprayClient fileSprayClient = getFileSprayClient();
            if (fileSprayClient != null)
                success = handleSprayResponse(fileSprayClient.sprayVariableLocalDropZone(options, fileName, targetFileLabel, "", targetCluster, overwritesprayedfile, format));
            else
                throw new Exception("Could not initialize HPCC FileSpray Client");
        }
        catch (org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException e)
        {
            Utils.println(System.out, "Error: Could not spray file" + e.getLocalizedMessage(),true, true);
        }
        catch (RemoteException e)
        {
            Utils.println(System.out, "Error: Could not spray file" + e.getLocalizedMessage(),true, true);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return success;
    }

    private boolean handleSprayResponse(ProgressResponse sprayResponse) throws Exception
    {
        boolean success = false;

        org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException exceptions = sprayResponse.getExceptions();
        if (exceptions != null)
        {
            for (EspException espexception : exceptions.getException())
            {
                Utils.println(System.out, "Error spraying file: " + espexception.getSource() + espexception.getMessage(), false, verbosemode);
            }
        }
        else
        {
            HPCCFileSprayClient fileSprayClient = getFileSprayClient();

            if (fileSprayClient == null)
                throw new Exception("Could not initialize HPCC FileSpray Client");

            ProgressRequest dfuprogressparams = new ProgressRequest();
            dfuprogressparams.setWuid(sprayResponse.getWuid());
            Utils.println(System.out, "Spray file DWUID: " +sprayResponse.getWuid(), true, verbosemode);
            ProgressResponse progressResponse = fileSprayClient.fileSprayServiceSoapProxy.getDFUProgress(dfuprogressparams);

            if (progressResponse.getExceptions() != null)
            {
                Utils.println(System.out, "Spray progress status fetch failed.", false, verbosemode);
            }
            else
            {
                String state = progressResponse.getState();
                Utils.println(System.out, progressResponse.getState(), true, verbosemode);
                if (!state.equalsIgnoreCase("FAILED"))
                {
                    //this should be in a dedicated thread.
                    for  (int i = 0; i < 10 && progressResponse.getPercentDone() < 100 && !progressResponse.getState().equalsIgnoreCase("FAILED"); i++)
                    {
                        Utils.println(System.out, progressResponse.getProgressMessage(), true, verbosemode);
                        progressResponse = fileSprayClient.fileSprayServiceSoapProxy.getDFUProgress(dfuprogressparams);

                        try
                        {
                            Thread.sleep(100);
                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                    }
                    Utils.println(System.out, progressResponse.getProgressMessage(), true, verbosemode);
                    success = true;
                }
                else
                {
                    Utils.println(System.out, "Spray failed.", false, verbosemode);
                }
                Utils.println(System.out, "Final summary from server: " + progressResponse.getSummaryMessage(),true, verbosemode);

                Utils.println(System.out, "Spray attempt completed, verify DWUID: " +sprayResponse.getWuid(), false, verbosemode);
            }
        }
        return success;
    }

    /**
     * Uploads a file to the first dropzone found on the target HPCC System
     * @param file   - The file
     * @return       - Succcess
     */
    public boolean uploadFileToHPCC(File file)
    {
        try
        {
            HPCCFileSprayClient fileSprayClient = getFileSprayClient();
            if (fileSprayClient != null)
                fileSprayClient.uploadFileLocalDropZone(file);
            else
                throw new Exception("Could not initialize HPCC File Spray Client");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    /**
     * Creates a file on HPCC landingzone, and appends data to file.
     * @param fileName                - The target file name.
     * @param targetDropzoneAddress   - can be null, if null will attempt to fetch the first dropzone from the local HPCC System
     * @param data                    - the data
     * @return
     * @throws Exception              - caller must handle exceptions
     */
    public boolean writeToHPCCFile(String fileName, String targetDropzoneAddress, String data) throws Exception
    {
        boolean success = false;

        HPCCWsFileIOClient wsFileIOClient = getWsFileIOClient();
        HPCCFileSprayClient fileSprayClient = getFileSprayClient();

        if (fileSprayClient != null)
        {
            if (targetDropzoneAddress == null || targetDropzoneAddress.length() == 0)
            {
                DropZone[] localdropzones = fileSprayClient.fetchLocalDropZones();
                if (localdropzones != null && localdropzones.length > 0)
                {
                    targetDropzoneAddress = localdropzones[0].getNetAddress();
                }
            }
        }
        else
            throw new Exception("Could not initialize HPCC FileSpray Client");

        if (wsFileIOClient != null)
        {
            if (targetDropzoneAddress != null && targetDropzoneAddress.length() == 0)
            {
                if (!wsFileIOClient.createHPCCFile(fileName, targetDropzoneAddress, true))
                        throw new Exception("Could not create target HPCC namespaces file.");

                    //Remote HPCC file has been created, encode the data so it can be uploaded as binary data.
                    //byte [] encodedBytes = encodeData(triplesCSVFormat.toString());
                    //The data was being encoded, but latest test don't seem to require encoding.
                    success = wsFileIOClient.writeHPCCFileData(data.getBytes(), fileName, targetDropzoneNetAddres, false, 0, 0);
            }
        }
        else
            throw new Exception("Could not initialize HPCC FileIO Client");

        Utils.println(System.out, "Success: " + String.valueOf(success), false,verbosemode);
        return success;
    }

    /**
     * Submits the given ECL to compile/execute on the targetclust, and returns results.
     * @param ecl                - The ECL query to compile and execute
     * @param targetcluster     - The cluster on which this query should be compiled and ran
     * @param resultLimit       - Directive to limit the resulting set
     * @param maxwait           - Maxwait in millis
     * @return                  - If successful, the resulting dataset(s)
     * @throws Exception
     */
    public String submitECLandGetResults(WorkunitInfo wu) throws Exception
    {
        String results = null;

        HPCCECLDirectClient eclDirectClient = getEclDirectClient();

        try
        {
            if (eclDirectClient != null)
                results = eclDirectClient.submitECLandGetResults(wu);
            else
                throw new Exception("Could not initialize HPCC EclDirect Client");
        }
        catch (Exception e)
        {
            Utils.println(System.err, "Error submitting ECL: " + e.getLocalizedMessage(), false, verbosemode);
            throw e;
        }

        return results;
    }

    /**
     * Submits the given ECL to compile/execute on the targetclust, and returns parsed results.
     * @param ecl                - The ECL query to compile and execute
     * @param targetcluster     - The cluster on which this query should be compiled and ran
     * @param resultLimit       - Directive to limit the resulting set
     * @param maxwait           - Maxwait in millis
     * @return                  - If successful, the resulting dataset(s)
     * @throws Exception
     */

    public List<List <Object>> submitECLandGetResultsList(WorkunitInfo wu) throws Exception
    {
        List<List <Object>> resultsList;
        String results = submitECLandGetResults(wu);
        resultsList = Utils.parseECLResults(results);
        return resultsList;
    }

    /**
     * Submits the given ECL to compile/execute on the targetclust and returns WUID to track the query.
     * @param ecl                - The ECL query to compile and execute
     * @param targetcluster     - The cluster on which this query should be compiled and ran
     * @param resultLimit       - Directive to limit the resulting set
     * @param maxwait           - Maxwait in millis
     * @return                  - If successful, the resulting WUID, which can be used to query info, including results
     */
    public String submitECLandGetWUID(WorkunitInfo wu)
    {
        String WUID = null;

        try
        {
            HPCCECLDirectClient eclDirectClient = getEclDirectClient();
            if (eclDirectClient != null)
                WUID = eclDirectClient.submitECL(wu);
            else
                throw new Exception("Could not initialize HPCC EclDirect Client");
        }
        catch (Exception e)
        {
            System.out.println("Error submitting ECL: " + e.getLocalizedMessage());
            e.printStackTrace();
        }

        return WUID;
    }

    public String getProtocol()
    {
        return connection.getProtocol();
    }

    public String getHost()
    {
        return connection.getHost();
    }

    public int getPortInt()
    {
        return connection.getPortInt();
    }

    public String getUserName()
    {
        return connection.getUserName();
    }

    public String getPassword()
    {
        return connection.getPassword();
    }

    @Override
    protected boolean isComplete()
    {
        return true;
    }

    @Override
    protected void fastRefresh() {}

    @Override
    protected void fullRefresh() {}

    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof HPCCWSClient))
        {
            return false;
        }

        HPCCWSClient that = (HPCCWSClient) aThat;

        return EqualsUtil.areEqual(getConnection(), that.getConnection());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, connection);
        return result;
    }
}


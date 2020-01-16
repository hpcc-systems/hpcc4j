package org.hpccsystems.ws.client;

import java.io.File;
import java.rmi.RemoteException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.ws.client.HPCCFileSprayClient.SprayVariableFormat;
import org.hpccsystems.ws.client.extended.HPCCWsAttributesClient;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.DataSingletonCollection;
import org.hpccsystems.ws.client.utils.DelimitedDataOptions;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils;
import org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.ProgressResponseWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;

/**
 *
 * The HPCCWSCLient attempts to abstract out as much of the details for some of the most common
 * HPCC ESP actions. More actions, and more flexibility can be added in the future.
 *
 * If neither the HPCCWsClient nor the Service specific client classes expose a desired action,
 * it can be executed by obtaining the SoapProxy from the appropriate client, an executing the
 * web service method request directly.
 *
 */
public class HPCCWsClient extends DataSingleton
{
    private static final Logger           log        = LogManager.getLogger(HPCCWsClient.class);

    public static DataSingletonCollection All        = new DataSingletonCollection();
    public static DataSingletonCollection SubClients = new DataSingletonCollection();

    /**
     * Fetch pre-existing HPCCWsClient instance from collection, if pre-existing instance with exact connection option
     * doesn't exist, create new instance.
     *
     * @param protocol
     *            the protocol
     * @param targetWsECLWatchAddress
     *            the target ws ECL watch address
     * @param targetWsECLWatchPort
     *            the target ws ECL watch port
     * @param user
     *            the user
     * @param password
     *            the password
     * @return the HPCC ws client
     */
    public static HPCCWsClient get(String protocol, String targetWsECLWatchAddress, int targetWsECLWatchPort, String user, String password)
    {
        return (HPCCWsClient) All.get(new HPCCWsClient(protocol, targetWsECLWatchAddress, Integer.toString(targetWsECLWatchPort), user, password));
    }

    /**
     * Fetch pre-existing HPCCWsClient instance from collection, if pre-existing instance with exact connection option
     * doesn't exist return null.
     *
     * @param protocol
     *            the protocol
     * @param targetWsECLWatchAddress
     *            the target ws ECL watch address
     * @param targetWsECLWatchPort
     *            the target ws ECL watch port
     * @param user
     *            the user
     * @param password
     *            the password
     * @return the no create
     */
    public static HPCCWsClient getNoCreate(String protocol, String targetWsECLWatchAddress, int targetWsECLWatchPort, String user, String password)
    {
        return (HPCCWsClient) All
                .getNoCreate(new HPCCWsClient(protocol, targetWsECLWatchAddress, Integer.toString(targetWsECLWatchPort), user, password));
    }

    /**
     * Remove an instance of HPCCWsClient from pool, and therefore from potential re-use.
     *
     * @param p
     *            the p
     */
    public static void remove(HPCCWsClient p)
    {
        All.remove(p);
    }

    public static final String defaultTargetWsECLWatchHost = "localhost";
    public static final String defaultTWsECLWatchPort      = "8010";
    public static final String defaultTWsECLWatchSSLPort   = "18010";

    protected boolean          verbosemode                 = false;
    protected Connection       connection                  = null;
    protected Object           connectionLock              = new Object();

    /**
     * Checks if is verbosemode.
     *
     * @return true if the client is set to be verbose
     */
    public boolean isVerbosemode()
    {
        return verbosemode;
    }

    /**
     * sets the client verbose mode.
     *
     * @param verbosemode
     *            the new verbosemode
     */
    public void setVerbosemode(boolean verbosemode)
    {
        this.verbosemode = verbosemode;
    }

    /**
     * Instantiates HPCCWsClient, attempts to establish all communications on http://localhost:8010.
     */
    protected HPCCWsClient()
    {
        this(defaultTargetWsECLWatchHost, defaultTWsECLWatchPort);
    }

    /**
     * Instantiates HPCCWsClient, attempts to establish all communications on &lt;protocol&gt;://localhost:&lt;defaultportonprotocol&gt;.
     *
     * @param protocol
     *            the protocol
     */
    protected HPCCWsClient(String protocol)
    {
        this(protocol, defaultTargetWsECLWatchHost, (protocol.equalsIgnoreCase("https") ? defaultTWsECLWatchSSLPort : defaultTWsECLWatchPort));
    }

    /**
     * Instantiates HPCCWsClient, communicates with HPCC on HTTP protocol.
     *
     * @param targetWsECLWatchAddress
     *            - The address of the WsECLWatch ESP on the Target HPCC System
     *            e.g. 192.168.1.100
     * @param targetWsECLWatchPort
     *            - The port on which WsECLWatch ESP is listening on the Target HPCC System
     *            usually 8010
     */
    protected HPCCWsClient(String targetWsECLWatchAddress, String targetWsECLWatchPort)
    {
        this(Connection.protHttp, targetWsECLWatchAddress, targetWsECLWatchPort);
    }

    /**
     * Instantiates HPCCWsClient, communicates with HPCC over the given protocol.
     *
     * @param protocol
     *            the protocol
     * @param targetWsECLWatchAddress
     *            - The address of the WsECLWatch ESP on the Target HPCC System
     *            e.g. 192.168.1.100
     * @param targetWsECLWatchPort
     *            - The port on which WsECLWatch ESP is listening on the Target HPCC System
     *            usually 8010
     */
    protected HPCCWsClient(String protocol, String targetWsECLWatchAddress, String targetWsECLWatchPort)
    {
        connection = new Connection(protocol, targetWsECLWatchAddress, targetWsECLWatchPort);
    }

    /**
     * Instantiates HPCCWsClient, communicates with HPCC over http, and provides user/pass credentials.
     *
     * @param targetWsECLWatchAddress
     *            - The address of the WsECLWatch ESP on the Target HPCC System
     *            e.g. 192.168.1.100
     * @param targetWsECLWatchPort
     *            - The port on which WsECLWatch ESP is listening on the Target HPCC System
     *            usually 8010
     * @param username
     *            - ESP Username
     * @param password
     *            - ESP Password
     */
    public HPCCWsClient(String targetWsECLWatchAddress, String targetWsECLWatchPort, String username, String password)
    {
        this(Connection.protHttp, targetWsECLWatchAddress, targetWsECLWatchPort, username, password);
    }

    /**
     * Instantiates HPCCWsClient, communicates with HPCC over given protocol, and provides user/pass credentials.
     *
     * @param protocol
     *            - http | https
     * @param targetWsECLWatchAddress
     *            - The address of the WsECLWatch ESP on the Target HPCC System
     *            e.g. 192.168.1.100
     * @param targetWsECLWatchPort
     *            - The port on which WsECLWatch ESP is listening on the Target HPCC System
     *            usually 8010
     * @param username
     *            - ESP Username
     * @param password
     *            - ESP Password
     */
    protected HPCCWsClient(String protocol, String targetWsECLWatchAddress, String targetWsECLWatchPort, String username, String password)
    {
        connection = new Connection(protocol, targetWsECLWatchAddress, targetWsECLWatchPort);
        connection.setCredentials(username, password);
    }

    /**
     * Instantiates HPCCWsClient, uses contents of connection object to communicate with target HPCC System.
     *
     * @param conn
     *            the conn
     */
    protected HPCCWsClient(Connection conn)
    {
        updateConnection(conn);
    }

    /**
     * Caller can edit connection properties for this HPCCWsClient, then get appropriate subclient.
     *
     * @param protocol
     *            the protocol
     * @param targetWsECLWatchAddress
     *            the target ws ECL watch address
     * @param targetWsECLWatchPort
     *            the target ws ECL watch port
     * @param username
     *            the username
     * @param password
     *            the password
     */
    public synchronized void update(String protocol, String targetWsECLWatchAddress, String targetWsECLWatchPort, String username, String password)
    {
        Connection newConnection = new Connection(protocol, targetWsECLWatchAddress, targetWsECLWatchPort);
        newConnection.setCredentials(username, password);

        updateConnection(newConnection);
    }

    /**
     * Caller can edit connection properties for this HPCCWsClient by providing connection object, then get appropriate subclient.
     *
     * @param conn
     *            the conn
     */
    public synchronized void updateConnection(Connection conn)
    {
        synchronized (connectionLock)
        {
            connection = conn;
            SubClients.clear();
        }
    }

    /**
     * get this HPCCWsClient's connection object.
     *
     * @return the connection
     */
    protected Connection getConnection()
    {
        synchronized (connectionLock)
        {
            return connection;
        }
    }

    /**
     * Test availability of target HPCC ESP service.
     *
     * @return bool value indicating if ping success
     * @throws Exception
     *             the exception
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
     * Reports the version of the original WSDL used to create the HPCCWsAttributesClient logic.
     * @return Original WSDL version
     */
    public String getWsSQLClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCWsSQLClient.getServiceWSDLURL());
    }

    /**
     * Gets the ws SQL client.
     *
     * @param wsSQLPort
     *            the ws SQL port
     * @return provides wsSQLClient on a port other than ECLWatch port.
     */
    public HPCCWsSQLClient getWsSQLClient(String wsSQLPort)
    {
        synchronized (connectionLock)
        {
            Connection tempConn = new Connection(connection.getProtocol(), connection.getHost(), wsSQLPort);
            tempConn.setCredentials(connection.getUserName(), connection.getPassword());
            return (HPCCWsSQLClient) SubClients.get(HPCCWsSQLClient.get(tempConn));
        }
    }

    /**
     * Gets the ws SQL client.
     *
     * @return provides wsSQLClient for direct method execution
     */
    public HPCCWsSQLClient getWsSQLClient()
    {
        return getWsSQLClient(String.valueOf(HPCCWsSQLClient.getServiceWSDLPort()));
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCWsAttributesClient logic.
     * @return Original WSDL version
     */
    public String getWsAttributesClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCWsAttributesClient.getServiceWSDLURL());
    }

    /**
     * provides WsAttributesClient for direct method execution.
     *
     * @param wsAttributesPort
     *            - If wsattributes is not running on eclwatch port
     * @return the ws attributes client
     */
    public HPCCWsAttributesClient getWsAttributesClient(String wsAttributesPort)
    {
        synchronized (connectionLock)
        {
            Connection tempConn = new Connection(connection.getProtocol(), connection.getHost(), wsAttributesPort);
            tempConn.setCredentials(connection.getUserName(), connection.getPassword());
            return (HPCCWsAttributesClient) SubClients.get(HPCCWsAttributesClient.get(tempConn));
        }
    }

    /**
     * Gets the ws attributes client.
     *
     * @return provides WsAttributesClient for direct method execution
     */
    public HPCCWsAttributesClient getWsAttributesClient()
    {
        return getWsAttributesClient(String.valueOf(HPCCWsAttributesClient.getServiceWSDLPort()));
    }

    /**
     * Gets the file spray client.
     *
     * @return provides fileSprayClient for direct method execution
     */
    public HPCCFileSprayClient getFileSprayClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCFileSprayClient) SubClients.get(HPCCFileSprayClient.get(connection));
        }
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCWsPackageProcessClient logic.
     * @return Original WSDL version
     */
    public String getHPCCWsPackageProcessClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCWsPackageProcessClient.getServiceWSDLURL());
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCWsFileIOClient logic.
     * @return Original WSDL version
     */
    public String getWsFileIOClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCWsFileIOClient.getServiceWSDLURL());
    }

    /**
     * Gets the ws file IO client.
     *
     * @return the ws file IO client
     */
    public HPCCWsFileIOClient getWsFileIOClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCWsFileIOClient) SubClients.get(HPCCWsFileIOClient.get(connection));
        }
    }

    /**
     * Gets the ws package process client.
     *
     * @return provides HPCCWsPackageProcessClient for direct method execution
     */
    public HPCCWsPackageProcessClient getWsPackageProcessClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCWsPackageProcessClient) SubClients.get(HPCCWsPackageProcessClient.get(connection));
        }
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCWsTopologyClient logic.
     * @return Original WSDL version
     */
    public String getWsTopologyClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCWsTopologyClient.getServiceWSDLURL());
    }

    /**
     * Gets the ws topology client.
     *
     * @return the ws topology client
     */
    public HPCCWsTopologyClient getWsTopologyClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCWsTopologyClient) SubClients.get(HPCCWsTopologyClient.get(connection));
        }
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCWsSMCClient logic.
     * @return Original WSDL version
     */
    public String getwsDFUClientClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCWsDFUClient.getServiceWSDLURL());
    }

    /**
     * Gets the ws DFU client.
     *
     * @return the ws DFU client
     */
    public HPCCWsDFUClient getWsDFUClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCWsDFUClient) SubClients.get(HPCCWsDFUClient.get(connection));
        }
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCWsSMCClient logic.
     * @return Original WSDL version
     */
    public String getWsSMCClientClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCWsSMCClient.getServiceWSDLURL());
    }

    /**
     * Gets the ws SMC client.
     *
     * @return provides HPCCWsSMCClient for direct method execution
     */
    public HPCCWsSMCClient getWsSMCClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCWsSMCClient) SubClients.get(HPCCWsSMCClient.get(connection));
        }
    }

    /**
     * Reports the version of the original WSDL used to create the HPCCWsWorkUnitsClient logic.
     * @return Original WSDL version
     */
    public String getWsWorkunitsClientVer()
    {
        return Utils.parseVersionFromWSDLURL(HPCCWsWorkUnitsClient.getServiceWSDLURL());
    }

    /**
     * Gets the ws workunits client.
     *
     * @return provides HPCCWsWorkUnitsClient for direct method execution
     */
    public HPCCWsWorkUnitsClient getWsWorkunitsClient()
    {
        synchronized (connectionLock)
        {
            return (HPCCWsWorkUnitsClient) SubClients.get(HPCCWsWorkUnitsClient.get(connection));
        }
    }

    /**
     * Returns all the available cluster groups (hthor, thor, roxie, etc.) on the target HPCC System.
     *
     * @return - The available cluster groups (hthor, thor, roxie, etc.) on the target HPCC System.
     * @throws Exception
     *             the exception
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
        catch (org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper e)
        {
            log.error(e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Returns all the available target cluster names (mythor, myroxie, etc) given a cluster group type/name (thor, roxie, etc.)
     *
     * @param clusterGroupType
     *            - The cluster group type/name
     * @return - Names of all available target cluster in the given cluster group
     * @throws Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public String[] getAvailableClusterNames(String clusterGroupType) throws Exception, org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
    {
        HPCCWsTopologyClient wsTopologyClient = HPCCWsTopologyClient.get(connection);

        if (wsTopologyClient != null)
            return wsTopologyClient.getValidClusterNames(clusterGroupType);
        else
            throw new Exception("Could not initialize HPCC WsTopology Client");
    }

    /**
     * Gets the available target cluster names.
     *
     * @return - List of all available target cluster names (mythor, myroxie, etc) on this HPCC System
     * @throws Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<String> getAvailableTargetClusterNames() throws Exception, org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
    {
        HPCCWsTopologyClient wsTopologyClient = HPCCWsTopologyClient.get(connection);

        if (wsTopologyClient != null)
            return wsTopologyClient.getValidTargetClusterNames();
        else
            throw new Exception("Could not initialize HPCC WsTopology Client");
    }

    /**
     * Spray a fixed record length data file onto a target cluster on the target HPCC System.
     *
     * @param fileName
     *            - The existing file (on the target HPCC System) to spray
     * @param targetFileLabel
     *            - The full label the sprayed file will be assigned
     * @param recordSize
     *            - The record length
     * @param targetCluster
     *            - The cluster on which to spray
     * @param overwritesprayedfile
     *            - Boolean, overwrite possibly sprayed file of same name
     * @return - Boolean, success.
     */
    public boolean sprayFlatHPCCFile(String fileName, String targetFileLabel, int recordSize, String targetCluster, boolean overwritesprayedfile)
    {
        boolean success = true;

        try
        {
            HPCCFileSprayClient fileSprayClient = getFileSprayClient();

            if (fileSprayClient != null)
                success = handleSprayResponse(
                        fileSprayClient.sprayFixedLocalDropZone(fileName, recordSize, targetFileLabel, "", targetCluster, overwritesprayedfile));
            else
                throw new Exception("Could not initialize HPCC fileSpray Client");
        }
        catch (RemoteException e)
        {
            log.error("Error: Could not spray file" + e.getLocalizedMessage());
        }
        catch (org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper e)
        {
            log.error(e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return success;
    }

    /**
     * Spray a variable/delimited data file onto a target cluster on the target HPCC System.
     *
     * @param fileName
     *            - The existing file (on the target HPCC System) to spray
     * @param targetFileLabel
     *            - The full label the sprayed file will be assigned
     * @param targetCluster
     *            - The cluster on which to spray
     * @param escapedEscapeSequence
     *            - The escape character sequence (must be escaped)
     * @param escapedFieldDelim
     *            - The field delimiter (must be escaped)
     * @param escapedQuote
     *            - The data quote (must be escaped)
     * @param escapedRecTerminator
     *            - The record terminator sequence (must be escaped)
     * @param overwritesprayedfile
     *            - Boolean, overwrite possibly sprayed file of same name
     * @param format
     *            - SprayVariableFormat
     * @return - Boolean, success.
     */

    public boolean sprayCustomCSVHPCCFile(String fileName, String targetFileLabel, String targetCluster, String escapedEscapeSequence,
            String escapedFieldDelim, String escapedQuote, String escapedRecTerminator, boolean overwritesprayedfile, SprayVariableFormat format)
    {
        boolean success = true;

        try
        {
            success = sprayVariableHPCCFile(fileName, targetFileLabel, targetCluster,
                    new DelimitedDataOptions(escapedRecTerminator, escapedFieldDelim, escapedEscapeSequence, escapedQuote), overwritesprayedfile,
                    format);
        }
        catch (Exception e)
        {
            log.error("Error: Could not spray file");
            success = false;
        }

        return success;
    }

    /**
     * Spray a CSV delimited data file (default CSV options) onto a target cluster on the target HPCC System.
     *
     * @param fileName
     *            - The existing file (on the target HPCC System) to spray
     * @param targetFileLabel
     *            - The full label the sprayed file will be assigned
     * @param targetCluster
     *            - The cluster on which to spray
     * @param overwritesprayedfile
     *            - Boolean, overwrite possibly sprayed file of same name
     * @return - Boolean, success.
     */
    public boolean sprayDefaultCSVHPCCFile(String fileName, String targetFileLabel, String targetCluster, boolean overwritesprayedfile)
    {
        boolean success = false;

        try
        {
            // Another way is to create the enumeration from the string representation...
            // FileFormat.convertDFUFileFormatName2Code("csv");
            success = sprayVariableHPCCFile(fileName, targetFileLabel, targetCluster, new DelimitedDataOptions(), overwritesprayedfile,
                    SprayVariableFormat.DFUff_csv); // could be
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return success;
    }

    /**
     * Spray a variable/delimited data file onto a target cluster on the target HPCC System.
     *
     * @param fileName
     *            - The existing file (on the target HPCC System) to spray
     * @param targetFileLabel
     *            - The full label the sprayed file will be assigned
     * @param targetCluster
     *            - The cluster on which to spray
     * @param options
     *            - Delimited file description
     * @param overwritesprayedfile
     *            - Boolean, overwrite possibly sprayed file of same name
     * @param format
     *            - SprayVariableFormat
     * @return - Boolean, success.
     */
    public boolean sprayVariableHPCCFile(String fileName, String targetFileLabel, String targetCluster, DelimitedDataOptions options,
            boolean overwritesprayedfile, SprayVariableFormat format)
    {
        boolean success = false;

        try
        {
            HPCCFileSprayClient fileSprayClient = getFileSprayClient();
            if (fileSprayClient != null)
                success = handleSprayResponse(fileSprayClient.sprayVariableLocalDropZone(options, fileName, targetFileLabel, "", targetCluster,
                        overwritesprayedfile, format));
            else
                throw new Exception("Could not initialize HPCC FileSpray Client");
        }
        catch (RemoteException e)
        {
            log.error("Error: Could not spray file" + e.getLocalizedMessage());
        }
        catch (org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper e)
        {
            log.error(e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return success;
    }

    /**
     * Handle spray response.
     *
     * @param progressResponseWrapper
     *            the progress response wrapper
     * @return true, if successful
     * @throws Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean handleSprayResponse(ProgressResponseWrapper progressResponseWrapper)
            throws Exception, org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
    {
        HPCCFileSprayClient fileSprayClient = getFileSprayClient();

        if (fileSprayClient == null) throw new Exception("Could not initialize HPCC FileSpray Client");

        return fileSprayClient.handleSprayResponse(progressResponseWrapper, 10, 100);
    }

    /**
     * Preferred mechanism for uploading files to HPCC landingzone. Utilizes sftp protocol, requires target machine user account
     *
     * @param localFileName
     *            Fully qualified local file name to be uploaded
     * @param targetFilename
     *            Desired name to apply to uploaded file
     * @param machineLoginUser
     *            Target machine user account name
     * @param password
     *            Target machine user account password
     * @return true, if successful
     */
    public boolean uploadFileToHPCC(String localFileName, String targetFilename, String machineLoginUser, String password)
    {
        try
        {
            HPCCFileSprayClient fileSprayClient = getFileSprayClient();
            if (fileSprayClient != null)

                fileSprayClient.sftpPutFileOnTargetLandingZone(localFileName, targetFilename, machineLoginUser, password);
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
     * NOT the preferred mechanism for uploading files to HPCC landingzone. Utilizes http protocol, targets hpcc ws
     * ONLY USE THIS METHOD for small files and/or when sftp access is not available
     *
     * @param localFileName
     *            Fully qualified local file name to be uploaded
     * @return true, if successful
     */
    public boolean httpUploadFileToFirstHPCCLandingZone(String localFileName)
    {
        try
        {
            HPCCFileSprayClient fileSprayClient = getFileSprayClient();
            if (fileSprayClient != null)
                fileSprayClient.uploadFileLocalDropZone(new File(localFileName));
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
     * Submits the given ECL to compile/execute on the targetclust, and returns results.
     *
     * @param wu
     *            - The workunit info object
     * @return - If successful, the resulting dataset(s)
     * @throws Exception
     *             the exception
     */
    public String submitECLandGetResults(WorkunitWrapper wu) throws Exception
    {
        String results = null;
        HPCCWsWorkUnitsClient wsWorkunitsClient = getWsWorkunitsClient();

        try
        {
            if (wsWorkunitsClient != null)
                results = wsWorkunitsClient.createAndRunWUFromECLAndGetResults(wu);
            else
                throw new Exception("Could not initialize HPCC WsWorkUnits Client");
        }
        catch (ArrayOfECLExceptionWrapper e)
        {
            log.error("Error submitting ECL: " + e.toString());
        }
        catch (Exception e)
        {
            log.error("Error submitting ECL: " + e.getLocalizedMessage());
            throw e;
        }

        return results;
    }

    /**
     * Submits the given ECL to compile/execute on the targetclust, and returns parsed results.
     *
     * @param wu
     *            - The workunit info
     * @return - If successful, the resulting dataset(s)
     * @throws Exception
     *             the exception
     */

    public List<List<Object>> submitECLandGetResultsList(WorkunitWrapper wu) throws Exception
    {
        List<List<Object>> resultsList;
        String results = submitECLandGetResults(wu);
        resultsList = Utils.parseECLResults(results);
        return resultsList;
    }

    /**
     * Submits the given ECL to compile/execute on the targetclust and returns WUID to track the query.
     * @param wu
     *            - The workunit info to be submitted
     * @return - If successful, the resulting WUID, which can be used to query info, including results
     */
    public String submitECLandGetWUID(WorkunitWrapper wu)
    {
        String WUID = null;
        HPCCWsWorkUnitsClient wsWorkunitsClient = getWsWorkunitsClient();

        try
        {
            if (wsWorkunitsClient != null)
                WUID = wsWorkunitsClient.createAndRunWUFromECLAndGetWUID(wu);
            else
                throw new Exception("Could not initialize HPCC WsWorkUnits Client");
        }
        catch (ArrayOfECLExceptionWrapper | org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper e)
        {
            log.error("Error submitting ECL: " + e.toString());
        }
        catch (Exception e)
        {
            log.error("Error submitting ECL: " + e.getLocalizedMessage());
        }

        return WUID;
    }

    /**
     * Get this HPCCWsClient's connection protocol (http|https).
     *
     * @return the protocol
     */
    public String getProtocol()
    {
        return connection.getProtocol();
    }

    /**
     * Get this HPCCWsClient's connection host address.
     *
     * @return the host
     */
    public String getHost()
    {
        return connection.getHost();
    }

    /**
     * Get this HPCCWsClient's connection port.
     *
     * @return the port int
     */
    public int getPortInt()
    {
        return connection.getPortInt();
    }

    /**
     * Get the user name used to by HPCCWsClient to authenticate against target ECLWatch.
     *
     * @return the user name
     */
    public String getUserName()
    {
        return connection.getUserName();
    }

    /**
     * Get the password used to by HPCCWsClient to authenticate against target ECLWatch.
     *
     * @return the password
     */
    public String getPassword()
    {
        return connection.getPassword();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.utils.DataSingleton#isComplete()
     */
    @Override
    protected boolean isComplete()
    {
        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.utils.DataSingleton#fastRefresh()
     */
    @Override
    protected void fastRefresh()
    {
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.utils.DataSingleton#fullRefresh()
     */
    @Override
    protected void fullRefresh()
    {
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.utils.DataSingleton#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof HPCCWsClient))
        {
            return false;
        }

        HPCCWsClient that = (HPCCWsClient) aThat;

        return EqualsUtil.areEqual(getConnection(), that.getConnection());
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.utils.DataSingleton#hashCode()
     */
    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, connection);
        return result;
    }
}

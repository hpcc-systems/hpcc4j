package org.hpccsystems.ws.client;

import java.io.File;
import java.rmi.RemoteException;
import java.util.List;

import org.hpccsystems.ws.client.soap.filespray.DropZone;
import org.hpccsystems.ws.client.soap.filespray.EspException;
import org.hpccsystems.ws.client.soap.filespray.ProgressRequest;
import org.hpccsystems.ws.client.soap.filespray.ProgressResponse;
import org.hpccsystems.ws.client.soap.wsworkunits.WUPublishWorkunitResponse;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DelimitedDataOptions;
import org.hpccsystems.ws.client.utils.FileFormat;
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
public class HPCCWSClient
{
    private HPCCFileSprayClient           fileSprayClient             = null;
    private HPCCWsFileIOClient            wsFileIOClient              = null;
    private HPCCWsTopologyClient          wsTopologyClient            = null;
    private HPCCECLDirectClient           eclDirectClient             = null;
    private HPCCWsWorkUnitsClient         wsWorkunitsClient           = null;

    public static final String defaultTargetWsECLWatchHost      = "localhost";
    public static final String defaultTWsECLWatchPort           = "8010";
    public static final String defaultTWsECLWatchSSLPort        = "18010";

    private String targetDropzoneNetAddres = null;
    private boolean verbosemode = false;
    private Connection connection = null;

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
    public HPCCWSClient()
    {
        this(defaultTargetWsECLWatchHost,defaultTWsECLWatchPort);
    }

    /**
     *  Instantiates HPCCWSClient, attempts to establish all communications on <protocol>://localhost:<defaultportonprotocol>
     */
    public HPCCWSClient(String protocol)
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
    public HPCCWSClient(String targetWsECLWatchAddress, String targetWsECLWatchPort)
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
    public HPCCWSClient(String protocol, String targetWsECLWatchAddress, String targetWsECLWatchPort)
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
    public HPCCWSClient(String targetWsECLWatchAddress, String targetWsECLWatchPort, String username, String password)
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
    public HPCCWSClient( String protocol, String targetWsECLWatchAddress, String targetWsECLWatchPort, String username, String password)
    {
        connection = new Connection(protocol, targetWsECLWatchAddress, targetWsECLWatchPort);
        connection.setCredentials(username, password);
    }

    /**
     * Instantiates HPCCWSClient, uses contents of connection object to communicate with target HPCC System.
     * @param conn
     */
    public HPCCWSClient(Connection conn)
    {
        connection = conn;
    }

    /**
     * Test availability of target HPCC ESP service
     * @param conn
     */
    public synchronized boolean pingServer() throws Exception
    {
        initWsWorkunitsClient();

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

    private void initFileSprayClient() throws Exception
    {
        if (fileSprayClient == null)
        {
            fileSprayClient = new HPCCFileSprayClient(connection);

            if (fileSprayClient == null)
                throw new Exception("Could not create HPCC FileSpray Client");

            Utils.println(System.out, "FileSprayClient based on WSDL ver_: " + getFileSprayClientVer(),true, verbosemode);
        }
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
    public HPCCFileSprayClient getFileSprayClient() throws Exception
    {
        initFileSprayClient();
        return fileSprayClient;
    }

    private void initWsFileIOClient() throws Exception
    {
        if (wsFileIOClient == null)
        {
            wsFileIOClient = new HPCCWsFileIOClient(connection);

            if (wsFileIOClient == null)
                throw new Exception("Could not create HPCC FileIO Client");

            Utils.println(System.out, "WsFileIOClient based on WSDL ver_: " + getWsFileIOClientVer(),true, verbosemode);
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
    public HPCCWsFileIOClient getWsFileIOClient() throws Exception
    {
        initWsFileIOClient();
        return wsFileIOClient;
    }

    private void initWsTopologyClient() throws Exception
    {
        if (wsTopologyClient == null)
        {
            wsTopologyClient = new HPCCWsTopologyClient(connection);

            if (wsTopologyClient == null)
                throw new Exception("Could not create HPCC WsTopology Client");

            Utils.println(System.out, "WsTopologyClient based on WSDL ver_: " + getWsTopologyClientVer(),true, verbosemode);
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
    public HPCCWsTopologyClient getWsTopologyClient() throws Exception
    {
        initWsTopologyClient();
        return wsTopologyClient;
    }

    private HPCCECLDirectClient initEclDirectClient() throws Exception
    {
        if (eclDirectClient == null)
        {
            eclDirectClient = new HPCCECLDirectClient(connection);

            if (eclDirectClient == null)
                throw new Exception("Could not create HPCC ECL Direct Client");

            Utils.println(System.out, "EclDirectClient based on WSDL ver_: " + getEclDirectClientVer() ,true, verbosemode);
        }

        return eclDirectClient;
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
    public HPCCECLDirectClient getEclDirectClient() throws Exception
    {
        initEclDirectClient();
        return eclDirectClient;
    }

    private void initWsWorkunitsClient() throws Exception
    {
        if (wsWorkunitsClient == null)
        {
            wsWorkunitsClient = new HPCCWsWorkUnitsClient(connection);
            Utils.println(System.out, "wsWorkunitsClient based on WSDL ver_: " + getWsWorkunitsClientVer(),true, verbosemode);

            if (wsWorkunitsClient == null)
                throw new Exception("Could not create HPCC WsWorkUnits Client");
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
    public HPCCWsWorkUnitsClient getWsWorkunitsClient() throws Exception
    {
        initWsWorkunitsClient();
        return wsWorkunitsClient;
    }

    /**
     * Returns all the available cluster groups (hthor, thor, roxie, etc.) on the target HPCC System.
     * @return                      - The available cluster groups (hthor, thor, roxie, etc.) on the target HPCC System.
     */
    public String[] getAvailableClusterGroups()
    {
        if (wsTopologyClient == null)
            wsTopologyClient = new HPCCWsTopologyClient(connection);

        try
        {
            return wsTopologyClient.getValidTargetGroupNames();
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
        initWsTopologyClient();
        return wsTopologyClient.getValidTargetClusterNames(clusterGroupType);
    }

    /**
     * @return          - List of all available target cluster names (mythor, myroxie, etc) on this HPCC System
     * @throws Exception
     */
    public List<String> getAvailableTargetClusterNames() throws Exception
    {
        initWsTopologyClient();
        return wsTopologyClient.getValidTargetClusterNames();
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
            initFileSprayClient();
            success = handleSprayResponse(fileSprayClient.sprayFixedLocalDropZone(fileName, recordSize, targetFileLabel, "", targetCluster, overwritesprayedfile));
        }
        catch (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException e)
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
            //Another way is to create the enumaration from the string representation...
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
            initFileSprayClient();
            success = handleSprayResponse(fileSprayClient.sprayVariableLocalDropZone(options, fileName, targetFileLabel, "", targetCluster, overwritesprayedfile, format));
        }
        catch (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException e)
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

    private boolean handleSprayResponse(ProgressResponse sprayResponse) throws org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException, RemoteException
    {
        boolean success = false;

        org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException exceptions = sprayResponse.getExceptions();
        if (exceptions != null)
        {
            for (EspException espexception : exceptions.getException())
            {
                Utils.println(System.out, "Error spraying file: " + espexception.getSource() + espexception.getMessage(), false, verbosemode);
            }
        }
        else
        {
            ProgressRequest dfuprogressparams = new ProgressRequest();
            dfuprogressparams.setWuid(sprayResponse.getWuid());
            Utils.println(System.out, "Spray file DWUID: " +sprayResponse.getWuid(), true, verbosemode);
            ProgressResponse progressResponse = fileSprayClient.fileSprayServiceSoapProxy.getDFUProgress(dfuprogressparams);

            if (progressResponse.getExceptions() != null)
            {

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
            initFileSprayClient();
            fileSprayClient.uploadFileLocalDropZone(file);
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

        initWsFileIOClient();
        initFileSprayClient();

        if (targetDropzoneAddress == null || targetDropzoneAddress.length() == 0)
        {
            DropZone[] localdropzones = fileSprayClient.fetchLocalDropZones();
            if (localdropzones != null && localdropzones.length > 0)
            {
                targetDropzoneAddress = localdropzones[0].getNetAddress();
            }
        }

        if (targetDropzoneAddress != null && targetDropzoneAddress.length() == 0)
        {
            if (!wsFileIOClient.createHPCCFile(fileName, targetDropzoneAddress, true))
                    throw new Exception("Could not create target HPCC namespaces file.");

                //Remote HPCC file has been created, encode the data so it can be uploaded as binary data.
                //byte [] encodedBytes = encodeData(triplesCSVFormat.toString());
                //The data was being encoded, but latest test don't seem to require encoding.
                success = wsFileIOClient.writeHPCCFileData(data.getBytes(), fileName, targetDropzoneNetAddres, false, 0, 0);
        }

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
    public String submitECLandGetResults(String ecl, String targetcluster, int resultLimit, int maxwait) throws Exception
    {
        String results = null;

        initEclDirectClient();

        try
        {
            results = eclDirectClient.submitECLandGetResults(ecl, targetcluster, resultLimit, maxwait);
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

    public List<List <Object>> submitECLandGetResultsList(String ecl, String targetcluster, int resultLimit, int maxwait) throws Exception
    {
        List<List <Object>> resultsList;

        String results = submitECLandGetResults(ecl, targetcluster, resultLimit, maxwait);
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
    public String submitECLandGetWUID(String ecl, String targetcluster, int resultLimit, int maxwait)
    {
        String WUID = null;

        try
        {
            initEclDirectClient();
            WUID = eclDirectClient.submitECL(ecl, targetcluster, resultLimit, maxwait);
        }
        catch (Exception e)
        {
            System.out.println("Error submitting ECL: " + e.getLocalizedMessage());
            e.printStackTrace();
        }

        return WUID;
    }

    /**
     * This main class in only meant as a guide/example on how to use the HPCCWSClient API.
     * @param args
     */
    public static void main (String[] args)
    {

        /* this main is only meant to be a example*/
        HPCCWSClient connector = new HPCCWSClient("http", "192.168.56.120","8010");

        connector.setVerbosemode(true);

        try
        {
            //connector.uploadFileToHPCC(new File("C://assignments//data//shortpersons"));
            connector.uploadFileToHPCC(new File("C://assignments//data//shortaccounts"));

            //for our curiosity, what cluster groups and clusters are available.
            List<String> clusters = connector.getAvailableTargetClusterNames();
            String[] clusterGroups = connector.getAvailableClusterGroups();
            for (int i = 0; i < clusterGroups.length; i++)
            {
                System.out.println(clusterGroups[i]);
                String[] actualclusternames = connector.getAvailableClusterNames(clusterGroups[i]);
                if (actualclusternames != null)
                {
                    for (int j = 0; j < actualclusternames.length; j++)
                    {
                        System.out.println("\t" + actualclusternames[j]);
                    }
                }
            }

            //pick one of the valid clusters
            connector.sprayFlatHPCCFile("shortpersons", "mythor::shortpersons", 155, clusters.get(0) /*myroxie, mythor, etc*/, true);

            System.out.println(FileFormat.convertDFUFileFormatName2Code("xcsv").getValue());
            connector.sprayDefaultCSVHPCCFile("shortaccounts","mythor::shortaccounts", clusters.get(0), true);

            String outputCSVfileContentsEcl = "Layout_CSV_Accounts := RECORD" +
                    "    UNSIGNED INTEGER8 PersonID;" +
                    "    STRING8 ReportDate;" +
                    "    STRING2 IndustryCode;" +
                    "    UNSIGNED4 Member;" +
                    "    STRING8 OpenDate;" +
                    "    STRING1 TradeType;" +
                    "    STRING1 TradeRate;" +
                    "    UNSIGNED1 Narr1;" +
                    "    UNSIGNED1 Narr2;" +
                    "    UNSIGNED4 HighCredit;" +
                    "    UNSIGNED4 Balance;" +
                    "    UNSIGNED2 Terms;" +
                    "    UNSIGNED1 TermTypeR;" +
                    "    STRING15  AccountNumber;" +
                    "    STRING8 LastActivityDate;" +
                    "    UNSIGNED1 Late30Day;" +
                    "    UNSIGNED1 Late60Day;" +
                    "    UNSIGNED1 Late90Day;" +
                    "    STRING1 TermType;" +
                    "END;" +
                    "" +
                    "hpccaccountrecords := DATASET('~mythor::shortaccounts', Layout_CSV_Accounts, CSV);" +
                    "output(hpccaccountrecords) ;";

            String outputFlatfileContentsEcl = "Layout_Persons := RECORD " +
                    "UNSIGNED INTEGER8 ID;" +
                    "STRING15 FirstName;" +
                    "STRING25 LastName;" +
                    "STRING15 MiddleName;" +
                    "STRING2 NameSuffix;" +
                    "STRING8 FileDate;" +
                    "UNSIGNED INTEGER2 BureauCode;" +
                    "STRING1  MaritalStatus;" +
                    "STRING1 Gender;" +
                    "UNSIGNED INTEGER1 DependentCount;" +
                    "STRING8 BirthDate;" +
                    "STRING42 StreetAddress;" +
                    "STRING20 City;" +
                    "STRING2 State;" +
                    "STRING5 ZipCode;" +
                    "END;" +
                    "" +
                    "hpccpersonrecords := DATASET('~mythor::shortpersons', Layout_Persons, FLAT);" +
                    "output(hpccpersonrecords) ;";

            //this is just one way to submitECL, you can also submit via ecldirect and request the resulting WUID
            //you can also, submit via WSWorkunits and have more control over the result window you get back.
            String results = connector.submitECLandGetResults(outputFlatfileContentsEcl, clusterGroups[0] /*hthor,thor,roxie*/, 100, 1000);

            //List<List <Object>> resultsList = Utils.parseECLResults(results);

            WUPublishWorkunitResponse publishresp = connector.getWsWorkunitsClient().publishWUFromEcl(outputFlatfileContentsEcl, "myflatoutput", clusterGroups[1]);


            List<List <Object>> resultsList = connector.submitECLandGetResultsList(outputFlatfileContentsEcl, clusterGroups[0] /*hthor,thor,roxie*/, 100, 1000);
            int resultsets = resultsList.size();

            Utils.println(System.out, "Found " + resultsets + " resultsets.", false, true);
            int currentrs = 1;

            for (List<Object> list : resultsList)
            {
                Utils.print(System.out, "Resultset " + currentrs +":", false, true);
                for (Object object : list)
                {
                    System.out.print("[ " + object.toString() +" ]");
                }
                currentrs++;
                System.out.println("");
            }

            String wuid = connector.getWsWorkunitsClient().createAndRunWUFromECLAndGetWUID(outputFlatfileContentsEcl, clusterGroups[1], 10,null,null);
            String results2 = connector.getWsWorkunitsClient().fetchResults(wuid, 0, clusterGroups[1], true, -1, -1);
            System.out.println(results2);
        }
        catch (Exception e)
        {
            System.out.println( e.getLocalizedMessage());
        }
    }
}


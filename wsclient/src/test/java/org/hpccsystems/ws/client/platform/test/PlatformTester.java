package org.hpccsystems.ws.client.platform.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import org.hpccsystems.ws.client.HPCCFileSprayClient;
import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.extended.HPCCWsAttributesClient;
import org.hpccsystems.ws.client.extended.HPCCWsSQLClient;
import org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ExecuteSQLResponse;
import org.hpccsystems.ws.client.gen.filespray.v1_15.PhysicalFileStruct;
import org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUDataColumn;
import org.hpccsystems.ws.client.platform.DFUFileDetailInfo;
import org.hpccsystems.ws.client.platform.DFUFilePartInfo;
import org.hpccsystems.ws.client.platform.DFUFilePartsOnClusterInfo;
import org.hpccsystems.ws.client.platform.DropZone;
import org.hpccsystems.ws.client.platform.LogicalFile;
import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.platform.test.data.Accounts;
import org.hpccsystems.ws.client.platform.test.data.Persons;
import org.hpccsystems.ws.client.utils.Utils;

public class PlatformTester
{
    public static void writeFile(String filename, String content, boolean overwrite)
    {
        BufferedWriter output = null;
        try
        {
            File file = new File(filename);
            if (!file.exists() || overwrite)
            {
                output = new BufferedWriter(new FileWriter(file));
                output.write(content);
            }
            else
                System.out.println(filename + " exists! Will NOT overwrite!");
        }
        catch ( IOException e )
        {
            System.out.println("Could not create and populate file (" + filename + ")!");
            System.out.println(e.getLocalizedMessage());
        }
        finally
        {
          if ( output != null )
          {
            try
            {
                output.close();
            }
            catch (IOException e)
            {
                System.out.println("Could not close newly created file (" + filename + ")!");
                System.out.println(e.getLocalizedMessage());
            }
          }
        }
    }

    private static void usage()
    {
        System.out.println("Options: "
                + "-server=<HPCCServerAddress>          DEFAULT:localhost"
                + "-port=<ECLWatchPort                  DEFAULT:8010"
                + "-protocol=<ECLWatchAddressProtocol>  DEFAULT:http"
                + "-user=<ECLWatch User>                DEFAULT:"
                + "-pass=<ECLWatch Pass>                DEFAULT:"
                + "-machineuser=<machine's username>    DEFAULT:"
                + "-machinepass=<machine's password>    DEFAULT:"
                + "-wssqlport=<WsSQLPort>               DEFAULT:8510");

        System.exit(-1);
    }

    static private final String PARAMPREFIX          = "-(?i)";
    static public final String  SERVERPATTERN    = PARAMPREFIX + "server";
    static public final String  PORTPATTERN    = PARAMPREFIX + "port";
    static public final String  PROTOCOLPATTERN    = PARAMPREFIX + "protocol";
    static public final String  USERPATTERN    = PARAMPREFIX + "user";
    static public final String  PASSPATTERN    = PARAMPREFIX + "pass";
    static public final String  MACHINEUSERPATTERN    = PARAMPREFIX + "machineuser";
    static public final String  MACHINEPASSPATTERN    = PARAMPREFIX + "machinepass";
    static public final String  WSSQLPORTPATTERN    = PARAMPREFIX + "wssqlport";

    public static void main(String[] args)
    {
        String hpccServer = "localhost";
        int port = 8010;
        String prot = "http";
        String user = "";
        String pass = "";
        String machineuser = "";
        String machinepass = "";
        String wssqlport = "8510";

        for (int i = 0; i < args.length; i++)
        {
            StringTokenizer params = new StringTokenizer(args[i], "=");

            while (params.hasMoreElements())
            {
                String currentParam = (String) params.nextElement();
                String currentParamVal = null;

                if (params.hasMoreElements())
                {
                    currentParamVal = (String) params.nextElement();
                }
                else
                {
                    Utils.println(System.out, "ERROR: " + currentParam + "=??", false, false);
                    usage();
                }
                if (currentParam.matches(SERVERPATTERN))
                {
                    hpccServer = currentParamVal;
                    Utils.println(System.out, "TARGET HPCC SERVER: " + currentParamVal, false, false);
                }
                else if (currentParam.matches(PORTPATTERN))
                {
                    port = Integer.parseInt(currentParamVal);
                    Utils.println(System.out, "TARGET HPCC PORT: " + currentParamVal, false, false);
                }
                else if (currentParam.matches(PROTOCOLPATTERN))
                {
                    prot = currentParamVal;
                    Utils.println(System.out, "TARGET HPCC PROTOCOL: " + currentParamVal, false, false);
                }
                else if (currentParam.matches(USERPATTERN))
                {
                    user = currentParamVal;
                    Utils.println(System.out, "TARGET HPCC User: " + currentParamVal, false, false);
                }
                else if (currentParam.matches(USERPATTERN))
                {
                    pass = currentParamVal;
                    Utils.println(System.out, "TARGET HPCC password set!", false, false);
                }
                else if (currentParam.matches(MACHINEUSERPATTERN))
                {
                    machineuser = currentParamVal;
                    Utils.println(System.out, "TARGET machine user: " + currentParamVal, false, false);
                }
                else if (currentParam.matches(MACHINEPASSPATTERN))
                {
                    machinepass = currentParamVal;
                    Utils.println(System.out, "TARGET machine password set!", false, false);
                }
                else if (currentParam.matches(WSSQLPORTPATTERN))
                {
                    wssqlport = currentParamVal;
                    Utils.println(System.out, "TARGET WsSQL port: " + currentParamVal, false, false);
                }

                else
                {
                    Utils.println(System.out, "Unrecognized param: " + currentParam, false, false);
                    usage();
                }
            }
        }

        try
        {
            Platform platform = Platform.get(prot, hpccServer, port, user, pass);

            Version v = platform.getVersion();
            System.out.println(v.toString());

            HPCCWsClient client1 = platform.checkOutHPCCWsClient();
            HPCCWsClient client2 = platform.checkOutHPCCWsClient();
            HPCCWsClient client3 = platform.checkOutHPCCWsClient();
            HPCCWsClient client4 = platform.checkOutHPCCWsClient();
            if (platform.validateHPCCWsClient(client1))
            {
                HPCCWsAttributesClient wsAttributesClient1 = client1.getWsAttributesClient();
            }

            if (platform.validateHPCCWsClient(client2))
            {
                HPCCWsAttributesClient wsAttributesClient2 = client2.getWsAttributesClient();
                platform.expireHPCCWsClient(client2);
                if (!platform.validateHPCCWsClient(client2))
                    System.out.println("not validated");
                else
                    wsAttributesClient2 = client2.getWsAttributesClient();
            }

            HPCCWsAttributesClient wsAttributesClient3 = client3.getWsAttributesClient();
            HPCCWsAttributesClient wsAttributesClient4 = client4.getWsAttributesClient();

            platform.checkInHPCCWsClient(client1);
            platform.checkInHPCCWsClient(client2);
            platform.checkInHPCCWsClient(client3);
            platform.checkInHPCCWsClient(client4);

            DropZone[] dropzones = platform.getDropZones();
            for(int i = 0; i < dropzones.length; i++)
            {
                System.out.println("Dropzone Name: " + dropzones[i].getName());
                String[] cna = dropzones[i].getConfiguredNetAddresses();
                String[] na = dropzones[i].getNetAddresses();
                
                LogicalFile[] mydzfiles = dropzones[i].getFiles();
                for (LogicalFile logicalFile : mydzfiles)
                {
                    System.out.println(logicalFile.getName());
                }
                if(cna != null && na != null)
                {
                    if(cna.length != na.length)
                    {
                        System.out.println("confNetAddress list does not match addressList length");
                    }
                    else
                    {
                        for(int b = 0; b < cna.length; b++)
                        {
                            System.out.println("\tconfNetAddress: " + cna[b]);
                            System.out.println("\tnetAddress:     " + na[b]);
                            System.out.println("\t-------------------------------------");
                        }
                    }
                }
            }
            
            HPCCFileSprayClient fsc = platform.getFileSprayClient();
            org.hpccsystems.ws.client.gen.filespray.v1_15.DropZone[] dzLocal = fsc.fetchLocalDropZones();
            if (dzLocal != null && dzLocal.length > 0)
            {
                System.out.println("fetchLocalDropZones test ...");
                for(int i = 0; i < dzLocal.length; i++)
                {
                    System.out.println("DropZone[" + i + "]");
                    System.out.println("\tDropZone:   " + dzLocal[i].getName());
                    System.out.println("\tNetAddress: " + dzLocal[i].getNetAddress());
                }
            }
            
            org.hpccsystems.ws.client.gen.filespray.v1_15.DropZone[] dzByAddress = fsc.fetchDropZones(hpccServer);
            if (dzByAddress != null && dzByAddress.length > 0)
            {
                System.out.println("fetchDropZones by address test ...");
                for(int i = 0; i < dzByAddress.length; i++)
                {
                    System.out.println("DropZone[" + i + "]");
                    System.out.println("\tDropZone:   " + dzByAddress[i].getName());
                    System.out.println("\tNetAddress: " + dzByAddress[i].getNetAddress());
                }
            }
            
            if (dzByAddress != null && dzByAddress.length > 0);
            PhysicalFileStruct[] pfs = fsc.listFiles(dzByAddress[0].getNetAddress(), dzByAddress[0].getPath(), dzByAddress[0].getLinux());
            System.out.println("listFiles test ...");
            if (pfs != null && pfs.length > 0)
            {
                for(int i = 0; i < pfs.length; i++)
                {
                    System.out.println(pfs[0].toString());
                }
            }

            String tmpPeopleFile = System.getProperty("java.io.tmpdir") + File.separator + "people";
            writeFile( tmpPeopleFile, Persons.data, false);

            String tmpAccountFile = System.getProperty("java.io.tmpdir") + File.separator + "account";
            writeFile( tmpAccountFile, Accounts.data, false);

            int pport = HPCCWsAttributesClient.getOriginalPort();
            HPCCWsClient connector = platform.checkOutHPCCWsClient();
            connector.setVerbosemode(true);
            System.out.println("wsdfu ver: " + connector.getwsDFUClientClientVer());
            HPCCWsDFUClient wsDFUClient = connector.getWsDFUClient();
            platform.checkInHPCCWsClient(connector);
            
            connector = platform.checkOutHPCCWsClient();
            System.out.println("wsfileio ver: " + connector.getWsFileIOClientVer());
            System.out.println("wssmc ver: " + connector.getWsSMCClientClientVer());

            DFUDataColumn[] newgetFileDataColumns = wsDFUClient.getFileMetaData(".::kw_test_sup", null);
            for (int i = 0; i < newgetFileDataColumns.length; i++)
            {
                System.out.println("Col name: " + newgetFileDataColumns[i].getColumnLabel() + " ecl: " + newgetFileDataColumns[i].getColumnEclType() + " col type " + newgetFileDataColumns[i].getColumnType());
            }

            System.out.println("Test for showing file part informaztion");
            DFUFileDetailInfo fd = wsDFUClient.getFileDetails("hthor::processed::persons", null);
            DFUFilePartsOnClusterInfo[] fp = fd.getDFUFilePartsOnClusters();
            for (int f=0; fp!=null && f<fp.length; f++)
            {
                System.out.println("Parts on cluster: " + fp[f].getCluster());
                DFUFilePartInfo[] parts = fp[f].getDFUFileParts();
                for (int i=0; i<parts.length; i++)
                    System.out.println("Part ID=" + parts[i].getId()
                                    + ": Copy Flag=" + parts[i].getCopy()
                                    + ": IP=" + parts[i].getIp()
                                    + ": Size=" + parts[i].getPartsize());
            }

            try
            {
                //WSSQL Test
                HPCCWsSQLClient wsSQLClient = platform.getWsClient().getWsSQLClient(wssqlport);
                String s = "CREATE TABLE newtablename (FirstName VARCHAR(15), LastName VARCHAR(25), MiddleName VARCHAR(15) ,StreetAddress VARCHAR(42), city VARCHAR(20), state VARCHAR(2), zip VARCHAR(5)) LOAD DATA INFILE 'people-small' CONNECTION '10.0.2.15' DIRECTORY '/var/lib/HPCCSystems/mydropzone' INTO TABLE newtablename";
                ExecuteSQLResponse executeSQLFullResponse = wsSQLClient.executeSQLFullResponse(s, "thor", "thor", Integer.valueOf(0), Integer.valueOf(0),Integer.valueOf(0), false, false, "me", Integer.valueOf(-1));
                System.out.println(executeSQLFullResponse.getResult());

                s = "SELECT * from newtablename  where state = 'FL' limit 10;";
                executeSQLFullResponse = wsSQLClient.executeSQLFullResponse(s, "thor", "thor", Integer.valueOf(0), Integer.valueOf(0),Integer.valueOf(0), false, false, "me", Integer.valueOf(-1));
                System.out.println(executeSQLFullResponse.getResult());
            }
            catch (java.net.ConnectException e)
            {
                System.out.println("Could not connect to WsSQL on port: " + wssqlport + "\n>>" + e.getLocalizedMessage());
            }
            catch (Exception e)
            {
                System.out.println("Encountered issue while testing WsSQL on port: " + wssqlport + "\n>>" + e.getLocalizedMessage());
            }

        }
        catch (Exception e)
        {
            System.out.println( e.getLocalizedMessage());
        }
        finally
        {
            System.out.println("\n****WsClient HPCC platform tester has finished****\n" );
        }

    }

}

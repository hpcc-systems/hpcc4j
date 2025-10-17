package org.hpccsystems.ws.client.platform.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

import org.hpccsystems.ws.client.HPCCFileSprayClient;
import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.HPCCWsSMCClient;
import org.hpccsystems.ws.client.HPCCWsSQLClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.extended.HPCCWsAttributesClient;
import org.hpccsystems.ws.client.platform.PhysicalFile;
import org.hpccsystems.ws.client.platform.PhysicalMachine;
import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.platform.test.data.Accounts;
import org.hpccsystems.ws.client.platform.test.data.Persons;
import org.hpccsystems.ws.client.utils.Utils;
import org.hpccsystems.ws.client.utils.Utils.HPCCEnvOSCode;
import org.hpccsystems.ws.client.wrappers.ArrayOfBaseExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.PhysicalFileStructWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.ExecuteSQLResponseWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileAccessInfoWrapper;
import org.junit.experimental.categories.Category;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.context.Scope;
import io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk;

@Category(org.hpccsystems.commons.annotations.RemoteTests.class)
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
        System.out.println("Options: \n"
                + "-server=<HPCCServerAddress>          DEFAULT:localhost\n"
                + "-port=<ECLWatchPort                  DEFAULT:8010\n"
                + "-protocol=<ECLWatchAddressProtocol>  DEFAULT:http\n"
                + "-user=<ECLWatch User>                DEFAULT:\n"
                + "-pass=<ECLWatch Pass>                DEFAULT:\n"
                + "-machineuser=<machine's username>    DEFAULT:\n"
                + "-machinepass=<machine's password>    DEFAULT:\n"
                + "-wssqlport=<WsSQLPort>               DEFAULT:8510\n");

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
                else if (currentParam.matches(PASSPATTERN))
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
            OpenTelemetry globalOTel = null;
            if (Boolean.getBoolean("otel.java.global-autoconfigure.enabled"))
            {
                System.out.println("OpenTelemetry autoconfiguration enabled with following values.");
                System.out.println("If any of these options are not provided, they will defalt to values which could require additional CLASSPATH dependancies.");
                System.out.println("If missing dependancies arise, test will halt!");
                System.out.println("    otel.traces.exporter sys property: "+System.getProperty("otel.traces.exporter"));
                System.out.println("    OTEL_TRACES_EXPORTER Env var: " + System.getenv("OTEL_TRACES_EXPORTER"));
                System.out.println("    OTEL_TRACES_SAMPLER Env var: " + System.getenv("OTEL_TRACES_SAMPLER"));
                System.out.println("    otel.traces.sampler sys property: "+System.getProperty("otel.traces.sampler"));
                System.out.println("    otel.logs.exporter: "+ System.getProperty("otel.logs.exporter"));
                System.out.println("    OTEL_LOGS_EXPORTER Env var: " + System.getenv("OTEL_LOGS_EXPORTER"));
                System.out.println("    otel.metrics.exporter: "+ System.getProperty("otel.metrics.exporter"));
                System.out.println("    OTEL_METRICS_EXPORTER Env var: " + System.getenv("OTEL_METRICS_EXPORTER"));

                if (!Utils.isOtelJavaagentUsed())
                {
                    globalOTel = AutoConfiguredOpenTelemetrySdk.initialize().getOpenTelemetrySdk();
                }
            }

            if (globalOTel == null)
                globalOTel = GlobalOpenTelemetry.get();

            Span rootSpan = globalOTel.getTracer("PlatformTester").spanBuilder("PlatformTest").startSpan();
            try (Scope scope = rootSpan.makeCurrent())
            {
                Platform platform = Platform.get(prot, hpccServer, port, user, pass);

                HPCCWsSMCClient wssmc = platform.getWsClient().getWsSMCClient();

                Version targetVersion = new Version(wssmc.getHPCCBuild());

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

                platform.checkInHPCCWsClient(client2);
                platform.checkInHPCCWsClient(client3);
                platform.checkInHPCCWsClient(client4);

                org.hpccsystems.ws.client.platform.DropZone[] dropzones = platform.getDropZones();
                for(int i = 0; i < dropzones.length; i++)
                {
                    System.out.println("Dropzone Name: " + dropzones[i].getName());
                    System.out.println("Dropzone Directory: " + dropzones[i].getDirectory());
                    System.out.println("Dropzone Machines: ");
                    PhysicalMachine [] dzmachines = dropzones[i].getMachines();
                    for (PhysicalMachine physicalmachine : dzmachines)
                    {
                        System.out.println("\tName: " + physicalmachine.getName());
                        System.out.println("\tConfigured Address: " + physicalmachine.getConfigNetaddress());
                        System.out.println("\tActual Address: " + physicalmachine.getNetaddress());
                        System.out.println("\tOS: " + physicalmachine.getOSName());
                        boolean isWin = physicalmachine.getOSCode() == HPCCEnvOSCode.MachineOsW2K;
                        System.out.println("\tFiles: ");

                        PhysicalFile[] physicalFiles = physicalmachine.getFiles();
                        for (PhysicalFile physicalFile : physicalFiles)
                        {
                            String name = physicalFile.getName() + (physicalFile.getIsDir() ? (!isWin ? "/" : "\\") : "");
                            System.out.format( "\t\t%-30s %15s %15s\n", name, physicalFile.getIsDir() ? "" : physicalFile.getFilesize() , physicalFile.getModifiedtime());
                        }
                    }
                }

                HPCCFileSprayClient fsc = client1.getFileSprayClient();
                List<DropZoneWrapper> dzLocal = fsc.fetchLocalDropZones();
                if (dzLocal != null && dzLocal.size() > 0)
                {
                    System.out.println("fetchLocalDropZones test ...");
                    for(int i = 0; i < dzLocal.size(); i++)
                    {
                        DropZoneWrapper thisDZ =  dzLocal.get(i);
                        boolean islinux = thisDZ.getLinux().equals("false") ? false : true;

                        System.out.println("DropZone[" + i + "]");
                        System.out.println("\tName:       " + thisDZ.getName());
                        System.out.println("\tPath:       " + thisDZ.getPath());
                        System.out.println("\tNetAddress: " + thisDZ.getNetAddress());
                        System.out.println("\tComputer:   " + thisDZ.getComputer());
                        System.out.println("\tIsLinux:    " + thisDZ.getLinux());

                        List<PhysicalFileStructWrapper> pfs = fsc.listFiles(dzLocal.get(i).getNetAddress(), dzLocal.get(i).getPath(), null);
                        System.out.println("\tFile Listing:");
                        if (pfs != null && pfs.size()> 0)
                        {
                            for(int fileindex = 0; fileindex < pfs.size(); fileindex++)
                            {
                                String name = pfs.get(fileindex).getName() + (pfs.get(fileindex).getIsDir() ? (islinux ? "/" : "\\") : "");
                                System.out.format( "\t\t%-30s %15s %15s\n", name, pfs.get(fileindex).getIsDir() ? "" : pfs.get(fileindex).getFilesize() , pfs.get(fileindex).getModifiedtime());
                            }
                        }
                    }
                }

                List<DropZoneWrapper> dzByAddress = fsc.fetchDropZones(hpccServer);
                if (dzByAddress != null && dzByAddress.size() > 0)
                {
                    System.out.println("fetchDropZones by address test ...");
                    for (int i = 0; i < dzByAddress.size(); i++)
                    {
                        DropZoneWrapper thisDZ = dzByAddress.get(i);
                        boolean islinux = thisDZ.getLinux().equals("false") ? false : true;

                        System.out.println("DropZone[" + i + "]");
                        System.out.println("\tName:       " + thisDZ.getName());
                        System.out.println("\tNetAddress: " + thisDZ.getNetAddress());
                        System.out.println("\tPath:       " + thisDZ.getPath());
                        System.out.println("\tComputer:   " + thisDZ.getComputer());
                        System.out.println("\tIsLinux:    " + thisDZ.getLinux());

                        List<PhysicalFileStructWrapper> pfs = fsc.listFiles(thisDZ.getNetAddress(), thisDZ.getPath(), null);
                        System.out.println("\tFile Listing:");
                        if (pfs != null && pfs.size() > 0)
                        {
                            for (int fileindex = 0; fileindex < pfs.size(); fileindex++) {
                                PhysicalFileStructWrapper thisfile = pfs.get(fileindex);
                                String name = thisfile.getName() + (thisfile.getIsDir() ? (islinux ? "/" : "\\") : "");
                                System.out.format("\t\t%-30s %15s %15s\n", name, thisfile.getIsDir() ? "" : thisfile.getFilesize(), thisfile.getModifiedtime());
                            }
                        }
                    }
                }

                List<PhysicalFileStructWrapper> pfs = fsc.listFiles(dzByAddress.get(0).getNetAddress(), dzByAddress.get(0).getPath(), null);

                // Test file download
                System.out.println("Download test ...");
                String fileName = null;
                for (int i = 0; pfs != null && i < pfs.size(); i++)
                {
                    if (pfs.get(i).getIsDir() == false
                    && pfs.get(i).getFilesize() < 4 * 1024 * 1024)  // Only download small files for the test
                    {
                        fileName = pfs.get(i).getName();
                        break;
                    }
                }

                if (fileName != null)
                {
                    System.out.println("Attempting to download: " + fileName + " from DropZone");
                    String outputFile = System.getProperty("java.io.tmpdir") + File.separator + fileName;
                    System.out.println("Output File: " + outputFile);

                    File tmpFile = new File(outputFile);

                    long bytesTransferred = fsc.downloadFile(tmpFile,dzByAddress.get(0),fileName);
                    if (bytesTransferred <= 0)
                    {
                        System.out.println("Download failed.");
                    }
                    else
                    {
                        System.out.println("File Download Test: Bytes transferred: " + bytesTransferred);
                    }
                }
                else
                {
                    System.out.println("Skipping file download test. No small files found in DropZone.");
                }

                String tmpPeopleFile = System.getProperty("java.io.tmpdir") + File.separator + "people";
                writeFile( tmpPeopleFile, Persons.data, false);

                String tmpAccountFile = System.getProperty("java.io.tmpdir") + File.separator + "account";
                writeFile( tmpAccountFile, Accounts.data, false);

                int pport = HPCCWsAttributesClient.getServiceWSDLPort();
                HPCCWsClient connector = platform.checkOutHPCCWsClient();
                connector.setVerbosemode(true);
                System.out.println("wswu ver: " + connector.getWsWorkunitsClientVer());
                HPCCWsWorkUnitsClient wsWUClient = connector.getWsWorkunitsClient();
                wsWUClient.ping();

                System.out.println("wsdfu ver: " + connector.getwsDFUClientClientVer());

                HPCCWsDFUClient wsDFUClient = connector.getWsDFUClient();
                if (v.getMajor() == 7 && v.getMinor() == 0)
                {
                    System.out.println("HPCCWsDFUClient.getFileAccess() not supported on HPCC 7.0.x cluster...");
                }
                else if (v.getMajor() > 7 || (v.getMajor() == 7 && v.getMinor() > 0))
                {
                    System.out.println("Attempting file access on HPCC 7.x+ cluster...");
                    wsDFUClient.getFileAccess("benchmark::integer::2mb", "thor_160", 120, "random");
                }
                platform.checkInHPCCWsClient(connector);

                connector = platform.checkOutHPCCWsClient();
                System.out.println("wsfileio ver: " + connector.getWsFileIOClientVer());
                System.out.println("wssmc ver: " + connector.getWsSMCClientClientVer());
                System.out.println("wspackageprocess ver: " + connector.getHPCCWsPackageProcessClientVer());

                List<DFUDataColumnWrapper> newgetFileDataColumns = wsDFUClient.getFileMetaData(".::kw_test_sup", null);

                for (DFUDataColumnWrapper wrapper : newgetFileDataColumns)
                {
                    System.out.println("Col name: " + wrapper.getColumnLabel() + " ecl: " + wrapper.getColumnEclType() + " col type " + wrapper.getColumnType());
                }

                try
                {
                    //WSSQL Test
                    HPCCWsSQLClient wsSQLClient = platform.getWsClient().getWsSQLClient(wssqlport);
                    String s = "CREATE TABLE newtablename (FirstName VARCHAR(15), LastName VARCHAR(25), MiddleName VARCHAR(15) ,StreetAddress VARCHAR(42), city VARCHAR(20), state VARCHAR(2), zip VARCHAR(5)) LOAD DATA INFILE 'people-small' CONNECTION '10.0.2.15' DIRECTORY '/var/lib/HPCCSystems/mydropzone' INTO TABLE newtablename";
                    ExecuteSQLResponseWrapper executeSQLFullResponse = wsSQLClient.executeSQLFullResponse(s, "thor", "thor", Integer.valueOf(0), Integer.valueOf(0),Integer.valueOf(0), false, false, "me", Integer.valueOf(-1));
                    System.out.println(executeSQLFullResponse.getResult());

                    s = "SELECT * from newtablename  where state = 'FL' limit 10;";
                    executeSQLFullResponse = wsSQLClient.executeSQLFullResponse(s, "thor", "thor", Integer.valueOf(0), Integer.valueOf(0),Integer.valueOf(0), false, false, "me", Integer.valueOf(-1));
                    System.out.println(executeSQLFullResponse.getResult());
                }
                catch (java.net.ConnectException e)
                {
                    System.out.println("Could not connect to WsSQL on port: " + wssqlport + "\n>>" + e.getLocalizedMessage());
                }
                catch (ArrayOfBaseExceptionWrapper e)
                {
                    e.printStackTrace();
                }
                catch (Exception e)
                {
                    System.out.println("Encountered issue while testing WsSQL on port: " + wssqlport + "\n>>" + e.getLocalizedMessage());
                }
            }
            finally
            {
                rootSpan.end();
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

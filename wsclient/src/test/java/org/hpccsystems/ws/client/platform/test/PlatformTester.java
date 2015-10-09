package org.hpccsystems.ws.client.platform.test;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.extended.HPCCWsAttributesClient;
import org.hpccsystems.ws.client.extended.HPCCWsSQLClient;
import org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ExecuteSQLResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUDataColumn;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUPublishWorkunitResponse;
import org.hpccsystems.ws.client.platform.DFUDataColumnInfo;
import org.hpccsystems.ws.client.platform.DFURecordDefInfo;
import org.hpccsystems.ws.client.platform.EclRecordInfo;
import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.hpccsystems.ws.client.utils.FileFormat;
import org.hpccsystems.ws.client.utils.Utils;

public class PlatformTester
{

    public static void main(String[] args)
    {
        try
        {
            Platform platform = Platform.get("http", "192.168.56.120", 8010, "", "");

            Version v = platform.getVersion();
            System.out.println(v.toString());

            HPCCWsClient connector = platform.getHPCCWSClient();
            connector.setVerbosemode(true);

            HPCCWsSQLClient wsSQLClient = platform.getHPCCWSClient().getWsSQLClient("8510");
            String s = "CREATE TABLE newtablename (id DATE, mytint INT(9), mydouble DOUBLE (5,3) UNSIGNED) LOAD DATA INFILE 'OriginalPerson' CONNECTION '10.0.2.15' DIRECTORY '/var/lib/HPCCSystems/mydropzone' INTO TABLE newtablename";
            ExecuteSQLResponse executeSQLFullResponse = wsSQLClient.executeSQLFullResponse(s, "thor", "thor", Integer.valueOf(0), Integer.valueOf(0),Integer.valueOf(0), false, false, "me", Integer.valueOf(-1));
            System.out.println(executeSQLFullResponse.getResult());

            int pport = HPCCWsAttributesClient.getOriginalPort();
            System.out.println("wsdfu ver: " + connector.getwsDFUClientClientVer());
            HPCCWsDFUClient wsDFUClient = connector.getWsDFUClient();

            EclRecordInfo datasetFields = wsDFUClient.getDatasetFields("lotto::winning::numbers::date::csv", null, "," );
            HashMap<String,DFURecordDefInfo> recordsets = datasetFields.getRecordsets();
            Set<String> keySet = recordsets.keySet();
            for (String field : keySet)
            {
                DFURecordDefInfo dfuRecordDefInfo = recordsets.get(field);
                List<DFUDataColumnInfo> childColumns = dfuRecordDefInfo.getChildColumns();
                for (DFUDataColumnInfo dfuDataColumnInfo : childColumns)
                {
                    System.out.println(dfuDataColumnInfo.getColumnEclType() + " " + dfuDataColumnInfo.getColumnLabel());
                }
            }

            DFUDataColumn[] newgetFileDataColumns = wsDFUClient.getFileMetaData("kevinsfile::lotto_0215::processed.csv", null);
            for (int i = 0; i < newgetFileDataColumns.length; i++)
            {
                System.out.println("Col name: " + newgetFileDataColumns[i].getColumnLabel() + " ecl: " + newgetFileDataColumns[i].getColumnEclType() + " col type " + newgetFileDataColumns[i].getColumnType());
            }

            System.out.println("wsfileio ver: " + connector.getWsFileIOClientVer());
            System.out.println("wssmc ver: " + connector.getWsSMCClientClientVer());
            //connector.uploadFileToHPCC(new File("C://assignments//data//shortpersons"));
            //connector.uploadFileToHPCC(new File("C://assignments//data//shortaccounts"));
            //connector.uploadFileToHPCC(new File("C://assignments//data//small.txt"));
            connector.uploadFileToHPCC("C://assignments//data//shortpersons", "myhpcctargetname", "hadoop", "hadoop");

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

            System.out.println(FileFormat.getFileFormatName(Utils.findEnumValFromString(FileFormat.class, "CSV")));
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


            WorkunitInfo wu=new WorkunitInfo();
            wu.setECL(outputCSVfileContentsEcl);
            wu.setJobname("myflatoutput");
            wu.setCluster(clusterGroups[0]);
            wu.setResultLimit(100);
            wu.setMaxMonitorMillis(50000);
            wu.setJobname("myjobname");
            //this is just one way to submitECL, you can also submit via ecldirect and request the resulting WUID
            //you can also, submit via WSWorkunits and have more control over the result window you get back.
            String results = connector.submitECLandGetResults(wu);

            //List<List <Object>> resultsList = Utils.parseECLResults(results);
            wu.setCluster(clusterGroups[0]); /*hthor,thor,roxie*/
            WUPublishWorkunitResponse publishresp = connector.getWsWorkunitsClient().publishWUFromEcl(wu);

            wu.setCluster(clusterGroups[1]); /*hthor,thor,roxie*/
            wu.setResultLimit(100);
            wu.setMaxMonitorMillis(50000);
            List<List <Object>> resultsList = connector.submitECLandGetResultsList(wu);
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

            wu.setCluster(clusterGroups[1]); /*hthor,thor,roxie*/
            wu.setResultLimit(10);

            String wuid = connector.getWsWorkunitsClient().createAndRunWUFromECLAndGetWUID(wu);
            String results2 = connector.getWsWorkunitsClient().fetchResults(wuid, 0, clusterGroups[1], true, -1, -1);
            System.out.println(results2);
        }
        catch (Exception e)
        {
            System.out.println( e.getLocalizedMessage());
        }

    }

}

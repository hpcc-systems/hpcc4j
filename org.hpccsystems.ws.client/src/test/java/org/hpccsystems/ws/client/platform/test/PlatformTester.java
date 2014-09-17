package org.hpccsystems.ws.client.platform.test;

import java.io.File;
import java.util.List;

import org.hpccsystems.ws.client.HPCCWSClient;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUPublishWorkunitResponse;
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
            Platform platform = Platform.get("http", "192.168.56.120", 8010, null, null);
            Version v = platform.getVersion();
            System.out.println(v.toString());

            HPCCWSClient connector = platform.getHPCCWSClient();

            connector.setVerbosemode(true);
            System.out.println("wsdfu ver: " + connector.getwsDFUClientClientVer());
            System.out.println("wsfileio ver: " + connector.getWsFileIOClientVer());
            System.out.println("wssmc ver: " + connector.getWsSMCClientClientVer());
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


            WorkunitInfo wu=new WorkunitInfo();
            wu.setECL(outputFlatfileContentsEcl);
            wu.setJobname("myflatoutput");
            wu.setCluster(clusterGroups[0]);
            wu.setResultLimit(100);
            wu.setMaxMonitorMillis(50000);
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

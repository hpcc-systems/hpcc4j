package org.hpccsystems.rdf.rdf2hpcc;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.Utils;

public class RDF2HPCC
{
    static private final String PARAMPREFIX          = "-(?i)";

    static public final String  RDFDATALOCPATTERN    = PARAMPREFIX + "rdflocation";
    static public final String  HPCCFILEPATTERN      = PARAMPREFIX + "hpccfile";
    static public final String  RDFLANGPATTERN       = PARAMPREFIX + "rdflang";
    static public final String  ECLWATCHPROTPATTERN  = PARAMPREFIX + "eclwatchprotocol";
    static public final String  ECLWATCHIPPATTERN    = PARAMPREFIX + "eclwatchip";
    static public final String  ECLWATCHPORTPATTERN  = PARAMPREFIX + "eclwatchport";
    static public final String  DROPZONEPATTERN      = PARAMPREFIX + "dropzone";
    static public final String  DESTGROUPPATTERN     = PARAMPREFIX + "destgroup";
    static public final String  SPRAYPATTERN         = PARAMPREFIX + "spray";
    static public final String  VERBOSEPATTERN       = PARAMPREFIX + "verbose";
    static public final String  OVERWRITEPATTERN     = PARAMPREFIX + "overwrite";
    static public final String  ABBREVPATTERN        = PARAMPREFIX + "abbreviate";
    static public final String  UPLOADCHUNPATTERN    = PARAMPREFIX + "uploadchunk";
    static public final String  USERPATTERN          = PARAMPREFIX + "username";
    static public final String  PASSPATTERN          = PARAMPREFIX + "password";
    static public final String  FIXNSPATTERN         = PARAMPREFIX + "fixnsissues";
    static public final String  BASEURLPATTERN       = PARAMPREFIX + "baseuri";
    static public final String  ADDNSPATTERN         = PARAMPREFIX + "addnamespaces";
    static public final String  TARGETCLUSTERPATTERN = PARAMPREFIX + "targetcluster";
    static public final String  ECLMAXWAITMSPATTERN  = PARAMPREFIX + "eclmaxwaitms";
    static public final String  RUNSTATSPATTERN      = PARAMPREFIX + "getstats";

    private boolean             runstats             = false;
    private boolean             performspray         = true;

    public boolean getPerformspray()
    {
        return performspray;
    }

    public void setPerformspray(boolean performspray)
    {
        this.performspray = performspray;
    }

    public boolean getRunstats()
    {
        return runstats;
    }

    public void setRunstats(boolean runstats)
    {
        this.runstats = runstats;
    }

    private boolean processRDF2HPCCArgs(String[] args, RDFHPCCWsClient connector)
    {
        boolean success = true;

        if (args.length >= 1)
        {
            String host = "localhost";
            String port = "8010";
            String user = null;
            String pass = null;
            String protocol = Connection.protHttp;

            for (int i = 0; i < args.length; i++)
            {
                StringTokenizer params = new StringTokenizer(args[i], "=");

                while (params.hasMoreElements())
                {
                    String currentParam = (String) params.nextElement();
                    String currentParamVal;

                    if (params.hasMoreElements())
                    {
                        currentParamVal = (String) params.nextElement();
                    }
                    else
                    {
                        Utils.println(System.out, "ERROR: " + currentParam + "=??", false, false);
                        return false;
                    }

                    if (currentParam.matches(RDFDATALOCPATTERN))
                    {
                        connector.setTargetRDFDataPath(currentParamVal);
                        Utils.println(System.out, "TARGET RDF location: " + currentParamVal, false, false);
                    }
                    else if (currentParam.matches(HPCCFILEPATTERN))
                    {
                        connector.setTargetHPCCFilePath(currentParamVal);
                        Utils.println(System.out, "TARGET HPCC FILE: " + currentParamVal, false, false);
                    }
                    else if (currentParam.matches(RDFLANGPATTERN))
                    {
                        connector.setTargetRDFLanguage(currentParamVal);
                    }
                    else if (currentParam.matches(ECLWATCHPROTPATTERN))
                    {
                        protocol = currentParamVal;
                        Utils.println(System.out, "TARGET HPCC ECL Watch protocol: " + currentParamVal, false, false);
                    }
                    else if (currentParam.matches(ECLWATCHIPPATTERN))
                    {
                        host = currentParamVal;
                        Utils.println(System.out, "TARGET HPCC ECL Watch IP: " + currentParamVal, false, false);
                    }
                    else if (currentParam.matches(ECLWATCHPORTPATTERN))
                    {
                        port = currentParamVal;
                        Utils.println(System.out, "TARGET HPCC ECL Watch Port: " + currentParamVal, false, false);
                    }
                    else if (currentParam.matches(DROPZONEPATTERN))
                    {
                        connector.setTargetHPCCDropzonePath(currentParamVal);
                        Utils.println(System.out, "TARGET HPCC dropzone path: " + currentParamVal, false, false);
                    }
                    else if (currentParam.matches(DESTGROUPPATTERN))
                    {
                        connector.setTargetDestinationGroup(currentParamVal);
                        Utils.println(System.out, "Dest group: " + currentParamVal, false, false);
                    }
                    else if (currentParam.matches(SPRAYPATTERN))
                    {
                        boolean performSpray = Boolean.parseBoolean(currentParamVal);
                        setPerformspray(performSpray);
                        Utils.println(System.out, "Perform Spray: " + performSpray, false, false);
                    }
                    else if (currentParam.matches(VERBOSEPATTERN))
                    {
                        boolean verbosemode = Boolean.parseBoolean(currentParamVal);
                        connector.setVerbosemode(verbosemode);
                        Utils.println(System.out, "Verbose mode: " + verbosemode, false, false);
                    }
                    else if (currentParam.matches(OVERWRITEPATTERN))
                    {
                        boolean overwrite = Boolean.parseBoolean(currentParamVal);
                        connector.setOverwrite(overwrite);
                        Utils.println(System.out, "Overwrite HPCC files: " + overwrite, false, false);
                    }
                    else if (currentParam.matches(UPLOADCHUNPATTERN))
                    {
                        int uploadchunksize = Integer.parseInt(currentParamVal);
                        connector.setUploadchunksize(uploadchunksize);
                        Utils.println(System.out, "ESP file upload limit: " + uploadchunksize, false, false);
                    }
                    else if (currentParam.matches(USERPATTERN))
                    {
                        user = currentParamVal;
                        Utils.println(System.out, "ESP username: " + currentParamVal, false, false);
                    }
                    else if (currentParam.matches(PASSPATTERN))
                    {
                        pass = currentParamVal;
                        Utils.println(System.out, "ESP password: *****", false, false);
                    }
                    else if (currentParam.matches(ABBREVPATTERN))
                    {
                        boolean abbreviate = Boolean.parseBoolean(currentParamVal);
                        connector.setAbbreviate(abbreviate);
                        Utils.println(System.out, "Abbreviate Namespaces: " + abbreviate, false, false);
                    }
                    else if (currentParam.matches(FIXNSPATTERN))
                    {
                        boolean fixNSIssues = Boolean.parseBoolean(currentParamVal);
                        connector.setFixNSIssues(fixNSIssues);
                        Utils.println(System.out, "Attempt to fix namespace issues: " + fixNSIssues, false, false);
                    }
                    else if (currentParam.matches(BASEURLPATTERN))
                    {
                        connector.setTargetRDFBaseURI(currentParamVal);
                        Utils.println(System.out, "Base URI: " + currentParamVal, false, false);
                    }
                    else if (currentParam.matches(TARGETCLUSTERPATTERN))
                    {
                        connector.setTargetECLCluster(currentParamVal);
                        Utils.println(System.out, "Target cluster for ECL execution: " + currentParamVal, false, false);
                    }
                    else if (currentParam.matches(ECLMAXWAITMSPATTERN))
                    {
                        int maxwaitms = Integer.parseInt(currentParamVal);
                        connector.setEclmaxwaitMS(maxwaitms);
                        Utils.println(System.out, "Max wait for ECL execution in MS: " + maxwaitms, false, false);
                    }
                    else if (currentParam.matches(RUNSTATSPATTERN))
                    {
                        boolean getstats = Boolean.parseBoolean(currentParamVal);
                        setRunstats(getstats);
                        Utils.println(System.out, "Produce stats: " + getstats, false, false);
                    }

                    else if (currentParam.matches(ADDNSPATTERN))
                    {
                        if (currentParamVal != null && currentParamVal.length() > 0)
                        {
                            List<String> additionalNSs = new ArrayList<String>();

                            StringTokenizer nstokens = new StringTokenizer(currentParamVal, ";");

                            while (nstokens.hasMoreTokens())
                            {
                                String nextToken = nstokens.nextToken();
                                additionalNSs.add(nextToken);

                                Utils.println(System.out, "Additional namespace: " + nextToken, false, false);
                            }

                            connector.setAdditionalNSs(additionalNSs);
                        }
                        else
                        {
                            Utils.println(System.out, "ERROR additional namespaces list.", false, false);
                            return false;
                        }
                    }

                    else
                    {
                        Utils.println(System.out, "ERROR Invalid param: " + currentParam, false, false);
                        return false;
                    }
                }
            }

            Connection conn = new Connection(protocol, host, port);
            conn.setUserName(user);
            conn.setPassword(pass);

            connector.updateRDFConnection(conn);
        }
        else
        {
            Utils.println(System.out, "ERROR no params detected: ", true, false);
            return false;
        }

        return success;
    }

    private final static String rdf2hpccusageMessage = 
     "**********************************************************************\n"
   + "*   RDF2HPCC USAGE:                                                  *\n"
   + "*                                                                    *\n"
   + "*   >RDF2HPCC options                                                *\n"
   + "*                                                                    *\n"
   + "* Where 'options' are a sequence of space delimited -key=value pairs.*\n"
   + "*                                                                    *\n"
   + "* Required:                                                          *\n"
   + "* -rdflocation=<FULLY_QUALIFIED_RDF_FILE_PATH_OR_URL>                *\n"
   + "* -hpccfile=<FULLY_QUALIFIED_TARGET_HPCC_FILE_PATH>                  *\n"
   + "*                                                                    *\n"
   + "* Optional:                                                          *\n"
   + "* -rdflang=<RDF_LANGUAGE_VALUE>                                      *\n"
   + "*          Valid values:'RDF/XML', 'N-TRIPLE','TURTLE' and 'N3'.     *\n"
   + "*          Default value: 'RDF/XML'                                  *\n"
   + "* -eclwatchprot=<Target HPCC WS ECLWATHC PROTOCOL>                   *\n"
   + "*          Deafult: 'http'                                           *\n"
   + "* -eclwatchip=<Target_HPCC_WSECLWATCH_IP ADDRESS>                    *\n"
   + "*          Deafult: 'localhost'                                      *\n"
   + "* -eclwatchport=<Target_HPCC_WSECLWATCH_PORT>                        *\n"
   + "*          Default: '8010'                                           *\n"
   + "* -overwrite=true|flase -Overwrite HPCC file if it already exists.   *\n"
   + "*          Default: false                                            *\n"
   + "* -spray=true|false                                                  *\n"
   + "*          Default: true                                             *\n"
   + "* -getstats=true|false                                               *\n"
   + "*          Default: false                                            *\n"
   + "* -targetcluster=<hpcc target cluster for ECL stats logic execution.>*\n"
   + "*          Default: false                                            *\n"
   + "* -eclmaxwaitms=<maximum time to wait on ECL stats logic execution.> *\n"
   + "*          Default: 10000                                            *\n"
   + "* -username=<your_ESP_user_name>                                     *\n"
   + "*          Default: null                                             *\n"
   + "* -password=<your_ESP_password>                                      *\n"
   + "*          Default: null                                             *\n"
   + "* -destgroup=<spray_file_dest_group>                                 *\n"
   + "*          Default: null                                             *\n"
   + "* -uploadchunk=<esp_upload_file_chunk_size>                          *\n"
   + "*          Default: 5000000                                          *\n"
   + "* -abbreviate=true|false - Use abbreviated NS names.                 *\n"
   + "*          Default: true                                             *\n"
   + "* -verbose=true|false - Verbose trace output.                        *\n"
   + "*          Default: false                                            *\n"
   + "* -fixnsissues=true|false - Attempt to fix NS issues in RDF graph.   *\n"
   + "*          Default: true                                             *\n"
   + "*                                                                    *\n"
   + "**********************************************************************\n";

    private static void printRDF2HPCCUsage()
    {
        System.err.println(rdf2hpccusageMessage);
    }

    public static void main(String[] args)
    {
        RDF2HPCC rdf2hpcc = new RDF2HPCC();
        RDFHPCCWsClient connector = RDFHPCCWsClient.get();

        if (rdf2hpcc.processRDF2HPCCArgs(args, connector))
        {
            try
            {
                boolean imported = connector.importToHPCC();
                if (imported)
                {
                    boolean sprayed = false;

                    if (rdf2hpcc.getPerformspray())
                    {
                        sprayed = connector.sprayHPCCFile();

                        if (sprayed)
                        {
                            if (rdf2hpcc.getRunstats())
                            {
                                String stats = connector.getRDFStats();
                                if (stats != null)
                                {
                                    Utils.println(System.out, "RDF2HPCC: Raw stats: \n" + stats, false, false);

                                    Utils.println(System.out, "RDF2HPCC: Parsing raw stats: \n", false, false);
                                    List<List<Object>> parsedECLResults = org.hpccsystems.ws.client.utils.Utils
                                            .parseECLResults(stats);
                                    if (parsedECLResults != null)
                                    {
                                        Utils.println(System.out, "RDF2HPCC: parsed stats: \n", false, false);
                                        System.out.println(Utils.eclResultsToString(parsedECLResults, " , ", "\n"));
                                    }
                                    else
                                    {
                                        Utils.println(System.out, "RDF2HPCC: Failed to parse stats.", false, false);
                                    }
                                }
                                else
                                {
                                    Utils.println(System.out, "RDF2HPCC: Failed to produce stats.", false, false);
                                }
                            }
                        }
                        else
                        {
                            Utils.println(System.out, "RDF2HPCC: Spraying file failed.", false, false);
                        }
                    }
                    else if (rdf2hpcc.getRunstats())
                    {
                        Utils.println(System.out, "RDF2HPCC: Will not run stats while file not sprayed.", false, false);
                    }
                }
                else
                {
                    Utils.println(System.out, "RDF2HPCC: Could not import file.", false, false);
                }

                Utils.println(System.out, "RDF2HPCC: Finished.", false, false);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            printRDF2HPCCUsage();
        }
    }
}

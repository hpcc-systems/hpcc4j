package org.hpccsystems.rdf.rdf2hpcc;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.File;

import org.apache.logging.log4j.*;

import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.Utils;

public class RDF2HPCC
{
    static private final String PARAMPREFIX          = "-(?i)";
    static private final Logger log = LogManager.getLogger( RDF2HPCC.class.getName() );

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
    static public final String  ECLSTATSFILE		 = PARAMPREFIX + "eclstatsfile";

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
        boolean success  = true;
        boolean rdffile  = false;
        boolean hpccfile = false;

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
                        log.error( "ERROR: " + currentParam + "=??");
                        return false;
                    }

                    if (currentParam.matches(RDFDATALOCPATTERN))
                    {
                        connector.setTargetRDFDataPath(currentParamVal);
                        log.trace("TARGET RDF location: " + currentParamVal);
                        rdffile = true;
                    }
                    else if (currentParam.matches(HPCCFILEPATTERN))
                    {
                        connector.setTargetHPCCFilePath(currentParamVal);
                        log.trace("TARGET HPCC FILE: " + currentParamVal);
                        hpccfile = true;
                    }
                    else if (currentParam.matches(RDFLANGPATTERN))
                    {
                        connector.setTargetRDFLanguage(currentParamVal);
                    }
                    else if (currentParam.matches(ECLWATCHPROTPATTERN))
                    {
                        protocol = currentParamVal;
                        log.trace("TARGET HPCC ECL Watch protocol: " + currentParamVal);
                    }
                    else if (currentParam.matches(ECLWATCHIPPATTERN))
                    {
                        host = currentParamVal;
                        log.trace("TARGET HPCC ECL Watch IP: " + currentParamVal);
                    }
                    else if (currentParam.matches(ECLWATCHPORTPATTERN))
                    {
                        port = currentParamVal;
                        log.trace("TARGET HPCC ECL Watch Port: " + currentParamVal);
                    }
                    else if (currentParam.matches(DROPZONEPATTERN))
                    {
                        connector.setTargetHPCCDropzonePath(currentParamVal);
                        log.trace("TARGET HPCC dropzone path: " + currentParamVal);
                    }
                    else if (currentParam.matches(DESTGROUPPATTERN))
                    {
                        connector.setTargetDestinationGroup(currentParamVal);
                        log.trace("Dest group: " + currentParamVal);
                    }
                    else if (currentParam.matches(SPRAYPATTERN))
                    {
                        boolean performSpray = Boolean.parseBoolean(currentParamVal);
                        setPerformspray(performSpray);
                        log.trace("Perform Spray: " + performSpray);
                    }
                    else if (currentParam.matches(VERBOSEPATTERN))
                    {
                        boolean verbosemode = Boolean.parseBoolean(currentParamVal);
                        connector.setVerbosemode(verbosemode);
                        log.trace("Verbose mode: " + verbosemode);
                    }
                    else if (currentParam.matches(OVERWRITEPATTERN))
                    {
                        boolean overwrite = Boolean.parseBoolean(currentParamVal);
                        connector.setOverwrite(overwrite);
                        log.trace("Overwrite HPCC files: " + overwrite);
                    }
                    else if (currentParam.matches(UPLOADCHUNPATTERN))
                    {
                        int uploadchunksize = Integer.parseInt(currentParamVal);
                        connector.setUploadchunksize(uploadchunksize);
                        log.trace("ESP file upload limit: " + uploadchunksize);
                    }
                    else if (currentParam.matches(USERPATTERN))
                    {
                        user = currentParamVal;
                        log.trace("ESP username: " + currentParamVal);
                    }
                    else if (currentParam.matches(PASSPATTERN))
                    {
                        pass = currentParamVal;
                        log.trace("ESP password: *****");
                    }
                    else if (currentParam.matches(ABBREVPATTERN))
                    {
                        boolean abbreviate = Boolean.parseBoolean(currentParamVal);
                        connector.setAbbreviate(abbreviate);
                        log.trace("Abbreviate Namespaces: " + abbreviate);
                    }
                    else if (currentParam.matches(FIXNSPATTERN))
                    {
                        boolean fixNSIssues = Boolean.parseBoolean(currentParamVal);
                        connector.setFixNSIssues(fixNSIssues);
                        log.trace("Attempt to fix namespace issues: " + fixNSIssues);
                    }
                    else if (currentParam.matches(BASEURLPATTERN))
                    {
                        connector.setTargetRDFBaseURI(currentParamVal);
                        log.trace("Base URI: " + currentParamVal);
                    }
                    else if (currentParam.matches(TARGETCLUSTERPATTERN))
                    {
                        connector.setTargetECLCluster(currentParamVal);
                        log.trace("Target cluster for ECL execution: " + currentParamVal);
                    }
                    else if (currentParam.matches(ECLMAXWAITMSPATTERN))
                    {
                        int maxwaitms = Integer.parseInt(currentParamVal);
                        connector.setEclmaxwaitMS(maxwaitms);
                        log.trace("Max wait for ECL execution in MS: " + maxwaitms);
                    }
                    else if (currentParam.matches(RUNSTATSPATTERN))
                    {
                        boolean getstats = Boolean.parseBoolean(currentParamVal);
                        setRunstats(getstats);
                        log.trace("Produce stats: " + getstats);
                    }
                    else if (currentParam.matches(ECLSTATSFILE))
                    {
                    	if(new File(currentParamVal).isFile())
                        {
                            connector.setECLStatsFile(currentParamVal);
                    	    log.trace("Ecl Stats File: " + currentParamVal);
                        }
                        else
                        {
                            log.error("ERROR provided eclstatsfile does not exist.");
                            return false;
                        }
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

                                log.trace("Additional namespace: " + nextToken);
                            }

                            connector.setAdditionalNSs(additionalNSs);
                        }
                        else
                        {
                            log.error("ERROR additional namespaces list.");
                            return false;
                        }
                    }

                    else
                    {
                        log.error("ERROR Invalid param: " + currentParam);
                        return false;
                    }
                }
            }

            Connection conn = new Connection(protocol, host, port);
            conn.setUserName(user);
            conn.setPassword(pass);

            connector.updateRDFConnection(conn);
            
            if (!rdffile || !hpccfile)
            {
                if (!rdffile)
                {
                	log.error("ERROR required parameter -rdflocation not provided.");
                }
                if (!hpccfile)
                {
                	log.error("ERROR required parameter -hpccfile not provided.");
                }
                return false;
            }
        }
        else
        {
            log.error("ERROR no params detected: ");
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
   + "* -eclstatsfile=<ecl stats file path>                                *\n"
   + "*          Default: null                                             *\n"
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
        log.error(rdf2hpccusageMessage);
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
                                    log.trace("RDF2HPCC: Raw stats: \n" + stats);

                                    log.trace("RDF2HPCC: Parsing raw stats: \n");
                                    List<List<Object>> parsedECLResults = org.hpccsystems.ws.client.utils.Utils
                                            .parseECLResults(stats);
                                    if (parsedECLResults != null)
                                    {
                                        log.trace("RDF2HPCC: parsed stats: \n");
                                        log.trace(Utils.eclResultsToString(parsedECLResults, " , ", "\n"));
                                    }
                                    else
                                    {
                                        log.error("RDF2HPCC: Failed to parse stats.");
                                    }
                                }
                                else
                                {
                                    log.error("RDF2HPCC: Failed to produce stats.");
                                }
                            }
                        }
                        else
                        {
                            log.error("RDF2HPCC: Spraying file failed.");
                        }
                    }
                    else if (rdf2hpcc.getRunstats())
                    {
                        log.error("RDF2HPCC: Will not run stats while file not sprayed.");
                    }
                }
                else
                {
                    log.error("RDF2HPCC: Could not import file.");
                }

                log.trace("RDF2HPCC: Finished.");
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

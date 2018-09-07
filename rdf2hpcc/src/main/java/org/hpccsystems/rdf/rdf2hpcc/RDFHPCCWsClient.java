package org.hpccsystems.rdf.rdf2hpcc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.*;

import org.hpccsystems.ws.client.gen.ecldirect.v1_0.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.ecldirect.v1_0.EspException;
import org.hpccsystems.ws.client.gen.filespray.v1_13.DropZone;
import org.hpccsystems.ws.client.gen.filespray.v1_13.PhysicalFileStruct;
import org.hpccsystems.ws.client.HPCCECLDirectClient;
import org.hpccsystems.ws.client.HPCCFileSprayClient;
import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsFileIOClient;
import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.hpccsystems.ws.client.utils.DataSingletonCollection;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.Utils;

import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.n3.turtle.TurtleParseException;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.RDFReader;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.shared.SyntaxError;
import com.hp.hpl.jena.util.FileManager;

public class RDFHPCCWsClient extends HPCCWsClient
{
    public static DataSingletonCollection All = new DataSingletonCollection();

    private static final Logger log = LogManager.getLogger(RDFHPCCWsClient.class.getName());

    public static RDFHPCCWsClient get()
    {
        return (RDFHPCCWsClient) All.get(new RDFHPCCWsClient());
    }

    public static HPCCWsClient getNoCreate()
    {
        return (RDFHPCCWsClient) All.getNoCreate(new RDFHPCCWsClient());
    }

    public static void remove(RDFHPCCWsClient p)
    {
        All.remove(p);
    }

    protected RDFHPCCWsClient(String protocol, String targetWsECLWatchAddress, String targetWsECLWatchPort)
    {
        connection = new Connection(protocol, targetWsECLWatchAddress, targetWsECLWatchPort);
    }

    protected RDFHPCCWsClient(){}

    public static final String HPCCNAMESPACE = "hpccNS-";

    private String targetRDFDataPath = null;

    //the base uri to be used when converting relative URI's to absolute URI's.
    //(Resolving relative URIs and fragment IDs is done by prepending the base URI to the relative URI/fragment.)
    //If there are no relative URIs in the source, this argument may safely be null.
    //If the base is the empty string, then relative URIs will be retained in the model.
    //This is typically unwise and will usually generate errors when writing the model back out.
    private String targetRDFBaseURI = null;

    //Predefined values for lang are "RDF/XML", "N-TRIPLE", "TURTLE" (or "TTL") and "N3".
    //null represents the default language, "RDF/XML". "RDF/XML-ABBREV" is a synonym for "RDF/XML".
    private String targetRDFLanguage = "RDF/XML";

    private String outputDelimiter =    ",";
    private String outputTerminator =   "\n";
    private String outputQuote =        "'";
    private String outputEscape =       "\"";

    private String targetHPCCDropzonePath = null;
    private String targetDestinationGroup = null;
    private String targetDropzoneNetAddress = null;
    private String targetECLCluster = null;

    private String targetHPCCFilePath = null;
    private String eclstatsfile = null;
    
    private boolean overwrite = false;
    private boolean abbreviate = true;
    private boolean fixNSIssues = true;

    private int eclmaxwaitMS = 10000;
    private int uploadchunksize = 5000000;

    private List<String> additionalNSs = null;

    private Map<String, String> hpccnsprefixmap = null;

    public static final String STATSECL =

            "RdfTypeStats(STRING FileName) := FUNCTION\n" +
            "  RdfType := 'http://www.w3.org/1999/02/22-rdf-syntax-ns#type';\n" +
            "\n" +
            "  // Triplestore layout definitions\n" +
            "  TripleLayout :=RECORD\n" +
            "     STRING SubjectPrefix := '';\n" +
            "     STRING Subject := '';\n" +
            "     STRING PredicatePrefix := '';\n" +
            "     STRING Predicate := '';\n" +
            "     STRING ObjectPrefix := '';\n" +
            "     STRING Object := '';\n" +
            "     STRING ObjectIsLiteral := '';\n" +
            "  END;\n" +
            "  NameSpaceLayout := RECORD\n" +
            "    String Namespace := '';\n" +
            "    String Prefix := '';\n" +
            "  END;\n" +
            "  TypedLayout := RECORD\n" +
            "    TripleLayout;\n" +
            "    STRING TypePrefix := '';\n" +
            "    STRING Type := '';\n" +
            "    BOOLEAN TypeIsImplicit := FALSE;\n" +
            "  END;\n" +
            "\n" +
            "  // Triplestore datasets\n" +
            "  Triples := DATASET(FileName, TripleLayout, CSV);\n" +
            "  Namespaces := DATASET(FileName + '::Namespaces', NamespaceLayout, CSV);\n" +
            "  TripleDist := DISTRIBUTE(Triples, HASH32(SubjectPrefix, Subject));\n" +
            " \n" +
            "    // Append a type for each subject with an explicit rdf:type predicate\n" +
            "\n" +
            "  Types := JOIN(TripleDist, Namespaces,\n" +
            "                (LEFT.PredicatePrefix = RIGHT.Prefix) AND (RIGHT.Namespace + LEFT.Predicate = RdfType),\n" +
            "                TRANSFORM(LEFT), LOOKUP, LOCAL);\n" +
            "  TypedTriples := JOIN(TripleDist, Types,\n" +
            "                       (LEFT.SubjectPrefix = RIGHT.SubjectPrefix AND LEFT.Subject = RIGHT.Subject),\n" +
            "                       TRANSFORM(TypedLayout, SELF:=LEFT, SELF.TypePrefix:=RIGHT.ObjectPrefix,SELF.Type:= RIGHT.Object),\n" +
            "                       LEFT OUTER, LOCAL);\n" +
            "\n" +
            "  // For other subjects see if exactly one other subject links to this subject through just one predicate\n" +
            "  // This is to determine whether it is an anoymous node used to as 'structure'.\n" +
            "\n" +
            "  TypeMapLayout := RECORD\n" +
            "  TypedLayout.SubjectPrefix;\n" +
            "    TypedLayout.Subject;\n" +
            "    TypedLayout.TypePrefix;\n" +
            "    TypedLayout.Type;\n" +
            "  END;\n" +
            "  TypeMapLayout TypeFromParent(TripleLayout l) := TRANSFORM\n" +
            "    SELF.SubjectPrefix := l.ObjectPrefix;\n" +
            "    SELF.Subject := l.Object;\n" +
            "    SELF.TypePrefix := l.PredicatePrefix;\n" +
            "    SELF.Type := l.Predicate;\n" +
            "  END;\n" +
            "  PotentialParents := JOIN(Triples, TypedTriples(Type = ''),\n" +
            "                           (LEFT.ObjectPrefix = RIGHT.SubjectPrefix) AND (LEFT.Object = RIGHT.Subject),\n" +
            "                           TRANSFORM(LEFT), KEEP(1));\n" +
            "  ImplicitlyTyped := TABLE(PotentialParents, {ObjectPrefix,Object,Parents:=COUNT(GROUP)}, ObjectPrefix, Object)(Parents = 1);\n" +
            "  ImplicitTypes := JOIN(PotentialParents, ImplicitlyTyped, LEFT.ObjectPrefix = RIGHT.ObjectPrefix AND LEFT.Object = RIGHT.Object, TypeFromParent(LEFT));\n" +
            "\n" +
            "  // Merge the implicit types to the explicit types\n" +
            "  TypedLayout TypeMerge(TypedLayout l, TypeMapLayout r) := TRANSFORM\n" +
            "    SELF.TypePrefix := IF(l.Type != '', l.TypePrefix, r.TypePrefix);\n" +
            "    SELF.Type := IF(l.Type != '', l.Type, r.Type);\n" +
            "    SELF.TypeIsImplicit := l.Type = '' AND r.Type != '';\n" +
            "    SELF := l;\n" +
            " \n" +
            "  END;\n" +
            "  MoreTypedTriples := JOIN(TypedTriples, ImplicitTypes, LEFT.SubjectPrefix = RIGHT.SubjectPrefix AND LEFT.Subject = RIGHT.Subject,\n" +
            "\n" +
            "                           TypeMerge(LEFT, RIGHT), LEFT OUTER);\n" +
            "                          \n" +
            "                               \n" +
            "  // Redestirbute based on type now - we're going to do aggregates for each type\n" +
            " AllTypedTriples := Distribute(MoreTypedTriples, HASH32(TypePrefix, Type));\n" +
            "            \n" +
            "  // Count how many times each predicate is used in each subject\n" +
            "    PredicateCountBySubjectLayout := RECORD\n" +
            "    AllTypedTriples.SubjectPrefix;\n" +
            "    AllTypedTriples.Subject;\n" +
            "    AllTypedTriples.PredicatePrefix;\n" +
            "    AllTypedTriples.Predicate;\n" +
            "    AllTypedTriples.TypePrefix;\n" +
            "    AllTypedTriples.Type;\n" +
            "    INTEGER Usage := COUNT(GROUP);\n" +
            "  END;\n" +
            "  PredicateCountBySubject := TABLE(AllTypedTriples, PredicateCountBySubjectLayout, TypePrefix, Type, SubjectPrefix, Subject, PredicatePrefix, Predicate, MANY, LOCAL);\n" +
            "\n" +
            "  // Count how many subjects use each predicate for each type\n" +
            "  PredicateCountByTypeLayout := RECORD\n" +
            "    PredicateCountBySubject.TypePrefix;\n" +
            "    PredicateCountBySubject.Type;\n" +
            "    STRING PredicateNS := '';\n" +
            "    PredicateCountBySubject.PredicatePrefix;\n" +
            "    PredicateCountBySubject.Predicate;\n" +
            "    INTEGER MaxUsage := MAX(GROUP, PredicateCountBySubject.Usage);\n" +
            "    INTEGER UsageCount := COUNT(GROUP);\n" +
            "  END;\n" +
            "  PredicateCounts := TABLE(PredicateCountBySubject, PredicateCountByTypeLayout, TypePrefix, Type, PredicatePrefix, Predicate, FEW, LOCAL);\n" +
            "  PredicateStats := JOIN(PredicateCounts, Namespaces, LEFT.PredicatePrefix = RIGHT.Prefix,\n" +
            "\n" +
            "  TRANSFORM(PredicateCountByTypeLayout, SELF.PredicateNS:=RIGHT.Namespace, SELF:=LEFT), LOOKUP, LOCAL);\n" +
            "\n" +
            "  // Count how many subjects use each type\n" +
            "  SubjectsLayout := RECORD\n" +
            "    AllTypedTriples.TypePrefix;\n" +
            "    AllTypedTriples.Type;\n" +
            "    AllTypedTriples.TypeIsImplicit;\n" +
            "    AllTypedTriples.SubjectPrefix;\n" +
            "    AllTypedTriples.Subject;\n" +
            "\n" +
            "  END;\n" +
            "  Subjects := DEDUP(PROJECT(AllTypedTriples, SubjectsLayout, LOCAL), LOCAL);\n" +
            "  SubjectCountByTypeLayout := RECORD\n" +
            "    STRING TypeNS := '';\n" +
            "    Subjects.TypePrefix;\n" +
            "    Subjects.Type;\n" +
            "    Subjects.TypeIsImplicit;\n" +
            "    INTEGER TotalCount := COUNT(GROUP);\n" +
            "  END;\n" +
            "  TypeCounts := TABLE(Subjects, SubjectCountByTypeLayout, TypePrefix, Type, TypeIsImplicit, FEW, LOCAL);\n" +
            "  TypeStats := JOIN(TypeCounts, Namespaces, LEFT.TypePrefix = RIGHT.Prefix,\n" +
            "                    TRANSFORM(SubjectCountByTypeLayout, SELF.TypeNS:=RIGHT.Namespace, SELF:=LEFT), LOOKUP, LOCAL);\n" +
            "    // Join Predicates to Types as a child dataset\n" +
            "  PredicateStatsLayout := RECORD\n" +
            "    STRING PredicateNS := '';\n" +
            "    STRING PredicatePrefix;\n" +
            "    STRING Predicate;\n" +
            "    INTEGER MaxUsage := 0;\n" +
            "    INTEGER UsageCount := 0;\n" +
            "    INTEGER PercentUsage := 0;\n" +
            "  END;\n" +
            "  TypeStatsLayout := RECORD\n" +
            "    STRING TypeNS := '';\n" +
            "    STRING TypePrefix := '';\n" +
            "    STRING Type := '';\n" +
            "    BOOLEAN TypeIsImplicit := FALSE;\n" +
            "    INTEGER TotalCount := 0;\n" +
            "    DATASET(PredicateStatsLayout) Predicates;\n" +
            "  END;\n" +
            "  TypeStatsLayout StatsDenorm(SubjectCountByTypeLayout t, DATASET(PredicateCountByTypeLayout) p) := TRANSFORM\n" +
            "    Predicates := PROJECT(p, TRANSFORM(PredicateStatsLayout, SELF:=LEFT, SELF.PercentUsage:=LEFT.UsageCount * 100 DIV t.TotalCount));\n" +
            "    SELF := t;\n" +
            "    SELF.Predicates := SORT(Predicates, PredicateNS, Predicate);\n" +
            "\n" +
            "  END;\n" +
            "  FullTypeStats := DENORMALIZE(TypeStats, PredicateStats, LEFT.TypePrefix = RIGHT.TypePrefix AND LEFT.Type = RIGHT.Type, GROUP, StatsDenorm(LEFT, ROWS(RIGHT)), LOCAL);\n" +
            "  \n" +
            "  // Return sorted result\n" +
            "  SortedTypeStats := SORT(FullTypeStats, TypeNS, Type);\n" +
            "\n" +
            "  RETURN SortedTypeStats;\n" +
            "END;\n";

    public void updateRDFConnection(Connection conn)
    {
        updateConnection(conn);
    }

    public void setTargetHPCCDropzonePath(String dropzonepath)
    {
        targetHPCCDropzonePath = dropzonepath;
    }

    public void setTargetDestinationGroup(String destinationgroup)
    {
        targetDestinationGroup = destinationgroup;
    }

    public void setTargetHPCCFilePath(String hpccfilepath)
    {
        targetHPCCFilePath = hpccfilepath;
    }
    
    public void setECLStatsFile(String file)
    {
    	eclstatsfile = file;
    }
    
    public String getECLStatsFile()
    {
    	return eclstatsfile;
    }

    public String getTargetRDFDataPath()
    {
        return targetRDFDataPath;
    }

    public void setTargetRDFDataPath(String targetRDFDataPath)
    {
        this.targetRDFDataPath = targetRDFDataPath;
    }

    public String getTargetRDFBaseURI()
    {
        return targetRDFBaseURI;
    }

    public void setTargetRDFBaseURI(String targetRDFBaseURI)
    {
        this.targetRDFBaseURI = targetRDFBaseURI;
    }

    public String getTargetRDFLanguage()
    {
        return targetRDFLanguage;
    }

    public static List<String> languages = null;
    static
    {
        languages = new ArrayList<String>();
        languages.add("RDF/XML");
        languages.add("N-TRIPLE");
        languages.add("TURTLE");
        languages.add("TTL");
        languages.add("N3");
    }

    public void setTargetRDFLanguage(String targetRDFLanguage)
    {
        if (languages.contains(targetRDFLanguage))
        {
            this.targetRDFLanguage = targetRDFLanguage;
        }
        else
        {
            log.error("Only valid entries are: 'RDF/XML', 'N-TRIPLE', 'TURTLE' (or 'TTL') and 'N3'.");
        }

    }

    public boolean isOverwrite()
    {
        return overwrite;
    }

    public void setOverwrite(boolean overwrite)
    {
        this.overwrite = overwrite;
    }

    public boolean isAbbreviate()
    {
        return abbreviate;
    }

    public void setAbbreviate(boolean abbreviate)
    {
        this.abbreviate = abbreviate;
    }

    public boolean isFixNSIssues()
    {
        return fixNSIssues;
    }

    public void setFixNSIssues(boolean fixNSIssues)
    {
        this.fixNSIssues = fixNSIssues;
    }

    public int getUploadchunksize()
    {
        return uploadchunksize;
    }

    public void setUploadchunksize(int uploadchunksize)
    {
        this.uploadchunksize = uploadchunksize;
    }

    public List<String> getAdditionalNSs()
    {
        return additionalNSs;
    }

    public void setAdditionalNSs(List<String> additionalNSs)
    {
        this.additionalNSs = additionalNSs;
    }

    public String getTargetECLCluster()
    {
        return targetECLCluster;
    }

    public void setTargetECLCluster(String targetECLCluster)
    {
        this.targetECLCluster = targetECLCluster;
    }

    public int getEclmaxwaitMS()
    {
        return eclmaxwaitMS;
    }

    public void setEclmaxwaitMS(int eclmaxwaitMS)
    {
        this.eclmaxwaitMS = eclmaxwaitMS;
    }

    public boolean sprayHPCCFile()
    {

        boolean success = false;

        if (targetDestinationGroup != null)
        {
            success = sprayDefaultCSVHPCCFile(targetHPCCFilePath, targetHPCCFilePath, targetDestinationGroup, overwrite);
            success &= sprayCustomCSVHPCCFile(targetHPCCFilePath+"::namespaces", targetHPCCFilePath+"::namespaces", targetDestinationGroup, outputEscape, outputDelimiter, outputQuote, outputTerminator, overwrite, HPCCFileSprayClient.SprayVariableFormat.DFUff_csv);
        }
        else
        {
            log.error("Could not spray file, no destgroup specified.");
            try
            {
                printValidTargetGroups(System.out);
            }
            catch (Exception e) {}
        }

        return success;
    }

    public String getRDFStats()
    {
        String eclreturn = null;
        String eclstats  = null;
        
        log.error("Attempting to run ECL stats on " + targetHPCCFilePath);

        try
        {
        	if(eclstatsfile != null)
        	{
        		eclstats = new String(Files.readAllBytes(Paths.get(eclstatsfile)), Charset.defaultCharset());
        	} else
        	{
        		eclstats = STATSECL;
        	}
        	
            HPCCECLDirectClient declient = getEclDirectClient();
            WorkunitInfo wu = new WorkunitInfo();
            wu.setECL(eclstats + "\n output(RdfTypeStats('~" + targetHPCCFilePath + "'));");
            wu.setCluster(targetECLCluster);
            wu.setResultLimit(HPCCECLDirectClient.noresultlimit);
            wu.setMaxMonitorMillis(eclmaxwaitMS);

            eclreturn = declient.submitECLandGetResults(wu );
        }
        catch (ArrayOfEspException e)
        {
            log.error("Error while submiting ecl: ");
            EspException[] espExceptions = e.getException();
            for (EspException espException : espExceptions)
            {
                log.error(espException.getMessage());
            }
        }
        catch (IOException e)
        {
        	log.error("Error reading from user defined ecl stats file: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            log.error("Error while submiting ecl: " + e.getLocalizedMessage());
        }

        return eclreturn;
    }

    public boolean importToHPCC() throws Exception
    {
        boolean success = false;

        StringBuffer triplesCSVFormat = new StringBuffer();

        // load data into Jena model
        Model model = createModelFromFile(targetRDFLanguage, targetRDFDataPath, targetRDFBaseURI, verbosemode);

        if (model != null)
        {
            hpccnsprefixmap = getNameSpaceMapping(model, additionalNSs, verbosemode);

            triplesCSVFormat.append(serializeModelToCSV(model, outputDelimiter, outputQuote, outputTerminator));

            if (setDropZoneInfo())
            {
                HPCCWsFileIOClient fioclient = getWsFileIOClient();

                if (success = fioclient.createHPCCFile(targetHPCCFilePath, targetDropzoneNetAddress, overwrite))
                {
                    String nsMappingsCSVFormat = null;

                    if (hpccnsprefixmap != null)
                    {
                        if (fioclient.createHPCCFile(targetHPCCFilePath+"::namespaces", targetDropzoneNetAddress, true))
                        {
                            nsMappingsCSVFormat = hashMapToCSV(hpccnsprefixmap, outputDelimiter, outputTerminator);
                        }
                        else
                        {
                            log.error("Could not create target HPCC namespaces file.");
                        }
                    }

                    //Remote HPCC file has been created, encode the data so it can be uploaded as binary data.
                    //byte [] encodedBytes = encodeData(triplesCSVFormat.toString());
                    //The data was being encoded, but latest test don't seem to require encoding.
                    //if (success = writeHPCCFileData(triplesCSVFormat.toString().getBytes(), baseurl, targetHPCCFilePath, targetDropzoneNetAddres, uploadchunksize))
                    if (success = fioclient.writeHPCCFileData(triplesCSVFormat.toString().getBytes(), targetHPCCFilePath, targetDropzoneNetAddress,false,0,uploadchunksize))
                    {
                        if (nsMappingsCSVFormat != null && nsMappingsCSVFormat.length() > 0)
                        {
                            if (!fioclient.writeHPCCFileData(nsMappingsCSVFormat.toString().getBytes(), targetHPCCFilePath+"::namespaces", targetDropzoneNetAddress, false, 0, uploadchunksize))
                            {
                                log.error("Could not write to HPCC namespaces file.");
                            }
                        }
                    }
                }
                else
                {
                    log.error("Could not create target HPCC file.");
                }
            }
            else
            {
                log.error("Could not find target HPCC dropzone info.");
            }
        }

        log.error("Success: " + String.valueOf(success));
        return success;
    }

    static public String hashMapToCSV(Map<String, String> hashmap, String delimiter, String terminator)
    {
        String csvMapping = "";
        for (Map.Entry<String, String> e : hashmap.entrySet())
        {
            csvMapping += (String)e.getKey();
            csvMapping += delimiter;
            csvMapping += (String)e.getValue();
            csvMapping += terminator;
        }
        return csvMapping;
    }

    static public Model createModelFromFile(String targetrdflanguage, String targetrdflocation, String targetrdfbaseuri, boolean verbosemode)
    {
        Model model = ModelFactory.createDefaultModel();
        RDFReader reader = model.getReader(targetrdflanguage);

        //Open inputstream from specified RDF file
        InputStream in = FileManager.get().open( targetrdflocation );

        log.error("Attempting to create a Jena model:");
        log.error(" Original RDF location: " + targetrdflocation);
        log.error(" RDF Syntax: " + targetrdflanguage);
        log.error(" Base URI: " + targetrdfbaseuri);

        if (in == null)
        {
            log.error("Error: RDF data: " + targetrdflocation + " not found");
            return null;
        }
        else
        {
            try
            {
                reader.read(model, in, targetrdfbaseuri);
            }
            catch (SyntaxError e)
            {
                log.error("Error while loading model: Language Syntax error: " + e.getLocalizedMessage());
            }
            catch (TurtleParseException e)
            {
                log.error("Error while loading model: " + e.getLocalizedMessage());
            }
            catch (Exception e)
            {
                log.error("Error while loading model: " + e.getLocalizedMessage());
                e.printStackTrace();
            }
            finally
            {
                if (in != null)
                {
                    try
                    {
                        in.close();
                    }
                    catch (IOException e)
                    {
                        log.error("Error while closing input file stream:\n");
                        e.printStackTrace();
                    }
                }
            }
        }

        if (model != null)
            log.error("Model created.");

        return model;
    }

    static public Map<String, String> getNameSpaceMapping(Model themodel, List<String> additionalNSs, boolean verbosemode)
    {
        Map<String, String> lhpccnsprefixmap = new HashMap<String, String>();
        if (themodel != null && !themodel.isClosed() && !themodel.isEmpty())
        {
            int nsindex = 1;
            Map<String, String> nsPrefixMap = themodel.getNsPrefixMap();
            for (String namespace : nsPrefixMap.values())
            {
                lhpccnsprefixmap.put(namespace,HPCCNAMESPACE+nsindex++);
                log.error("Namespace from mapping: " + namespace + "  -- Abbreviated: " +lhpccnsprefixmap.get(namespace));
            }

            if (additionalNSs != null)
            {
                for (String namespace : additionalNSs)
                {
                    lhpccnsprefixmap.put(namespace,HPCCNAMESPACE+nsindex++);
                    log.error("Additional namespace added: " + namespace + " -- Abbreviated: " +lhpccnsprefixmap.get(namespace));
                }
            }
        }
        return lhpccnsprefixmap;
    }

    @SuppressWarnings("unused")
    public String serializeModelToCSV(Model themodel, String outputdelim, String outputquote, String outputterminator )
    {
        StringBuilder serializedmodel = new StringBuilder();

        if (themodel != null)
        {
            StmtIterator statements = themodel.listStatements();

            // print out the predicate, subject and object of each statement
            while (statements.hasNext())
            {
                Statement stmt      = statements.nextStatement();
                Resource  subject   = stmt.getSubject();
                Property  predicate = stmt.getPredicate();
                RDFNode   object    = stmt.getObject();

                subjectSerializationBlock :
                {
                    if (!subject.isAnon())
                    {
                        String subjectsNS = subject.getNameSpace();
                        String subjectName = subject.getLocalName();
                        String subjectShorthandNS = hpccnsprefixmap.get(subjectsNS);

                        if (subjectsNS != null && subjectShorthandNS == null)
                        {
                            if (subject.isURIResource())
                            {
                                log.debug("Possible issue detected, URI without known NS: " + subject);

                                for (String namespacekey : hpccnsprefixmap.keySet())
                                {
                                    if (subjectsNS.startsWith(namespacekey))
                                    {
                                        String substring = subjectsNS.substring(namespacekey.length());
                                        if (substring.length() > 0)
                                        {
                                            if (fixNSIssues)
                                            {
                                                subjectShorthandNS = hpccnsprefixmap.get(namespacekey);
                                                subjectName = substring + subjectName;
                                                log.debug("WARNING MAKING FOLLOWING ASSUMPTION: NameSpace: " + namespacekey + " LocalName: " + subjectName);
                                            }
                                            else
                                                log.debug("Is this an invalid qname: " + namespacekey + " -> " + substring + subjectName);
                                        }

                                        break;
                                    }
                                }
                            }
                        }

                        if (subjectShorthandNS == null || subjectsNS == null)
                        {
                            serializedmodel.append(outputdelim).append(subject.toString());
                            System.out.print(outputdelim+subject.toString());
                        }
                        else
                        {
                            serializedmodel.append(subjectShorthandNS+outputdelim+subjectName);
                            System.out.print(subjectShorthandNS+outputdelim+subjectName);
                        }
                    }
                    else
                    {
                        serializedmodel.append(outputdelim);
                        System.out.print(outputdelim);
                        serializedmodel.append(subject.toString());
                        System.out.print(subject.toString());
                    }

                    serializedmodel.append(outputdelim);
                    System.out.print(outputdelim);
                }

                predicateSerializationBlock:
                {

                    String predicateName = predicate.getLocalName();
                    String predicateNS = predicate.getNameSpace();
                    String predicateShorthandNS = hpccnsprefixmap.get(predicateNS);

                    if (predicateNS != null && predicateShorthandNS == null)
                    {
                        predicateShorthandNS = HPCCNAMESPACE + (hpccnsprefixmap.size()+1);
                        hpccnsprefixmap.put(predicateNS, predicateShorthandNS);
                        log.debug("Added NS found in predicate: " + predicateNS +":::::::"+predicateName);
                    }

                    if (predicateShorthandNS == null || predicateName == null)
                    {
                        serializedmodel.append(outputdelim);
                        System.out.print(outputdelim);
                        serializedmodel.append(predicate);
                        System.out.print(predicate.toString());
                    }
                    else
                    {
                        serializedmodel.append(predicateShorthandNS+outputdelim+predicateName);
                        System.out.print(predicateShorthandNS+outputdelim+predicateName);
                    }

                    serializedmodel.append(outputdelim);
                    System.out.print(outputdelim);
                }

                objectSerializationBlock:
                {
                    if (object.isResource())
                    {
                        String objectName = ((Resource) object).getLocalName();
                        String objectNS = ((Resource) object).getNameSpace();
                        String objectShorthandNS = hpccnsprefixmap.get(objectNS);

                        if (objectShorthandNS == null || objectName == null)
                        {
                            serializedmodel.append(outputdelim);
                            System.out.print(outputdelim);
                            serializedmodel.append(object);
                            System.out.print(object.toString());

                            serializedmodel.append(outputdelim);
                            System.out.print(outputdelim);
                            if ( object.isAnon())
                            {
                                serializedmodel.append("false");
                                System.out.print("false");
                            }
                            else
                            {
                                log.debug("Encountered object URI without known namespace, treating as literal: " + object);
                                serializedmodel.append("true");
                                System.out.print("true");
                            }
                        }
                        else
                        {
                            serializedmodel.append(objectShorthandNS+outputdelim+objectName);
                            System.out.print(objectShorthandNS+outputdelim+objectName);

                            serializedmodel.append(outputdelim).append("false");
                            System.out.print(outputdelim+"false");
                        }

                    }
                    else
                    {
                        serializedmodel.append(outputdelim);
                        System.out.print(outputdelim);

                        //object is a literal - single quote it
                        Node asNode = object.asNode();
                        String literalLexicalForm = asNode.getLiteralLexicalForm();

                        serializedmodel.append(outputquote).append(literalLexicalForm).append(outputquote);
                        System.out.print(outputquote+literalLexicalForm+outputquote);

                        serializedmodel.append(outputdelim).append("true");
                        System.out.print(outputdelim+"true");
                    }

                    serializedmodel.append(outputterminator);
                    System.out.print(outputterminator);
                }
            }
        }
        return serializedmodel.toString();
    }

    private boolean setDropZoneInfo() throws Exception
    {
        boolean success = false;

        HPCCFileSprayClient fsclient = getFileSprayClient();

        try
        {
            DropZone[] dropZones = fsclient.fetchLocalDropZones();

            if (dropZones.length > 0)
            {
                targetDropzoneNetAddress = dropZones[0].getNetAddress();
                targetHPCCDropzonePath = dropZones[0].getPath();
                log.error("Found dropzone net address: " + targetDropzoneNetAddress);
                log.error("Found dropzone path: " + targetHPCCDropzonePath);

                try
                {
                    PhysicalFileStruct[] files = fsclient.listFiles(targetDropzoneNetAddress, targetHPCCDropzonePath, null);
                    log.trace("Existing Dropzone files:");
                    for (PhysicalFileStruct file : files)
                    {
                        log.trace("\t" + file.getName() +"-"+ file.getFilesize());
                    }
                }
                catch (Exception e)
                {
                    log.warn("Warning: could not fetch existing landingzone file list.");
                }
                success = true;
            }
        }
        catch (org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException e1)
        {
            log.error("ERROR: Attempting to fetch HPCC dropzone Info:");
            for (org.hpccsystems.ws.client.gen.filespray.v1_06.EspException exception : e1.getException())
            {
                log.error("\t"+exception.getMessage());
            }
        }
        catch (RemoteException e1)
        {
            log.error("ERROR:\tAttempting to fetch HPCC dropzone Info:");
            log.error("\t"+e1.getLocalizedMessage());
            if (e1.getCause() != null)
                log.error("\t"+e1.getCause().getLocalizedMessage());
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
        }

        return success;
    }

    public void printValidTargetGroups(PrintStream stream) throws Exception
    {
        String[] clusterGroups = getAvailableClusterGroups();
        for (int i = 0; i < clusterGroups.length; i++)
        {
            log.debug(clusterGroups[i]);
            try
            {
                String[] actualclusternames = getAvailableClusterNames(clusterGroups[i]);
                if (actualclusternames != null)
                {
                    for (int j = 0; j < actualclusternames.length; j++)
                    {
                        stream.println("\t" + actualclusternames[j]);
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

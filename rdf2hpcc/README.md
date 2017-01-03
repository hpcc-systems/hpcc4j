rdf2hpcc Project
=======================

#### Description
RDF data ingestion into HPCC

Reads RDF, creates Jena model, converts to CSV, upload to HPCC, sprays, execute stats logic, and parse ECL results.

RDF triples are represented in HPCC as follows:

```
TriplesLayout := RECORD
  STRING  subjectNS;
  STRING  subject;
  STRING  predicateNS;
  STRING  predicate;
  STRING  objectNS;
  STRING  object;
  BOOLEAN objectIsLiteral;
END;
```

Anonymous nodes are represented by a "unique" id (eg: `-70df6643:13da378ff19:-7ffe`) links to the subject field of its properties...

Namespaces are abbreviated and a mapping table is provided `"originalfilename::namespaces"` with the following layout:


```
NSLayout := RECORD
  STRING namespace;
  STRING abbrev;
END;
```
 
#### Sample usage
```
-rdflocation="https://gist.githubusercontent.com/kal/ee1260ceb462d8e0d5bb/raw/1364c2bb469af53323fdda508a6a579ea60af6e4/log_sample.ttl" 
-hpccfile="axis::logs::turtle::rdf"
-rdflang=TURTLE
-eclwatchip=192.168.56.120
-eclwatchport=8010
-dropzone=/var/lib/HPCCSystems/dropzone/
-destgroup=mythor
-spray=true
-verbose=true
-overwrite=true
-username=youruser
-password=xxxx
-targetcluster=hthor
-getstats=true
```

#### Sample stats output
RDF2HPCC: parsed stats: 

```
http://www.shop.com/camera# , hpccNS-1 , Customer , false , 2 , [ http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 2 , 100 | http://xmlns.com/foaf/0.1/ , hpccNS-4 , family_name , 1 , 2 , 100 | http://xmlns.com/foaf/0.1/ , hpccNS-4 , givenname , 1 , 2 , 100http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 2 , 100 | http://xmlns.com/foaf/0.1/ , hpccNS-4 , family_name , 1 , 2 , 100 | http://xmlns.com/foaf/0.1/ , hpccNS-4 , givenname , 1 , 2 , 100http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 2 , 100 | http://xmlns.com/foaf/0.1/ , hpccNS-4 , family_name , 1 , 2 , 100 | http://xmlns.com/foaf/0.1/ , hpccNS-4 , givenname , 1 , 2 , 100 ]
http://www.shop.com/camera# , hpccNS-1 , Nikon_D300 , false , 2 , [ http://www.shop.com/camera# , hpccNS-1 , bought_by , 2 , 1 , 50 | http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 2 , 100http://www.shop.com/camera# , hpccNS-1 , bought_by , 2 , 1 , 50 | http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 2 , 100 ]
http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , first , true , 1 , http://www.w3.org/2000/01/rdf-schema#hpccNS-3subClassOf11100
http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , rest , true , 7 , [ http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , first , 1 , 7 , 100 | http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , rest , 1 , 7 , 100http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , first , 1 , 7 , 100 | http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , rest , 1 , 7 , 100 ]
http://www.w3.org/2002/07/owl# , hpccNS-5 , AllDifferent , false , 1 , [ http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 1 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , distinctMembers , 1 , 1 , 100http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 1 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , distinctMembers , 1 , 1 , 100 ]
http://www.w3.org/2002/07/owl# , hpccNS-5 , AllDisjointClasses , false , 2 , [ http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 2 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , members , 1 , 2 , 100http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 2 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , members , 1 , 2 , 100 ]
http://www.w3.org/2002/07/owl# , hpccNS-5 , Class , false , 13 , [ http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 13 , 100 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , subClassOf , 6 , 11 , 84http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 13 , 100 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , subClassOf , 6 , 11 , 84 ]
http://www.w3.org/2002/07/owl# , hpccNS-5 , DatatypeProperty , false , 20 , [ http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 2 , 5 , 25 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , domain , 1 , 5 , 25 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , range , 1 , 5 , 25http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 2 , 5 , 25 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , domain , 1 , 5 , 25 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , range , 1 , 5 , 25http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 2 , 5 , 25 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , domain , 1 , 5 , 25 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , range , 1 , 5 , 25 ]
http://www.w3.org/2002/07/owl# , hpccNS-5 , FunctionalProperty , false , 40 , [ http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 2 , 10 , 25 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , domain , 1 , 10 , 25 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , range , 1 , 10 , 25http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 2 , 10 , 25 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , domain , 1 , 10 , 25 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , range , 1 , 10 , 25http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 2 , 10 , 25 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , domain , 1 , 10 , 25 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , range , 1 , 10 , 25 ]
http://www.w3.org/2002/07/owl# , hpccNS-5 , ObjectProperty , false , 22 , [ http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 2 , 7 , 31 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , domain , 1 , 7 , 31 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , range , 1 , 7 , 31http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 2 , 7 , 31 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , domain , 1 , 7 , 31 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , range , 1 , 7 , 31http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 2 , 7 , 31 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , domain , 1 , 7 , 31 | http://www.w3.org/2000/01/rdf-schema# , hpccNS-3 , range , 1 , 7 , 31 ]
http://www.w3.org/2002/07/owl# , hpccNS-5 , Restriction , false , 16 , [ http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 16 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , cardinality , 1 , 11 , 68 | http://www.w3.org/2002/07/owl# , hpccNS-5 , hasValue , 1 , 3 , 18 | http://www.w3.org/2002/07/owl# , hpccNS-5 , onProperty , 1 , 16 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , someValuesFrom , 1 , 2 , 12http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 16 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , cardinality , 1 , 11 , 68 | http://www.w3.org/2002/07/owl# , hpccNS-5 , hasValue , 1 , 3 , 18 | http://www.w3.org/2002/07/owl# , hpccNS-5 , onProperty , 1 , 16 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , someValuesFrom , 1 , 2 , 12http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 16 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , cardinality , 1 , 11 , 68 | http://www.w3.org/2002/07/owl# , hpccNS-5 , hasValue , 1 , 3 , 18 | http://www.w3.org/2002/07/owl# , hpccNS-5 , onProperty , 1 , 16 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , someValuesFrom , 1 , 2 , 12http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 16 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , cardinality , 1 , 11 , 68 | http://www.w3.org/2002/07/owl# , hpccNS-5 , hasValue , 1 , 3 , 18 | http://www.w3.org/2002/07/owl# , hpccNS-5 , onProperty , 1 , 16 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , someValuesFrom , 1 , 2 , 12http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 16 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , cardinality , 1 , 11 , 68 | http://www.w3.org/2002/07/owl# , hpccNS-5 , hasValue , 1 , 3 , 18 | http://www.w3.org/2002/07/owl# , hpccNS-5 , onProperty , 1 , 16 , 100 | http://www.w3.org/2002/07/owl# , hpccNS-5 , someValuesFrom , 1 , 2 , 12 ]
http://www.w3.org/2002/07/owl# , hpccNS-5 , distinctMembers , true , 1 , [ http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , first , 1 , 1 , 100 | http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , rest , 1 , 1 , 100http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , first , 1 , 1 , 100 | http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , rest , 1 , 1 , 100 ]
http://www.w3.org/2002/07/owl# , hpccNS-5 , hasValue , true , 1 , http://www.w3.org/2000/01/rdf-schema#hpccNS-3subClassOf21100
http://www.w3.org/2002/07/owl# , hpccNS-5 , members , true , 2 , [ http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , first , 1 , 2 , 100 | http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , rest , 1 , 2 , 100http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , first , 1 , 2 , 100 | http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , rest , 1 , 2 , 100 ]
http://xmlns.com/foaf/0.1/ , hpccNS-4 , Person , false , 1 , [ http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 1 , 100 | http://xmlns.com/foaf/0.1/ , hpccNS-4 , family_name , 1 , 1 , 100 | http://xmlns.com/foaf/0.1/ , hpccNS-4 , givenname , 1 , 1 , 100http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 1 , 100 | http://xmlns.com/foaf/0.1/ , hpccNS-4 , family_name , 1 , 1 , 100 | http://xmlns.com/foaf/0.1/ , hpccNS-4 , givenname , 1 , 1 , 100http://www.w3.org/1999/02/22-rdf-syntax-ns# , hpccNS-8 , type , 1 , 1 , 100 | http://xmlns.com/foaf/0.1/ , hpccNS-4 , family_name , 1 , 1 , 100 | http://xmlns.com/foaf/0.1/ , hpccNS-4 , givenname , 1 , 1 , 100 ]
```

#### Build
This project is to be built using Maven. To build the projects using Maven, navigate to the base directory of the project and issue the following command:

`mvn install`

Developers who want to do a deployment must insure they have their credentials set in settings.xml under their maven configuration folder.  The following command will execute a clean build of the jar, jar-with-dependencies, javadoc, and source packages.  It will also attempt to sign the packages before uploading them to the sonatype repository for staging.

`mvn clean deploy -P release`

Maintainers can then release the artifacts from staging if the artifacts pass muster.

For more information on how to use Maven see http://maven.apache.org

#### Changelog
###### 1.0.0
- Dependency changes to org.hpccsystems.wsclient:1.0.0
- Updated Readme to contain new rdf turtle example file
- Migration from internal maven repository to external maven repository
- javadoc generation included in project

#### Contributions

All contributions must follow the JAVA source format described in the HPCC-JAVA-Formatter.xml file which can be found in /eclipse.
This formatter can be used by the Eclipse IDE to automatically format JAVA source code.

- From eclipse, choose Window->Preferences->Java->Code Stype->Formatter...

- Import the HPCC-JAVA-Formatter.xml file and set it as the Active profile.

- From the JAVA editor, choose Source->Format

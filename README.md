HPCC-Java-APIs Project
=======================

Java based APIs for interaction with HPCC services/tools

The project houses multiple HPCC centric Java based APIs/tools.
Each individual sub-project has been set up as an Eclipse project, but you may use other IDEs as well.
The project is configured to be built using Maven. To build the projects using Maven, navigate to the base directory of this project and issue the following command:

`mvn install`

Each sub-project can be built individually, from the top-level directory of the desired sub-project issue the mvn install command.

For more information on how to use Maven see http://maven.apache.org


Projects contained within:
- wsclient          API which Standardize and facilitate interaction with HPCC Web based Services.
                                     *The project is based on stub code generated from WSDLs using Eclipse tools based on Apache Axis
                                     *and JSch(Java Secure Channel) for secure ftp transfers

- clienttools        Java based interface to HPCC client tools 
                                     *Currently only interfaces with eclcc

- rdf2hpcc       RDF data ingestion tool to HPCC 
                                     *Based on Apache Jena and dependent on org.hpccsystems.ws.client

** PLEASE NOTE **

All contributions must follow the JAVA source format described in the HPCC-JAVA-Formatter.xml file which can be found in /eclipse.
This formatter can be used by the Eclipse IDE to automatically format JAVA source code.

* From eclipse, choose Window->Preferences->Java->Code Stype->Formatter...

 * Import the HPCC-JAVA-Formatter.xml file and set it as the Active profile.

* From the JAVA editor, choose Source->Format

Versioning:
- wsclient		The latest version can be accessed by just using the standard classes under org.hpccsystems.ws.client.  If a user
					wishes to use an older version, then use the classes contained within (for example) org.hpccsystems.ws.client.HPCCv500.
					All generated code will rest under org.hpccsystems.ws.client.gen.<interface>.<version>.
				For antlr support it is necessary to supply a new org.hpccsystems.ws.client.<version>.antlr for each version release of our
					package.  The latest can be found under org.hpccsystems.ws.client.antlr.  A modification to the wsclient pom is necessary
					to build these changes.  Add an execution block to the antlr plugin specifying the new input directory, output directory,
					and package name. 


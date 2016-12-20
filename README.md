HPCC-Java-APIs Project
=======================

#### Java based APIs for interaction with HPCC services/tools

This repository houses multiple HPCC centric Java based APIs/tools.
These projects are configured to be built using Maven. To build the projects using Maven, navigate to the base directory of each project and issue the following command:

`mvn install`

Each sub-project must be built individually.

For more information on how to use Maven see http://maven.apache.org


#### Projects contained within:
- wsclient
  - Set of APIs which Standardize and facilitate interaction with HPCC Web based Services.
  - The project is based on stub code generated from WSDLs using Eclipse tools based on Apache Axis and JSch(Java Secure Channel) for secure ftp transfers

- clienttools
  - Java based interface to HPCC client tools 
  - Currently only interfaces with eclcc

- rdf2hpcc
  - RDF data ingestion tool to HPCC 
  - Based on Apache Jena and dependent on org.hpccsystems.ws.client

#### Contributions

All contributions must follow the JAVA source format described in the HPCC-JAVA-Formatter.xml file which can be found in /eclipse.
This formatter can be used by the Eclipse IDE to automatically format JAVA source code.

- From eclipse, choose Window->Preferences->Java->Code Stype->Formatter...

- Import the HPCC-JAVA-Formatter.xml file and set it as the Active profile.

- From the JAVA editor, choose Source->Format

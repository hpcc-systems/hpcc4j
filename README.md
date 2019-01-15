HPCC-Java-APIs Project
=======================

#### Java based APIs for interaction with HPCC services/tools

This repository contains multiple Java-based APIs/tools which can be utilized to interact with HPCC.

Feature and change requests are tracked via [JIRA](https://track.hpccsystems.com/secure/Dashboard.jspa).
Everybody is encouraged to report issues and contribute to the project. When opening JIRA tickets, make sure to set the project as "JAPI".

#### Projects contained within:
- wsclient
  - Set of APIs which Standardize and facilitate interaction with HPCC Web based Services. [README](https://github.com/hpcc-systems/HPCC-JAPIs/blob/master/wsclient/README.md)
  - The project is based on stub code generated from WSDLs using Eclipse tools based on Apache Axis and JSch(Java Secure Channel) for secure ftp transfers
  - [Changelog](https://github.com/hpcc-systems/HPCC-JAPIs/blob/master/wsclient/README.md#changelog)
  - [Future Releases](https://github.com/hpcc-systems/HPCC-JAPIs/blob/master/wsclient/README.md#future-releases)
  - [Open Issues](https://track.hpccsystems.com/issues/?jql=project%20%3D%20JAPI%20AND%20status%20%3D%20Open)
  - [Sample code](https://github.com/hpcc-systems/HPCC-JAPIs/blob/master/wsclient/src/test/java/org/hpccsystems/ws/client/platform/test/PlatformTester.java)

- dfs client
  - Java based interface into HPCC's dfs backend [README](https://github.com/hpcc-systems/HPCC-JAPIs/tree/master/dfsclient/README.md)

- clienttools
  - Java based interface to HPCC client tools [README](https://github.com/hpcc-systems/HPCC-JAPIs/blob/master/clienttools/README.md)
  - Currently only interfaces with eclcc
  - [Changelog](https://github.com/hpcc-systems/HPCC-JAPIs/blob/master/clienttools/README.md#changelog)

- rdf2hpcc
  - RDF data ingestion tool to HPCC [README](https://github.com/hpcc-systems/HPCC-JAPIs/blob/master/rdf2hpcc/README.md)
  - Based on Apache Jena and dependent on org.hpccsystems.ws.client
  - [Changelog](https://github.com/hpcc-systems/HPCC-JAPIs/blob/master/rdf2hpcc/README.md#changelog)

- hpcc commons
  - HPCC Systems Java API common classes [README](https://github.com/hpcc-systems/HPCC-JAPIs/blob/master/commons-hpcc/README.md)

#### Build
These projects are configured to be built using Maven. To build the projects using Maven, navigate to the base directory of each project and issue the following command:

`mvn install`

Each sub-project must be built individually.

For more information on how to use Maven see http://maven.apache.org

#### Contributions

All contributions must follow the JAVA source format described in the HPCC-JAVA-Formatter.xml file which can be found in /eclipse.
This formatter can be used by the Eclipse IDE to automatically format JAVA source code.

- From eclipse, choose Window->Preferences->Java->Code Stype->Formatter...

- Import the HPCC-JAVA-Formatter.xml file and set it as the Active profile.

- From the JAVA editor, choose Source->Format

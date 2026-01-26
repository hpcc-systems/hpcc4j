![hpcc4j Master Nightly](https://github.com/hpcc-systems/hpcc4j/workflows/hpcc4j%20Nightly/badge.svg?branch=master) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/hpcc4j/badge.svg?subject=hpcc4j)](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/hpcc4j) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/commons-hpcc/badge.svg?subject=commons-hpcc)](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/commons-hpcc) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/wsclient/badge.svg?subject=wsclient)](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/wsclient) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/dfsclient/badge.svg?subject=dfsclient)](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/dfsclient) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/spark-hpcc/badge.svg?subject=spark-hpcc)](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/spark-hpcc)

[![CodeQL](https://github.com/hpcc-systems/hpcc4j/actions/workflows/codeql-analysis.yml/badge.svg)](https://github.com/hpcc-systems/hpcc4j/actions/workflows/codeql-analysis.yml)

:warning: <b>Note:</b> WsClient v6.8.0 and v6.8.2 include a packaging error and should be avoided [Learn more here](https://track.hpccsystems.com/browse/JAPI-450)

HPCC4J Project
=======================

#### Java based libraries for interaction with HPCC services/tools

This repository contains multiple Java-based libraries/tools which can be utilized to interact with HPCC Systems.

Feature and change requests are tracked via [JIRA](https://track.hpccsystems.com/secure/Dashboard.jspa).
Everybody is encouraged to report issues and contribute to the project. When opening JIRA tickets, make sure to set the project as "hpcc4j".

<table>
  <thead>
    <tr>
      <td align="left">
        :zap: <b>Note:</b> This project references log4j which has been reported to include security vulnerabilitie(s) in versions prior to v2.15.0
      </td>
    </tr>
  </thead>

  <tbody>
    <tr>
      <td>
        <ul>
          <li>The HPCC4J projects no longer reference the offending log4j versions</li>
          <li>Users of HPCC4J are strongly encouraged to update to the latest version</li>
          <li>Learn more about the vulnerabiltiy: https://github.com/advisories/GHSA-jfh8-c2jp-5v3q</li>
        </ul>
      </td>
    </tr>
  </tbody>
</table>

#### Projects contained within:
- [WsClient](https://github.com/hpcc-systems/hpcc4j/blob/master/wsclient/README.md)
  - Set of APIs which Standardize and facilitate interaction with HPCC Web based Services.
  - The project is based on stub code generated from WSDLs using Eclipse tools based on Apache Axis and JSch(Java Secure Channel) for secure ftp transfers
  - [Open Issues](https://track.hpccsystems.com/issues/?jql=project%20%3D%20JAPI%20AND%20status%20%3D%20Open)
  - [Sample code](https://github.com/hpcc-systems/hpcc4j/blob/master/wsclient/src/test/java/org/hpccsystems/ws/client/platform/test/PlatformTester.java)
  - Migration Guide:
    - [Migration Guide for v10.0.x](MIGRATION-10.0.md)

- [DFS Client](https://github.com/hpcc-systems/hpcc4j/tree/master/dfsclient/README.md)
  - Java based interface into HPCC's dfs backend

- [HPCC Commons](https://github.com/hpcc-systems/hpcc4j/blob/master/commons-hpcc/README.md)
  - HPCC Systems Java API common classes

- [clienttools](https://github.com/hpcc-systems/hpcc4j/blob/master/clienttools/README.md)
  - Java based interface to HPCC client tools
  - Currently only interfaces with eclcc

- [rdf2hpcc](https://github.com/hpcc-systems/hpcc4j/blob/master/rdf2hpcc/README.md)
  - RDF data ingestion tool to HPCC
  - Based on Apache Jena and dependent on org.hpccsystems.ws.client

- [Spark-HPCC](https://github.com/hpcc-systems/hpcc4j/blob/master/spark-hpcc/README.md)
  - Spark classes for HPCC Systems / Spark interoperability


#### HPCC4J and HPCC Kubernetes Clusters
Utilizing HPCC4J with containized HPCC Systems clusters requires some additional local configuration steps. These configuration steps are documented here: [Using HPCC4j with HPCC on a Kubernetes Cluster](https://github.com/hpcc-systems/hpcc4j/wiki/Using-HPCC4J-with-HPCC-on-a-Kubernetes-Cluster)

#### Build
These projects are configured to be built using Maven. To build the projects using Maven, navigate to the base directory of each project and issue the following command:

`mvn install`

NOTE: hpcccommons, wsclient, dfsclient, and spark-hpcc are controlled via the top-level maven pom file and can be built via a single command.
All sub-projects can be built individually using the pom file in each sub-project directory

For more information on how to use Maven see http://maven.apache.org

#### Contributions

All contributions must follow the JAVA source format described in the HPCC-JAVA-Formatter.xml file which can be found in /eclipse.
This formatter can be used by the Eclipse IDE to automatically format JAVA source code.

- From eclipse, choose Window->Preferences->Java->Code Stype->Formatter...

- Import the HPCC-JAVA-Formatter.xml file and set it as the Active profile.

- From the JAVA editor, choose Source->Format

## AI Knowledge Base (`kb/`) and Tests

This repository includes a machine‑optimized **Knowledge Base** under `kb/` for autonomous agents (RAG/Copilot‑style tooling). It is **documentation for machines**: curated, atomic facts with metadata and provenance.

- `kb/` — curated Markdown with YAML front matter and fenced `chunk` blocks (agent ingestion target)
- `tests/kb/` — retrieval/reasoning tests that validate KB behavior; intentionally kept **outside** `kb/` to avoid ingestion

These folders do **not** affect builds or runtime. They can be safely reviewed like any other docs. Pipelines may generate embeddings/graphs under `/_generated/` in a follow‑up change.

HPCC-Java-APIs Project
=======================

Java based APIs for interaction with HPCC services/tools

The project houses multiple HPCC centric Java based APIs/tools.
Each individual sub-project has been set up as an Eclipse project, but you may use other IDEs as well.
The project is configured to be built using Maven.  To build the projects using Maven, navigate to the base directory of this project and issue the following command:

`mvn install`

For more information on how to use Maven see http://maven.apache.org


Projects contained within:
- org.hpccsystems.clienttools        Java based interface to HPCC client tools 
                                     *Currently only interfaces with eclcc

- org.hpccsystems.rdf.rdf2hpcc       RDF data ingestion tool to HPCC 
                                     *Based on Apache Jena and dependent on org.hpccsystems.ws.client

- org.hpccsystems.ws.client          API which Standardize and facilitate interaction with HPCC Web based Services.
                                     *The project is based on stub code generated from WSDLs using Eclipse tools based on Apache Axis.

- org.hpccsystems.ws.client.legacy   API which Standardize and facilitate interaction with legacy HPCC Web based Services
                                     *Dependent on org.hpccsystems.ws.client
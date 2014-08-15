HPCC-WS-Java-Client-API
=======================

### Java based libraries for interaction with HPCC services/tools

These libraries are provided to standardize and facilitate interaction with HPCC Web based Services and tools.
The HPCCWSClient provides connection logic and helper methods for common HPCC actions (such as run ecl, fetch hpcc
info, etc).

The helper methods are a collection of ... 

The main class is only provided as an example, and to convey how the HPCCWSClient can be utilized.

An HPCC Ws Client class is also provided for straightforward interaction with WsWorkUnits, WsTopology, WsFilIO, WsFileSpray and ECLDirect.
The caller can, and is encouraged to use the methods in these Ws client classes.

Each individual sub-project has been set up as an Eclipse project, but you may use other IDEs as well.

The project is configured to be built using Maven.  To build the projects using Maven, navigate to the base directory of this project and issue the following command:

`mvn install`

For more information on how to use Maven see http://maven.apache.org

The project is based on stub code generated from WSDLs using Eclipse tools based on Apache Axis.

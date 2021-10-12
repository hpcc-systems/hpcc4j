wsclient Project [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/wsclient/badge.svg?subject=wsclient)](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/wsclient)
=======================

#### Description
This project allows a user to interact with ESP services in a controlled manner.  The API calls available under org.hpccsystems.ws.client.platform allow for a user to target HPCC Web Services across multiple environments running a range of hpccsystems-platform versions.  There is no guarantee that if a user utilizes org.hpccsystems.ws.client.gen generated stub code from wsdl, that the calls will be backwards compatible with older hpccsystems-platform versions.

#### Maven dependency
To utilize this library as a dependency in your own maven project, simply add the following definition to your pom.xml

```xml
<dependency>
	<groupId>org.hpccsystems</groupId>
	<artifactId>wsclient</artifactId>
	<version>8.0.0-1</version>
</dependency>
```

#### Build
This project is to be built using Maven. To build the projects using Maven, navigate to the base directory of the project and issue the following command:

`mvn install`

NOTE: wsclient, dfsclient, and commons-hpcc can be built together via the top-level pom file at the hpcc4j root directory.

Developers who want to do a deployment must insure they have their credentials set in settings.xml under their maven configuration folder.  The following command will execute a clean build of the jar, jar-with-dependencies, javadoc, and source packages.  It will also attempt to sign the packages before uploading them to the sonatype repository for staging.

`mvn clean deploy -P release`

Maintainers can then release the artifacts from staging if the artifacts pass muster.

For more information on how to use Maven see http://maven.apache.org

#### Key elements
- API which Standardize and facilitate interaction with HPCC Web based Services.
- The project is based on stub code generated from WSDLs using Eclipse tools based on Apache Axis and JSch(Java Secure Channel) for secure ftp transfers

#### API feature compatibility

wsclient | hpccsystems-platform
---   |  ---
1.0.0 | 6.2.0
1.2.0 | 6.4.0
1.4.0 | 6.4.16
1.6.0 | 6.4.16
7.0.0 | 7.0.0
7.0.2 | 7.0.0
WsClient and HPCC Systems versions are now in-sych 


###### 7.6.0 Target September 2019
- JAPI-105 Complete rework based on Axis2 Data Binding (ADB) Framework
  - Actively maintained technology
  - More flexible, efficient and configurable in comparison to Axis1
  - Modern Java version support
  - Lower memory foot print
  - Significantly greater speed than earlier versions of Apache Axis.
  - Java Client code generation has been integrated into maven build processing
  - Junit test coveage has been expanded, and remote test framework has been enhanced
  - All WS Client APIs utilize stable wrappeed classes (callers now shielded from inconsistant generated interfaces)
  - Java 1.8 Compliance
  - WS Client Helper method coverage expanded
  - New WS Clients added
  - Dead code obfuscated
  - Wrapper classes programmatically generated, which provides more consistant interfaces
  - Standardized handling of service-side generated exceptions
  - Base WS Client code utilized to simplify client code
  - All HPCCWsXXXClients have been updated to the latest interfaces based on HPCC Systems 7.6.0 Release
	
This ambitious endeavour, which affected several millions of lines encompassed by many thousands of files, introduces major infrastructure changes which vastly improve this project and was completed with the API-user in mind.
Existing WsClient-based applications are encouraged to migrate to 7.6 WsClient in order to take advantage of all theser new features and enhancements.
The effort to migrate legacy applications could be significant, but for most client it should only requiere some refactoring.

List of changes to consider when migrating pre-7.6  based client applications:
- Direct access to underlying SoapStub is no longer available
- Legacy code utilizing SoapStub objects directly in order to access web service methods should do one of the following:
  - Extend the appropriate HPCCWsXXXClient from the org.hpccsystems.ws.client package, and add helper method
	   or
  - Contibute the helper method logic to the hpcc4j/wsclient project, or request it as a new feature from the HPCC Systems dev team
- Many HPCCWsXXXClient helper methods' interface has changed to request/respond with a wrapped object
  - This will typically require legacy code to utilze classes from the org.hpccsystems.ws.client.wrappers package
- All org.hpccsystems.ws.client.platform.*Info.java classes deprecated
- Several HPCCWsXXXClient's interface utilized these *Info classes, which were refactored to org.hpccsystems.ws.client.wrappers.*wrapper.java
- All HPCCWsXXXClient helper methods throw java.lang.Exception, ArrayOfEspExceptionWrapper, EspSoapFaultWrapper, and/or ArrayOfECLExceptionWrapper
  - Callers should account for appropriate exception types.
  - The ArrayOf(ECL/ESP)ExceptionWrappers can contain multiple exceptions

###### 7.2.0 Mar 15, 2019
- JAPI-140 Update ANTLR Version 4.7
- JAPI-141 JAPI eclipse based formatter update
- JAPI-137 Introduce commons-hpcc subproject
- JAPI-92 Consider original WU action when determining completeness
- JAPI-135 Standardize soapproxy access within wsclient code
- JAPI-138 Created DFS Client sub project (#230) 
- JAPI-150 Created HPCCRecordBuilder test and mock objects for dfsclient
- JAPI-155 DFSClient Method chaining 
- JAPI-133 Integration Test Errors
- JAPI-160 Add missing wsclient methods in 7.2 (#250)
- JAPI-161 HpccWsDFUClient.getFileAccess fails against HPCC 7.0.X (#251)
- JAPI-166 Expose all 7.2+ WSDFU create file options (#255)
- JAPI-164 Re-introduce filtered out legacy wswu stub code (#254)
- JAPI-159 Replace wswu1.73 with wsws1.74 (#256)
- JAPI-163- HPCCFileSprayClient largeFileUpload truncated files at 1638…
- JAPI-160 Add missing wsclient methods in 7.2 (#250)
- JAPI-166 Expose all 7.2+ WSDFU create file options (#255)
- JAPI-164 Re-introduce filtered out legacy wswu stub code (#254)
- JAPI-159 Replace wswu1.73 with wsws1.74 (#256)
- JAPI-167 BinaryRecordWriter is not casting Integer types correctly
- JAPI-165 Handle HPCC Version fetch failure (#257)
- JAPI-139 RefreshWU to retain original exception message (#259)
- JAPI-168 Proper error reporting. Don’t swallow exception cause. (#260)
- JAPI-169: Better error reporting on failed upload. (#261)

######  7.0.2 Release dateNov 28, 2018
- JAPI-136 Connection constructor exception without query param

###### 7.0.0 Release date Fri Nov 02 2018 13:50:00 GMT-0400 (Eastern Daylight Time)
- JAPI-124 Update wsclent interface in preparation for rowservice changes
- JAPI-129 Platform tester fixes
- JAPI-128 Move log4j.props to resources
- JAPI-110 Add log4j support
- JAPI-125 WsDFU FileAccess methods
- JAPI-117 Restructure dropzone representation
- JAPI-134 New Utils.connection constructon
- JAPI-116 Expose filespray options
- JAPI-127 Add FileSpray/DownloadFile to JAPI
- JAPI-130 Ensure reported filepart and copy indexes are valid (#207)
- JAPI-119 Moving the versioning system for wsclient to parallel supported versions of the platform
- JAPI-109 File structure info
- JAPI-118 Address missing DFUFileDetail Field
- JAPI-126 Update HPCC 7.0.0 ESP interfaces and remove Pre 6.0.0 Interfaces

###### 1.6.0 Release date Mon Dec 10 2018
- JAPI-140 Update ANTLR dependency from 4.5 to 4.7

###### 1.4.0 Target Release date Tue Jul 31 2018 11:32:00 GMT-0400 (Eastern Daylight Time)
- JAPI-111 Remove java8 dependencies
- JAPI-113 Integrate wsPackage into wsclient
- JAPI-114 Fix ecl parsing
- JAPI-115 Check for null returns in DFUFileDetailInfo toString method
- JAPI-120 Fixes to get file metadata

###### 1.2.6 Emergency release
- JAPI-121 Platform object hash value includes "user" value

###### 1.2.4 Target Release date Fri Nov 10 2017 14:48:15 GMT-0500 (Eastern Standard Time)
- JAPI-108 - Check for null when creating queryresult object
- JAPI-107 - Update antlr grammar to handle ecl fields named maxlength

###### 1.2.2 Target Release date Mon Oct 02 2017 09:30:34 GMT-0400 (Eastern Daylight Time)
- JAPI-79 Avoid premature submission of compiling WUs
- JAPI-91 Fix COMPILING state map
- JAPI-90 Added createOrUpdate function to HPCCWsAttributesClient
- JAPI-95 Wrap attribute  delete calls
- JAPI-97 HPCCWsDFUClient soap-agnostic objects and wrappers
- JAPI-98 HPCCWsWorkunitsClient soap-agnostic objects and wrappers for roxie services
- JAPI-99 HPCCWsWorkunitsClient soap-agnostic objects and wrappers for Workunit related calls
- JAPI-96 Expose file part information
- JAPI-101 WUQueryInfo wrapper for workunit searching
- JAPI-103 new bulk createOrUpdateAttributes method

###### 1.2.0 Release date 8/9/2017
- JAPI-85 Enhance platform tester
- JAPI-86 Update JCRAFT JSCH lib to enhance ssh connections
- JAPI-82 Update all interfaces to match HPCC + WsSQL 6.4.0
- JAPI-83 Handle case where WU State is not provided by ESP
- JAPI-81 Need PAUSED status added to WUState
- JAPI-80 update WsFS Dropzone related methods
- JAPI-72 Correctly use WsClient WsFS methods regarding DZs

###### 1.0.4
- JAPI-MiniApp Add method with landing zone support and NIO channel streaming
- JAPI-77 Pass wuid parameter to WUCreateAndUpdate
- JAPI-78 Formatting fixes to the MiniApp contribution

###### 1.0.2
- JAPI 73 bugfix to allow backwards compatibility to wuActions to 5 series ESP's

###### 1.0.0
- Migration from internal maven repository to external maven repository
- wsdl updates to match platform 6.2.0 gold release
- removal of old HPCC versioning code
- javadoc generation included in project

#### Contributions

All contributions must follow the JAVA source format described in the HPCC-JAVA-Formatter.xml file which can be found in /eclipse.
This formatter can be used by the Eclipse IDE to automatically format JAVA source code.

- From eclipse, choose Window->Preferences->Java->Code Style->Formatter...

- Import the HPCC-JAVA-Formatter.xml file and set it as the Active profile.

- From the JAVA editor, choose Source->Format

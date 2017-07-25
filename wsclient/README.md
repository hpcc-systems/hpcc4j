wsclient Project
=======================

#### Description
This project allows a user to interact with ESP services in a controlled manner.  The API calls available under org.hpccsystems.ws.client.platform allow for a user to target ESP's across multiple environments running a range of hpccsystems-platform versions.  There is no guarantee that if a user utilizes org.hpccsystems.ws.client.gen generated stub code from wsdl, that the calls will be backwards compatible with older hpccsystems-platform versions.

#### Maven dependency
To utilize this library as a dependency in your own maven project, simply add the following definition to your pom.xml

```xml
<dependency>
	<groupId>org.hpccsystems</groupId>
	<artifactId>wsclient</artifactId>
	<version>1.0.0</version>
</dependency>
```

#### Build
This project is to be built using Maven. To build the projects using Maven, navigate to the base directory of the project and issue the following command:

`mvn install`

Developers who want to do a deployment must insure they have their credentials set in settings.xml under their maven configuration folder.  The following command will execute a clean build of the jar, jar-with-dependencies, javadoc, and source packages.  It will also attempt to sign the packages before uploading them to the sonatype repository for staging.

`mvn clean deploy -P release`

Maintainers can then release the artifacts from staging if the artifacts pass muster.

For more information on how to use Maven see http://maven.apache.org

#### Key elements
- API which Standardize and facilitate interaction with HPCC Web based Services.
- The project is based on stub code generated from WSDLs using Eclipse tools based on Apache Axis and JSch(Java Secure Channel) for secure ftp transfers

#### API feature compatibility

wsclient | hpccsystems-platform
--- | ---
1.0.0 | 6.2.0
1.2.0 | 6.4.0

#### Changelog

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

#### Future Releases
###### 1.2.0
- JAPI-82 Update all interfaces to match HPCC + WsSQL 6.4.0
- JAPI-81 Need PAUSED status added to WUState 
- JAPI-79 Avoid premature submission of compiling WUs
- JAPI-80 update WsFS Dropzone related methods

#### Contributions

All contributions must follow the JAVA source format described in the HPCC-JAVA-Formatter.xml file which can be found in /eclipse.
This formatter can be used by the Eclipse IDE to automatically format JAVA source code.

- From eclipse, choose Window->Preferences->Java->Code Stype->Formatter...

- Import the HPCC-JAVA-Formatter.xml file and set it as the Active profile.

- From the JAVA editor, choose Source->Format

wsclient Project
=======================

#### Description
This project allows a user to interact with ESP services in a controlled manner.  The API calls available under org.hpccsystems.ws.client.platform allow for a user to target ESP's across multiple environments running a range of hpccsystems-platform versions.  There is no guarantee that if a user utilizes org.hpccsystems.ws.client.gen generated stub code from wsdl, that the calls will be backwards compatible with older hpccsystems-platform versions.

#### Build
This project is to be built using Maven. To build the projects using Maven, navigate to the base directory of each project and issue the following command:

`mvn install`

For more information on how to use Maven see http://maven.apache.org

#### Key elements
- API which Standardize and facilitate interaction with HPCC Web based Services.
- The project is based on stub code generated from WSDLs using Eclipse tools based on Apache Axis and JSch(Java Secure Channel) for secure ftp transfers

#### API feature compatibility

wsclient | hpccsystems-platform
--- | ---
1.0.0 | 6.2.0

#### Changelog
###### 1.0.0
- Migration from internal maven repository to external maven repository
- wsdl updates to match platform 6.2.0 gold release
- removal of old HPCC versioning code
- javadoc generation included in project

#### Contributions

All contributions must follow the JAVA source format described in the HPCC-JAVA-Formatter.xml file which can be found in /eclipse.
This formatter can be used by the Eclipse IDE to automatically format JAVA source code.

- From eclipse, choose Window->Preferences->Java->Code Stype->Formatter...

- Import the HPCC-JAVA-Formatter.xml file and set it as the Active profile.

- From the JAVA editor, choose Source->Format

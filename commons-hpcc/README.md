HPCC Systems JAVA API Commons project [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/commons-hpcc/badge.svg?subject=commons-hpcc)](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/commons-hpcc) [![javadoc](https://javadoc-badge.appspot.com/org.hpccsystems/commons-hpcc.svg?label=javadoc)](https://javadoc-badge.appspot.com/org.hpccsystems/commons-hpcc)
=======================

#### Description
HPCC Systems Java API common classes

#### Maven dependency
To utilize this library as a dependency in your own maven project, simply add the following definition to your pom.xml

```xml
<dependency>
	<groupId>org.hpccsystems</groupId>
	<artifactId>commons-hpcc</artifactId>
	<version>7.6.0</version>
</dependency>
```

#### Build
This project is to be built using Maven. To build the projects using Maven, navigate to the base directory of the project and issue the following command:

`mvn install`

NOTE: This project, wsclient and dfsclient can be built together via the maven pom file at the hpcc4j project root directory

Developers who want to do a deployment must insure they have their credentials set in settings.xml under their maven configuration folder.  The following command will execute a clean build of the jar, jar-with-dependencies, javadoc, and source packages.  It will also attempt to sign the packages before uploading them to the sonatype repository for staging.

`mvn clean deploy -P release`


For more information on how to use Maven see http://maven.apache.org

#### Key elements

#### API feature compatibility

#### Future Release

###### 7.6.0 Target Release date September 2019

###### 1.0.0 Release date January 2019

#### Release Changelog

#### Contributions

All contributions must follow the JAVA source format described in the HPCC-JAVA-Formatter.xml file which can be found in /eclipse.
This formatter can be used by the Eclipse IDE to automatically format JAVA source code.

- From eclipse, choose Window->Preferences->Java->Code Style->Formatter...

- Import the HPCC-JAVA-Formatter.xml file and set it as the Active profile.

- From the JAVA editor, choose Source->Format


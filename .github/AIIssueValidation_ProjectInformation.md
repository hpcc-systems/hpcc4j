# Project-Specific Configuration

This file contains project-specific information used by the issue validation agent. Modify this file to customize the agent for your project.

## Project Information

**Project Name:** HPCC4J

**Project Description:** A Java library for interacting with HPCC Systems clusters

## Project Components/Modules

The following components/modules are part of this project:

- **wsclient** - Web service clients for HPCC ESP services
- **dfsclient** - Direct file system access to HPCC distributed files
- **spark-hpcc** - Spark connector for reading/writing HPCC datasets
- **commons-hpcc** - Common utilities shared across modules
- **clienttools** - Java interface to HPCC client tools (eclcc)
- **rdf2hpcc** - RDF data ingestion tool

## Version Information Guidelines

### Project Version Format
- Valid version pattern: `X.Y.Z` (e.g., 9.6.2, 10.0.0)
- Development versions may include `-SNAPSHOT` suffix

### Version Compatibility Notes
- HPCC4J versions should generally align with HPCC platform versions (e.g., HPCC4J 9.x works with HPCC 9.x)
- Minimum Java version: Java 8
- Supported LTS Java versions: 8, 11, 17, 21

### Version-Specific Guidance
When asking users for version information, provide these instructions:

**Project Version:**
```
Check your `pom.xml` dependency:
<dependency>
    <groupId>org.hpccsystems</groupId>
    <artifactId>wsclient</artifactId>
    <version>X.X.X</version>
</dependency>

Or run: mvn dependency:tree | grep hpccsystems
```

**Related Platform Version (HPCC Systems):**
```
- ESP web interface: Check footer or About page
- Command line: eclcc --version on HPCC server
- API call: Query WsTopology service
```

## Validation Examples

### Good Version Examples
- HPCC4J 9.6.2 with HPCC Platform 9.6.0
- HPCC4J 10.0.0 with Java 17

### Compatibility Issues Examples
- HPCC4J 9.x with HPCC Platform 7.x may have compatibility issues
- Java 7 is below minimum requirement of Java 8

## Project-Specific Terminology

- **Cluster** - HPCC Systems cluster
- **ESP** - Enterprise Services Platform (web service endpoint)
- **Thor** - Data processing cluster type
- **Roxie** - Query/rapid data delivery cluster type
- **ECL** - Enterprise Control Language
- **DFS** - Distributed File System

## Additional Context

### Common Configuration Patterns
Connection setup pattern:
```java
Connection conn = new Connection("http://mycluster:8010");
conn.setCredentials("username", "password");
HPCCWsClient client = HPCCWsClient.get(conn);
```

### Default Values
- Default ESP HTTP port: 8010
- Default ESP HTTPS port: 18010

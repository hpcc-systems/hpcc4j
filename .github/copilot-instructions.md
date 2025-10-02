# HPCC4J AI Coding Instructions

<!-- Include fork-specific instructions if they exist -->
<!-- @include: .github/copilot-instructions-private.md -->
<!-- @include: .github/copilot-instructions-local.md -->

## Project Overview
HPCC4J is a multi-module Maven project providing Java libraries for interacting with HPCC Systems clusters. It consists of 6 main modules:
- **commons-hpcc**: Common classes and utilities used across all modules
- **wsclient**: Web service clients for HPCC ESP services with generated wrapper classes
- **dfsclient**: Direct file system access to HPCC distributed file system
- **spark-hpcc**: Spark connector for reading/writing HPCC datasets as DataFrames
- **clienttools**: Java interface to HPCC client tools (eclcc)
- **rdf2hpcc**: RDF data ingestion tool

## Architecture Patterns

### Web Service Client Architecture (wsclient)
- **Generated Axis2 stubs**: Raw generated classes in `org.hpccsystems.ws.client.gen.axis2.*`
- **Wrapper layer**: Stable wrapper classes in `org.hpccsystems.ws.client.wrappers.gen.*` that shield callers from interface changes
- **High-level clients**: Service-specific clients like `HPCCWsClient`, `HPCCWsDFUClient` extending `BaseHPCCWsClient`
- **Object pooling**: `HPCCWsClientPool` manages client instances with check-in/check-out pattern
- **Connection management**: `Connection` objects encapsulate authentication and endpoint details

### Spark Integration (spark-hpcc)
- **HpccRDD**: Custom RDD implementation for reading HPCC data partitions
- **HpccFileWriter**: Handles writing Spark DataFrames to HPCC clusters
- **Schema translation**: `SparkSchemaTranslator` converts between Spark and HPCC record definitions
- **DataSource API**: `HpccRelationProvider` enables `.format("hpcc")` usage in Spark

## Key Development Patterns

### WSDL Generation Workflow
- Python script at `wsclient/utils/wsInterfaceUpdater.py` generates client stubs from WSDL/ESDL
- Generated code goes into `org.hpccsystems.ws.client.gen.axis2.*`
- Wrapper classes are programmatically generated to provide consistent interfaces
- Never modify generated classes directly - use wrapper layer or helper methods

### Connection Patterns
```java
// Standard connection setup
Connection conn = new Connection("http://myhpcc:8010");
conn.setCredentials(username, password);
HPCCWsClient client = HPCCWsClient.get(conn);
```

### Spark Connector Usage
```java
// Reading from HPCC
Dataset<Row> df = spark.read()
    .format("hpcc")
    .option("host", "http://127.0.0.1:8010")
    .option("cluster", "mythor") 
    .option("path", "/spark/test/dataset")
    .load();

// Writing to HPCC  
df.write()
    .format("hpcc")
    .mode("overwrite")
    .option("host", "http://127.0.0.1:8010")
    .option("cluster", "mythor")
    .save("/spark/test/output");
```

## Build & Test Conventions

### Maven Commands
- **Build all modules**: `mvn install` from root directory
- **Release build**: `mvn clean deploy -P release` (requires signing credentials)
- **Individual modules**: Each module has its own `pom.xml` for standalone builds

### Testing Patterns
- **Unit tests**: Ensure high coverage with JUnit, all new code should have tests. All ws.client tests should extend `BaseHPCCWsClientTest`
- **Integration tests**: Use `BaseIntegrationTest` pattern in spark-hpcc
- **Test groups**: `@org.hpccsystems.commons.annotations.BaseTests` annotation
- **Connection configuration**: Test classes typically use environment variables for HPCC cluster details

### Code Formatting
- **Mandatory**: Use Eclipse formatter from `/eclipse/HPCC-JAVA-Formatter.xml`
- **Indentation**: 4 spaces, no tabs
- **License headers**: Apache 2.0 headers required on all source files, ensure new files are dated with current year

## Version Compatibility

### API Compatibility Matrix
- WsClient versions sync with HPCC Systems platform versions (7.x, 8.x, 9.x)
- **Breaking change in 7.6.0**: Direct SoapStub access removed, use wrapper classes
- **Java 8 minimum**: `maven.compiler.release=8` in root pom

### External Dependencies
- **Axis2 ADB**: For web service binding (replaces legacy Axis1)
- **Apache Spark**: 3.x series for spark-hpcc module
- **Log4j 2.17.1+**: Security vulnerability mitigation
- **OpenTelemetry**: Distributed tracing support with `@WithSpan` annotations

## HPCC-Specific Concepts

### File Path Conventions
- **Legacy format**: `namespace::filename` (e.g., `spark::test::dataset`)
- **URI format**: `/namespace/filename` (preferred for Databricks compatibility)

### Data Types & Schema Translation
- **Record definitions**: `FieldDef` objects describe HPCC data structures
- **Unsigned8 handling**: Can overflow to negative in Java long, use decimal conversion if needed
- **String processing**: TRIM/PAD options available in Spark connector

### Cluster Communication
- **ESP endpoints**: Default ports 8010 (HTTP) or 18010 (HTTPS)
- **Authentication**: Username/password or can be empty for unsecured clusters
- **TLS support**: Configure via connection options
- **File access timeouts**: Configurable for long-running operations

## Common Anti-Patterns to Avoid
- Don't access Axis2 generated stubs directly - use wrapper classes
- Don't hardcode HPCC cluster endpoints - use Connection objects
- Don't ignore OpenTelemetry tracing context in new methods
- Don't create new client instances without using object pooling pattern
- Don't modify generated code - extend wrapper classes instead
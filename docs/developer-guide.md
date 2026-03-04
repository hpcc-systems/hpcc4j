# HPCC4J Developer Guide

This guide is a high-level roadmap for developers who want to interact with HPCC Systems clusters using the **wsclient** and **dfsclient** Java libraries. It is intended to be read alongside the Javadoc API reference and supplements it with practical patterns drawn directly from the project's JUnit test suites.

> **Note:** This document was generated with AI assistance based on analysis of existing test cases, code patterns, and project documentation. Examples and patterns are derived from the project's JUnit test suites to ensure accuracy and practical applicability.

---

## Table of Contents

1. [Overview](#overview)
2. [Prerequisites and Maven Setup](#prerequisites-and-maven-setup)
3. [Establishing a Connection](#establishing-a-connection)
4. [WsClient Library](#wsclient-library)
   - [Obtaining Client Instances](#obtaining-client-instances)
   - [DFU File Operations](#dfu-file-operations)
   - [Superfile Management](#superfile-management)
   - [Workunit Management](#workunit-management)
   - [File Spray (Upload / Download)](#file-spray-upload--download)
   - [Topology and Cluster Discovery](#topology-and-cluster-discovery)
   - [Exception Handling](#exception-handling)
5. [DFSClient Library](#dfsclient-library)
   - [Reading an HPCC File](#reading-an-hpcc-file)
   - [Writing an HPCC File](#writing-an-hpcc-file)
   - [Defining a Record Schema](#defining-a-record-schema)
   - [Filtering and Column Pruning](#filtering-and-column-pruning)
   - [Advanced Read Options](#advanced-read-options)
   - [Index Files](#index-files)
   - [Avro and Parquet Integration](#avro-and-parquet-integration)
6. [Testing Conventions](#testing-conventions)
7. [Kubernetes and Containerized Environments](#kubernetes-and-containerized-environments)

---

## Overview

HPCC4J is a multi-module Maven project that provides Java libraries for interacting with [HPCC Systems](https://hpccsystems.com/) clusters.

| Module | Purpose |
|---|---|
| **commons-hpcc** | Shared utilities: `FieldDef`, `FieldType`, `HpccSrcType`, `RecordDefinitionTranslator`, etc. |
| **wsclient** | HTTP/SOAP clients for all HPCC ESP web services (DFU, workunits, file spray, topology, …) |
| **dfsclient** | Low-level binary reader/writer for direct parallel I/O to HPCC data partitions |
| **spark-hpcc** | Apache Spark `DataSource` connector built on top of dfsclient |
| **clienttools** | Java wrapper around the `eclcc` command-line compiler |
| **rdf2hpcc** | RDF data ingestion tool |

Most applications will use **wsclient** for metadata and management tasks and **dfsclient** for high-throughput data ingestion or extraction.

---

## Prerequisites and Maven Setup

**Java 8+** is required. Add the following dependencies to your `pom.xml`:

```xml
<!-- Web service client (DFU, workunits, file spray, topology, …) -->
<dependency>
    <groupId>org.hpccsystems</groupId>
    <artifactId>wsclient</artifactId>
    <version>9.6.0-1</version>
</dependency>

<!-- Direct distributed file system I/O -->
<dependency>
    <groupId>org.hpccsystems</groupId>
    <artifactId>dfsclient</artifactId>
    <version>9.6.0-1</version>
</dependency>
```

> **Version alignment**: Since wsclient 7.6.0, the wsclient artifact version tracks the HPCC Systems platform version directly. Always use a wsclient version that matches or is close to your target cluster version.

---

## Establishing a Connection

All HPCC4J operations start with a `Connection` object. This object encapsulates the ESP endpoint URL, protocol, port and credentials.

### Constructors

```java
import org.hpccsystems.ws.client.utils.Connection;

// From a full URL string (most common)
Connection conn = new Connection("http://my-hpcc-cluster.example.com:8010");

// From components: isHttps, host, port (integers)
Connection conn = new Connection(false, "my-hpcc-cluster.example.com", 8010);

// From components: protocol string, host, port string
Connection conn = new Connection("https", "my-hpcc-cluster.example.com", "18010");
```

### Setting Credentials

```java
conn.setCredentials("myuser", "mypassword");
```

For unsecured clusters, the user name defaults to `"JunitUser"` in the test suite and the password can be an empty string.


### Setting Timeouts

```java
// Connection timeout in milliseconds
conn.setConnectTimeoutMilli(5000);

// Socket / read timeout (as a string, e.g. "30000")
conn.setSocketTimeoutMilli(30000);
```

### Supported URL Formats

The `Connection` class accepts URL strings with or without an explicit protocol and with or without query parameters:

```
http://hostname:8010
https://hostname:18010
http://hostname:8010?someparam=value
```

Protocol matching is case-insensitive (`HTTP`, `hTtP`, and `http` are equivalent). Any protocol value other than `https` is treated as plain `http`.

> **Note on underscored hostnames**: Some Java versions accept underscores in hostnames and some do not. The `Connection.URL_HOSTNAME_PATTERN` regex can be used to detect them proactively and provide an improved error message.

---

## WsClient Library

### Obtaining Client Instances

The recommended entry point is `Platform`, which manages a pool of `HPCCWsClient` objects and discovers the connected cluster's topology.

```java
import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.HPCCWsClient;

Platform platform = Platform.get(conn);
HPCCWsClient wsClient = platform.checkOutHPCCWsClient();

// ... use wsClient ...

platform.checkInHPCCWsClient(wsClient); // return to pool when done
```

If you prefer to work directly without object pooling you can also create typed clients individually:

```java
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.HPCCFileSprayClient;
import org.hpccsystems.ws.client.HPCCWsTopologyClient;

HPCCWsDFUClient    dfuClient      = wsClient.getWsDFUClient();
HPCCWsWorkUnitsClient wuClient    = wsClient.getWsWorkunitsClient();
HPCCFileSprayClient   fsClient    = wsClient.getFileSprayClient();
HPCCWsTopologyClient  topoClient  = wsClient.getTopologyClient();
```

> **Important**: Do **not** access the underlying Axis2 `SoapStub` objects directly. All web service interactions must go through the typed `HPCCWsXXXClient` helper classes or their wrapper objects.

### Verifying Connectivity

Every typed client exposes a `ping()` method that returns `true` when the ESP service is reachable:

```java
boolean ok = dfuClient.ping();      // WsDfu service
boolean ok = wuClient.ping();       // WsWorkunits service
boolean ok = fsClient.ping();       // FileSpray service
```

---

### DFU File Operations

`HPCCWsDFUClient` is the primary client for querying and managing logical files in the HPCC Distributed File System.

#### Listing Files

```java
import org.hpccsystems.ws.client.wrappers.wsdfu.DFULogicalFileWrapper;

// List all files and directories under a scope prefix
List<DFULogicalFileWrapper> files = dfuClient.getFiles("benchmark");

for (DFULogicalFileWrapper f : files) {
    if (f.getIsDirectory()) {
        // Recurse into sub-scope
        System.out.println("Directory: " + f.getDirectory());
    } else {
        System.out.println("File: " + f.getFileName()
                + " | Superfile: " + f.getIsSuperfile());
    }
}
```

#### Searching Files with Wildcards

```java
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.DFUQueryRequestWrapper;
import org.hpccsystems.ws.client.HPCCWsDFUClient.DFUQueryFileType;

// Simple wildcard search
List<DFULogicalFileWrapper> results =
    dfuClient.searchFiles("benchmark::*", thorClusterFileGroup);

// Advanced search using a request wrapper (supports pagination)
DFUQueryRequestWrapper req = new DFUQueryRequestWrapper();
req.setLogicalName("hipie::keys::*");
req.setFileType(DFUQueryFileType.DFUQFT_SUPER_FILES_ONLY.getText());
List<DFULogicalFileWrapper> matches = dfuClient.searchFiles(req);
```

#### Getting File Metadata

```java
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUInfoWrapper;

// Lightweight detail (columns, record layout, clusters)
DFUFileDetailWrapper detail = dfuClient.getFileDetails("benchmark::all_types::200kb", null);
Set<String> clusters = detail.getClusters();

// Full file info
DFUInfoWrapper info = dfuClient.getFileInfo(fileName, nodeGroup);
```

#### Getting File Column Definitions

```java
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper;

List<DFUDataColumnWrapper> columns =
    dfuClient.getFileDataColumns("~benchmark::integer::20KB", null, false);

for (DFUDataColumnWrapper col : columns) {
    System.out.println(col.getColumnLabel()
            + " : " + col.getColumnType()
            + " (" + col.getColumnSize() + ")");

    // Nested child columns (datasets within a record)
    if (col.getChildColumns() != null) {
        col.getChildColumns().forEach(child ->
            System.out.println("  -> " + child.getColumnLabel()));
    }
}
```

Passing a non-null `cluster` parameter narrows the search to files on that specific cluster.

#### Reading Raw File Content

```java
import org.w3c.dom.NodeList;

// Fetch rows 0-99 from a logical file
NodeList content = dfuClient.getFileData(fileName, 0L, 100, nodeGroup);
```

#### Deleting Files

Files may be deleted by name, by name with a cluster target, or in bulk:

```java
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUResultWrapper;

// Delete a single file on a specific cluster
Set<String> files = new HashSet<>();
files.add("benchmark::my_test_file");
List<DFUResultWrapper> results = dfuClient.deleteFiles(files, thorClusterFileGroup);

for (DFUResultWrapper r : results) {
    System.out.println(r.getActionResult() + " failed=" + r.getFailed());
}
```

**Cluster parameter rules**:
- Do **not** combine `filename@cluster` syntax with the `cluster` parameter — this will throw an `Exception` with a message starting `"Do not provide filename@cluster and cluster parameter:"`.
- A leading `@` in a file name (e.g., `@somefile`) is invalid and will throw an `Exception`.

---

### Superfile Management

Superfiles are logical groupings of one or more regular logical files.

```java
// Create a new superfile with sub-files
wsdfuclient.createSuperfile("hpcc4j::tests::mysuperfile",
        new String[] { "benchmark::all_types::200kb" });

// Add a sub-file to an existing superfile
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.AddtoSuperfileRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfu.AddtoSuperfileResponseWrapper;

AddtoSuperfileRequestWrapper req = new AddtoSuperfileRequestWrapper();
req.setExistingFile(true);          // set false to create superfile if it doesn't exist
req.setSuperfile("my::superfile");
req.setNames(List.of("my::sub::file"));

AddtoSuperfileResponseWrapper resp = wsdfuclient.addToSuperFile(req);
```

**Error cases to handle**:
- `ArrayOfEspExceptionWrapper` with a message containing `"Cannot find file <name>"` — the target superfile does not exist when `existingFile = true`.
- `ArrayOfEspExceptionWrapper` with a message containing `"sub file <name> not found"` — the sub-file name is invalid.
- When creating, if the superfile already exists the exception message will contain `" already exists"`.

---

### Workunit Management

`HPCCWsWorkUnitsClient` lets you compile, submit, and monitor ECL workunits.

#### Running ECL Inline

The simplest way to execute ECL is `createAndRunWUFromECLAndGetResults`, which blocks until the workunit completes and returns the XML result string:

```java
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;

HPCCWsWorkUnitsClient wuClient = wsClient.getWsWorkunitsClient();

WorkunitWrapper wu = new WorkunitWrapper();
wu.setECL("OUTPUT('Hello from HPCC4J');");
wu.setJobname("HelloWorldJob");
wu.setCluster("thor");                // target cluster

String xmlResults = wuClient.createAndRunWUFromECLAndGetResults(wu);
System.out.println(xmlResults);
```

#### Running ECL and Getting a Full Response Wrapper

```java
import org.hpccsystems.ws.client.wrappers.gen.wsworkunits.WURunResponseWrapper;

WURunResponseWrapper response = wuClient.createAndRunWUFromECLWrapped(wu);
String wuid = response.getWuid();
```

#### Refreshing Workunit State

```java
// Lightweight poll — only updates state/status fields
wuClient.fastWURefresh(wu);
System.out.println("State: " + wu.getState());

// Full refresh — fetches all workunit details
WUInfoRequestWrapper infoReq = new WUInfoRequestWrapper();
infoReq.setWuid(wuid);
wuClient.WUInfo(infoReq);
```

#### Running ECL from a File Resource

The test infrastructure uses a helper that reads ECL from the classpath and submits it as a workunit. The same pattern is useful in production utilities:

```java
// Read ECL from classpath resource
InputStream stream = MyClass.class.getClassLoader()
    .getResourceAsStream("myscript.ecl");
String ecl = new String(stream.readAllBytes(), StandardCharsets.UTF_8);

WorkunitWrapper wu = new WorkunitWrapper();
wu.setECL(ecl);
wu.setJobname("UnitTest ECL Script: myscript.ecl");
wu.setCluster("thor");

String results = wuClient.createAndRunWUFromECLAndGetResults(wu);
```

---

### File Spray (Upload / Download)

`HPCCFileSprayClient` handles transfers between HPCC drop zones and the Distributed File System.

```java
HPCCFileSprayClient fsClient = wsClient.getFileSprayClient();

// Check WSDL/service endpoint
System.out.println(fsClient.getServiceWSDLURL());
System.out.println(fsClient.getServiceURI()); // → "/FileSpray"

// Is the target cluster containerized?
Boolean isContainerized = fsClient.isTargetHPCCContainerized();

// List drop zones
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneWrapper;
List<DropZoneWrapper> dropzones = fsClient.getDropZones();

// List files on a drop zone
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneFilesResponseWrapper;
DropZoneFilesResponseWrapper dzFiles =
    fsClient.getDropZoneFiles("mydropzone", "/", "");
```

Large file uploads can be executed via `HPCCFileSprayClient.largeFileUpload(...)`. Check the Javadoc for the full signature, as it supports NIO channel streaming and configurable chunk sizes.

---

### Topology and Cluster Discovery

`HPCCWsTopologyClient` exposes cluster configuration, including the names of available Thor and Roxie clusters and their backing file groups.

```java
import org.hpccsystems.ws.client.HPCCWsTopologyClient.TopologyGroupQueryKind;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpGroupWrapper;

// Retrieve Thor storage groups (use PLANE for containerized clusters)
List<TpGroupWrapper> thorGroups = wsClient.getTopologyGroups(
    wsClient.isContainerized()
        ? TopologyGroupQueryKind.PLANE
        : TopologyGroupQueryKind.THOR);

String thorFileGroup = thorGroups.isEmpty() ? null : thorGroups.get(0).getName();

// Similarly for Roxie
List<TpGroupWrapper> roxieGroups = wsClient.getTopologyGroups(
    wsClient.isContainerized()
        ? TopologyGroupQueryKind.PLANE
        : TopologyGroupQueryKind.ROXIE);
```

The `thorFileGroup` value obtained above is required by `HPCCWsDFUClient.createFile(...)` when preparing a file for writing via dfsclient.

---

### Exception Handling

All `HPCCWsXXXClient` methods may throw the following checked exception types:

| Exception | Meaning |
|---|---|
| `java.lang.Exception` | General error (network, configuration, invalid input) |
| `org.apache.axis2.AxisFault` | Axis2 transport-level or SOAP fault |
| `ArrayOfEspExceptionWrapper` | One or more server-side ESP exceptions; call `toString()` or iterate `getExceptions()` for details |
| `ArrayOfECLExceptionWrapper` | One or more ECL compilation / execution errors |
| `EspSoapFaultWrapper` | SOAP fault returned by the ESP service |

**Recommended catch pattern**:

```java
try {
    List<DFULogicalFileWrapper> files = dfuClient.getFiles("benchmark");
    // ...
} catch (ArrayOfEspExceptionWrapper e) {
    // Server returned structured ESP exceptions
    System.err.println("ESP Exceptions: " + e.toString());
} catch (AxisFault e) {
    // Transport-level fault
    e.printStackTrace();
} catch (Exception e) {
    // Catch-all
    e.printStackTrace();
}
```

`ArrayOfEspExceptionWrapper` and `ArrayOfECLExceptionWrapper` can each contain **multiple** exceptions. Always call `toString()` or iterate the list rather than just reading `getMessage()`.

---

## DFSClient Library

The dfsclient provides high-throughput, partition-parallel binary I/O directly to HPCC data nodes, bypassing the ESP layer for data transfer. It requires the wsclient to obtain file metadata and create/publish files.

The typical flow:
1. **Obtain file metadata** via `HPCCFile` (connects to HPCC to fetch partition locations and record definition).
2. **Get `DataPartition[]`** — one partition per HPCC data node slice.
3. **Create a `HpccRemoteFileReader` or `HPCCRemoteFileWriter`** per partition.
4. **Iterate records** using the standard `Iterator<T>` interface (reading) or call `writeRecord` (writing).
5. **Close** each reader/writer when done.

---

### Reading an HPCC File

#### Simple Read

```java
import org.hpccsystems.dfs.client.*;
import org.hpccsystems.commons.ecl.FieldDef;

// 1. Build the HPCCFile descriptor
//    The tilde (~) prefix is optional; both forms are equivalent.
HPCCFile file = new HPCCFile(
    "~benchmark::all_types::thor",
    "http://my-hpcc-cluster:8010",
    "myuser",
    "mypassword");

// 2. Retrieve partitions
DataPartition[] parts = file.getFileParts();

// 3. Retrieve record definition from the file metadata
FieldDef originalRecordDef = file.getRecordDefinition();

// 4. Read each partition
for (DataPartition part : parts) {
    HPCCRecordBuilder builder =
        new HPCCRecordBuilder(file.getProjectedRecordDefinition());

    HpccRemoteFileReader<HPCCRecord> reader =
        new HpccRemoteFileReader<>(part, originalRecordDef, builder);

    while (reader.hasNext()) {
        HPCCRecord record = reader.next();
        // record.getNumFields() — number of fields in this record
        // record.getField(int index) — field value as Object
    }
    reader.close();

    // Optionally inspect server-side messages
    if (reader.getRemoteReadMessageCount() > 0) {
        System.out.println(reader.getRemoteReadMessages());
    }
}
```

#### Column Projection (Reading a Subset of Fields)

```java
// Request only specific columns by name (comma-separated)
file.setProjectList("key,value,date_sk");

// After setting the project list, use getProjectedRecordDefinition()
// for the record builder to match the reduced schema
HPCCRecordBuilder builder =
    new HPCCRecordBuilder(file.getProjectedRecordDefinition());
```

---

### Writing an HPCC File

Writing requires three steps: **create** (reserve the file and obtain write tokens), **write** (stream data to each partition), and **publish** (finalize and register the file in the catalog).

```java
import org.hpccsystems.dfs.client.*;
import org.hpccsystems.commons.ecl.*;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.wrappers.wsdfu.*;

HPCCWsDFUClient dfuClient = wsClient.getWsDFUClient();

// 1. Translate the Java record definition into an ECL record definition string
String eclRecordDef = RecordDefinitionTranslator.toECLRecord(recordDef);

// 2. Create the file on the cluster (returns write-access tokens)
DFUCreateFileWrapper createResult = dfuClient.createFile(
    "~my::output::file",       // logical file name
    thorClusterFileGroup,      // storage group (from topology discovery)
    eclRecordDef,              // ECL schema
    300,                       // file-access expiry in seconds
    false,                     // compress?
    DFUFileTypeWrapper.Flat,   // file type
    "");                       // extra options

// 3. Create DataPartition objects from the DFU file parts
DFUFilePartWrapper[] dfuParts = createResult.getFileParts();
DataPartition[] partitions = DataPartition.createPartitions(
    dfuParts,
    new NullRemapper(new RemapInfo(), createResult.getFileAccessInfo()),
    dfuParts.length,
    createResult.getFileAccessInfoBlob());

// 4. Distribute records across partitions and write
int recordsPerPartition = records.size() / partitions.length;
int currentRecord = 0;
long totalBytesWritten = 0;

for (int i = 0; i < partitions.length; i++) {
    int count = recordsPerPartition
        + (i == partitions.length - 1 ? records.size() % partitions.length : 0);

    HPCCRecordAccessor accessor = new HPCCRecordAccessor(recordDef);
    HPCCRemoteFileWriter<HPCCRecord> writer =
        new HPCCRemoteFileWriter<>(partitions[i], recordDef, accessor,
                                   CompressionAlgorithm.NONE);

    for (int j = 0; j < count; j++, currentRecord++) {
        writer.writeRecord(records.get(currentRecord));
    }
    writer.close();
    totalBytesWritten += writer.getBytesWritten();
}

// 5. Publish (register) the file in the HPCC catalog
dfuClient.publishFile(createResult.getFileID(), eclRecordDef,
                      currentRecord, totalBytesWritten, true);
```

> **Compression**: Pass `CompressionAlgorithm.DEFAULT` (or `LZ4`, `LZ`) to `HPCCRemoteFileWriter` and set `compressed = true` in `dfuClient.createFile(...)` to enable transparent compression.

---

### Defining a Record Schema

All read/write operations require a `FieldDef` that describes the record layout. `FieldDef` objects are always nested: the top-level definition is a `FieldType.RECORD` wrapper whose children describe each field.

```java
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.HpccSrcType;

// ── Simple flat record ──────────────────────────────────────────────────────
FieldDef[] fields = new FieldDef[3];

// Integer field: name, type, eclType, byteSize, isFixedLength, isUnsigned,
//                srcType, children
fields[0] = new FieldDef("id",
    FieldType.INTEGER, "INTEGER4", 4,
    true, false,
    HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);

// Variable-length UTF-8 string
fields[1] = new FieldDef("description",
    FieldType.STRING, "UTF8", 0,
    false, false,
    HpccSrcType.UTF8, new FieldDef[0]);

// Fixed-length ASCII string (16 bytes)
fields[2] = new FieldDef("code",
    FieldType.STRING, "STRING16", 16,
    true, false,
    HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);

FieldDef recordDef = new FieldDef("RootRecord",
    FieldType.RECORD, "rec", 4,
    false, false,
    HpccSrcType.LITTLE_ENDIAN, fields);
```

#### Common `FieldType` and `HpccSrcType` Combinations

| ECL Type | `FieldType` | `HpccSrcType` | `isFixed` | Notes |
|---|---|---|---|---|
| `INTEGER4` | `INTEGER` | `LITTLE_ENDIAN` | `true` | Signed 4-byte integer |
| `UNSIGNED8` | `INTEGER` | `LITTLE_ENDIAN` | `true` | `isUnsigned=true`; use `BigDecimal` for values > `Long.MAX_VALUE` |
| `REAL8` | `REAL` | `LITTLE_ENDIAN` | `true` | Double-precision float |
| `STRING` (var-len) | `STRING` | `SINGLE_BYTE_CHAR` | `false` | ASCII variable-length string |
| `STRING16` (fixed) | `STRING` | `SINGLE_BYTE_CHAR` | `true` | ASCII fixed-length string |
| `UTF8` | `STRING` | `UTF8` | `false` | Variable-length UTF-8 |
| `UNICODE` (var) | `STRING` | `UTF16LE` | `false` | Variable-length Unicode |
| `VARSTRING` | `VAR_STRING` | `SINGLE_BYTE_CHAR` | `false` | Null-terminated string |
| `DECIMAL24_12` | `DECIMAL` | `LITTLE_ENDIAN` | `true` | Call `setPrecision(24)` and `setScale(12)` |
| `CHAR` | `CHAR` | `SINGLE_BYTE_CHAR` | `true` | Single character |

#### Numeric Overflow Behaviour

- Signed integers that overflow wrap at the type boundary (e.g., writing `128` to an `INTEGER1` field reads back as `-128`).
- For `UNSIGNED8`, values that exceed `Long.MAX_VALUE` will overflow to a negative `long` unless you enable decimal conversion:

```java
// When constructing the reader, enable BigDecimal conversion for UNSIGNED8 fields
fileReader.getRecordReader().setUseDecimalForUnsigned8(true);
```

The utility method `Utils.extractUnsigned8Val(long)` can convert a raw (possibly negative) long value to its correct unsigned `BigInteger` representation.

---

### Filtering and Column Pruning

#### Server-Side Row Filters

Row filters are evaluated on the HPCC data nodes, reducing the amount of data transferred over the network.

```java
// String-based filter (ECL WHERE clause syntax)
file.setFilter("date_sk >= 20200701 AND date_sk <= 20211231");

// Structured filter using FieldFilter / FileFilter
import org.hpccsystems.commons.ecl.*;

FileFilter filter = new FileFilter(
    new FieldFilter("date_sk",
        FieldFilterRange.makeGT(20210101)));   // integer boundary

file.setFilter(filter);

// Equality filter using a string literal (note the embedded quotes)
FileFilter eqFilter = new FileFilter(
    new FieldFilter("date_sk",
        FieldFilterRange.makeEq("'20200401'")));
```

#### Column Projection

```java
// Read only selected columns (comma-separated field names)
file.setProjectList("id,description,code");
```

After setting a project list always use `file.getProjectedRecordDefinition()` (not `file.getRecordDefinition()`) when constructing the `HPCCRecordBuilder`.

---

### Advanced Read Options

#### `FileReadContext`

The `HpccRemoteFileReader.FileReadContext` struct controls advanced read behaviour:

```java
HpccRemoteFileReader.FileReadContext ctx =
    new HpccRemoteFileReader.FileReadContext();

ctx.originalRD        = file.getRecordDefinition();
ctx.readBufferSizeKB  = 1024;         // limit memory: default is 4096 KB
ctx.recordSamplingRate = 0.1;         // read ~10% of records
ctx.recordSamplingSeed = 42L;         // fixed seed → repeatable samples

HpccRemoteFileReader<HPCCRecord> reader =
    new HpccRemoteFileReader<>(ctx, part, builder);
```

#### Record Sampling

```java
// Deterministic 10% sample — same seed always returns same records
ctx.recordSamplingRate = 0.1;
ctx.recordSamplingSeed = 42L;
```

Sampling operates per-partition. The resulting count will be approximately `totalRecords × samplingRate` with a typical variance of less than 10%.

#### Resume / Checkpoint

The reader can checkpoint its position for resuming interrupted reads:

```java
// Capture resume info for every record (or every N records)
HpccRemoteFileReader.FileReadResumeInfo resumeInfo =
    reader.getFileReadResumeInfo();

// Later, resume from a checkpoint
HpccRemoteFileReader<HPCCRecord> resumedReader =
    new HpccRemoteFileReader<>(part, originalRD, builder, resumeInfo);
```

#### Early Close

Calling `reader.close()` before the iterator is exhausted is safe. If `close()` is called after `hasNext()` returns `true` but before `next()` is called, the current record can still be retrieved via `next()`.

#### String Processing Flags

```java
// Strip trailing whitespace from fixed-length string fields
fileReader.getRecordReader()
    .setStringProcessingFlags(BinaryRecordReader.TRIM_STRINGS);
```

#### File Access Expiry

```java
// Override the default 300-second file-access token lifetime
file.setFileAccessExpirySecs(600);
```

---

### Index Files

Index files (TLK-backed distributed key files) are read using the same `HPCCFile` / `HpccRemoteFileReader` pattern. The library automatically detects that the file is an index:

```java
HPCCFile indexFile = new HPCCFile("~test::my::index",
    connString, hpccUser, hpccPass);

// Confirm it is an index (TLK)
System.out.println("Is TLK index: " + indexFile.isTlkIndex());

DataPartition[] parts = indexFile.getFileParts();
FieldDef rd = indexFile.getRecordDefinition();

for (DataPartition part : parts) {
    HPCCRecordBuilder builder =
        new HPCCRecordBuilder(indexFile.getProjectedRecordDefinition());
    HpccRemoteFileReader<HPCCRecord> reader =
        new HpccRemoteFileReader<>(part, rd, builder);
    while (reader.hasNext()) {
        HPCCRecord rec = reader.next();
        // process rec
    }
    reader.close();
}
```

To read a child dataset embedded inside a parent record, create a `FieldDef` hierarchy that mirrors the ECL record definition including nested `DATASET` children.

---

### Avro and Parquet Integration

The dfsclient includes schema translation utilities that convert between HPCC `FieldDef` schemas and Avro / Parquet schemas.

```java
import org.hpccsystems.dfs.client.AvroSchemaTranslator;
import org.apache.avro.Schema;

// Convert HPCC record definition to Avro schema
AvroSchemaTranslator translator = new AvroSchemaTranslator();
Schema avroSchema = translator.hpccToAvro(recordDef);

// Use AvroGenericRecordAccessor to write Avro GenericRecord objects
import org.hpccsystems.dfs.client.AvroGenericRecordAccessor;
AvroGenericRecordAccessor accessor =
    new AvroGenericRecordAccessor(avroSchema);
```

For Parquet, `ParquetInputFile` and `ParquetOutputFile` bridge the dfsclient's `CircularByteBuffer` I/O model with the Apache Parquet library. See `DFSParquetReadWriteTest` in the test suite for complete examples.

---

## Testing Conventions

### Test Categories

Tests are classified using JUnit `@Category` annotations:

| Annotation | Meaning |
|---|---|
| `@Category(org.hpccsystems.commons.annotations.RemoteTests.class)` | Requires a live HPCC cluster; skipped in offline builds |
| `@Category(org.hpccsystems.commons.annotations.BaseTests.class)` | Local unit tests; no cluster required |

### Base Test Class

All remote integration tests extend `BaseRemoteTest`. It handles:
- Parsing connection parameters from system properties
- Constructing and validating the `Connection` object
- Obtaining a `Platform` and `HPCCWsClient`
- Discovering `thorClusterFileGroup` and `roxieClusterGroup`
- Running ECL dataset-generation scripts on startup

#### Running Remote Tests

Pass cluster details as Maven system properties:

```
mvn test -Dtest=WsDFUClientTest \
    -Dhpccconn=http://my-hpcc-cluster:8010 \
    -Dhpccuser=myuser \
    -Dhpccpass=mypassword \
    -Dthorclustername=thor \
    -Droxieclustername=roxie
```

| Property | Default | Purpose |
|---|---|---|
| `hpccconn` | `http://localhost:8010` | ESP endpoint |
| `hpccuser` | `JunitUser` | HPCC user name |
| `hpccpass` | *(empty)* | HPCC password |
| `thorclustername` | `thor` | Thor cluster name |
| `roxieclustername` | `roxie` | Roxie cluster name |
| `thorgroupname` | *(auto-detected)* | Thor storage group |
| `roxiegroupname` | *(auto-detected)* | Roxie storage group |
| `connecttimeoutmillis` | *(none)* | Connection timeout override |
| `sockettimeoutmillis` | *(none)* | Socket timeout override |
| `testthreadcount` | `10` | Thread count for concurrency tests |

### Writing a New Remote Test

```java
package org.hpccsystems.ws.client;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.Assert;

@Category(org.hpccsystems.commons.annotations.RemoteTests.class)
public class MyFeatureTest extends BaseRemoteTest {

    @Test
    public void myTest() throws Exception {
        HPCCWsDFUClient dfuClient = wsclient.getWsDFUClient();
        Assert.assertTrue(dfuClient.ping());
        // ... test logic using wsclient, connString, hpccUser, hpccPass, etc.
    }
}
```

All inherited fields (`wsclient`, `connString`, `hpccUser`, `hpccPass`, `thorclustername`, `thorClusterFileGroup`, `connTO`) are available directly.

### Multi-Threaded Tests

`BaseRemoteTest.executeMultiThreadedTask(callable, threadCount)` runs a `Callable<String>` concurrently. The callable should return an empty string on success and a non-empty error description on failure:

```java
Callable<String> task = () -> {
    HPCCWsWorkUnitsClient client = wsclient.getWsWorkunitsClient();
    return client.getInitError(); // returns "" when no error
};
executeMultiThreadedTask(task, testThreadCount);
```

### OpenTelemetry in Tests

`BaseRemoteTest` initialises an OpenTelemetry `Tracer` if the system property `otel.java.global-autoconfigure.enabled=true` is set. Individual test methods annotated with `@WithSpan` will automatically generate spans when a tracer is active.

---

## Kubernetes and Containerized Environments

When the target HPCC cluster is deployed on Kubernetes, the data node IPs visible inside the cluster are typically not reachable from an external client. dfsclient provides a `ClusterRemapper` abstraction to translate internal addresses to externally routable ones.

### Detecting Containerized Mode

```java
boolean containerized = wsClient.isContainerized();
```

When `containerized == true`, topology queries should use `TopologyGroupQueryKind.PLANE` instead of `THOR` / `ROXIE`.

### Configuring a Cluster Remapper

```java
import org.hpccsystems.dfs.cluster.*;

// AddrRemapper replaces internal IPs with external addresses
RemapInfo remapInfo = new RemapInfo(/* configuration */);
AddrRemapper remapper = new AddrRemapper(remapInfo);

// Pass the remapper when creating partitions during a write
DataPartition[] partitions = DataPartition.createPartitions(
    dfuParts, remapper,
    dfuParts.length, createResult.getFileAccessInfoBlob());
```

For a full step-by-step configuration guide for Kubernetes environments see the [project wiki](https://github.com/hpcc-systems/hpcc4j/wiki/Using-HPCC4J-with-HPCC-on-a-Kubernetes-Cluster).

---

## Related Resources

- **Javadoc** — generated by `mvn javadoc:javadoc` in each module
- **wsclient/README.md** — API compatibility matrix, changelog, migration notes
- **dfsclient/README.md** — Kubernetes setup notes, Maven dependency
- **Project Wiki** — [https://github.com/hpcc-systems/hpcc4j/wiki](https://github.com/hpcc-systems/hpcc4j/wiki)
- **HPCC Systems Documentation** — [https://hpccsystems.com/training/documentation](https://hpccsystems.com/training/documentation)

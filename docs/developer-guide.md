# HPCC4J Developer Guide

**Audience:** Downstream developers using the `wsclient` and `dfsclient` Java libraries to interact with HPCC Systems deployments.

---

## Table of Contents

1. [HPCC Systems Architecture Overview](#1-hpcc-systems-architecture-overview)
2. [Getting Started](#2-getting-started)
3. [WsClient: Web Service Client Library](#3-wsclient-web-service-client-library)
   - [Connection and Client Setup](#31-connection-and-client-setup)
   - [ECLWatch & System Management (WsSMC, WsTopology)](#32-eclwatch--system-management-wssmc-wstopology)
   - [ECL Workunit Execution on Thor (WsWorkunits)](#33-ecl-workunit-execution-on-thor-wsworkunits)
   - [Publishing and Calling Roxie Queries](#34-publishing-and-calling-roxie-queries)
   - [Distributed File Management (WsDFU)](#35-distributed-file-management-wsdfu)
   - [File Ingestion via Spray (FileSpray)](#36-file-ingestion-via-spray-filespray)
   - [Query Package Management (WsPackageProcess)](#37-query-package-management-wspackageprocess)
   - [Key-Value Store (WsStore)](#38-key-value-store-wsstore)
   - [SQL Interface (WsSQL)](#39-sql-interface-wssql)
   - [Code Signing (WsCodeSign)](#310-code-signing-wscodesign)
   - [File Cross-Reference / Integrity (WsDFUXRef)](#311-file-cross-reference--integrity-wsdfuxref)
   - [Cloud / Containerized Deployments (WsCloud, WsResources)](#312-cloud--containerized-deployments-wscloud-wsresources)
4. [DFSClient: Direct File System Client](#4-dfsclient-direct-file-system-client)
   - [Reading an HPCC File](#41-reading-an-hpcc-file)
   - [Writing an HPCC File](#42-writing-an-hpcc-file)
   - [Working with HPCC Indexes (Key Files)](#43-working-with-hpcc-indexes-key-files)
   - [Column Projection and Row Filtering](#44-column-projection-and-row-filtering)
   - [Custom Record Handling](#45-custom-record-handling)
   - [Kubernetes / Containerized Clusters](#46-kubernetes--containerized-clusters)
5. [Common Patterns and Best Practices](#5-common-patterns-and-best-practices)
   - [Connection Pooling](#51-connection-pooling)
   - [Error Handling](#52-error-handling)
   - [TLS / HTTPS Connections](#53-tls--https-connections)
   - [OpenTelemetry Tracing](#54-opentelemetry-tracing)

---

## 1. HPCC Systems Architecture Overview

HPCC Systems is a distributed data processing platform composed of several major components. Understanding these components helps you choose the right HPCC4J library for each task.

```
┌─────────────────────────────────────────────────────────────────┐
│                   ESP (Enterprise Service Platform)              │
│              Default port 8010 (HTTP) / 18010 (HTTPS)           │
│   ┌────────────┐ ┌──────────────┐ ┌──────────────────────────┐  │
│   │  ECLWatch  │ │  WsWorkunits │ │       WsDFU              │  │
│   │ (WsSMC,    │ │ (ECL submit, │ │ (file metadata, access,  │  │
│   │ WsTopology)│ │  monitor,    │ │  spray/despray)          │  │
│   └────────────┘ │  publish)    │ └──────────────────────────┘  │
│                  └──────────────┘                                │
└───────────────────────┬─────────────────────────────────────────┘
                        │
         ┌──────────────┼───────────────────┐
         │              │                   │
    ┌────▼────┐   ┌──────▼──────┐   ┌──────▼──────┐
    │  Thor   │   │    Roxie    │   │    DALI     │
    │ (Batch  │   │  (Real-time │   │ (Metadata   │
    │  ETL)   │   │   queries)  │   │  store)     │
    └────┬────┘   └──────┬──────┘   └─────────────┘
         │              │
    ┌────▼──────────────▼────┐
    │       DAFILESRV        │
    │  (Distributed file I/O │
    │   RowService port 7600)│
    └────────────────────────┘
```

| Component     | Role                                                                 | Primary HPCC4J Access                        |
|---------------|----------------------------------------------------------------------|----------------------------------------------|
| **ESP**       | HTTP/SOAP gateway; hosts all web services; entry point for all API calls | `Connection`, all `HPCCWs*Client` classes |
| **ECLWatch**  | Web management console (WsSMC, WsTopology); monitors activity, cluster health | `HPCCWsSMCClient`, `HPCCWsTopologyClient` |
| **WsDFU**     | Manages logical file metadata in DALI; controls file access tokens  | `HPCCWsDFUClient`                            |
| **FileSpray** | Handles file import (spray) from landing zones and export (despray) | `HPCCFileSprayClient`                        |
| **Thor**      | Batch ECL processing cluster for large-scale data transformations    | `HPCCWsWorkUnitsClient` (submit/run ECL)     |
| **Roxie**     | Low-latency real-time query engine; runs published ECL queries       | `HPCCWsWorkUnitsClient` (publish), `HPCCWsSQLClient` (query) |
| **DALI**      | Distributed file system metadata store; tracks logical file parts   | Accessed indirectly via `HPCCWsDFUClient`    |
| **DAFILESRV** | Distributed file access daemon; serves raw binary file data         | `HPCCFile`, `HpccRemoteFileReader`, `HPCCRemoteFileWriter` (dfsclient) |

### Key Concepts

- **Logical File**: An HPCC file identified by name (e.g., `myns::myfile`) that is physically distributed across cluster nodes. Managed by DALI.
- **Workunit (WU)**: A unit of ECL computation. When you submit ECL code, HPCC creates a workunit, compiles it, and executes it on a target cluster (Thor or Roxie).
- **Spray**: The process of importing a file from a landing zone (dropzone) into the HPCC distributed file system, distributing it across cluster nodes.
- **Despray**: The reverse—extracting an HPCC logical file to a dropzone as a single file.
- **Landing Zone (DropZone)**: A shared file system path accessible to both the HPCC cluster and external clients, used as staging area for spray/despray.
- **ECL**: Enterprise Control Language—HPCC's declarative data processing language.
- **Published Query**: An ECL workunit that has been compiled and deployed to Roxie for low-latency execution.

---

## 2. Getting Started

### Maven Dependencies

Add the following to your `pom.xml`. Use the version matching your HPCC Systems platform version (versions are kept in sync):

```xml
<!-- Web service clients for all ESP-based operations -->
<dependency>
    <groupId>org.hpccsystems</groupId>
    <artifactId>wsclient</artifactId>
    <version>10.0.0-1</version>
</dependency>

<!-- Direct file system access (read/write HPCC files via DAFILESRV) -->
<dependency>
    <groupId>org.hpccsystems</groupId>
    <artifactId>dfsclient</artifactId>
    <version>10.0.0-1</version>
</dependency>
```

> **Version Compatibility:** HPCC4J versions track HPCC Platform versions. Use the HPCC4J version matching your cluster's platform version for the best API compatibility. See [Maven Central](https://search.maven.org/search?q=g:org.hpccsystems) for the latest releases.

### Basic Connection Setup

All wsclient operations require a `Connection` object pointing to your HPCC ESP endpoint:

```java
import org.hpccsystems.ws.client.utils.Connection;

// Minimal connection (no credentials, unsecured)
Connection conn = new Connection("http://my-hpcc-cluster:8010");

// With credentials
conn.setCredentials("myuser", "mypassword");

// Or construct fully:
Connection conn = new Connection("http", "my-hpcc-cluster", 8010);
conn.setCredentials("myuser", "mypassword");

// HTTPS with self-signed certificate (e.g., dev environments)
Connection conn = new Connection("https://my-hpcc-cluster:18010");
conn.setCredentials("myuser", "mypassword");
conn.setAllowInvalidCerts(true);  // Only for dev/test
```

---

## 3. WsClient: Web Service Client Library

The `wsclient` module provides Java clients for all HPCC ESP web services. The main entry point is `HPCCWsClient`, which acts as a facade providing access to all specialized sub-clients.

### Client Architecture

```
HPCCWsClient  ──────────────────────────────────────── Facade / entry point
  ├── HPCCWsSMCClient          → WsSMC         (ECLWatch activity, health)
  ├── HPCCWsTopologyClient     → WsTopology    (cluster topology)
  ├── HPCCWsDFUClient          → WsDFU         (logical file management)
  ├── HPCCFileSprayClient      → FileSpray     (import/export files)
  ├── HPCCWsWorkUnitsClient    → WsWorkunits   (ECL execution, Thor, Roxie)
  ├── HPCCWsPackageProcessClient → WsPackageProcess (Roxie packages)
  ├── HPCCWsStoreClient        → WsStore       (key-value store)
  ├── HPCCWsSQLClient          → WsSQL         (SQL interface)
  ├── HPCCWsCodeSignClient     → WsCodeSign    (ECL code signing)
  ├── HPCCWsDFUXRefClient      → WsDFUXRef     (file integrity/xref)
  ├── HPCCWsCloudClient        → WsCloud       (container pod info)
  ├── HPCCWsFileIOClient       → WsFileIO      (binary file I/O on dropzone)
  └── HPCCWsResourcesClient    → WsResources   (containerized resource discovery)
```

### 3.1 Connection and Client Setup

```java
import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.utils.Connection;

Connection conn = new Connection("http://my-hpcc-cluster:8010");
conn.setCredentials("admin", "password");

// Get HPCCWsClient (instances are cached per connection)
HPCCWsClient client = HPCCWsClient.get(conn);

// Or use the static factory directly:
HPCCWsClient client = HPCCWsClient.get("http", "my-hpcc-cluster", "8010", "admin", "password");
```

> **Note:** `HPCCWsClient.get()` caches client instances. For concurrent applications, use `HPCCWsClientPool` (see [Connection Pooling](#51-connection-pooling)).

---

### 3.2 ECLWatch & System Management (WsSMC, WsTopology)

ECLWatch is the web-based management console for HPCC Systems, backed by the WsSMC and WsTopology services. Use these clients to query cluster health, list available clusters, and discover dropzones.

#### Health Check / Build Information

```java
import org.hpccsystems.ws.client.HPCCWsSMCClient;

HPCCWsSMCClient smcClient = client.getWsSMCClient();

// Health check
boolean isAlive = smcClient.ping();

// Get HPCC platform build version string
String buildInfo = smcClient.getHPCCBuild();
System.out.println("HPCC Build: " + buildInfo);

// Check if cluster is containerized (Kubernetes)
boolean isContainerized = smcClient.isContainerized();
```

#### Querying Cluster Topology

```java
import org.hpccsystems.ws.client.HPCCWsTopologyClient;
import org.hpccsystems.ws.client.HPCCWsTopologyClient.TopologyGroupQueryKind;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpGroupWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpTargetClusterWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpDropZoneWrapper;

HPCCWsTopologyClient topoClient = client.getWsTopologyClient();

// List all valid target clusters (Thor, Roxie, etc.)
List<TpTargetClusterWrapper> clusters = topoClient.getValidTargetGroups();
for (TpTargetClusterWrapper cluster : clusters) {
    System.out.println("Cluster: " + cluster.getName() + " Type: " + cluster.getType());
}

// Get valid target cluster names
List<String> clusterNames = topoClient.getValidTargetClusterNames();
clusterNames.forEach(name -> System.out.println("Cluster: " + name));

// List all cluster groups (Thor worker node groups)
List<TpGroupWrapper> groups = topoClient.getTopologyGroups(TopologyGroupQueryKind.All);
for (TpGroupWrapper group : groups) {
    System.out.println("Group: " + group.getName() + " Kind: " + group.getKind());
}

// List available drop zones (landing zones) - filter by name or pass null for all
List<TpDropZoneWrapper> dropZones = topoClient.queryDropzones(null);
for (TpDropZoneWrapper dz : dropZones) {
    System.out.println("DropZone: " + dz.getName() + " Path: " + dz.getPath());
}

// Get logical clusters
List<TpLogicalClusterWrapper> logicalClusters = topoClient.getLogicalClusters();
logicalClusters.forEach(lc -> System.out.println("Logical cluster: " + lc.getName()));
```

> **Note:** Topology queries may not be fully supported in containerized (Kubernetes) HPCC deployments. Use `HPCCWsResourcesClient` and `HPCCWsCloudClient` for containerized environments instead.

---

### 3.3 ECL Workunit Execution on Thor (WsWorkunits)

The `HPCCWsWorkUnitsClient` provides full lifecycle management for ECL workunits—submit ECL code, monitor execution, retrieve results, and manage the workunit state.

#### Submit and Run ECL on Thor (Batch)

```java
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;

HPCCWsWorkUnitsClient wuClient = client.getWsWorkunitsClient();

// Create a workunit descriptor
WorkunitWrapper wu = new WorkunitWrapper();
wu.setEcl("OUTPUT('Hello, HPCC!');");
wu.setCluster("thor");          // Target Thor cluster name
wu.setJobname("my-test-job");

// Submit ECL, compile, run, and retrieve results in one call (best for small result sets)
String xmlResults = wuClient.createAndRunWUFromECLAndGetResults(wu);
System.out.println("Results: " + xmlResults);
```

#### Submit ECL Asynchronously and Poll for Completion

```java
WorkunitWrapper wu = new WorkunitWrapper();
wu.setEcl("OUTPUT(DATASET([{1,'Alice'},{2,'Bob'}],{INTEGER id; STRING name;}));");
wu.setCluster("thor");
wu.setJobname("async-example");

// Create and run, return WUID for later polling
String wuid = wuClient.createAndRunWUFromECLAndGetWUID(wu);
System.out.println("Submitted workunit: " + wuid);

// Poll until complete
WorkunitWrapper completed = null;
while (completed == null || !HPCCWsWorkUnitsClient.isWorkunitComplete(completed)) {
    Thread.sleep(2000);
    completed = wuClient.getWUInfo(wuid);
    System.out.println("State: " + completed.getState());
}

// Retrieve results (XML format)
String results = wuClient.fetchResults(wuid, 0, "thor", false, 0, 100);
System.out.println("Results: " + results);
```

#### Monitor and Manage Existing Workunits

```java
// List recent workunits by owner
List<WorkunitWrapper> workunits = wuClient.getWorkunits(null, "myuser", null, false, null, "thor", null);
for (WorkunitWrapper wu : workunits) {
    System.out.printf("WUID: %-20s  State: %-12s  Job: %s%n",
            wu.getWuid(), wu.getState(), wu.getJobname());
}

// Get details for a specific workunit
WorkunitWrapper wu = wuClient.getWUInfo("W20240101-120000", true, false, false, false, false);
System.out.println("ECL: " + wu.getQuery().getText());

// Fetch results from a completed workunit
String results = wuClient.fetchResults("W20240101-120000", 0, "thor", false, 0, 50);
```

#### Passing Named Variables to a Workunit

```java
import org.hpccsystems.ws.client.wrappers.wsworkunits.ApplicationValueWrapper;

WorkunitWrapper wu = new WorkunitWrapper();
wu.setEcl("STRING myParam := '' : STORED('param1'); OUTPUT(myParam);");
wu.setCluster("thor");

// Add named parameters
List<ApplicationValueWrapper> appVals = new ArrayList<>();
ApplicationValueWrapper param = new ApplicationValueWrapper();
param.setName("param1");
param.setValue("Hello World");
appVals.add(param);
wu.setApplicationValues(appVals);

String results = wuClient.createAndRunWUFromECLAndGetResults(wu);
```

---

### 3.4 Publishing and Calling Roxie Queries

Roxie is HPCC's low-latency real-time query engine. The workflow is:
1. Compile an ECL workunit targeting a Roxie cluster
2. Publish the workunit to Roxie as a named query
3. Call the published query via WsECL (HTTP) or `HPCCWsSQLClient`

#### Publish an ECL Query to Roxie

```java
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUPublishWorkunitResponseWrapper;

HPCCWsWorkUnitsClient wuClient = client.getWsWorkunitsClient();

// Create a Roxie-targeted workunit (compile and run on Roxie, publish as a query)
WorkunitWrapper wu = new WorkunitWrapper();
wu.setEcl(
    "STRING searchName := '' : STORED('searchName');\n" +
    "myDS := DATASET('~myns::people', {STRING first_name; STRING last_name;}, FLAT);\n" +
    "OUTPUT(myDS(last_name = searchName));");
wu.setCluster("roxie");          // Target Roxie cluster name
wu.setJobname("people-search");  // This becomes the query name on Roxie

// Compile the ECL first
WorkunitWrapper compiled = wuClient.compileWUFromECL(wu);

// Publish to Roxie query set
WUPublishWorkunitResponseWrapper response = wuClient.publishWUFromEclWrapped(compiled);
System.out.println("Published as: " + response.getQueryId());
```

#### List Published Queries

```java
import org.hpccsystems.ws.client.wrappers.wsworkunits.QueryResultWrapper;

// List all published queries on a query set
// Parameters: queryid, queryname, clustername, querysetname, pageSize, pageStartFrom, activated, filename, descending
List<QueryResultWrapper> queries = wuClient.listQueries(
        null, null, "roxie", null, 100, 0, null, null, false);
for (QueryResultWrapper query : queries) {
    System.out.printf("Query: %-30s  Suspended: %s%n",
            query.getId(), query.getSuspended());
}
```

#### Call a Published Roxie Query via HTTP (WsECL)

Published Roxie queries can be called directly via HTTP. The URL format is:
```
http://<esp-host>:<eclwatch-port>/WsEcl/run/query/<queryset>/<queryname>/json
```

Example using standard Java HTTP:
```java
URL url = new URL("http://my-hpcc-cluster:8010/WsEcl/run/query/roxie/people-search/json");
HttpURLConnection http = (HttpURLConnection) url.openConnection();
http.setRequestMethod("POST");
http.setDoOutput(true);
http.setRequestProperty("Content-Type", "application/json");

// Pass parameters as JSON
String body = "{\"searchName\": \"Smith\"}";
http.getOutputStream().write(body.getBytes(StandardCharsets.UTF_8));

// Read response
try (InputStream in = http.getInputStream()) {
    String result = new String(in.readAllBytes(), StandardCharsets.UTF_8);
    System.out.println(result);
}
```

---

### 3.5 Distributed File Management (WsDFU)

`HPCCWsDFUClient` manages HPCC logical files stored in the distributed file system. It communicates with DALI to create, query, and manage file metadata.

#### Browse and Search Files

```java
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFULogicalFileWrapper;

HPCCWsDFUClient dfuClient = client.getWsDFUClient();

// List files in a namespace/scope
List<DFULogicalFileWrapper> files = dfuClient.getFiles("myns::");
for (DFULogicalFileWrapper file : files) {
    System.out.printf("File: %-40s  Size: %d  Cluster: %s%n",
            file.getName(), file.getIntSize(), file.getClusterName());
}

// Search for files by name pattern
List<DFULogicalFileWrapper> results = dfuClient.searchFiles("*people*", "thor");
for (DFULogicalFileWrapper f : results) {
    System.out.println("Found: " + f.getName());
}
```

#### Get File Metadata

```java
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper;

// Get file details (schema, record count, size, cluster, etc.)
DFUFileDetailWrapper detail = dfuClient.getFileDetails("myns::people", "thor");
System.out.println("Record Count: " + detail.getRecordCount());
System.out.println("File Size:    " + detail.getFileSize());
System.out.println("ECL Record:   " + detail.getEcl());

// Get column metadata
List<DFUDataColumnWrapper> columns = dfuClient.getFileMetaData("myns::people", "thor");
for (DFUDataColumnWrapper col : columns) {
    System.out.printf("Column: %-20s  Type: %-15s%n",
            col.getColumnLabel(), col.getColumnEclType());
}

// Get the first row of data as XML
String firstRow = dfuClient.getFirstRow("myns::people", "thor");
System.out.println("First row: " + firstRow);
```

#### Manage Superfiles

Superfiles aggregate multiple logical files under a single name, enabling efficient partitioned access.

```java
// Create a superfile with subfiles
String[] subfiles = {"~myns::people_2022", "~myns::people_2023"};
dfuClient.createSuperfile("~myns::people_all", subfiles);

// Add a file to an existing superfile
AddtoSuperfileRequestWrapper req = new AddtoSuperfileRequestWrapper();
req.setSuperfile("~myns::people_all");
req.setSubfiles("~myns::people_2024");
dfuClient.addToSuperFile(req);

// Get subfiles of a superfile
String[] subs = dfuClient.getSuperFileSubfiles("~myns::people_all");
Arrays.stream(subs).forEach(System.out::println);

// Remove subfiles from a superfile
dfuClient.deleteSuperFileSubfiles("~myns::people_all",
        Arrays.asList("~myns::people_2022"));
```

#### Delete Files

```java
// Delete one or more logical files
Set<String> filesToDelete = new HashSet<>(Arrays.asList("~myns::temp_file1", "~myns::temp_file2"));
List<DFUResultWrapper> deleteResults = dfuClient.deleteFiles(filesToDelete, "thor");
for (DFUResultWrapper result : deleteResults) {
    System.out.println("Deleted: " + result.getName() + "  Result: " + result.getResult());
}
```

#### Get File Access Token (for DFSClient integration)

When using `dfsclient` to directly read/write files, you may need to acquire a file access token through WsDFU:

```java
// Get file access info including partition details and access blob (token)
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileAccessInfoWrapper;

DFUFileAccessInfoWrapper accessInfo = dfuClient.getFileAccess(
        "myns::people",   // logical file name
        "thor",           // cluster name
        120,              // access expiry in seconds
        "myapp-job-001"   // optional job ID for tracking
);

System.out.println("File parts: " + accessInfo.getNumParts());
System.out.println("Access blob: " + accessInfo.getFileAccessInfoBlob());
```

---

### 3.6 File Ingestion via Spray (FileSpray)

Spray imports external files (e.g., CSV, fixed-width, XML) from landing zones into the HPCC distributed file system, distributing the data across Thor nodes. Despray extracts HPCC logical files back to a landing zone.

```
 Local File System
       │
       │  (1) Upload to DropZone via HTTP/SFTP
       ▼
 Landing Zone (DropZone)  ──── (2) Spray ────► HPCC Logical File (distributed)
                          ◄─── (3) Despray ──
```

#### List DropZones and Their Files

```java
import org.hpccsystems.ws.client.HPCCFileSprayClient;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.PhysicalFileStructWrapper;

HPCCFileSprayClient sprayClient = client.getFileSprayClient();

// List all local dropzones
List<DropZoneWrapper> dropZones = sprayClient.fetchLocalDropZones();
for (DropZoneWrapper dz : dropZones) {
    System.out.printf("DropZone: %-20s  Path: %-30s  Host: %s%n",
            dz.getName(), dz.getPath(), dz.getNetAddress());

    // List files in this dropzone
    List<PhysicalFileStructWrapper> dzFiles = sprayClient.listFiles(
            dz.getNetAddress(), dz.getPath(), null);
    for (PhysicalFileStructWrapper f : dzFiles) {
        System.out.printf("  %-30s  %15s  %s%n",
                f.getName(), f.getFilesize(), f.getModifiedtime());
    }
}
```

#### Upload a File to a DropZone

```java
import java.io.File;

File localFile = new File("/path/to/my_data.csv");

// Upload to the first available local dropzone
boolean uploaded = sprayClient.uploadFileLocalDropZone(localFile);

// Or upload to a specific dropzone by address
DropZoneWrapper targetDZ = dropZones.get(0);
boolean uploaded = sprayClient.uploadFile(localFile, targetDZ.getNetAddress());
```

#### Spray a CSV File from DropZone to Thor

```java
import org.hpccsystems.ws.client.HPCCFileSprayClient.SprayVariableFormat;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DelimitedDataOptions;
import org.hpccsystems.ws.client.wrappers.gen.filespray.ProgressResponseWrapper;

DropZoneWrapper dz = sprayClient.fetchLocalDropZones().get(0);

// Configure CSV delimiters
DelimitedDataOptions csvOptions = HPCCFileSprayClient.createDelimitedDataOptionsObject(
        "\\n",    // record terminator
        ",",      // field delimiter
        "\\",     // escape sequence
        "\"",     // quote character
        SprayVariableFormat.DEFAULT_VARIABLE_FORMAT
);

// Spray CSV file to Thor
ProgressResponseWrapper progress = sprayClient.sprayVariable(
        csvOptions,
        dz,
        "my_data.csv",         // source file on dropzone
        "~myns::my_data",      // target HPCC logical file name
        "thor",                // target cluster
        true                   // overwrite if exists
);

System.out.println("DFU Workunit: " + progress.getWuid());

// Monitor spray progress
ProgressResponseWrapper finalStatus = sprayClient.getDfuProgress(progress.getWuid());
System.out.println("Spray status: " + finalStatus.getState());
```

#### Spray a Fixed-Length Record File

```java
// For fixed-length (flat) files, specify the record size in bytes
ProgressResponseWrapper progress = sprayClient.sprayFixed(
        dz,
        "my_fixed.dat",        // source file on dropzone
        256,                   // record size in bytes
        "~myns::my_fixed",     // target logical file name
        "",                    // prefix (empty for none)
        "thor",                // cluster
        true                   // overwrite
);
```

#### Spray an XML File

```java
ProgressResponseWrapper progress = sprayClient.sprayXML(
        dz,
        "my_data.xml",         // source file on dropzone
        "~myns::my_xml_data",  // target logical file name
        "Row",                 // XML row tag
        "thor",                // cluster
        true                   // overwrite
);
```

#### Despray (Extract HPCC File to DropZone)

```java
import org.hpccsystems.ws.client.wrappers.gen.filespray.DesprayResponseWrapper;

DesprayResponseWrapper response = sprayClient.despray(
        false,                     // compressed
        null,                      // decrypt key
        dz.getNetAddress(),        // destination IP
        null,                      // destination plane (containerized)
        dz.getPath() + "/output.csv", // destination path on dropzone
        null,                      // source IP (null = use HPCC default)
        "~myns::my_data",          // source HPCC logical file
        null,                      // split prefix
        true,                      // overwrite
        false                      // single connection
);

// Monitor despray progress
ProgressResponseWrapper status = sprayClient.getDfuProgress(response.getWuid());
System.out.println("Despray DFUWUID: " + response.getWuid());
```

#### Download a File from DropZone

```java
File outputFile = new File("/tmp/downloaded_file.csv");
long bytesTransferred = sprayClient.downloadFile(outputFile, dz, "my_data.csv");
System.out.println("Downloaded " + bytesTransferred + " bytes");
```

---

### 3.7 Query Package Management (WsPackageProcess)

Packages allow Roxie queries to reference file name aliases, enabling file version management without recompiling queries.

```java
import org.hpccsystems.ws.client.HPCCWsPackageProcessClient;
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.PackageListMapDataWrapper;

HPCCWsPackageProcessClient pkgClient = client.getWsPackageProcessClient();

// List packages deployed to a target (process, target, processFilter)
List<PackageListMapDataWrapper> packages = pkgClient.listPackages("roxie", null, null);
for (PackageListMapDataWrapper pkg : packages) {
    System.out.println("Package: " + pkg.getId() + "  Active: " + pkg.getActive());
}

// Add (deploy) a package (packageMapID, content, targetCluster, daliip, overwrite, active)
String packageContent =
    "<RoxiePackages>\n" +
    "  <Package id='myPackage' queries='*'>\n" +
    "    <SuperFile id='~myns::people'>\n" +
    "      <SubFile value='~myns::people_v2'/>\n" +
    "    </SuperFile>\n" +
    "  </Package>\n" +
    "</RoxiePackages>";

pkgClient.addPackage("myPackage", packageContent, "roxie", null, true, true);

// Activate a package (globalScope, packageMapName, process, target)
pkgClient.activatePackage(false, "myPackage", "roxie", null);

// Delete a package (packageMapID, targetcluster)
pkgClient.deletePackage("myPackage", "roxie");
```

---

### 3.8 Key-Value Store (WsStore)

The HPCC Systems key-value store allows applications to persist configuration, user preferences, or application state on the cluster.

```java
import org.hpccsystems.ws.client.HPCCWsStoreClient;
import java.util.Properties;

HPCCWsStoreClient storeClient = client.getWsStoreClient();

// Store a value
// Parameters: storename, namespace, key, value, global
storeClient.setValue("mystore", "myapp", "max_records", "1000", false);

// Retrieve a value
// Parameters: storename, namespace, key, global
String value = storeClient.fetchValue("mystore", "myapp", "max_records", false);
System.out.println("max_records = " + value);

// List all keys in a namespace (returns Properties with key metadata)
// Parameters: storename, namespace, global
Properties keys = storeClient.fetchAllNSKeys("mystore", "myapp", false);
keys.forEach((k, v) -> System.out.println("Key: " + k));

// Delete a key
// Parameters: storename, namespace, key, global
storeClient.deleteValue("mystore", "myapp", "max_records", false);

// Delete an entire namespace
// Parameters: storename, namespace, global, targetuser
storeClient.deleteNamespace("mystore", "myapp", false, null);

// Create a new store
storeClient.createStore("mystore", "My application store", null);
```

---

### 3.9 SQL Interface (WsSQL)

`HPCCWsSQLClient` exposes an SQL interface to HPCC data, allowing standard SQL queries against HPCC datasets through Roxie or Thor.

> **Note:** WsSQL requires the `hpccsql` service to be deployed and configured separately on your HPCC cluster (default port 8510).

```java
import org.hpccsystems.ws.client.HPCCWsSQLClient;
import org.hpccsystems.ws.client.wrappers.gen.wssql.ExecuteSQLResponseWrapper;

// Access WsSQL using its specific port
HPCCWsSQLClient sqlClient = client.getWsSQLClient("8510");

// Execute a SQL query
ExecuteSQLResponseWrapper response = sqlClient.executeSQLFullResponse(
        "SELECT first_name, last_name FROM myns::people WHERE last_name = 'Smith' LIMIT 100",
        "thor",     // target cluster
        "thor",     // query cluster
        0, 0, 0,    // result offset, count, limit
        false,      // don't suppress schema
        false,      // don't use stored procedures
        "myuser",   // username for query tracking
        -1          // no timeout
);

System.out.println("SQL Result: " + response.getResult());

// Get database/table metadata
GetDBMetaDataResponseWrapper meta = sqlClient.getDBMetaData(null, null, null, false);
for (HPCCSQLTablesWrapper table : meta.getTablesList().getHpccSQLTablesWrapper()) {
    System.out.println("Table: " + table.getTableName());
}
```

---

### 3.10 Code Signing (WsCodeSign)

Code signing allows ECL code to be cryptographically signed and verified before deployment.

```java
import org.hpccsystems.ws.client.HPCCWsCodeSignClient;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.SignResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.VerifyResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.ListUserIDsRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.SignRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.VerifyRequestWrapper;

HPCCWsCodeSignClient signClient = client.getWsCodeSignClient();

// List available signing identities
ListUserIDsResponseWrapper idsResponse = signClient.listUserIDs(new ListUserIDsRequestWrapper());
for (String userId : idsResponse.getUserIDs().getItem()) {
    System.out.println("Signing ID: " + userId);
}

// Sign ECL code
String eclCode = "OUTPUT('Hello, HPCC!');";
SignRequestWrapper signReq = new SignRequestWrapper();
signReq.setUserID(idsResponse.getUserIDs().getItem()[0]);
signReq.setText(eclCode);
SignResponseWrapper signResponse = signClient.sign(signReq);
String signedCode = signResponse.getSignedText();

// Verify signed code
VerifyRequestWrapper verifyReq = new VerifyRequestWrapper();
verifyReq.setText(signedCode);
VerifyResponseWrapper verifyResponse = signClient.verify(verifyReq);
System.out.println("Signature valid: " + verifyResponse.getIsValid());
```

---

### 3.11 File Cross-Reference / Integrity (WsDFUXRef)

XRef operations detect orphaned files (physical files with no logical record), lost files (logical records with no physical files), and other file system inconsistencies.

> **Note:** XRef operations are not supported in containerized HPCC deployments.

```java
import org.hpccsystems.ws.client.HPCCWsDFUXRefClient;
import org.hpccsystems.ws.client.wrappers.gen.wsdfuxref.ArrayOfXRefFileWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfuxref.XRefFileWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfuxref.ArrayOfXRefNodeWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfuxref.XRefNodeWrapper;

HPCCWsDFUXRefClient xrefClient = client.getWsDFUXRefClient();

// Build XRef for a cluster node (triggers a scan)
xrefClient.build("thor");

// List available XRef nodes
ArrayOfXRefNodeWrapper nodesResponse = xrefClient.list();
for (XRefNodeWrapper node : nodesResponse.getXRefNode()) {
    System.out.println("XRef Node: " + node.getName() + "  Status: " + node.getStatus());
}

// Find orphaned files (physical data with no DALI record)
ArrayOfXRefFileWrapper orphans = xrefClient.orphanedFiles("thor");
for (XRefFileWrapper orphan : orphans.getXRefFile()) {
    System.out.println("Orphan: " + orphan.getName() + "  Size: " + orphan.getSize());
}

// Find lost files (DALI record with no physical data)
ArrayOfXRefFileWrapper lostFiles = xrefClient.lostFiles("thor");
for (XRefFileWrapper lost : lostFiles.getXRefFile()) {
    System.out.println("Lost: " + lost.getName());
}

// Find found files (previously lost, now recovered)
ArrayOfXRefFileWrapper foundFiles = xrefClient.foundFiles("thor");

// Clean orphaned directories
xrefClient.cleanDirectories("thor");
```

---

### 3.12 Cloud / Containerized Deployments (WsCloud, WsResources)

For HPCC Systems running on Kubernetes, use `HPCCWsCloudClient` and `HPCCWsResourcesClient` to discover available services and pods.

```java
import org.hpccsystems.ws.client.HPCCWsCloudClient;
import org.hpccsystems.ws.client.HPCCWsResourcesClient;
import org.hpccsystems.ws.client.wrappers.gen.wscloud.GetPODsResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ServiceQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ServiceQueryResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.TargetQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.TargetQueryResponseWrapper;

// Get running pod information (Kubernetes deployments)
HPCCWsCloudClient cloudClient = client.getWsCloudClient();
GetPODsResponseWrapper podsResponse = cloudClient.getPods();
for (HPCCPodWrapper pod : podsResponse.getPODs().getHpccPodWrapper()) {
    System.out.printf("Pod: %-30s  Type: %-15s  Ready: %s%n",
            pod.getName(), pod.getType(), pod.getReady());
}

// Discover available services (containerized alternative to WsTopology)
HPCCWsResourcesClient resourcesClient = client.getWsResourcesClient();
ServiceQueryResponseWrapper svcResponse = resourcesClient.serviceQuery(new ServiceQueryRequestWrapper());
for (ServiceWrapper svc : svcResponse.getServices().getItem()) {
    System.out.println("Service: " + svc.getName() + "  Port: " + svc.getPort());
}

// Get available target clusters
TargetQueryResponseWrapper targetResponse = resourcesClient.targetQuery(new TargetQueryRequestWrapper());
for (TargetWrapper target : targetResponse.getTargets().getItem()) {
    System.out.println("Target: " + target.getName() + "  Type: " + target.getType());
}
```

---

## 4. DFSClient: Direct File System Client

The `dfsclient` module enables **direct, high-performance binary I/O** against HPCC files by communicating with DAFILESRV (the distributed file access daemon) on each cluster node.

Unlike the wsclient REST/SOAP interface, dfsclient reads and writes HPCC's native binary format in parallel across all file partitions—making it suitable for large-scale data ingestion and extraction.

```
Your Java App
    │
    │   HPCCFile (logical file handle via WsDFU/ESP)
    │       │
    │   DataPartition[] (one per physical file part)
    │       │
    │   HpccRemoteFileReader  ──── reads ────► DAFILESRV :7600 (each node)
    │   HPCCRemoteFileWriter  ──── writes ───► DAFILESRV :7600 (each node)
```

### Key Classes

| Class | Purpose |
|-------|---------|
| `HPCCFile` | Logical file handle; fetches partition metadata from ESP/DALI |
| `DataPartition` | Describes one physical file part: IP, path, access token |
| `HpccRemoteFileReader<T>` | Iterator-based reader for one partition |
| `HPCCRemoteFileWriter<T>` | Streaming writer for one partition |
| `HPCCRecord` | Generic record container (array of field values) |
| `HPCCRecordBuilder` | Constructs `HPCCRecord` instances while reading |
| `HPCCRecordAccessor` | Provides field-level access to `HPCCRecord` for writing |
| `FieldDef` | Schema definition for a record (from `commons-hpcc`) |

---

### 4.1 Reading an HPCC File

Reading an HPCC file involves three steps:
1. Create an `HPCCFile` object to fetch file metadata and partition info
2. Iterate over `DataPartition[]` to read each physical part in parallel
3. Use `HpccRemoteFileReader` to iterate over records within each partition

```java
import org.hpccsystems.dfs.client.HPCCFile;
import org.hpccsystems.dfs.client.DataPartition;
import org.hpccsystems.dfs.client.HpccRemoteFileReader;
import org.hpccsystems.dfs.client.HPCCRecord;
import org.hpccsystems.dfs.client.HPCCRecordBuilder;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.ws.client.utils.Connection;

Connection conn = new Connection("http://my-hpcc-cluster:8010");
conn.setCredentials("myuser", "mypassword");

// 1. Open the HPCC logical file
HPCCFile file = new HPCCFile("~myns::people", conn);

// 2. Get the file's record schema and physical partitions
FieldDef recordDef = file.getRecordDefinition();
DataPartition[] partitions = file.getFileParts();

System.out.println("File has " + partitions.length + " partitions");
System.out.println("Record schema: " + recordDef.getECLType());

// 3. Read each partition
List<HPCCRecord> allRecords = new ArrayList<>();

for (DataPartition partition : partitions) {
    HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());

    HpccRemoteFileReader<HPCCRecord> reader = new HpccRemoteFileReader<>(
            partition,
            recordDef,
            recordBuilder
    );

    while (reader.hasNext()) {
        HPCCRecord record = reader.next();
        allRecords.add(record);
    }
    reader.close();
}

System.out.println("Total records read: " + allRecords.size());

// Access individual field values by index
for (HPCCRecord record : allRecords) {
    String firstName = (String) record.getField(0);  // field 0 = first_name
    String lastName  = (String) record.getField(1);  // field 1 = last_name
    System.out.println(firstName + " " + lastName);
}
```

#### Parallel Reading (Multi-threaded)

For large files, read partitions in parallel using a thread pool:

```java
ExecutorService executor = Executors.newFixedThreadPool(partitions.length);
List<Future<List<HPCCRecord>>> futures = new ArrayList<>();

for (DataPartition partition : partitions) {
    futures.add(executor.submit(() -> {
        List<HPCCRecord> records = new ArrayList<>();
        HPCCRecordBuilder builder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
        HpccRemoteFileReader<HPCCRecord> reader = new HpccRemoteFileReader<>(
                partition, recordDef, builder);
        while (reader.hasNext()) {
            records.add(reader.next());
        }
        reader.close();
        return records;
    }));
}

List<HPCCRecord> allRecords = new ArrayList<>();
for (Future<List<HPCCRecord>> future : futures) {
    allRecords.addAll(future.get());
}
executor.shutdown();
```

---

### 4.2 Writing an HPCC File

Writing a new logical file to HPCC requires four steps:
1. Define a record schema (`FieldDef`)
2. Request a temporary file handle via `HPCCWsDFUClient.createFile()`
3. Write records to each partition using `HPCCRemoteFileWriter`
4. Publish the completed file via `HPCCWsDFUClient.publishFile()`

```java
import org.hpccsystems.dfs.client.DataPartition;
import org.hpccsystems.dfs.client.HPCCRecord;
import org.hpccsystems.dfs.client.HPCCRecordAccessor;
import org.hpccsystems.dfs.client.HPCCRemoteFileWriter;
import org.hpccsystems.dfs.cluster.NullRemapper;
import org.hpccsystems.dfs.cluster.RemapInfo;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.HpccSrcType;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUCreateFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFilePartWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;

// 1. Define the record schema using FieldDef
FieldDef[] fields = {
    new FieldDef("id",         FieldType.INTEGER, "INTEGER4", 4, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]),
    new FieldDef("first_name", FieldType.STRING,  "STRING30", 30, false, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]),
    new FieldDef("last_name",  FieldType.STRING,  "STRING30", 30, false, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]),
};
FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 0, false, false,
        HpccSrcType.LITTLE_ENDIAN, fields);

// Convert schema to ECL record definition string
String eclRecordDef = RecordDefinitionTranslator.toECLRecord(recordDef);

// Prepare your data
List<HPCCRecord> records = new ArrayList<>();
records.add(new HPCCRecord(new Object[]{1, "Alice", "Smith"}, recordDef));
records.add(new HPCCRecord(new Object[]{2, "Bob",   "Jones"}, recordDef));

HPCCWsDFUClient dfuClient = client.getWsDFUClient();

// 2. Create a new temporary file in HPCC (allocates partitions)
DFUCreateFileWrapper createResult = dfuClient.createFile(
        "~myns::new_people",   // logical file name
        "thor",                // cluster/file group
        eclRecordDef,          // ECL record definition
        300,                   // access expiry in seconds
        false,                 // compressed
        DFUFileTypeWrapper.Flat,  // file type (Flat, CSV, XML, etc.)
        ""                     // optional description
);

// 3. Convert DFU file parts to DataPartitions for writing
DFUFilePartWrapper[] dfuFileParts = createResult.getFileParts();
DataPartition[] hpccPartitions = DataPartition.createPartitions(
        dfuFileParts,
        new NullRemapper(new RemapInfo(), createResult.getFileAccessInfo()),
        dfuFileParts.length,
        createResult.getFileAccessInfoBlob()
);

// 4. Distribute and write records to each partition
int recordsPerPartition = records.size() / hpccPartitions.length;
int residual = records.size() % hpccPartitions.length;
int offset = 0;
long totalBytesWritten = 0;

HPCCRecordAccessor accessor = new HPCCRecordAccessor(recordDef);

for (int i = 0; i < hpccPartitions.length; i++) {
    int count = recordsPerPartition + (i == hpccPartitions.length - 1 ? residual : 0);

    HPCCRemoteFileWriter<HPCCRecord> writer = new HPCCRemoteFileWriter<>(
            hpccPartitions[i],
            recordDef,
            accessor,
            CompressionAlgorithm.NONE
    );

    for (int j = 0; j < count; j++, offset++) {
        writer.writeRecord(records.get(offset));
    }
    writer.close();
    totalBytesWritten += writer.getBytesWritten();
}

// 5. Publish the completed file (makes it visible in DALI)
dfuClient.publishFile(
        createResult.getFileID(),
        eclRecordDef,
        records.size(),
        totalBytesWritten,
        true  // overwrite if exists
);

System.out.println("Successfully wrote " + records.size() + " records to ~myns::new_people");
```

---

### 4.3 Working with HPCC Indexes (Key Files)

HPCC indexes are B-tree-like key files used for fast keyed lookups. They are typically built over existing HPCC flat files using ECL `BUILD` statements. The dfsclient can read indexes directly.

```java
// Open an HPCC index file
HPCCFile indexFile = new HPCCFile("~myns::people_by_lastname", conn);

boolean isIndex = indexFile.isTlkIndex();
System.out.println("Is TLK index: " + isIndex);

// Enable TLK (Top-Level Key) optimization for range queries
// When true, dfsclient uses the TLK to skip non-matching leaf nodes
indexFile.setUseTLK(true);

// Read index records normally (same as reading a flat file)
FieldDef recordDef = indexFile.getRecordDefinition();
DataPartition[] partitions = indexFile.getFileParts();

for (DataPartition partition : partitions) {
    // Skip TLK partition (it's metadata, not data)
    if (partition.isTLK()) continue;

    HPCCRecordBuilder builder = new HPCCRecordBuilder(indexFile.getProjectedRecordDefinition());
    HpccRemoteFileReader<HPCCRecord> reader = new HpccRemoteFileReader<>(
            partition, recordDef, builder);

    while (reader.hasNext()) {
        HPCCRecord record = reader.next();
        // Process record...
    }
    reader.close();
}
```

---

### 4.4 Column Projection and Row Filtering

The dfsclient supports server-side column pruning and row filtering to reduce data transferred from DAFILESRV.

#### Column Projection (Select Specific Fields)

```java
HPCCFile file = new HPCCFile("~myns::people", conn);

// Only retrieve first_name and last_name (comma-separated field names)
file.setProjectList("first_name,last_name");

// The projected record definition contains only the selected fields
FieldDef projectedDef = file.getProjectedRecordDefinition();
DataPartition[] partitions = file.getFileParts();

for (DataPartition partition : partitions) {
    HPCCRecordBuilder builder = new HPCCRecordBuilder(projectedDef);
    HpccRemoteFileReader<HPCCRecord> reader = new HpccRemoteFileReader<>(
            partition,
            file.getRecordDefinition(),  // original (full) schema for deserialization
            builder
    );

    while (reader.hasNext()) {
        HPCCRecord record = reader.next();
        // record now has only 2 fields: first_name, last_name
        System.out.println(record.getField(0) + " " + record.getField(1));
    }
    reader.close();
}
```

#### Row Filtering (SQL WHERE Syntax)

```java
import org.hpccsystems.commons.ecl.FileFilter;

HPCCFile file = new HPCCFile("~myns::people", conn);

// Apply a row filter using SQL WHERE syntax
// This is pushed down to DAFILESRV to reduce data transferred
file.setFilter("last_name = 'Smith' AND age > 30");

DataPartition[] partitions = file.getFileParts();
FieldDef recordDef = file.getRecordDefinition();

for (DataPartition partition : partitions) {
    HPCCRecordBuilder builder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
    HpccRemoteFileReader<HPCCRecord> reader = new HpccRemoteFileReader<>(
            partition, recordDef, builder);

    while (reader.hasNext()) {
        HPCCRecord record = reader.next();
        // Only records matching the filter are returned
    }
    reader.close();
}
```

#### Combine Projection and Filtering

```java
HPCCFile file = new HPCCFile("~myns::people", conn);
file.setProjectList("first_name,last_name,email");
file.setFilter("last_name = 'Smith'");

// Also set file access expiry for long-running jobs
file.setFileAccessExpirySecs(300);  // 5 minutes
```

---

### 4.5 Custom Record Handling

For applications that work with custom Java objects rather than `HPCCRecord`, you can implement `IRecordBuilder` and `IRecordAccessor`.

#### Custom Record Type

```java
// Your domain object
public class Person {
    public int id;
    public String firstName;
    public String lastName;

    public Person() {}

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
```

#### Custom IRecordBuilder (for reading)

```java
import org.hpccsystems.dfs.client.IRecordBuilder;
import org.hpccsystems.commons.ecl.FieldDef;

public class PersonBuilder implements IRecordBuilder {
    private final FieldDef recordDef;
    private Person current;
    private int fieldIndex = 0;

    public PersonBuilder(FieldDef recordDef) {
        this.recordDef = recordDef;
    }

    @Override
    public void startRecord() { current = new Person(); fieldIndex = 0; }

    @Override
    public void addFieldValue(Object value) {
        switch (fieldIndex++) {
            case 0: current.id        = ((Number) value).intValue(); break;
            case 1: current.firstName = (String) value; break;
            case 2: current.lastName  = (String) value; break;
        }
    }

    @Override
    public Object finalizeRecord() { return current; }

    @Override
    public FieldDef getRecordDefinition() { return recordDef; }
}
```

#### Custom IRecordAccessor (for writing)

```java
import org.hpccsystems.dfs.client.IRecordAccessor;

public class PersonAccessor implements IRecordAccessor {
    private Person record;
    private final FieldDef recordDef;

    public PersonAccessor(FieldDef recordDef) { this.recordDef = recordDef; }

    @Override
    public void setRecord(Object rec) { this.record = (Person) rec; }

    @Override
    public int getNumFields() { return 3; }

    @Override
    public Object getFieldValue(int index) {
        switch (index) {
            case 0: return record.id;
            case 1: return record.firstName;
            case 2: return record.lastName;
            default: throw new IndexOutOfBoundsException("No field at index: " + index);
        }
    }

    @Override
    public FieldDef getRecordDefinition() { return recordDef; }
}
```

#### Using Custom Record Handlers

```java
// Reading with custom builder
PersonBuilder builder = new PersonBuilder(file.getProjectedRecordDefinition());
HpccRemoteFileReader<Person> reader = new HpccRemoteFileReader<>(
        partition, recordDef, builder);

while (reader.hasNext()) {
    Person person = reader.next();
    System.out.println(person.firstName + " " + person.lastName);
}

// Writing with custom accessor
PersonAccessor accessor = new PersonAccessor(recordDef);
HPCCRemoteFileWriter<Person> writer = new HPCCRemoteFileWriter<>(
        partition, recordDef, accessor, CompressionAlgorithm.NONE);

writer.writeRecord(new Person(1, "Alice", "Smith"));
writer.close();
```

#### Using ReflectionRecordBuilder (Automatic Java Bean Mapping)

`ReflectionRecordBuilder` can automatically map HPCC fields to Java object fields by name using reflection:

```java
import org.hpccsystems.dfs.client.ReflectionRecordBuilder;

// Java class field names must match HPCC field names (case-insensitive)
ReflectionRecordBuilder<Person> builder = new ReflectionRecordBuilder<>(
        Person.class, file.getProjectedRecordDefinition());

HpccRemoteFileReader<Person> reader = new HpccRemoteFileReader<>(
        partition, recordDef, builder);

while (reader.hasNext()) {
    Person person = reader.next();
}
```

---

### 4.6 Kubernetes / Containerized Clusters

When connecting to HPCC Systems running on Kubernetes, DAFILESRV nodes may not be directly accessible from outside the cluster. You need to configure address remapping.

See the wiki guide: [Using HPCC4J with HPCC on a Kubernetes Cluster](https://github.com/hpcc-systems/hpcc4j/wiki/Using-HPCC4J-with-HPCC-on-a-Kubernetes-Cluster)

```java
import org.hpccsystems.dfs.cluster.RemapInfo;

// When HPCC is on Kubernetes, worker node IPs reported by DALI
// may be cluster-internal IPs. Remap them to external addresses.
RemapInfo remapInfo = new RemapInfo(
        "external-node-ip",   // external IP (or hostname)
        7600,                 // external RowService port
        false                 // useSSL
);

HPCCFile file = new HPCCFile(
        "~myns::people",
        conn,
        "",           // no column projection
        "",           // no filter
        remapInfo,    // address remapping
        0,            // max partitions (0 = no limit)
        "thor"        // target cluster
);
```

---

## 5. Common Patterns and Best Practices

### 5.1 Connection Pooling

For concurrent or long-running applications, use `HPCCWsClientPool` to manage a pool of client instances:

```java
import org.hpccsystems.ws.client.HPCCWsClientPool;
import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.utils.Connection;

Connection conn = new Connection("http://my-hpcc-cluster:8010");
conn.setCredentials("myuser", "mypassword");

// Create a pool of reusable HPCCWsClient instances
HPCCWsClientPool pool = new HPCCWsClientPool(conn);

// Check out a client for use
HPCCWsClient client = pool.checkOut();
try {
    // Use client for operations
    client.getWsDFUClient().getFileDetails("~myns::people", "thor");
} finally {
    // Always return the client to the pool
    pool.checkIn(client);
}
```

### 5.2 Error Handling

HPCC4J methods throw three types of exceptions:

| Exception | Cause |
|-----------|-------|
| `java.lang.Exception` | General errors (network, configuration, unexpected) |
| `ArrayOfEspExceptionWrapper` | ESP service-level errors (e.g., file not found, auth failure) |
| `ArrayOfECLExceptionWrapper` | ECL compilation or execution errors |
| `EspSoapFaultWrapper` | Low-level SOAP fault from the ESP |

```java
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;

try {
    WorkunitWrapper wu = new WorkunitWrapper();
    wu.setEcl("OUTPUT(DATASET('nonexistent', {STRING x;}, FLAT));");
    wu.setCluster("thor");

    String results = wuClient.createAndRunWUFromECLAndGetResults(wu);

} catch (ArrayOfEspExceptionWrapper espEx) {
    // Handle ESP-level errors (e.g., authentication, service unavailable)
    for (EspExceptionWrapper ex : espEx.getExceptions()) {
        System.err.println("ESP Error [" + ex.getCode() + "]: " + ex.getMessage());
    }

} catch (ArrayOfECLExceptionWrapper eclEx) {
    // Handle ECL compilation or runtime errors
    for (ECLExceptionWrapper ex : eclEx.getExceptions()) {
        System.err.println("ECL Error [" + ex.getCode() + "] at line " +
                ex.getLine() + ": " + ex.getMessage());
    }

} catch (Exception e) {
    // Handle general errors
    System.err.println("Unexpected error: " + e.getMessage());
}
```

### 5.3 TLS / HTTPS Connections

For production HPCC Systems deployments using HTTPS:

```java
Connection conn = new Connection("https://my-hpcc-cluster:18010");
conn.setCredentials("myuser", "mypassword");

// For clusters with CA-signed certificates (recommended for production):
// No additional configuration needed

// For clusters with self-signed certificates (dev/test only):
conn.setAllowInvalidCerts(true);

// Configure connection timeouts (milliseconds)
conn.setConnectTimeoutMilli(30000);   // 30 seconds to establish connection
conn.setReadTimeoutMilli(120000);     // 2 minutes to read response
```

For dfsclient (DAFILESRV) with TLS:

```java
// HPCCFile will use SSL if DataPartition.useSSL is true
// This is determined by the server-side configuration and
// reflected in the file access info returned by WsDFU
HPCCFile file = new HPCCFile("~myns::people", conn);
// SSL is handled automatically based on cluster configuration
```

### 5.4 OpenTelemetry Tracing

HPCC4J includes built-in OpenTelemetry distributed tracing support. To enable traces across your application and HPCC operations:

```java
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.context.Scope;
import io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk;

// Initialize OpenTelemetry (configure your exporter via environment variables
// or system properties: OTEL_EXPORTER_OTLP_ENDPOINT, etc.)
AutoConfiguredOpenTelemetrySdk.initialize();

// Create a root span for your operation
Span span = GlobalOpenTelemetry.getTracer("my-app")
        .spanBuilder("process-hpcc-data")
        .startSpan();
try (Scope scope = span.makeCurrent()) {
    // All HPCC4J operations inside this scope will automatically
    // inherit the trace context and create child spans
    HPCCWsClient client = HPCCWsClient.get(conn);
    String results = client.getWsWorkunitsClient()
            .createAndRunWUFromECLAndGetResults(wu);
} finally {
    span.end();
}
```

---

## Summary: Which Client to Use?

| Task | Library | Client |
|------|---------|--------|
| Submit and run ECL on Thor | wsclient | `HPCCWsWorkUnitsClient` |
| Publish an ECL query to Roxie | wsclient | `HPCCWsWorkUnitsClient.publishWUFromEclWrapped()` |
| Call a Roxie query via SQL | wsclient | `HPCCWsSQLClient` |
| List or search HPCC files | wsclient | `HPCCWsDFUClient` |
| Upload a file via spray | wsclient | `HPCCFileSprayClient` |
| Download a file via despray | wsclient | `HPCCFileSprayClient` |
| Read raw HPCC file data (fast, parallel) | dfsclient | `HPCCFile` + `HpccRemoteFileReader` |
| Write raw HPCC file data (fast, parallel) | dfsclient | `HPCCWsDFUClient` (create) + `HPCCRemoteFileWriter` + `HPCCWsDFUClient` (publish) |
| Query cluster health / topology | wsclient | `HPCCWsSMCClient`, `HPCCWsTopologyClient` |
| Manage Roxie query packages | wsclient | `HPCCWsPackageProcessClient` |
| Store application config on HPCC | wsclient | `HPCCWsStoreClient` |
| Detect orphaned / lost files | wsclient | `HPCCWsDFUXRefClient` |
| Sign ECL code | wsclient | `HPCCWsCodeSignClient` |
| Discover services (Kubernetes) | wsclient | `HPCCWsResourcesClient`, `HPCCWsCloudClient` |

---

*For issues and feature requests, visit the [JIRA tracker](https://track.hpccsystems.com/browse/JAPI).*
*For Kubernetes setup details, see the [wiki](https://github.com/hpcc-systems/hpcc4j/wiki/Using-HPCC4J-with-HPCC-on-a-Kubernetes-Cluster).*

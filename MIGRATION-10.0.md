# Migration Guide: HPCC4J 10.0.0

## Overview

HPCC4J 10.0.0 removes support for HPCC Platform v7.0.0 (wsdfu v1_39 API). This document lists the removed functionality and provides migration paths for affected code.

## Breaking Changes

### Minimum HPCC Platform Version Requirement

- **Previous:** HPCC Platform v7.0.0+
- **Current:** HPCC Platform v7.0.x where x > 0 (effectively v7.0.2+)

Applications targeting HPCC Platform v7.0.0 must upgrade their HPCC Platform to a later version.

## Removed Methods and Migration Paths

### 1. `getFileAccessBlob(SecAccessType, String, String, int, String)` - REMOVED

**Previous signature:**
```java
public String getFileAccessBlob(
    org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SecAccessType accesstype,
    String filename,
    String clustername,
    int expiryseconds,
    String jobid
) throws Exception, ArrayOfEspExceptionWrapper
```

**Migration:**
Use the simplified method without the `SecAccessType` parameter:

```java
// Old code (no longer supported):
String blob = client.getFileAccessBlob(SecAccessType.Read, filename, cluster, 120, jobId);

// New code:
String blob = client.getFileAccessBlob(filename, cluster, 120, jobId);
```

**Explanation:**
HPCC Platform versions > 7.0.0 determine access type automatically based on the context. The explicit `SecAccessType` parameter was only needed for v7.0.0.

---

### 2. `getFileAccess(SecAccessType, String, String, int, String, boolean, boolean, boolean)` - REMOVED

**Previous signature:**
```java
public DFUFileAccessInfoWrapper getFileAccess(
    org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SecAccessType accesstype,
    String filename,
    String clustername,
    int expiryseconds,
    String jobid,
    boolean includejsonTypeInfo,
    boolean includebinTypeInfo,
    boolean requestfileinfo
) throws Exception, ArrayOfEspExceptionWrapper
```

**Migration:**
Use the simplified method without the `SecAccessType` and type info flags:

```java
// Old code (no longer supported):
DFUFileAccessInfoWrapper info = client.getFileAccess(
    SecAccessType.Read, filename, cluster, 120, jobId, true, false, true
);

// New code:
DFUFileAccessInfoWrapper info = client.getFileAccess(filename, cluster, 120, jobId);
```

**Explanation:**
The newer API version (DFUFileAccessV2) used in HPCC Platform > 7.0.0 returns file information in a standardized format. The binary type info option was deprecated and JSON type info is returned by default.

---

### 3. `createFile(String, String, String, String[], int)` - DEPRECATED

**Previous signature:**
```java
public DFUCreateFileWrapper createFile(
    String fileName,
    String cluster,
    String eclRecordDefinition,
    String[] partitionHostMap,  // Manual partition mapping
    int expirySeconds
) throws Exception, ArrayOfEspExceptionWrapper
```

**Status:** Method still exists but throws `UnsupportedOperationException`

**Migration:**
Use `createFileAndAcquireAccess()` without the partition host map:

```java
// Old code (no longer supported):
String[] partitionMap = new String[] {"node1", "node2", "node3"};
DFUCreateFileWrapper file = client.createFile(
    fileName, cluster, eclRecordDef, partitionMap, 3600
);

// New code:
DFUCreateFileWrapper file = client.createFileAndAcquireAccess(
    fileName, cluster, eclRecordDef, 
    3600,           // expirySeconds
    false,          // compressed
    null,           // type (null = default/Flat)
    null            // requestId (optional)
);
```

**Explanation:**
The partition host mapping feature was specific to HPCC Platform v7.0.0 and was removed in later versions. HPCC Platform versions > 7.0.0 handle file part placement automatically based on cluster topology.

---

### 4. `createFileAndAcquireAccess(String, String, String, String[], int, Boolean, Boolean, FileAccessRole, SecAccessType)` - REMOVED

**Previous signature:**
```java
public DFUCreateFileWrapper createFileAndAcquireAccess(
    String fileName,
    String cluster,
    String eclRecordDefinition,
    String[] partitionHostMap,
    int expirySeconds,
    Boolean returnBinTypeInfo,
    Boolean returnJsonTypeInfo,
    org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.FileAccessRole accessrole,
    org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SecAccessType accesstype
) throws Exception, ArrayOfEspExceptionWrapper
```

**Migration:**
Use the simplified `createFileAndAcquireAccess()` method:

```java
// Old code (no longer supported):
DFUCreateFileWrapper file = client.createFileAndAcquireAccess(
    fileName, cluster, eclRecordDef, partitionMap, 3600,
    false, true, FileAccessRole.External, SecAccessType.Write
);

// New code:
DFUCreateFileWrapper file = client.createFileAndAcquireAccess(
    fileName, cluster, eclRecordDef,
    3600,           // expirySeconds
    false,          // compressed
    null,           // type
    null            // requestId
);
```

**Explanation:**
- Partition mapping is no longer supported (automatic in newer HPCC versions)
- Access roles and types are determined automatically
- Type information format is standardized (JSON by default, binary deprecated)

---

## Removed Classes and Types

### Removed Enum Types

The following enum types from the v1_39 API have been removed:

- `org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SecAccessType`
- `org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.FileAccessRole`

**Migration:**
Remove all references to these types. The functionality is handled automatically in newer API versions.

### Removed Generated Classes

The entire `org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39` package has been removed (100+ classes). These were auto-generated from the v1_39 WSDL and are no longer needed.

### Removed Wrapper Class

- `org.hpccsystems.ws.client.wrappers.wsdfu.WsDFUClientStubWrapper` - Internal class removed

This was an internal implementation detail. Applications should not have been using this class directly.

---

## Code Examples

### Complete Example: File Creation and Access

**Before (v9.x with HPCC Platform v7.0.0 support):**
```java
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SecAccessType;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.FileAccessRole;

// Create file with manual partition mapping
String[] partitionMap = new String[] {"node1", "node2", "node3"};
DFUCreateFileWrapper file = dfuClient.createFileAndAcquireAccess(
    "myfile", "mythor", "RECORD\n  STRING field1;\nEND;",
    partitionMap, 3600,
    false, true, FileAccessRole.External, SecAccessType.Write
);

// Get file access
DFUFileAccessInfoWrapper access = dfuClient.getFileAccess(
    SecAccessType.Read, "myfile", "mythor", 3600, "job123",
    true, false, true
);
```

**After (v10.x with HPCC Platform > 7.0.0):**
```java
// No v1_39 imports needed

// Create file (automatic partition placement)
DFUCreateFileWrapper file = dfuClient.createFileAndAcquireAccess(
    "myfile", "mythor", "RECORD\n  STRING field1;\nEND;",
    3600,    // expirySeconds
    false,   // compressed
    null,    // type (default)
    null     // requestId
);

// Get file access (simplified)
DFUFileAccessInfoWrapper access = dfuClient.getFileAccess(
    "myfile", "mythor", 3600, "job123"
);
```

---

## Checking for Compatibility Issues

### Compile-Time Detection

Code using the removed methods will fail to compile with clear error messages:

```
error: cannot find symbol
  symbol:   variable SecAccessType
  location: class MyClass
```

or

```
error: method createFile in class HPCCWsDFUClient cannot be applied to given types
```

### Runtime Detection

If you have the deprecated `createFile(String, String, String, String[], int)` method in your code, it will throw:

```
java.lang.UnsupportedOperationException: createFile() with partitionHostMap parameter 
is no longer supported. This method required HPCC Platform v7.0.0 (wsdfu v1_39) which 
is no longer supported in HPCC4J 10.0.0+...
```

---

## Workarounds for HPCC Platform v7.0.0

If you must continue using HPCC Platform v7.0.0, you have two options:

### Option 1: Stay on HPCC4J 9.x (Recommended for v7.0.0)

Continue using HPCC4J 9.x releases, which maintain support for HPCC Platform v7.0.0:

```xml
<dependency>
    <groupId>org.hpccsystems</groupId>
    <artifactId>wsclient</artifactId>
    <version>9.14.x</version>
</dependency>
```

### Option 2: Upgrade HPCC Platform (Recommended)

Upgrade your HPCC Platform installation to v7.0.2 or later. Later versions include:
- Improved performance and stability
- Security updates
- Better automatic partition management
- Simplified API

---

## Summary of Required Changes

| Old Method | Status | New Method |
|------------|--------|------------|
| `getFileAccessBlob(SecAccessType, ...)` | Removed | `getFileAccessBlob(filename, cluster, expiry, jobId)` |
| `getFileAccess(SecAccessType, ...)` | Removed | `getFileAccess(filename, cluster, expiry, jobId)` |
| `createFile(..., String[] partitionMap, ...)` | Deprecated (throws exception) | `createFileAndAcquireAccess(...)` without partition map |
| `createFileAndAcquireAccess(..., partitionMap, ..., FileAccessRole, SecAccessType)` | Removed | `createFileAndAcquireAccess(..., compressed, type, requestId)` |

---

## Getting Help

If you encounter issues during migration:

1. Check this migration guide for common scenarios
2. Review the [wsclient README](wsclient/README.md)
3. See examples in the test code: `wsclient/src/test/java/org/hpccsystems/ws/client/`
4. Open an issue: https://github.com/hpcc-systems/hpcc4j/issues

---

## Additional Resources

- [HPCC4J Release Notes](https://github.com/hpcc-systems/hpcc4j/releases)
- [HPCC Platform Documentation](https://hpccsystems.com/training/documentation)
- [WsDFU API Reference](https://hpccsystems.com/ws_info/esp/files/stub/ws_dfu.wsdl)

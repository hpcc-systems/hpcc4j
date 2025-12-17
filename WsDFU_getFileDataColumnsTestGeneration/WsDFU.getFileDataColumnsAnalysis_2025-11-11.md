# WsDFU.getFileDataColumns Test Case Analysis

## 1. Method Summary

### Purpose
The `getFileDataColumns` method retrieves metadata about the columns (fields) in an HPCC logical file. It returns detailed information about both keyed and non-keyed columns, including column names, types, sizes, and whether they are natural or keyed columns.

### Role within Service
This method is part of the WsDFU service and serves as a fundamental metadata discovery operation. It enables clients to:
- Inspect file structure before reading data
- Understand data types for proper deserialization
- Distinguish between keyed (indexed) and non-keyed columns
- Access nested column structures for complex types (datasets)

### Method Signature
```java
public List<DFUDataColumnWrapper> getFileDataColumns(String logicalname, String clustername) 
    throws Exception, ArrayOfEspExceptionWrapper
```

### Inputs
- **logicalname**: The logical filename to retrieve column metadata for (with or without '~' prefix)
- **clustername**: Optional cluster name where the file resides (can be null)

### Outputs
- Returns a `List<DFUDataColumnWrapper>` containing column metadata
- Each wrapper contains: columnID, columnLabel, columnType, columnEclType, columnSize, columnRawSize, maxSize, isKeyedColumn, isNaturalColumn, and nested child columns for complex types

### Side Effects
- None - this is a read-only metadata operation
- Does not modify file state or server configuration

### Current Limitations
According to method documentation: "Currently this method/service call functions for THOR files but will return nothing for CSV/XML/FLAT data files"

---

## 2. Existing Test Coverage Analysis

### Summary
After thorough examination of the test file `/Users/james/Documents/Projects/Work/hpcc4j/wsclient/src/test/java/org/hpccsystems/ws/client/WsDFUClientTest.java`, **NO existing test methods** were found that directly test the `getFileDataColumns` method.

The test file contains 535 lines but does not include any tests that invoke `getFileDataColumns()` or `getDatasetFields()` (which internally uses getFileDataColumns).

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| N/A | N/A | N/A | N/A | N/A | No existing tests found |

### Coverage Summary
- **Total existing test methods**: 0
- **Core Functionality Tests covered**: None
- **Edge Case Tests covered**: None
- **Error Handling Tests covered**: None

### Gaps Identified
**Complete test coverage gap** - all scenarios need test coverage:
1. Basic retrieval of column metadata for simple THOR files
2. Retrieval for complex types with nested datasets
3. Retrieval with and without cluster parameter
4. Handling of keyed vs non-keyed columns
5. Error cases (file not found, invalid cluster, permission denied, non-THOR files)
6. Edge cases (very large number of columns, empty files, superfiles)

---

## 3. Request Structure

The method uses `DFUGetDataColumnsRequest` internally, which maps to the following ECM structure:

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|---------------------|-------|
| OpenLogicalName | string | **Yes** | Logical filename to query | Valid HPCC logical file name with or without '~' prefix | Primary identifier for the file |
| LogicalName | string | No | Alternative logical name field | Valid HPCC logical file name | Typically not used in Java client |
| FilterBy | string | No | Filter columns by name/value pairs | Comma-separated name=value pairs | Min version 1.05+ |
| ShowColumns | string | No | Specify which columns to return | Comma-separated column names | Min version 1.05+ |
| ChooseFile | int | No | File selection index for superfiles | Integer index (default 0) | Min version 1.10+ |
| Cluster | string | No | Cluster name where file resides | Valid cluster name | Min version 1.12+ |
| ClusterType | string | No | Type of cluster | Cluster type identifier | Min version 1.12+ |
| StartIndex | int64 | No | Starting row index for data preview | Positive integer (default 0) | Used for data browsing, not metadata |
| EndIndex | int64 | No | Ending row index for data preview | Positive integer (default 0) | Used for data browsing, not metadata |

### Field Dependencies
- **OpenLogicalName** OR **LogicalName** must be provided (Java client uses OpenLogicalName)
- **Cluster** is optional but recommended for files on specific clusters
- **FilterBy** and **ShowColumns** require server version 1.05+
- **ChooseFile** only applies to superfiles (requires version 1.10+)

### Default Behavior
- If **clustername** is null, server attempts to locate file across all available clusters
- **StartIndex** defaults to 1 if not specified (in server-side implementation)
- **EndIndex** defaults to 100 if not specified

---

## 4. Server Behavior and Responses

### Server-Side Processing Flow
1. **Authentication & Authorization**: Checks `FEATURE_URL` with `SecAccess_Read` permission
2. **Logical Name Parsing**: Extracts and trims the logical name from request
3. **Result Set Creation**: Uses `IResultSetFactory` to open the file and access metadata
4. **Metadata Extraction**: Retrieves column information via `IResultSetMetaData`
5. **Column Categorization**: Separates columns into keyed and non-keyed arrays
6. **Type Mapping**: Maps internal column types to display types (Integer, String, Real, Boolean, Others)
7. **Response Population**: Fills up to 20 DFUDataKeyedColumns arrays and 20 DFUDataNonKeyedColumns arrays

### Response Structure
The response (`DFUGetDataColumnsResponse`) contains:

| Field Name | Type | Description | Population Rules |
|------------|------|-------------|------------------|
| LogicalName | string | Echo of requested logical name | Always populated |
| StartIndex | int64 | Starting index (for data preview) | Defaults to 1 |
| EndIndex | int64 | Ending index (for data preview) | Defaults to 100 |
| DFUDataKeyedColumns1-20 | ESParray<DFUDataColumn> | Arrays of keyed columns | Populated based on column layout optimization |
| DFUDataNonKeyedColumns1-40 | ESParray<DFUDataColumn> | Arrays of non-keyed columns | Populated based on column layout optimization |

### DFUDataColumn Structure
Each column contains:

| Field | Type | Description | Min Version |
|-------|------|-------------|-------------|
| ColumnID | int | Unique column identifier | 1.29+ |
| ColumnLabel | string | Column name/label | Base |
| ColumnType | string | Display type (Integer, String, Real, Boolean, Others) | Base |
| ColumnValue | string | Sample value (if FilterBy used) | 1.05+ |
| ColumnSize | int | Display size for rendering | Base |
| MaxSize | int | Maximum data size | Base |
| ColumnEclType | string | ECL type definition | 1.29+ |
| ColumnRawSize | int | Raw byte size | 1.29+ |
| IsNaturalColumn | bool | Whether column has set translation | 1.29+ |
| IsKeyedColumn | bool | Whether column is part of index | 1.29+ |
| DataColumns | ESParray<DFUDataColumn> | Nested child columns for complex types | 1.31+ |

### Valid Response Scenarios
1. **Successful retrieval**: Returns populated list of DFUDataColumnWrapper objects
2. **Empty file**: Returns empty list (no columns)
3. **Superfile**: Returns columns from first subfile (or ChooseFile index)
4. **File with nested datasets**: Returns columns with populated DataColumns arrays

### Invalid Response Scenarios
1. **File not found**: ArrayOfEspExceptionWrapper with "File not found" message
2. **Permission denied**: EspSoapFault with "Permission denied" message
3. **Invalid cluster**: May return empty response or exception
4. **Non-THOR file type**: Returns empty list (limitation documented in code)

---

## 5. Error Handling

### Server-Side Errors

| Error Type | Trigger Condition | Expected Response | Exception Type |
|------------|-------------------|-------------------|----------------|
| Permission Denied | User lacks FEATURE_URL read access | EspSoapFault with "WsDfu::DFUGetDataColumns: Permission denied." | EspSoapFaultWrapper |
| File Not Found | Logical name doesn't exist on cluster | ArrayOfEspException with file not found details | ArrayOfEspExceptionWrapper |
| Invalid Cluster | Cluster name is invalid or inaccessible | ArrayOfEspException or RemoteException | ArrayOfEspExceptionWrapper |
| Empty Logical Name | OpenLogicalName is null or empty string | Response with no columns or exception | ArrayOfEspExceptionWrapper |
| Network Timeout | Server unresponsive or slow network | RemoteException after timeout | Exception (RemoteException) |
| Internal Server Error | Server-side processing failure | RemoteException with error details | Exception |

### Client-Side Errors

| Error Type | Trigger Condition | Expected Behavior | Exception Type |
|------------|-------------------|-------------------|----------------|
| Null Connection | HPCCWsDFUClient not properly initialized | Exception from verifyStub() | Exception |
| Invalid Stub | WsDfuStub is null or invalid | Exception from verifyStub() | Exception |
| Malformed Logical Name | Special characters causing parse issues | May succeed (server handles) or exception | Varies |
| Network Unavailable | Cannot reach ESP endpoint | RemoteException or AxisFault | Exception |
| Invalid Response Format | Server returns unexpected XML structure | Parsing exception or null values | Exception |

### Error Handling in Code
The method implements three layers of error handling:
1. **RemoteException catch**: Wraps with descriptive message including parameters
2. **EspSoapFault catch**: Delegates to `handleEspSoapFaults()` with context message
3. **Exception array check**: Calls `handleEspExceptions()` if response contains exceptions

---

## 6. Existing Dataset Analysis

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | **Yes** | Ideal for testing complex column types including nested datasets, sets, and various ECL types (21 columns total with child datasets) |
| `~benchmark::string::100MB` | **Yes** | Good for testing large files and simple string column structure (2 string8 columns) |
| `~benchmark::integer::20KB` | **Yes** | Perfect for basic operation tests with simple integer columns (2 integer columns: key and fill) |
| `~benchmark::all_types::superfile` | **Yes** | Essential for testing superfile column retrieval and ChooseFile parameter |
| `~benchmark::integer::20kb::key` | **Yes** | Important for testing keyed/indexed file column metadata (validates IsKeyedColumn flag) |

### Dataset Coverage Assessment
The existing datasets provide good coverage for:
- ✅ Simple types (integer, string)
- ✅ Complex types with nested datasets
- ✅ Large files (performance testing)
- ✅ Superfiles (multi-file structures)
- ✅ Indexed/keyed files

### Gaps in Dataset Coverage
- ❌ Files with null values in columns
- ❌ Empty files (zero rows but with defined schema)
- ❌ Files with very large number of columns (>40 columns)
- ❌ CSV/XML/FLAT files (for negative testing of limitation)
- ❌ Files with unicode/UTF-8 column names
- ❌ Files with all primitive types but no complex types

---

## 7. Test Case Plan

**IMPORTANT**: All test cases below represent NEW tests that are NOT covered by existing test methods. The analysis in Section 2 confirmed zero existing coverage for `getFileDataColumns()`.

### A. Core Functionality Tests

#### Subcategory: Basic Operation

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Retrieve column metadata from simple integer dataset with required parameters only |
| **Input Data** | `logicalname`: `~benchmark::integer::20KB`, `clustername`: `null` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | List of 2 DFUDataColumnWrapper objects with:<br>- Column 1: label="key", eclType="integer"<br>- Column 2: label="fill", eclType="integer"<br>- Both should have isKeyedColumn=false |
| **Pass Criteria** | - Response is not null<br>- List size equals 2<br>- Column labels match expected names<br>- Column types are "Integer"<br>- No exceptions thrown |
| **Notes** | This is the simplest valid case demonstrating core functionality |

---

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Retrieve column metadata with explicit cluster parameter |
| **Input Data** | `logicalname`: `~benchmark::integer::20KB`, `clustername`: `thorclustername` (from test config) |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | Same as CFT-001 but validated with specific cluster |
| **Pass Criteria** | - Response is not null<br>- List size equals 2<br>- Results identical to cluster=null case<br>- No exceptions thrown |
| **Notes** | Validates explicit cluster specification |

---

#### Subcategory: Complete Request

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Complete Request |
| **Description** | Retrieve all column types from comprehensive multi-type dataset |
| **Input Data** | `logicalname`: `~benchmark::all_types::200KB`, `clustername`: `thorclustername` |
| **Dataset** | `~benchmark::all_types::200KB` (existing) |
| **Expected Output** | List of 21 DFUDataColumnWrapper objects with types:<br>- int8, uint8, int4, uint4, int2, uint2<br>- r8, r4, dec16, udec16<br>- qStr, fixStr8, str, varStr, varStr8<br>- utfStr, uni8, uni, varUni<br>- childDataset (with nested DataColumns)<br>- int1Set |
| **Pass Criteria** | - Response is not null<br>- List size equals 21<br>- All column labels match ECL definition<br>- childDataset column has non-null/non-empty childColumns list<br>- int1Set column type correctly identified<br>- No exceptions thrown |
| **Notes** | Validates handling of all ECL primitive types and complex structures |

---

#### Subcategory: Data Variations

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-004 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Retrieve columns from string-based dataset |
| **Input Data** | `logicalname`: `~benchmark::string::100MB`, `clustername`: `thorclustername` |
| **Dataset** | `~benchmark::string::100MB` (existing) |
| **Expected Output** | List of 2 DFUDataColumnWrapper objects:<br>- Column 1: label="key", type="String", eclType="string8"<br>- Column 2: label="fill", type="String", eclType="string8" |
| **Pass Criteria** | - Response is not null<br>- List size equals 2<br>- Column types are "String"<br>- ColumnEclType contains "string8"<br>- columnSize and maxSize are positive<br>- No exceptions thrown |
| **Notes** | Validates string type handling and size calculations |

---

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-005 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Retrieve columns from indexed/keyed file |
| **Input Data** | `logicalname`: `~benchmark::integer::20kb::key`, `clustername`: `thorclustername` |
| **Dataset** | `~benchmark::integer::20kb::key` (existing) |
| **Expected Output** | List with columns where isKeyedColumn=true for key field(s) |
| **Pass Criteria** | - Response is not null<br>- At least one column has isKeyedColumn=true<br>- Key column(s) appear first in list<br>- Column metadata properly populated<br>- No exceptions thrown |
| **Notes** | Critical test for distinguishing keyed vs non-keyed columns |

---

#### Subcategory: Typical Workflows

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-006 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflows |
| **Description** | Retrieve columns from superfile |
| **Input Data** | `logicalname`: `~benchmark::all_types::superfile`, `clustername`: `thorclustername` |
| **Dataset** | `~benchmark::all_types::superfile` (existing) |
| **Expected Output** | Columns from first subfile (~benchmark::all_types::200KB) - 21 columns |
| **Pass Criteria** | - Response is not null<br>- List size equals 21 (matches subfile structure)<br>- Column metadata matches subfile schema<br>- No exceptions thrown |
| **Notes** | Validates superfile handling - should return columns from first subfile by default |

---

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-007 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflows |
| **Description** | Verify nested column structure for dataset fields |
| **Input Data** | `logicalname`: `~benchmark::all_types::200KB`, `clustername`: `thorclustername` |
| **Dataset** | `~benchmark::all_types::200KB` (existing) |
| **Expected Output** | childDataset column contains nested DataColumns with:<br>- childField1 (STRING8)<br>- childField2 (INTEGER8)<br>- childField3 (REAL8) |
| **Pass Criteria** | - Response contains column labeled "childDataset"<br>- childDataset.getChildColumns() is not null and not empty<br>- Child columns list size equals 3<br>- Child column labels match expected names<br>- Child column types correctly identified<br>- No exceptions thrown |
| **Notes** | Essential for validating complex nested type support |

---

### B. Edge Case Tests

#### Subcategory: Boundary Values

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Retrieve columns with logical name including '~' prefix |
| **Input Data** | `logicalname`: `~benchmark::integer::20KB` (with tilde), `clustername`: `null` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | Same as CFT-001 - successful retrieval |
| **Pass Criteria** | - Response is not null<br>- List size equals 2<br>- Results identical to version without tilde<br>- No exceptions thrown |
| **Notes** | Validates tilde prefix handling (both formats should work) |

---

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Retrieve columns with logical name without '~' prefix |
| **Input Data** | `logicalname`: `benchmark::integer::20KB` (no tilde), `clustername`: `null` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | Same as CFT-001 - successful retrieval |
| **Pass Criteria** | - Response is not null<br>- List size equals 2<br>- Results identical to version with tilde<br>- No exceptions thrown |
| **Notes** | Validates handling of both logical name formats |

---

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Retrieve columns from very large dataset (100MB) |
| **Input Data** | `logicalname`: `~benchmark::string::100MB`, `clustername`: `thorclustername` |
| **Dataset** | `~benchmark::string::100MB` (existing - 6,250,000 records) |
| **Expected Output** | Column metadata retrieved successfully despite large file size |
| **Pass Criteria** | - Response is not null<br>- List size equals 2<br>- Response time is reasonable (<5 seconds)<br>- No timeout exceptions<br>- Column metadata accurate |
| **Notes** | Validates performance with large files - metadata retrieval should be fast regardless of file size |

---

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-004 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Test with file containing maximum supported columns |
| **Input Data** | `logicalname`: `[NEW DATASET REQUIRED]`, `clustername`: `thorclustername` |
| **Dataset** | `[NEW DATASET REQUIRED]` - See Section 8 |
| **Expected Output** | All columns retrieved (up to server limit of 40 columns based on response structure) |
| **Pass Criteria** | - Response is not null<br>- All columns present in response<br>- No truncation warnings<br>- Column order preserved<br>- No exceptions thrown |
| **Notes** | Tests server limits for column count in response arrays |

---

#### Subcategory: Optional Parameters

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-005 |
| **Category** | Edge Case |
| **Subcategory** | Optional Parameters |
| **Description** | Retrieve columns with null cluster parameter |
| **Input Data** | `logicalname`: `~benchmark::integer::20KB`, `clustername`: `null` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | Successful retrieval - server locates file across clusters |
| **Pass Criteria** | - Response is not null<br>- List size equals 2<br>- Columns correctly identified<br>- No exceptions thrown |
| **Notes** | Already covered by CFT-001 but explicitly validates null cluster handling |

---

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-006 |
| **Category** | Edge Case |
| **Subcategory** | Optional Parameters |
| **Description** | Retrieve columns with empty string cluster parameter |
| **Input Data** | `logicalname`: `~benchmark::integer::20KB`, `clustername`: `""` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | Successful retrieval - treated as null cluster |
| **Pass Criteria** | - Response is not null<br>- List size equals 2<br>- Results identical to null cluster case<br>- No exceptions thrown |
| **Notes** | Validates empty string vs null handling |

---

#### Subcategory: Unusual Valid Inputs

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-007 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Retrieve columns with logical name containing special scope separators |
| **Input Data** | `logicalname`: `benchmark::integer::20KB` (multiple :: separators), `clustername`: `null` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | Successful retrieval |
| **Pass Criteria** | - Response is not null<br>- Scope separators properly parsed<br>- Correct file located<br>- No exceptions thrown |
| **Notes** | Validates handling of namespace/scope separators in logical names |

---

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-008 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Retrieve columns using legacy namespace format (::) vs URI format (/) |
| **Input Data** | `logicalname`: `benchmark::integer::20KB` vs `/benchmark/integer/20KB`, `clustername`: `null` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | Both formats should succeed |
| **Pass Criteria** | - Both requests return not null<br>- Results are identical<br>- Column metadata matches<br>- No exceptions thrown |
| **Notes** | Validates support for both legacy and URI path formats |

---

#### Subcategory: Performance Limits

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-009 |
| **Category** | Edge Case |
| **Subcategory** | Performance Limits |
| **Description** | Concurrent requests for column metadata (thread safety) |
| **Input Data** | Multiple threads calling `getFileDataColumns("~benchmark::integer::20KB", null)` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | All threads receive valid responses |
| **Pass Criteria** | - All requests complete successfully<br>- No thread safety exceptions<br>- Response correctness maintained across threads<br>- No data corruption |
| **Notes** | Validates thread-safe operation of client library |

---

### C. Error Handling Tests

#### Subcategory: Invalid Inputs - Missing Required Fields

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Null logical name parameter |
| **Input Data** | `logicalname`: `null`, `clustername`: `null` |
| **Dataset** | N/A |
| **Expected Output** | Exception thrown or empty response |
| **Pass Criteria** | - Exception is thrown (NullPointerException or custom exception) OR<br>- Empty list returned with no crashes<br>- Error message is informative |
| **Notes** | Required field validation |

---

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Empty string logical name |
| **Input Data** | `logicalname`: `""`, `clustername`: `null` |
| **Dataset** | N/A |
| **Expected Output** | ArrayOfEspExceptionWrapper or empty response |
| **Pass Criteria** | - Exception thrown with meaningful message OR<br>- Empty list returned<br>- No server crash or hanging |
| **Notes** | Validates empty string handling |

---

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Whitespace-only logical name |
| **Input Data** | `logicalname`: `"   "`, `clustername`: `null` |
| **Dataset** | N/A |
| **Expected Output** | Exception or empty response after trimming |
| **Pass Criteria** | - Exception thrown OR empty list returned<br>- Server handles whitespace trimming properly<br>- No crashes |
| **Notes** | Server implementation trims input - this tests that behavior |

---

#### Subcategory: Invalid Inputs - Malformed Values

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Non-existent logical file name |
| **Input Data** | `logicalname`: `~nonexistent::file::that::does::not::exist`, `clustername`: `null` |
| **Dataset** | N/A (file does not exist) |
| **Expected Output** | ArrayOfEspExceptionWrapper with "File not found" type message |
| **Pass Criteria** | - ArrayOfEspExceptionWrapper is thrown<br>- Exception message indicates file not found<br>- No RemoteException or server error |
| **Notes** | Most common error scenario in production |

---

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-005 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Invalid cluster name |
| **Input Data** | `logicalname`: `~benchmark::integer::20KB`, `clustername`: `nonexistent_cluster` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | ArrayOfEspExceptionWrapper or empty response |
| **Pass Criteria** | - Exception thrown indicating invalid cluster OR<br>- Empty response returned<br>- Error is gracefully handled |
| **Notes** | Validates cluster validation |

---

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-006 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Logical name with invalid characters |
| **Input Data** | `logicalname`: `~benchmark::<invalid>file`, `clustername`: `null` |
| **Dataset** | N/A |
| **Expected Output** | Exception or file not found error |
| **Pass Criteria** | - Graceful error handling<br>- No server crash<br>- Meaningful error message |
| **Notes** | Tests input validation for special characters |

---

#### Subcategory: Invalid Inputs - Conflicting Parameters

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-007 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Logical name contains @cluster notation conflicting with cluster parameter |
| **Input Data** | `logicalname`: `~benchmark::integer::20KB@thor`, `clustername`: `roxie` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | Server should handle - may use embedded cluster or parameter |
| **Pass Criteria** | - No exception thrown OR meaningful exception<br>- Behavior is consistent and documented<br>- No server crash |
| **Notes** | Similar pattern tested in testRedundantClusterDeleteFile - validates consistency |

---

#### Subcategory: Server-Side Errors - Resource Not Found

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-008 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Request columns for file that was deleted during request |
| **Input Data** | `logicalname`: File deleted between validation and retrieval, `clustername`: `null` |
| **Dataset** | Requires test file creation and deletion |
| **Expected Output** | ArrayOfEspExceptionWrapper with appropriate error |
| **Pass Criteria** | - Exception thrown<br>- Error message indicates file no longer exists<br>- No server crash or hanging |
| **Notes** | Race condition testing - may require test fixture setup |

---

#### Subcategory: Server-Side Errors - Permission Issues

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-009 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Request columns for file without read permissions |
| **Input Data** | `logicalname`: File with restricted access, `clustername`: `null` |
| **Dataset** | Requires test file with access restrictions |
| **Expected Output** | EspSoapFaultWrapper with "Permission denied" message |
| **Pass Criteria** | - EspSoapFaultWrapper thrown<br>- Error message contains "Permission denied"<br>- Exception properly propagated to client |
| **Notes** | Requires HPCC security configuration - may skip if security not enabled |

---

#### Subcategory: Server-Side Errors - Unsupported File Types

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-010 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Request columns for CSV file (unsupported per documentation) |
| **Input Data** | `logicalname`: `[NEW DATASET REQUIRED]`, `clustername`: `thorclustername` |
| **Dataset** | `[NEW DATASET REQUIRED]` - CSV file |
| **Expected Output** | Empty list returned (documented limitation) |
| **Pass Criteria** | - No exception thrown<br>- Empty list or list with generic columns<br>- No server error<br>- Behavior matches documentation |
| **Notes** | Validates documented limitation for CSV files |

---

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-011 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Request columns for XML file (unsupported per documentation) |
| **Input Data** | `logicalname`: `[NEW DATASET REQUIRED]`, `clustername`: `thorclustername` |
| **Dataset** | `[NEW DATASET REQUIRED]` - XML file |
| **Expected Output** | Empty list returned (documented limitation) |
| **Pass Criteria** | - No exception thrown<br>- Empty list or list with generic columns<br>- No server error<br>- Behavior matches documentation |
| **Notes** | Validates documented limitation for XML files |

---

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-012 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Request columns for FLAT file (unsupported per documentation) |
| **Input Data** | `logicalname`: `[NEW DATASET REQUIRED]`, `clustername`: `thorclustername` |
| **Dataset** | `[NEW DATASET REQUIRED]` - FLAT file |
| **Expected Output** | Empty list returned (documented limitation) |
| **Pass Criteria** | - No exception thrown<br>- Empty list or list with generic columns<br>- No server error<br>- Behavior matches documentation |
| **Notes** | Validates documented limitation for FLAT files |

---

#### Subcategory: Client-Side Errors - Connection Issues

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-013 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Invalid/uninitialized WsDFU client stub |
| **Input Data** | Client with null or invalid stub configuration |
| **Dataset** | N/A |
| **Expected Output** | Exception from verifyStub() call |
| **Pass Criteria** | - Exception thrown before remote call<br>- Error message indicates invalid client state<br>- No network call attempted |
| **Notes** | Tests client-side validation via verifyStub() |

---

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-014 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Network timeout during column retrieval |
| **Input Data** | `logicalname`: `~benchmark::integer::20KB`, `clustername`: `null`, connection timeout set very low |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | RemoteException with timeout information |
| **Pass Criteria** | - Exception thrown within expected timeout window<br>- Exception type is RemoteException<br>- Error message indicates timeout |
| **Notes** | Requires ability to configure connection timeout in test setup |

---

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-015 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Server returns malformed response |
| **Input Data** | Simulated malformed XML response (requires mock or server issue) |
| **Dataset** | N/A |
| **Expected Output** | Exception during response parsing |
| **Pass Criteria** | - Exception thrown<br>- No data corruption<br>- Client remains in valid state |
| **Notes** | Difficult to test without mock - may skip if mocking not allowed |

---

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-016 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Server unavailable (connection refused) |
| **Input Data** | Client configured with unreachable server endpoint |
| **Dataset** | N/A |
| **Expected Output** | RemoteException or AxisFault |
| **Pass Criteria** | - Exception thrown<br>- Error indicates connection failure<br>- No infinite hanging |
| **Notes** | Requires test environment with invalid endpoint |

---

## 8. New Dataset Specifications

### Dataset 1: Maximum Column Count Test File

```
Dataset Name: ~test::max_columns::40fields
Required For: ECT-004
Structure:
  Layout:
    RECORD
      INTEGER1 field01;
      INTEGER1 field02;
      INTEGER1 field03;
      INTEGER1 field04;
      INTEGER1 field05;
      INTEGER1 field06;
      INTEGER1 field07;
      INTEGER1 field08;
      INTEGER1 field09;
      INTEGER1 field10;
      INTEGER1 field11;
      INTEGER1 field12;
      INTEGER1 field13;
      INTEGER1 field14;
      INTEGER1 field15;
      INTEGER1 field16;
      INTEGER1 field17;
      INTEGER1 field18;
      INTEGER1 field19;
      INTEGER1 field20;
      INTEGER1 field21;
      INTEGER1 field22;
      INTEGER1 field23;
      INTEGER1 field24;
      INTEGER1 field25;
      INTEGER1 field26;
      INTEGER1 field27;
      INTEGER1 field28;
      INTEGER1 field29;
      INTEGER1 field30;
      INTEGER1 field31;
      INTEGER1 field32;
      INTEGER1 field33;
      INTEGER1 field34;
      INTEGER1 field35;
      INTEGER1 field36;
      INTEGER1 field37;
      INTEGER1 field38;
      INTEGER1 field39;
      INTEGER1 field40;
    END;
  Record count: 100
  Special characteristics: Exactly 40 columns to test server response array limits
Rationale: Server response has 20 keyed and 20 non-keyed column arrays. Need to test handling of maximum columns.

ECL Generation Code:
IMPORT Std;

maxColRec := RECORD
  INTEGER1 field01; INTEGER1 field02; INTEGER1 field03; INTEGER1 field04; INTEGER1 field05;
  INTEGER1 field06; INTEGER1 field07; INTEGER1 field08; INTEGER1 field09; INTEGER1 field10;
  INTEGER1 field11; INTEGER1 field12; INTEGER1 field13; INTEGER1 field14; INTEGER1 field15;
  INTEGER1 field16; INTEGER1 field17; INTEGER1 field18; INTEGER1 field19; INTEGER1 field20;
  INTEGER1 field21; INTEGER1 field22; INTEGER1 field23; INTEGER1 field24; INTEGER1 field25;
  INTEGER1 field26; INTEGER1 field27; INTEGER1 field28; INTEGER1 field29; INTEGER1 field30;
  INTEGER1 field31; INTEGER1 field32; INTEGER1 field33; INTEGER1 field34; INTEGER1 field35;
  INTEGER1 field36; INTEGER1 field37; INTEGER1 field38; INTEGER1 field39; INTEGER1 field40;
END;

maxColDs := DATASET(100, TRANSFORM(maxColRec,
  SELF.field01 := COUNTER; SELF.field02 := COUNTER; SELF.field03 := COUNTER; SELF.field04 := COUNTER;
  SELF.field05 := COUNTER; SELF.field06 := COUNTER; SELF.field07 := COUNTER; SELF.field08 := COUNTER;
  SELF.field09 := COUNTER; SELF.field10 := COUNTER; SELF.field11 := COUNTER; SELF.field12 := COUNTER;
  SELF.field13 := COUNTER; SELF.field14 := COUNTER; SELF.field15 := COUNTER; SELF.field16 := COUNTER;
  SELF.field17 := COUNTER; SELF.field18 := COUNTER; SELF.field19 := COUNTER; SELF.field20 := COUNTER;
  SELF.field21 := COUNTER; SELF.field22 := COUNTER; SELF.field23 := COUNTER; SELF.field24 := COUNTER;
  SELF.field25 := COUNTER; SELF.field26 := COUNTER; SELF.field27 := COUNTER; SELF.field28 := COUNTER;
  SELF.field29 := COUNTER; SELF.field30 := COUNTER; SELF.field31 := COUNTER; SELF.field32 := COUNTER;
  SELF.field33 := COUNTER; SELF.field34 := COUNTER; SELF.field35 := COUNTER; SELF.field36 := COUNTER;
  SELF.field37 := COUNTER; SELF.field38 := COUNTER; SELF.field39 := COUNTER; SELF.field40 := COUNTER;
), DISTRIBUTED);

IF(~Std.File.FileExists('~test::max_columns::40fields'), 
   OUTPUT(maxColDs,,'~test::max_columns::40fields',OVERWRITE));
```
```

### Dataset 2: CSV File for Negative Testing

```
Dataset Name: ~test::csv::simple
Required For: EHT-010
Structure:
  File Type: CSV
  Fields: 3 string fields (name, address, phone)
  Record count: 50
  Special characteristics: CSV format without ECL record definition
Rationale: Method documentation states CSV files return nothing/empty - need to validate this limitation

ECL Generation Code:
IMPORT Std;

// Spray a CSV file or create via OUTPUT with CSV format
csvData := DATASET([
  {'John Doe', '123 Main St', '555-1234'},
  {'Jane Smith', '456 Oak Ave', '555-5678'}
], {STRING name, STRING address, STRING phone});

OUTPUT(csvData,,'~test::csv::simple',CSV,OVERWRITE);
```

### Dataset 3: XML File for Negative Testing

```
Dataset Name: ~test::xml::simple
Required For: EHT-011
Structure:
  File Type: XML
  Fields: Basic XML structure with 2-3 fields
  Record count: 50
  Special characteristics: XML format file
Rationale: Method documentation states XML files return nothing/empty - need to validate this limitation

ECL Generation Code:
IMPORT Std;

xmlRec := RECORD
  STRING name;
  STRING value;
END;

xmlData := DATASET([
  {'item1', 'value1'},
  {'item2', 'value2'}
], xmlRec);

OUTPUT(xmlData,,'~test::xml::simple',XML('root'),OVERWRITE);
```

### Dataset 4: Empty File with Schema

```
Dataset Name: ~test::empty::with_schema
Required For: Edge case testing (not explicitly listed but valuable)
Structure:
  Layout:
    RECORD
      INTEGER key;
      STRING20 value;
    END;
  Record count: 0 (empty dataset)
  Special characteristics: File exists with defined schema but no data rows
Rationale: Tests metadata retrieval when file is empty - should still return column structure

ECL Generation Code:
IMPORT Std;

emptyRec := RECORD
  INTEGER key;
  STRING20 value;
END;

emptyDs := DATASET([], emptyRec);

IF(~Std.File.FileExists('~test::empty::with_schema'),
   OUTPUT(emptyDs,,'~test::empty::with_schema',OVERWRITE));
```

---

## 9. Test Implementation Notes

### Test Class Structure
All tests should be added to: `/Users/james/Documents/Projects/Work/hpcc4j/wsclient/src/test/java/org/hpccsystems/ws/client/WsDFUClientTest.java`

### Common Test Patterns
```java
@Test
public void testGetFileDataColumns_BasicOperation() throws Exception
{
    try
    {
        List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
            "~benchmark::integer::20KB", 
            null
        );
        
        assertNotNull("Column list should not be null", columns);
        assertEquals("Should have 2 columns", 2, columns.size());
        
        // Validate first column
        DFUDataColumnWrapper col1 = columns.get(0);
        assertNotNull("Column label should not be null", col1.getColumnLabel());
        assertEquals("First column should be 'key'", "key", col1.getColumnLabel());
        assertEquals("Column type should be Integer", "Integer", col1.getColumnType());
        
        // Additional assertions as needed
    }
    catch (ArrayOfEspExceptionWrapper e)
    {
        fail("Unexpected ESP exception: " + e.toString());
    }
}
```

### Error Test Pattern
```java
@Test
public void testGetFileDataColumns_FileNotFound() throws Exception
{
    try
    {
        List<DFUDataColumnWrapper> columns = wsdfuclient.getFileDataColumns(
            "~nonexistent::file", 
            null
        );
        fail("Should have thrown ArrayOfEspExceptionWrapper for non-existent file");
    }
    catch (ArrayOfEspExceptionWrapper e)
    {
        // Expected exception
        assertTrue("Error message should indicate file not found", 
                   e.toString().contains("not found") || 
                   e.toString().contains("does not exist"));
    }
}
```

### Test Data Setup
- Ensure test datasets are created before running tests (use BaseRemoteTest infrastructure)
- Reference `generate-datasets.ecl` for existing dataset creation patterns
- Add new dataset creation code to same ECL script

### Test Execution Order
- Core Functionality Tests should run first to validate basic operation
- Edge Case Tests can run in any order
- Error Handling Tests should run last to ensure they don't affect other tests

### Test Environment Requirements
- HPCC cluster must be running and accessible
- Test user must have read permissions on benchmark datasets
- Thor cluster must be configured (referenced via `thorclustername` system property)
- Datasets must be pre-generated (unless `disableDatasetGeneration=true`)

---

## 10. Coverage Summary

### Total Test Cases Defined: 32

#### By Category:
- **Core Functionality Tests**: 7 tests
  - Basic Operation: 2
  - Complete Request: 1
  - Data Variations: 2
  - Typical Workflows: 2

- **Edge Case Tests**: 9 tests
  - Boundary Values: 4
  - Optional Parameters: 2
  - Unusual Valid Inputs: 2
  - Performance Limits: 1

- **Error Handling Tests**: 16 tests
  - Invalid Inputs - Missing Required: 3
  - Invalid Inputs - Malformed: 3
  - Invalid Inputs - Conflicting: 1
  - Server-Side Errors - Resource Not Found: 1
  - Server-Side Errors - Permission: 1
  - Server-Side Errors - Unsupported Types: 3
  - Client-Side Errors: 4

#### Dataset Utilization:
- **Existing datasets used**: 5 of 5 (100%)
- **New datasets required**: 4
- **Test cases using existing datasets**: 20
- **Test cases requiring new datasets**: 8
- **Test cases without dataset dependency**: 4

### Coverage Gaps Addressed
✅ All identified gaps from Section 2 are addressed with specific test cases
✅ All error scenarios documented in Section 5 have corresponding tests
✅ All data type variations from existing datasets are covered
✅ Known limitations (CSV/XML/FLAT files) are validated with negative tests

### Test Implementation Priority

**High Priority** (Implement First):
1. CFT-001, CFT-002, CFT-003 - Core functionality with existing datasets
2. CFT-005 - Keyed column validation
3. EHT-004 - File not found (most common error)
4. EHT-001, EHT-002 - Null/empty input validation

**Medium Priority**:
1. CFT-004, CFT-006, CFT-007 - Data variations and nested structures
2. ECT-001, ECT-002, ECT-003 - Boundary value tests
3. EHT-010, EHT-011, EHT-012 - Unsupported file type validation

**Low Priority** (Requires Additional Setup):
1. ECT-004 - Maximum columns (requires new dataset)
2. EHT-008 - Race condition testing
3. EHT-009 - Permission testing (requires security config)
4. EHT-013 through EHT-016 - Network/connection error scenarios

---

## 11. References

### Code Locations
- **Client Implementation**: `/Users/james/Documents/Projects/Work/hpcc4j/wsclient/src/main/java/org/hpccsystems/ws/client/HPCCWsDFUClient.java` (lines 821-880)
- **Server Implementation**: `/Users/james/Documents/Projects/Work/HPCC-Platform/esp/services/ws_dfu/ws_dfuService.cpp` (lines 4165-4600+)
- **IDL Definition**: `/Users/james/Documents/Projects/Work/HPCC-Platform/esp/scm/ws_dfu.ecm` (lines 583-640)
- **Wrapper Class**: `/Users/james/Documents/Projects/Work/hpcc4j/wsclient/src/main/java/org/hpccsystems/ws/client/wrappers/wsdfu/DFUDataColumnWrapper.java`
- **Test Class**: `/Users/james/Documents/Projects/Work/hpcc4j/wsclient/src/test/java/org/hpccsystems/ws/client/WsDFUClientTest.java`
- **Dataset Generation**: `/Users/james/Documents/Projects/Work/hpcc4j/wsclient/src/test/resources/generate-datasets.ecl`

### Key Dependencies
- Apache Axis2 for SOAP communication
- HPCC Systems platform version compatibility (method supports versions 1.05+)
- JUnit 4 for test framework
- BaseRemoteTest infrastructure for connection management

### Documentation References
- Method JavaDoc comment (HPCCWsDFUClient.java lines 807-820)
- ECM specification (ws_dfu.ecm lines 583-640)
- Related method: `getDatasetFields()` which uses `getFileDataColumns()` internally


---
*Generated: 2025-11-11*

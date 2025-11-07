# WsDFU.getFileDataColumns Test Case Analysis

## 1. Method Summary

### Purpose
The `getFileDataColumns` method retrieves metadata information about the columns/fields of a logical file (dataset) stored in an HPCC cluster. This method is specifically designed to work with THOR files and returns detailed column information including column names, types, sizes, and whether columns are keyed or non-keyed.

### Overview
This method serves as a metadata discovery mechanism within the WsDFU service, allowing clients to inspect the structure of datasets without reading the actual data. It's particularly useful for:
- Schema discovery and validation
- Dataset exploration and documentation
- Building dynamic data processing workflows
- Validating file structures before data access operations

### Inputs
- **logicalname** (String, required): The logical filename to retrieve column information for. Must be a valid THOR file. CSV/XML/FLAT files will return no column data.
- **clustername** (String, optional): The cluster name where the logical file resides. If not provided, the system will attempt to locate the file across available clusters.

### Outputs
- **Return Type**: `List<DFUDataColumnWrapper>` - A list of data column wrapper objects containing metadata for each column in the dataset.
- **Column Information Includes**:
  - Column ID, label (name), type, ECL type
  - Column size, raw size, max size
  - Whether the column is keyed or non-keyed
  - Whether the column is a natural column
  - Nested child columns for complex types (datasets)

### Side Effects
- No data modification occurs
- Requires read access to the DFU service (feature: "DfuAccess:READ")
- Establishes a connection to the HPCC cluster
- May throw exceptions if file doesn't exist, access is denied, or connection fails

---

## 2. Existing Test Coverage Analysis

After reviewing the `WsDFUClientTest.java` file, **NO existing test methods were found** that specifically test the `getFileDataColumns` method.

### Test Coverage Summary

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| N/A | N/A | N/A | N/A | N/A | No tests exist for this method |

### Coverage Summary
- **Total existing test methods**: 0
- **Core Functionality Tests covered**: None
- **Edge Case Tests covered**: None  
- **Error Handling Tests covered**: None
- **Gaps identified**: Complete lack of test coverage for `getFileDataColumns` method. All test scenarios outlined in Section 7 are required.

**Note**: While the test file contains tests for other WsDFU methods like `getFileInfo`, `deleteFiles`, and `testFileTypeWrapper`, there is no coverage for the `getFileDataColumns` method specifically. This analysis will define comprehensive test cases to fill this gap.

---

## 3. Request Structure

The method uses `DFUGetDataColumnsRequest` internally, which maps to the following structure:

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|---------------------|-------|
| **openLogicalName** | String | Yes | The logical filename to query | Valid HPCC logical filename (with or without '~' prefix) | Primary identifier for the file. Only THOR files return column data. |
| **logicalName** | String | No | Alternative logical filename field | Valid HPCC logical filename | Typically not used by the Java client method |
| **filterBy** | String | No | Filter criteria for columns | Column name/value pairs | Min version 1.05. Format not used in basic method |
| **showColumns** | String | No | Columns to display | Comma-separated column names | Min version 1.05. Not used in basic method |
| **chooseFile** | int | No | File selection index for superfiles | Integer, default 0 | Min version 1.10. Used for superfile subfile selection |
| **cluster** | String | No | Target cluster name | Valid cluster name (e.g., "mythor", "myroxie") | Min version 1.12. If null, system locates file automatically |
| **clusterType** | String | No | Type of cluster | Cluster type string | Min version 1.12. Typically auto-determined |
| **startIndex** | long | No | Starting row index | Long integer, default 0 | Used for pagination, typically 0 for column metadata |
| **endIndex** | long | No | Ending row index | Long integer, default 0 | Used for pagination, typically 0 for column metadata |

### Field Dependencies
- Either `openLogicalName` or `logicalName` must be provided (client method uses `openLogicalName`)
- `cluster` is optional but recommended for performance and accuracy
- `chooseFile` only applies when querying superfiles
- Pagination fields (`startIndex`, `endIndex`) don't affect column metadata retrieval

### Default Behavior
- If `cluster` is null, the system searches for the file across all available clusters
- Pagination fields default to 0 and don't impact column retrieval
- `chooseFile` defaults to 0 (first subfile in a superfile)

---

## 4. Server Behavior and Responses

### Server-Side Processing Logic

The server-side implementation (`onDFUGetDataColumns` in `ws_dfuService.cpp`) performs the following:

1. **Authentication Check**: Validates user has `DfuAccess:READ` permission
2. **File Validation**: Verifies the logical filename is valid and non-empty
3. **File Location**: Uses `IResultSetFactory` to locate and open the file
4. **Metadata Extraction**: Queries the file's `IResultSetMetaData` to retrieve:
   - Column count
   - Keyed column count  
   - Column labels, types, sizes
   - Natural vs. translated column information
5. **Column Categorization**: Separates columns into:
   - **Keyed Columns**: Columns that are part of the dataset's index/key
   - **Non-Keyed Columns**: Regular payload columns
6. **Response Population**: Distributes columns across multiple response arrays (DFUDataKeyedColumns1-20, DFUDataNonKeyedColumns1-20) due to SOAP/WSDL limitations
7. **Client-Side Assembly**: Java client uses reflection to iterate through all column array methods and consolidate results into a single List

### Valid Response Types

#### Successful Response
- **HTTP Status**: 200 OK
- **Response Object**: `DFUGetDataColumnsResponse` with populated column arrays
- **Column Data**: Each `DFUDataColumn` contains:
  - `columnID`: Unique integer identifier
  - `columnLabel`: Field name
  - `columnType`: Display type (String, Integer, Boolean, Others, etc.)
  - `columnEclType`: ECL type definition
  - `columnSize`: Display size
  - `columnRawSize`: Actual storage size in bytes
  - `maxSize`: Maximum field size
  - `isKeyedColumn`: Boolean indicating if column is keyed
  - `isNaturalColumn`: Boolean indicating if column is natural (vs. translated)
  - `dataColumns`: Array of child columns for nested datasets

#### Empty Response (Valid but No Data)
- **Scenario**: File exists but has no column metadata (CSV/XML/FLAT files)
- **Behavior**: Returns empty column list
- **HTTP Status**: 200 OK

#### Exception Response
- **HTTP Status**: 200 OK (SOAP exceptions are returned in response body)
- **Response Object**: Contains `exceptions` array with `EspException` objects
- **Exception Fields**:
  - `code`: Error code
  - `audience`: Target audience
  - `source`: Source of error
  - `message`: Human-readable error description

### Invalid/Error Responses

1. **File Not Found**
   - Exception with message indicating file doesn't exist
   - Wrapped in `ArrayOfEspExceptionWrapper`

2. **Access Denied**
   - Exception: "WsDfu::DFUGetDataColumns: Permission denied"
   - Feature required: `DfuAccess:READ`

3. **Invalid File Type**
   - No exception thrown, but returns empty column list
   - Applies to CSV/XML/FLAT files without record definitions

4. **Cluster Not Found**
   - Exception indicating cluster doesn't exist or is unavailable

5. **Connection Failure**
   - `RemoteException` thrown and wrapped as generic Exception
   - Message: "HPCCWsDFUClient.getFileDataColumns(...) encountered RemoteException."

---

## 5. Error Handling

### Server-Side Errors

#### Authentication/Authorization Errors
- **Cause**: User lacks `DfuAccess:READ` permission
- **Handling**: Server throws `EspException` with "Permission denied" message
- **Client Behavior**: Method calls `handleEspSoapFaults()` or `handleEspExceptions()`

#### File Not Found
- **Cause**: Logical filename doesn't exist in specified cluster or any cluster
- **Handling**: Server returns exception in response
- **Client Behavior**: Throws `ArrayOfEspExceptionWrapper`

#### Invalid Cluster
- **Cause**: Specified cluster name doesn't exist or is unavailable
- **Handling**: Server returns exception in response
- **Client Behavior**: Throws `ArrayOfEspExceptionWrapper`

#### Unsupported File Type
- **Cause**: File is CSV/XML/FLAT without record definition
- **Handling**: Server returns empty column arrays (no exception)
- **Client Behavior**: Returns empty `List<DFUDataColumnWrapper>`

#### Internal Server Error
- **Cause**: Unexpected server-side failure (disk I/O, memory, etc.)
- **Handling**: Server returns exception in response
- **Client Behavior**: Throws `ArrayOfEspExceptionWrapper`

### Client-Side Errors

#### Null/Invalid Connection
- **Cause**: `stub` is null or connection not initialized
- **Handling**: `verifyStub()` throws exception before making request
- **Exception Type**: Exception with descriptive message

#### Null Logical Name
- **Cause**: `logicalname` parameter is null or empty
- **Handling**: Request sent with empty field; server may return exception or empty result
- **Client Behavior**: Depends on server response

#### RemoteException (Network/Communication Failure)
- **Cause**: Network timeout, connection loss, or HTTP error
- **Handling**: Caught and wrapped in generic Exception
- **Exception Message**: "HPCCWsDFUClient.getFileDataColumns(...) encountered RemoteException."

#### EspSoapFault
- **Cause**: SOAP-level fault from server
- **Handling**: Caught and processed by `handleEspSoapFaults()`
- **Exception Type**: Depends on fault type

#### Reflection Errors
- **Cause**: Unexpected response structure (e.g., version mismatch)
- **Handling**: Reflection code may fail silently or throw `IllegalAccessException`
- **Impact**: Some columns may be missing from result list

---

## 6. Existing Dataset Analysis

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | **Yes** | Ideal for testing. Contains multiple data types (int8, uint8, int4, uint4, int2, uint2, r8, r4, dec16, udec16, qStr, fixStr8, str, varStr, varStr8, utfStr, uni8, uni, varUni) and nested structures (childDataset, int1Set). Approximately 5,600 records. Perfect for validating column metadata retrieval across diverse types. |
| `~benchmark::string::100MB` | **Yes** | Good for testing large files with simple schema. Contains 2 columns (key, fill) both STRING8 type. 6,250,000 records. Useful for performance testing and validating metadata retrieval on large datasets. |
| `~benchmark::integer::20KB` | **Yes** | Ideal for basic testing. Small dataset with 2 INTEGER columns (key, fill). 1,250 records. Perfect for simple validation tests and quick smoke tests. |
| `~benchmark::all_types::superfile` | **Yes** | Critical for testing superfile handling. Contains `~benchmark::all_types::200KB` as subfile. Tests `chooseFile` parameter and superfile metadata retrieval. |
| `~benchmark::integer::20kb::key` | **Partial** | This is an INDEX file, not a regular THOR file. The method may return columns for the index structure, but behavior might differ from regular datasets. Good for edge case testing but may not return expected column metadata. |

### Dataset Mapping Strategy
- **Core Functionality Tests**: Use `~benchmark::integer::20KB` for basic operations (simple, fast)
- **Data Type Variety Tests**: Use `~benchmark::all_types::200KB` for complex type testing
- **Performance Tests**: Use `~benchmark::string::100MB` for large file handling
- **Superfile Tests**: Use `~benchmark::all_types::superfile` for superfile-specific tests
- **Edge Cases**: Use `~benchmark::integer::20kb::key` for index file testing

---

## 7. Test Case Plan

**CRITICAL**: All test cases below address the **complete lack of existing test coverage** identified in Section 2. Since no tests exist for `getFileDataColumns`, all scenarios below are required.

### A. Core Functionality Tests

Tests that verify the method's primary purpose and expected normal operation.

---

#### CFT-001: Basic Column Retrieval - Simple Integer Dataset

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Retrieve column metadata from a simple integer dataset with minimal parameters |
| **Input Data** | `fileName`: `~benchmark::integer::20KB`<br>`cluster`: `mythor` (or default test cluster) |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | - List of 2 `DFUDataColumnWrapper` objects<br>- Column 1: label="key", type="integer"<br>- Column 2: label="fill", type="integer"<br>- Both columns should have valid sizes and ECL types |
| **Pass Criteria** | - Result list is not null<br>- List size equals 2<br>- Column labels match "key" and "fill"<br>- Column types are integer-related<br>- No exceptions thrown<br>- All column metadata fields are populated |
| **Notes** | This is the simplest valid use case. Validates basic method operation with minimal complexity. |

---

#### CFT-002: Column Retrieval - Multi-Type Dataset

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Retrieve column metadata from a dataset containing multiple data types |
| **Input Data** | `fileName`: `~benchmark::all_types::200KB`<br>`cluster`: `mythor` |
| **Dataset** | `~benchmark::all_types::200KB` (existing) |
| **Expected Output** | - List of 21+ `DFUDataColumnWrapper` objects<br>- Columns include: int8, uint8, int4, uint4, int2, uint2, r8, r4, dec16, udec16, qStr, fixStr8, str, varStr, varStr8, utfStr, uni8, uni, varUni, childDataset, int1Set<br>- Each column has appropriate type information<br>- Nested columns (childDataset) should contain child column information |
| **Pass Criteria** | - Result list is not null<br>- List size >= 21<br>- All expected column names are present<br>- Column types match ECL definitions<br>- Integer types are correctly identified<br>- String types are correctly identified<br>- Real/decimal types are correctly identified<br>- Nested dataset columns contain child columns<br>- No exceptions thrown |
| **Notes** | Validates handling of diverse data types including primitives, strings, decimals, and nested structures. Critical for ensuring type discovery works correctly. |

---

#### CFT-003: Column Retrieval Without Cluster Parameter

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Retrieve column metadata without specifying cluster, relying on automatic file location |
| **Input Data** | `fileName`: `~benchmark::integer::20KB`<br>`cluster`: `null` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | - List of 2 `DFUDataColumnWrapper` objects<br>- Column 1: label="key"<br>- Column 2: label="fill"<br>- Same result as CFT-001 |
| **Pass Criteria** | - Result list is not null<br>- List size equals 2<br>- Column labels and types match expected<br>- No exceptions thrown<br>- Automatic cluster detection works correctly |
| **Notes** | Tests default behavior when cluster is not specified. System should locate file automatically. |

---

#### CFT-004: Column Retrieval - Large Dataset

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-004 |
| **Category** | Core Functionality |
| **Subcategory** | Performance Limits |
| **Description** | Retrieve column metadata from a large dataset to validate performance and handling |
| **Input Data** | `fileName`: `~benchmark::string::100MB`<br>`cluster`: `mythor` |
| **Dataset** | `~benchmark::string::100MB` (existing) |
| **Expected Output** | - List of 2 `DFUDataColumnWrapper` objects<br>- Column 1: label="key", type="string8"<br>- Column 2: label="fill", type="string8"<br>- Metadata retrieval should be fast (not dependent on file size) |
| **Pass Criteria** | - Result list is not null<br>- List size equals 2<br>- Column labels match "key" and "fill"<br>- Column types are string-related<br>- No exceptions thrown<br>- Response time < 5 seconds (metadata only, not data) |
| **Notes** | Validates that metadata retrieval is not significantly impacted by file size. |

---

#### CFT-005: Keyed vs Non-Keyed Column Identification

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-005 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Validate that keyed and non-keyed columns are correctly identified |
| **Input Data** | `fileName`: `~benchmark::integer::20kb::key` (index file)<br>`cluster`: `mythor` |
| **Dataset** | `~benchmark::integer::20kb::key` (existing) |
| **Expected Output** | - List of columns with at least one keyed column<br>- `isKeyedColumn` flag set to true for key columns<br>- `isKeyedColumn` flag set to false for non-keyed columns |
| **Pass Criteria** | - Result list is not null<br>- At least one column has `isKeyedColumn` = true<br>- Column keyed status matches file definition<br>- No exceptions thrown |
| **Notes** | Tests INDEX file handling and validates keyed column detection. Behavior may differ from regular datasets. |

---

#### CFT-006: Nested Dataset Column Retrieval

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-006 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Validate retrieval of nested dataset columns (child columns) |
| **Input Data** | `fileName`: `~benchmark::all_types::200KB`<br>`cluster`: `mythor`<br>Focus on `childDataset` column |
| **Dataset** | `~benchmark::all_types::200KB` (existing) |
| **Expected Output** | - Parent column with label "childDataset" found<br>- Parent column contains child columns: childField1 (STRING8), childField2 (INTEGER8), childField3 (REAL8)<br>- Child columns have correct types and metadata |
| **Pass Criteria** | - Result list contains column with label "childDataset"<br>- `getChildColumns()` returns non-empty list<br>- Child column count equals 3<br>- Child column names and types match definition<br>- No exceptions thrown |
| **Notes** | Critical for validating nested/complex type handling. |

---

### B. Edge Case Tests

Tests that explore boundary conditions and unusual but valid scenarios.

---

#### ECT-001: Empty Cluster Name String

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Optional Parameters |
| **Description** | Test behavior when cluster parameter is empty string (not null) |
| **Input Data** | `fileName`: `~benchmark::integer::20KB`<br>`cluster`: `""` (empty string) |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | - Should behave same as null cluster<br>- List of 2 columns returned |
| **Pass Criteria** | - Result list is not null<br>- List size equals 2<br>- No exceptions thrown<br>- Empty string treated as null/unspecified |
| **Notes** | Validates handling of empty vs. null optional parameters. |

---

#### ECT-002: Logical Name Without Tilde Prefix

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Test retrieval using logical name without '~' prefix |
| **Input Data** | `fileName`: `benchmark::integer::20KB` (no leading ~)<br>`cluster`: `mythor` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | - System should normalize name and find file<br>- List of 2 columns returned |
| **Pass Criteria** | - Result list is not null<br>- List size equals 2<br>- No exceptions thrown<br>- Tilde prefix not required |
| **Notes** | Tests name normalization and flexibility in file name format. |

---

#### ECT-003: Logical Name With Extra Whitespace

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Test retrieval with leading/trailing whitespace in logical name |
| **Input Data** | `fileName`: `"  ~benchmark::integer::20KB  "` (with spaces)<br>`cluster`: `mythor` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | - System should trim whitespace and find file<br>- List of 2 columns returned |
| **Pass Criteria** | - Result list is not null<br>- List size equals 2<br>- No exceptions thrown<br>- Whitespace properly handled |
| **Notes** | Server-side code shows `trim()` operation, so this should work. |

---

#### ECT-004: Superfile Column Retrieval - Default Subfile

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-004 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Retrieve columns from a superfile without specifying chooseFile (default to first subfile) |
| **Input Data** | `fileName`: `~benchmark::all_types::superfile`<br>`cluster`: `mythor` |
| **Dataset** | `~benchmark::all_types::superfile` (existing) |
| **Expected Output** | - Returns columns from first subfile (`~benchmark::all_types::200KB`)<br>- List of 21+ columns matching all_types schema |
| **Pass Criteria** | - Result list is not null<br>- List size >= 21<br>- Column structure matches `~benchmark::all_types::200KB`<br>- No exceptions thrown<br>- Default subfile (index 0) is used |
| **Notes** | Validates superfile handling and default chooseFile behavior. Note: chooseFile parameter not exposed in this method signature but may be handled internally. |

---

#### ECT-005: URI Format Logical Name

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-005 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Test retrieval using URI-style logical name (forward slashes instead of :: ) |
| **Input Data** | `fileName`: `/benchmark/integer/20KB` (URI format)<br>`cluster`: `mythor` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | - System may normalize to legacy format or accept directly<br>- List of 2 columns returned (if supported) |
| **Pass Criteria** | - If supported: result list not null, size = 2, no exceptions<br>- If not supported: graceful error handling (exception or empty result) |
| **Notes** | Tests modern URI format compatibility mentioned in project guidelines. |

---

#### ECT-006: Case Sensitivity in Logical Name

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-006 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Test if logical file names are case-sensitive |
| **Input Data** | `fileName`: `~BENCHMARK::INTEGER::20KB` (uppercase)<br>`cluster`: `mythor` |
| **Dataset** | `~benchmark::integer::20KB` (existing, lowercase) |
| **Expected Output** | - Depends on HPCC configuration (typically case-insensitive)<br>- Should return columns or throw "file not found" |
| **Pass Criteria** | - Behavior is consistent and predictable<br>- If case-insensitive: returns columns<br>- If case-sensitive: throws appropriate exception |
| **Notes** | Documents expected behavior for case variations. |

---

#### ECT-007: Column Retrieval from Dataset with Single Column

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-007 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Test retrieval from dataset with only one column |
| **Input Data** | Dataset with single column<br>`cluster`: `mythor` |
| **Dataset** | `[NEW DATASET REQUIRED]` - See Section 8 |
| **Expected Output** | - List with 1 `DFUDataColumnWrapper`<br>- Single column metadata returned correctly |
| **Pass Criteria** | - Result list is not null<br>- List size equals 1<br>- Column metadata is complete<br>- No exceptions thrown |
| **Notes** | Tests boundary case of minimal column count. |

---

#### ECT-008: Column Retrieval from Dataset with Maximum Columns

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-008 |
| **Category** | Edge Case |
| **Subcategory** | Performance Limits |
| **Description** | Test retrieval from dataset with very large number of columns (stress test) |
| **Input Data** | Dataset with 100+ columns<br>`cluster`: `mythor` |
| **Dataset** | `[NEW DATASET REQUIRED]` - See Section 8 |
| **Expected Output** | - List with 100+ `DFUDataColumnWrapper` objects<br>- All columns retrieved successfully<br>- Response arrays properly aggregated |
| **Pass Criteria** | - Result list is not null<br>- List size equals expected column count<br>- All columns have valid metadata<br>- No columns missing due to array limitations<br>- No exceptions thrown |
| **Notes** | Critical test for validating reflection-based column aggregation across multiple response arrays (DFUDataKeyedColumns1-20, DFUDataNonKeyedColumns1-20). Tests handling of SOAP array limitations. |

---

### C. Error Handling Tests

Tests that verify proper handling of invalid inputs and error conditions.

---

#### EHT-001: Null Logical Filename

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Test behavior when logical filename is null |
| **Input Data** | `fileName`: `null`<br>`cluster`: `mythor` |
| **Dataset** | N/A |
| **Expected Output** | - Exception thrown or empty result<br>- Graceful error handling |
| **Pass Criteria** | - No NullPointerException<br>- Either throws appropriate exception OR returns empty list<br>- Error message is meaningful (if exception) |
| **Notes** | Validates null input handling. |

---

#### EHT-002: Empty Logical Filename

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Test behavior when logical filename is empty string |
| **Input Data** | `fileName`: `""`<br>`cluster`: `mythor` |
| **Dataset** | N/A |
| **Expected Output** | - Exception thrown (likely server-side)<br>- Error message indicates invalid filename |
| **Pass Criteria** | - Exception is thrown (ArrayOfEspExceptionWrapper or similar)<br>- Error message is meaningful<br>- No NullPointerException or unclear errors |
| **Notes** | Validates empty string handling. |

---

#### EHT-003: Non-Existent Logical Filename

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Test behavior when logical filename doesn't exist |
| **Input Data** | `fileName`: `~nonexistent::file::name`<br>`cluster`: `mythor` |
| **Dataset** | N/A (non-existent file) |
| **Expected Output** | - Exception thrown: `ArrayOfEspExceptionWrapper`<br>- Exception message indicates file not found |
| **Pass Criteria** | - ArrayOfEspExceptionWrapper is thrown<br>- Exception message contains "not found" or similar<br>- Exception can be caught and handled gracefully |
| **Notes** | Critical for validating file existence checking. |

---

#### EHT-004: Invalid Cluster Name

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Test behavior when cluster name doesn't exist |
| **Input Data** | `fileName`: `~benchmark::integer::20KB`<br>`cluster`: `nonexistent_cluster` |
| **Dataset** | `~benchmark::integer::20KB` (existing, but not on specified cluster) |
| **Expected Output** | - Exception thrown: `ArrayOfEspExceptionWrapper`<br>- Exception message indicates cluster not found or file not found on cluster |
| **Pass Criteria** | - ArrayOfEspExceptionWrapper is thrown<br>- Exception message is meaningful<br>- Exception can be caught and handled gracefully |
| **Notes** | Validates cluster validation and error reporting. |

---

#### EHT-005: Unsupported File Type - CSV File

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-005 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Test behavior when querying a CSV file (no record definition) |
| **Input Data** | `fileName`: CSV file logical name (if available)<br>`cluster`: `mythor` |
| **Dataset** | `[NEW DATASET REQUIRED]` - CSV file without record definition |
| **Expected Output** | - Empty list returned (no columns)<br>- OR exception indicating unsupported file type |
| **Pass Criteria** | - No unhandled exceptions<br>- Returns empty list OR throws clear exception<br>- Behavior is documented |
| **Notes** | Method documentation states CSV/XML/FLAT files return nothing. Validates this behavior. |

---

#### EHT-006: Unsupported File Type - XML File

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-006 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Test behavior when querying an XML file |
| **Input Data** | `fileName`: XML file logical name (if available)<br>`cluster`: `mythor` |
| **Dataset** | `[NEW DATASET REQUIRED]` - XML file |
| **Expected Output** | - Empty list returned (no columns)<br>- OR exception indicating unsupported file type |
| **Pass Criteria** | - No unhandled exceptions<br>- Returns empty list OR throws clear exception<br>- Behavior is documented |
| **Notes** | Validates handling of non-THOR file types. |

---

#### EHT-007: Connection Failure - Invalid Host

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-007 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Test behavior when connection host is invalid/unreachable |
| **Input Data** | Connection to invalid host (e.g., "http://invalid.host:8010")<br>`fileName`: `~benchmark::integer::20KB`<br>`cluster`: `mythor` |
| **Dataset** | N/A (connection fails) |
| **Expected Output** | - Exception thrown: Generic Exception wrapping RemoteException<br>- Message: "HPCCWsDFUClient.getFileDataColumns(...) encountered RemoteException." |
| **Pass Criteria** | - Exception is thrown<br>- Exception message indicates RemoteException<br>- No hanging or timeout beyond reasonable limit |
| **Notes** | Validates network error handling. |

---

#### EHT-008: Null Client/Stub (verifyStub Failure)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-008 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Test behavior when client stub is not properly initialized |
| **Input Data** | Client with null/uninitialized stub<br>`fileName`: `~benchmark::integer::20KB` |
| **Dataset** | N/A |
| **Expected Output** | - Exception thrown by `verifyStub()` method<br>- Exception before any network call |
| **Pass Criteria** | - Exception is thrown before request is sent<br>- Exception message indicates stub/connection issue<br>- No NullPointerException |
| **Notes** | Validates client initialization checking. |

---

#### EHT-009: Permission Denied - No Read Access

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-009 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Test behavior when user lacks DfuAccess:READ permission |
| **Input Data** | Connection with user lacking read permissions<br>`fileName`: `~benchmark::integer::20KB`<br>`cluster`: `mythor` |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | - Exception: `ArrayOfEspExceptionWrapper`<br>- Message: "WsDfu::DFUGetDataColumns: Permission denied" or similar |
| **Pass Criteria** | - ArrayOfEspExceptionWrapper is thrown<br>- Exception message indicates permission denied<br>- Appropriate security error code in exception |
| **Notes** | Requires test user without DfuAccess:READ. May need test environment setup. |

---

#### EHT-010: Malformed Logical Name - Invalid Characters

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-010 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Test behavior with special/invalid characters in logical name |
| **Input Data** | `fileName`: `~benchmark::integer::20KB<script>alert(1)</script>` (injection attempt)<br>`cluster`: `mythor` |
| **Dataset** | N/A |
| **Expected Output** | - Exception thrown indicating invalid filename<br>- No XSS or injection vulnerability |
| **Pass Criteria** | - Exception is thrown<br>- No security vulnerability<br>- Error message is appropriate |
| **Notes** | Security-focused test for input validation. |

---

#### EHT-011: Extremely Long Logical Name

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-011 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Test behavior with excessively long logical filename |
| **Input Data** | `fileName`: String with 10,000+ characters<br>`cluster`: `mythor` |
| **Dataset** | N/A |
| **Expected Output** | - Exception thrown or graceful handling<br>- No buffer overflow or system crash |
| **Pass Criteria** | - No system crash or unhandled error<br>- Exception thrown OR request handled gracefully<br>- Response time reasonable (no hanging) |
| **Notes** | Boundary testing for input length limits. |

---

#### EHT-012: Column Retrieval After Connection Timeout

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-012 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Test behavior when network timeout occurs during request |
| **Input Data** | Connection with very short timeout<br>`fileName`: `~benchmark::string::100MB`<br>`cluster`: `mythor` |
| **Dataset** | `~benchmark::string::100MB` (existing) |
| **Expected Output** | - Timeout exception or RemoteException<br>- Wrapped in generic Exception |
| **Pass Criteria** | - Exception is thrown within timeout period<br>- Exception message indicates timeout or communication failure<br>- No resource leaks |
| **Notes** | Tests timeout handling. Note: Metadata retrieval should be fast, so timeout may need to be artificially induced. |

---

## 8. New Dataset Specifications

Based on the test case plan above, the following new datasets are required:

---

### Dataset 1: Single Column Dataset

**Dataset Name**: `~test::single_column::integer`

**Required For**: ECT-007

**Structure**:
```ecl
rec := {INTEGER8 id};
ds := DATASET(100, transform(rec,
    self.id := COUNTER;
), DISTRIBUTED);

OUTPUT(ds,, '~test::single_column::integer', overwrite);
```

**Record Count**: 100

**Special Characteristics**: 
- Minimal schema with only one column
- Tests boundary case for column count

**Rationale**: Existing datasets all have 2 or more columns. Need dataset with exactly 1 column to test minimum boundary.

---

### Dataset 2: Maximum Columns Dataset

**Dataset Name**: `~test::many_columns::100fields`

**Required For**: ECT-008

**Structure**:
```ecl
rec := RECORD
    INTEGER2 field001;
    INTEGER2 field002;
    INTEGER2 field003;
    INTEGER2 field004;
    INTEGER2 field005;
    INTEGER2 field006;
    INTEGER2 field007;
    INTEGER2 field008;
    INTEGER2 field009;
    INTEGER2 field010;
    // ... continue through field100
    INTEGER2 field100;
END;

ds := DATASET(10, transform(rec,
    self.field001 := COUNTER;
    self.field002 := COUNTER * 2;
    // ... initialize all fields
    self.field100 := COUNTER * 100;
), DISTRIBUTED);

OUTPUT(ds,, '~test::many_columns::100fields', overwrite);
```

**Record Count**: 10 (data volume not important, column count is)

**Special Characteristics**:
- 100 columns to stress-test response array aggregation
- Tests reflection-based column collection across multiple DFUDataKeyedColumns/DFUDataNonKeyedColumns arrays
- Small record count for fast testing

**Rationale**: Server returns columns across arrays (DFUDataKeyedColumns1-20, DFUDataNonKeyedColumns1-20). With 40 potential arrays, each holding columns, we need to ensure the client's reflection-based aggregation works correctly. 100 columns ensures we exceed single array capacity and test multi-array handling.

---

### Dataset 3: CSV File Without Record Definition

**Dataset Name**: `~test::csv::no_record_def`

**Required For**: EHT-005

**Structure**: Spray a CSV file without attaching a record definition

**Creation Method**:
1. Create CSV file with comma-separated values
2. Spray file to HPCC cluster without specifying record structure
3. Result: Logical file exists but has no schema metadata

**Special Characteristics**:
- CSV file type
- No record definition/schema attached
- Should return empty column list when queried

**Rationale**: Existing datasets are all THOR files with defined schemas. Need CSV file without schema to validate documented behavior that CSV files return no column metadata.

---

### Dataset 4: XML File

**Dataset Name**: `~test::xml::no_record_def`

**Required For**: EHT-006

**Structure**: Spray an XML file or output XML format without record definition

**Creation Method**:
1. Create/output XML formatted data
2. Ensure no record definition is attached
3. Result: Logical XML file without schema metadata

**Special Characteristics**:
- XML file type
- No ECL record definition
- Should return empty column list or error

**Rationale**: Similar to CSV test, validates handling of non-THOR file types as documented.

---

### Dataset 5: Very Long Logical Filename

**Dataset Name**: `~test::edge_case::extremely_long_name_abcdefghijklmnopqrstuvwxyz_0123456789_abcdefghijklmnopqrstuvwxyz_0123456789_abcdefghijklmnopqrstuvwxyz_0123456789_abcdefghijklmnopqrstuvwxyz_0123456789::file`

**Required For**: EHT-011

**Structure**:
```ecl
rec := {INTEGER2 id};
ds := DATASET(10, transform(rec, self.id := COUNTER), DISTRIBUTED);

OUTPUT(ds,, '~test::edge_case::extremely_long_name_abcdefghijklmnopqrstuvwxyz_0123456789_abcdefghijklmnopqrstuvwxyz_0123456789_abcdefghijklmnopqrstuvwxyz_0123456789_abcdefghijklmnopqrstuvwxyz_0123456789::file', overwrite);
```

**Record Count**: 10

**Special Characteristics**:
- Logical name approaching or exceeding typical length limits (aim for 200+ characters)
- Valid name but extremely long
- Tests system limits for filename length

**Rationale**: Tests boundary conditions for filename length validation. Existing datasets have short, typical names.

---

### Optional Dataset 6: Protected File (Permission Testing)

**Dataset Name**: `~test::protected::read_denied`

**Required For**: EHT-009

**Structure**:
```ecl
rec := {INTEGER2 id};
ds := DATASET(10, transform(rec, self.id := COUNTER), DISTRIBUTED);

OUTPUT(ds,, '~test::protected::read_denied', overwrite);

// Then use ECL or ESP to set file permissions to deny read access
```

**Record Count**: 10

**Special Characteristics**:
- File permissions set to deny read access for test user
- Requires file permission management

**Rationale**: Tests authentication/authorization error handling. Requires cluster with security enabled.

**Note**: This may require environment-specific setup and may not be feasible in all test environments. Consider marking as @Ignore if security is not enabled.

---

## Summary

This analysis provides comprehensive test coverage for the `getFileDataColumns` method, filling the complete gap in existing test coverage. The test plan includes:

- **6 Core Functionality Tests**: Covering basic operation, data type variations, and typical workflows
- **8 Edge Case Tests**: Exploring boundary conditions, optional parameters, and unusual inputs
- **12 Error Handling Tests**: Validating invalid inputs, server errors, and client-side failures

**Total**: 26 test cases across all categories, providing thorough coverage of:
- Simple and complex data types
- Nested structures
- Superfiles and index files
- Various file sizes and column counts
- Error conditions and edge cases
- Security and permission scenarios

The analysis leverages 4 existing datasets and defines 5-6 new datasets required for comprehensive testing. All test cases are designed as integration tests using live HPCC cluster connections, following project best practices.

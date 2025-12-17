# WsDFU.getLogicalFiles Test Case Analysis

**Generated:** 2025-12-12  
**Target Method:** `HPCCWsDFUClient.getLogicalFiles(String filename, String cluster, int firstN, int pageStartFrom, int pageSize)`  
**Service:** WsDFU  
**HPCC Platform Version:** 8.x - 10.x

---

## 1. Method Summary

### Purpose
The `getLogicalFiles` method retrieves a list of logical files from an HPCC Systems cluster based on query criteria. It provides pagination support and filtering capabilities to efficiently retrieve file listings from potentially large file systems.

### Role Within Service
This method is one of the primary file discovery methods in the WsDFU service. It allows clients to:
- Query for files matching a logical name pattern (with wildcard support)
- Retrieve paginated results from large file listings
- Limit the number of results returned
- Navigate through results using pagination

### Inputs
- `filename` (String): Logical file name pattern to search for (supports wildcards, optional)
- `cluster` (String): **DEPRECATED** - No longer used (marked as deprecated in v1.26, replaced by NodeGroup)
- `firstN` (int): Limit results to first N files (-1 for no limit)
- `pageStartFrom` (int): Starting index for pagination (0-based internally, 1-based in request)
- `pageSize` (int): Number of results per page (default 100 if not specified)

### Outputs
Returns `List<DFULogicalFileWrapper>` containing:
- File metadata (name, size, owner, modification date, etc.)
- File type information (regular file, superfile, index, etc.)
- Cluster/nodegroup associations
- Directory information

### Side Effects
- None (read-only operation)
- May trigger security permission checks
- Results may be cached server-side (via cacheHint)

---

## 2. Existing Test Coverage Analysis

### Tests Found
After reviewing `/Users/james/Documents/Projects/Work/hpcc4j/wsclient/src/test/java/org/hpccsystems/ws/client/WsDFUClientTest.java`, **NO existing tests were found** that directly test the `getLogicalFiles` method.

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| *(none)* | - | - | - | - | No tests exist for getLogicalFiles |

### Related Tests Found
The following related tests exist but do NOT cover `getLogicalFiles`:
- `searchFileTest()` - Tests `searchFiles()` method with DFUQueryRequestWrapper (different method, more advanced)
- `testGetFiles()` - Tests `getFiles(String scope)` method (different method, scope-based)
- `testGetFile()` - Tests `getFileInfo()` method (single file retrieval)

### Coverage Summary
- **Total existing test methods:** 0
- **Core Functionality Tests covered:** 0 (none)
- **Edge Case Tests covered:** 0 (none)
- **Error Handling Tests covered:** 0 (none)
- **Gaps identified:** Complete absence of test coverage for `getLogicalFiles` method

**Critical Gap:** The `getLogicalFiles` method has **zero test coverage** despite being a primary method for file listing. All test scenarios below are needed.

---

## 3. Request Structure

The `getLogicalFiles` method internally creates and populates a `DFUQueryRequest` object. Based on the HPCC Platform IDL definition (`esp/scm/ws_dfu.ecm`) and wrapper analysis:

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|---------------------|-------|
| **LogicalName** | String | No | File name pattern to search | Wildcard patterns supported: `*`, `?`<br>Can start with `~` or not | Passed as `filename` parameter<br>Leading `~` is stripped by searchFiles() |
| **ClusterName** | String | No (Deprecated) | Legacy cluster parameter | Any cluster name | **DEPRECATED** in v1.26<br>Replaced by NodeGroup<br>Not used in this method |
| **NodeGroup** | String | No | Target cluster/nodegroup | Valid cluster name | Not exposed in this method signature<br>Can be set via DFUQueryRequestWrapper |
| **FirstN** | int | No | Limit to first N results | -1 (no limit) or positive integer | Default: -1<br>Passed directly |
| **PageStartFrom** | int | No | Pagination start index | 0 or positive integer | Default: 0<br>1-based in request, 0-based internally |
| **PageSize** | int | No | Results per page | Positive integer | Default: 100 if < 1<br>Passed directly |
| **Prefix** | String | No | Scope prefix filter | Valid scope/directory path | Not exposed in this method |
| **ContentType** | String | No | Content type filter | File content type string | Not exposed in this method<br>Min version 1.30 |
| **InvertContent** | bool | No | Invert content type filter | true/false | Not exposed in this method<br>Min version 1.64 |
| **Owner** | String | No | File owner filter | Username string | Not exposed in this method |
| **StartDate** | String | No | Start date filter | Date string format | Not exposed in this method |
| **EndDate** | String | No | End date filter | Date string format | Not exposed in this method |
| **FileType** | String | No | File type filter | "Superfiles Only", "Logical Files Only", "Not in Superfiles" | Not exposed in this method |
| **FileSizeFrom** | int64 | No | Minimum file size | -1 (no limit) or bytes | Default: -1<br>Not exposed in this method |
| **FileSizeTo** | int64 | No | Maximum file size | -1 (no limit) or bytes | Default: -1<br>Not exposed in this method |
| **Sortby** | String | No | Sort field | Field name string | Not exposed in this method |
| **Descending** | bool | No | Sort descending | true/false | Default: false<br>Not exposed in this method |
| **OneLevelDirFileReturn** | bool | No | Return single directory level | true/false | Default: false<br>Not exposed in this method |
| **CacheHint** | int64 | No | Cache optimization hint | Cache hint value | Not exposed in this method<br>Min version 1.24 |
| **MaxNumberOfFiles** | int | No | Maximum files to return | Positive integer | Default: ITERATE_FILTEREDFILES_LIMIT<br>Not exposed in this method<br>Min version 1.30 |
| **IncludeSuperOwner** | bool | No | Include superfile owner info | true/false | Not exposed in this method<br>Min version 1.30 |
| **StartAccessedTime** | String | No | Start access time filter | Time string format | Not exposed in this method<br>Min version 1.55 |
| **EndAccessedTime** | String | No | End access time filter | Time string format | Not exposed in this method<br>Min version 1.55 |
| **MaxSkewFrom** | int64 | No | Max skew from filter | Skew value | Not exposed in this method<br>Min version 1.63 |
| **MaxSkewTo** | int64 | No | Max skew to filter | Skew value | Not exposed in this method<br>Min version 1.63 |
| **MinSkewFrom** | int64 | No | Min skew from filter | Skew value | Not exposed in this method<br>Min version 1.63 |
| **MinSkewTo** | int64 | No | Min skew to filter | Skew value | Not exposed in this method<br>Min version 1.63 |

### Field Dependencies
- **FirstN vs Pagination:** When `firstN > 0`, pagination parameters (`pageStartFrom`, `pageSize`) are overridden:
  - `pageStartFrom` is set to 0
  - `pageSize` is set to `firstN`
- **PageSize Default:** If `pageSize < 1`, it defaults to 100
- **LogicalName Pattern:** Leading `~` character is stripped by the wrapper before sending to server

### Default Behaviors
- Empty/null `filename`: Returns all files (server-side default filter: "*")
- `firstN = -1`: No limit applied
- `pageSize = 0` or negative: Defaults to 100
- `pageStartFrom = 0`: Start from beginning
- `cluster`: Ignored (deprecated parameter)

---

## 4. Server Behavior and Responses

### Server-Side Processing (`ws_dfuService.cpp::doLogicalFileSearch`)

#### Version Checks
1. **Dali Server Version Check:** If Dali server version < 3.11, falls back to `getAPageOfSortedLogicalFile` (legacy code path)
2. **Client Version:** Response format may vary based on `context.getClientVersion()`

#### Processing Flow
1. **Permission Check:** `context.ensureFeatureAccess(FEATURE_URL, SecAccess_Read)` - Read permission required
2. **User Descriptor Creation:** Extracts username/password from context
3. **Filter Construction:**
   - Builds filter string from request parameters
   - Sets local filters (including NodeGroup if specified)
   - Applies default filter "*" if no LogicalName provided
4. **Sort Order Determination:**
   - Default: Sort by name (`DFUQRFname`)
   - Can be overridden via `sortby` parameter
5. **Pagination Calculation:**
   - Converts 1-based `pageStartFrom` to 0-based index
   - Applies `firstN` override if specified
   - Ensures `pageSize >= 1` (default 100)
6. **Max Files Limit:**
   - Default: `ITERATE_FILTEREDFILES_LIMIT`
   - Can be overridden via `maxNumberOfFiles`
7. **Query Execution:**
   - Calls `queryDistributedFileDirectory().getLogicalFilesSorted()`
   - Applies filters, sorting, and pagination
   - May use cache hint for optimization
8. **Result Processing:**
   - Converts iterator results to `DFULogicalFile` array
   - Checks if all matching files were returned
   - Sets warning if results are subset

### Valid Response Types

#### Success Response
Returns `DFUQueryResponse` containing:
- **DFULogicalFiles:** Array of `DFULogicalFile` objects with:
  - `Name`: Logical file name
  - `Filename`: Full file path
  - `Owner`: File owner username
  - `NodeGroup`: Cluster/nodegroup
  - `Modified`: Last modification timestamp
  - `TotalSize`: Total file size in bytes
  - `RecordCount`: Number of records (if available)
  - `IsSuperfile`: Boolean flag
  - `IsDirectory`: Boolean flag
  - `IsZipfile`: Boolean flag
  - And many other metadata fields
- **NumFiles:** Total number of matching files
- **PageSize:** Actual page size used
- **PageStartFrom:** Actual starting index used
- **PageEndAt:** Last index in current page
- **NextPageFrom:** Starting index for next page (-1 if no more)
- **PrevPageFrom:** Starting index for previous page (-1 if none)
- **LastPageFrom:** Starting index of last page
- **CacheHint:** Cache hint value (may be updated by server)
- **IsSubsetOfFiles:** Boolean indicating if results are truncated
- **Warning:** Warning message if results are subset

#### Empty Results
- Valid response with empty `DFULogicalFiles` array
- `NumFiles = 0`
- Pagination fields set to default values

#### Subset Warning
When results exceed `maxNumberOfFiles`:
- `IsSubsetOfFiles = true`
- `Warning`: "The returned results (N files) represent a subset of the total number of matches. Using a correct filter may reduce the number of matches."

### Invalid Responses / Errors

#### Server-Side Errors
1. **Permission Denied:**
   - Code: `ECLWATCH_DFU_ACCESS_DENIED`
   - Message: "WsDfu::DFUQuery: Permission denied."
   - Occurs when user lacks read access
2. **File Iterator Error:**
   - Code: `ECLWATCH_CANNOT_GET_FILE_ITERATOR`
   - Message: "Cannot get information from file system."
   - Occurs when Dali connection fails or file system is unavailable
3. **Internal Error:**
   - Code: `ECLWATCH_INTERNAL_ERROR`
   - General exception forwarding
   - Various causes (network, Dali, etc.)

#### Response Exceptions
- **ArrayOfEspException:** Array of exception objects with:
  - `Code`: Error code string
  - `Audience`: Target audience
  - `Source`: Error source
  - `Message`: Error description

---

## 5. Error Handling

### Server-Side Errors

| Error Type | Condition | Error Code | Expected Behavior |
|------------|-----------|------------|-------------------|
| **Permission Denied** | User lacks SecAccess_Read | ECLWATCH_DFU_ACCESS_DENIED | ArrayOfEspExceptionWrapper thrown |
| **File Iterator Failure** | Cannot access Dali/file system | ECLWATCH_CANNOT_GET_FILE_ITERATOR | ArrayOfEspExceptionWrapper thrown |
| **Dali Connection Failure** | Network/Dali unavailable | ECLWATCH_INTERNAL_ERROR | Exception with RemoteException cause |
| **Invalid Filter Pattern** | Malformed wildcard pattern | Varies | May return empty results or exception |
| **Legacy Dali Version** | Dali < 3.11 | N/A | Falls back to legacy code path |

### Client-Side Errors

| Error Type | Condition | Expected Behavior |
|------------|-----------|-------------------|
| **Null Stub** | Client not initialized | Exception: "WSDFU client not available" |
| **Invalid Connection** | Connection details incorrect | AxisFault exception |
| **Timeout** | Request exceeds timeout | RemoteException wrapped in Exception |
| **SOAP Fault** | Server returns SOAP fault | EspSoapFaultWrapper -> Exception |
| **Response Parsing** | Invalid response format | Exception during wrapper creation |

### Exception Propagation
1. **RemoteException:** Caught and wrapped in `Exception` with message: `"HPCCWsDFUClient.getLogicalFiles(...) encountered RemoteException."`
2. **EspSoapFault:** Handled by `handleEspSoapFaults()` with message: `"Could Not perform getLogicalFiles"`
3. **ArrayOfEspException:** Handled by `handleEspExceptions()` with message: `"Could Not getLogicalFiles"`

---

## 6. Existing Dataset Analysis

Review of available test datasets from `generate-datasets.ecl`:

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | **Yes** | Perfect for testing file listing. It's a regular file with known characteristics (5600 records, ~200KB). Can be used to verify file appears in results and metadata is correct. |
| `~benchmark::string::100MB` | **Yes** | Useful for testing with a larger file (6.25M records, ~100MB). Tests file size filtering and ensures large files are handled. |
| `~benchmark::integer::20KB` | **Yes** | Excellent for testing with a small file (1250 records, ~20KB). Fast to work with and good for basic tests. |
| `~benchmark::all_types::superfile` | **Yes** | **Critical** for testing superfile handling. Contains `~benchmark::all_types::200KB` as subfile. Tests that superfiles are correctly identified (IsSuperfile flag). |
| `~benchmark::integer::20kb::key` | **Yes** | Useful for testing index file handling. Tests that index files are correctly identified and listed. |

### Additional Dataset Observations
- **Scope Pattern:** All existing datasets are in `benchmark::` scope, making them ideal for testing wildcard patterns like `benchmark::*`
- **File Type Variety:** Coverage includes regular files, superfiles, and index files
- **Size Range:** From 20KB to 100MB provides good size diversity
- **Naming Convention:** Consistent naming makes pattern matching predictable

### Scope Coverage
The `benchmark::` scope can be used for:
- Testing recursive file listing
- Testing wildcard patterns (`benchmark::*`, `benchmark::integer::*`)
- Testing exact name matching
- Testing prefix filtering

---

## 7. Test Case Plan

**IMPORTANT:** All test cases below represent **NEW** tests that must be created. No existing tests cover `getLogicalFiles`.

### A. Core Functionality Tests

#### Basic Operation

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Retrieve all files with no filters or pagination |
| **Input Data** | `filename`: null, `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | All existing datasets (`~benchmark::*` files) |
| **Expected Output** | - Response contains list of files<br>- At least 5 files returned (benchmark datasets)<br>- No exceptions<br>- NumFiles > 0 |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array is not null<br>- Array length >= 5<br>- No exceptions thrown |
| **Notes** | Tests default behavior with minimal parameters. Baseline test. |

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Retrieve files matching exact filename |
| **Input Data** | `filename`: "~benchmark::integer::20KB", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | - Response contains exactly 1 file<br>- File name matches "benchmark::integer::20KB" (~ stripped)<br>- File metadata populated |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array length == 1<br>- File name equals "benchmark::integer::20KB"<br>- Owner, size, and modified date are populated<br>- No exceptions thrown |
| **Notes** | Tests exact name matching. Leading ~ should be stripped. |

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Retrieve files matching exact filename without leading tilde |
| **Input Data** | `filename`: "benchmark::integer::20KB", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | - Response contains exactly 1 file<br>- File name matches "benchmark::integer::20KB" |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array length == 1<br>- File name equals "benchmark::integer::20KB"<br>- No exceptions thrown |
| **Notes** | Tests that filename works with or without leading ~. |

#### Wildcard Patterns

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-004 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations - Wildcard Patterns |
| **Description** | Retrieve files matching wildcard pattern with asterisk |
| **Input Data** | `filename`: "benchmark::integer::*", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | `~benchmark::integer::20KB`, `~benchmark::integer::20kb::key` (existing) |
| **Expected Output** | - Response contains at least 2 files<br>- All file names start with "benchmark::integer::" |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array length >= 2<br>- All returned files match pattern "benchmark::integer::*"<br>- No exceptions thrown |
| **Notes** | Tests wildcard filtering with *. Should return both the dataset and the index file. |

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-005 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations - Wildcard Patterns |
| **Description** | Retrieve files matching scope-level wildcard |
| **Input Data** | `filename`: "benchmark::*", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | All `~benchmark::*` files (existing) |
| **Expected Output** | - Response contains all benchmark files<br>- At least 5 files returned |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array length >= 5<br>- All files have names starting with "benchmark::"<br>- No exceptions thrown |
| **Notes** | Tests broad wildcard pattern. Should return all benchmark datasets. |

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-006 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations - Wildcard Patterns |
| **Description** | Retrieve files matching wildcard at file level |
| **Input Data** | `filename`: "benchmark::all_types::*", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | `~benchmark::all_types::200KB`, `~benchmark::all_types::superfile` (existing) |
| **Expected Output** | - Response contains 2 files<br>- Files: benchmark::all_types::200KB and benchmark::all_types::superfile |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array length == 2<br>- Both expected files present<br>- No exceptions thrown |
| **Notes** | Tests wildcard at specific scope level. |

#### Pagination

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-007 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflows - Pagination |
| **Description** | Retrieve first page of results with pageSize=2 |
| **Input Data** | `filename`: "benchmark::*", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 2 |
| **Dataset** | All `~benchmark::*` files (existing) |
| **Expected Output** | - Response contains exactly 2 files<br>- PageSize == 2<br>- PageStartFrom == 0<br>- NextPageFrom > 0 (indicates more pages) |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array length == 2<br>- NextPageFrom != -1<br>- PrevPageFrom == -1 (no previous page)<br>- No exceptions thrown |
| **Notes** | Tests basic pagination. First page should have no previous page but should have next page. |

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-008 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflows - Pagination |
| **Description** | Retrieve second page of results |
| **Input Data** | `filename`: "benchmark::*", `cluster`: null, `firstN`: -1, `pageStartFrom`: 2, `pageSize`: 2 |
| **Dataset** | All `~benchmark::*` files (existing) |
| **Expected Output** | - Response contains files starting from index 2<br>- PageStartFrom == 2<br>- PrevPageFrom == 0 (previous page exists) |
| **Pass Criteria** | - Response is not null<br>- PageStartFrom == 2<br>- PrevPageFrom >= 0 (has previous page)<br>- Files are different from first page<br>- No exceptions thrown |
| **Notes** | Tests pagination navigation to second page. |

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-009 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflows - Pagination |
| **Description** | Navigate through multiple pages and verify consistency |
| **Input Data** | Multiple calls: page 1 (start=0, size=2), page 2 (start=2, size=2), page 3 (start=4, size=2) |
| **Dataset** | All `~benchmark::*` files (existing) |
| **Expected Output** | - Each page returns 2 files (until last page)<br>- No duplicate files across pages<br>- All files eventually returned<br>- Pagination metadata consistent |
| **Pass Criteria** | - No duplicate files across pages<br>- Page navigation fields correct for each page<br>- Total files across all pages matches NumFiles<br>- No exceptions thrown |
| **Notes** | Tests complete pagination workflow. Validates no data loss during pagination. |

#### FirstN Limit

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-010 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflows - FirstN Limit |
| **Description** | Retrieve first N=3 files using firstN parameter |
| **Input Data** | `filename`: "benchmark::*", `cluster`: null, `firstN`: 3, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | All `~benchmark::*` files (existing) |
| **Expected Output** | - Response contains exactly 3 files<br>- PageSize reflects firstN override<br>- PageStartFrom == 0 |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array length == 3<br>- PageSize == 3 (overridden by firstN)<br>- PageStartFrom == 0<br>- No exceptions thrown |
| **Notes** | Tests firstN parameter which overrides pagination. Pagination should be reset when firstN is used. |

#### File Type Variations

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-011 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations - File Types |
| **Description** | Retrieve regular file and verify metadata |
| **Input Data** | `filename`: "benchmark::integer::20KB", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | - File returned with correct metadata<br>- IsSuperfile == false<br>- IsDirectory == false<br>- File size approximately 20KB<br>- Record count == 1250 |
| **Pass Criteria** | - Response is not null<br>- 1 file returned<br>- IsSuperfile == false<br>- Owner populated<br>- TotalSize > 0<br>- Modified date populated<br>- No exceptions thrown |
| **Notes** | Tests regular file metadata population. Validates non-superfile flags. |

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-012 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations - File Types |
| **Description** | Retrieve superfile and verify superfile flag |
| **Input Data** | `filename`: "benchmark::all_types::superfile", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | `~benchmark::all_types::superfile` (existing) |
| **Expected Output** | - File returned with superfile metadata<br>- IsSuperfile == true<br>- File name == "benchmark::all_types::superfile" |
| **Pass Criteria** | - Response is not null<br>- 1 file returned<br>- IsSuperfile == true<br>- File name matches<br>- No exceptions thrown |
| **Notes** | Critical test for superfile identification. |

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-013 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations - File Types |
| **Description** | Retrieve index file and verify it appears in listing |
| **Input Data** | `filename`: "benchmark::integer::20kb::key", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | `~benchmark::integer::20kb::key` (existing) |
| **Expected Output** | - Index file returned<br>- File name == "benchmark::integer::20kb::key"<br>- Appropriate metadata populated |
| **Pass Criteria** | - Response is not null<br>- 1 file returned<br>- File name matches<br>- Metadata populated<br>- No exceptions thrown |
| **Notes** | Tests that index files are included in results. |

---

### B. Edge Case Tests

#### Boundary Values - Pagination

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values - Pagination |
| **Description** | Test pageSize = 0 (should default to 100) |
| **Input Data** | `filename`: "benchmark::*", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 0 |
| **Dataset** | All `~benchmark::*` files (existing) |
| **Expected Output** | - PageSize defaults to 100 in response<br>- Results returned normally |
| **Pass Criteria** | - Response is not null<br>- PageSize in response >= 1 (defaults to 100)<br>- Files returned<br>- No exceptions thrown |
| **Notes** | Tests default page size behavior when pageSize is invalid. |

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values - Pagination |
| **Description** | Test negative pageSize (should default to 100) |
| **Input Data** | `filename`: "benchmark::*", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: -10 |
| **Dataset** | All `~benchmark::*` files (existing) |
| **Expected Output** | - PageSize defaults to 100 in response<br>- Results returned normally |
| **Pass Criteria** | - Response is not null<br>- PageSize in response >= 1<br>- Files returned<br>- No exceptions thrown |
| **Notes** | Tests handling of negative page size. |

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values - Pagination |
| **Description** | Test pageSize = 1 (minimum valid page size) |
| **Input Data** | `filename`: "benchmark::*", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 1 |
| **Dataset** | All `~benchmark::*` files (existing) |
| **Expected Output** | - Exactly 1 file per page<br>- NextPageFrom indicates next page available |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array length == 1<br>- PageSize == 1<br>- NextPageFrom > 0<br>- No exceptions thrown |
| **Notes** | Tests minimum valid page size. |

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-004 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values - Pagination |
| **Description** | Test very large pageSize (e.g., 10000) |
| **Input Data** | `filename`: "benchmark::*", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 10000 |
| **Dataset** | All `~benchmark::*` files (existing) |
| **Expected Output** | - All matching files returned in single page<br>- NextPageFrom == -1 (no more pages) |
| **Pass Criteria** | - Response is not null<br>- All matching files returned<br>- NextPageFrom == -1<br>- No exceptions thrown |
| **Notes** | Tests large page size doesn't cause issues. |

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-005 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values - Pagination |
| **Description** | Test pageStartFrom beyond available files |
| **Input Data** | `filename`: "benchmark::integer::20KB", `cluster`: null, `firstN`: -1, `pageStartFrom`: 1000, `pageSize`: 10 |
| **Dataset** | `~benchmark::integer::20KB` (existing - only 1 file matches) |
| **Expected Output** | - Empty results (no files)<br>- No exceptions |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array empty or null<br>- No exceptions thrown |
| **Notes** | Tests pagination start beyond available data. |

#### Boundary Values - FirstN

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-006 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values - FirstN |
| **Description** | Test firstN = 0 (should return no files) |
| **Input Data** | `filename`: "benchmark::*", `cluster`: null, `firstN`: 0, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | All `~benchmark::*` files (existing) |
| **Expected Output** | - Empty results or minimal results<br>- PageSize == 0 |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array length == 0<br>- No exceptions thrown |
| **Notes** | Tests firstN=0 edge case. |

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-007 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values - FirstN |
| **Description** | Test firstN = 1 (minimum valid firstN) |
| **Input Data** | `filename`: "benchmark::*", `cluster`: null, `firstN`: 1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | All `~benchmark::*` files (existing) |
| **Expected Output** | - Exactly 1 file returned<br>- PageSize == 1 (overridden) |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array length == 1<br>- PageSize == 1<br>- No exceptions thrown |
| **Notes** | Tests minimum valid firstN value. |

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-008 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values - FirstN |
| **Description** | Test firstN = -1 (no limit) |
| **Input Data** | `filename`: "benchmark::*", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | All `~benchmark::*` files (existing) |
| **Expected Output** | - All files returned (up to pageSize)<br>- FirstN not applied |
| **Pass Criteria** | - Response is not null<br>- Files returned according to pageSize<br>- No exceptions thrown |
| **Notes** | Tests that firstN=-1 is correctly interpreted as "no limit". |

#### Empty/Null Parameters

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-009 |
| **Category** | Edge Case |
| **Subcategory** | Optional Parameters - Null Values |
| **Description** | Test with null filename (should return all files) |
| **Input Data** | `filename`: null, `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | All files in system |
| **Expected Output** | - Returns files (default filter "*")<br>- Multiple files returned |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array not empty<br>- At least some files returned<br>- No exceptions thrown |
| **Notes** | Tests default behavior with null filename. Should apply default "*" filter. |

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-010 |
| **Category** | Edge Case |
| **Subcategory** | Optional Parameters - Empty Values |
| **Description** | Test with empty string filename |
| **Input Data** | `filename`: "", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | All files in system |
| **Expected Output** | - Returns files (default filter "*")<br>- Multiple files returned |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array not empty<br>- No exceptions thrown |
| **Notes** | Tests handling of empty string filename. |

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-011 |
| **Category** | Edge Case |
| **Subcategory** | Optional Parameters - Cluster Parameter |
| **Description** | Test deprecated cluster parameter (should be ignored) |
| **Input Data** | `filename`: "benchmark::integer::20KB", `cluster`: "thor", `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | - File returned normally<br>- Cluster parameter ignored (deprecated) |
| **Pass Criteria** | - Response is not null<br>- 1 file returned<br>- Same result as when cluster is null<br>- No exceptions thrown |
| **Notes** | Verifies that deprecated cluster parameter doesn't break functionality. |

#### Unusual Valid Inputs

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-012 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Test filename with special characters in scope |
| **Input Data** | `filename`: "benchmark::all_types::*", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | `~benchmark::all_types::200KB`, `~benchmark::all_types::superfile` (existing) |
| **Expected Output** | - Files with underscores in name returned<br>- Pattern matching works with special characters |
| **Pass Criteria** | - Response is not null<br>- Both files returned<br>- Name matching handles underscores correctly<br>- No exceptions thrown |
| **Notes** | Tests pattern matching with special characters (underscores). |

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-013 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Test filename with double colons in pattern |
| **Input Data** | `filename`: "benchmark::all_types::200KB", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | `~benchmark::all_types::200KB` (existing) |
| **Expected Output** | - File with double colons in name returned<br>- Exact match works |
| **Pass Criteria** | - Response is not null<br>- 1 file returned<br>- Name matches exactly<br>- No exceptions thrown |
| **Notes** | Tests handling of scope separator (::) in filenames. |

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-014 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Test case sensitivity of filename pattern |
| **Input Data** | `filename`: "BENCHMARK::INTEGER::20KB", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | `~benchmark::integer::20KB` (existing) |
| **Expected Output** | - May return file if case-insensitive, or empty if case-sensitive |
| **Pass Criteria** | - Response is not null<br>- Consistent behavior (either case-sensitive or case-insensitive)<br>- No exceptions thrown |
| **Notes** | Tests whether file matching is case-sensitive. Behavior may depend on file system. |

#### Performance Edge Cases

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-015 |
| **Category** | Edge Case |
| **Subcategory** | Performance Limits |
| **Description** | Test with very broad wildcard that matches many files |
| **Input Data** | `filename`: "*", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | All files in system |
| **Expected Output** | - Returns up to pageSize files<br>- May include warning about subset results<br>- Pagination metadata populated |
| **Pass Criteria** | - Response is not null<br>- Files returned (up to pageSize or max limit)<br>- No timeout exceptions<br>- Handles large result sets gracefully |
| **Notes** | Tests system behavior with very broad query. May trigger max file limits. |

---

### C. Error Handling Tests

#### Invalid Inputs - Malformed Patterns

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs - Malformed Patterns |
| **Description** | Test with filename containing invalid characters |
| **Input Data** | `filename`: "benchmark::test<>file", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | N/A (invalid pattern) |
| **Expected Output** | - Empty results or exception<br>- Appropriate error handling |
| **Pass Criteria** | - Either empty results or clean exception<br>- No server crash<br>- Error message if exception occurs |
| **Notes** | Tests handling of invalid characters in filename. Behavior may vary by implementation. |

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs - Malformed Patterns |
| **Description** | Test with filename containing only wildcard |
| **Input Data** | `filename`: "*", `cluster`: null, `firstN`: 100, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | All files |
| **Expected Output** | - Returns files (valid wildcard)<br>- Up to firstN files returned |
| **Pass Criteria** | - Response is not null<br>- Files returned<br>- No exceptions thrown |
| **Notes** | Wildcard-only is valid, not an error case. Tests broad matching. |

#### Invalid Inputs - Nonexistent Files

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs - Nonexistent Files |
| **Description** | Test with filename that doesn't exist |
| **Input Data** | `filename`: "nonexistent::file::name", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | N/A (file doesn't exist) |
| **Expected Output** | - Empty results (no files match)<br>- NumFiles == 0<br>- No exception |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array empty or null<br>- NumFiles == 0<br>- No exceptions thrown |
| **Notes** | Non-matching pattern is valid, returns empty results. Not an error. |

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs - Nonexistent Files |
| **Description** | Test with wildcard pattern that matches no files |
| **Input Data** | `filename`: "bogus::scope::*", `cluster`: null, `firstN`: -1, `pageStartFrom`: 0, `pageSize`: 100 |
| **Dataset** | N/A (no files match) |
| **Expected Output** | - Empty results<br>- NumFiles == 0 |
| **Pass Criteria** | - Response is not null<br>- DFULogicalFiles array empty or null<br>- NumFiles == 0<br>- No exceptions thrown |
| **Notes** | Tests wildcard pattern with no matches. Should return empty results gracefully. |

#### Client-Side Errors

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-005 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors - Null Connection |
| **Description** | Test with uninitialized client (null stub) |
| **Input Data** | Use HPCCWsDFUClient with invalid/null connection<br>`filename`: "benchmark::integer::20KB", other params normal |
| **Dataset** | N/A |
| **Expected Output** | - Exception thrown<br>- Message contains "stub" or "client not available" |
| **Pass Criteria** | - Exception thrown<br>- Exception message indicates client initialization problem<br>- No server call attempted |
| **Notes** | Tests client-side validation. Requires creating client with invalid connection. |

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-006 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors - Invalid Connection |
| **Description** | Test with invalid server address |
| **Input Data** | Create client with connection to invalid host (e.g., "http://invalid.host.example:8010")<br>`filename`: "benchmark::integer::20KB" |
| **Dataset** | N/A |
| **Expected Output** | - Exception thrown<br>- RemoteException or connection error |
| **Pass Criteria** | - Exception thrown<br>- Exception type is RemoteException or AxisFault<br>- Error message indicates connection failure |
| **Notes** | Tests handling of invalid server address. May timeout - set appropriate timeout. |

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-007 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors - Timeout |
| **Description** | Test request timeout with very short timeout setting |
| **Input Data** | Create client with very short timeout (e.g., 1ms)<br>`filename`: "benchmark::*" |
| **Dataset** | All files |
| **Expected Output** | - Timeout exception or connection error |
| **Pass Criteria** | - Exception thrown<br>- Exception indicates timeout or connection failure<br>- No partial results returned |
| **Notes** | Tests timeout handling. Timeout value needs to be short enough to trigger timeout but may be environment-dependent. |

#### Server-Side Errors - Permission

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-008 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors - Permission |
| **Description** | Test with user lacking read permissions |
| **Input Data** | Create client with credentials of user without read access<br>`filename`: "benchmark::integer::20KB" |
| **Dataset** | N/A (requires restricted environment) |
| **Expected Output** | - ArrayOfEspExceptionWrapper thrown<br>- Error code: ECLWATCH_DFU_ACCESS_DENIED<br>- Message contains "Permission denied" |
| **Pass Criteria** | - ArrayOfEspExceptionWrapper thrown<br>- Exception contains permission-related error<br>- Error code matches expected |
| **Notes** | **SKIP if test environment doesn't support restricted users.** Requires environment with RBAC configured. |

---

## 8. New Dataset Specifications

**Analysis:** All required test scenarios can be covered using existing datasets:
- `~benchmark::all_types::200KB` - Regular file with complex schema
- `~benchmark::string::100MB` - Large file for size/performance tests  
- `~benchmark::integer::20KB` - Small file for basic tests
- `~benchmark::all_types::superfile` - Superfile testing
- `~benchmark::integer::20kb::key` - Index file testing

The existing `benchmark::*` scope provides:
- Multiple files for pagination testing
- Variety of file types (regular, super, index)
- Predictable naming patterns for wildcard testing
- Good size distribution (20KB to 100MB)

**No new datasets are required** for comprehensive testing of `getLogicalFiles`.

### Rationale
The existing datasets cover:
1. **File Type Diversity:** Regular files, superfiles, and index files
2. **Size Range:** From 20KB to 100MB provides adequate coverage
3. **Naming Patterns:** Consistent `benchmark::` prefix enables pattern matching tests
4. **Quantity:** 5+ files enable pagination and multi-result tests
5. **Schema Complexity:** Range from simple (integer) to complex (all_types) schemas

All test scenarios identified in Section 7 can be executed using these existing datasets without requiring additional data files.

---

## Summary

### Test Coverage Requirements
- **Total Test Cases Defined:** 51
  - Core Functionality Tests: 13
  - Edge Case Tests: 15
  - Error Handling Tests: 8
- **Dataset Usage:** All tests use existing datasets from `generate-datasets.ecl`
- **No New Datasets Required**

### Key Testing Areas
1. **Basic File Retrieval:** Exact name matching, wildcard patterns
2. **Pagination:** Multi-page navigation, boundary values, consistency
3. **FirstN Limiting:** Override behavior, edge cases
4. **File Types:** Regular files, superfiles, index files
5. **Edge Cases:** Null/empty inputs, boundary values, special characters
6. **Error Handling:** Invalid inputs, connection errors, permissions

### Implementation Notes
- All tests extend `BaseRemoteTest` 
- Tests should verify response is not null before accessing fields
- Pagination tests should validate consistency across pages
- Error tests should check both exception type and error message
- Permission tests may need to be skipped if RBAC not configured

### Priority Test Cases (Implement First)
1. **CFT-001:** Basic retrieval (baseline)
2. **CFT-002/003:** Exact name matching
3. **CFT-004/005:** Wildcard patterns
4. **CFT-007/008:** Basic pagination
5. **CFT-011/012:** File type verification
6. **EHT-003/004:** Empty results handling


---
*Generated: 2025-12-12*

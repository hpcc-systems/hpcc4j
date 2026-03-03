# WsWorkunits.fastWURefresh Test Case Analysis

**Generated:** 2026-01-13  
**Target Method:** `HPCCWsWorkUnitsClient.fastWURefresh(WorkunitWrapper wu)`  
**Test File Location:** `wsclient/src/test/java/org/hpccsystems/ws/client/WSWorkunitsTest.java`

---

## 1. Method Summary

### Purpose
The `fastWURefresh` method performs a lightweight refresh of a workunit's state information by querying the HPCC cluster for updated workunit details. It is designed to efficiently update a local `WorkunitWrapper` instance with the latest state from the server without fetching all workunit details (graphs, results, schemas, etc.).

### Role within Service
This method is a core utility for keeping workunit state synchronized with the HPCC cluster. It is used internally by other methods (e.g., `getWorkunit`) and can be called directly when only basic state information needs to be updated. If the workunit's state has changed, it triggers a full refresh via `fullWURefresh`.

### Inputs
- **wu** (`WorkunitWrapper`): A workunit wrapper object containing at minimum the WUID (Workunit ID). The method updates this object in-place with fresh data from the server.

### Outputs
- **void**: The method does not return a value. Instead, it modifies the passed `WorkunitWrapper` object directly.
- **Exceptions**: 
  - `java.lang.Exception`: Thrown for remote communication errors or general failures
  - `ArrayOfEspExceptionWrapper`: Thrown when the server returns ESP-level exceptions (validation errors, authorization issues, etc.)

### Side Effects
1. **Updates the WorkunitWrapper**: If the server returns valid workunit data, the wrapper's state fields are updated via `wu.update(eclWorkunit[0])`
2. **Triggers Full Refresh**: If the workunit state has changed (detected by comparing previous state to new state), the method calls `fullWURefresh(wu)` to fetch complete workunit details including graphs, results, schemas, and source files
3. **Server Query**: Makes a WUQuery request to the HPCC cluster with the following parameters:
   - `Wuid`: The workunit ID from the input wrapper
   - `Count`: Set to 1 (requesting only one workunit result)

### Implementation Details
```java
public void fastWURefresh(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper
{
    verifyStub(); // Ensures the stub is initialized
    
    WUQuery request = new WUQuery();
    WUState previousState = getStateID(wu);  // Capture current state
    
    request.setWuid(wu.getWuid());
    request.setCount(1);  // Only fetch the specified workunit
    
    WUQueryResponse response = ((WsWorkunits) stub).wUQuery(request);
    
    // Handle exceptions and update workunit
    if (response.getExceptions() != null)
        handleEspExceptions(...);
    
    if (response.getWorkunits() != null) {
        ECLWorkunit[] eclWorkunit = response.getWorkunits().getECLWorkunit();
        if (eclWorkunit != null && eclWorkunit.length == 1)
            wu.update(eclWorkunit[0]);  // Update wrapper with fresh data
    }
    
    // If state changed, perform full refresh
    if (previousState != getStateID(wu)) {
        fullWURefresh(wu);
    }
}
```

---

## 2. Existing Test Coverage Analysis

### Existing Tests Found

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| `stageB_fastWURefreshTest` | CFT | Basic operation with valid WUID | WUID from system property `testwuid`, created in previous test stage | - No exceptions thrown<br>- Method completes successfully<br>- Prints WUID to console | Basic integration test that assumes WUID exists from prior test execution |

### Coverage Summary

**Total existing test methods:** 1

**Core Functionality Tests covered (1):**
- Basic operation with a valid, previously created workunit (assumes UTF-8 test workunit from earlier test)

**Edge Case Tests covered (0):**
- No edge case tests currently exist

**Error Handling Tests covered (0):**
- No error handling tests currently exist

### Gaps Identified

The existing test coverage has significant gaps across all test categories:

**Core Functionality Gaps:**
1. No test for workunit in different states (submitted, running, completed, failed, blocked, etc.)
2. No test for workunit state change detection (verifying full refresh is triggered)
3. No test for archived workunits
4. No test with explicit workunit creation and cleanup within the test
5. No validation that the workunit data is actually updated correctly
6. No test for workunits on different cluster types (Thor vs Roxie)

**Edge Case Gaps:**
1. No test for non-existent WUID
2. No test for malformed WUID format
3. No test for null WorkunitWrapper parameter
4. No test for WorkunitWrapper with null/empty WUID
5. No test for rapid consecutive refresh calls
6. No test for workunit state transitions during refresh
7. No test for workunits with special characters in WUID (edge cases in WUID format)

**Error Handling Gaps:**
1. No test for server-side errors (exceptions in response)
2. No test for invalid WUID format handling
3. No test for connection failures
4. No test for timeout scenarios
5. No test for authorization/permission failures
6. No test for null stub (uninitialized client)
7. No test for malformed server response

**Dataset Integration:**
The existing test does not use any of the standard test datasets (`~benchmark::*`). Instead, it relies on a WUID created by a previous test method (`A1stageA_utf8Test`), which creates a simple workunit with `OUTPUT('¶')`. This approach has limitations:
- Test dependency on execution order (uses `@FixMethodOrder`)
- No control over workunit state at test time
- Cannot reliably test different workunit states or error conditions
- No isolation between tests

---

## 3. Request Structure

The `fastWURefresh` method internally creates a `WUQuery` request object. Below are all fields available in the WUQuery request:

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|---------------------|-------|
| **Wuid** | String | **Yes** (for fastWURefresh) | Workunit Unique Identifier | Format: `W[YYYYMMDD-HHMMSS-#]` (e.g., `W20240115-123456-1`) | Used by fastWURefresh to identify the specific workunit to query |
| **Type** | String | No | Workunit type filter | `""` (normal) or `"archived workunits"` | Not used by fastWURefresh (min_ver 1.01) |
| **Cluster** | String | No | Target cluster name filter | Any valid cluster name | Not used by fastWURefresh |
| **RoxieCluster** | String | No | Roxie cluster name filter | Any valid Roxie cluster name | Not used by fastWURefresh (min_ver 1.08) |
| **Owner** | String | No | Workunit owner filter | Username | Not used by fastWURefresh |
| **State** | String | No | Workunit state filter | `compiled`, `running`, `completed`, `failed`, `submitted`, `blocked`, `aborted`, etc. | Not used by fastWURefresh |
| **StartDate** | String | No | Start date range filter | ISO date format | Not used by fastWURefresh |
| **EndDate** | String | No | End date range filter | ISO date format | Not used by fastWURefresh |
| **ECL** | String | No | ECL code search filter | Any string | Not used by fastWURefresh |
| **Jobname** | String | No | Job name filter | Any string | Not used by fastWURefresh |
| **LogicalFile** | String | No | Logical file filter | File path | Not used by fastWURefresh |
| **LogicalFileSearchType** | String | No | File search type | Default: `""` | Not used by fastWURefresh |
| **ApplicationValues** | Array | No | Application-specific key-value filters | Array of ApplicationValue structures | Not used by fastWURefresh (min_ver 1.57) |
| **BeforeWU** | String | No | WUID pagination marker (before) | Valid WUID | Not used by fastWURefresh (min_ver 1.72) |
| **AfterWU** | String | No | WUID pagination marker (after) | Valid WUID | Not used by fastWURefresh (min_ver 1.72) |
| **TotalClusterTimeThresholdMilliSec** | Unsigned | No | Cluster time threshold filter | Non-negative integer, default: 0 | Not used by fastWURefresh (min_ver 1.77) |
| **Count** | Int | **Yes** (set by fastWURefresh) | Maximum number of workunits to return | Positive integer | **Always set to 1** by fastWURefresh |
| **PageSize** | Int64 | No | Page size for pagination | Non-negative, default: 0 | Not used by fastWURefresh (min_ver 1.03) |
| **PageStartFrom** | Int64 | No | Starting record index | Non-negative, default: 0 | Not used by fastWURefresh (min_ver 1.03) |
| **PageEndAt** | Int64 | No | Ending record index | Non-negative | Not used by fastWURefresh (min_ver 1.03) |
| **LastNDays** | Int | No | Filter by last N days | Positive integer | Not used by fastWURefresh (min_ver 1.26, deprecated 1.72) |
| **Protected** | Enum | No | Protection filter | `All`, `Protected`, `NotProtected` | Not used by fastWURefresh (min_ver 1.89) |
| **MinimumExecuteCost** | Double | No | Minimum execution cost filter | Non-negative, default: 0.0 | Not used by fastWURefresh (min_ver 2.02) |
| **MinimumFileAccessCost** | Double | No | Minimum file access cost filter | Non-negative, default: 0.0 | Not used by fastWURefresh (min_ver 2.02) |
| **MinimumCompileCost** | Double | No | Minimum compile cost filter | Non-negative, default: 0.0 | Not used by fastWURefresh (min_ver 2.02) |
| **Sortby** | String | No | Sort field | Field name (e.g., `Wuid`, `Owner`, `State`) | Not used by fastWURefresh |
| **Descending** | Boolean | No | Sort order | `true` or `false`, default: `false` | Not used by fastWURefresh |
| **CacheHint** | Int64 | No | Cache hint for response caching | Any int64 | Not used by fastWURefresh |

### Field Dependencies for fastWURefresh

The `fastWURefresh` method uses a **minimal request**:
1. **Wuid**: Must be set from `wu.getWuid()` - **REQUIRED**
2. **Count**: Always set to 1 - **REQUIRED**
3. All other fields are left unset (defaults apply)

### Default Behavior
- If `Wuid` is not set or empty: Server returns an error or no results
- If `Count` is not set: Server may return default number of results (implementation-dependent)
- All filter fields default to "no filter" if not specified

---

## 4. Server Behavior and Responses

### Server-Side Processing Logic

Based on the `onWUQuery` implementation in `/esp/services/ws_workunits/ws_workunitsService.cpp`:

1. **Request Parsing**: Server extracts WUID from request
2. **Query Routing**: Based on request parameters, the server routes to different handlers:
   - **Single WUID query** (fastWURefresh case): `doWUQueryBySingleWuid` is called when WUID pattern is detected
   - Archived workunits: `doWUQueryFromArchive` (if Type == "archived workunits")
   - File-based query: `doWUQueryByFile` (if LogicalFile + LogicalFileSearchType == "Created")
   - General query: `doWUQueryWithSort` (for filtered/sorted queries)
3. **Workunit Retrieval**: Server fetches workunit details from the workunit store
4. **Response Construction**: Builds WUQueryResponse with matching workunits

### Valid Response Structure

The `WUQueryResponse` contains:

| Response Field | Type | Description | Expected for fastWURefresh |
|----------------|------|-------------|---------------------------|
| **Exceptions** | ArrayOfEspException | Server-side exceptions/warnings | Should be null for successful queries |
| **Workunits** | ArrayOfECLWorkunit | Array of matching workunits | Should contain exactly 1 workunit if WUID exists |
| **Type** | String | Echo of request Type parameter | Empty string (default) |
| **Cluster** | String | Echo of request Cluster | Empty (not set by fastWURefresh) |
| **RoxieCluster** | String | Echo of request RoxieCluster | Empty (not set by fastWURefresh) |
| **Owner** | String | Echo of request Owner | Empty (not set by fastWURefresh) |
| **State** | String | Echo of request State | Empty (not set by fastWURefresh) |
| **StartDate** | String | Echo of request StartDate | Empty (not set by fastWURefresh) |
| **EndDate** | String | Echo of request EndDate | Empty (not set by fastWURefresh) |
| **NumWUs** | Int | Total number of matching workunits | 1 if WUID exists, 0 if not found |
| **Count** | Int | Number of workunits returned in this response | 1 or 0 |
| **PageSize** | Int64 | Page size (pagination) | 0 (not used) |
| **PrevPage** | Int64 | Previous page marker | Not set |
| **NextPage** | Int64 | Next page marker | Not set |
| **LastPage** | Int64 | Last page marker | -1 (default) |
| **First** | Boolean | Whether this is the first page | true |
| **PageStartFrom** | Int64 | Starting record index | -1 (default) |
| **PageEndAt** | Int64 | Ending record index | Not set |
| **Sortby** | String | Echo of request Sortby | Empty |
| **Descending** | Boolean | Echo of request Descending | false |
| **BasicQuery** | String | Query string summary | May contain WUID parameter |
| **Filters** | String | Applied filters | May contain filter details |
| **CacheHint** | Int64 | Cache hint value | May be set by server |

### ECLWorkunit Structure (Partial)

When `Workunits` array contains data, each `ECLWorkunit` includes fields like:
- **Wuid**: Workunit ID
- **StateID**: Numeric state code
- **StateEx**: Extended state information
- **Owner**: Workunit owner
- **Cluster**: Target cluster
- **Jobname**: Job name
- **TotalClusterTime**: Execution time
- And many other fields (graphs, results, etc. not included in fast refresh)

### Response Scenarios

#### Scenario 1: Valid WUID, Workunit Exists
- **Workunits** array contains 1 ECLWorkunit
- **NumWUs**: 1
- **Count**: 1
- **Exceptions**: null or empty
- Client updates wrapper with returned workunit data

#### Scenario 2: Valid WUID, Workunit Not Found
- **Workunits**: null or empty array
- **NumWUs**: 0
- **Count**: 0
- **Exceptions**: May contain "Workunit not found" exception
- Client wrapper remains unchanged

#### Scenario 3: Invalid WUID Format
- **Workunits**: null or empty
- **Exceptions**: Contains validation error
- Client throws `ArrayOfEspExceptionWrapper`

#### Scenario 4: Server Error
- **Exceptions**: Contains error details
- **Workunits**: null or incomplete
- Client throws exception or handles error

#### Scenario 5: State Change Detected
- **Workunits** array contains workunit with different `StateID` than before
- Client detects state change: `previousState != getStateID(wu)`
- Client triggers `fullWURefresh(wu)` to fetch complete workunit details

---

## 5. Error Handling

### Server-Side Errors

These errors originate from the HPCC ESP service and are returned in the `Exceptions` field of `WUQueryResponse`:

| Error Type | Trigger Condition | Response Behavior | Client Handling |
|------------|-------------------|-------------------|-----------------|
| **Workunit Not Found** | WUID does not exist in workunit store | `Exceptions` contains "Workunit not found" message, `NumWUs = 0` | `handleEspExceptions()` throws `ArrayOfEspExceptionWrapper` |
| **Invalid WUID Format** | WUID doesn't match expected pattern | `Exceptions` contains validation error | `handleEspExceptions()` throws `ArrayOfEspExceptionWrapper` |
| **Access Denied** | User lacks permission to view workunit | `Exceptions` contains authorization error | `handleEspExceptions()` throws `ArrayOfEspExceptionWrapper` |
| **Archived Workunit** | Workunit is archived but Type not set to "archived workunits" | May return empty result or exception | Depends on server configuration |
| **Internal Server Error** | Server-side processing failure | `Exceptions` contains error details | `handleEspExceptions()` throws `ArrayOfEspExceptionWrapper` |
| **Database/Storage Error** | Cannot access workunit store | `Exceptions` contains storage error | `handleEspExceptions()` throws `ArrayOfEspExceptionWrapper` |

### Client-Side Errors

These errors occur in the Java client before or during communication with the server:

| Error Type | Trigger Condition | Exception Type | Error Message |
|------------|-------------------|----------------|---------------|
| **RemoteException** | Network failure, connection timeout, HTTP error | `java.lang.Exception` | "WsWorkunits.fastWURefresh(...) encountered RemoteException." |
| **EspSoapFault** | SOAP-level fault from server | Handled by `handleEspSoapFaults()` | "Could Not perform fastWURefresh" |
| **Null WorkunitWrapper** | `wu` parameter is null | `NullPointerException` | Likely occurs when calling `wu.getWuid()` |
| **Null/Empty WUID** | `wu.getWuid()` returns null or empty | Server returns empty result or error | May result in `ArrayOfEspExceptionWrapper` |
| **Stub Not Initialized** | `verifyStub()` fails | `Exception` | Error from `verifyStub()` method |
| **Malformed Response** | Server returns unexpected response format | `NullPointerException` or parsing error | Occurs when accessing response fields |
| **State Comparison Error** | Error during state comparison | `Exception` | Error from `getStateID()` method |

### Exception Handling Flow

```java
try {
    response = ((WsWorkunits) stub).wUQuery(request);
} 
catch (RemoteException e) {
    throw new Exception("WsWorkunits.fastWURefresh(...) encountered RemoteException.", e);
}
catch (EspSoapFault e) {
    handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform fastWURefresh");
}

if (response != null) {
    if (response.getExceptions() != null)
        handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), 
                          "Could Not perform fastWURefresh");
    // Process workunits...
}
```

### Error Recovery

The method does **not** implement retry logic or fallback mechanisms. All errors are propagated to the caller as exceptions. The calling code must handle:
1. Catching and logging exceptions
2. Implementing retry logic if desired
3. Handling partial updates (wrapper may be partially modified if update occurs before state check)

---

## 6. Existing Dataset Analysis

The available test datasets are primarily designed for data access testing (file reading, schema validation) rather than workunit operations. Here's their applicability to `fastWURefresh` testing:

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | **No** | This is a data file, not a workunit. fastWURefresh requires a valid WUID, not a dataset name. However, this dataset could be **used to create workunits** by running ECL that reads/processes this file. |
| `~benchmark::string::100MB` | **No** | Same as above - this is a data file. Could be used in ECL code to create workunits for testing. |
| `~benchmark::integer::20KB` | **No** | Same as above - this is a data file. Could be used in ECL code to create workunits for testing. |
| `~benchmark::all_types::superfile` | **No** | This is a superfile, not a workunit. Could be used to create workunits that access superfiles. |
| `~benchmark::integer::20kb::key` | **No** | This is an index file, not a workunit. Could be used in ECL that performs index operations. |

### Dataset Usage Strategy

Since `fastWURefresh` operates on **workunits** rather than **datasets**, the testing strategy must involve:

1. **Workunit Creation**: Tests must create workunits programmatically using the existing datasets as data sources
2. **State Manipulation**: Tests should create workunits in different states (submitted, running, completed, failed)
3. **WUID Management**: Tests must track WUIDs and clean up after execution

### Example Workunit Creation Pattern

```java
// Create a workunit using existing dataset
WorkunitWrapper wu = new WorkunitWrapper();
wu.setECL("OUTPUT(DATASET('~benchmark::integer::20KB', {integer key, integer fill}, FLAT));");
wu.setJobname("FastRefreshTest_BasicOperation");
wu.setCluster(thorclustername);

// Submit and get WUID
WURunResponseWrapper response = client.createAndRunWUFromECLWrapped(wu);
String wuid = response.getWuid();

// Now test fastWURefresh with this WUID
WorkunitWrapper refreshWu = new WorkunitWrapper();
refreshWu.setWuid(wuid);
client.fastWURefresh(refreshWu);

// Validate results...

// Cleanup
client.deleteWU(wuid);
```

### Why Existing Datasets Don't Directly Apply

The existing datasets are **HPCC data files** (flat files, superfiles, indexes) stored in the distributed file system. The `fastWURefresh` method queries the **workunit store** (metadata about ECL jobs), not the file system. These are separate subsystems:

- **DFS (Distributed File System)**: Stores data files (managed by `~benchmark::*` datasets)
- **Workunit Store**: Stores workunit metadata (job definitions, state, results) - this is what `fastWURefresh` queries

Therefore, tests must **create workunits** that may or may not reference these datasets, but the datasets themselves are not the primary test artifacts.

---

## 7. Test Case Plan

**CRITICAL NOTE**: The following test cases represent scenarios that are **NOT covered** by the existing `stageB_fastWURefreshTest`. Each test case fills a gap identified in Section 2 (Existing Test Coverage Analysis).

All test cases below assume:
- An initialized `HPCCWsWorkUnitsClient` instance
- A valid connection to an HPCC cluster
- Appropriate cleanup after each test

### Test ID Convention
- **CFT-XXX**: Core Functionality Tests
- **ECT-XXX**: Edge Case Tests  
- **EHT-XXX**: Error Handling Tests

---

### A. Core Functionality Tests

These tests verify the method's primary purpose with various workunit states and scenarios.

#### CFT-001: Refresh Completed Workunit

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Refresh a workunit in completed state and verify data is updated |
| **Input Data** | Create a simple workunit that completes quickly:<br>- ECL: `OUTPUT('FastRefresh_Test_001');`<br>- Jobname: `FastRefreshTest_Completed`<br>- Cluster: `thorclustername`<br>Wait for completion, then call fastWURefresh |
| **Dataset** | Uses inline ECL (no external dataset required) |
| **Expected Output** | - WorkunitWrapper state updated to "completed"<br>- StateID matches server state<br>- No exceptions thrown<br>- Workunit data fields populated (Owner, Jobname, etc.) |
| **Pass Criteria** | - Method executes without exception<br>- `wu.getState()` returns "completed"<br>- `wu.getStateID()` is WUStateCompleted constant<br>- `wu.getOwner()` is populated<br>- `wu.getJobname()` matches expected value |
| **Notes** | This establishes baseline for successful refresh. Differs from existing test by explicitly verifying state and field values |

---

#### CFT-002: Refresh Workunit in Running State

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Refresh a workunit while it is in running state |
| **Input Data** | Create a long-running workunit:<br>- ECL: `OUTPUT(LOOP(DATASET([{1}], {INTEGER val}), 10000000, val+1));`<br>- Jobname: `FastRefreshTest_Running`<br>- Submit but don't wait, immediately call fastWURefresh |
| **Dataset** | Uses inline ECL with LOOP to create long-running job |
| **Expected Output** | - StateID is WUStateRunning or WUStateSubmitted<br>- State reflects execution status<br>- Workunit data updated<br>- Full refresh triggered if state changed from previous |
| **Pass Criteria** | - Method executes without exception<br>- `wu.getState()` is "running", "submitted", or transitioning state<br>- Workunit fields populated<br>- If state changed during refresh, verify fullWURefresh was called (check for graphs/results populated) |
| **Notes** | Tests refresh during active execution. Should cleanup by aborting workunit after test. This scenario is not covered by existing test. |

---

#### CFT-003: Refresh Workunit in Failed State

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Refresh a workunit that has failed |
| **Input Data** | Create a workunit that will fail:<br>- ECL: `OUTPUT(1/0);` (division by zero)<br>- Jobname: `FastRefreshTest_Failed`<br>- Wait for failure, then call fastWURefresh |
| **Dataset** | Uses inline ECL designed to fail |
| **Expected Output** | - StateID is WUStateFailed<br>- State is "failed"<br>- Exception information available in workunit<br>- No client exception (server successfully returns failed WU info) |
| **Pass Criteria** | - Method executes without exception<br>- `wu.getState()` returns "failed"<br>- `wu.getStateID()` is WUStateFailed constant<br>- Workunit contains error information |
| **Notes** | Verifies refresh handles failed workunits correctly. Existing test does not cover failed state. |

---

#### CFT-004: Detect State Change and Trigger Full Refresh

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-004 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflows |
| **Description** | Verify that a state change triggers fullWURefresh |
| **Input Data** | 1. Create and submit workunit without waiting<br>2. Call fastWURefresh immediately (likely state: submitted)<br>3. Wait briefly<br>4. Call fastWURefresh again (state should change to running/completed)<br>5. Verify full refresh occurred on second call |
| **Dataset** | Workunit using `~benchmark::integer::20KB`:<br>- ECL: `ds := DATASET('~benchmark::integer::20KB', {INTEGER key, INTEGER fill}, FLAT); OUTPUT(COUNT(ds));`<br>- Medium execution time |
| **Expected Output** | - First refresh: basic state update<br>- Second refresh: state changed, full refresh triggered<br>- After full refresh: graphs, results, schemas populated |
| **Pass Criteria** | - First call: `wu.getGraphs()` is null or empty<br>- Second call (after state change): `wu.getGraphs()` is populated<br>- `wu.getResults()` is populated after state change<br>- Verify state progression (submitted → running/completed) |
| **Notes** | This is a key workflow test validating the state change detection logic. Not covered by existing test. |

---

#### CFT-005: Refresh Workunit with Results

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-005 |
| **Category** | Core Functionality |
| **Subcategory** | Complete Request |
| **Description** | Refresh a completed workunit that has results and verify basic info is updated |
| **Input Data** | Create workunit with multiple outputs:<br>- ECL: `OUTPUT('Result1'); OUTPUT(123); OUTPUT(DATASET([{1,'A'},{2,'B'}], {INTEGER id, STRING1 val}));`<br>- Jobname: `FastRefreshTest_WithResults`<br>- Wait for completion |
| **Dataset** | Uses inline ECL with multiple OUTPUT statements |
| **Expected Output** | - Workunit state is "completed"<br>- Basic workunit info updated<br>- Results metadata available after full refresh (if state changed) |
| **Pass Criteria** | - Method executes without exception<br>- `wu.getState()` is "completed"<br>- After full refresh: `wu.getResults()` contains result metadata<br>- Result count > 0 |
| **Notes** | Validates refresh with result-bearing workunits. Existing test doesn't verify results. |

---

#### CFT-006: Refresh Compiled Workunit (Not Submitted)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-006 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Refresh a workunit that has been compiled but not submitted for execution |
| **Input Data** | Create workunit without submitting:<br>- ECL: `OUTPUT('NotSubmitted');`<br>- Jobname: `FastRefreshTest_Compiled`<br>- Do NOT call submit() |
| **Dataset** | Uses inline ECL |
| **Expected Output** | - StateID is WUStateCompiled<br>- State is "compiled"<br>- Workunit exists but not executed |
| **Pass Criteria** | - Method executes without exception<br>- `wu.getState()` is "compiled"<br>- `wu.getStateID()` is WUStateCompiled<br>- No results or execution data |
| **Notes** | Tests refresh of unexecuted workunit. Not covered by existing test. |

---

#### CFT-007: Refresh Archived Workunit

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-007 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Refresh a workunit that has been archived |
| **Input Data** | 1. Create and complete a workunit<br>2. Archive it using appropriate API<br>3. Call fastWURefresh on archived workunit |
| **Dataset** | Uses inline ECL: `OUTPUT('ArchivedTest');` |
| **Expected Output** | - Method may succeed or return "not found" depending on server configuration<br>- If server supports archived query, workunit info returned<br>- Otherwise, appropriate exception |
| **Pass Criteria** | - If server supports archived WU query: refresh succeeds, state populated<br>- If not supported: `ArrayOfEspExceptionWrapper` thrown with "not found" or similar message<br>- No unexpected exceptions |
| **Notes** | Behavior depends on server configuration. Test should handle both cases gracefully. Not covered by existing test. |

---

#### CFT-008: Multiple Consecutive Refreshes

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-008 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflows |
| **Description** | Call fastWURefresh multiple times in succession on same workunit |
| **Input Data** | Create completed workunit, then call fastWURefresh 5 times consecutively |
| **Dataset** | Uses `~benchmark::integer::20KB`:<br>- ECL: `OUTPUT(DATASET('~benchmark::integer::20KB', {INTEGER key, INTEGER fill}, FLAT));` |
| **Expected Output** | - All calls succeed<br>- Workunit data remains consistent<br>- No state changes (no full refresh triggered after first call)<br>- Server may use caching |
| **Pass Criteria** | - All 5 calls execute without exception<br>- State remains "completed" throughout<br>- Workunit data consistent across calls<br>- No performance degradation |
| **Notes** | Validates stability of repeated refresh calls. Not covered by existing test. |

---

### B. Edge Case Tests

These tests explore boundary conditions and unusual but valid scenarios.

#### ECT-001: Refresh with Non-Existent WUID

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Attempt to refresh a workunit with a valid WUID format but non-existent WUID |
| **Input Data** | WorkunitWrapper with WUID: `W20990101-000000-1` (far future date, unlikely to exist) |
| **Dataset** | N/A |
| **Expected Output** | - Server returns empty workunits array<br>- May return exception: "Workunit not found"<br>- WorkunitWrapper remains unchanged |
| **Pass Criteria** | - Either: `ArrayOfEspExceptionWrapper` thrown with "not found" message<br>- Or: Method completes but `response.getWorkunits()` is null/empty, wrapper unchanged<br>- No unexpected exceptions (NPE, etc.) |
| **Notes** | Tests handling of valid format but non-existent WUID. Not covered by existing test. |

---

#### ECT-002: Refresh with Malformed WUID (Invalid Format)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Attempt to refresh with an improperly formatted WUID |
| **Input Data** | WorkunitWrapper with invalid WUID formats:<br>- `INVALID`<br>- `W12345` (incomplete)<br>- `X20240115-123456-1` (wrong prefix)<br>- `W2024-01-15-12:34:56` (wrong format) |
| **Dataset** | N/A |
| **Expected Output** | - Server validation error in Exceptions<br>- `ArrayOfEspExceptionWrapper` thrown |
| **Pass Criteria** | - `ArrayOfEspExceptionWrapper` thrown for each invalid format<br>- Exception message indicates invalid WUID or validation error<br>- No server crash or unexpected errors |
| **Notes** | Tests server-side validation of WUID format. Not covered by existing test. |

---

#### ECT-003: Refresh with Empty WUID

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Call fastWURefresh with an empty WUID string |
| **Input Data** | WorkunitWrapper with `wu.setWuid("")` |
| **Dataset** | N/A |
| **Expected Output** | - Server may return error or empty result<br>- Exception likely thrown |
| **Pass Criteria** | - Either: `ArrayOfEspExceptionWrapper` with validation error<br>- Or: Empty response with no exceptions<br>- No client-side NPE or crash |
| **Notes** | Tests handling of empty WUID. Not covered by existing test. |

---

#### ECT-004: Refresh with Null WUID

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-004 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Call fastWURefresh with a null WUID in wrapper |
| **Input Data** | WorkunitWrapper with `wu.setWuid(null)` or WUID never set |
| **Dataset** | N/A |
| **Expected Output** | - Likely: `NullPointerException` or similar when building request<br>- Or: Server returns error for missing WUID |
| **Pass Criteria** | - Exception thrown (NPE or server validation error)<br>- Method does not hang or crash JVM<br>- Clear error message |
| **Notes** | Tests null handling. Not covered by existing test. Client should validate input. |

---

#### ECT-005: Refresh Workunit with Very Long Jobname

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-005 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Refresh a workunit that has an extremely long jobname (boundary test) |
| **Input Data** | Create workunit with jobname = 1000 character string:<br>- ECL: `OUTPUT('Test');`<br>- Jobname: String of 1000 'A' characters<br>- Submit and complete |
| **Dataset** | Uses inline ECL |
| **Expected Output** | - Workunit created and refreshed successfully<br>- Jobname truncated or stored as-is depending on server limits<br>- No exceptions |
| **Pass Criteria** | - Method executes without exception<br>- `wu.getJobname()` returns the jobname (possibly truncated)<br>- State is "completed" |
| **Notes** | Tests handling of boundary values in workunit metadata. Not covered by existing test. |

---

#### ECT-006: Refresh Workunit with Special Characters in Metadata

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-006 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Refresh workunit with special characters (UTF-8, XML entities) in jobname/ECL |
| **Input Data** | Create workunit with:<br>- ECL: `OUTPUT('Special: <>&"\'¶€');`<br>- Jobname: `Test_特殊文字_¶_<>&` |
| **Dataset** | Uses inline ECL with special characters |
| **Expected Output** | - Workunit created and refreshed<br>- Special characters preserved or properly escaped<br>- No encoding errors |
| **Pass Criteria** | - Method executes without exception<br>- `wu.getJobname()` contains special characters correctly encoded<br>- ECL text preserved |
| **Notes** | Tests UTF-8 and special character handling. Existing test has basic UTF-8 test but not for refresh operation. |

---

#### ECT-007: Refresh Workunit on Different Cluster Types

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-007 |
| **Category** | Edge Case |
| **Subcategory** | Data Variations |
| **Description** | Refresh workunits created on different cluster types (Thor vs Roxie if available) |
| **Input Data** | Create two workunits:<br>1. Thor cluster: `OUTPUT('Thor_Test');`<br>2. Roxie cluster: `OUTPUT('Roxie_Test');`<br>Refresh both |
| **Dataset** | Uses inline ECL |
| **Expected Output** | - Both workunits refresh successfully<br>- Cluster information correctly populated |
| **Pass Criteria** | - Both `fastWURefresh` calls succeed<br>- `wu.getCluster()` matches expected cluster name<br>- No cluster-specific errors |
| **Notes** | Tests cross-cluster functionality. Requires test environment with multiple cluster types. Not covered by existing test. |

---

#### ECT-008: Refresh Immediately After Workunit Creation

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-008 |
| **Category** | Edge Case |
| **Subcategory** | Performance Limits |
| **Description** | Call fastWURefresh immediately after workunit creation (before submission) |
| **Input Data** | 1. Create workunit (don't submit)<br>2. Immediately call fastWURefresh<br>- ECL: `OUTPUT('ImmediateRefresh');` |
| **Dataset** | Uses inline ECL |
| **Expected Output** | - Workunit state is "created" or "compiled"<br>- Refresh succeeds<br>- Basic metadata populated |
| **Pass Criteria** | - Method executes without exception<br>- `wu.getState()` is "created" or "compiled"<br>- WUID matches created workunit |
| **Notes** | Tests timing edge case. Not covered by existing test. |

---

#### ECT-009: Refresh Protected Workunit

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-009 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Refresh a workunit that has been marked as protected |
| **Input Data** | 1. Create and complete workunit<br>2. Set workunit as protected using appropriate API<br>3. Call fastWURefresh |
| **Dataset** | Uses inline ECL: `OUTPUT('ProtectedTest');` |
| **Expected Output** | - Refresh succeeds<br>- Protected status may be visible in workunit metadata<br>- No access denied errors (same user) |
| **Pass Criteria** | - Method executes without exception<br>- Workunit data updated<br>- `wu.getProtected()` returns true (if API exposes this) |
| **Notes** | Tests protected workunit handling. Not covered by existing test. |

---

#### ECT-010: Refresh Blocked Workunit

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-010 |
| **Category** | Edge Case |
| **Subcategory** | Data Variations |
| **Description** | Refresh a workunit in blocked state (if server supports blocking) |
| **Input Data** | Create workunit that will be blocked by queue or resource limits |
| **Dataset** | May require server configuration to create blocked state |
| **Expected Output** | - StateID is WUStateBlocked<br>- State is "blocked"<br>- Refresh succeeds |
| **Pass Criteria** | - Method executes without exception<br>- `wu.getState()` is "blocked"<br>- Workunit metadata populated |
| **Notes** | Tests less common state. May require specific server configuration. Not covered by existing test. |

---

### C. Error Handling Tests

These tests verify proper handling of invalid inputs and error conditions.

#### EHT-001: Null WorkunitWrapper Parameter

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Call fastWURefresh with null WorkunitWrapper |
| **Input Data** | `client.fastWURefresh(null)` |
| **Dataset** | N/A |
| **Expected Output** | - `NullPointerException` thrown<br>- Or: `IllegalArgumentException` if client validates input |
| **Pass Criteria** | - Exception thrown (NPE or IllegalArgumentException)<br>- Clear error message<br>- No JVM crash |
| **Notes** | Tests null parameter handling. Not covered by existing test. Client should add input validation. |

---

#### EHT-002: Uninitialized Client (Stub Verification Failure)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Call fastWURefresh on client with failed stub initialization |
| **Input Data** | Create client with invalid connection or force stub initialization to fail, then call fastWURefresh |
| **Dataset** | N/A |
| **Expected Output** | - Exception from `verifyStub()` call<br>- Clear error about uninitialized client |
| **Pass Criteria** | - Exception thrown before making server call<br>- Error message indicates stub/initialization problem<br>- No network call attempted |
| **Notes** | Tests pre-condition checking. Not covered by existing test. |

---

#### EHT-003: Network Failure / Connection Timeout

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Communication Failures |
| **Description** | Simulate network failure or connection timeout during refresh |
| **Input Data** | 1. Create valid workunit<br>2. Disconnect network or point client to unreachable host<br>3. Call fastWURefresh |
| **Dataset** | N/A |
| **Expected Output** | - `RemoteException` caught<br>- Wrapped in `Exception` with message: "WsWorkunits.fastWURefresh(...) encountered RemoteException." |
| **Pass Criteria** | - Exception thrown with expected message<br>- Original `RemoteException` available as cause<br>- No hang or infinite retry |
| **Notes** | Tests network error handling. Difficult to simulate; may use mock server or firewall rules. Not covered by existing test. |

---

#### EHT-004: Server Returns EspSoapFault

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Trigger a SOAP fault from the server |
| **Input Data** | Attempt to cause SOAP fault (e.g., authentication failure, malformed request) |
| **Dataset** | N/A |
| **Expected Output** | - `EspSoapFault` caught<br>- Handled by `handleEspSoapFaults()`<br>- Exception message: "Could Not perform fastWURefresh" |
| **Pass Criteria** | - Appropriate exception thrown<br>- Error message contains "Could Not perform fastWURefresh"<br>- SOAP fault details available |
| **Notes** | Tests SOAP-level error handling. May require authentication failure or server misconfiguration. Not covered by existing test. |

---

#### EHT-005: Server Returns ESP Exceptions (Validation Error)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-005 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Server returns response with Exceptions array populated (e.g., invalid WUID) |
| **Input Data** | WorkunitWrapper with clearly invalid WUID: `XXXXXXXXXX` |
| **Dataset** | N/A |
| **Expected Output** | - Response contains Exceptions<br>- `ArrayOfEspExceptionWrapper` thrown by `handleEspExceptions()`<br>- Exception message: "Could Not perform fastWURefresh" |
| **Pass Criteria** | - `ArrayOfEspExceptionWrapper` thrown<br>- Exception contains validation error details<br>- Error message clear and actionable |
| **Notes** | Tests ESP exception handling. Not covered by existing test. |

---

#### EHT-006: Server Returns Empty Response

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-006 |
| **Category** | Error Handling |
| **Subcategory** | Unexpected Response Formats |
| **Description** | Server returns null or empty response object |
| **Input Data** | May require mock server or unusual server condition |
| **Dataset** | N/A |
| **Expected Output** | - `response == null` check prevents NPE<br>- Workunit wrapper remains unchanged<br>- No exception if response is merely empty (vs. null) |
| **Pass Criteria** | - No `NullPointerException`<br>- Method completes (possibly with no update)<br>- Graceful handling of empty response |
| **Notes** | Tests defensive coding. Not covered by existing test. |

---

#### EHT-007: Server Returns Response with Null Workunits Array

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-007 |
| **Category** | Error Handling |
| **Subcategory** | Unexpected Response Formats |
| **Description** | Server response has null workunits array (e.g., WUID not found but no exception) |
| **Input Data** | Non-existent WUID that returns empty response without exception |
| **Dataset** | N/A |
| **Expected Output** | - `response.getWorkunits() == null`<br>- Workunit wrapper remains unchanged<br>- No NPE |
| **Pass Criteria** | - No exception thrown<br>- Workunit wrapper state unchanged<br>- No NPE when checking workunits array |
| **Notes** | Tests null-safety. Not covered by existing test. |

---

#### EHT-008: Server Returns Workunits Array with Length != 1

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-008 |
| **Category** | Error Handling |
| **Subcategory** | Unexpected Response Formats |
| **Description** | Server returns workunits array with 0 or >1 elements despite Count=1 request |
| **Input Data** | Requires unusual server behavior or mock |
| **Dataset** | N/A |
| **Expected Output** | - Code checks `eclWorkunit.length == 1`<br>- If not 1, no update occurs<br>- No exception thrown (graceful handling) |
| **Pass Criteria** | - No exception<br>- Workunit wrapper unchanged if length != 1<br>- No array index errors |
| **Notes** | Tests defensive array handling. Not covered by existing test. |

---

#### EHT-009: Concurrent Refresh Calls on Same Workunit

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-009 |
| **Category** | Error Handling |
| **Subcategory** | Concurrency Issues |
| **Description** | Multiple threads call fastWURefresh on same WorkunitWrapper simultaneously |
| **Input Data** | 1. Create completed workunit<br>2. Spawn 10 threads all calling `client.fastWURefresh(wu)` with same wrapper instance |
| **Dataset** | Uses inline ECL: `OUTPUT('ConcurrencyTest');` |
| **Expected Output** | - All threads complete without exception<br>- No race conditions or corruption<br>- Final workunit state is consistent |
| **Pass Criteria** | - All threads complete successfully<br>- No `ConcurrentModificationException`<br>- Workunit data remains valid<br>- No deadlocks |
| **Notes** | Tests thread-safety. `updateState()` is synchronized, but test validates overall safety. Not covered by existing test. |

---

#### EHT-010: Authorization Failure (Access Denied)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-010 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Attempt to refresh a workunit without proper permissions |
| **Input Data** | 1. Create workunit as user A<br>2. Create client with user B credentials (no access to A's WUs)<br>3. Call fastWURefresh |
| **Dataset** | Uses inline ECL: `OUTPUT('AuthTest');` |
| **Expected Output** | - Server returns authorization error in Exceptions<br>- `ArrayOfEspExceptionWrapper` thrown<br>- Error message indicates access denied |
| **Pass Criteria** | - `ArrayOfEspExceptionWrapper` thrown<br>- Exception message contains "access denied", "permission", or similar<br>- No data leakage |
| **Notes** | Tests security and authorization. Requires multi-user test environment. Not covered by existing test. |

---

#### EHT-011: State Comparison Error During Refresh

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-011 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Error occurs during state comparison (previousState != getStateID(wu)) |
| **Input Data** | Create workunit with unusual or corrupted state data |
| **Dataset** | N/A |
| **Expected Output** | - Exception from `getStateID()` or comparison<br>- Error propagated to caller |
| **Pass Criteria** | - Exception thrown with clear message<br>- No silent failure<br>- Workunit wrapper in consistent state |
| **Notes** | Tests error handling in state change detection. Difficult to trigger without mock. Not covered by existing test. |

---

#### EHT-012: Full Refresh Failure After State Change

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-012 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | State change detected but fullWURefresh fails |
| **Input Data** | 1. Create workunit that will change state<br>2. Cause fullWURefresh to fail (disconnect, permission change, etc.)<br>3. Call fastWURefresh when state changes |
| **Dataset** | Uses inline ECL with state transition |
| **Expected Output** | - State change detected<br>- fullWURefresh called but fails<br>- Exception propagated from fullWURefresh |
| **Pass Criteria** | - Exception thrown from fullWURefresh<br>- Error message indicates full refresh failure<br>- Partial state (basic info updated, full details not) |
| **Notes** | Tests error propagation from fullWURefresh. Not covered by existing test. |

---

#### EHT-013: Malformed Response Parsing Error

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-013 |
| **Category** | Error Handling |
| **Subcategory** | Unexpected Response Formats |
| **Description** | Server returns malformed response that causes parsing error |
| **Input Data** | Requires mock server returning invalid XML/SOAP |
| **Dataset** | N/A |
| **Expected Output** | - Parsing exception during response deserialization<br>- Exception caught and propagated |
| **Pass Criteria** | - Exception thrown indicating parse error<br>- No JVM crash<br>- Error message helpful for debugging |
| **Notes** | Tests robustness against malformed responses. Requires mock server. Not covered by existing test. |

---

#### EHT-014: Refresh Deleted Workunit

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-014 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Attempt to refresh a workunit that has been deleted |
| **Input Data** | 1. Create and complete workunit<br>2. Delete workunit using deleteWU()<br>3. Call fastWURefresh with deleted WUID |
| **Dataset** | Uses inline ECL: `OUTPUT('DeleteTest');` |
| **Expected Output** | - Server returns "not found" error<br>- `ArrayOfEspExceptionWrapper` thrown<br>- Or: Empty response with no workunits |
| **Pass Criteria** | - Either: `ArrayOfEspExceptionWrapper` with "not found"<br>- Or: Method completes with no update, no exception<br>- Clear indication workunit doesn't exist |
| **Notes** | Tests handling of deleted workunits. Not covered by existing test. |

---

#### EHT-015: Refresh Workunit During Server Maintenance

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-015 |
| **Category** | Error Handling |
| **Subcategory** | Communication Failures |
| **Description** | Call fastWURefresh while server is undergoing maintenance or restart |
| **Input Data** | Create valid workunit, then simulate server unavailability |
| **Dataset** | N/A |
| **Expected Output** | - Connection error or timeout<br>- `RemoteException` caught<br>- Wrapped in Exception with appropriate message |
| **Pass Criteria** | - Exception thrown indicating server unavailable<br>- No hang or infinite retry<br>- Clear error message |
| **Notes** | Tests resilience to server downtime. Difficult to automate without controlled environment. Not covered by existing test. |

---

## 8. New Dataset Specifications

Based on the test case analysis, **no new datasets are required** for testing `fastWURefresh`. This is because:

1. **Method operates on workunits, not datasets**: The `fastWURefresh` method queries workunit metadata, not data files
2. **Existing datasets sufficient for workunit creation**: The current benchmark datasets (`~benchmark::integer::20KB`, `~benchmark::all_types::200KB`, etc.) can be used in ECL code to create test workunits with various characteristics
3. **Most tests use inline ECL**: The majority of test cases use simple inline ECL (e.g., `OUTPUT('test')`) that doesn't require external datasets

### Dataset Usage Pattern for Tests

Tests should create workunits programmatically using patterns like:

```java
// Pattern 1: Inline ECL (most tests)
WorkunitWrapper wu = new WorkunitWrapper();
wu.setECL("OUTPUT('test');");
wu.setJobname("TestName");
wu.setCluster(thorclustername);
client.createAndRunWUFromECLWrapped(wu);

// Pattern 2: Using existing benchmark dataset (for state transitions, timing tests)
wu.setECL("ds := DATASET('~benchmark::integer::20KB', {INTEGER key, INTEGER fill}, FLAT); " +
          "OUTPUT(COUNT(ds));");

// Pattern 3: Long-running workunit (for state testing)
wu.setECL("OUTPUT(LOOP(DATASET([{1}], {INTEGER val}), 10000000, val+1));");

// Pattern 4: Failing workunit (for error state testing)
wu.setECL("OUTPUT(1/0);");
```

### Rationale for No New Datasets

1. **Test Focus**: Tests focus on workunit state management, not data processing
2. **Simplicity**: Inline ECL provides precise control over workunit behavior without dataset dependencies
3. **Speed**: Simple ECL executes quickly, enabling fast test execution
4. **Isolation**: Each test creates its own workunit, avoiding dataset contention
5. **Flexibility**: Can easily create workunits in any desired state without modifying datasets

### Optional Future Dataset Consideration

If comprehensive integration testing requires specific workunit characteristics (e.g., workunits that take exactly 30 seconds to run, or produce specific result patterns), consider creating:

```
Dataset Name: ~test::workunits::timing_10sec
Purpose: Create workunits with predictable 10-second execution time for state transition testing
Structure:
  - Simple dataset with WAIT(10000) or timed LOOP
  - Produces minimal output
  - Deterministic execution time
Rationale: Enables reliable testing of state transitions during refresh
```

However, this can also be achieved with inline ECL using `Std.System.Debug.Sleep()` or controlled LOOPs, so **no new dataset files are strictly necessary**.

---

## Summary

This analysis has identified **31 new test cases** (8 Core Functionality, 10 Edge Case, 15 Error Handling) that fill significant gaps in the existing test coverage for `fastWURefresh`. The current single test provides only basic validation, leaving most error conditions, edge cases, and state transition scenarios untested.

Key findings:
- **Existing test coverage**: 1 test covering basic operation only
- **Primary gaps**: Error handling, edge cases, state transitions, concurrent access
- **Dataset needs**: None - tests will create workunits programmatically
- **Testing approach**: Integration tests with live HPCC cluster (preferred over mocking)

The comprehensive test suite defined above will ensure robust validation of the `fastWURefresh` method across all identified scenarios, improving reliability and maintainability of the HPCC4J client library.


---
*Generated: 2026-01-13*

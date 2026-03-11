# WsResources — All Methods Test Case Analysis

**Generated:** 2026-03-04  
**Service:** `WsResources`  
**Client Class:** `HPCCWsResourcesClient`  
**Test File:** `WSResourcesClientTest.java`

---

## Table of Contents

1. [ping](#1-ping)
2. [serviceQuery](#2-servicequery)
3. [targetQuery](#3-targetquery)
4. [webLinks](#4-weblinks)

---

---

# 1. `ping`

## 1.1 Method Summary

### Purpose
The `ping()` method verifies that the WsResources ESP service is reachable and responsive. It acts as a basic health check / connectivity probe for the `/WsResources` endpoint.

### Role Within the Service
`ping()` is a lightweight liveness check commonly used during startup, health monitoring, or before issuing heavier service calls. It is available starting from WSDL version 1.03 (SOAP action: `WsResources/Ping?ver_=1.03`).

### Inputs
None. The method takes no parameters. Internally it constructs an empty `WsResourcesPingRequest` object.

### Outputs
- `true` — The ping SOAP call completed without exception.
- `false` — The SOAP call threw any exception (exception is logged, not propagated).
- Throws `Exception` — Only when `verifyStub()` fails (i.e., the client stub was never successfully initialized).

### Side Effects
- Logs an error via Log4j if the underlying SOAP call throws an exception.
- Does **not** modify server state.

### Key Implementation Notes
```java
public boolean ping() throws Exception {
    verifyStub();                                        // throws if stub == null
    try {
        ((WsResourcesStub) stub).ping(new WsResourcesPingRequest());
    } catch (Exception e) {
        log.error(e.getLocalizedMessage());
        return false;                                   // exception swallowed, returns false
    }
    return true;
}
```

Both `WsResourcesPingRequest` and `WsResourcesPingResponse` are completely empty SOAP structures (`<xsd:all/>`), confirmed in `WsResources.wsdl`.

---

## 1.2 Existing Test Coverage Analysis

### Existing Test Methods Found

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|--------------------|---------------|-------|
| `ping()` | CFT – Basic Operation | Successful ping on a live containerized HPCC cluster | Valid `Connection` from `BaseRemoteTest.connection`; no additional parameters | `assertTrue(wsResourcesClient.ping())` returns `true` | Test is **skipped** (`Assume.assumeTrue`) when target HPCC is not containerized |

### Coverage Summary

| Metric | Value |
|--------|-------|
| Total existing test methods for `ping` | 1 |
| Core Functionality Tests covered | 1 — Basic happy-path ping on containerized environment |
| Edge Case Tests covered | 0 |
| Error Handling Tests covered | 0 |

**Gaps identified:**

1. **Non-containerized HPCC**: The only existing test is skipped (`Assume.assumeTrue`) when the cluster is not containerized. There is no test confirming `ping()` succeeds on a bare-metal / VM deployment.
2. **Invalid credentials**: No test verifies `ping()` behavior when credentials are wrong (some ESP services return `false` or throw on auth failure).
3. **Unreachable host**: No test verifies that `ping()` returns `false` (rather than throwing uncaught) when the ESP host is unreachable.
4. **Invalid port**: No test for a connection to a wrong/closed port.
5. **Null / uninitialized stub**: No test verifies that `verifyStub()` throws `Exception` when the client was constructed with bad connection details (stub = null).
6. **Repeated / idempotent calls**: No test verifying that multiple successive calls all return `true` (idempotency / stability).
7. **Very short connection timeout**: No test verifying `false` is returned (not thrown) under an aggressive timeout constraint when the server is slow.

---

## 1.3 Request Structure

`WsResourcesPingRequest` is an empty SOAP envelope — it carries no fields.

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|---------------------|-------|
| *(none)* | — | — | The request object has no fields | — | Confirmed by `<xsd:all/>` in WSDL and empty `WsResourcesPingRequestWrapper` |

**Field dependencies:** None.  
**Default behaviour for optional fields:** N/A — no fields exist.

---

## 1.4 Server Behaviour and Responses

### Server-Side Logic
The `Ping` operation is an ESP framework built-in endpoint. No custom `onPing` implementation exists in `ws_resourcesService.cpp`; the platform handles it automatically. The server simply acknowledges the request and returns an empty `WsResourcesPingResponse`.

### Valid Response
`WsResourcesPingResponse` is an empty SOAP envelope. A successful HTTP 200 with this payload indicates the service is alive.

| Outcome | HTTP Status | Response Body | Client `ping()` Return |
|---------|-------------|---------------|------------------------|
| Service alive | 200 OK | Empty `WsResourcesPingResponse` | `true` |

### Invalid / Error Responses

| Condition | Server Behaviour | Client `ping()` Return |
|-----------|-----------------|------------------------|
| Authentication failure (wrong credentials) | HTTP 401 / SOAP fault | `false` (exception swallowed) |
| Service not running / port closed | TCP error / `AxisFault` | `false` (exception swallowed) |
| Stub not initialized (`stub == null`) | `verifyStub()` throws `Exception` before network call | Propagates `Exception` to caller |
| Network timeout | `AxisFault` wrapping `SocketTimeoutException` | `false` (exception swallowed) |

---

## 1.5 Error Handling

### Server-Side Errors

| Error Type | Trigger | Expected Behaviour |
|------------|---------|-------------------|
| HTTP 401 Unauthorized | Invalid credentials on an auth-protected cluster | Axis2 throws `AxisFault`; `ping()` logs the error and returns `false` |
| HTTP 404 / wrong URI | Incorrect `WSRESOURCESURI` path (hypothetical) | Axis2 throws `AxisFault`; `ping()` logs and returns `false` |
| Internal server error (HTTP 500) | Unexpected ESP crash | Axis2 throws `AxisFault`; `ping()` logs and returns `false` |

### Client-Side Errors

| Error Type | Trigger | Expected Behaviour |
|------------|---------|-------------------|
| Null / failed stub | `HPCCWsResourcesClient` constructed with unreachable host so `WsResourcesStub()` sets `stub = null` | `verifyStub()` throws `Exception` — propagated to caller |
| Network unreachable | Host down, firewall blocking | `AxisFault` / `RemoteException` caught, `ping()` returns `false` |
| Socket timeout | Very short timeout + slow server | `SocketTimeoutException` wrapped in `AxisFault`, `ping()` returns `false` |
| Wrong protocol/port | HTTPS on an HTTP port (or vice versa) | Connection-level exception → `ping()` returns `false` |

---

## 1.6 Existing Dataset Analysis

The `ping()` method is a stateless connectivity probe that does not interact with any HPCC dataset or distributed file system. No datasets are required.

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | `ping()` does not read/write any dataset |
| `~benchmark::string::100MB` | No | `ping()` does not read/write any dataset |
| `~benchmark::integer::20KB` | No | `ping()` does not read/write any dataset |
| `~benchmark::all_types::superfile` | No | `ping()` does not read/write any dataset |
| `~benchmark::integer::20kb::key` | No | `ping()` does not read/write any dataset |

---

## 1.7 Test Case Plan

> **Note:** `CFT-001` (basic happy-path ping on containerized HPCC) is already covered by the existing `ping()` test method and is **not** repeated here. All tests below address identified coverage gaps.

### A. Core Functionality Tests

#### CFT-001 — Non-Containerized Environment Ping

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Verify that `ping()` returns `true` on a non-containerized HPCC cluster (the existing test skips this scenario with `Assume.assumeTrue`). |
| **Input Data** | `Connection` using `BaseRemoteTest.connection`; no additional parameters. |
| **Dataset** | N/A |
| **Expected Output** | `true` |
| **Pass Criteria** | - `wsResourcesClient.ping()` returns `true`<br>- No exception is thrown |
| **Notes** | Use `Assume.assumeFalse("Target HPCC is containerized, skipping", iscontainerized)` to run only on bare-metal/VM clusters. Complements the existing containerized test. |

#### CFT-002 — Idempotency: Repeated Successive Pings

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflows |
| **Description** | Verify that calling `ping()` multiple times in succession consistently returns `true`, confirming idempotency and no server-side side effects. |
| **Input Data** | Valid `Connection` from `BaseRemoteTest.connection`. Call `ping()` 5 times in a loop. |
| **Dataset** | N/A |
| **Expected Output** | `true` for every invocation |
| **Pass Criteria** | - All 5 calls return `true`<br>- No exception is thrown across any call |
| **Notes** | Helps detect intermittent connectivity or state corruption issues. Run on both containerized and non-containerized environments. |

---

### B. Edge Case Tests

#### ECT-001 — Ping With Very Short Connection Timeout

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Performance Limits |
| **Description** | Verify that when an extremely short socket timeout is configured, `ping()` returns `false` gracefully rather than propagating an exception to the caller. |
| **Input Data** | Create a `Connection` with `connectTimeoutMilli = 1` and `socketTimeoutMilli = 1` targeting the live cluster (`BaseRemoteTest.connString`). |
| **Dataset** | N/A |
| **Expected Output** | `false` (the 1 ms timeout causes `SocketTimeoutException` → caught internally) OR `true` if the local network is fast enough to respond within 1 ms. |
| **Pass Criteria** | - No uncaught exception propagates to the test<br>- Result is either `true` or `false` (not an unhandled `Exception`) |
| **Notes** | The purpose is to confirm the exception-swallowing contract of `ping()`. If the local loopback responds in <1 ms, adjust timeout to 0 or check that `AxisFault` is caught. |

---

### C. Error Handling Tests

#### EHT-001 — Ping With Invalid Credentials

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors / Authorization |
| **Description** | Verify that `ping()` returns `false` when the client is constructed with invalid (wrong) credentials on a cluster that requires authentication. |
| **Input Data** | Construct `HPCCWsResourcesClient` with `Connection(connString)` setting user = `"invalidUser"` and pass = `"wrongPassword"`. |
| **Dataset** | N/A |
| **Expected Output** | `false` |
| **Pass Criteria** | - `ping()` returns `false`<br>- No uncaught exception propagates |
| **Notes** | Only meaningful when the target cluster enforces authentication. Use `Assume` to skip if cluster allows anonymous access (`hpccPass` is empty and `hpccUser` is the default). |

#### EHT-002 — Ping With Unreachable Host

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors / Communication Failures |
| **Description** | Verify that `ping()` returns `false` (does not throw) when the ESP host is completely unreachable (no route to host). |
| **Input Data** | Construct `HPCCWsResourcesClient` using `Connection("http://192.0.2.1:8010")` (TEST-NET-1 — non-routable per RFC 5737). Set a short timeout (e.g., 2000 ms) to avoid long test delays. |
| **Dataset** | N/A |
| **Expected Output** | `false` |
| **Pass Criteria** | - `ping()` returns `false`<br>- No uncaught exception propagates to the test |
| **Notes** | `192.0.2.1` is a documentation-only non-routable address (RFC 5737) and will never accidentally succeed in a real environment. |

#### EHT-003 — Ping With Wrong Port (Connection Refused)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors / Communication Failures |
| **Description** | Verify that `ping()` returns `false` when the connection targets a port where no service is listening (connection refused). |
| **Input Data** | Extract host from `BaseRemoteTest.connString`; construct `Connection` with port `19999` (a port unlikely to be in use). Use 2000 ms timeout. |
| **Dataset** | N/A |
| **Expected Output** | `false` |
| **Pass Criteria** | - `ping()` returns `false`<br>- No uncaught exception propagates |
| **Notes** | Port `19999` is chosen to avoid collision with HPCC default ports (8010, 18010, 9876, etc.). |

#### EHT-004 — Ping When Stub Initialization Failed (Null Stub)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors / Invalid Connection |
| **Description** | Verify that `ping()` throws an `Exception` (not silently returns `false`) when the underlying stub is `null` due to failed initialization. |
| **Input Data** | Construct `HPCCWsResourcesClient` using a `Connection` with a malformed base URL that causes `WsResourcesStub` initialization to fail (e.g., `"http://:0"`). The expected result is `stub == null` after construction and `initErrMessage` is non-empty. |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown from `verifyStub()` |
| **Pass Criteria** | - Calling `ping()` on the client throws `Exception`<br>- The thrown exception message indicates stub initialization failure |
| **Notes** | This validates that `verifyStub()` correctly guards against a null stub and that the exception is **not** swallowed by the `catch (Exception e)` block (which only wraps the SOAP call, not `verifyStub()`). |

---

## 1.8 New Dataset Specifications

**No new datasets are required.** The `ping()` method is a stateless connectivity probe and does not interact with any HPCC file, dataset, index, or superfile. No modifications to `generate-datasets.ecl` are needed for these test cases.

---

---

# 2. `serviceQuery`

## 2.1 Method Summary

### Purpose

`serviceQuery` queries the HPCC Systems cluster for a list of registered public services. In containerized deployments it reads the global container configuration (`services` elements); in bare-metal deployments it reads the HPCC environment XML, enumerating Roxie clusters and ESP service bindings that match the optional `Type` and `Name` filter parameters.

### Role Within the Service

`ServiceQuery` is the primary discovery endpoint of the `WsResources` ESP service. It allows callers to enumerate available HPCC services (name, type, port, TLS status) without knowing the topology in advance. It is protected by `ResourceQueryAccess:READ` authorization.

### Inputs

| Parameter | Java Wrapper Field | Description |
|-----------|-------------------|-------------|
| `type` | `ServiceQueryRequestWrapper.local_type` | Optional service type filter (e.g. `"roxie"`, `"esp"`) |
| `name` | `ServiceQueryRequestWrapper.local_name` | Optional service name filter (case-insensitive exact match) |

### Outputs

`ServiceQueryResponseWrapper` containing:
- `services` (`Services_type0Wrapper`) — list of `HPCCServiceWrapper` objects, each with:
  - `name` (String)
  - `type` (String)
  - `port` (UnsignedInt)
  - `tLSSecure` (boolean)
- `exceptions` (`ArrayOfEspExceptionWrapper`) — inline exception array (populated on error)

### Side Effects

None — read-only query.

---

## 2.2 Existing Test Coverage Analysis

### Existing Test Methods for `serviceQuery`

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| `serviceQueryTest` | CFT | Basic operation — empty/default request, all services returned | `new ServiceQueryRequestWrapper()` (no type, no name) | Response not null; `resp.getServices()` not null; service list iterable without exception | Assumes containerized environment (`Assume.assumeTrue`) |

### Coverage Summary

- **Total existing test methods:** 1
- **Core Functionality Tests covered:** 1 — default (no-filter) request on containerized cluster
- **Edge Case Tests covered:** 0
- **Error Handling Tests covered:** 0
- **Gaps identified:**
  1. Filter by `type` (valid known type such as `"roxie"`, `"eclqueries"`, `"esp"`)
  2. Filter by `name` (valid known service name)
  3. Filter by both `type` and `name` simultaneously
  4. Filter with `type` that matches no services (empty result set)
  5. Filter with `name` that matches no services (empty result set)
  6. Empty string vs `null` for `type` / `name` filters (boundary)
  7. Case-insensitive matching for `type` and `name` (e.g. `"ROXIE"` vs `"roxie"`)
  8. Non-containerized (bare-metal) environment behavior
  9. `null` request wrapper passed to client method (client-side guard)
  10. Invalid/uninitialized connection (client-side stub error)
  11. Unauthorized request (insufficient permissions)
  12. Response field completeness — each returned service has non-null `name`, `type`, `port` > 0
  13. TLS-secured service detection

---

## 2.3 Request Structure

### Fields

| Field Name | Java Type | Required | Description | Valid Range / Format | Notes |
|------------|-----------|----------|-------------|---------------------|-------|
| `type` | `String` | No | Filter by service type | Any string; known values: `"roxie"`, `"eclqueries"`, `"esp"`, `"ws_sql"`, `"ws_ecl"`, etc. | `null` or empty → no type filter applied |
| `name` | `String` | No | Filter by service name | Any string; must match a registered service name exactly (case-insensitive) | `null` or empty → no name filter applied |

### Field Dependencies

- `type` and `name` are independent filters applied as AND conditions.
- Both being `null`/empty returns the full list of public services.
- Providing only `name` without `type` is valid and narrows results by name only.

### Default Behavior for Optional Fields

If both `type` and `name` are omitted/null, all public services from the cluster configuration are returned.

---

## 2.4 Server Behavior and Responses

### Containerized Mode (TpContainer.cpp)

1. Iterates over `services` entries in the global container config.
2. Skips entries where `@public` is `false`.
3. Skips entries where `@type` is empty.
4. If `type` filter is provided, skips entries where `@type` does not match (case-insensitive).
5. Skips entries where `@name` is empty.
6. If `name` filter is provided, skips entries where `@name` does not match (case-insensitive).
7. Sets `Name`, `Type`, `Port`, and `TLSSecure` on each result service.
8. Breaks early once a named service is found when `name` filter is specified.

### Bare-Metal Mode (TpWrapper.cpp)

1. If `type` is empty or equals `"roxie"`, calls `getRoxieServices` to enumerate Roxie clusters from environment XML.
2. Always calls `getESPServices` to enumerate ESP process bindings matching the `type` and `name` filters.
3. Returns a combined list of matched services.

### Valid Response Scenarios

| Scenario | Response |
|----------|----------|
| Services found matching filters | `Services` array with one or more `HPCCService` entries |
| No services match filters | `Services` array is empty (null-removed per `nil_remove`) |
| Server exception during processing | `exceptions` field populated with error details |

### Response Notes

- The response uses `[nil_remove, exceptions_inline]`, meaning empty/null service arrays may be omitted entirely from the XML response.
- Service `Port` field is 0 if no port is configured (bare-metal Roxie farm may skip port 0 entries).
- `TLSSecure` defaults to `false` unless `@tls` (container) or `@protocol=https/ssl` (bare-metal) is set.

---

## 2.5 Error Handling

### Server-Side Errors

| Error Type | Trigger Condition | Behavior |
|------------|------------------|----------|
| `ECLWATCH_INTERNAL_ERROR` | Internal C++ exception during `tpWrapper.getServices()` | `FORWARDEXCEPTION` wraps exception; propagated as ESP exception in response |
| Named service not found (bare-metal Roxie) | `name` filter provided but no matching `RoxieCluster` in environment XML | `makeStringExceptionV(ECLWATCH_INVALID_CLUSTER_NAME, "RoxieCluster %s not found.")` |
| Authorization failure | Caller lacks `ResourceQueryAccess:READ` | HTTP 401 / ESP authorization exception |

### Client-Side Errors

| Error Type | Trigger Condition | Java Client Behavior |
|------------|-----------------|----------------------|
| Null request | `req == null` passed to `serviceQuery()` | `Exception("ServiceQueryRequestWrapper must be provided!")` thrown immediately |
| Stub not initialized | Connection failure during `HPCCWsResourcesClient` construction | `verifyStub()` throws with init error message |
| Network / RemoteException | Underlying Axis2 communication failure | Wrapped in `Exception("...encountered RemoteException.")` |
| ESP exceptions in response | `resp.getExceptions() != null` | `handleEspExceptions()` called; throws `ArrayOfEspExceptionWrapper` |

---

## 2.6 Existing Dataset Analysis

`serviceQuery` is a **topology/service discovery API** — it queries HPCC cluster configuration, not file system data. It does **not** read, process, or reference any HPCC datasets.

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | serviceQuery reads cluster service topology, not file data |
| `~benchmark::string::100MB` | No | serviceQuery reads cluster service topology, not file data |
| `~benchmark::integer::20KB` | No | serviceQuery reads cluster service topology, not file data |
| `~benchmark::all_types::superfile` | No | serviceQuery reads cluster service topology, not file data |
| `~benchmark::integer::20kb::key` | No | serviceQuery reads cluster service topology, not file data |

No test datasets are required for `serviceQuery` tests. All test inputs are request parameters (`type` and `name` strings) rather than file references.

---

## 2.7 Test Case Plan

> Only test cases **not** already covered by existing tests are included below. The existing `serviceQueryTest` covers the basic no-filter operation on a containerized cluster.

### A. Core Functionality Tests

#### CFT-001 — Filter by `type` (Roxie)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations — typed filter |
| **Description** | Call `serviceQuery` with `type = "roxie"` and verify only services of type `roxie` are returned |
| **Input Data** | `type`: `"roxie"`, `name`: `null` |
| **Dataset** | N/A — no dataset required |
| **Expected Output** | Response not null; if Roxie services exist, all returned services have `type` == `"roxie"`; if none exist, service list is null/empty |
| **Pass Criteria** | - Response not null<br>- No exception thrown<br>- All service entries in response have type `"roxie"` (or list is empty/null) |
| **Notes** | Requires containerized or bare-metal environment with at least one Roxie service configured to yield a non-empty result |

---

#### CFT-002 — Filter by `type` (ESP/eclqueries)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations — typed filter |
| **Description** | Call `serviceQuery` with `type = "eclqueries"` and verify only services of that type are returned |
| **Input Data** | `type`: `"eclqueries"`, `name`: `null` |
| **Dataset** | N/A |
| **Expected Output** | Response not null; all returned services have `type` == `"eclqueries"` (or empty) |
| **Pass Criteria** | - Response not null<br>- No unexpected exception<br>- All returned services match requested type |
| **Notes** | In containerized mode, `"eclqueries"` is a standard service type; in bare-metal the equivalent is an ESP binding service type |

---

#### CFT-003 — Filter by `name` only

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflow — name-only filter |
| **Description** | First issue an unfiltered query to discover an existing service name, then re-issue with that name as filter |
| **Input Data** | Step 1: no filter. Step 2: `name` = first service name from Step 1 result, `type` = `null` |
| **Dataset** | N/A |
| **Expected Output** | Step 2 response contains exactly one (or a small number of) service(s) whose `name` matches the filter |
| **Pass Criteria** | - Step 2 response not null<br>- All returned services have `name` equal (case-insensitive) to the requested name<br>- At least one service returned |
| **Notes** | Dynamically obtains a valid name from Step 1; self-contained two-step test |

---

#### CFT-004 — Filter by both `type` and `name`

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-004 |
| **Category** | Core Functionality |
| **Subcategory** | Complete Request — all fields set |
| **Description** | Call `serviceQuery` specifying both a `type` and a `name` discovered from the unfiltered list |
| **Input Data** | `type`: service type from unfiltered discovery; `name`: service name from unfiltered discovery (matching type) |
| **Dataset** | N/A |
| **Expected Output** | Response contains exactly the one service matching both filters |
| **Pass Criteria** | - Response not null<br>- Returned service list has exactly 1 entry<br>- Returned service `type` and `name` match requested values |
| **Notes** | Dynamically obtains valid type + name from a prior unfiltered query |

---

#### CFT-005 — Verify service fields completeness

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-005 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation — response field validation |
| **Description** | Issue unfiltered request and verify that every returned `HPCCServiceWrapper` has non-null name, non-null type, and port > 0 |
| **Input Data** | `type`: `null`, `name`: `null` |
| **Dataset** | N/A |
| **Expected Output** | All services in response have populated `name`, `type`, and positive `port` |
| **Pass Criteria** | - Response not null<br>- `resp.getServices().getService()` not null<br>- For each service: `getName()` not null/empty, `getType()` not null/empty, `getPort()` > 0 |
| **Notes** | Extends existing `serviceQueryTest`; validates field content rather than just non-null response |

---

### B. Edge Case Tests

#### ECT-001 — Empty string `type` filter (treated as no filter)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — empty string vs null |
| **Description** | Call `serviceQuery` with `type` set to `""` (empty string) and verify it behaves identically to `null` (returns all services) |
| **Input Data** | `type`: `""`, `name`: `null` |
| **Dataset** | N/A |
| **Expected Output** | Same result set as unfiltered query |
| **Pass Criteria** | - Response not null<br>- Service count equals count returned by unfiltered query<br>- No exception thrown |
| **Notes** | Server code treats empty string as "no filter" via `isEmptyString(serviceType)` |

---

#### ECT-002 — Empty string `name` filter (treated as no filter)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — empty string vs null |
| **Description** | Call `serviceQuery` with `name` set to `""` and verify it returns all services |
| **Input Data** | `type`: `null`, `name`: `""` |
| **Dataset** | N/A |
| **Expected Output** | Same result set as unfiltered query |
| **Pass Criteria** | - Response not null<br>- No exception thrown<br>- Service count matches unfiltered result |
| **Notes** | Confirms `isEmptyString("")` path in server code |

---

#### ECT-003 — Case-insensitive `type` matching

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs — case insensitivity |
| **Description** | Call `serviceQuery` with `type` in uppercase (e.g. `"ROXIE"`) and compare results to lowercase `"roxie"` request |
| **Input Data** | Request A: `type`: `"roxie"`. Request B: `type`: `"ROXIE"` |
| **Dataset** | N/A |
| **Expected Output** | Both requests return identical service lists |
| **Pass Criteria** | - Both responses not null<br>- Both service lists have the same count<br>- Service names are identical across both responses |
| **Notes** | Server uses `strieq` (case-insensitive) comparison |

---

#### ECT-004 — `type` filter yields empty result set

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-004 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — no matching services |
| **Description** | Call `serviceQuery` with a valid-looking but non-existent type string that returns zero results |
| **Input Data** | `type`: `"nonexistent_service_type_xyz"`, `name`: `null` |
| **Dataset** | N/A |
| **Expected Output** | Response not null; `services` field is null or empty (nil_remove) |
| **Pass Criteria** | - No exception thrown<br>- Either `resp.getServices()` is null OR `resp.getServices().getService()` is null or empty |
| **Notes** | Validates nil_remove behavior on empty result; tests graceful empty-result handling |

---

#### ECT-005 — `name` filter yields empty result set

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-005 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — no matching services |
| **Description** | Call `serviceQuery` with a `name` that does not match any registered service |
| **Input Data** | `type`: `null`, `name`: `"zzz_no_such_service_name_9999"` |
| **Dataset** | N/A |
| **Expected Output** | Response not null; `services` field null or empty |
| **Pass Criteria** | - No exception thrown<br>- Service list null or empty |
| **Notes** | In containerized mode the server simply returns an empty list; in bare-metal, Roxie name mismatch raises an exception — test may need to branch on environment |

---

#### ECT-006 — Very long `type` string (boundary input size)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-006 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — large input string |
| **Description** | Call `serviceQuery` with a `type` string of 1000+ characters |
| **Input Data** | `type`: string of 1024 `'a'` characters, `name`: `null` |
| **Dataset** | N/A |
| **Expected Output** | Empty result set (no services match) with no server error |
| **Pass Criteria** | - No exception thrown (or at most an ESP exception, not a crash)<br>- Response returned |
| **Notes** | Verifies server robustness to oversized string inputs |

---

#### ECT-007 — `type` and `name` both set with no match

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-007 |
| **Category** | Edge Case |
| **Subcategory** | Optional Parameters — conflicting filter combination |
| **Description** | Set both `type` and `name` to valid strings that do not appear together on any service |
| **Input Data** | `type`: known valid type (e.g. `"roxie"`), `name`: known valid name from a different type |
| **Dataset** | N/A |
| **Expected Output** | Empty service list, no exception |
| **Pass Criteria** | - Response not null<br>- Service list empty/null |
| **Notes** | Confirms AND-logic of combined filters |

---

### C. Error Handling Tests

#### EHT-001 — Null `ServiceQueryRequestWrapper` passed to client

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors — null input |
| **Description** | Call `wsResourcesClient.serviceQuery(null)` and verify the expected client-side exception |
| **Input Data** | `req`: `null` |
| **Dataset** | N/A |
| **Expected Output** | `Exception` with message `"ServiceQueryRequestWrapper must be provided!"` |
| **Pass Criteria** | - `Exception` thrown<br>- Exception message contains `"ServiceQueryRequestWrapper must be provided!"` |
| **Notes** | Tests guard clause at start of `HPCCWsResourcesClient.serviceQuery()` |

---

#### EHT-002 — Invalid connection (bad host)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors — connection failure |
| **Description** | Create a client with an unreachable host and call `serviceQuery`; verify that a connection or stub error is thrown |
| **Input Data** | Client created with `protocol: "http"`, `host: "192.0.2.1"` (TEST-NET, unreachable), `port: "8010"`, valid credentials. Request: `new ServiceQueryRequestWrapper()` |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown during `verifyStub()` or during the Axis2 call |
| **Pass Criteria** | - Exception thrown (any type)<br>- Exception message references connection/initialization failure |
| **Notes** | 192.0.2.x is RFC 5737 documentation/test address; guaranteed unreachable |

---

#### EHT-003 — Unauthorized access (wrong credentials)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — authorization failure |
| **Description** | Call `serviceQuery` using a client configured with invalid credentials on a secured cluster |
| **Input Data** | Client created with wrong username/password. Request: `new ServiceQueryRequestWrapper()` |
| **Dataset** | N/A |
| **Expected Output** | `ArrayOfEspExceptionWrapper` or `Exception` indicating authorization failure (HTTP 401 or ESP auth error) |
| **Pass Criteria** | - Exception thrown<br>- Exception message or ESP exception code indicates authentication/authorization failure |
| **Notes** | Skip test if target cluster has no authentication configured (`Assume`) |

---

#### EHT-004 — Non-containerized environment behavior

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — environment mismatch |
| **Description** | Call `serviceQuery` on a non-containerized HPCC cluster (bare-metal) and verify the response |
| **Input Data** | `type`: `null`, `name`: `null` |
| **Dataset** | N/A |
| **Expected Output** | Either a valid service list from bare-metal environment XML, or an empty response — not an exception |
| **Pass Criteria** | - No unhandled exception<br>- Response not null |
| **Notes** | Assumes non-containerized environment available; use `Assume.assumeFalse(iscontainerized)`. The existing `serviceQueryTest` only runs on containerized clusters |

---

#### EHT-005 — Special characters in `type` filter

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-005 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — malformed values |
| **Description** | Call `serviceQuery` with special/injection characters in `type` (e.g. SQL/XML injection attempts) |
| **Input Data** | `type`: `"</type><inject>malicious</inject>"`, `name`: `null` |
| **Dataset** | N/A |
| **Expected Output** | Empty result set or ESP validation error — no server crash |
| **Pass Criteria** | - No unhandled server crash<br>- Response returned (possibly empty or with ESP exception) |
| **Notes** | Tests robustness of string handling in server-side filter logic |

---

#### EHT-006 — Special characters in `name` filter

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-006 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — malformed values |
| **Description** | Call `serviceQuery` with XPath/XML injection characters in `name` (e.g. `'` or `"` characters used in XPath predicates) |
| **Input Data** | `type`: `null`, `name`: `"' or '1'='1"` |
| **Dataset** | N/A |
| **Expected Output** | Empty result set or ESP exception — no server crash or unintended data leakage |
| **Pass Criteria** | - No unhandled exception causing crash<br>- Server returns controlled response |
| **Notes** | Bare-metal path uses XPath with `[@name=\"%s\"]` — tests injection robustness |

---

## 2.8 New Dataset Specifications

**No new datasets are required** for `serviceQuery` test cases. All test scenarios rely exclusively on request parameter variations (`type` and `name` strings) and live cluster service topology. No HPCC file datasets are accessed by this method.

---

---

# 3. `targetQuery`

## 3.1 Method Summary

### Purpose
`targetQuery` queries the HPCC cluster topology to discover available compute target queues (Thor, HThor, Roxie) and Roxie publish targets. It is used primarily by containerized HPCC deployments where dynamic cluster discovery is required.

### Role Within Service
This method is one of four operations exposed by the `WsResources` ESP service. It provides cluster topology information needed to route workload submissions (e.g., choosing a Thor or HThor target for a workunit). It was introduced in service version 1.03.

### Inputs
| Parameter | Type | Description |
|-----------|------|-------------|
| `req` | `TargetQueryRequestWrapper` | Request wrapper containing the `Type` field (HPCCQueueType enum) |

### Outputs
`TargetQueryResponseWrapper` containing:
- `queues` — list of `HPCCQueueWrapper` objects (each with a `name` and `type`)
- `roxies` — list of Roxie target name strings (for clusters that can publish queries)
- `exceptions` — embedded exception array (inline exceptions pattern)

### Side Effects
- None (read-only query against the cluster topology)
- OpenTelemetry `@WithSpan` trace span is created

---

## 3.2 Existing Test Coverage Analysis

### Existing Tests for `targetQuery`

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|--------------------|---------------|-------|
| `testTargetQueryNullType` | EHT | Null / undefined type — server rejects with "HPCCQueueType not defined." | `request.setType(null)` | Response not null **or** `ArrayOfEspExceptionWrapper` thrown with message containing "HPCCQueueType not defined." | Handles both an exception thrown and a response-embedded exception |
| `testTargetQueryAllType` | CFT | Query with `Type=All` — retrieves all queue types | `HPCCQueueType._All` | Response not null | No assertion on queue contents beyond non-null |
| `testTargetQueryRoxieType` | CFT | Query with `Type=Roxie` — retrieves Roxie queues only | `HPCCQueueType._Roxie` | Response not null | No assertion that returned queues are all Roxie type |

### Coverage Summary
- **Total existing test methods for `targetQuery`:** 3
- **Core Functionality Tests covered:** 2 — `Type=All` (basic operation), `Type=Roxie` (single-type filter)
- **Edge Case Tests covered:** 0
- **Error Handling Tests covered:** 1 — Null type input
- **Gaps identified:**
  1. No test for `Type=Thor`
  2. No test for `Type=HThor`
  3. No assertion that returned queues match the requested type (filter correctness)
  4. No assertion on Roxie list when `Type=Roxie` or `Type=All`
  5. No test for a null `TargetQueryRequestWrapper` object (null request — client-side guard)
  6. No test verifying response structure (queue name non-null, queue type non-null)
  7. No test for an invalid/unrecognized string value in `HPCCQueueTypeWrapper`
  8. No test verifying that non-containerized HPCC clusters still return results (or appropriate error)
  9. No test for response when no Thor clusters exist (empty queues list)
  10. No concurrency/thread-safety test

---

## 3.3 Request Structure

### `TargetQueryRequest` Fields

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|---------------------|-------|
| `Type` | `HPCCQueueType` (ESPenum) | **Yes** (server-enforced) | Specifies which queue type(s) to return | `Thor`, `HThor`, `Roxie`, `All` | Server throws `ECLWATCH_INVALID_INPUT` ("HPCCQueueType not defined.") if undefined/missing |

### `HPCCQueueType` Enum Values

| Value | String Representation | Description |
|-------|-----------------------|-------------|
| `Thor` | `"Thor"` | LCR Thor batch processing clusters |
| `HThor` | `"HThor"` | HThor in-process execution engine |
| `Roxie` | `"Roxie"` | Roxie real-time query clusters |
| `All` | `"All"` | All cluster types combined |

### Field Dependencies
- `Type` is the only field; no conditional dependencies exist.
- The `HPCCQueueTypeWrapper` constructor accepts a `String` value which is matched case-insensitively in `getRaw()` to produce the Axis2 enum.

### Default Behavior for Optional Fields
- There are no optional fields. `Type` is mandatory from the server's perspective.
- If `Type` is not set (null), the server returns an inline exception with message "HPCCQueueType not defined."

---

## 3.4 Server Behavior and Responses

### Server-Side Logic (`onTargetQuery` in `ws_resourcesService.cpp`)

1. Reads `req.getType()` — if `HPCCQueueType_Undefined`, throws `makeStringException(ECLWATCH_INVALID_INPUT, "HPCCQueueType not defined.")`.
2. Calls `getWUClusterInfo(clusters)` to retrieve all known clusters from the platform topology.
3. Iterates over each cluster:
   - Maps cluster platform (`ThorLCRCluster` → `Thor`, `RoxieCluster` → `Roxie`, else → `HThor`)
   - For Roxie clusters that can publish queries: adds the cluster name to `roxieTargetNames`; if `onlyPublishedQueries()` is true, skips adding it to `queues`
   - Filters by requested type: if `typeReq != All` and `typeReq != type`, skips the queue
4. Returns `queues` (array of `HPCCQueue`) and `roxies` (array of Roxie target name strings)

### Valid Response Types

| Scenario | `queues` | `roxies` | Notes |
|----------|----------|----------|-------|
| `Type=All` | All Thor, HThor, Roxie queues (excluding publish-only Roxies) | All Roxie targets that can publish | Most complete response |
| `Type=Thor` | Thor queues only | Empty / not returned | Roxie items excluded |
| `Type=HThor` | HThor queues only | Empty / not returned | Roxie items excluded |
| `Type=Roxie` | Roxie queues (non-publish-only) | Roxie names that can publish | Mixed Roxie results |
| No clusters configured | Empty array | Empty array | Valid but empty response |

### Response Fields

**`HPCCQueue`:**
| Field | Type | Description |
|-------|------|-------------|
| `Name` | String | Cluster/queue name |
| `Type` | `HPCCQueueType` | Cluster type (`Thor`, `HThor`, or `Roxie`) |

**`TargetQueryResponse`:**
| Field | Type | Description |
|-------|------|-------------|
| `Queues` | `ESParray<HPCCQueue>` | List of matching queues |
| `Roxies` | `ESParray<string>` | Names of Roxie clusters that accept published queries |
| `Exceptions` | inline | ESP exceptions if an error occurs |

---

## 3.5 Error Handling

### Server-Side Errors

| Error Condition | Error Code | Message | Behavior |
|-----------------|------------|---------|----------|
| `Type` is undefined/null | `ECLWATCH_INVALID_INPUT` | "HPCCQueueType not defined." | Returned as inline exception in response |
| Internal topology lookup failure | `ECLWATCH_INTERNAL_ERROR` | System-specific message | Exception forwarded via `FORWARDEXCEPTION` |

### Client-Side Errors

| Error Condition | Exception Type | Message |
|-----------------|---------------|---------|
| `req == null` | `Exception` | "TargetQueryRequestWrapper must be provided!" |
| Stub not initialized (connection failure) | `Exception` (from `verifyStub()`) | Stub initialization error message |
| SOAP communication failure | `Exception` wrapping `RemoteException` | "HPCCWSRESOURCESClient.targetQuery(TargetQueryRequestWrapper) encountered RemoteException." |
| Server returns inline exception(s) | `ArrayOfEspExceptionWrapper` | Forwarded via `handleEspExceptions()` |

### `HPCCQueueTypeWrapper.getRaw()` Behavior
- If `local_hPCCQueueType` is null or does not match any known value ("All", "Thor", "HThor", "Roxie"), `getRaw()` returns `null`.
- A null `HPCCQueueType` on the wire results in the server treating the type as `HPCCQueueType_Undefined`, triggering the "HPCCQueueType not defined." error.

---

## 3.6 Existing Dataset Analysis

The `targetQuery` method does not operate on HPCC logical files or datasets. It queries cluster topology (queue names and types). Therefore, none of the benchmark datasets are applicable as direct test inputs.

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | targetQuery does not read file data; it queries cluster topology |
| `~benchmark::string::100MB` | No | targetQuery does not read file data; it queries cluster topology |
| `~benchmark::integer::20KB` | No | targetQuery does not read file data; it queries cluster topology |
| `~benchmark::all_types::superfile` | No | targetQuery does not read file data; it queries cluster topology |
| `~benchmark::integer::20kb::key` | No | targetQuery does not read file data; it queries cluster topology |

**No new datasets are required** for `targetQuery` tests.

---

## 3.7 Test Case Plan

> All test cases below address gaps in the existing test coverage. Existing tests `testTargetQueryNullType`, `testTargetQueryAllType`, and `testTargetQueryRoxieType` are **not** duplicated.

### A. Core Functionality Tests

#### CFT-001 — Query Thor Queues

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Query with `Type=Thor` — verify only Thor queues are returned |
| **Input Data** | `request.setType(new HPCCQueueTypeWrapper(HPCCQueueType._Thor))` |
| **Dataset** | N/A — cluster topology query |
| **Expected Output** | Response not null; all entries in `getQueues().getHPCCQueue()` have `type == "Thor"` (or queue list is empty if no Thor clusters exist); `getRoxies()` is null or empty |
| **Pass Criteria** | - Response is not null<br>- No exception thrown<br>- If queues are present, every `HPCCQueueWrapper.getType().getHPCCQueueType()` equals `"Thor"` |
| **Notes** | Closes gap: no existing test for `Type=Thor`. On a bare-bones HPCC (HThor-only), the queues list may be empty — that is still a valid pass. |

---

#### CFT-002 — Query HThor Queues

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Query with `Type=HThor` — verify only HThor queues are returned |
| **Input Data** | `request.setType(new HPCCQueueTypeWrapper(HPCCQueueType._HThor))` |
| **Dataset** | N/A — cluster topology query |
| **Expected Output** | Response not null; all entries in `getQueues().getHPCCQueue()` have `type == "HThor"` (or queue list is empty); `getRoxies()` is null or empty |
| **Pass Criteria** | - Response is not null<br>- No exception thrown<br>- If queues are present, every `HPCCQueueWrapper.getType().getHPCCQueueType()` equals `"HThor"` |
| **Notes** | Closes gap: no existing test for `Type=HThor`. HThor typically exists on both bare-metal and containerized clusters. |

---

#### CFT-003 — Verify Queue Type Filter Correctness for All

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Complete Request / Typical Workflow |
| **Description** | Query with `Type=All` and assert that returned queue entries have valid non-null names and types |
| **Input Data** | `request.setType(new HPCCQueueTypeWrapper(HPCCQueueType._All))` |
| **Dataset** | N/A — cluster topology query |
| **Expected Output** | Response not null; for each `HPCCQueueWrapper` in `getQueues().getHPCCQueue()`: `getName()` is non-null and non-empty, `getType()` is non-null and value is one of `"Thor"`, `"HThor"`, `"Roxie"` |
| **Pass Criteria** | - Response is not null<br>- No exception thrown<br>- All returned queue objects have valid Name and Type fields<br>- At least one queue is returned (assumes cluster has at least one compute target) |
| **Notes** | Closes gap: existing `testTargetQueryAllType` only checks `assertNotNull(response)` — does not verify queue contents. |

---

#### CFT-004 — Verify Roxie List Populated When Type=Roxie

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-004 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflow |
| **Description** | When `Type=Roxie`, verify that the `roxies` list contains any Roxie clusters that can publish queries |
| **Input Data** | `request.setType(new HPCCQueueTypeWrapper(HPCCQueueType._Roxie))` |
| **Dataset** | N/A — cluster topology query |
| **Expected Output** | Response not null; `getRoxies()` is a valid (possibly empty) list; any Roxie cluster that can publish queries appears in both `getQueues()` and `getRoxies()` |
| **Pass Criteria** | - Response is not null<br>- No exception thrown<br>- `getRoxies()` is not null (may be empty on non-Roxie clusters)<br>- If `getRoxies()` is non-empty, each entry is a non-empty string |
| **Notes** | Closes gap: existing `testTargetQueryRoxieType` does not assert on the `roxies` field. On a non-Roxie cluster, `getRoxies()` may be null/empty — that is acceptable. |

---

#### CFT-005 — Verify Roxie List Populated When Type=All

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-005 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflow |
| **Description** | When `Type=All`, verify that the `roxies` list is a valid list (not malformed) and entries are non-empty strings |
| **Input Data** | `request.setType(new HPCCQueueTypeWrapper(HPCCQueueType._All))` |
| **Dataset** | N/A — cluster topology query |
| **Expected Output** | Response not null; `getRoxies()` is null or a list of non-empty strings |
| **Pass Criteria** | - Response is not null<br>- No exception thrown<br>- If `getRoxies()` is non-null, each entry is non-empty |
| **Notes** | Companion to CFT-004. Verifies `roxies` list integrity for the `All` type. |

---

### B. Edge Case Tests

#### ECT-001 — Case-Insensitive Type String in HPCCQueueTypeWrapper

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Construct `HPCCQueueTypeWrapper` with lowercase `"all"` string — verify `getRaw()` maps correctly and request succeeds |
| **Input Data** | `new HPCCQueueTypeWrapper("all")` — lowercase variant |
| **Dataset** | N/A |
| **Expected Output** | `getRaw()` returns `HPCCQueueType.All`; `targetQuery` succeeds with non-null response |
| **Pass Criteria** | - `new HPCCQueueTypeWrapper("all").getRaw()` equals `HPCCQueueType.All`<br>- `targetQuery` call succeeds without exception |
| **Notes** | `HPCCQueueTypeWrapper.getRaw()` uses `equalsIgnoreCase`, so "all", "ALL", "All" should all work. This tests that the wrapper's case-insensitivity is correctly wired through to the server. |

---

#### ECT-002 — Case-Insensitive Type String "THOR" (uppercase)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Construct `HPCCQueueTypeWrapper` with uppercase `"THOR"` — verify `getRaw()` maps to `HPCCQueueType.Thor` and request succeeds |
| **Input Data** | `new HPCCQueueTypeWrapper("THOR")` |
| **Dataset** | N/A |
| **Expected Output** | `getRaw()` returns `HPCCQueueType.Thor`; `targetQuery` call succeeds |
| **Pass Criteria** | - `new HPCCQueueTypeWrapper("THOR").getRaw()` equals `HPCCQueueType.Thor`<br>- `targetQuery` call succeeds |
| **Notes** | Same case-insensitivity verification as ECT-001 but for Thor. |

---

#### ECT-003 — Empty String Type in HPCCQueueTypeWrapper

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Construct `HPCCQueueTypeWrapper` with an empty string `""` — verify `getRaw()` returns null and `targetQuery` triggers the "HPCCQueueType not defined." error |
| **Input Data** | `new HPCCQueueTypeWrapper("")` |
| **Dataset** | N/A |
| **Expected Output** | `getRaw()` returns `null`; server returns inline exception: "HPCCQueueType not defined." |
| **Pass Criteria** | - `new HPCCQueueTypeWrapper("").getRaw()` is null<br>- Calling `targetQuery` results in `ArrayOfEspExceptionWrapper` with message containing "HPCCQueueType not defined." OR an `Exception` is thrown |
| **Notes** | `getRaw()` falls through all `equalsIgnoreCase` checks for an empty string and returns `null`. This tests the boundary between valid and invalid wrapper values. |

---

#### ECT-004 — Invalid/Unrecognized Type String

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-004 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Construct `HPCCQueueTypeWrapper` with unrecognized string `"InvalidType"` — verify `getRaw()` returns null and request is rejected |
| **Input Data** | `new HPCCQueueTypeWrapper("InvalidType")` |
| **Dataset** | N/A |
| **Expected Output** | `getRaw()` returns `null`; server returns inline exception: "HPCCQueueType not defined." |
| **Pass Criteria** | - `new HPCCQueueTypeWrapper("InvalidType").getRaw()` is null<br>- `targetQuery` results in exception with message "HPCCQueueType not defined." |
| **Notes** | Verifies that `HPCCQueueTypeWrapper` gracefully handles unrecognized type strings rather than throwing a NullPointerException downstream. |

---

### C. Error Handling Tests

#### EHT-001 — Null Request Object

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Missing required fields |
| **Description** | Pass `null` as the `TargetQueryRequestWrapper` to `targetQuery` — verify the client throws the expected exception immediately |
| **Input Data** | `wsResourcesClient.targetQuery(null)` |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown with message `"TargetQueryRequestWrapper must be provided!"` |
| **Pass Criteria** | - `Exception` is thrown<br>- Exception message equals `"TargetQueryRequestWrapper must be provided!"` |
| **Notes** | This tests the client-side null guard in `HPCCWsResourcesClient.targetQuery()` before any network call is made. |

---

#### EHT-002 — Null Type Field (Unset Wrapper)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Null field |
| **Description** | Create a `TargetQueryRequestWrapper` with default constructor (type not set) and call `targetQuery` — verify server rejects with "HPCCQueueType not defined." |
| **Input Data** | `new TargetQueryRequestWrapper()` — no `setType()` called |
| **Dataset** | N/A |
| **Expected Output** | Server returns inline exception: "HPCCQueueType not defined." via `ArrayOfEspExceptionWrapper` |
| **Pass Criteria** | - Either `ArrayOfEspExceptionWrapper` is thrown with message containing "HPCCQueueType not defined." OR<br>- `Exception` is thrown referencing the same |
| **Notes** | Distinct from the existing `testTargetQueryNullType` which explicitly calls `setType(null)`. This tests the default (unset) state. Functionally equivalent but documents the default constructor behavior. |

---

#### EHT-003 — Invalid Connection (Bad Host)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors — Invalid connection |
| **Description** | Create an `HPCCWsResourcesClient` pointing to an unreachable host and call `targetQuery` — verify appropriate exception is thrown |
| **Input Data** | `HPCCWsResourcesClient.get("http", "invalid-host-that-does-not-exist", "8010", "user", "pass")`<br>`request.setType(new HPCCQueueTypeWrapper(HPCCQueueType._All))` |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown (wrapping `RemoteException` or connection error) |
| **Pass Criteria** | - An exception is thrown<br>- Exception is either `RemoteException`-wrapped `Exception` or initialization/connection error |
| **Notes** | This verifies that the client does not hang indefinitely and correctly propagates connection failures. A short timeout should be set on the connection to keep test execution fast. |

---

#### EHT-004 — Verify Queues Not Null Even When Empty (Graceful Empty Response)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Edge case validation |
| **Description** | Query `Type=Roxie` on a cluster known to have no Roxie nodes — verify that the response's `queues` field is non-null (empty list, not null) |
| **Input Data** | `request.setType(new HPCCQueueTypeWrapper(HPCCQueueType._Roxie))` — on a Thor-only cluster |
| **Dataset** | N/A |
| **Expected Output** | Response not null; `getQueues()` is either null or contains an empty list (not throws NullPointerException); `getRoxies()` is null or empty |
| **Pass Criteria** | - Response is not null<br>- No NPE thrown when accessing `response.getQueues()`<br>- No exception thrown |
| **Notes** | The IDL uses `[nil_remove]` on the response, so an empty array may be returned as null. The test should handle both null and empty gracefully. Depends on target environment — use `Assume` if cluster always has Roxie. |

---

## 3.8 New Dataset Specifications

**No new datasets are required** for `targetQuery` test cases.

`targetQuery` is a pure topology discovery call that does not access HPCC logical files, datasets, or indexes. All test inputs are request type enum values, and all expected outputs come from the live cluster topology configuration.

> No changes to `generate-datasets.ecl` are needed for these test cases.

---

## Appendix 3: Key Source References

| File | Location |
|------|----------|
| Client implementation | `wsclient/src/main/java/org/hpccsystems/ws/client/HPCCWsResourcesClient.java` |
| Request wrapper | `wsclient/src/main/java/org/hpccsystems/ws/client/wrappers/gen/wsresources/TargetQueryRequestWrapper.java` |
| Response wrapper | `wsclient/src/main/java/org/hpccsystems/ws/client/wrappers/gen/wsresources/TargetQueryResponseWrapper.java` |
| Queue type wrapper | `wsclient/src/main/java/org/hpccsystems/ws/client/wrappers/gen/wsresources/HPCCQueueTypeWrapper.java` |
| Queue wrapper | `wsclient/src/main/java/org/hpccsystems/ws/client/wrappers/gen/wsresources/HPCCQueueWrapper.java` |
| IDL definition | `esp/scm/ws_resources.ecm` (HPCC-Platform) |
| Server implementation | `esp/services/ws_resources/ws_resourcesService.cpp` (HPCC-Platform) |
| Existing test file | `wsclient/src/test/java/org/hpccsystems/ws/client/WSResroucesClientTest.java` |

---

---

# 4. `webLinks`

## 4.1 Method Summary

### Purpose
The `webLinks` method queries the HPCC ESP service (`WsResources`) for all web links associated with the cluster. It returns two categories of links:

1. **ConfiguredWebLinks** — statically configured links defined in the component's YAML configuration under `service/links`. These are always returned regardless of deployment mode.
2. **DiscoveredWebLinks** — dynamically discovered Kubernetes service links, available **only in containerized deployments**. The server runs `kubectl get services -o=json` and filters services based on HPCC-specific annotations.

### Role in Service
This is one of three primary methods on `HPCCWsResourcesClient` (alongside `serviceQuery` and `targetQuery`). It supports resource discovery for HPCC cluster operators and monitoring dashboards.

### Inputs
- `WebLinksQueryRequestWrapper` — an empty request object with no fields. The request must be non-null.

### Outputs
- `WebLinksQueryResponseWrapper` containing:
  - `ArrayOfDiscoveredWebLinkWrapper` discoveredWebLinks (null or empty in bare-metal mode)
  - `ArrayOfConfiguredWebLinkWrapper` configuredWebLinks (from static cluster config)
  - `ArrayOfEspExceptionWrapper` exceptions (on error)

### Side Effects
- No data is modified. Read-only operation.
- Server may execute `kubectl get services` command (containerized mode only).

### API Version Notes
- **min_ver 1.01** — method was introduced in WSDL version 1.01.
- **min_ver 1.02** — `ServiceConnection` field added to `DiscoveredWebLink`.
- **min_ver 1.04** — `ResourceType` field added to `ConfiguredWebLink`.

---

## 4.2 Existing Test Coverage Analysis

### Existing Tests for `webLinks`

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| `testWebLinksQuery` | CFT | Basic operation — sends a minimal empty request and checks response is non-null | `new WebLinksQueryRequestWrapper()` (no fields) | `response != null` | Does not validate response contents (discoveredWebLinks, configuredWebLinks fields) |

### Coverage Summary

- **Total existing test methods for `webLinks`:** 1
- **Core Functionality Tests covered:** 1 — Basic operation with empty request, null-check of response only
- **Edge Case Tests covered:** 0
- **Error Handling Tests covered:** 0

**Gaps identified:**
1. Response content validation — configuredWebLinks and discoveredWebLinks are never inspected
2. Null request — passing `null` to `webLinks()` should throw an exception (client-side guard exists)
3. Non-containerized mode — discoveredWebLinks should be null/empty on bare-metal
4. Containerized mode — discoveredWebLinks should be populated with service data
5. ConfiguredWebLink field validation — name, description, URL must be non-null strings when entries exist
6. DiscoveredWebLink field validation — serviceName, nameSpace, annotations structure (containerized)
7. DiscoveredWebLink version 1.02+ — ServiceConnection object presence and structure
8. ConfiguredWebLink version 1.04+ — ResourceType field presence and valid enum value
9. Invalid connection — expired/wrong credentials should result in exception or error response
10. Timeout — connection timeout behavior when server is unreachable

---

## 4.3 Request Structure

The `WebLinksQueryRequest` is intentionally empty per the IDL definition:

```ecm
ESPrequest WebLinksQueryRequest
{
};
```

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|---------------------|-------|
| *(none)* | — | — | Request has no fields | — | All behavior is driven server-side by config and deployment mode |

### Field Dependencies
None — the request carries no parameters.

### Default Behavior for Optional Fields
Not applicable; the request has no fields. The server determines response content entirely from its runtime environment and component configuration.

---

## 4.4 Server Behavior and Responses

### Processing Logic

**Step 1 — ConfiguredWebLinks:**
The server reads `service/links` from the component configuration YAML. For each entry, it constructs a `ConfiguredWebLink` with:
- `Name` — from `@name` attribute
- `Description` — from `@description` attribute
- `URL` — from `@url` attribute
- `ResourceType` (v1.04+) — from `@resourceType` attribute (uppercased); defaults to `"UNKNOWN"` if absent or empty

**Step 2 — DiscoveredWebLinks (containerized only):**
The server runs `kubectl get services -o=json`. For each Kubernetes service:
1. Checks for the annotation `hpcc.<application>.io_fenabled = true`; services without this are skipped
2. Extracts `metadata/name` (ServiceName) and `metadata/namespace` (NameSpace)
3. Extracts all `hpcc.<application>.io_f*` annotations
4. If v1.02+: extracts `ServiceConnection` (type, ExternalIPs, ExternalIPStatus, Ports)

**Step 3 — Return:**
The method returns `false` (per C++ ESP method convention; this does not indicate error).

### Valid Response Types

| Scenario | discoveredWebLinks | configuredWebLinks | exceptions |
|----------|-------------------|-------------------|------------|
| Bare-metal, no configured links | null/empty | null/empty | null |
| Bare-metal, with configured links | null/empty | 1+ entries | null |
| Containerized, no annotated services | null/empty | null/empty | null |
| Containerized, with annotated services | 1+ entries | null/empty | null |
| Containerized, both sources populated | 1+ entries | 1+ entries | null |

### Possible Error Responses

- `ECLWATCH_INTERNAL_ERROR` — if `kubectl` command fails (non-zero exit code)
- `ECLWATCH_INTERNAL_ERROR` — if `kubectl` returns empty output
- `ECLWATCH_INTERNAL_ERROR` — if `@application` is not set in containerized mode
- Authentication failure — if credentials are insufficient (ESP auth feature: `ResourceQueryAccess:READ`)

---

## 4.5 Error Handling

### Server-Side Errors

| Error Condition | Mechanism | Expected Client Behavior |
|----------------|-----------|--------------------------|
| `kubectl` command fails (containerized) | `IException` thrown, forwarded as SOAP fault | Client throws `Exception` via `handleEspExceptions` |
| `kubectl` returns empty output | `IException` thrown | Client throws `Exception` |
| `@application` config prop missing | Returns `false` immediately (no error propagated) | Response may have empty `discoveredWebLinks` silently |
| Auth denied (wrong credentials) | SOAP fault / ESP exception | Client receives `ArrayOfEspExceptionWrapper`, throws exception |

### Client-Side Errors

| Error Condition | Client Guard | Expected Behavior |
|----------------|-------------|-------------------|
| `null` request passed | `if (req == null) throw new Exception(...)` at line 322 | `Exception` thrown before making network call |
| Stub not initialized (null connection) | `verifyStub()` call | `Exception` thrown |
| `RemoteException` from Axis2 | Caught and wrapped | `Exception` with "encountered RemoteException" message |
| Network timeout | Axis2 socket/connect timeout from `Connection` | `AxisFault` propagated as `Exception` |

---

## 4.6 Existing Dataset Analysis

The `webLinks` method requires **no datasets** — it is a server configuration/environment discovery method that reads cluster metadata (Kubernetes services and component YAML config), not HPCC logical files. Therefore, none of the benchmark datasets apply.

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | Method does not query HPCC logical files or DFS |
| `~benchmark::string::100MB` | No | Method does not query HPCC logical files or DFS |
| `~benchmark::integer::20KB` | No | Method does not query HPCC logical files or DFS |
| `~benchmark::all_types::superfile` | No | Method does not query HPCC logical files or DFS |
| `~benchmark::integer::20kb::key` | No | Method does not query HPCC logical files or DFS |

No new datasets are required for these tests.

---

## 4.7 Test Case Plan

> **Note:** `CFT-001` (basic call + response not null) is **already covered** by `testWebLinksQuery`. All test cases below target gaps in existing coverage.

### A. Core Functionality Tests

#### CFT-001 — *(Already covered by `testWebLinksQuery`)*
*Skipped — existing test adequately covers basic operation with empty request and null-check.*

---

#### CFT-002 — Response Structure Validation (Non-Containerized)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Verify that on a non-containerized HPCC cluster, `webLinks()` returns a valid response where `discoveredWebLinks` is null or empty, and no exception is thrown |
| **Input Data** | `new WebLinksQueryRequestWrapper()` (empty request); target must be a bare-metal (non-containerized) HPCC cluster |
| **Dataset** | N/A |
| **Expected Output** | `WebLinksQueryResponseWrapper` with `getDiscoveredWebLinks()` null or empty |
| **Pass Criteria** | - Response is not null<br>- `getExceptions()` is null<br>- `getDiscoveredWebLinks()` is null or its list is empty (Kubernetes services not available on bare-metal) |
| **Notes** | Use `Assume.assumeFalse("Target HPCC is containerized", iscontainerized)` to skip this test on containerized clusters |

---

#### CFT-003 — Response Structure Validation (Containerized)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Verify that on a containerized HPCC cluster, `webLinks()` returns a valid response including non-null `discoveredWebLinks` |
| **Input Data** | `new WebLinksQueryRequestWrapper()` (empty request); target must be a containerized HPCC cluster |
| **Dataset** | N/A |
| **Expected Output** | `WebLinksQueryResponseWrapper` with `getDiscoveredWebLinks()` non-null |
| **Pass Criteria** | - Response is not null<br>- `getExceptions()` is null<br>- `getDiscoveredWebLinks()` is not null (may have 0 or more entries)<br>- Each `DiscoveredWebLinkWrapper` entry has non-null `getServiceName()` |
| **Notes** | Use `Assume.assumeTrue("Target HPCC is not containerized", iscontainerized)` |

---

#### CFT-004 — ConfiguredWebLinks Field Validation

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-004 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | When the HPCC cluster has configured web links (via `service/links` in component config), verify each entry has valid Name, Description, and URL fields |
| **Input Data** | `new WebLinksQueryRequestWrapper()` (empty request); cluster must have at least one configured link |
| **Dataset** | N/A |
| **Expected Output** | `getConfiguredWebLinks()` is non-null and non-empty; each entry has non-null non-empty Name and URL |
| **Pass Criteria** | - `getConfiguredWebLinks()` is not null<br>- List has at least one element<br>- Each `ConfiguredWebLinkWrapper.getName()` is non-null and non-empty<br>- Each `ConfiguredWebLinkWrapper.getURL()` is non-null and non-empty |
| **Notes** | Use `Assume.assumeTrue(...)` to skip if configuredWebLinks is empty; log a warning that the test environment may lack configured links |

---

#### CFT-005 — DiscoveredWebLink Field Completeness (Containerized)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-005 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | For each discovered web link returned in containerized mode, validate that core fields (serviceName, nameSpace) are populated and that the annotations list is not null |
| **Input Data** | `new WebLinksQueryRequestWrapper()` (empty request); containerized cluster with at least one annotated service |
| **Dataset** | N/A |
| **Expected Output** | Each `DiscoveredWebLinkWrapper` has non-null `serviceName`, non-null `nameSpace`, non-null `annotations` list |
| **Pass Criteria** | - `getDiscoveredWebLinks()` is not null<br>- For each entry: `getServiceName() != null`, `getNameSpace() != null`, `getAnnotations() != null` |
| **Notes** | Use `Assume.assumeTrue(...)` for containerized; also assume `discoveredWebLinks.size() > 0` |

---

#### CFT-006 — ResourceType Field in ConfiguredWebLinks (v1.04+)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-006 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflows |
| **Description** | Verify that when the WSDL version is 1.04+, ConfiguredWebLink entries include a non-null ResourceType field with a valid enum value |
| **Input Data** | `new WebLinksQueryRequestWrapper()` (empty request); cluster with configured links |
| **Dataset** | N/A |
| **Expected Output** | Each `ConfiguredWebLinkWrapper` has a `ResourceType` that is one of: `UNKNOWN`, `TRACES`, `LOGS`, `METRICS` |
| **Pass Criteria** | - `getConfiguredWebLinks()` is not null and non-empty<br>- Each entry's resource type string (if present on the wrapper) is one of the valid enum values<br>- No exception is thrown |
| **Notes** | The current `ConfiguredWebLinkWrapper` does not expose `ResourceType` — check if field exists; if not, verify the raw Axis2 object via `getRaw()`. Skip if WSDL version < 1.04. |

---

### B. Edge Case Tests

#### ECT-001 — ServiceConnection Fields in DiscoveredWebLinks (v1.02+)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Optional Parameters |
| **Description** | Verify that `DiscoveredWebLink` entries include a populated `ServiceConnection` object when the WSDL version is 1.02+ |
| **Input Data** | `new WebLinksQueryRequestWrapper()` (empty request); containerized cluster |
| **Dataset** | N/A |
| **Expected Output** | Each `DiscoveredWebLinkWrapper.getConnection()` is non-null; `connection.getType()` is non-null |
| **Pass Criteria** | - Containerized cluster returns at least one `DiscoveredWebLink`<br>- `getConnection()` is not null for each entry<br>- `getConnection().getType()` is non-null (ClusterIP, NodePort, LoadBalancer, or ExternalName) |
| **Notes** | Requires WSDL version 1.02+; skip on older versions. Use `Assume.assumeTrue(iscontainerized)` |

---

#### ECT-002 — ExternalIPStatus Enum Validation

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Verify that when ExternalIPs list is empty for a discovered service, the `ExternalIPStatus` is set to a valid enum value (`Unknown`, `None`, `Pending`) rather than null |
| **Input Data** | `new WebLinksQueryRequestWrapper()` (empty request); containerized cluster where some services have no ExternalIPs |
| **Dataset** | N/A |
| **Expected Output** | `connection.getExternalIPStatus()` is one of: `Unknown`, `None`, `Pending` (not null and not empty) when `getExternalIPs()` is empty |
| **Pass Criteria** | - For discovered links with empty `ExternalIPs`, `getExternalIPStatus()` is not null<br>- Value is a member of the `ExternalIPStatus` enum |
| **Notes** | This test depends on cluster configuration; use `Assume.assumeTrue` for containerized and assume at least one service without external IPs |

---

#### ECT-003 — Empty Response with Valid Connection

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Verify that on a bare-metal cluster with no configured links, both `discoveredWebLinks` and `configuredWebLinks` are null or empty — but the response object itself is never null |
| **Input Data** | `new WebLinksQueryRequestWrapper()` (empty request); bare-metal cluster with no configured links |
| **Dataset** | N/A |
| **Expected Output** | Response is non-null; `getDiscoveredWebLinks()` is null; `getConfiguredWebLinks()` is null; `getExceptions()` is null |
| **Pass Criteria** | - `response != null`<br>- Neither field is populated<br>- No exception is thrown |
| **Notes** | Requires a cluster with no `service/links` configured and bare-metal mode. Use `Assume.assumeFalse(iscontainerized)`. This may be difficult to guarantee in shared test environments. |

---

### C. Error Handling Tests

#### EHT-001 — Null Request Throws Exception

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Verify that passing `null` as the request to `webLinks()` results in an `Exception` with an appropriate message |
| **Input Data** | `webLinks(null)` |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown with message containing `"WebLinksQueryRequestWrapper must be provided!"` |
| **Pass Criteria** | - `Exception` is thrown<br>- Exception message contains `"WebLinksQueryRequestWrapper must be provided!"` |
| **Notes** | This tests the client-side null guard in `HPCCWsResourcesClient.webLinks()`. No network call should be made. This test works on both containerized and bare-metal. |

---

#### EHT-002 — Invalid Credentials Return Exception

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Verify that a `webLinks()` call made with invalid credentials results in an `Exception` or `ArrayOfEspExceptionWrapper` |
| **Input Data** | `new WebLinksQueryRequestWrapper()` (empty request); client configured with invalid username/password |
| **Dataset** | N/A |
| **Expected Output** | `Exception` or `ArrayOfEspExceptionWrapper` thrown with authentication-related error message |
| **Pass Criteria** | - An exception of type `Exception` or `ArrayOfEspExceptionWrapper` is thrown<br>- Exception message indicates authentication failure (e.g., "Access denied", "401") |
| **Notes** | Use `HPCCWsResourcesClient.get(protocol, host, port, "invalid_user", "invalid_pass")` to construct the client. Requires the target cluster to enforce authentication. |

---

#### EHT-003 — Uninitialized Stub Throws Exception

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Verify that calling `webLinks()` when the internal stub failed to initialize results in an `Exception` |
| **Input Data** | `new WebLinksQueryRequestWrapper()` (empty request); client constructed with an invalid/unreachable host |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown; message related to stub initialization failure or connection refused |
| **Pass Criteria** | - `Exception` is thrown before or during the network call<br>- Exception is not a null pointer exception — it should carry a meaningful message |
| **Notes** | Construct client with `HPCCWsResourcesClient.get("http", "invalid.host.that.does.not.exist", "8010", "", "")`. The `verifyStub()` call should propagate an appropriate error. |

---

#### EHT-004 — Connection Timeout Behavior

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Verify that `webLinks()` throws an `Exception` when the connection times out, rather than hanging indefinitely |
| **Input Data** | `new WebLinksQueryRequestWrapper()` (empty request); client configured with a very short timeout (e.g., 1ms) and an unreachable host or port |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown within a reasonable time (< 5 seconds); message indicates timeout or connection failure |
| **Pass Criteria** | - `Exception` is thrown<br>- Test completes within 5 seconds<br>- Exception message references timeout or connection |
| **Notes** | Use `HPCCWsResourcesClient.get(protocol, host, port, user, pass, 1)` with timeout of 1ms and an unreachable host/port to reliably trigger timeout |

---

## 4.8 New Dataset Specifications

**No new datasets are required.** The `webLinks` method does not interact with HPCC logical files or the distributed file system. All test scenarios rely solely on the cluster's configuration and deployment mode.

---

## Appendix 4: Related Wrapper Classes

| Class | Package | Purpose |
|-------|---------|---------|
| `WebLinksQueryRequestWrapper` | `wrappers.gen.wsresources` | Empty request wrapper |
| `WebLinksQueryResponseWrapper` | `wrappers.gen.wsresources` | Response with discoveredWebLinks and configuredWebLinks |
| `ConfiguredWebLinkWrapper` | `wrappers.gen.wsresources` | Fields: name, description, uRL |
| `DiscoveredWebLinkWrapper` | `wrappers.gen.wsresources` | Fields: serviceName, nameSpace, annotations, connection |
| `ServiceConnectionWrapper` | `wrappers.gen.wsresources` | Fields: type, externalIPs, externalIPStatus, ports |
| `ExternalIPStatusWrapper` | `wrappers.gen.wsresources` | Enum: Unknown, None, Pending |
| `ArrayOfConfiguredWebLinkWrapper` | `wrappers.gen.wsresources` | List wrapper for ConfiguredWebLink |
| `ArrayOfDiscoveredWebLinkWrapper` | `wrappers.gen.wsresources` | List wrapper for DiscoveredWebLink |
| `ArrayOfNamedValueWrapper` | `wrappers.gen.wsresources` | List wrapper for annotation name-value pairs |
| `ArrayOfServicePortsWrapper` | `wrappers.gen.wsresources` | List wrapper for service ports |

### Key Observations for Test Authors

1. **`ConfiguredWebLinkWrapper` does not currently expose `ResourceType`** — the v1.04 `ResourceType` field exists in the IDL and server but may not yet be surfaced in the Java wrapper (check `ConfiguredWebLink` Axis2 gen class). Test CFT-006 should verify this via `getRaw()` if necessary.
2. **`WSResroucesClientTest` (note typo in filename)** — the existing test file is named with a typo; new tests for `webLinks` should be added to this same file to maintain consistency.
3. **Containerized vs bare-metal** — many tests require `Assume.assumeTrue/assumeFalse(iscontainerized)`. The `setup()` method in the existing test class already fetches this flag.
4. **No datasets needed** — unlike other WsResources methods like `serviceQuery`, `webLinks` is purely a discovery API and does not filter by any dataset-related parameters.

---

*Generated: 2026-03-04*

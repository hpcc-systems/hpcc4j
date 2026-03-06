# WsResources Service Analysis
**Date:** 2026-03-04  
**Client Class:** `HPCCWsResourcesClient`  
**Service URI:** `/WsResources`  
**IDL:** `esp/scm/ws_resources.ecm`  
**Service Version:** 1.04

---

## Overview

`HPCCWsResourcesClient` provides a read-only discovery API for containerized HPCC Systems resources. The service exposes three query methods (ServiceQuery, TargetQuery, WebLinksQuery) plus a connectivity ping. All methods are **read-only** — this service never creates, updates, or deletes server-side state.

The service is primarily useful in **containerized (Kubernetes) HPCC deployments** where cluster topology and external links are dynamic and must be discovered at runtime.

---

## A. Method Inventory Table

| # | Method Name | Signature | Group | Calls Other Methods | Server State Effect | Prerequisites |
|---|-------------|-----------|-------|---------------------|---------------------|---------------|
| 1 | `ping` | `public boolean ping() throws Exception` | Health/Connectivity | None | None | None — works even when no cluster resources exist |
| 2 | `serviceQuery` | `public ServiceQueryResponseWrapper serviceQuery(ServiceQueryRequestWrapper req) throws Exception` | Service Discovery | None | Read | None — reads existing service configuration |
| 3 | `targetQuery` | `public TargetQueryResponseWrapper targetQuery(TargetQueryRequestWrapper req) throws Exception` | Target/Queue Discovery | None | Read | None — reads existing queue/target configuration |
| 4 | `webLinks` | `public WebLinksQueryResponseWrapper webLinks(WebLinksQueryRequestWrapper req) throws Exception` | WebLinks Discovery | None | Read | None — reads existing web link configuration |

---

## B. Dependency Graph

```
ping           → (no dependencies, no side effects)
serviceQuery   → (no dependencies, no side effects)
targetQuery    → (no dependencies, no side effects)
webLinks       → (no dependencies, no side effects)
```

All four business methods are **fully independent**. The service is entirely read-only:
- No method creates state consumed by another method.
- No method performs internal delegation to another business method.
- No method removes state produced by another method.
- All methods directly call the underlying `WsResourcesStub` and return wrapped responses.

---

## C. Functional Groups

### 1. Health / Connectivity
| Method | Description |
|--------|-------------|
| `ping` | Sends a no-op ping request to verify the WsResources service is reachable. Returns `true` on success, `false` on any exception. |

### 2. Service Discovery
| Method | Description |
|--------|-------------|
| `serviceQuery` | Queries HPCC cluster for running services. Request supports optional `Type` and `Name` filters. Returns a list of `HPCCService` entries with `Name`, `Type`, `Port`, and `TLSSecure` fields. |

### 3. Target / Queue Discovery
| Method | Description |
|--------|-------------|
| `targetQuery` | Queries HPCC cluster for available compute queues/targets. Request supports an optional `HPCCQueueType` filter (`Thor`, `HThor`, `Roxie`, `All`). Returns lists of `HPCCQueue` objects and Roxie endpoint strings. Available since service version 1.03. |

### 4. WebLinks Discovery
| Method | Description |
|--------|-------------|
| `webLinks` | Queries the HPCC cluster for both **discovered** web links (from Kubernetes annotations: `DiscoveredWebLink` with `ServiceName`, `NameSpace`, `Annotations`, `Connection`) and **configured** web links (from static config: `ConfiguredWebLink` with `Name`, `Description`, `URL`, `ResourceType`). Available since service version 1.01. |

---

## D. Test Independence Guidelines

Because the WsResources service is entirely read-only, the usual state-setup/teardown concerns do not apply. However, the following guidelines ensure robust, isolated tests:

1. **No shared mutable state**: Since all methods are read-only, no cleanup is needed. Tests may run in any order.
2. **Connection setup**: Each test class (or `@BeforeClass`) creates its own `HPCCWsResourcesClient` via `HPCCWsResourcesClient.get(connection)`.
3. **Null/empty request handling**: For methods accepting a request wrapper, add a dedicated negative test case that passes `null` and asserts the `Exception` is thrown (the client validates non-null inputs before calling the stub).
4. **Response validation**: Tests should assert:
   - Response is not `null`
   - No `EspException` entries in the response (use `assertNull` or check the exceptions field)
   - Response list fields are not `null` (may be empty on a minimal cluster, but never `null`)
5. **ping test**: Simply assert `ping()` returns `true` on a reachable cluster.
6. **Filter variants**: For `serviceQuery` and `targetQuery`, test both with and without optional filter values to exercise both code paths.
7. **Version awareness**: `targetQuery` requires service version ≥ 1.03; `webLinks` requires ≥ 1.01. If the test cluster is older, these tests may fail — consider version guards if the test suite needs to support older clusters.
8. **No UUID-named resources needed**: Because no state is created, there is no need for uniquely-named test resources or cleanup in `finally` blocks.

---

## E. Recommended Analysis Order

Because all methods are independent read-only queries, topological ordering is flat. The recommended order proceeds from simplest to most complex:

| Order | Method | Rationale |
|-------|--------|-----------|
| 1 | `ping` | Simplest possible method — no request object, boolean return. Establishes basic connectivity. |
| 2 | `serviceQuery` | Simple query with optional filters. Core discovery method; understanding it is foundational. |
| 3 | `targetQuery` | Similar to `serviceQuery` but returns queue/target data. Builds on same pattern. |
| 4 | `webLinks` | Most complex response structure (two result lists: discovered + configured). Analyze last. |

---

## F. Request / Response Type Summary

| Method | Request Wrapper | Response Wrapper | Key Request Fields | Key Response Fields |
|--------|----------------|------------------|--------------------|---------------------|
| `ping` | *(none — uses internal `WsResourcesPingRequest`)* | `boolean` | — | — |
| `serviceQuery` | `ServiceQueryRequestWrapper` | `ServiceQueryResponseWrapper` | `Type` (string, optional), `Name` (string, optional) | `Services[]` → `{Name, Type, Port, TLSSecure}` |
| `targetQuery` | `TargetQueryRequestWrapper` | `TargetQueryResponseWrapper` | `Type` (HPCCQueueType enum: `Thor`/`HThor`/`Roxie`/`All`) | `Queues[]` → `{Name, Type}`, `Roxies[]` (strings) |
| `webLinks` | `WebLinksQueryRequestWrapper` | `WebLinksQueryResponseWrapper` | *(no fields in request)* | `DiscoveredWebLinks[]`, `ConfiguredWebLinks[]` |

---

## G. Notes on BaseHPCCWsClient Inherited Infrastructure

The following methods from `BaseHPCCWsClient` are **excluded** from test generation as they are infrastructure, not business logic:
- `getServiceURI()` — returns the constant `/WsResources`
- `getDefaultStub()` — returns a new `WsResourcesStub()`
- `getServiceWSDLURL()` / `getServiceWSDLPort()` — static WSDL metadata
- `get(Connection)` / `get(String, String, String, String, String)` / `get(String, String, String, String, String, int)` — factory methods
- `initWsResourcesClientStub(Connection)` — protected initialization method
- `loadWSDLURL()` — private static WSDL loader

---

## H. Auth Feature Requirements

Per the IDL, all methods require `ResourceQueryAccess:READ` permission:
- `serviceQuery` — `ResourceQueryAccess:READ`
- `targetQuery` — `ResourceQueryAccess:READ` (min_ver 1.03)
- `webLinks` — `ResourceQueryAccess:READ` (min_ver 1.01)

Test credentials must have `ResourceQueryAccess:READ` rights on the target HPCC cluster.


---
*Generated: 2026-03-04*

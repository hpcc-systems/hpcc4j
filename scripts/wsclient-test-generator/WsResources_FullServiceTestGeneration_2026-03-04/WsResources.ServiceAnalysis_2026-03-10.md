# WsResources ESP Service — Analysis and Client Test Plan Document

**Service:** WsResources  
**WSDL Version:** 1.04 (current)  
**Server Implementation:** `esp/services/ws_resources/ws_resourcesService.cpp`  
**Date:** 2026-03-10  

---

## Table of Contents

1. [Service Overview](#service-overview)
2. [ping](#1-ping)
3. [serviceQuery](#2-servicequery)
4. [targetQuery](#3-targetquery)
5. [webLinks](#4-weblinks)
6. [Appendix: Authorization Summary](#appendix-authorization-summary)

---

## Service Overview

WsResources is an HPCC ESP service that provides cluster topology and resource-discovery operations. It exposes four methods: a liveness probe (`ping`), a service-registry query (`serviceQuery`), a compute-target query (`targetQuery`), and a web-link discovery call (`webLinks`). The service operates in two deployment modes — **containerized** (reads from Kubernetes/YAML config) and **bare-metal** (reads from HPCC environment XML) — and most methods behave differently depending on which mode is active. Authorization for all data-bearing methods is enforced at the `ResourceQueryAccess:READ` level.

---

## 1. `ping`

### Summary

`ping` is a lightweight liveness check provided automatically by the ESP framework. Both the request and response carry no payload — they are empty SOAP structures defined as `<xsd:all/>`. A successful response (HTTP 200) confirms that the `/WsResources` endpoint is reachable and processing requests. No authorization is required and no server-side state is read or modified.

### Request Fields

*No fields — empty SOAP envelope.*

### Response Fields

*No fields — empty SOAP envelope.*

### Server Processing

Handled automatically by the ESP runtime infrastructure. There is no custom `onPing` implementation in `ws_resourcesService.cpp`. The ESP framework responds with an HTTP 200 and an empty SOAP body for any request that reaches the service endpoint.

### Error Conditions

| Condition | Server Behavior |
|-----------|-----------------|
| Service down / port closed | TCP connection refused or timeout |
| Wrong credentials | HTTP 401 / HTTP 403 |
| Internal ESP error | HTTP 500 |

<details>
<summary>Client Side Testing Plan</summary>

**Existing coverage:** 1 test — basic ping on a containerized cluster only (`testPing`, skipped when not containerized).

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | Ping on a non-containerized cluster — verify `true` returned |
| CFT-002 | Core Functionality | Idempotency — 5 successive calls all return `true` |
| ECT-001 | Edge Case | 1 ms connection timeout — verify graceful `false` (not a thrown exception) |
| EHT-001 | Error Handling | Wrong credentials — verify `false` returned (exception swallowed by framework) |
| EHT-002 | Error Handling | Unreachable host (RFC 5737 address 192.0.2.1) — verify `false` returned |
| EHT-003 | Error Handling | Wrong port (19999) — verify `false` returned |
| EHT-004 | Error Handling | Malformed URL causing stub initialization failure — verify `Exception` is thrown (not swallowed) |

</details>

---

## 2. `serviceQuery`

### Summary

`serviceQuery` is the primary service-discovery endpoint of WsResources, returning a list of all registered public services from the cluster topology. In containerized mode it reads `services` entries from the global container YAML config, skipping entries with `@public=false` or an empty `@type`; in bare-metal mode it queries HPCC environment XML for Roxie clusters and ESP service bindings. Two optional filters — `type` and `name` — are applied as AND conditions using case-insensitive string matching. Requires `ResourceQueryAccess:READ` authorization.

### Request Fields

| Field | Required | Description | Notes |
|-------|----------|-------------|-------|
| `type` | No | Filter by service type (e.g., `"roxie"`, `"eclqueries"`, `"esp"`) | `null` or empty = no type filter |
| `name` | No | Filter by service name | Case-insensitive; `null` or empty = no name filter; name-only filter is valid |

### Response Fields

Each entry in the `Services` array is an `HPCCService` object:

| Field | Type | Description | Notes |
|-------|------|-------------|-------|
| `Name` | `string` | Service name | Non-null when entry is present |
| `Type` | `string` | Service type | Non-null when entry is present |
| `Port` | `UnsignedInt` | Service port | May be `0` for some bare-metal Roxie entries |
| `TLSSecure` | `boolean` | TLS/HTTPS enabled | Defaults to `false` |

Response uses `[nil_remove]` — an absent `Services` array (not an empty array) is returned when no services match. Exceptions are returned inline.

### Server Processing

**Containerized mode (`TpContainer.cpp`):**
1. Iterate over all `services` config entries.
2. Skip any entry where `@public=false`.
3. Skip any entry where `@type` is empty.
4. Apply type filter if provided (case-insensitive).
5. Skip any entry where `@name` is empty.
6. Apply name filter if provided (case-insensitive); break early on first name match when name filter is active.

**Bare-metal mode (`TpWrapper.cpp`):**
1. If type is empty or `"roxie"`, call `getRoxieServices` to collect Roxie cluster entries.
2. Always call `getESPServices` to collect ESP service entries, applying type and name filters.
3. A name-filtered Roxie lookup that finds no match produces: `"RoxieCluster %s not found."`.

### Error Conditions

| Condition | Server Behavior |
|-----------|-----------------|
| Internal C++ exception | Forwarded via `FORWARDEXCEPTION` → inline ESP exception in response |
| Named Roxie not found (bare-metal, name filter) | Inline exception: `"RoxieCluster %s not found."` |
| `ResourceQueryAccess:READ` denied | HTTP 401 / ESP authorization exception |
| No services match filters | Absent `Services` array (no error raised) |

<details>
<summary>Client Side Testing Plan</summary>

**Existing coverage:** 1 test — `serviceQueryTest` (no filters, containerized only, response not-null assertion only).

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | `type="roxie"` filter — all returned services must have type `"roxie"` |
| CFT-002 | Core Functionality | `type="eclqueries"` filter — all returned services must have type `"eclqueries"` |
| CFT-003 | Core Functionality | Name-only filter — dynamically discover a service name, re-query by name, verify single result |
| CFT-004 | Core Functionality | Both `type` and `name` set — dynamically discovered; expect exactly one matching result |
| CFT-005 | Core Functionality | Field completeness — every returned service has non-null name, non-null type, and port > 0 |
| ECT-001 | Edge Case | `type=""` (empty string) behaves identically to no filter — returns all services |
| ECT-002 | Edge Case | `name=""` (empty string) behaves identically to no filter |
| ECT-003 | Edge Case | Case-insensitive type: `"ROXIE"` returns the same results as `"roxie"` |
| ECT-004 | Edge Case | Non-existent type value → absent/empty `Services`, no exception |
| ECT-005 | Edge Case | Non-existent name value → absent/empty `Services`, no exception |
| ECT-006 | Edge Case | 1024-character type string → empty result, no server crash |
| ECT-007 | Edge Case | Valid type + mismatched name → empty result (AND-logic confirmed) |
| EHT-001 | Error Handling | Null request object → exception: `"ServiceQueryRequestWrapper must be provided!"` |
| EHT-002 | Error Handling | Unreachable host → connection exception propagated |
| EHT-003 | Error Handling | Wrong credentials → authorization exception or error response |
| EHT-004 | Error Handling | Non-containerized cluster → valid response or empty result (not exception) |
| EHT-005 | Error Handling | XML special characters in `type` → empty/error response, no crash |
| EHT-006 | Error Handling | Quote characters in `name` → no crash, controlled response |

</details>

---

## 3. `targetQuery`

### Summary

`targetQuery` discovers available compute target queues (Thor, HThor, Roxie) and Roxie publish targets from the cluster topology. It accepts a mandatory `Type` enum value (`All`, `Thor`, `HThor`, `Roxie`) and returns a list of matching queue entries plus, for Roxie-relevant requests, a list of Roxie cluster names that accept published queries. The server raises `ECLWATCH_INVALID_INPUT` with message `"HPCCQueueType not defined."` when `Type` is null or unrecognized. This method was introduced at WSDL version 1.03 and carries an OpenTelemetry `@WithSpan` trace annotation.

### Request Fields

| Field | Required | Description | Valid Values |
|-------|----------|-------------|--------------|
| `Type` | **Yes** (server-enforced) | Specifies which queue type(s) to return | `Thor`, `HThor`, `Roxie`, `All` |

`Type` is the only field. If omitted or null, the server returns an inline exception: `"HPCCQueueType not defined."` The `HPCCQueueType` string matching is case-insensitive in the wrapper layer.

### Response Fields

**`HPCCQueue` (each entry in `Queues`):**

| Field | Type | Description |
|-------|------|-------------|
| `Name` | `string` | Cluster/queue name |
| `Type` | `HPCCQueueType` | Queue type: `Thor`, `HThor`, or `Roxie` |

**`TargetQueryResponse`:**

| Field | Type | Description |
|-------|------|-------------|
| `Queues` | `ESParray<HPCCQueue>` | List of matching compute queues |
| `Roxies` | `ESParray<string>` | Names of Roxie clusters that accept published queries |
| `Exceptions` | inline | ESP exceptions on error |

### Server Processing

1. Read `req.getType()` — if `HPCCQueueType_Undefined`, throw `makeStringException(ECLWATCH_INVALID_INPUT, "HPCCQueueType not defined.")`.
2. Call `getWUClusterInfo(clusters)` to retrieve all known clusters from the platform topology.
3. For each cluster:
   - Map platform type: `ThorLCRCluster` → `Thor`, `RoxieCluster` → `Roxie`, all others → `HThor`.
   - For Roxie clusters that can publish queries: add name to `roxieTargetNames`. If `onlyPublishedQueries()` is true, skip adding to `queues`.
   - If `typeReq != All` and `typeReq != type`, skip this queue entry.
4. Return `Queues` and `Roxies` arrays.

**Response by type:**

| Requested Type | `Queues` contents | `Roxies` contents |
|----------------|-------------------|-------------------|
| `All` | All Thor, HThor, Roxie queues (excluding publish-only Roxies) | All publishable Roxie targets |
| `Thor` | Thor queues only | Empty / absent |
| `HThor` | HThor queues only | Empty / absent |
| `Roxie` | Roxie queues (non-publish-only) | All publishable Roxie targets |
| No clusters configured | Empty / absent | Empty / absent |

### Error Conditions

| Condition | Error Code | Message | Behavior |
|-----------|------------|---------|----------|
| `Type` is undefined / null | `ECLWATCH_INVALID_INPUT` | `"HPCCQueueType not defined."` | Returned as inline exception |
| Internal topology lookup failure | `ECLWATCH_INTERNAL_ERROR` | System-specific | Forwarded via `FORWARDEXCEPTION` |
| `ResourceQueryAccess:READ` denied | — | ESP authorization exception | HTTP 401 / inline exception |

<details>
<summary>Client Side Testing Plan</summary>

**Existing coverage:** 3 tests — `testTargetQueryNullType` (null type → error message), `testTargetQueryAllType` (Type=All → response not null, no content assertions), `testTargetQueryRoxieType` (Type=Roxie → response not null, no filter-correctness assertion).

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | `Type=Thor` — all returned queue entries must have type `"Thor"` |
| CFT-002 | Core Functionality | `Type=HThor` — all returned queue entries must have type `"HThor"` |
| CFT-003 | Core Functionality | `Type=All` — every returned queue entry has non-null name and a valid type (`Thor`, `HThor`, or `Roxie`) |
| CFT-004 | Core Functionality | `Type=Roxie` — `Roxies` list is non-null and each entry is a non-empty string |
| CFT-005 | Core Functionality | `Type=All` — `Roxies` list is null or contains only non-empty strings (integrity check) |
| ECT-001 | Edge Case | Lowercase `"all"` string in type wrapper — `getRaw()` maps correctly and request succeeds |
| ECT-002 | Edge Case | Uppercase `"THOR"` string in type wrapper — `getRaw()` maps to `Thor` and request succeeds |
| ECT-003 | Edge Case | Empty string `""` in type wrapper — `getRaw()` returns null; server returns `"HPCCQueueType not defined."` |
| ECT-004 | Edge Case | Unrecognized string `"InvalidType"` in type wrapper — `getRaw()` returns null; server returns `"HPCCQueueType not defined."` |
| EHT-001 | Error Handling | Null request object → exception: `"TargetQueryRequestWrapper must be provided!"` |
| EHT-002 | Error Handling | Request with type not set (default constructor) → server returns `"HPCCQueueType not defined."` |
| EHT-003 | Error Handling | Unreachable host → connection exception propagated |
| EHT-004 | Error Handling | `Type=Roxie` on a Thor-only cluster → response not null, no NPE when accessing `Queues`; result gracefully empty |

</details>

---

## 4. `webLinks`

### Summary

`webLinks` returns two categories of cluster resource links: **configured links** (statically declared in the component's `service/links` YAML config) and **discovered links** (dynamically enumerated from Kubernetes services via `kubectl get services -o=json`, available only in containerized deployments). The request carries no fields; all response content is determined entirely by server-side environment and configuration. The method is read-only and requires `ResourceQueryAccess:READ` authorization. It was introduced at WSDL version 1.01, with `ServiceConnection` added in v1.02 and `ResourceType` on configured links added in v1.04.

### Request Fields

*No fields — the request is intentionally empty per the IDL definition. All response behavior is driven server-side.*

### Response Fields

**Configured link (`ConfiguredWebLink`):**

| Field | Type | Description | Notes |
|-------|------|-------------|-------|
| `Name` | `string` | Link display name | From `@name` in YAML config |
| `Description` | `string` | Link description | From `@description` in YAML config |
| `URL` | `string` | Link target URL | From `@url` in YAML config |
| `ResourceType` | `string` (enum) | Resource category | v1.04+; one of `UNKNOWN`, `TRACES`, `LOGS`, `METRICS`; defaults to `"UNKNOWN"` if absent or empty |

**Discovered link (`DiscoveredWebLink`, containerized only):**

| Field | Type | Description | Notes |
|-------|------|-------------|-------|
| `ServiceName` | `string` | Kubernetes service name | From `metadata/name` |
| `NameSpace` | `string` | Kubernetes namespace | From `metadata/namespace` |
| `Annotations` | `NamedValue[]` | HPCC-specific annotations | Keys prefixed `hpcc.<application>.io_f*` |
| `Connection` | `ServiceConnection` | Service connection info | v1.02+; type, ExternalIPs, ExternalIPStatus, Ports |

**`ServiceConnection`:**

| Field | Type | Description |
|-------|------|-------------|
| `Type` | `string` | Kubernetes service type (`ClusterIP`, `NodePort`, `LoadBalancer`, `ExternalName`) |
| `ExternalIPs` | `string[]` | External IP addresses |
| `ExternalIPStatus` | `string` (enum) | One of `Unknown`, `None`, `Pending` when no ExternalIPs |
| `Ports` | `ServicePort[]` | Exposed ports |

**`WebLinksQueryResponse`:**

| Field | Type | Description |
|-------|------|-------------|
| `DiscoveredWebLinks` | `ESParray<DiscoveredWebLink>` | Kubernetes-discovered links; null/empty on bare-metal |
| `ConfiguredWebLinks` | `ESParray<ConfiguredWebLink>` | Statically configured links; null/empty if no config |
| `Exceptions` | inline | ESP exceptions on error |

### Server Processing

**Step 1 — ConfiguredWebLinks (all modes):**
Read `service/links` from the component YAML. For each entry, construct a `ConfiguredWebLink` with `Name`, `Description`, `URL`, and (v1.04+) `ResourceType` (uppercased; defaults to `"UNKNOWN"` if absent or empty).

**Step 2 — DiscoveredWebLinks (containerized only):**
1. Run `kubectl get services -o=json`.
2. For each Kubernetes service, check for annotation `hpcc.<application>.io_fenabled = true`; skip services that lack it.
3. Extract `metadata/name` (ServiceName) and `metadata/namespace` (NameSpace).
4. Extract all `hpcc.<application>.io_f*` annotations.
5. (v1.02+) Extract `ServiceConnection` fields: type, ExternalIPs, ExternalIPStatus, Ports.

**Step 3:** Return response. On bare-metal, `DiscoveredWebLinks` is absent.

**Response by deployment mode:**

| Scenario | `DiscoveredWebLinks` | `ConfiguredWebLinks` |
|----------|---------------------|---------------------|
| Bare-metal, no configured links | Absent | Absent |
| Bare-metal, with configured links | Absent | 1+ entries |
| Containerized, no annotated services | Absent / empty | Absent / empty |
| Containerized, with annotated services | 1+ entries | Absent / empty |
| Containerized, both sources present | 1+ entries | 1+ entries |

### Error Conditions

| Condition | Mechanism | Server Behavior |
|-----------|-----------|-----------------|
| `kubectl` command fails (containerized) | `IException` thrown | Forwarded as SOAP fault |
| `kubectl` returns empty output | `IException` thrown | Forwarded as SOAP fault |
| `@application` config property missing | Returns `false` silently | `DiscoveredWebLinks` absent, no error raised |
| `ResourceQueryAccess:READ` denied | ESP auth | HTTP 401 / inline ESP exception |

<details>
<summary>Client Side Testing Plan</summary>

**Existing coverage:** 1 test — `testWebLinksQuery` (empty request, response not-null assertion only; no field validation).

| ID | Category | Description |
|----|----------|-------------|
| CFT-002 | Core Functionality | Non-containerized cluster — `DiscoveredWebLinks` is null or empty; no exception thrown |
| CFT-003 | Core Functionality | Containerized cluster — `DiscoveredWebLinks` is non-null; each entry has a non-null `ServiceName` |
| CFT-004 | Core Functionality | Cluster with configured links — `ConfiguredWebLinks` is non-null and non-empty; each entry has non-null, non-empty `Name` and `URL` |
| CFT-005 | Core Functionality | Containerized cluster with discovered links — each entry has non-null `ServiceName`, non-null `NameSpace`, non-null `Annotations` list |
| CFT-006 | Core Functionality | v1.04+ — `ResourceType` field on `ConfiguredWebLink` entries is one of `UNKNOWN`, `TRACES`, `LOGS`, `METRICS` |
| ECT-001 | Edge Case | v1.02+ — `ServiceConnection` on discovered links is non-null; `Connection.Type` is non-null |
| ECT-002 | Edge Case | `ExternalIPStatus` for services with no ExternalIPs is a valid enum value (not null) |
| ECT-003 | Edge Case | Bare-metal cluster with no configured links — both `DiscoveredWebLinks` and `ConfiguredWebLinks` are null/absent; response object itself is non-null |
| EHT-001 | Error Handling | Null request object → exception: `"WebLinksQueryRequestWrapper must be provided!"` |
| EHT-002 | Error Handling | Invalid credentials → authorization exception or error response |
| EHT-003 | Error Handling | Unreachable host (stub initialization failure) → exception with meaningful message (not NPE) |
| EHT-004 | Error Handling | 1 ms connection timeout → exception thrown within 5 seconds; message references timeout or connection failure |

</details>

---

## Appendix: Authorization Summary

| Method | Authorization Required | Permission | Notes |
|--------|------------------------|------------|-------|
| `ping` | No | — | ESP framework built-in; no feature permission check |
| `serviceQuery` | Yes | `ResourceQueryAccess:READ` | Applied before any data is returned |
| `targetQuery` | Yes | `ResourceQueryAccess:READ` | Applied before any data is returned |
| `webLinks` | Yes | `ResourceQueryAccess:READ` | Applied before any data is returned |

---

*Generated: 2026-03-10*

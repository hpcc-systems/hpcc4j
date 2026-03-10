# WsStore ESP Service — Analysis and Client Side Test Plan Document

**Generated:** 2026-03-10  
**Source:** `WsStore.AllMethodsAnalysis_2026-02-24.md`  
**Service IDL:** `esp/scm/ws_store.ecm` (version 1.02)  
**Server Implementation:** `ws_storeService.cpp`, `daliKVStore.cpp`  

---

## Service Overview

WsStore is a generic key-value store service hosted within the HPCC ESP framework. Data is persisted in the HPCC DALI tree under `/KVStore/Store[@name='<encodedStoreName>']`. Each entry is addressed by a three-part path: **store → namespace → key**. Key and namespace names are encoded via `encodePTreeName()` before use as DALI property tree node names.

**Authorization features (from IDL):**
- `WsStoreAccess:READ` — fetch/list operations
- `WsStoreAccess:WRITE` — set/write operations
- `WsStoreAccess:FULL` — create store, delete operations, fetch key metadata

**Scoping:** All operations support two scopes controlled by the `UserSpecific` request field:
- `UserSpecific=false` — global scope (shared, visible to all users)
- `UserSpecific=true` — user scope (private to the authenticated user, or a named target user)

---

## Table of Contents

1. [ping](#1-ping)
2. [createStore](#2-createstore)
3. [listStores](#3-liststores)
4. [setValue](#4-setvalue)
5. [fetchValue](#5-fetchvalue)
6. [fetchAllNSKeys](#6-fetchallnskeys)
7. [fetchKeyMetaData](#7-fetchkeymetadata)
8. [listNamespaces](#8-listnamespaces)
9. [listNSKeys](#9-listnskeys)
10. [setValueEncrypted](#10-setvalueencrypted)
11. [fetchValueEncrypted](#11-fetchvalueencrypted)
12. [deleteValue](#12-deletevalue)
13. [deleteNamespace](#13-deletenamespace)

---

## 1. `ping`

### Summary

`ping` is a lightweight liveness/health-check operation provided by the ESP framework for every service. It carries no request payload and returns no response payload — a successful HTTP 200 with an empty response body indicates the service is reachable and handling requests. It is used as a pre-flight check before heavier operations, or as a periodic availability probe. No authorization is required and no server-side state is read or modified.

### Server Behavior

**Request Fields**

| Field | Required | Description |
|-------|----------|-------------|
| *(none)* | — | Request is an empty SOAP envelope element |

**Response Fields**

| Field | Type | Description |
|-------|------|-------------|
| *(none)* | — | Response is an empty SOAP envelope element |

**Server Processing**

The `Ping` operation is a standard ESP infrastructure method — not declared as an `ESPmethod` in the WsStore IDL. The ESP runtime handles it automatically, returning HTTP 200 with an empty `wsstorePingResponse` body when the service process is running and able to handle requests.

**Error Conditions**

| Condition | Server Behavior |
|-----------|-----------------|
| Service down / port closed | TCP connection refused or timeout |
| Internal server error | HTTP 500 |
| Authentication required, wrong credentials | HTTP 401 / 403 |

---

<details>
<summary><strong>Client Side Testing Plan</strong></summary>

**Existing coverage:** Basic successful ping against a live, authenticated cluster (`ping()` returns `true`).

**New test cases:**

| ID | Category | Description |
|----|----------|-------------|
| ECT-001 | Edge Case | Client configured with an unreachable host — verify the operation fails gracefully (not an unhandled exception) |
| ECT-002 | Edge Case | Client configured with a valid host but wrong port (connection refused) — verify graceful failure |
| EHT-001 | Error Handling | Stub not initialized (null connection) — verify `Exception` is propagated (not a silent false return) |
| EHT-002 | Error Handling | Wrong credentials on an authenticated cluster — verify graceful failure |

</details>

---

## 2. `createStore`

### Summary

`createStore` registers a new named key-value store in the DALI-backed KV service. It is a prerequisite for all store-specific operations — no other WsStore method can successfully target a store that has not been created. The operation is idempotent: creating a store that already exists returns `Success=false` without an error. Requires `WsStoreAccess:FULL` authorization.

### Server Behavior

**Request Fields**

| Field | Required | Description | Notes |
|-------|----------|-------------|-------|
| `Name` | **Yes** | Store name | Empty name throws: `"DALI Keystore createStore(): Store name not provided"` |
| `Type` | No | Optional label categorizing the store | Stored as `@type` attribute |
| `Description` | No | Free-text description | Stored as `@description` attribute |
| `MaxValueSize` | No | Maximum allowed value size in bytes | Available v1.02+; default 1024 bytes |
| `UserSpecific` | — | Deprecated as of v1.01 | Ignored by server |

**Response Fields**

| Field | Type | Description |
|-------|------|-------------|
| `Success` | `bool` | `true` = store created; `false` = store already existed (no error) |
| `Name` | `string` | Echoed from request |
| `Type` | `string` | Echoed from request |
| `Description` | `string` | Echoed from request |
| `Owner` | `string` | Authenticated user who created the store (`@createUser`) |

**Server Processing**

1. Validates `Name` is non-empty; throws if absent.
2. Reads `MaxValueSize` (v1.02+).
3. Delegates to `CDALIKVStore::createStore()`.
4. `encodePTreeName()` is applied to the store name before use as a DALI property node name.
5. Acquires a DALI read lock and checks for existence.
6. If not found: acquires write lock and creates the store node with metadata attributes.
7. Returns `Success=true` (created) or `Success=false` (already existed).

**Error Conditions**

| Condition | Server Behavior |
|-----------|-----------------|
| `Name` is empty | Exception: `"DALI Keystore createStore(): Store name not provided"` |
| DALI offline | Exception thrown from `ensureAttachedToDali()` |
| Insufficient permission (`WsStoreAccess:FULL`) | ESP authorization rejection |

---

<details>
<summary><strong>Client Side Testing Plan</strong></summary>

**Existing coverage:** Basic store creation (`a1createStoreTest`) and encoded-name store creation (`b1createEncodedStoreTest`).

**New test cases:**

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | Verify response fields (`Name`, `Type`, `Description`, `Owner`) match the request |
| CFT-002 | Core Functionality | Create a store with only the required `Name` field (all optional fields omitted) |
| CFT-003 | Core Functionality | Create a store and verify it appears in a subsequent `listStores` result |
| CFT-004 | Core Functionality | Create multiple stores with distinct names; verify all are independently created |
| ECT-001 | Edge Case | Idempotency — create a store that already exists; verify `Success=false` with no error |
| ECT-002 | Edge Case | Create with null `Description` and `Type` (explicitly omitted) |
| ECT-003 | Edge Case | Create with a 255-character store name |
| ECT-004 | Edge Case | Create with a very long description (1000+ characters) |
| ECT-005 | Edge Case | Create with special characters in the name (spaces, dots, slashes) |
| ECT-006 | Edge Case | Create with Unicode characters in the name |
| EHT-001 | Error Handling | Empty string name — verify server exception |
| EHT-002 | Error Handling | Null name — verify server exception |
| EHT-003 | Error Handling | Insufficient permissions — verify authorization failure |
| EHT-004 | Error Handling | Invalid/unreachable connection |
| EHT-005 | Error Handling | Wrong credentials |

</details>

---

## 3. `listStores`

### Summary

`listStores` returns a list of all key-value stores registered in DALI, with optional wildcard filters on name, type, and owner. It is a read-only discovery operation used to enumerate available stores, confirm store existence, or build administrative UI listings. All three filter fields support `*` and `?` wildcard patterns and are applied as AND conditions server-side. Requires `WsStoreAccess:READ` authorization and server API version ≥ 1.02.

### Server Behavior

**Request Fields**

| Field | Required | Description | Notes |
|-------|----------|-------------|-------|
| `NameFilter` | No | Wildcard filter on store name | Defaults to `"*"` (match all) if empty |
| `TypeFilter` | No | Wildcard filter on store type | Skipped entirely if empty/null |
| `OwnerFilter` | No | Wildcard filter on store owner (createUser) | Skipped entirely if empty/null |

**Response Fields (`StoreInfo` per store)**

| Field | Type | Description |
|-------|------|-------------|
| `name` | `string` | Store identifier |
| `type` | `string` | User-defined store type |
| `description` | `string` | Free-text description |
| `owner` | `string` | Username of the store creator (`@createUser`) |
| `createTime` | `string` | Timestamp of creation |
| `maxValSize` | `string` | Maximum value size in bytes |
| `isDefault` | `boolean` | `true` if this store is the server-configured default |

**Server Processing**

1. Extracts authenticated user from context.
2. Reads `NameFilter`, `TypeFilter`, `OwnerFilter` from request.
3. Delegates to `CDALIKVStore::getStores()`.
4. Iterates all stores in DALI; applies `wildcardmatch()` for each non-empty filter.
5. For each matching store, populates `StoreInfo` with attributes.
6. Sets `isDefault` by comparing store name (case-insensitive) against the server-configured default store name.
7. Returns populated `Stores` array.

**Error Conditions**

| Condition | Server Behavior |
|-----------|-----------------|
| DALI connection failure | Exception: `"DALI Keystore fetch: Unable to connect to..."` |
| `WsStoreAccess:READ` denied | ESP authorization rejection |
| API version < 1.02 | Method unavailable |
| No stores match filters | Empty `Stores` array (no error) |

---

<details>
<summary><strong>Client Side Testing Plan</strong></summary>

**Existing coverage:** No-filter listing (`listStoresTest`); name filter and type filter with weak assertions (`listStoresWithFilterTest`).

**New test cases:**

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | Apply `OwnerFilter` — verify all returned stores have owner matching the filter |
| CFT-002 | Core Functionality | All three filters combined — verify AND semantics |
| CFT-003 | Core Functionality | Verify `StoreInfo` field completeness: `name`, `type`, `owner`, `createTime`, `maxValSize` are all populated |
| CFT-004 | Core Functionality | Verify `isDefault` — at most one store has `isDefault=true` |
| CFT-005 | Core Functionality | Explicit `null` filters on three-argument form — verify identical results to no-arg form |
| CFT-006 | Core Functionality | Type filter strict assertion — all returned stores must have the filtered type |
| ECT-001 | Edge Case | Filter that matches zero stores — verify empty array returned (not null) |
| ECT-002 | Edge Case | Wildcard `nameFilter` pattern (e.g., `"WsClient*"`) — verify matching stores returned |
| ECT-003 | Edge Case | Empty string filters (`""`) behave as no-filter |
| ECT-004 | Edge Case | Owner filter with wildcard (`"user*"`) |
| ECT-005 | Edge Case | Non-matching owner filter combined with valid type filter — verify zero results (AND semantics) |
| EHT-001 | Error Handling | Invalid connection — verify empty array returned gracefully |
| EHT-002 | Error Handling | Wrong credentials on authenticated cluster |
| EHT-003 | Error Handling | Null connection object |

</details>

---

## 4. `setValue`

### Summary

`setValue` creates or updates a key-value pair in a named namespace within a store. It is the primary write operation in the service and the foundation for all data persistence — the encrypted variants (`setValueEncrypted`) are client-side wrappers that call this operation with pre-encrypted values. On first write, the server creates the key node with `@createTime` and `@createUser` metadata; on subsequent writes, it updates the value and sets `@editTime` and `@editBy`. Requires `WsStoreAccess:WRITE` authorization.

### Server Behavior

**Request Fields**

| Field | Required | Description | Notes |
|-------|----------|-------------|-------|
| `StoreName` | No | Target store name | Falls back to server default store if empty; throws if no default |
| `Namespace` | **Yes** | Logical grouping within the store | Throws if empty: `"DALI Keystore set(): namespace not provided"` |
| `Key` | Yes (effective) | Key within the namespace | Empty key behavior is DALI-implementation defined |
| `Value` | No | String value to store | Subject to `MaxValSize` limit; empty string is valid |
| `UserSpecific` | No | `false` = global (default); `true` = per-user | Requires authenticated user when `true` |

**Response Fields**

| Field | Type | Description |
|-------|------|-------------|
| `Success` | `bool` | `true` = written successfully |

**Server Processing**

1. If `StoreName` is empty, substitutes `m_defaultStore`; throws if still empty.
2. Encodes store name via `encodePTreeName()`.
3. If `UserSpecific=true` and no authenticated user is present, throws exception.
4. Validates `Namespace` is non-empty; throws if absent.
5. Encodes namespace via `encodePTreeName()`.
6. Acquires DALI write lock; throws if DALI connection fails or store path not found.
7. Validates value length against `MaxValSize`; throws if exceeded.
8. Locates or creates the owner tree (global or encoded username under the store).
9. Locates or creates the namespace tree, setting `@createTime` on first access.
10. Encodes key via `encodePTreeName()`; creates or updates the key node.
11. Sets `@createTime`/`@createUser` on new keys; sets `@editTime`/`@editBy` on updates.
12. Commits DALI transaction; returns `true`.

**Error Conditions**

| Condition | Server Behavior |
|-----------|-----------------|
| `StoreName` empty, no default | Exception: `"DALI Keystore set(): Store name not provided"` |
| `Namespace` empty/null | Exception: `"DALI Keystore set(): namespace not provided"` |
| `UserSpecific=true`, no user | Exception: `"DALI Keystore set(): Attempting to set non-global entry but owner name not provided"` |
| Value exceeds `MaxValSize` | Exception: `"DALI Keystore set(): Size of the value exceeds maximum size allowed (N)"` |
| DALI offline | Exception from `ensureAttachedToDali()` |
| Store path not found in DALI | Exception: `"DALI Keystore set(): Unable to connect to DALI KeyValue store path '...'"` |

---

<details>
<summary><strong>Client Side Testing Plan</strong></summary>

**Existing coverage:** Basic global set (`a2setTest`); user-specific set (conditional on auth); overwrite (same key set twice but without fetch verification); encoded store/namespace/key names (`b3setEncodedTest`); short and special-char keys.

**New test cases:**

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | Overwrite existing value and verify fetched value reflects the update (round-trip verification) |
| CFT-002 | Core Functionality | Set empty string value — verify server accepts it and metadata is written |
| ECT-001 | Edge Case | Unicode/multi-byte value (emoji, CJK characters) — verify round-trip fidelity |
| ECT-002 | Edge Case | Value containing XML-special characters (`<`, `>`, `&`, `"`, `'`) — verify no corruption |
| ECT-003 | Edge Case | Large value approaching `MaxValSize` (1024 bytes default) |
| ECT-004 | Edge Case | Key with whitespace characters — verify `encodePTreeName()` round-trip |
| ECT-005 | Edge Case | Namespace with special characters (dots, hyphens, slashes) |
| EHT-001 | Error Handling | Empty namespace — verify server throws |
| EHT-002 | Error Handling | Null namespace — verify server throws |
| EHT-003 | Error Handling | Non-existent store name — verify failure |
| EHT-004 | Error Handling | Value exceeds `MaxValSize` — verify server throws |
| EHT-005 | Error Handling | User-specific set on unauthenticated cluster — verify server throws |
| EHT-006 | Error Handling | Invalid/unreachable connection |
| EHT-007 | Error Handling | Empty string key — document server behavior |

</details>

---

## 5. `fetchValue`

### Summary

`fetchValue` retrieves a stored string value for a specific key within a named namespace and store. It is the primary read operation in the service and the complement to `setValue`. The server distinguishes two outcomes: key-not-found returns a null/absent value (via `[nil_remove]` IDL annotation, no error thrown), while missing or invalid namespace/store arguments do throw exceptions. Requires `WsStoreAccess:READ` authorization.

### Server Behavior

**Request Fields**

| Field | Required | Description | Notes |
|-------|----------|-------------|-------|
| `StoreName` | No | Target store name | Falls back to server default store if empty |
| `Namespace` | **Yes** | Namespace within the store | Throws if empty: `"DALI Keystore fetch: key not provided!"` *(misleading message — this is the namespace check)* |
| `Key` | **Yes** | Key to look up | Throws if empty: `"DALI Keystore fetch: Key not provided!"` |
| `UserSpecific` | No | `false` = global (default); `true` = per-user | Requires authenticated user when `true` |

**Response Fields**

| Field | Type | Description |
|-------|------|-------------|
| `Value` | `string` (nil_remove) | The stored value if found; absent/null if key does not exist |

**Server Processing**

1. Extracts `StoreName`; if empty, substitutes `m_defaultStore`.
2. Encodes store name.
3. If `UserSpecific=true` and no user is present, throws exception.
4. Validates `Namespace` is non-empty; throws if absent.
5. Connects to DALI store path; throws if connection fails.
6. Constructs XPath for `Global/<encodedNS>` or `<encodedUser>/<encodedNS>`.
7. Throws if namespace node does not exist.
8. Encodes key; if key node is absent, returns `false` (no exception).
9. If key exists, sets `resp.setValue(value)` and returns `true`.
10. With `[nil_remove]`, an absent value field in the response indicates key-not-found.

**Error Conditions**

| Condition | Server Behavior |
|-----------|-----------------|
| `StoreName` empty, no default | Exception: `"DALI Keystore fetch(): Store name not provided"` |
| `Namespace` empty | Exception: `"DALI Keystore fetch: key not provided!"` *(namespace check)* |
| `Key` empty | Exception: `"DALI Keystore fetch: Key not provided!"` |
| `UserSpecific=true`, no user | Exception: `"Attempting to fetch non-global entry but requester name not provided"` |
| Store not found (no DALI connection) | Exception: `"DALI Keystore fetch: Unable to connect to DALI KeyValue store path '%s'"` |
| Namespace node does not exist | Exception: `"DALI Keystore fetch: invalid namespace '%s' detected!"` |
| Key node does not exist | Returns `false`; value is absent in response (no exception) |

---

<details>
<summary><strong>Client Side Testing Plan</strong></summary>

**Existing coverage:** Fetch of non-existent key (returns null, `a3fetchInvalidKeyTest`); encoded key name with special character (`b4fetchEncodedKeyTest`); fetch as part of delete round-trip validation (`a5deleteValueTest`). No dedicated basic-operation test exists.

**New test cases:**

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | Dedicated basic fetch — set a known value, verify fetch returns the exact stored string |
| CFT-002 | Core Functionality | Fetch reflects updated value after overwrite |
| ECT-001 | Edge Case | Empty `StoreName` (default store fallback) |
| ECT-002 | Edge Case | Value containing XML/HTML special characters and Unicode — verify no corruption |
| ECT-003 | Edge Case | Value at `MaxValueSize` (1024 chars) — verify full value returned intact |
| EHT-001 | Error Handling | Empty namespace — verify server exception behavior |
| EHT-002 | Error Handling | Empty key — verify server exception behavior |
| EHT-003 | Error Handling | Non-existent store name |
| EHT-004 | Error Handling | Non-existent namespace in valid store — distinct from non-existent key |
| EHT-005 | Error Handling | User-specific fetch on unauthenticated cluster |
| EHT-006 | Error Handling | Invalid/unreachable connection |

</details>

---

## 6. `fetchAllNSKeys`

### Summary

`fetchAllNSKeys` retrieves all key-value pairs stored within a specific namespace as a bulk read, returning both keys and their values together. It is complementary to `listNSKeys` (which returns only key names) — this method provides the complete content of a namespace in one call. The operation is read-only and requires `WsStoreAccess:READ` authorization. An empty namespace (no keys) returns an empty set, not an error.

### Server Behavior

**Request Fields**

| Field | Required | Description | Notes |
|-------|----------|-------------|-------|
| `StoreName` | No | Target store name | Falls back to server default store if empty |
| `Namespace` | **Yes** | Namespace to retrieve all pairs from | Throws if empty: `"Namespace not provided!"` |
| `UserSpecific` | No | `false` = global (default); `true` = per-user | Requires authenticated user when `true` |

**Response Fields**

| Field | Type | Description |
|-------|------|-------------|
| `Namespace` | `string` | Echoed from request |
| `Pairs` | `ESParray<KVPair>` | Array of `{key, value}` pairs; may be empty or null if namespace has no entries |

**Server Processing**

1. Reads `StoreName`; substitutes `m_defaultStore` if empty.
2. Calls `m_storeProvider->getAllPairs(storename, ns, secuser, !UserSpecific)`.
3. `getAllPairs` validates store name, user (if user-specific), and namespace are non-empty.
4. Encodes store name and namespace via `encodePTreeName()`.
5. Connects to DALI; throws if connection fails.
6. Looks up the namespace node; throws `"invalid namespace detected!"` if absent.
7. Iterates all child nodes; decodes each key via `decodePtreeName()`.
8. Sets `Pairs` array and `Namespace` in response.

**Error Conditions**

| Condition | Server Behavior |
|-----------|-----------------|
| `StoreName` empty, no default | Exception from `getAllPairs` |
| `Namespace` empty/null | Exception: `"Namespace not provided!"` |
| `UserSpecific=true`, no user | Exception: `"Attempting to fetch non-global entries but requester name not provided"` |
| Store not found | Exception: `"Unable to connect to DALI KeyValue store path"` |
| Namespace not found | Exception: `"invalid namespace detected!"` |
| DALI offline | Exception from `ensureAttachedToDali()` |

---

<details>
<summary><strong>Client Side Testing Plan</strong></summary>

**Existing coverage:** Basic global fetch from standard store/namespace after data seeded (`a3fetchAllNSKeysTest`); fetch across all namespaces (no content assertions); fetch with special-character store/namespace names (`b4fetchAllEncodedNSKeysTest`). None validate returned content.

**New test cases:**

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | Verify returned pairs contain exactly the key-value pairs that were seeded (content assertion) |
| CFT-002 | Core Functionality | User-specific (`UserSpecific=true`) fetch with content verification — verify user keys only |
| CFT-003 | Core Functionality | Namespace with no keys returns empty (not null) result |
| ECT-001 | Edge Case | Empty `StoreName` (default store fallback) |
| ECT-002 | Edge Case | Store/namespace names with XML/URL-special characters beyond `@` and `_` |
| ECT-003 | Edge Case | Large namespace — 100 key-value pairs; verify all are returned |
| ECT-004 | Edge Case | Value at `MaxValueSize` (1024 chars) — verify full value returned intact |
| EHT-001 | Error Handling | Non-existent store name |
| EHT-002 | Error Handling | Non-existent namespace within a valid store |
| EHT-003 | Error Handling | Empty namespace parameter |
| EHT-004 | Error Handling | User-specific fetch when unauthenticated |
| EHT-005 | Error Handling | Null connection |
| EHT-006 | Error Handling | Invalid credentials |

</details>

---

## 7. `fetchKeyMetaData`

### Summary

`fetchKeyMetaData` retrieves the metadata attributes (`@createUser`, `@createTime`, `@editTime`, `@editBy`) associated with a specific stored key without returning the key's value. This supports auditing and change-tracking use cases. The server always echoes back the `StoreName`, `Namespace`, and `Key` fields in the response regardless of whether the key exists, and returns `true` even when no metadata is found. Requires `WsStoreAccess:FULL` authorization.

### Server Behavior

**Request Fields**

| Field | Required | Description | Notes |
|-------|----------|-------------|-------|
| `StoreName` | No | Target store name | Falls back to server default store if empty |
| `Namespace` | No (logically required) | Namespace containing the key | Empty namespace may produce empty results |
| `Key` | No (logically required) | Key whose metadata to retrieve | Empty key produces empty result |
| `UserSpecific` | No | `false` = global (default); `true` = per-user | — |

**Response Fields**

| Field | Type | Description |
|-------|------|-------------|
| `StoreName` | `string` | Echoed (resolved) store name |
| `Namespace` | `string` | Echoed namespace |
| `Key` | `string` | Echoed key |
| `Pairs` | `ESParray<KVPair>` | Array of metadata `{name, value}` attribute pairs |

**Known Metadata Attributes**

| Attribute | Description | When Present |
|-----------|-------------|--------------|
| `@createUser` | Username of key creator | Always (if key exists) |
| `@createTime` | RFC-style creation timestamp | Always (if key exists) |
| `@editTime` | Timestamp of last update | Only after first overwrite |
| `@editBy` | Username of last editor | Only after first overwrite |

**Server Processing**

1. Extracts `StoreName`; substitutes `m_defaultStore` if empty.
2. Calls `m_storeProvider->getAllKeyProperties(storename, ns, key, secuser, !UserSpecific)`.
3. If the property tree is non-null, iterates XML attributes and populates `Pairs` array.
4. Always sets `StoreName`, `Namespace`, and `Key` on the response (echo-back).
5. Returns `true` regardless of whether metadata exists.

**Error Conditions**

| Condition | Server Behavior |
|-----------|-----------------|
| `StoreName` empty, no default | Empty response (no pairs); may include ESP exception |
| Auth required, `UserSpecific=true`, no user | Empty pairs or server exception |
| Internal store access failure | ESP exception in response |
| Key does not exist | Empty `Pairs` — no exception thrown (server returns `true`) |

---

<details>
<summary><strong>Client Side Testing Plan</strong></summary>

**Existing coverage:** Fetch metadata for encoded store/namespace (`b4fetchEncodedNSKeysAttributesTest`); encoded key name (`b4fetchEncodedKeyTest`); indirect traversal in `listNamespaces` test. No test verifies specific attribute values.

**New test cases:**

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | Fetch metadata for a freshly created key — verify `@createUser` and `@createTime` are present and non-empty |
| CFT-002 | Core Functionality | Fetch metadata after key is updated — verify `@editTime` and `@editBy` are now present |
| CFT-003 | Core Functionality | User-specific key metadata (`UserSpecific=true`) |
| CFT-004 | Core Functionality | Verify response echoes correct `StoreName`, `Namespace`, and `Key` fields |
| ECT-001 | Edge Case | Null `StoreName` — verify default store fallback |
| ECT-002 | Edge Case | Non-existent key — verify empty `Pairs` returned, no exception |
| ECT-003 | Edge Case | Empty string key — verify graceful empty result |
| ECT-004 | Edge Case | Non-existent namespace — verify graceful empty result |
| ECT-005 | Edge Case | Key with dot-notation name (`files.rowperpage.default`) — real-world naming convention |
| EHT-001 | Error Handling | Non-existent store name — verify behavior (empty result or exception) |
| EHT-002 | Error Handling | User-specific request on unauthenticated cluster |
| EHT-003 | Error Handling | Null key parameter |

</details>

---

## 8. `listNamespaces`

### Summary

`listNamespaces` returns all namespace names that exist within a named store. A namespace is created implicitly when the first key-value pair is written into it via `setValue`. This is a read-only discovery method used to enumerate namespaces before performing namespace-level operations such as `fetchAllNSKeys`, `listNSKeys`, or `deleteNamespace`. The server does not throw an error when no namespaces are found — it returns an empty result. Requires `WsStoreAccess:READ` authorization.

### Server Behavior

**Request Fields**

| Field | Required | Description | Notes |
|-------|----------|-------------|-------|
| `StoreName` | No | Target store name | Falls back to server default store if empty |
| `UserSpecific` | No | `false` = global namespaces (default); `true` = per-user namespaces | — |

**Response Fields**

| Field | Type | Description |
|-------|------|-------------|
| `StoreName` | `string` | Echoed (resolved) store name |
| `Namespaces` | `ESParray<string>` | Array of namespace name strings; null/absent if store has no namespaces |

**Server Processing**

1. Retrieves authenticated user from context.
2. Reads `StoreName`; substitutes `m_defaultStore` if empty.
3. Calls `m_storeProvider->fetchAllNamespaces(namespaces, storename, secuser, !UserSpecific)`.
4. Sets `Namespaces` array and `StoreName` on response.
5. Returns `true` (no explicit exception thrown for empty/not-found store).

**Error Conditions**

| Condition | Server Behavior |
|-----------|-----------------|
| Store does not exist | Empty namespace list returned (no ESP exception at this layer) |
| `StoreName` empty, no default | Provider called with empty name; behavior is implementation-defined |
| Store provider internal failure | May propagate as SOAP fault |
| `WsStoreAccess:READ` denied | ESP authorization rejection |

---

<details>
<summary><strong>Client Side Testing Plan</strong></summary>

**Existing coverage:** Global namespace listing (`listNamespaces` test); conditional user-specific listing when authenticated. Neither test asserts specific namespace names.

**New test cases:**

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | After seeding 3 known namespaces, verify all three namespace names are present in result |
| CFT-002 | Core Functionality | Empty `StoreName` (default store fallback) |
| CFT-003 | Core Functionality | List namespaces on encoded-name store (`WsCli@ntT_estStore`) |
| ECT-001 | Edge Case | Store with no namespaces — verify null/empty result without error |
| ECT-002 | Edge Case | User-specific namespace isolation — global namespaces not visible in user listing, and vice versa |
| ECT-003 | Edge Case | Store with 10+ namespaces — verify all returned with no duplicates |
| EHT-001 | Error Handling | Non-existent store name — verify empty result (no error) |
| EHT-002 | Error Handling | Null `StoreName` — verify no NPE; server falls back to default store |
| EHT-003 | Error Handling | User-specific listing on unauthenticated cluster — verify graceful empty result |
| EHT-004 | Error Handling | Uninitialized/invalid connection |

</details>

---

## 9. `listNSKeys`

### Summary

`listNSKeys` returns all key names stored within a specific namespace, without returning their values. It is complementary to `fetchAllNSKeys` (which returns both key names and values). This method is used to enumerate available keys before fetching or deleting individual entries. Unlike `fetchAllNSKeys`, a non-existent namespace causes the server to throw an exception rather than return an empty result. Requires `WsStoreAccess:READ` authorization.

### Server Behavior

**Request Fields**

| Field | Required | Description | Notes |
|-------|----------|-------------|-------|
| `StoreName` | No | Target store name | Falls back to server default store if empty; throws if no default |
| `Namespace` | **Yes** | Namespace whose keys to list | Throws if empty: `"DALI Keystore fetchKeySet: Namespace not provided!"` |
| `UserSpecific` | No | `false` = global (default); `true` = per-user | Throws if `true` and no authenticated user |

**Response Fields**

| Field | Type | Description |
|-------|------|-------------|
| `StoreName` | `string` | Echoed (resolved) store name |
| `Namespace` | `string` | Echoed namespace |
| `KeySet` | `ESParray<string>` | Decoded key names; may be null/empty if namespace has no keys |

**Server Processing**

1. Reads `Namespace`, `StoreName`, `UserSpecific` from request.
2. Substitutes `m_defaultStore` if `StoreName` is empty.
3. Calls `m_storeProvider->fetchKeySet(keys, storename, ns, secuser, global)`.
4. `fetchKeySet` validates store name, user (if user-specific), and namespace are non-empty.
5. Encodes store name and namespace.
6. Connects to DALI; throws if connection fails.
7. Constructs XPath to `Global/<encodedNS>/*` or `<encodedUser>/<encodedNS>/*`.
8. Throws `"invalid namespace '%s' detected!"` if the XPath matches no node.
9. Iterates matching children; decodes names via `decodePtreeName()`.
10. Sets `KeySet`, `Namespace`, and `StoreName` on response.

**Error Conditions**

| Condition | Server Behavior |
|-----------|-----------------|
| `StoreName` empty, no default | Exception: `"fetchKeySet(): Store name not provided"` |
| `UserSpecific=true`, no user | Exception: `"Attempting to fetch non-global keys but requester name not provided"` |
| `Namespace` empty/null | Exception: `"Namespace not provided!"` |
| Store not found in DALI | Exception: `"Unable to connect to DALI KeyValue store path '%s'"` |
| Namespace does not exist | Exception: `"invalid namespace '%s' detected!"` |
| DALI offline | Exception from DALI layer |

---

<details>
<summary><strong>Client Side Testing Plan</strong></summary>

**Existing coverage:** Basic global listing after seeding 3 keys (`a6listNSKeysTest`). No edge case or error handling tests.

**New test cases:**

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | User-specific (non-global) key listing — verify user keys present |
| CFT-002 | Core Functionality | Null `StoreName` — default store fallback |
| CFT-003 | Core Functionality | Empty string `StoreName` — default store fallback |
| CFT-004 | Core Functionality | Keys with special-character names in encoded store/namespace — verify decode round-trip |
| CFT-005 | Core Functionality | Global and user-specific scopes are isolated (no cross-contamination) |
| ECT-001 | Edge Case | Namespace with no keys (all deleted) — verify null/empty `KeySet` |
| ECT-002 | Edge Case | 50+ keys in namespace — verify all returned |
| ECT-003 | Edge Case | Keys with dot-notation names (e.g., `files.rowperpage.default`) |
| EHT-001 | Error Handling | Empty namespace string — verify server exception |
| EHT-002 | Error Handling | Null namespace — verify server exception (not NPE) |
| EHT-003 | Error Handling | Non-existent store name |
| EHT-004 | Error Handling | Non-existent namespace in valid store — verify "invalid namespace" exception |
| EHT-005 | Error Handling | Invalid/uninitialized connection |
| EHT-006 | Error Handling | User-specific listing on unauthenticated connection |

</details>

---

## 10. `setValueEncrypted`

### Summary

`setValueEncrypted` is a wrapper over `setValue` that performs client-side encryption of the plaintext value before storage. The server is entirely unaware of the encryption — it stores the Base64-encoded ciphertext as a regular string value. Two call patterns exist: one accepts a pre-constructed `Cipher` object; the other derives an AES-128/SHA-512 key from a raw string secret. All server-side behavior, error conditions, and authorization requirements are identical to `setValue`. Decryption must be performed client-side using `fetchValueEncrypted`.

### Server Behavior

Server-side request, response, processing, and error conditions are **identical to `setValue`**. See [§4 setValue](#4-setvalue) for the full server-side specification.

The only server-visible difference: the `Value` field contains Base64-encoded ciphertext rather than a plaintext string. The server validates and stores it the same way.

**Note on value size:** AES ciphertext with PKCS5 padding, Base64-encoded, is approximately 33% larger than the plaintext. A 700-character plaintext produces approximately 960 bytes of ciphertext — near the 1024-byte default `MaxValSize`. Care must be taken when storing large values in stores with a configured size limit.

---

<details>
<summary><strong>Client Side Testing Plan</strong></summary>

**Existing coverage:** Global set with default AES/SHA-512 cipher, secretKey string overload, user-specific set (conditional on auth), round-trip decrypt validation, custom SHA-1/AES cipher, encoded store/namespace names — all combinations tested in `a3setEncryptedTest`, `a3setEncryptedCustomTest`, `b4setEncryptedTest`, `b4setEncryptedCustomTest`.

**New test cases — encryption-specific:**

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | Overwrite encrypted key with a different cipher; verify key rotation: new ciphertext decryptable only with new cipher |
| CFT-002 | Core Functionality | Empty string plaintext (Cipher overload) — verify AES can encrypt zero-length input |
| CFT-003 | Core Functionality | Empty string plaintext (secretKey overload) |
| ECT-001 | Edge Case | Unicode value (emoji, CJK) — verify encrypt/decrypt round-trip preserves UTF-8 content |
| ECT-002 | Edge Case | Unicode value via secretKey overload |
| ECT-003 | Edge Case | Value with XML-special characters — verify no corruption through SOAP serialization |
| ECT-004 | Edge Case | 1-character secret key — verify SHA-512 key derivation handles minimal input |
| ECT-005 | Edge Case | ~700-char plaintext (resulting ~960-byte ciphertext near `MaxValSize=1024`) |
| ECT-006 | Edge Case | ~1000-char plaintext (ciphertext exceeds `MaxValSize`) — verify rejection |
| ECT-007 | Edge Case | SHA-256 digest algorithm via custom cipher (existing tests cover SHA-1 and SHA-512 only) |
| EHT-001 | Error Handling | Null cipher (Cipher overload) — verify exception propagated |
| EHT-002 | Error Handling | DECRYPT-mode cipher passed to encrypt operation — verify exception propagated |
| EHT-003 | Error Handling | Null secretKey (secretKey overload) — verify exception during key derivation |
| EHT-004 | Error Handling | Null plaintext value (Cipher overload) — verify exception propagated |
| EHT-005 | Error Handling | Null plaintext value (secretKey overload) |
| EHT-006 | Error Handling | Empty string secretKey — document behavior (weak key vs. exception) |
| EHT-007 | Error Handling | Null `StoreName` — verify default store fallback |
| EHT-008 | Error Handling | Non-existent store name — verify server rejects |
| EHT-009 | Error Handling | Invalid/unreachable connection |

</details>

---

## 11. `fetchValueEncrypted`

### Summary

`fetchValueEncrypted` is a wrapper over `fetchValue` that decrypts the retrieved ciphertext client-side before returning the plaintext to the caller. The server stores and returns the ciphertext as a regular string; decryption is performed entirely on the client using a provided `Cipher` object or a string secret key. If the key does not exist in the store (server returns null), the operation fails with an explicit exception rather than silently returning null. Server-side behavior and authorization requirements are identical to `fetchValue`.

### Server Behavior

Server-side request, response, processing, and error conditions are **identical to `fetchValue`**. See [§5 fetchValue](#5-fetchvalue) for the full server-side specification.

**A known bug exists in the secretKey-string overload:** The implementation passes `secretKey` (the raw key string) as the `key` argument to the underlying `fetchValue` call, instead of the intended `key` parameter. This causes the fetch to use the secret key string as the lookup key, always failing to find the intended entry.

---

<details>
<summary><strong>Client Side Testing Plan</strong></summary>

**Existing coverage:** Default AES/SHA-512 cipher (Cipher overload), custom SHA-1/AES cipher, encoded store/namespace names — basic round-trip in `a3setEncryptedTest`, `a3setEncryptedCustomTest`, `b4setEncryptedTest`, `b4setEncryptedCustomTest`. The secretKey-string overload is **never tested by a `@Test` method**.

**New test cases — decryption-specific:**

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | SecretKey-string overload — fetch and decrypt a value stored with the matching secretKey; **this also serves as a regression test for the known parameter-order bug** |
| CFT-002 | Core Functionality | User-specific encrypted value round-trip (Cipher overload, `UserSpecific=true`) |
| CFT-003 | Core Functionality | Verify decrypted value content exactly matches original plaintext for multiple value types (simple, special-chars, long) |
| ECT-001 | Edge Case | Value stored with secretKey overload, retrieved with equivalent Cipher — verify interoperability between both overloads |
| ECT-002 | Edge Case | Empty `StoreName` (default store fallback) |
| ECT-003 | Edge Case | Fetch and attempt to decrypt a value stored as plain (unencrypted) text — verify decryption exception is propagated, not silently swallowed |
| EHT-001 | Error Handling | Non-existent key — verify exception message `"Could not fetch value"` |
| EHT-002 | Error Handling | Wrong cipher (different key from encryption) — verify decryption fails or returns garbled result |
| EHT-003 | Error Handling | Null cipher (Cipher overload) — verify exception propagated |
| EHT-004 | Error Handling | Null or empty `key` parameter — verify exception |
| EHT-005 | Error Handling | Null `StoreName` — verify default store fallback |
| EHT-006 | Error Handling | Null `namespace` — verify exception |
| EHT-007 | Error Handling | Known bug regression — secretKey overload passes `secretKey` as the `key` argument; test expected to fail until bug is fixed |

</details>

---

## 12. `deleteValue`

### Summary

`deleteValue` permanently removes a single key-value entry from a named namespace within a store. It is the complement of `setValue` and provides targeted deletion of individual entries, as opposed to `deleteNamespace` which removes all entries within a namespace at once. The server throws an exception if the key does not exist — deletion is not idempotent. Requires `WsStoreAccess:FULL` authorization.

### Server Behavior

**Request Fields**

| Field | Required | Description | Notes |
|-------|----------|-------------|-------|
| `StoreName` | No | Target store name | Falls back to server default store if empty |
| `Namespace` | **Yes** | Namespace containing the key | Throws if empty: `"target namespace not provided!"` |
| `Key` | **Yes** | Key to delete | Throws if empty: `"target key not provided!"` |
| `UserSpecific` | No | `false` = global (default); `true` = per-user | Requires authenticated user when `true` |
| `TargetUser` | No | Delete on behalf of this user | Only meaningful when `UserSpecific=true` |

**Response Fields**

| Field | Type | Description |
|-------|------|-------------|
| `Success` | `bool` | `true` = key deleted successfully |

**Server Processing**

1. Retrieves `StoreName`; substitutes `m_defaultStore` if empty; throws if still empty.
2. Validates `Namespace` is non-empty; throws if absent.
3. Validates `Key` is non-empty; throws if absent.
4. If `UserSpecific=true` and no user: throws exception.
5. Acquires DALI write lock; throws if connection fails.
6. Builds XPath: `<DALI_KVSTORE_PATH>/Store[@name='<encodedStore>'][1]/<GLOBAL|username>/<namespace>/<key>`.
7. Checks key existence via `hasProp`; **throws if not found**.
8. Calls `removeProp(xpath)` to delete entry.
9. Commits DALI transaction; returns `true`.

**Error Conditions**

| Condition | Server Behavior |
|-----------|-----------------|
| `StoreName` empty, no default | Exception: `"deletekey(): Store name not provided"` |
| `Namespace` empty/null | Exception: `"target namespace not provided!"` |
| `Key` empty/null | Exception: `"target key not provided!"` |
| `UserSpecific=true`, no user | Exception: `"Attempting to set non-global entry but user not provided"` |
| Key does not exist | Exception: `"DALI KV Store deletekey(): Could not find '...'"` |
| DALI connection failure | Exception from `ensureAttachedToDali()` |
| Store not found in DALI | Exception (null connection) |

---

<details>
<summary><strong>Client Side Testing Plan</strong></summary>

**Existing coverage:** Basic global key deletion with fetch verification (`a5deleteValueTest`); user-specific deletion (conditional on auth).

**New test cases:**

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | Default store fallback — empty `StoreName` |
| CFT-002 | Core Functionality | Encoded/special-character store name deletion |
| ECT-001 | Edge Case | Key with special characters (dots, `@`, underscores) — verify `encodePTreeName` round-trip |
| ECT-002 | Edge Case | Long key name (255 chars) |
| ECT-003 | Edge Case | Double deletion — second call should throw "Could not find" exception |
| ECT-004 | Edge Case | User-specific deletion with encoded username |
| EHT-001 | Error Handling | Delete non-existent key — verify `"Could not find"` exception |
| EHT-002 | Error Handling | Empty namespace — verify server throws |
| EHT-003 | Error Handling | Empty key — verify server throws |
| EHT-004 | Error Handling | Null key — verify behavior |
| EHT-005 | Error Handling | Null namespace — verify behavior |
| EHT-006 | Error Handling | Non-existent store name |
| EHT-007 | Error Handling | Invalid/unreachable connection |
| EHT-008 | Error Handling | User-specific deletion on unauthenticated cluster |

</details>

---

## 13. `deleteNamespace`

### Summary

`deleteNamespace` removes an entire namespace and all key-value pairs within it from a named store in one call. It is a destructive bulk operation analogous to deleting a directory — all keys under the namespace are permanently removed. The operation is scoped by `UserSpecific`: setting `UserSpecific=false` deletes the global namespace, while `UserSpecific=true` deletes a per-user namespace (optionally on behalf of a named `TargetUser`). Requires `WsStoreAccess:FULL` authorization.

### Server Behavior

**Request Fields**

| Field | Required | Description | Notes |
|-------|----------|-------------|-------|
| `StoreName` | No | Target store name | Falls back to server default store if empty |
| `Namespace` | No (logically required) | Namespace to delete | Empty behavior is server-defined (likely no-op or error) |
| `UserSpecific` | No | `false` = delete global namespace (default); `true` = delete user-scoped namespace | — |
| `TargetUser` | No | Delete on behalf of this user (admin use) | Only consulted when `UserSpecific=true` and non-empty; triggers server-side impersonation logging |

**Response Fields**

| Field | Type | Description |
|-------|------|-------------|
| `Success` | `bool` | `true` = namespace deleted; `false` = namespace did not exist |

**Server Processing**

1. Extracts authenticated user from context; creates `CSecureUser` from caller's identity.
2. If `UserSpecific=true` and `TargetUser` is non-empty: logs impersonation; uses `TargetUser` as the user variable for the namespace lookup path. (**Note:** `secuser` object is always built from the calling user, not `TargetUser`.)
3. Reads `StoreName`; substitutes `m_defaultStore` if empty.
4. Calls `m_storeProvider->deleteNamespace(storename, req.getNamespace(), secuser, !UserSpecific)`.
5. Returns the boolean result from the store provider as `Success`.

**Error Conditions**

| Condition | Server Behavior |
|-----------|-----------------|
| `StoreName` empty, no default | Store provider receives null/empty — likely returns `false` |
| `Namespace` empty | Behavior is provider-defined; may return `false` |
| Namespace does not exist | Returns `Success=false` (no exception) |
| `WsStoreAccess:FULL` denied | ESP authorization rejection |
| Store provider internal failure | `Success=false`; may also produce ESP exception |

---

<details>
<summary><strong>Client Side Testing Plan</strong></summary>

**Existing coverage:** Global namespace deletion (standard names, `z91deleteNSTest`); global namespace deletion with encoded/special-character names (`zz91deleteEncodedNSTest`).

**New test cases:**

| ID | Category | Description |
|----|----------|-------------|
| CFT-001 | Core Functionality | User-specific namespace deletion (`UserSpecific=true`) — verify user namespace removed |
| CFT-002 | Core Functionality | Deletion on behalf of `TargetUser` — verify impersonation path |
| CFT-003 | Core Functionality | Delete namespace and verify all keys within it are inaccessible afterward |
| ECT-001 | Edge Case | Empty `StoreName` — verify default store fallback |
| ECT-002 | Edge Case | Non-existent namespace — verify `Success=false`, no exception (idempotency) |
| ECT-003 | Edge Case | Double deletion (same namespace twice) — second call returns `false`, no exception |
| ECT-004 | Edge Case | Namespace name with special characters (beyond existing encoded test) |
| ECT-005 | Edge Case | Long namespace name (255 chars) |
| EHT-001 | Error Handling | Null namespace — verify does not silently delete all namespaces |
| EHT-002 | Error Handling | Null `StoreName` — verify default store fallback |
| EHT-003 | Error Handling | Empty namespace string — verify no wildcard/"delete all" behavior |
| EHT-004 | Error Handling | Insufficient permissions — verify `WsStoreAccess:FULL` is required |
| EHT-005 | Error Handling | Non-existent store name |
| EHT-006 | Error Handling | Invalid/unreachable connection |

</details>

---

## Appendix: Service Dependency Summary

The following table summarizes which operations create state consumed by others. Test ordering must respect these dependencies.

| Creates State | Consumed By |
|---------------|-------------|
| `createStore` | All other operations (store must exist first) |
| `setValue` | `fetchValue`, `fetchAllNSKeys`, `fetchKeyMetaData`, `listNSKeys`, `listNamespaces`, `deleteValue`, `deleteNamespace` |
| `setValueEncrypted` | `fetchValueEncrypted`, `fetchValue` (returns ciphertext) |
| `deleteValue` | Cleanup only |
| `deleteNamespace` | Cleanup only |

**Authorization summary:**

| Permission | Operations |
|------------|------------|
| `WsStoreAccess:READ` | `fetchValue`, `fetchAllNSKeys`, `listNSKeys`, `listNamespaces`, `listStores`, `ping` |
| `WsStoreAccess:WRITE` | `setValue`, `setValueEncrypted` |
| `WsStoreAccess:FULL` | `createStore`, `deleteValue`, `deleteNamespace`, `fetchKeyMetaData` |

---

*Document generated from WsStore.AllMethodsAnalysis_2026-02-24.md*

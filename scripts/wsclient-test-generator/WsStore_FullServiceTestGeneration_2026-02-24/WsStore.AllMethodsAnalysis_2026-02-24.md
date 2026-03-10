# WsStore — All Methods Analysis

**Generated:** 2026-02-24  
**Service:** `wsstore` (ESP Service)  
**Combined from:** 14 individual method analysis documents

---

## Table of Contents

- [WsStore Service Analysis](#wsstore-service-analysis)
  - [A. Method Inventory Table](#a-method-inventory-table)
  - [B. Dependency Graph](#b-dependency-graph)
  - [C. Functional Groups](#c-functional-groups)
  - [D. Test Independence Guidelines](#d-test-independence-guidelines)
  - [E. Recommended Analysis Order](#e-recommended-analysis-order)
  - [F. Server-Side Reference Notes](#f-server-side-reference-notes)
- [WsStore `createStore` Method — Test Case Analysis](#wsstore-createstore-method-test-case-analysis)
  - [1. Method Summary](#1-method-summary)
  - [2. Existing Test Coverage Analysis](#2-existing-test-coverage-analysis)
  - [3. Request Structure](#3-request-structure)
  - [4. Server Behavior and Responses](#4-server-behavior-and-responses)
  - [5. Error Handling](#5-error-handling)
  - [6. Existing Dataset Analysis](#6-existing-dataset-analysis)
  - [7. Test Case Plan](#7-test-case-plan)
  - [8. New Dataset Specifications](#8-new-dataset-specifications)
  - [Appendix: Java Client API Gaps Identified](#appendix-java-client-api-gaps-identified)
- [WsStore `deleteNamespace` — Test Case Analysis](#wsstore-deletenamespace-test-case-analysis)
  - [1. Method Summary](#1-method-summary-1)
  - [2. Existing Test Coverage Analysis](#2-existing-test-coverage-analysis-1)
  - [3. Request Structure](#3-request-structure-1)
  - [4. Server Behavior and Responses](#4-server-behavior-and-responses-1)
  - [5. Error Handling](#5-error-handling-1)
  - [6. Existing Dataset Analysis](#6-existing-dataset-analysis-1)
  - [7. Test Case Plan](#7-test-case-plan-1)
  - [8. New Dataset Specifications](#8-new-dataset-specifications-1)
- [WsStore `deleteValue` Method — Test Case Analysis](#wsstore-deletevalue-method-test-case-analysis)
  - [1. Method Summary](#1-method-summary-2)
  - [2. Existing Test Coverage Analysis](#2-existing-test-coverage-analysis-2)
  - [3. Request Structure](#3-request-structure-2)
  - [4. Server Behavior and Responses](#4-server-behavior-and-responses-2)
  - [5. Error Handling](#5-error-handling-2)
  - [6. Existing Dataset Analysis](#6-existing-dataset-analysis-2)
  - [7. Test Case Plan](#7-test-case-plan-2)
  - [8. New Dataset Specifications](#8-new-dataset-specifications-2)
- [WsStore.fetchAllNSKeys — Test Case Analysis](#wsstorefetchallnskeys-test-case-analysis)
  - [1. Method Summary](#1-method-summary-3)
  - [2. Existing Test Coverage Analysis](#2-existing-test-coverage-analysis-3)
  - [3. Request Structure](#3-request-structure-3)
  - [4. Server Behavior and Responses](#4-server-behavior-and-responses-3)
  - [5. Error Handling](#5-error-handling-3)
  - [6. Existing Dataset Analysis](#6-existing-dataset-analysis-3)
  - [7. Test Case Plan](#7-test-case-plan-3)
  - [8. New Dataset Specifications](#8-new-dataset-specifications-3)
- [WsStore.fetchKeyMetaData — Test Case Analysis](#wsstorefetchkeymetadata-test-case-analysis)
  - [1. Method Summary](#1-method-summary-4)
  - [2. Existing Test Coverage Analysis](#2-existing-test-coverage-analysis-4)
  - [3. Request Structure](#3-request-structure-4)
  - [4. Server Behavior and Responses](#4-server-behavior-and-responses-4)
  - [5. Error Handling](#5-error-handling-4)
  - [6. Existing Dataset Analysis](#6-existing-dataset-analysis-4)
  - [7. Test Case Plan](#7-test-case-plan-4)
  - [8. New Dataset Specifications](#8-new-dataset-specifications-4)
- [WsStore `fetchValue` Method — Test Case Analysis](#wsstore-fetchvalue-method-test-case-analysis)
  - [1. Method Summary](#1-method-summary-5)
  - [2. Existing Test Coverage Analysis](#2-existing-test-coverage-analysis-5)
  - [3. Request Structure](#3-request-structure-5)
  - [4. Server Behavior and Responses](#4-server-behavior-and-responses-5)
  - [5. Error Handling](#5-error-handling-5)
  - [6. Existing Dataset Analysis](#6-existing-dataset-analysis-5)
  - [7. Test Case Plan](#7-test-case-plan-5)
  - [8. New Dataset Specifications](#8-new-dataset-specifications-5)
- [WsStore — `fetchValueEncrypted` Test Case Analysis](#wsstore-fetchvalueencrypted-test-case-analysis)
  - [1. Method Summary](#1-method-summary-6)
  - [2. Existing Test Coverage Analysis](#2-existing-test-coverage-analysis-6)
  - [3. Request Structure](#3-request-structure-6)
  - [4. Server Behavior and Responses](#4-server-behavior-and-responses-6)
  - [5. Error Handling](#5-error-handling-6)
  - [6. Existing Dataset Analysis](#6-existing-dataset-analysis-6)
  - [7. Test Case Plan](#7-test-case-plan-6)
  - [8. New Dataset Specifications](#8-new-dataset-specifications-6)
- [WsStore.listNSKeys — Test Case Analysis](#wsstorelistnskeys-test-case-analysis)
  - [1. Method Summary](#1-method-summary-7)
  - [2. Existing Test Coverage Analysis](#2-existing-test-coverage-analysis-7)
  - [3. Request Structure](#3-request-structure-7)
  - [4. Server Behavior and Responses](#4-server-behavior-and-responses-7)
  - [5. Error Handling](#5-error-handling-7)
  - [6. Existing Dataset Analysis](#6-existing-dataset-analysis-7)
  - [7. Test Case Plan](#7-test-case-plan-7)
  - [8. New Dataset Specifications](#8-new-dataset-specifications-7)
  - [Summary](#summary)
- [WsStore `listNamespaces` Method — Test Case Analysis](#wsstore-listnamespaces-method-test-case-analysis)
  - [1. Method Summary](#1-method-summary-8)
  - [2. Existing Test Coverage Analysis](#2-existing-test-coverage-analysis-8)
  - [3. Request Structure](#3-request-structure-8)
  - [4. Server Behavior and Responses](#4-server-behavior-and-responses-8)
  - [5. Error Handling](#5-error-handling-8)
  - [6. Existing Dataset Analysis](#6-existing-dataset-analysis-8)
  - [7. Test Case Plan](#7-test-case-plan-8)
  - [8. New Dataset Specifications](#8-new-dataset-specifications-8)
- [WsStore `listStores` Method — Test Case Analysis](#wsstore-liststores-method-test-case-analysis)
  - [1. Method Summary](#1-method-summary-9)
  - [2. Existing Test Coverage Analysis](#2-existing-test-coverage-analysis-9)
  - [3. Request Structure](#3-request-structure-9)
  - [4. Server Behavior and Responses](#4-server-behavior-and-responses-9)
  - [5. Error Handling](#5-error-handling-9)
  - [6. Existing Dataset Analysis](#6-existing-dataset-analysis-9)
  - [7. Test Case Plan](#7-test-case-plan-9)
  - [8. New Dataset Specifications](#8-new-dataset-specifications-9)
- [WsStore `ping` Method — Test Case Analysis](#wsstore-ping-method-test-case-analysis)
  - [1. Method Summary](#1-method-summary-10)
  - [2. Existing Test Coverage Analysis](#2-existing-test-coverage-analysis-10)
  - [3. Request Structure](#3-request-structure-10)
  - [4. Server Behavior and Responses](#4-server-behavior-and-responses-10)
  - [5. Error Handling](#5-error-handling-10)
  - [6. Existing Dataset Analysis](#6-existing-dataset-analysis-10)
  - [7. Test Case Plan](#7-test-case-plan-10)
  - [8. New Dataset Specifications](#8-new-dataset-specifications-10)
- [WsStore `setValue` Method — Test Case Analysis](#wsstore-setvalue-method-test-case-analysis)
  - [1. Method Summary](#1-method-summary-11)
  - [2. Existing Test Coverage Analysis](#2-existing-test-coverage-analysis-11)
  - [3. Request Structure](#3-request-structure-11)
  - [4. Server Behavior and Responses](#4-server-behavior-and-responses-11)
  - [5. Error Handling](#5-error-handling-11)
  - [6. Existing Dataset Analysis](#6-existing-dataset-analysis-11)
  - [7. Test Case Plan](#7-test-case-plan-11)
  - [8. New Dataset Specifications](#8-new-dataset-specifications-11)
  - [Appendix: Test Execution Order Notes](#appendix-test-execution-order-notes)
- [WsStore `setValueEncrypted` Method — Test Case Analysis](#wsstore-setvalueencrypted-method-test-case-analysis)
  - [1. Method Summary](#1-method-summary-12)
  - [2. Existing Test Coverage Analysis](#2-existing-test-coverage-analysis-12)
  - [3. Request Structure](#3-request-structure-12)
  - [4. Server Behavior and Responses](#4-server-behavior-and-responses-12)
  - [5. Error Handling](#5-error-handling-12)
  - [6. Existing Dataset Analysis](#6-existing-dataset-analysis-12)
  - [7. Test Case Plan](#7-test-case-plan-12)
  - [8. New Dataset Specifications](#8-new-dataset-specifications-12)

---

# WsStore Service Analysis
**Client Class:** `HPCCWsStoreClient`  
**Service:** `WsStore` (HPCC Systems key/value store)  
**Analysis Date:** 2026-02-24  
**IDL Source:** `esp/scm/ws_store.ecm` (service version 1.02)

---

## A. Method Inventory Table

| # | Method Name | Signature | Group | Calls Other Methods | Server State Effect | Prerequisites |
|---|-------------|-----------|-------|---------------------|---------------------|---------------|
| 1 | `ping` | `public boolean ping() throws Exception` | Health/Connectivity | — | None | None |
| 2 | `createStore` | `public boolean createStore(String storename, String description, String type) throws Exception, ArrayOfEspExceptionWrapper` | Store Management | — | Create | None |
| 3 | `listStores` | `public StoreInfoWrapper[] listStores() throws Exception, ArrayOfEspExceptionWrapper` | Store Management | `listStores(nameFilter, typeFilter, ownerFilter)` | Read | None (returns empty list if no stores) |
| 4 | `listStores` *(filtered)* | `public StoreInfoWrapper[] listStores(String nameFilter, String typeFilter, String ownerFilter) throws Exception, ArrayOfEspExceptionWrapper` | Store Management | — | Read | None |
| 5 | `setValue` | `public boolean setValue(String storename, String namespace, String key, String value, boolean global) throws Exception, ArrayOfEspExceptionWrapper` | Key-Value CRUD | — | Create/Update | Store must exist (or is auto-created by service) |
| 6 | `fetchValue` | `public String fetchValue(String storename, String namespace, String key, boolean global) throws Exception, ArrayOfEspExceptionWrapper` | Key-Value CRUD | — | Read | Prior `setValue` for the same store/namespace/key |
| 7 | `fetchAllNSKeys` | `public Properties fetchAllNSKeys(String storename, String namespace, boolean global) throws Exception, ArrayOfEspExceptionWrapper` | Key-Value CRUD | — | Read | Prior `setValue` for the given store/namespace |
| 8 | `fetchKeyMetaData` | `public Properties fetchKeyMetaData(String storename, String namespace, String key, boolean global) throws Exception, ArrayOfEspExceptionWrapper` | Key-Value CRUD | — | Read | Prior `setValue` for the given key |
| 9 | `listNamespaces` | `public String[] listNamespaces(String storename, boolean global) throws Exception, ArrayOfEspExceptionWrapper` | Namespace Management | — | Read | Store must exist; namespace populated by prior `setValue` |
| 10 | `listNSKeys` | `public String[] listNSKeys(String storename, String namespace, boolean global) throws Exception, ArrayOfEspExceptionWrapper` | Namespace Management | — | Read | Prior `setValue` for the given store/namespace |
| 11 | `setValueEncrypted` | `public boolean setValueEncrypted(String storename, String namespace, String key, String value, boolean global, Cipher cipher) throws Exception, ArrayOfEspExceptionWrapper` | Encrypted Operations | `setValue` | Create/Update | Store must exist |
| 12 | `setValueEncrypted` *(secretKey)* | `public boolean setValueEncrypted(String storename, String namespace, String key, String value, boolean global, String secretKey) throws Exception, ArrayOfEspExceptionWrapper` | Encrypted Operations | `setValue` | Create/Update | Store must exist |
| 13 | `fetchValueEncrypted` | `public String fetchValueEncrypted(String storename, String namespace, String key, boolean global, Cipher cipher) throws Exception, ArrayOfEspExceptionWrapper` | Encrypted Operations | `fetchValue` | Read | Prior `setValueEncrypted` for the same key |
| 14 | `fetchValueEncrypted` *(secretKey)* | `public String fetchValueEncrypted(String storename, String namespace, String key, boolean global, String secretKey) throws Exception, ArrayOfEspExceptionWrapper` | Encrypted Operations | `fetchValueEncrypted(Cipher)` → `fetchValue` | Read | Prior `setValueEncrypted` for the same key |
| 15 | `deleteValue` | `public boolean deleteValue(String storename, String namespace, String key, boolean global) throws Exception, ArrayOfEspExceptionWrapper` | Key-Value CRUD | — | Delete | Prior `setValue` for the key to be deleted |
| 16 | `deleteNamespace` | `public boolean deleteNamespace(String storename, String namespace, boolean global, String targetuser) throws Exception, ArrayOfEspExceptionWrapper` | Namespace Management | — | Delete | Namespace populated by prior `setValue` |

> **Note on overloads:**  
> - `listStores()` is a convenience overload of `listStores(nameFilter, typeFilter, ownerFilter)` — both share one JSON entry using the base name.  
> - `setValueEncrypted` has two overloads: one accepting a `Cipher`, one accepting a `String` secret key. The `String secretKey` overload delegates to `setValue` via `CryptoHelper.encryptSHA512AES`.  
> - `fetchValueEncrypted` has two overloads: one accepting a `Cipher` (delegates to `fetchValue`), one accepting a `String` secret key (delegates to the `Cipher` overload, which in turn calls `fetchValue`).

---

## B. Dependency Graph

```
ping                      (no dependencies)
createStore               (no dependencies)
listStores                (no data dependency; no-arg overload delegates to filtered overload)
setValue                  (no data dependency; creates state for all Read/Delete methods)
  ├─► fetchValue          (data: requires setValue)
  │     └─► fetchValueEncrypted(Cipher)     (internal call: wraps fetchValue)
  │           └─► fetchValueEncrypted(secretKey)  (internal call: wraps Cipher overload)
  ├─► fetchAllNSKeys      (data: requires setValue)
  ├─► fetchKeyMetaData    (data: requires setValue)
  ├─► listNamespaces      (data: namespace created by setValue)
  ├─► listNSKeys          (data: keys created by setValue)
  └─► deleteValue         (data: requires setValue to have created a key to delete)

setValueEncrypted(Cipher)       (internal: calls setValue; creates encrypted state)
setValueEncrypted(secretKey)    (internal: calls setValue; creates encrypted state)
  └─► fetchValueEncrypted       (data: requires prior setValueEncrypted)

deleteNamespace           (data: requires namespace created by setValue)
```

### Internal Call Dependencies (delegation chains)
| Caller | Callee | Nature |
|--------|--------|--------|
| `listStores()` | `listStores(nameFilter, typeFilter, ownerFilter)` | Overload delegation |
| `setValueEncrypted(Cipher)` | `setValue` | Encrypts value before calling `setValue` |
| `setValueEncrypted(secretKey)` | `setValue` | Encrypts via `CryptoHelper.encryptSHA512AES` then calls `setValue` |
| `fetchValueEncrypted(Cipher)` | `fetchValue` | Fetches raw value then decrypts |
| `fetchValueEncrypted(secretKey)` | `fetchValueEncrypted(Cipher)` | Creates Cipher then delegates |

---

## C. Functional Groups

### 1. Health/Connectivity
- `ping` — Verifies ESP service is reachable

### 2. Store Management
- `createStore` — Creates a named key/value store
- `listStores` (both overloads) — Lists stores, optionally filtered by name, type, or owner

### 3. Key-Value CRUD
- `setValue` — Creates or updates a key/value pair in a namespace
- `fetchValue` — Reads a value by store/namespace/key
- `fetchAllNSKeys` — Reads all key/value pairs within a namespace (as `Properties`)
- `fetchKeyMetaData` — Reads metadata properties of a specific key
- `deleteValue` — Deletes a specific key/value pair

### 4. Encrypted Operations
- `setValueEncrypted` (Cipher overload) — Encrypts value with a `Cipher` then calls `setValue`
- `setValueEncrypted` (secretKey overload) — Encrypts via SHA-512/AES then calls `setValue`
- `fetchValueEncrypted` (Cipher overload) — Calls `fetchValue` then decrypts with `Cipher`
- `fetchValueEncrypted` (secretKey overload) — Delegates to Cipher overload of `fetchValueEncrypted`

### 5. Namespace Management
- `listNamespaces` — Lists all namespaces in a store
- `listNSKeys` — Lists keys within a specific namespace
- `deleteNamespace` — Deletes an entire namespace and all its keys

---

## D. Test Independence Guidelines

### Store/Namespace Naming
- Every test must use a **uniquely-named store and namespace** to avoid collisions:
  ```java
  String storeName   = "testStore_"   + methodName + "_" + UUID.randomUUID().toString().substring(0, 8);
  String namespace   = "testNS_"      + methodName + "_" + UUID.randomUUID().toString().substring(0, 8);
  String key         = "testKey_"     + methodName;
  ```
- Do **not** share a store or namespace across test methods — each test is responsible for its own data.

### Setup & Teardown Pattern
- Each test that needs a pre-existing key/namespace/store must call the prerequisite method **within the test body** (not in `@Before`/`@BeforeClass` shared state).
- Use a `finally` block (or `@After` with test-local variables) to clean up:
  ```java
  try {
      client.createStore(storeName, "desc", "default");
      client.setValue(storeName, namespace, key, "value", true);
      // exercise the method under test
  } finally {
      client.deleteNamespace(storeName, namespace, true, null);
  }
  ```

### Ordering Independence
- Tests must **not** rely on `@FixMethodOrder` for correctness.
- Every test must be independently runnable in isolation.

### Shared Helper Methods (recommended)
Extract the following into the test class for reuse:
```java
private boolean createTestStore(String storeName) throws Exception { ... }
private boolean setTestValue(String storeName, String ns, String key, String val) throws Exception { ... }
private void cleanupNamespace(String storeName, String ns) { ... }
```

### Encrypted Value Tests
- Use `CryptoHelper.createDefaultCipher(secretKey, true)` for the encrypt cipher and `CryptoHelper.createDefaultCipher(secretKey, false)` for the decrypt cipher.
- Test both overloads (`Cipher` and `String secretKey`) independently.
- The secret key used to encrypt must match the one used to decrypt.

### Global vs User-Specific
- Tests should cover both `global=true` and `global=false` cases where applicable.
- When `global=false`, values are scoped to the authenticated user running the test.

---

## E. Recommended Analysis Order

Methods are ordered from least to most dependent, so when a method is analyzed its dependencies are already understood:

| Order | Method | Reason |
|-------|--------|--------|
| 1 | `ping` | No dependencies; simplest connectivity check |
| 2 | `createStore` | Foundation — must be understood before any store-scoped operations |
| 3 | `listStores` (filtered overload) | Pure read; confirms `createStore` results; no prior state needed |
| 4 | `listStores` (no-arg overload) | Thin wrapper around filtered overload; trivial once filtered is analyzed |
| 5 | `setValue` | Creates state consumed by all CRUD, list, and fetch methods |
| 6 | `listNamespaces` | Reads namespaces created by `setValue` |
| 7 | `listNSKeys` | Reads keys created by `setValue` within a namespace |
| 8 | `fetchValue` | Core read operation; prerequisite for `fetchValueEncrypted` |
| 9 | `fetchAllNSKeys` | Bulk read of all KV pairs; depends on `setValue` |
| 10 | `fetchKeyMetaData` | Key metadata read; depends on `setValue` |
| 11 | `setValueEncrypted` | Wraps `setValue`; must understand `setValue` first |
| 12 | `fetchValueEncrypted` | Wraps `fetchValue`; must understand `fetchValue` and `setValueEncrypted` |
| 13 | `deleteValue` | Deletes state created by `setValue`; understand create before delete |
| 14 | `deleteNamespace` | Deletes an entire namespace; broadest destructive operation |

---

## F. Server-Side Reference Notes

### IDL (ws_store.ecm) Key Points
- **Service version:** 1.02 (latest)
- `CreateStore` added `MaxValueSize` field in 1.02 (default 1024 bytes)
- `CreateStore` had a `UserSpecific` field deprecated in 1.01 — **do not set it** in the Java client
- `DeleteNamespace` accepts an optional `TargetUser` — allows admins to delete another user's namespace
- `DeleteRequest` also accepts `TargetUser` (not exposed in the current Java wrapper)
- Auth features: `WsStoreAccess:READ` for reads, `WsStoreAccess:WRITE` for `Set`, `WsStoreAccess:FULL` for `CreateStore`, `Delete`, `DeleteNamespace`, `FetchKeyMetadata`

### Key Behavioral Notes
- When `UserSpecific=false` (i.e., `global=true` in Java), the value is stored globally; when `true`, it is scoped to the authenticated user
- `FetchResponse.Value` uses `nil_remove`, meaning an absent key returns null (not an exception)
- `FetchAll` returns all KV pairs in a namespace, not just keys — returned as `Properties`
- `CreateStore` is idempotent — calling it with the same name a second time returns success but does not reset the store


---
*Generated: 2026-02-24*

---

# WsStore `createStore` Method — Test Case Analysis

**Generated:** 2026-02-24  
**Service:** WsStore (`/wsstore`)  
**Method:** `createStore`  
**Java Client:** `HPCCWsStoreClient.createStore(String storename, String description, String type)`  
**Test File:** `WSStoreClientTest.java`

---

## 1. Method Summary

### Purpose
`createStore` creates a named key-value store in the HPCC Systems Dali-backed KV store service. Each store acts as a top-level container for namespaces and key-value pairs.

### Role within the Service
The `createStore` operation is a prerequisite for nearly all other WsStore operations. Before a namespace or key-value entry can be stored or retrieved, a named store must exist. This method is typically called once during setup or first-use of a logical storage partition.

### Inputs
| Parameter    | Java Type | Description                                    |
|--------------|-----------|------------------------------------------------|
| `storename`  | `String`  | Unique name for the new store (required)        |
| `description`| `String`  | Human-readable description (optional)           |
| `type`       | `String`  | Logical type label for the store (optional)     |

> **Note:** The Java `HPCCWsStoreClient.createStore()` method does **not** expose the `MaxValueSize` request field (available in WSDL v1.02, default 1024 bytes). The server always uses the default (1024) when called through this Java client.

### Outputs
- Returns `boolean`: `true` if the store was successfully created, `false` if the store already exists or if the operation fails without throwing.
- On server-side validation failure (e.g., empty store name), the server throws a `MakeStringException` which surfaces as an `EspSoapFault` or `Exception` on the Java client.
- On ESP exception responses, the client throws `ArrayOfEspExceptionWrapper`.

### Side Effects
- Creates a persistent entry in the Dali KV store at path `/KVStore/Store[@name='<encodedStoreName>']`.
- Records creation time, owner (authenticated user), type, description, and max value size.
- Operation is idempotent from a safety perspective: if the store already exists, no error is thrown by the ESP layer — instead `Success=false` is returned.
- Requires `WsStoreAccess:FULL` authorization.

---

## 2. Existing Test Coverage Analysis

### Existing Test Methods for `createStore`

| Existing Test Method Name          | Test Category     | Scenario Covered                                      | Input Data Summary                                                                   | Pass Criteria                                                             | Notes                                                    |
|------------------------------------|-------------------|-------------------------------------------------------|---------------------------------------------------------------------------------------|---------------------------------------------------------------------------|----------------------------------------------------------|
| `a1createStoreTest()`              | Core Functionality | Standard store creation with name, description, type  | `storename="WsClientTestStore"`, `description="Store strictly for WsClient tests"`, `type="TEST"` | No exception thrown; success or silent false if store exists              | Uses default test user credentials; store may already exist from prior run |
| `b1createEncodedStoreTest()`       | Core Functionality | Store creation with encoded (special character) store name and encoded username | `storename="WsCli@ntT_estStore"`, `description="Store strictly for WsClient tests"`, `type="TEST"` | No exception thrown; Assume encodedUserClient is not null                 | Uses user `Juni@tUser`; validates URL-encoded username support           |

### Coverage Summary

- **Total existing test methods for `createStore`:** 2
- **Core Functionality Tests covered:** 2
  - Basic store creation with name, description, and type using standard credentials
  - Store creation using a connection with special characters in the username and special characters in the store name
- **Edge Case Tests covered:** 0
- **Error Handling Tests covered:** 0

### Gaps Identified

The following scenarios are **NOT covered** by existing tests:

1. Creating a store with an **empty/null store name** — server throws an exception
2. Creating a store that **already exists** — server returns `success=false`
3. Creating a store with **empty string for description** — optional field, verify no error
4. Creating a store with **empty string for type** — optional field, verify no error
5. Creating a store with **null description and null type** — all optional fields null
6. Creating a store with a **very long store name** (boundary value)
7. Creating a store with a **very long description** (boundary value)
8. Creating a store with **special characters in the store name** (beyond `@` — e.g., spaces, slashes, dots, Unicode)
9. Creating a store and **verifying it appears in `listStores()`** (end-to-end verification)
10. Creating a store and **verifying the response fields** (name, type, description, owner) match the request
11. Attempting to create a store with **insufficient privileges** (read-only user)
12. Attempting to create a store with **invalid/null connection** (client-side error)
13. Creating **multiple distinct stores** in sequence (workflow test)

---

## 3. Request Structure

### CreateStoreRequest Fields

| Field Name     | Type    | Required | Description                                         | Valid Range / Format                              | Notes                                                                              |
|----------------|---------|----------|-----------------------------------------------------|---------------------------------------------------|------------------------------------------------------------------------------------|
| `Name`         | string  | **Yes**  | Unique identifier for the new store                 | Non-empty string; encoded via `encodePTreeName`   | If empty, server throws exception: "DALI Keystore createStore(): Store name not provided" |
| `Type`         | string  | No       | Logical type label (user-defined)                   | Any string; only stored if non-empty              | Optional; if omitted, store has no type attribute in Dali                           |
| `Description`  | string  | No       | Human-readable description of the store             | Any string; only stored if non-empty              | Optional; stored in Dali as `@description` attribute                               |
| `MaxValueSize` | int     | No       | Maximum byte size for individual values in the store | Integer ≥ 0; default is 1024 (WSDL v1.02+)       | **Not exposed** in the current Java `HPCCWsStoreClient.createStore()` signature; always defaults to 1024 |
| `UserSpecific` | bool    | No       | **Deprecated** as of WSDL v1.01                     | Boolean; default false                            | Deprecated; ignored by server in current versions                                  |

### Field Dependencies
- `Name` is the only required field.
- `MaxValueSize` is only sent when the client version is ≥ 1.02.
- `UserSpecific` was deprecated in WSDL 1.01 and should not be used.

### Default Behavior for Optional Fields
- If `Type` is omitted or empty, no type attribute is stored in Dali for the store.
- If `Description` is omitted or empty, no description attribute is stored in Dali.
- If `MaxValueSize` is 0, no max value size attribute is stored in Dali (stores unlimited by default in that case).

---

## 4. Server Behavior and Responses

### Server-Side Processing (`onCreateStore` in `ws_storeService.cpp`)

1. **Extract user context**: Gets the authenticated user ID from the ESP context.
2. **Read MaxValueSize**: If client version ≥ 1.02, reads `MaxValueSize` from request; otherwise defaults to `DEFAULT_ESP_STORE_MAX_VAL_SIZE` (1024).
3. **Delegate to store provider**: Calls `m_storeProvider->createStore(type, name, description, secuser, maxvalsize)`.
4. **Dali implementation** (`CDALIKVStore::createStore`):
   - Validates `storename` is not empty; throws `MakeStringException(-1, ...)` if empty.
   - Calls `encodePTreeName()` to encode the store name for safe use as a Dali XML attribute.
   - Ensures Dali connection; throws if offline or unable to connect to `/KVStore`.
   - Checks if store already exists (read lock): if yes, returns `false`.
   - Re-establishes connection with write lock.
   - Checks again if store was created during lock wait: if yes, returns `false`.
   - Creates a new `IPropertyTree` node with name, creation time, type, description, owner, and maxvalsize.
   - Commits to Dali; returns `true`.
5. **Set response**: Sets `Name`, `Type`, `Description`, `Owner` from the request/context values.
6. **Set Success** (v1.01+): Sets `Success` to the boolean returned by `createStore`.

### Valid Response Types

| Scenario                     | `Success` | `Name`        | `Type`       | `Description`         | `Owner`         | Exceptions |
|------------------------------|-----------|---------------|--------------|-----------------------|-----------------|------------|
| Store created successfully   | `true`    | Echoed back   | Echoed back  | Echoed back           | Authenticated user | None    |
| Store already exists         | `false`   | Echoed back   | Echoed back  | Echoed back           | Authenticated user | None    |

### Invalid/Error Responses

| Scenario                     | Behavior                                                                        |
|------------------------------|---------------------------------------------------------------------------------|
| Empty store name             | Server throws `MakeStringException(-1, "DALI Keystore createStore(): Store name not provided")` → surfaces as `EspSoapFault` or `Exception` |
| Dali offline/unavailable     | `ensureAttachedToDali()` throws an exception                                    |
| Unable to connect to Dali    | `MakeStringException(-1, "Unable to connect to DALI KeyValue store root: '/KVStore'")` |
| ESP exception in response    | Java client calls `handleEspExceptions()` which throws `ArrayOfEspExceptionWrapper` |
| Insufficient authorization   | ESP returns HTTP 401 or ESP exception with authorization error                  |

---

## 5. Error Handling

### Server-Side Errors

| Error Condition                        | Server Behavior                                                     | Client Behavior                                                          |
|----------------------------------------|---------------------------------------------------------------------|--------------------------------------------------------------------------|
| Empty store name                       | `MakeStringException(-1, ...)` thrown in Dali layer                 | Caught as `EspSoapFault`; `createStore` catches and prints stack trace; returns `false` |
| Store already exists                   | Returns `false` (no exception)                                       | `createStore` returns `false`; no exception thrown                        |
| Dali unavailable (offline mode)        | `ensureAttachedToDali()` throws                                     | Surfaces as `EspSoapFault` or `RemoteException`; `createStore` returns `false` |
| Dali connection timeout (SDS lock)     | `SDS_LOCK_TIMEOUT_KVSTORE` (30 seconds); exception if fails         | `EspSoapFault`/`RemoteException`; `createStore` returns `false`           |
| Insufficient authorization (`WsStoreAccess:FULL` required) | ESP returns authorization error response  | `handleEspExceptions()` throws `ArrayOfEspExceptionWrapper`               |
| ESP exceptions in response             | ESP returns `Exceptions` array in response                           | `handleEspExceptions()` throws `ArrayOfEspExceptionWrapper`               |

### Client-Side Errors

| Error Condition                        | Client Behavior                                                     |
|----------------------------------------|---------------------------------------------------------------------|
| Null/invalid `stub` (bad connection)   | `verifyStub()` throws `Exception` before the request is made        |
| `RemoteException` from Axis2           | Caught in `catch (RemoteException e)` block; stack trace printed; returns `false` |
| `EspSoapFault` from Axis2              | Caught in `catch (EspSoapFault e)` block; stack trace printed; returns `false` |
| Malformed connection URL               | Exception during `HPCCWsStoreClient` construction; `initErrMessage` set |
| Network timeout / unreachable host     | Axis2 throws `AxisFault`; caught as `RemoteException`; returns `false` |

> **Note:** The current `createStore` implementation does not call `verifyStub()` — unlike `ping()`. This means if the stub was never initialized (e.g., due to bad connection during construction), the method will throw a `NullPointerException` rather than a clean error message.

---

## 6. Existing Dataset Analysis

The `createStore` method operates on the WsStore key-value system and does **not** interact with HPCC logical file datasets or the DFS (Distributed File System). It does not read, write, or reference any file-based datasets.

| Dataset Name                       | Applicable? | Reason                                                              |
|------------------------------------|-------------|---------------------------------------------------------------------|
| `~benchmark::all_types::200KB`     | No          | `createStore` does not use file datasets; it only creates a KV store container |
| `~benchmark::string::100MB`        | No          | Same reason — no file I/O involved                                  |
| `~benchmark::integer::20KB`        | No          | Same reason — no file I/O involved                                  |
| `~benchmark::all_types::superfile` | No          | Same reason — no file I/O involved                                  |
| `~benchmark::integer::20kb::key`   | No          | Same reason — no file I/O involved                                  |

No existing datasets are relevant to `createStore` testing. All test inputs are string values for store name, description, and type.

---

## 7. Test Case Plan

> **Only test cases not covered by existing tests are defined below.**  
> `a1createStoreTest()` covers: basic store creation with name/description/type.  
> `b1createEncodedStoreTest()` covers: store creation with special characters in store name.

---

### A. Core Functionality Tests

---

#### CFT-001 — Verify Response Fields Match Request

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | CFT-001 |
| **Category**    | Core Functionality |
| **Subcategory** | Complete Request / Response Validation |
| **Description** | Create a store and verify that the response fields (name, type, description, owner) are correctly populated and match the input values |
| **Input Data**  | `storename`: `"CFT001TestStore"`, `description`: `"CFT-001 response field verification store"`, `type`: `"CFT001TYPE"` |
| **Dataset**     | N/A |
| **Expected Output** | `createStore()` returns `true`; subsequent `listStores()` returns entry where `name == "CFT001TestStore"`, `type == "CFT001TYPE"`, `description == "CFT-001 response field verification store"`, `owner` is non-null/non-empty |
| **Pass Criteria** | - `createStore()` returns `true` <br>- `listStores()` includes a `StoreInfoWrapper` matching the provided name <br>- `StoreInfoWrapper.getType()` equals `"CFT001TYPE"` <br>- `StoreInfoWrapper.getOwner()` is non-null and matches the authenticated user |
| **Notes**       | This test verifies end-to-end field propagation. Must clean up store (or use dedicated test store name) to avoid state pollution. Currently the Java `createStore()` API does not expose `MaxValueSize`; default (1024) is expected. |

---

#### CFT-002 — Create Store with Only Required Field (Name Only)

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | CFT-002 |
| **Category**    | Core Functionality |
| **Subcategory** | Basic Operation / Minimal Required Parameters |
| **Description** | Create a store providing only the required `name` parameter, with empty strings for `description` and `type` |
| **Input Data**  | `storename`: `"CFT002MinimalStore"`, `description`: `""`, `type`: `""` |
| **Dataset**     | N/A |
| **Expected Output** | `createStore()` returns `true`; store appears in `listStores()` result |
| **Pass Criteria** | - `createStore()` returns `true` or `false` (if store already exists) without throwing an exception <br>- No exception thrown <br>- `listStores()` includes a store with `name == "CFT002MinimalStore"` |
| **Notes**       | Tests that optional fields being empty strings is acceptable to both the Java client and the server. |

---

#### CFT-003 — Create Store and Verify It Appears in listStores

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | CFT-003 |
| **Category**    | Core Functionality |
| **Subcategory** | Typical Workflow / End-to-End Verification |
| **Description** | Create a uniquely-named store and confirm it is subsequently returned by `listStores()` |
| **Input Data**  | `storename`: `"CFT003WorkflowStore"`, `description`: `"Workflow test store"`, `type`: `"WORKFLOW"` |
| **Dataset**     | N/A |
| **Expected Output** | `createStore()` returns `true`; `listStores()` result contains entry with `name == "CFT003WorkflowStore"` |
| **Pass Criteria** | - `createStore()` returns `true` <br>- `listStores()` is not null <br>- At least one `StoreInfoWrapper` in the result has `getName()` equal to `"CFT003WorkflowStore"` |
| **Notes**       | This is the canonical workflow test. Uses `listStores()` as the verification mechanism. |

---

#### CFT-004 — Create Multiple Distinct Stores in Sequence

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | CFT-004 |
| **Category**    | Core Functionality |
| **Subcategory** | Typical Workflow / Multiple Operations |
| **Description** | Create two stores with different names in sequence and verify both exist |
| **Input Data**  | Store 1: `storename="CFT004StoreA"`, `description="First store"`, `type="TYPEA"` <br> Store 2: `storename="CFT004StoreB"`, `description="Second store"`, `type="TYPEB"` |
| **Dataset**     | N/A |
| **Expected Output** | Both `createStore()` calls return `true`; `listStores()` contains both entries |
| **Pass Criteria** | - Both calls to `createStore()` return `true` (or `false` if pre-existing without exception) <br>- `listStores()` contains entries for both store names <br>- No exceptions thrown |
| **Notes**       | Verifies that independent store creation does not interfere with one another. |

---

### B. Edge Case Tests

---

#### ECT-001 — Create Store That Already Exists (Idempotency)

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | ECT-001 |
| **Category**    | Edge Case |
| **Subcategory** | Unusual Valid Input / Duplicate Creation |
| **Description** | Attempt to create a store with a name that already exists; verify that the method returns `false` without throwing an exception |
| **Input Data**  | `storename`: `"WsClientTestStore"` (the default store used by `a1createStoreTest`), `description`: `"duplicate"`, `type`: `"TEST"` |
| **Dataset**     | N/A |
| **Expected Output** | `createStore()` returns `false`; no exception thrown |
| **Pass Criteria** | - `createStore()` returns `false` <br>- No exception is thrown <br>- `listStores()` still contains only one entry for `"WsClientTestStore"` |
| **Notes**       | Must be executed after `a1createStoreTest()` to ensure the store exists. The test name prefix `ect001` ensures alphabetical ordering places it after `a1createStoreTest`. |

---

#### ECT-002 — Create Store with Null Description and Null Type

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | ECT-002 |
| **Category**    | Edge Case |
| **Subcategory** | Optional Parameters / Null Values |
| **Description** | Create a store with `null` passed for both description and type to verify null handling in the Java client and no server error |
| **Input Data**  | `storename`: `"ECT002NullOptionalStore"`, `description`: `null`, `type`: `null` |
| **Dataset**     | N/A |
| **Expected Output** | `createStore()` returns `true`; no NullPointerException thrown; store appears in `listStores()` |
| **Pass Criteria** | - `createStore()` does not throw `NullPointerException` <br>- Returns `true` or `false` without exception <br>- `listStores()` contains an entry for `"ECT002NullOptionalStore"` |
| **Notes**       | The server implementation checks `if (description && *description)` which is safe with a null C++ string. The Java client passes `null` directly to `request.setDescription(null)`. Verify Axis2 serialization handles null gracefully. |

---

#### ECT-003 — Create Store with Very Long Store Name (Boundary Value)

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | ECT-003 |
| **Category**    | Edge Case |
| **Subcategory** | Boundary Values / Maximum Length |
| **Description** | Create a store with a very long name (255 characters) to test boundary behavior |
| **Input Data**  | `storename`: 255-character string of alphanumeric characters (e.g., `"A".repeat(255)`), `description`: `"Long name test"`, `type`: `"BOUNDARY"` |
| **Dataset**     | N/A |
| **Expected Output** | Either `createStore()` returns `true` (if long names are accepted) or a specific exception is thrown with a descriptive error |
| **Pass Criteria** | - If accepted: returns `true` without exception <br>- If rejected: throws a meaningful exception (not a generic NPE) or returns `false` with no exception |
| **Notes**       | The server uses `encodePTreeName()` which encodes the name; very long encoded names may cause Dali path issues. Observe behavior and document. |

---

#### ECT-004 — Create Store with Very Long Description (Boundary Value)

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | ECT-004 |
| **Category**    | Edge Case |
| **Subcategory** | Boundary Values / Maximum Length |
| **Description** | Create a store with a very long description (1000+ characters) to test if the description field has any size limitations |
| **Input Data**  | `storename`: `"ECT004LongDescStore"`, `description`: 1000-character string, `type`: `"BOUNDARY"` |
| **Dataset**     | N/A |
| **Expected Output** | `createStore()` returns `true`; store is created successfully |
| **Pass Criteria** | - `createStore()` returns `true` without exception <br>- `listStores()` contains entry with `getName() == "ECT004LongDescStore"` |
| **Notes**       | There is no documented length limit on description in the IDL or server implementation. This test validates actual runtime behavior. |

---

#### ECT-005 — Create Store with Special Characters in Store Name

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | ECT-005 |
| **Category**    | Edge Case |
| **Subcategory** | Unusual Valid Inputs / Special Characters |
| **Description** | Create a store whose name contains special characters that require Dali `encodePTreeName` encoding (e.g., spaces, dots, slashes) |
| **Input Data**  | `storename`: `"ECT005 Store.Name/Test"`, `description`: `"Special chars test"`, `type`: `"SPECIAL"` |
| **Dataset**     | N/A |
| **Expected Output** | Either `createStore()` returns `true` (characters encoded by server) or a specific meaningful exception is thrown |
| **Pass Criteria** | - If accepted: `createStore()` returns `true`; `listStores()` returns entry matching original name <br>- If rejected: throws a meaningful, catchable exception (not a silent `false`) |
| **Notes**       | The server calls `encodePTreeName(storename)` which handles percent-encoding for XML attribute safety. The existing test with `@` in store name (`b1createEncodedStoreTest`) covers one special char case; this test expands to spaces and other characters. |

---

#### ECT-006 — Create Store with Unicode Characters in Name

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | ECT-006 |
| **Category**    | Edge Case |
| **Subcategory** | Unusual Valid Inputs / Unicode |
| **Description** | Create a store with Unicode characters in the name to verify encoding and roundtrip behavior |
| **Input Data**  | `storename`: `"ECT006Ünïcödé_Store"`, `description`: `"Unicode name test"`, `type`: `"UNICODE"` |
| **Dataset**     | N/A |
| **Expected Output** | Either `createStore()` returns `true` (store created with encoded name) or throws a specific exception |
| **Pass Criteria** | - No uncaught exception propagates to the test <br>- If `true`: `listStores()` contains a matching entry <br>- If `false`/exception: error is descriptive and expected |
| **Notes**       | Tests XML/Dali encoding support for non-ASCII store names. |

---

### C. Error Handling Tests

---

#### EHT-001 — Create Store with Empty String Name

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | EHT-001 |
| **Category**    | Error Handling |
| **Subcategory** | Invalid Inputs / Missing Required Field |
| **Description** | Attempt to create a store with an empty string as the store name; verify the server-side validation is triggered |
| **Input Data**  | `storename`: `""`, `description`: `"empty name test"`, `type`: `"TEST"` |
| **Dataset**     | N/A |
| **Expected Output** | `createStore()` throws an exception (EspSoapFault wrapped as Exception) or returns `false`; store is NOT created |
| **Pass Criteria** | - An exception is thrown OR `createStore()` returns `false` <br>- The error message indicates the store name is missing or invalid <br>- No new store appears in `listStores()` with an empty name |
| **Notes**       | Server-side: `CDALIKVStore::createStore()` throws `MakeStringException(-1, "DALI Keystore createStore(): Store name not provided")` for empty name. The Java client catches `EspSoapFault` and prints the stack trace, then returns `false`. Verify the exception message is surfaced correctly. |

---

#### EHT-002 — Create Store with Null Store Name

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | EHT-002 |
| **Category**    | Error Handling |
| **Subcategory** | Invalid Inputs / Null Required Field |
| **Description** | Attempt to create a store passing `null` as the store name |
| **Input Data**  | `storename`: `null`, `description`: `"null name test"`, `type`: `"TEST"` |
| **Dataset**     | N/A |
| **Expected Output** | `createStore()` throws an exception or returns `false`; no store created |
| **Pass Criteria** | - An exception is thrown (likely `EspSoapFault` or `NullPointerException` depending on Axis2 null serialization) OR returns `false` <br>- No store with null/empty name created in the system |
| **Notes**       | `null` vs `""` may behave differently in Axis2 serialization. Null may serialize as omitted XML element, which the server treats as empty string. Verify behavior explicitly. |

---

#### EHT-003 — Create Store with Insufficient Permissions (Read-Only User)

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | EHT-003 |
| **Category**    | Error Handling |
| **Subcategory** | Server-Side Errors / Authorization Failure |
| **Description** | Attempt to create a store using a connection authenticated as a user that only has `WsStoreAccess:READ` permission (not `FULL`) |
| **Input Data**  | `storename`: `"EHT003UnauthorizedStore"`, `description`: `"auth test"`, `type`: `"TEST"` <br> Connection: authenticated user with read-only WsStore access |
| **Dataset**     | N/A |
| **Expected Output** | `createStore()` throws `ArrayOfEspExceptionWrapper` or `Exception` indicating authorization failure; store NOT created |
| **Pass Criteria** | - `ArrayOfEspExceptionWrapper` or `Exception` is thrown <br>- Exception message references authorization/permission denial <br>- `listStores()` does NOT contain `"EHT003UnauthorizedStore"` |
| **Notes**       | Requires a test user with limited WsStore permissions to be configured on the target HPCC. Use `Assume.assumeNotNull(readOnlyClient)` pattern to skip if such a user is not available. `CreateStore` requires `WsStoreAccess:FULL` per ECM definition. |

---

#### EHT-004 — Create Store with Invalid Connection (Bad Host)

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | EHT-004 |
| **Category**    | Error Handling |
| **Subcategory** | Client-Side Errors / Invalid Connection |
| **Description** | Attempt to create a store using a client initialized with an unreachable/invalid host |
| **Input Data**  | Connection: `protocol="http"`, `host="invalid.nonexistent.host.local"`, `port="8010"` <br> `storename`: `"EHT004BadConnStore"`, `description`: `"bad connection test"`, `type`: `"TEST"` |
| **Dataset**     | N/A |
| **Expected Output** | `createStore()` returns `false` (after catching `RemoteException`) or throws an Exception; no store created |
| **Pass Criteria** | - `createStore()` does not hang indefinitely (respects configured timeout) <br>- `createStore()` returns `false` or throws a catchable Exception <br>- No `NullPointerException` or unexpected unchecked exception propagates |
| **Notes**       | Set a short timeout (e.g., 5000ms) to avoid long waits. Use `HPCCWsStoreClient.get(protocol, host, port, user, pass, timeoutMs)`. |

---

#### EHT-005 — Create Store with Wrong Credentials

| Field           | Description |
|-----------------|-------------|
| **Test ID**     | EHT-005 |
| **Category**    | Error Handling |
| **Subcategory** | Server-Side Errors / Authentication Failure |
| **Description** | Attempt to create a store using a client initialized with incorrect credentials (wrong password) |
| **Input Data**  | Connection: valid host/port, but incorrect password <br> `storename`: `"EHT005BadCredsStore"`, `description`: `"bad creds test"`, `type`: `"TEST"` |
| **Dataset**     | N/A |
| **Expected Output** | `createStore()` throws `ArrayOfEspExceptionWrapper` (ESP authentication error) or `Exception`; store NOT created |
| **Pass Criteria** | - An exception is thrown or `false` is returned <br>- The error indicates authentication/authorization failure <br>- Only applicable when `targetHPCCAuthenticates == true`; use `Assume.assumeTrue(targetHPCCAuthenticates)` |
| **Notes**       | Use `Assume.assumeTrue(targetHPCCAuthenticates != null && targetHPCCAuthenticates)` to skip on non-authenticated clusters. Pattern from existing test class. |

---

## 8. New Dataset Specifications

The `createStore` method operates entirely within the WsStore key-value system and does **not** read, write, or reference any HPCC logical file datasets. All test cases use only string values for store name, description, and type.

**No new datasets are required for any of the test cases defined in this analysis.**

All test data is inline string configuration (store names, descriptions, and types) rather than HPCC file-based datasets.

---

## Appendix: Java Client API Gaps Identified

During analysis, the following gap was observed between the IDL and the Java client API:

| Field          | IDL Status                      | Java `createStore()` Method | Impact                                                   |
|----------------|---------------------------------|-----------------------------|----------------------------------------------------------|
| `MaxValueSize` | Available in WSDL v1.02+, default 1024 | **Not exposed**             | Java callers cannot control the max value size per store; always uses default (1024 bytes). Consider adding an overload: `createStore(String name, String description, String type, int maxValueSize)` |

This is noted for documentation purposes. Test cases for `MaxValueSize` are not included here because the Java API does not currently expose this field.


---
*Generated: 2026-02-24*

---

# WsStore `deleteNamespace` — Test Case Analysis

**Generated:** 2026-02-24  
**Service:** WsStore  
**Method:** `deleteNamespace`  
**Java Client:** `HPCCWsStoreClient`  
**Test File:** `WSStoreClientTest.java`

---

## 1. Method Summary

### Purpose
`deleteNamespace` removes an entire namespace (and all key-value pairs within it) from a named store on the HPCC ESP WsStore service.

### Role Within Service
The WsStore service provides a generic key-value store backed by HPCC. Each entry is addressed by a three-part path: `store → namespace → key`. Deleting a namespace is a destructive bulk operation — it removes all keys under the given namespace in one call, analogous to deleting a directory.

### Java Signature
```java
public boolean deleteNamespace(
    String storename,
    String namespace,
    boolean global,
    String targetuser
) throws Exception, ArrayOfEspExceptionWrapper
```

### Inputs

| Parameter | Type | Description |
|-----------|------|-------------|
| `storename` | `String` | Name of the store containing the namespace |
| `namespace` | `String` | Name of the namespace to delete |
| `global` | `boolean` | `true` = delete the global/shared namespace; `false` = delete the calling user's (or target user's) namespace |
| `targetuser` | `String` | If `global=false` and non-empty, the namespace is deleted on behalf of this user |

### Output
Returns `true` if the server reports success; returns `false` if a `RemoteException` or `EspSoapFault` is caught (exceptions are swallowed and `false` is returned).

### Side Effects
- All key-value entries stored under `storeName.namespace` for the relevant user scope are permanently removed.
- If the store has no default configured and `storename` is null/empty, the server falls back to the configured default store.
- ESP exceptions are surfaced via `ArrayOfEspExceptionWrapper`; network-level failures return `false` silently.

---

## 2. Existing Test Coverage Analysis

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| `z91deleteNSTest` | CFT | Basic global namespace deletion with standard store and namespace | `storename=WsClientTestStore`, `namespace=Junittests`, `global=true`, `targetuser=""` | `assertTrue(result)` | Run late in test order (z91) as cleanup; uses default store and namespace |
| `zz91deleteEncodedNSTest` | CFT | Global namespace deletion with URL-encoded store/namespace names | `storename=WsCli@ntT_estStore`, `namespace=Junit_t@ests`, `global=true`, `targetuser=""` | `assertTrue(result)` | Requires `encodedUserClient`; tests special characters in store/namespace names; run last as cleanup |

### Coverage Summary
- **Total existing test methods:** 2
- **Core Functionality Tests covered:** 2
  - Global namespace deletion (standard names)
  - Global namespace deletion (encoded/special-character names)
- **Edge Case Tests covered:** 0
- **Error Handling Tests covered:** 0
- **Gaps identified:**
  - User-specific namespace deletion (`global=false`, `targetuser=""`)
  - Deletion on behalf of another user (`global=false`, non-empty `targetuser`)
  - Deleting a namespace that does not exist
  - Deleting with `storename=null` / empty string (server falls back to default store)
  - Deleting with `namespace=null` / empty string
  - Deleting a namespace that has already been deleted (idempotency)
  - Attempting deletion without sufficient permissions (`WsStoreAccess:FULL` required)
  - Deleting a namespace containing a large number of keys
  - Null or invalid connection

---

## 3. Request Structure

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|----------------------|-------|
| `StoreName` | `string` | No | Store to operate on | Any non-empty string; may contain special characters | If empty/null, server falls back to configured default store |
| `Namespace` | `string` | No | Namespace to delete | Any string; may contain special characters, `/`, `@`, `_` | If empty, behaviour is server-defined (likely no-op or error) |
| `UserSpecific` | `bool` | No | Whether to target a user-scoped namespace | `true` / `false`; defaults to `false` (global) | Java client inverts the `global` parameter: `UserSpecific = !global` |
| `TargetUser` | `string` | No | Delete on behalf of this user | Valid username string | Only consulted when `UserSpecific=true` and non-empty; otherwise the calling user's identity is used |

### Field Dependencies
- When `UserSpecific=false` (global), `TargetUser` is ignored.
- When `UserSpecific=true` and `TargetUser` is non-empty, the server logs the impersonation and uses `TargetUser` for the namespace lookup.
- When `UserSpecific=true` and `TargetUser` is empty, the server uses the authenticated caller's identity.

### Java Parameter Mapping
```
global=true  → UserSpecific=false  (global scope)
global=false → UserSpecific=true   (user scope)
```

---

## 4. Server Behavior and Responses

### Processing Logic (from `ws_storeService.cpp`)
```cpp
bool CwsstoreEx::onDeleteNamespace(IEspContext &context, IEspDeleteNamespaceRequest &req, IEspDeleteNamespaceResponse &resp)
{
    const char *user = context.queryUserId();
    Owned<ISecUser> secuser = new CSecureUser(user, nullptr);
    const char *storename = req.getStoreName();
    bool global = !req.getUserSpecific();
    const char *targetUser = req.getTargetUser();

    if (!global && !isEmptyString(targetUser))
    {
        ESPLOG(...); // log impersonation
        user = targetUser;
    }

    if (!storename || !*storename)
    {
        if (!m_defaultStore.isEmpty())
            storename = m_defaultStore.get();
    }

    resp.setSuccess(m_storeProvider->deleteNamespace(storename, req.getNamespace(), secuser.get(), !req.getUserSpecific()));
    return true;
}
```

**Key observations:**
1. The `secuser` object is always built from the **calling** user's context (not from `TargetUser`) — `TargetUser` only affects the `user` local variable used for logging.
2. `deleteNamespace` is delegated to the store provider's `deleteNamespace()` method, which returns a boolean.
3. If `storename` is empty/null, the configured default store name is substituted.
4. The IDL marks the method with `auth_feature("WsStoreAccess:FULL")`, meaning the caller needs FULL access.

### Valid Response
| Field | Type | Meaning |
|-------|------|---------|
| `Success` | `bool` | `true` if the namespace was deleted; `false` if it did not exist or deletion failed |

### Exception Response
- `exceptions_inline` is set on the response — ESP exceptions are embedded in the response, not thrown as SOAP faults.
- Java client calls `handleEspExceptions()` when `response.getExceptions() != null`, converting to `ArrayOfEspExceptionWrapper`.

---

## 5. Error Handling

### Server-Side Errors
| Scenario | Expected Behaviour |
|----------|--------------------|
| `StoreName` empty, no default store configured | Store provider receives null/empty — likely returns `false` |
| `Namespace` empty or null | Behaviour depends on store provider; may return `false` or silently succeed |
| Namespace does not exist | Server likely returns `Success=false` (no error thrown) |
| Caller lacks `WsStoreAccess:FULL` permission | ESP authorization rejection — returned as ESP exception in response |
| Internal store provider failure | `Success=false`; may also produce ESP exception |

### Client-Side Errors
| Scenario | Expected Behaviour |
|----------|--------------------|
| `RemoteException` (network/transport) | Caught, stack trace printed, method returns `false` |
| `EspSoapFault` | Caught, stack trace printed, method returns `false` |
| `ArrayOfEspExceptionWrapper` thrown | Propagated to caller |
| Null `stub` / invalid connection | `NullPointerException` or `AxisFault` → likely surfaces as uncaught exception |

---

## 6. Existing Dataset Analysis

The `deleteNamespace` method operates on named key-value namespaces in the WsStore, which is entirely independent of HPCC file datasets (logical files stored on Thor/Roxie). The benchmark datasets are irrelevant for this method.

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | WsStore operates on key-value namespaces, not HPCC logical files |
| `~benchmark::string::100MB` | No | Not applicable — WsStore does not reference logical files |
| `~benchmark::integer::20KB` | No | Not applicable — WsStore does not reference logical files |
| `~benchmark::all_types::superfile` | No | Not applicable — WsStore does not reference logical files |
| `~benchmark::integer::20kb::key` | No | Not applicable — WsStore does not reference logical files |

**Dataset Note:** All test cases for `deleteNamespace` are self-contained: they create their own data (via `setValue`) as setup, then call `deleteNamespace`. No external dataset files are needed.

---

## 7. Test Case Plan

> All test cases below address gaps **not** covered by the two existing tests (`z91deleteNSTest` and `zz91deleteEncodedNSTest`).

---

### A. Core Functionality Tests

---

#### CFT-001 — User-Specific Namespace Deletion (Calling User's Scope)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Delete a namespace scoped to the calling (authenticated) user (`global=false`, `targetuser=""`) |
| **Setup** | Call `client.setValue(storename, namespace, "user.test.key", "user.test.val", false)` to ensure the user-scoped namespace exists |
| **Input Data** | `storename=WsClientTestStore`, `namespace=Junittests`, `global=false`, `targetuser=""` |
| **Dataset** | N/A — uses WsStore key-value data created in setup |
| **Expected Output** | Returns `true` |
| **Pass Criteria** | - Return value is `true`<br>- No exception thrown<br>- Subsequent `listNamespaces(storename, false)` does not include `namespace` |
| **Notes** | Requires authenticated connection; complements `z91deleteNSTest` which only tests `global=true` |

---

#### CFT-002 — Delete Namespace on Behalf of Target User

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflows |
| **Description** | Delete a user-scoped namespace on behalf of a named target user (`global=false`, `targetuser` set to an existing user) |
| **Setup** | Use `encodedUserClient` to call `setValue(defaultEncodedStoreName, defaultEncodedNS, "key", "val", false)` creating the encoded user's namespace; then use a client with appropriate privileges to delete on behalf |
| **Input Data** | `storename=WsClientTestStore`, `namespace=Junittests`, `global=false`, `targetuser=<valid_username>` |
| **Dataset** | N/A |
| **Expected Output** | Returns `true` |
| **Pass Criteria** | - Return value is `true`<br>- No exception thrown<br>- The target user's namespace is removed (verify via `listNamespaces` with that user context) |
| **Notes** | Requires knowing a valid secondary username; `TargetUser` triggers impersonation log on the server side. Only run if `targetHPCCAuthenticates` is true. |

---

#### CFT-003 — Delete Namespace; Verify Keys Are Removed

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflows |
| **Description** | After deleting a namespace, verify all keys within it are no longer accessible |
| **Setup** | Set multiple keys in the namespace: `setValue(storename, namespace, "key1", "val1", true)`, `setValue(storename, namespace, "key2", "val2", true)`; then call `deleteNamespace` |
| **Input Data** | `storename=WsClientTestStore`, `namespace=CFT003Namespace`, `global=true`, `targetuser=""` |
| **Dataset** | N/A |
| **Expected Output** | `deleteNamespace` returns `true`; subsequent `fetchValue(storename, "CFT003Namespace", "key1", true)` returns `null` |
| **Pass Criteria** | - `deleteNamespace` returns `true`<br>- `fetchValue` for all previously set keys returns `null` or throws not-found exception<br>- `listNamespaces` no longer contains `CFT003Namespace` |
| **Notes** | Tests the actual side effect of the delete — that all keys are removed |

---

### B. Edge Case Tests

---

#### ECT-001 — Delete Namespace With Empty StoreName (Falls Back to Default Store)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Call `deleteNamespace` with an empty `storename` — the server should fall back to the configured default store |
| **Setup** | Ensure the test namespace exists in the default store: `setValue("", namespace, "fallback.key", "val", true)` |
| **Input Data** | `storename=""`, `namespace=Junittests`, `global=true`, `targetuser=""` |
| **Dataset** | N/A |
| **Expected Output** | Returns `true` (if default store is configured) |
| **Pass Criteria** | - No exception thrown<br>- Returns `true` indicating deletion occurred in default store |
| **Notes** | Behaviour depends on server configuration; if no default store is configured, may return `false`. Document observed behaviour. |

---

#### ECT-002 — Delete Non-Existent Namespace (Idempotency)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Delete a namespace that does not exist; verify the operation does not throw and returns a predictable result |
| **Input Data** | `storename=WsClientTestStore`, `namespace=NonExistentNamespace_XYZ_12345`, `global=true`, `targetuser=""` |
| **Dataset** | N/A |
| **Expected Output** | Returns `false` (namespace not found) or `true` (idempotent); no exception |
| **Pass Criteria** | - No exception thrown<br>- Method returns without error |
| **Notes** | Characterise and document the actual return value — this documents the idempotency contract |

---

#### ECT-003 — Delete Already-Deleted Namespace (Second Call)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Call `deleteNamespace` twice on the same namespace; the second call should not throw |
| **Setup** | Set a key, call `deleteNamespace` (first call succeeds), call `deleteNamespace` again |
| **Input Data** | `storename=WsClientTestStore`, `namespace=ECT003DoubleDeleteNS`, `global=true`, `targetuser=""` |
| **Dataset** | N/A |
| **Expected Output** | First call returns `true`; second call returns `false` (or `true` if idempotent) without exception |
| **Pass Criteria** | - No exception on second call<br>- Application does not crash or enter error state |
| **Notes** | Verifies graceful handling of repeated delete requests |

---

#### ECT-004 — Delete Namespace With Special Characters in Namespace Name

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-004 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Delete a namespace whose name contains URL-unsafe characters (e.g., `@`, `_`, spaces) |
| **Setup** | Create namespace via `encodedUserClient.setValue(defaultEncodedStoreName, "Special@NS_Name", "key", "val", true)` |
| **Input Data** | `storename=WsCli@ntT_estStore`, `namespace=Special@NS_Name`, `global=true`, `targetuser=""` |
| **Dataset** | N/A |
| **Expected Output** | Returns `true` |
| **Pass Criteria** | - Returns `true`<br>- No encoding/marshalling exception |
| **Notes** | Similar to `zz91deleteEncodedNSTest` but uses a specifically crafted namespace name rather than just the default encoded one |

---

#### ECT-005 — Delete Namespace With Very Long Namespace Name

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-005 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Delete a namespace whose name is at or near the maximum string length the server will accept |
| **Setup** | Create namespace with a 255-character name |
| **Input Data** | `storename=WsClientTestStore`, `namespace=<255-character string>`, `global=true`, `targetuser=""` |
| **Dataset** | N/A |
| **Expected Output** | Returns `true` or a meaningful error; no JVM crash |
| **Pass Criteria** | - Returns predictable result<br>- No uncaught exception |
| **Notes** | Tests transport/protocol limits for string fields |

---

### C. Error Handling Tests

---

#### EHT-001 — Null Namespace Parameter

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Missing Required Fields |
| **Description** | Call `deleteNamespace` with `namespace=null`; observe client and server behaviour |
| **Input Data** | `storename=WsClientTestStore`, `namespace=null`, `global=true`, `targetuser=""` |
| **Dataset** | N/A |
| **Expected Output** | Either returns `false`, throws `Exception`, or throws `ArrayOfEspExceptionWrapper` |
| **Pass Criteria** | - Does not silently succeed (would be dangerous)<br>- Throws a descriptive exception OR returns `false` |
| **Notes** | The Axis2 stub will likely serialize `null` as an absent XML element; test the actual observed behaviour and document it |

---

#### EHT-002 — Null Store Name Parameter

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Missing Required Fields |
| **Description** | Call `deleteNamespace` with `storename=null`; the server falls back to the default store (if configured) or may error |
| **Input Data** | `storename=null`, `namespace=Junittests`, `global=true`, `targetuser=""` |
| **Dataset** | N/A |
| **Expected Output** | If default store is configured: returns `true` or `false`; if not: returns `false` or throws |
| **Pass Criteria** | - Does not throw unchecked exception<br>- Returns a value or throws `ArrayOfEspExceptionWrapper` |
| **Notes** | Server performs null check and substitutes default store if available |

---

#### EHT-003 — Empty Namespace String

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Malformed Values |
| **Description** | Call `deleteNamespace` with `namespace=""` (empty string) |
| **Input Data** | `storename=WsClientTestStore`, `namespace=""`, `global=true`, `targetuser=""` |
| **Dataset** | N/A |
| **Expected Output** | Returns `false` or throws an `ArrayOfEspExceptionWrapper` |
| **Pass Criteria** | - Does not delete all namespaces in the store<br>- Returns predictable error result |
| **Notes** | Important safety test — an empty namespace should not be treated as a wildcard |

---

#### EHT-004 — Delete Namespace Without Required Permission

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Permission / Authorization |
| **Description** | Attempt to delete a namespace using a connection with insufficient permissions (`WsStoreAccess:FULL` is required) |
| **Input Data** | Connection with read-only or no WsStore permissions; `storename=WsClientTestStore`, `namespace=Junittests`, `global=true`, `targetuser=""` |
| **Dataset** | N/A |
| **Expected Output** | Throws `ArrayOfEspExceptionWrapper` with authorization error, or returns `false` |
| **Pass Criteria** | - Method does not return `true`<br>- Error clearly indicates authorization failure |
| **Notes** | Requires a test account with restricted permissions; skip with `Assume` if such an account is unavailable |

---

#### EHT-005 — Store Name Does Not Exist

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-005 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Resource Not Found |
| **Description** | Call `deleteNamespace` specifying a store name that does not exist on the server |
| **Input Data** | `storename=NoSuchStore_XYZ_99999`, `namespace=Junittests`, `global=true`, `targetuser=""` |
| **Dataset** | N/A |
| **Expected Output** | Returns `false` or throws `ArrayOfEspExceptionWrapper` |
| **Pass Criteria** | - Does not return `true`<br>- No uncaught exception crashes the test |
| **Notes** | Tests the store-not-found path in the store provider |

---

#### EHT-006 — Invalid / Null Connection Object

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-006 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors — Null/Invalid Connection |
| **Description** | Attempt to call `deleteNamespace` via a client constructed from a null or malformed connection |
| **Input Data** | Client created from invalid endpoint URL; `storename=WsClientTestStore`, `namespace=Junittests`, `global=true`, `targetuser=""` |
| **Dataset** | N/A |
| **Expected Output** | Throws `Exception` (e.g., `AxisFault`, `MalformedURLException`) or returns `false` |
| **Pass Criteria** | - Does not return `true`<br>- Failure is surfaced clearly to the caller |
| **Notes** | Consistent with how other methods handle null/bad connections; verifies `RemoteException` catch path returns `false` |

---

## 8. New Dataset Specifications

**No new datasets required.** All test cases for `deleteNamespace` operate entirely within the WsStore key-value service. Test data is created by calling `setValue` during test setup and does not require any HPCC logical file datasets.

Pre-existing test infrastructure (stores, namespaces, and keys) is established by the test class setup and the existing `setValue`/`createStore` tests that run before the delete tests (enforced by `@FixMethodOrder(MethodSorters.NAME_ASCENDING)`).


---
*Generated: 2026-02-24*

---

# WsStore `deleteValue` Method — Test Case Analysis

**Generated:** 2026-02-24  
**Target Class:** `HPCCWsStoreClient`  
**Target Method:** `deleteValue(String storename, String namespace, String key, boolean global)`  
**Test File:** `WSStoreClientTest.java`

---

## 1. Method Summary

### Purpose
`deleteValue` removes a single key-value entry from a named store and namespace in the HPCC DALI Key-Value store. It is the complement of `setValue` and provides targeted deletion of individual entries.

### Role Within the Service
WsStore is a general-purpose key-value store hosted within the HPCC ESP service. `deleteValue` is the primary mechanism for removing individual entries from the store, as opposed to `deleteNamespace` which removes an entire namespace.

### Inputs
| Parameter | Java Type | Description |
|-----------|-----------|-------------|
| `storename` | `String` | Name of the target store. If null/empty, falls back to server's default store. |
| `namespace` | `String` | Namespace within the store. Required (server throws if empty). |
| `key` | `String` | Key to delete within the namespace. Required (server throws if empty). |
| `global` | `boolean` | `true` = delete from global (shared) space; `false` = delete from user-specific space. |

### Outputs
- Returns `true` if deletion succeeded.
- Returns `false` if a `RemoteException` or `EspSoapFault` is caught (exception is printed to stderr).
- Throws `ArrayOfEspExceptionWrapper` if the server responds with ESP exceptions.
- Throws `Exception` for unexpected errors.

### Side Effects
- Permanently removes the key-value entry from the DALI store.
- If the key does not exist, the server throws an exception (propagated as `ArrayOfEspExceptionWrapper`).
- DALI write lock is acquired and released during execution.

### Notable API Limitation
The underlying `DeleteRequest` object has a `targetUser` field (allowing admin deletion on behalf of another user), but the Java `deleteValue()` method does not expose this field. It is only available by constructing requests directly.

---

## 2. Existing Test Coverage Analysis

### Existing Tests Found for `deleteValue`

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| `a5deleteValueTest` | CFT | Global key deletion: set a key, verify it exists, delete it, verify it is null | storename=`WsClientTestStore`, namespace=`Junittests`, key=`testkey`, value=`testvalue`, global=`true` | `deleteValue` returns `true`; subsequent `fetchValue` returns `null` | Full round-trip validation |
| `a5deleteValueTest` (auth branch) | CFT | User-specific key deletion: set a user key, delete it, verify null | same store/namespace, key=`user.testkey`, value=`user.testvalue`, global=`false` | `deleteValue` returns `true`; subsequent `fetchValue` returns `null` | Only runs if `targetHPCCAuthenticates == true` |

> **Note:** `a4deleteTest` and `b5deleteTest` are named with "delete" but only perform `setValue` calls — they do not test `deleteValue`.

### Coverage Summary

- **Total existing test methods targeting `deleteValue`:** 1 (`a5deleteValueTest` — contains two logical scenarios)
- **Core Functionality Tests covered:** 2 — basic global delete, basic user-specific delete
- **Edge Case Tests covered:** 0
- **Error Handling Tests covered:** 0
- **Gaps identified:**
  1. Deleting a non-existent key (key never set, or already deleted)
  2. Deleting with empty string storename (default store fallback)
  3. Deleting with null storename
  4. Deleting with empty/null namespace
  5. Deleting with empty/null key
  6. Double-deletion (delete same key twice — second attempt should fail/error)
  7. Key with special characters (spaces, dots, at-signs, slashes)
  8. Key in an encoded/special-character store name (encoded store)
  9. Deleting from a non-existent store
  10. User-specific deletion when authentication is disabled
  11. Large/boundary key name length
  12. Null/invalid connection

---

## 3. Request Structure

### `DeleteRequest` Fields

| Field Name | Java Type | Required | Description | Valid Range / Format | Notes |
|------------|-----------|----------|-------------|----------------------|-------|
| `StoreName` | `String` | No | Name of the key-value store | Non-empty string; any printable characters | Server falls back to configured default store if empty/null |
| `Namespace` | `String` | Yes | Namespace within the store | Non-empty string | Server throws exception if empty or null |
| `Key` | `String` | Yes | Key to delete | Non-empty string | Server throws exception if empty or null |
| `UserSpecific` | `boolean` | No | Whether to operate on user-specific partition | `true` / `false`; default `false` (global) | Java method maps this as `!global` |
| `TargetUser` | `String` | No | Admin: delete on behalf of this user | Valid username string | NOT exposed by `HPCCWsStoreClient.deleteValue()`; only available directly via request wrapper |

### Field Dependencies
- When `UserSpecific = true` (global=false): the authenticated user identity is required server-side. The server will throw if user context is missing.
- `TargetUser` is only meaningful when `UserSpecific = true` (exposed only in `deleteNamespace`, not `deleteValue` in the Java API).
- Empty `StoreName` triggers default store fallback on the server; the Java client does not set a fallback.

### Default Behavior for Optional Fields
- `StoreName` absent → server substitutes its configured `defaultStore`
- `UserSpecific` absent / `false` → global deletion (shared key space)
- `TargetUser` absent → uses authenticated caller's identity

---

## 4. Server Behavior and Responses

### Server-Side Processing (`CwsstoreEx::onDelete` → `CDALIKVStore::deletekey`)

1. Retrieve authenticated user from context.
2. Retrieve `StoreName`; if empty, substitute the server's configured default store.
3. Validate `StoreName` — throw if still empty after fallback.
4. Validate `Namespace` — throw if empty or null.
5. Validate `Key` — throw if empty or null.
6. For user-specific (`!global`): validate that user is not empty.
7. Connect to DALI with write lock (timeout: `SDS_LOCK_TIMEOUT_KVSTORE`).
8. Throw if DALI connection fails (offline mode or DALI unavailable).
9. Build XPath: `<DALI_KVSTORE_PATH>/Store[@name='<encodedStoreName>'][1]/<GLOBAL|username>/<namespace>/<key>`.
10. Check if property exists via `hasProp`; **throw if not found**.
11. Call `removeProp(xpath)` to delete the entry.
12. Commit the DALI connection.
13. Return `true`.

### Response Fields

| Field | Type | Description |
|-------|------|-------------|
| `Success` | `bool` | `true` if deletion succeeded |
| `Exceptions` | `ArrayOfEspException` | Present if server-level exceptions occurred |

### Valid Response Scenarios
| Scenario | `success` value | Exceptions |
|----------|----------------|------------|
| Key found and deleted successfully | `true` | None |
| Store name not provided (and no default) | N/A | Exception thrown before response |
| Namespace not provided | N/A | Exception thrown |
| Key not provided | N/A | Exception thrown |
| Key not found in store | N/A | Exception thrown |
| DALI offline | N/A | Exception thrown |

---

## 5. Error Handling

### Server-Side Errors

| Error Condition | Server Behavior | Java Client Behavior |
|-----------------|-----------------|----------------------|
| `StoreName` empty, no default configured | Throws `MakeStringException(-1, "DALI Keystore deletekey(): Store name not provided")` | Propagated as `ArrayOfEspExceptionWrapper` via `handleEspExceptions` |
| `Namespace` empty/null | Throws `MakeStringException(-1, "DALI KV Store deletekey(): target namespace not provided!")` | Propagated as `ArrayOfEspExceptionWrapper` |
| `Key` empty/null | Throws `MakeStringException(-1, "DALI KV Store deletekey(): target key not provided!")` | Propagated as `ArrayOfEspExceptionWrapper` |
| User-specific but user not provided | Throws `MakeStringException(-1, "DALI Keystore set(): Attempting to set non-global entry but user not provided")` | Propagated as `ArrayOfEspExceptionWrapper` |
| Key does not exist | Throws `MakeStringException(-1, "DALI KV Store deletekey(): Could not find '...'")` | Propagated as `ArrayOfEspExceptionWrapper` |
| DALI connection failure (offline) | Throws from `ensureAttachedToDali()` | Propagated as `ArrayOfEspExceptionWrapper` |
| Store not found in DALI | `conn` is null → throws | Propagated as `ArrayOfEspExceptionWrapper` |

### Client-Side Errors

| Error Condition | Java Client Behavior |
|-----------------|----------------------|
| `RemoteException` from network layer | Caught, printed to stderr; method returns `false` |
| `EspSoapFault` from Axis2 | Caught, printed to stderr; method returns `false` |
| Null connection passed to `HPCCWsStoreClient.get()` | Throws `NullPointerException` or returns null client before call |
| Server returns `exceptions` in response | `handleEspExceptions` throws `ArrayOfEspExceptionWrapper` |

---

## 6. Existing Dataset Analysis

The `deleteValue` method operates on the WsStore key-value store, **not on HPCC file datasets**. It stores and deletes string-typed key-value pairs in DALI. Therefore, the HPCC benchmark file datasets are not directly applicable.

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | This is an HPCC logical file dataset; `deleteValue` operates on the DALI KV store, not file-based data |
| `~benchmark::string::100MB` | No | Same reason — file dataset, not KV store data |
| `~benchmark::integer::20KB` | No | Same reason — file dataset, not KV store data |
| `~benchmark::all_types::superfile` | No | Same reason — file dataset |
| `~benchmark::integer::20kb::key` | No | Same reason — file index, not KV store data |

All test data for `deleteValue` is created on-the-fly by calling `setValue` before each test case (as done in the existing `a5deleteValueTest`). No pre-loaded datasets are required or applicable.

---

## 7. Test Case Plan

> The following test cases address **only** gaps identified in Section 2. The existing `a5deleteValueTest` already covers basic global and user-specific deletion round-trips.

---

### A. Core Functionality Tests

#### CFT-001 — Default Store Deletion (Empty StoreName)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation — Default Store Fallback |
| **Description** | Verify that passing an empty string (or null) as `storename` causes the server to use the configured default store, and deletion succeeds if the key exists in that store. |
| **Input Data** | `storename`: `""` (empty string), `namespace`: `"Junittests"`, `key`: `"defaultstore.testkey"`, `global`: `true`; first call `setValue("", namespace, key, value, true)` to set |
| **Dataset** | N/A — KV store key created in-test |
| **Expected Output** | `deleteValue` returns `true`; subsequent `fetchValue("", namespace, key, true)` returns `null` |
| **Pass Criteria** | - No exception thrown<br>- Return value is `true`<br>- Key no longer retrievable after deletion |
| **Notes** | Requires that a default store is configured on the test HPCC instance. Skip or mark inconclusive if no default store is configured. |

#### CFT-002 — Encoded/Special-Character Store Name Deletion

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations — Encoded Store Name |
| **Description** | Verify deletion succeeds when the store name and namespace contain special characters (e.g., `@`, `_`), matching the encoded store used in `b5deleteTest`-family tests. |
| **Input Data** | `storename`: `"WsCli@ntT_estStore"`, `namespace`: `"Junit_t@ests"`, `key`: `"encoded.store.testkey"`, `global`: `true`; pre-set the key with `setValue` |
| **Dataset** | N/A — KV store key created in-test |
| **Expected Output** | `deleteValue` returns `true`; subsequent `fetchValue` returns `null` |
| **Pass Criteria** | - No exception thrown<br>- Return value is `true`<br>- Key is gone after deletion |
| **Notes** | Uses `encodedUserClient` or `client` depending on store permissions. Aligns with encoded-store tests already present. |

---

### B. Edge Case Tests

#### ECT-001 — Key With Special Characters

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs — Special Characters in Key |
| **Description** | Verify that keys containing special characters (dots, at-signs, underscores, hyphens) can be set and then deleted successfully. |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: `"key.with@special-chars_here"`, `global`: `true`; pre-set with `setValue` |
| **Dataset** | N/A — KV store key created in-test |
| **Expected Output** | `deleteValue` returns `true`; subsequent `fetchValue` returns `null` |
| **Pass Criteria** | - No exception thrown<br>- Return value is `true`<br>- Key is not present after deletion |
| **Notes** | The server encodes key names via `encodePTreeName`; this tests that encoding round-trips correctly for special-character keys. |

#### ECT-002 — Long Key Name (Boundary Value)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — Maximum Key Length |
| **Description** | Verify that a key name at or near the practical maximum length (e.g., 255 characters) can be set and then deleted. |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: string of 255 `'a'` characters, `global`: `true`; pre-set with `setValue` |
| **Dataset** | N/A — KV store key created in-test |
| **Expected Output** | `deleteValue` returns `true`; key not retrievable afterward |
| **Pass Criteria** | - No exception thrown<br>- Return value is `true`<br>- Key not present after deletion |
| **Notes** | Tests that DALI property path construction handles long names. Actual max length is DALI-implementation defined; adjust if a lower limit is discovered. |

#### ECT-003 — Double Deletion (Delete Already-Deleted Key)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs — Idempotency Check |
| **Description** | Verify that deleting a key that has already been deleted throws an appropriate error (not silently returning true). |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: `"double.delete.testkey"`, `global`: `true`; first: set + delete; second: attempt to delete again without re-setting |
| **Dataset** | N/A — KV store key created in-test |
| **Expected Output** | Second `deleteValue` call throws `ArrayOfEspExceptionWrapper` (or `Exception`) containing a "not found" message |
| **Pass Criteria** | - First deletion returns `true`<br>- Second deletion throws an exception (key-not-found)<br>- Exception message references the missing key |
| **Notes** | Server throws `MakeStringException(-1, "DALI KV Store deletekey(): Could not find ...")` for non-existent keys. |

#### ECT-004 — User-Specific Key Deletion With Encoded Username

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-004 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs — Encoded Username |
| **Description** | Verify that user-specific key deletion works when the authenticated user has special characters in their username (e.g., `Juni@tUser`). |
| **Input Data** | Use `encodedUserClient`; `storename`: `defaultEncodedStoreName`, `namespace`: `defaultEncodedNS`, `key`: `"user.encoded.testkey"`, `global`: `false`; pre-set with `encodedUserClient.setValue` |
| **Dataset** | N/A — KV store key created in-test |
| **Expected Output** | `deleteValue` returns `true`; subsequent `fetchValue` returns `null` |
| **Pass Criteria** | - No exception thrown<br>- Return value is `true`<br>- Key not present after deletion |
| **Notes** | Requires `encodedUserClient` (uses `Juni@tUser` credentials). Only runs if `targetHPCCAuthenticates == true`. |

---

### C. Error Handling Tests

#### EHT-001 — Delete Non-Existent Key

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Resource Not Found |
| **Description** | Attempt to delete a key that was never set. Verify the server returns an error and the client throws or returns false correctly. |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: `"this.key.does.not.exist"`, `global`: `true`; do NOT pre-set this key |
| **Dataset** | N/A |
| **Expected Output** | Throws `ArrayOfEspExceptionWrapper` with a message containing "Could not find" or similar; or returns `false` if the exception is caught as an `EspSoapFault` |
| **Pass Criteria** | - An exception is thrown OR `false` is returned<br>- No silent success for non-existent key |
| **Notes** | Server throws `MakeStringException(-1, "DALI KV Store deletekey(): Could not find ...")`. The Java client may propagate this as `ArrayOfEspExceptionWrapper` or catch it as `EspSoapFault` and return `false`. |

#### EHT-002 — Delete With Empty Namespace

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Missing Required Field (Namespace) |
| **Description** | Call `deleteValue` with an empty string namespace and verify an appropriate error is thrown. |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `""`, `key`: `"any.testkey"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | Throws `ArrayOfEspExceptionWrapper` or `Exception`; message references missing namespace |
| **Pass Criteria** | - Exception is thrown<br>- Exception message indicates namespace is required |
| **Notes** | Server throws `"DALI KV Store deletekey(): target namespace not provided!"`. Do NOT pre-set a key for this test. |

#### EHT-003 — Delete With Empty Key

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Missing Required Field (Key) |
| **Description** | Call `deleteValue` with an empty string key and verify an appropriate error is thrown. |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: `""`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | Throws `ArrayOfEspExceptionWrapper` or `Exception`; message references missing key |
| **Pass Criteria** | - Exception is thrown<br>- Exception message indicates key is required |
| **Notes** | Server throws `"DALI KV Store deletekey(): target key not provided!"`. |

#### EHT-004 — Delete With Null Key

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Null Value for Required Field |
| **Description** | Call `deleteValue` with `null` as the key parameter and verify appropriate error handling. |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: `null`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | Throws `ArrayOfEspExceptionWrapper`, `Exception`, or `NullPointerException` |
| **Pass Criteria** | - Exception is thrown (not a silent failure)<br>- Method does not return `true` |
| **Notes** | Null is passed through to the Axis2 stub which may serialize it as empty, resulting in a server-side "key not provided" error. |

#### EHT-005 — Delete With Null Namespace

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-005 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Null Value for Required Field |
| **Description** | Call `deleteValue` with `null` as the namespace parameter and verify appropriate error handling. |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `null`, `key`: `"any.testkey"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | Throws `ArrayOfEspExceptionWrapper`, `Exception`, or `NullPointerException` |
| **Pass Criteria** | - Exception is thrown (not a silent failure)<br>- Method does not return `true` |
| **Notes** | Similar to EHT-002 but with Java `null` instead of empty string. |

#### EHT-006 — Delete From Non-Existent Store

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-006 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Resource Not Found (Store) |
| **Description** | Attempt to delete a key from a store name that does not exist in the DALI KV store. |
| **Input Data** | `storename`: `"NonExistentStoreName_XYZ_12345"`, `namespace`: `defaultNS`, `key`: `"some.key"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | Throws `ArrayOfEspExceptionWrapper` or returns `false`; error indicates store not found or connection failure |
| **Pass Criteria** | - Exception is thrown OR `false` is returned<br>- No silent success |
| **Notes** | Server attempts to connect to DALI path for the store; if the store does not exist, `conn` will be null and an exception is thrown. |

#### EHT-007 — Delete With Invalid Connection (Null Client)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-007 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors — Null/Invalid Connection |
| **Description** | Attempt to call `deleteValue` through a client initialized with an invalid/null connection and verify it throws before reaching the server. |
| **Input Data** | `client` initialized with `HPCCWsStoreClient.get(null)` or a connection to an unreachable host; `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: `"any.key"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | Throws `NullPointerException`, `IllegalArgumentException`, or `AxisFault` |
| **Pass Criteria** | - Exception is thrown before or during the stub call<br>- Method does not return `true` |
| **Notes** | Test should use `Assume.assumeNotNull(client)` pattern to skip gracefully if test setup itself fails. |

#### EHT-008 — Delete User-Specific Key on Unauthenticated Server

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-008 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Permission/Authentication |
| **Description** | When `targetHPCCAuthenticates == false`, attempt to delete a user-specific key (`global=false`) and verify the behavior (either error or server fallback behavior). |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: `"user.unauthenticated.key"`, `global`: `false` |
| **Dataset** | N/A |
| **Expected Output** | Either: throws `ArrayOfEspExceptionWrapper` (user context invalid), or returns a value indicating failure |
| **Pass Criteria** | - Only runs when `targetHPCCAuthenticates == false` (use `Assume.assumeFalse(targetHPCCAuthenticates)`)<br>- No unhandled exception propagates to test framework |
| **Notes** | Server requires a valid user for `UserSpecific=true`. When auth is disabled, the user identity is empty and `deletekey()` throws. |

---

## 8. New Dataset Specifications

No new HPCC file datasets are required for `deleteValue` tests. All test data consists of key-value pairs created on-the-fly via `setValue` before each test case and verified via `fetchValue` after each deletion.

All test key creation should follow this pattern:
```java
// Setup: create the key to be deleted
Assert.assertTrue(client.setValue(storename, namespace, keyToDelete, "testvalue", global));

// Execute: delete the key
boolean result = client.deleteValue(storename, namespace, keyToDelete, global);

// Verify: confirm deletion
Assert.assertTrue(result);
Assert.assertNull(client.fetchValue(storename, namespace, keyToDelete, global));
```

Use unique key names per test to prevent cross-test interference (e.g., prefix with test ID: `"CFT001.testkey"`).


---
*Generated: 2026-02-24*

---

# WsStore.fetchAllNSKeys — Test Case Analysis

**Generated:** 2026-02-24  
**Method:** `HPCCWsStoreClient.fetchAllNSKeys`  
**Test File:** `WSStoreClientTest.java`  
**Service:** `wsstore` (ESP Service, version 1.02)

---

## 1. Method Summary

### Purpose
`fetchAllNSKeys` retrieves all key-value pairs stored within a specific namespace of a named store. It provides a bulk lookup that returns every key and its corresponding value in a namespace as a Java `Properties` object.

### Role Within Service
This method wraps the server-side `FetchAll` ESP method. It is complementary to `listNSKeys` (which returns only the list of key names) — `fetchAllNSKeys` returns both keys **and** values in one call, making it more efficient when the caller needs the complete set of key-value pairs.

### Inputs
| Parameter | Type | Description |
|-----------|------|-------------|
| `storename` | `String` | Name of the store to query |
| `namespace` | `String` | Namespace within the store to retrieve all pairs from |
| `global` | `boolean` | If `true`, fetches global (non-user-specific) keys; if `false`, fetches keys scoped to the authenticated user |

### Outputs
- Returns a `java.util.Properties` object containing all key-value pairs found in the namespace.
- Returns an empty `Properties` object if the namespace exists but has no entries (or if the server returns a null `Pairs` element).

### Side Effects
- None (read-only operation).
- `RemoteException` and `EspSoapFault` are caught and printed to stderr rather than re-thrown — callers will receive an empty `Properties` object in those cases rather than an exception.
- `ArrayOfEspExceptionWrapper` is re-thrown (via `handleEspExceptions`) if the response contains ESP-level exceptions.

---

## 2. Existing Test Coverage Analysis

The following existing test methods call or exercise `fetchAllNSKeys`:

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|--------------------|---------------|-------|
| `a3fetchAllNSKeysTest` | CFT | Basic operation — fetch all keys from a known namespace with `global=true` | `storename="WsClientTestStore"`, `namespace="Junittests"`, `global=true` | Result is not null; printed to stdout; no exception thrown | Runs after `a2setTest` which seeds data in the namespace |
| `listNamespaces` | CFT | Fetch all keys from each discovered namespace (both global and user-specific) | Iterates all namespaces returned by `listNamespaces`; calls with `global=true` and (if auth enabled) `global=false` | No assertion on result contents; no exception thrown | Secondary call within a broader namespace listing test; result is not validated structurally |
| `b4fetchAllEncodedNSKeysTest` | CFT | Fetch all keys using a store/namespace with special characters (`@`, `_`) using an encoded-username client | `storename="WsCli@ntT_estStore"`, `namespace="Junit_t@ests"`, `global=true`, encoded user client | Result is not null; printed to stdout; no exception thrown | Tests that store/namespace names with special characters are handled correctly |

### Coverage Summary

- **Total existing test methods:** 3 (directly or indirectly testing `fetchAllNSKeys`)
- **Core Functionality Tests covered:**
  - Global fetch from a standard store/namespace (after data seeded by `a2setTest`)
  - Global fetch across all discovered namespaces
  - Fetch with special characters in store/namespace names (encoded user client)
- **Edge Case Tests covered:**
  - Implicitly: user-specific fetch (via `listNamespaces` when `targetHPCCAuthenticates=true`), but with no result assertions
- **Error Handling Tests covered:** None
- **Gaps identified:**
  1. No test for fetching from a **non-existent store** (should throw / return ESP exception)
  2. No test for fetching from a **non-existent namespace** within a valid store (server throws "invalid namespace detected")
  3. No test for **empty namespace** parameter (server throws "Namespace not provided!")
  4. No test for **null/empty store name** (server falls back to default store or throws if no default)
  5. No test verifying the **returned Properties content** — key names, values, and count are never asserted
  6. No test for **user-specific fetch** (`global=false`) with explicit assertions on the returned data
  7. No test for **namespace with no keys** (empty namespace → empty Properties returned)
  8. No test for namespace/store names **containing URL-special or XML-special characters** beyond the encoded test (e.g., `/`, `<`, `>`, `&`, spaces)
  9. No test for **null connection** or **invalid credentials** passed to `fetchAllNSKeys`
  10. No test for a namespace that contains **many key-value pairs** (performance/boundary)

---

## 3. Request Structure

The Java method constructs a `FetchAllRequest` (Axis2 generated class) with the following fields:

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|---------------------|-------|
| `StoreName` | `String` | Conditionally | Name of the store to query | Any non-empty string; encoded by server | If empty/null, server falls back to configured default store; if no default, throws exception |
| `Namespace` | `String` | Yes | Namespace within the store | Any non-empty string; server-encoded via `encodePTreeName` | Cannot be empty or null — server throws `"Namespace not provided!"` |
| `UserSpecific` | `boolean` | No | Whether to scope lookup to current user | `true`/`false` | Mapped as `!global` by the Java client; default is `false` (global lookup) |

### Field Mapping (Java → Request)
```java
request.setStoreName(storename);           // direct pass-through
request.setNamespace(namespace);           // direct pass-through
request.setUserSpecific(!global);          // inverted: global=true → UserSpecific=false
```

### Dependencies Between Fields
- `UserSpecific=true` requires an authenticated user context. If the server cannot resolve a user name (unauthenticated), it throws `"Attempting to fetch non-global entries but requester name not provided"`.

---

## 4. Server Behavior and Responses

### Server-Side Processing (`onFetchAll` in `ws_storeService.cpp`)
1. Reads `StoreName` from request; if absent, falls back to `m_defaultStore`.
2. Calls `m_storeProvider->getAllPairs(storename, ns, secuser, !req.getUserSpecific())`.
3. `getAllPairs` (`daliKVStore.cpp`):
   - Validates store name is non-empty.
   - If `global=false`, validates that authenticated user name is available.
   - Validates namespace is non-empty.
   - Encodes store name and namespace using `encodePTreeName` to handle special characters.
   - Connects to DALI store via SDS; throws if connection fails.
   - Looks up the namespace node; throws `"invalid namespace detected!"` if it does not exist.
   - Returns the property tree for that namespace node.
4. Iterates all child nodes of the namespace tree, decoding each key name via `decodePtreeName`.
5. Sets `Pairs` array and `Namespace` in the response.

### Valid Response
| Field | Type | Description |
|-------|------|-------------|
| `Namespace` | `String` | Echo of the requested namespace |
| `Pairs` | `ESParray<KVPair>` | Array of key-value pairs; may be empty or null if namespace has no entries |

### Invalid / Error Responses
| Condition | Server Behaviour |
|-----------|-----------------|
| `StoreName` empty and no default store configured | Exception thrown by `getAllPairs` |
| `Namespace` empty or null | Exception thrown: `"Namespace not provided!"` |
| `global=false` and user not authenticated | Exception thrown: `"Attempting to fetch non-global entries but requester name not provided"` |
| Store does not exist in DALI | `getAllPairs` cannot connect → exception |
| Namespace not found within store | Exception thrown: `"invalid namespace detected!"` |
| DALI offline | Exception thrown: `"Unable to connect to DALI KeyValue store path"` |

---

## 5. Error Handling

### Server-Side Errors
| Error Type | Trigger | Client Receives |
|------------|---------|-----------------|
| ESP Exception (wrapped) | Various server-side validation failures surfaced as ESP exceptions | `ArrayOfEspExceptionWrapper` re-thrown via `handleEspExceptions` |
| Store not found / DALI error | Thrown as C++ exceptions internally | Surfaced as `EspSoapFault` or `RemoteException` — **silently swallowed** by the Java client (printed, not thrown); returns empty `Properties` |
| Namespace not found | Thrown as C++ exception internally | Same as above — silently swallowed |
| User not authenticated for user-specific lookup | Thrown as C++ exception internally | Same as above — silently swallowed |

### Client-Side Errors
| Error Type | Trigger | Behaviour |
|------------|---------|-----------|
| `RemoteException` | Network/communication failure or Axis2 fault | Caught and printed; returns empty `Properties` |
| `EspSoapFault` | Server returned a SOAP fault | Caught and printed; returns empty `Properties` |
| `ArrayOfEspExceptionWrapper` | ESP-level error in response body | Re-thrown to caller |
| Null `stub` | Client not properly initialised | Would throw `NullPointerException` before request is sent |

> **Design Note:** The Java client silently swallows `RemoteException` and `EspSoapFault`, returning an empty `Properties` instead of propagating the error. This means callers cannot distinguish between "namespace is empty" and "request failed entirely" without additional logging inspection.

---

## 6. Existing Dataset Analysis

`fetchAllNSKeys` operates on HPCC **key-value store** (WsStore/Dali) data, not on HPCC file system datasets. The benchmark datasets (ECL files on the HPCC distributed file system) are **not applicable** to this method.

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | HPCC DFS dataset; not relevant to the Dali KV store used by WsStore |
| `~benchmark::string::100MB` | No | HPCC DFS dataset; not relevant to the Dali KV store used by WsStore |
| `~benchmark::integer::20KB` | No | HPCC DFS dataset; not relevant to the Dali KV store used by WsStore |
| `~benchmark::all_types::superfile` | No | HPCC DFS dataset; not relevant to the Dali KV store used by WsStore |
| `~benchmark::integer::20kb::key` | No | HPCC DFS index file; not relevant to the Dali KV store used by WsStore |

All test cases for `fetchAllNSKeys` require **WsStore-internal state** (stores and namespaces populated via `setValue`/`createStore` calls) rather than file system datasets.

---

## 7. Test Case Plan

> **All test cases below address gaps identified in Section 2. None duplicate existing tests.**

---

### A. Core Functionality Tests

---

#### CFT-001 — Fetch all keys with verified content

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation — content verification |
| **Description** | After seeding known keys, verify that `fetchAllNSKeys` returns a `Properties` object containing exactly those key-value pairs |
| **Input Data** | Prerequisite: `setValue(storename, namespace, "cft001.key1", "value1", true)` and `setValue(storename, namespace, "cft001.key2", "value2", true)`; then call `fetchAllNSKeys(storename, namespace, true)` |
| **Dataset** | N/A — uses WsStore state seeded via `setValue` |
| **Expected Output** | Returned `Properties` contains `"cft001.key1" → "value1"` and `"cft001.key2" → "value2"` |
| **Pass Criteria** | - Response is not null<br>- `props.getProperty("cft001.key1")` equals `"value1"`<br>- `props.getProperty("cft001.key2")` equals `"value2"`<br>- No exceptions thrown |
| **Notes** | This fills the gap of the existing `a3fetchAllNSKeysTest` which never validates the returned content; cleanup: delete seeded keys after test |

---

#### CFT-002 — User-specific (non-global) fetch with content verification

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations — user-specific scope |
| **Description** | Verify that `fetchAllNSKeys` with `global=false` returns key-value pairs scoped to the authenticated user (not global keys) |
| **Input Data** | Prerequisite: `setValue(storename, namespace, "cft002.userkey", "uservalue", false)`; then call `fetchAllNSKeys(storename, namespace, false)` |
| **Dataset** | N/A — uses WsStore state |
| **Expected Output** | Returned `Properties` contains `"cft002.userkey" → "uservalue"`; global-only keys are not present |
| **Pass Criteria** | - Response is not null<br>- `props.getProperty("cft002.userkey")` equals `"uservalue"`<br>- No exceptions thrown<br>- Global-scope keys (from CFT-001) not present in user-scoped result |
| **Notes** | Only run when `targetHPCCAuthenticates = true` (use `Assume.assumeTrue`); fills gap from `listNamespaces` test which calls user-specific fetch without assertions |

---

#### CFT-003 — Namespace with no keys returns empty Properties

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation — empty namespace |
| **Description** | When a namespace exists but contains no key-value pairs, `fetchAllNSKeys` should return an empty (non-null) `Properties` object |
| **Input Data** | Prerequisite: create an empty namespace (e.g., via a `setValue` call followed by deletion of the value, or by using a freshly created store); call `fetchAllNSKeys(storename, emptyNamespace, true)` |
| **Dataset** | N/A — uses WsStore state |
| **Expected Output** | Returned `Properties` is not null and `props.isEmpty()` is `true` |
| **Pass Criteria** | - Response is not null<br>- `props.size()` equals 0<br>- No exceptions thrown |
| **Notes** | The server returns an empty `Pairs` element (or null `Pairs`) for an empty namespace; the Java client must handle null `pairs` gracefully — it does check `if (pairs != null)` |

---

### B. Edge Case Tests

---

#### ECT-001 — Empty store name (falls back to default store)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — empty store name |
| **Description** | When `storename` is `null` or empty string, the server falls back to the configured default store. Verify that the call succeeds if a default store is configured |
| **Input Data** | `fetchAllNSKeys(null, namespace, true)` and `fetchAllNSKeys("", namespace, true)` |
| **Dataset** | N/A |
| **Expected Output** | If a default store is configured on the server: returns `Properties` (possibly empty); if no default store: `RemoteException` or `EspSoapFault` is swallowed and empty `Properties` is returned |
| **Pass Criteria** | - No `NullPointerException` thrown by Java client<br>- Method returns a non-null `Properties` object in both cases<br>- If default store behaviour is observable, returned data matches default store's namespace |
| **Notes** | The server has a `m_defaultStore` fallback; the Java client passes `null`/`""` directly into the Axis2 request with no validation |

---

#### ECT-002 — Store/namespace names with special characters

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs — special character encoding |
| **Description** | Verify that store/namespace names containing XML/URL-special characters (`<`, `>`, `&`, `/`, spaces) are correctly encoded/decoded by the server |
| **Input Data** | Prerequisite: create a store named `"Test&Store<1>"` and set a key in namespace `"ns/sub ns"` (if server allows); call `fetchAllNSKeys("Test&Store<1>", "ns/sub ns", true)` |
| **Dataset** | N/A |
| **Expected Output** | Server correctly encodes the names via `encodePTreeName` and retrieves pairs; returned `Properties` is not null |
| **Pass Criteria** | - No exception thrown<br>- Returned `Properties` is not null<br>- If keys were seeded, they appear correctly in the result |
| **Notes** | The `b4fetchAllEncodedNSKeysTest` only covers `@` and `_`; this extends coverage to other special characters; test may need to skip if server rejects these names at create time |

---

#### ECT-003 — Large namespace (many key-value pairs)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Performance Limits — large data set |
| **Description** | Verify that `fetchAllNSKeys` can handle a namespace with a large number of keys (e.g., 100+ key-value pairs) |
| **Input Data** | Prerequisite: seed 100 key-value pairs in a test namespace using a loop (`setValue` for each); call `fetchAllNSKeys(storename, bulkNamespace, true)` |
| **Dataset** | N/A — state seeded programmatically |
| **Expected Output** | Returned `Properties` contains all 100 key-value pairs |
| **Pass Criteria** | - Response is not null<br>- `props.size()` equals 100<br>- All seeded keys are present with correct values<br>- No exceptions thrown<br>- Completes within a reasonable time (e.g., 10 seconds) |
| **Notes** | Tests that iteration over the `Pairs` array works for large result sets; cleanup: delete namespace after test |

---

#### ECT-004 — Very long key and value strings

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-004 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — max string length |
| **Description** | Verify that `fetchAllNSKeys` correctly returns key-value pairs where the value is at or near the store's `MaxValueSize` limit |
| **Input Data** | Prerequisite: set a key with a value of 1024 characters (the default `MaxValueSize`); call `fetchAllNSKeys(storename, namespace, true)` |
| **Dataset** | N/A |
| **Expected Output** | Returned `Properties` contains the key with the full 1024-character value intact |
| **Pass Criteria** | - Response is not null<br>- Value length equals 1024<br>- Value content matches seeded content<br>- No exceptions thrown |
| **Notes** | The `CreateStoreRequest.MaxValueSize` defaults to 1024; exceeding this would be an error-handling test (see EHT-003) |

---

### C. Error Handling Tests

---

#### EHT-001 — Non-existent store name

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — store not found |
| **Description** | Verify client behaviour when a store that does not exist is specified |
| **Input Data** | `fetchAllNSKeys("NonExistentStore_" + System.currentTimeMillis(), namespace, true)` |
| **Dataset** | N/A |
| **Expected Output** | Server throws an exception (store path not found in DALI); Java client silently catches `RemoteException`/`EspSoapFault` and returns empty `Properties` OR re-throws via `handleEspExceptions` if ESP exception is returned |
| **Pass Criteria** | - Method does not throw `NullPointerException`<br>- Either returns empty `Properties` without exception, OR throws `ArrayOfEspExceptionWrapper`<br>- No unhandled exceptions propagate |
| **Notes** | Tests the silent-swallow behaviour of the Java client for server errors; important to document whether empty `Properties` or an exception is the actual outcome |

---

#### EHT-002 — Non-existent namespace within a valid store

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — namespace not found |
| **Description** | Verify client behaviour when the store exists but the specified namespace does not |
| **Input Data** | `fetchAllNSKeys(storename, "NonExistentNS_" + System.currentTimeMillis(), true)` where `storename` is a valid, existing store |
| **Dataset** | N/A |
| **Expected Output** | Server throws `"invalid namespace detected!"`; Java client silently catches and returns empty `Properties` OR throws `ArrayOfEspExceptionWrapper` |
| **Pass Criteria** | - Method does not propagate an unhandled exception<br>- Either returns empty `Properties`, OR throws `ArrayOfEspExceptionWrapper` with a meaningful message<br>- No `NullPointerException` |
| **Notes** | Key gap: the server explicitly throws for non-existent namespaces but the Java client swallows the fault; this test documents the actual observable behaviour |

---

#### EHT-003 — Empty namespace parameter

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — missing required field |
| **Description** | Verify client behaviour when `namespace` is `null` or empty string (server throws `"Namespace not provided!"`) |
| **Input Data** | `fetchAllNSKeys(storename, null, true)` and `fetchAllNSKeys(storename, "", true)` |
| **Dataset** | N/A |
| **Expected Output** | Server throws exception; Java client swallows it and returns empty `Properties`, or throws `ArrayOfEspExceptionWrapper` |
| **Pass Criteria** | - No `NullPointerException` from Java client<br>- Method returns non-null `Properties` (empty) or throws `ArrayOfEspExceptionWrapper`<br>- No unhandled exceptions |
| **Notes** | The Java client does no client-side validation of `namespace` before sending the request |

---

#### EHT-004 — User-specific fetch when unauthenticated

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — authentication / authorization |
| **Description** | Verify that calling `fetchAllNSKeys` with `global=false` when the connection has no credentials (or HPCC does not authenticate) results in an appropriate error |
| **Input Data** | Create an unauthenticated `Connection`; call `fetchAllNSKeys(storename, namespace, false)` |
| **Dataset** | N/A |
| **Expected Output** | Server throws `"Attempting to fetch non-global entries but requester name not provided"`; Java client swallows and returns empty `Properties` or throws `ArrayOfEspExceptionWrapper` |
| **Pass Criteria** | - Method does not throw `NullPointerException`<br>- Either returns empty `Properties` or throws `ArrayOfEspExceptionWrapper`<br>- No unhandled exceptions |
| **Notes** | Only applicable when `!targetHPCCAuthenticates`; use `Assume.assumeFalse(targetHPCCAuthenticates)` |

---

#### EHT-005 — Null connection (client not initialised)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-005 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors — null connection |
| **Description** | Verify that calling `fetchAllNSKeys` on an improperly initialised client throws an appropriate exception rather than a `NullPointerException` |
| **Input Data** | Attempt to call `HPCCWsStoreClient.get(null)` or a client constructed with an invalid connection, then call `fetchAllNSKeys(storename, namespace, true)` |
| **Dataset** | N/A |
| **Expected Output** | Exception thrown before or during the remote call (e.g., `AxisFault`, `IllegalArgumentException`, or similar) |
| **Pass Criteria** | - Exception type is documented and consistent<br>- No silent failure returning empty `Properties`<br>- No `NullPointerException` propagated without context |
| **Notes** | This tests the construction-time failure path, not the RPC failure path; may require examining `BaseHPCCWsClient` initialisation guards |

---

#### EHT-006 — Invalid credentials

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-006 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — authorization failure |
| **Description** | Verify that calling `fetchAllNSKeys` with wrong credentials results in a proper auth error |
| **Input Data** | Create a `Connection` with `username="invalidUser"`, `password="wrongPass"`; call `fetchAllNSKeys(storename, namespace, true)` |
| **Dataset** | N/A |
| **Expected Output** | Server returns HTTP 401 or ESP auth exception; client throws `ArrayOfEspExceptionWrapper` or `AxisFault` |
| **Pass Criteria** | - Exception is thrown with a meaningful message indicating auth failure<br>- No silent failure returning empty `Properties` |
| **Notes** | Only applicable when `targetHPCCAuthenticates = true`; use `Assume.assumeTrue(targetHPCCAuthenticates)` |

---

## 8. New Dataset Specifications

No new HPCC DFS datasets are required for any of the test cases above. All `fetchAllNSKeys` test data is stored in the HPCC **Dali KV Store** and is created at test setup time using the `setValue` API. The test framework's existing `storename` and `namespace` variables, or fresh stores/namespaces created within individual tests, provide all necessary test state.

### Test State Dependencies

Each test that requires pre-seeded data should follow the pattern used elsewhere in `WSStoreClientTest.java`:

1. **Setup:** Call `setValue(...)` to seed required key-value pairs before exercising `fetchAllNSKeys`.
2. **Assert:** Validate the returned `Properties` content.
3. **Cleanup:** Call `deleteValue(...)` or `deleteNamespace(...)` after the test to avoid state pollution.

For `ECT-003` (large namespace), a helper loop should seed 100 key-value pairs in a dedicated namespace (e.g., `"fetchAllBulkTest"`) and delete the namespace in a corresponding teardown step.


---
*Generated: 2026-02-24*

---

# WsStore.fetchKeyMetaData — Test Case Analysis

**Generated:** 2026-02-24  
**Target Method:** `HPCCWsStoreClient.fetchKeyMetaData`  
**Test File:** `WSStoreClientTest.java`

---

## 1. Method Summary

### Purpose
`fetchKeyMetaData` retrieves the metadata attributes associated with a specific stored key in the WsStore service. Metadata includes system-managed attributes such as creation user, creation time, last edit time, and last edit user — stored as XML-style attributes on the key node in the property tree.

### Role Within the Service
The WsStore service provides a key-value store scoped by store name and namespace. Each stored key carries metadata attributes that allow auditing of who created or last modified the value, and when. This method exposes that metadata to the caller without returning the value itself, useful for auditing and change tracking scenarios.

### Inputs
| Parameter | Type | Description |
|-----------|------|-------------|
| `storename` | `String` | Name of the store. If null/empty, the server falls back to the default store. |
| `namespace` | `String` | Namespace within the store that groups related keys. |
| `key` | `String` | The specific key whose metadata is to be retrieved. |
| `global` | `boolean` | If `true`, treat as a global (non-user-specific) key (`UserSpecific=false`). If `false`, treat as user-specific (`UserSpecific=true`). |

### Outputs
- Returns a `java.util.Properties` object containing the key's metadata attributes as name/value pairs.
- Typical property names: `@createUser`, `@createTime`, `@editTime`, `@editBy`.
- If no metadata exists (e.g., key does not exist), the returned `Properties` object is empty (not null).

### Side Effects
- None; this is a read-only operation.
- Requires `WsStoreAccess:FULL` permission on the server side.

---

## 2. Existing Test Coverage Analysis

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|--------------------|---------------|-------|
| `b4fetchEncodedNSKeysAttributesTest` | CFT | Fetch metadata for a key with special-character store/namespace names (global scope) | storename=`WsCli@ntT_estStore`, namespace=`Junit_t@ests`, key=`global.test`, global=`true` | Response is not null | Uses encoded/special-character store and namespace names; verifies non-null result only |
| `b4fetchEncodedKeyTest` | ECT | Fetch metadata for a URL-encodable key name (key with `@` character) | storename=`WsCli@ntT_estStore`, namespace=`Junit_t@ests`, key=`encod@ble`, global=`true` | Response is not null | Verifies special-character key names are handled; non-null only |
| `listNamespaces` | CFT | Indirectly invokes `fetchKeyMetaData` for every key in every namespace via `listNamespaceKeys` helper | storename=`WsClientTestStore`, all namespaces, all keys, global=`true` and `false` | No exceptions thrown; output printed | Not a focused test — coverage is incidental and assertions are minimal |

### Coverage Summary
- **Total existing test methods:** 3 (2 direct, 1 indirect)
- **Core Functionality Tests covered:** 1 (indirect traversal in `listNamespaces`; one direct fetch of a known global key)
- **Edge Case Tests covered:** 1 (special-character key name `encod@ble`)
- **Error Handling Tests covered:** 0

**Gaps identified:**
1. No test using the standard (non-encoded) store/namespace with the default `client`
2. No test verifying that specific metadata properties are present and populated (e.g., `@createUser`, `@createTime`)
3. No test verifying metadata after a value update (to confirm `@editTime`/`@editBy` are populated)
4. No test for a non-existent key (expected: empty `Properties`, not null, no exception)
5. No test for a non-existent store name
6. No test for a non-existent namespace
7. No test for `global=false` (user-specific key metadata) using the direct call
8. No test for `null` storename (server should fall back to the default store)
9. No test for `null` or empty namespace
10. No test for `null` or empty key
11. No test for a key that has been updated multiple times (verify `@editTime` changes)
12. No test verifying the response echoes back the correct `StoreName`, `Namespace`, and `Key`

---

## 3. Request Structure

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|---------------------|-------|
| `StoreName` | `string` | No | Name of the target store | Any non-empty string | If absent/empty, server falls back to the configured default store |
| `Namespace` | `string` | Yes (logically) | Namespace grouping the key | Any string | Empty namespace may result in empty results; no server-side validation documented |
| `Key` | `string` | Yes (logically) | The key name to inspect | Any string; URL-encodable characters are supported | Empty key returns empty metadata |
| `UserSpecific` | `bool` | No | `false` = global scope (default); `true` = user-specific scope | `true` / `false` | Java maps `global=true` → `UserSpecific=false` and `global=false` → `UserSpecific=true` |

### Field Dependencies
- When `UserSpecific=true`, the server uses the authenticated user's identity to scope the lookup. An unauthenticated (anonymous) request with `UserSpecific=true` will return empty or no results.
- `StoreName` fallback to default store only applies if the server has a default store configured.

### Default Behavior for Optional Fields
- `StoreName` omitted → uses server-configured default store.
- `UserSpecific` omitted (defaults to `false`) → global scope.

---

## 4. Server Behavior and Responses

### Server-Side Logic (`onFetchKeyMetadata`)
1. Extracts `StoreName`, `Namespace`, `Key`, and `UserSpecific` from the request.
2. Resolves authenticated user from the ESP context.
3. If `StoreName` is empty, substitutes the server's configured default store name.
4. Calls `m_storeProvider->getAllKeyProperties(storename, ns, key, secuser, !userSpecific)` to retrieve an `IPropertyTree` of attributes for the key.
5. If the property tree is non-null, iterates its XML attributes and populates a `KVPair` array in the response.
6. Always sets `StoreName`, `Namespace`, and `Key` on the response (echo-back), regardless of whether the key exists.
7. Returns `true` (success) even if no metadata is found.

### Valid Response Types
| Scenario | `Pairs` array | `StoreName` | `Namespace` | `Key` |
|----------|--------------|-------------|-------------|-------|
| Key exists with metadata | Non-empty array of `@createUser`, `@createTime`, optionally `@editTime`, `@editBy` | Echoed from request (or resolved default) | Echoed | Echoed |
| Key exists but no metadata attributes | Empty or null `Pairs` | Echoed | Echoed | Echoed |
| Key does not exist | Empty or null `Pairs` | Echoed | Echoed | Echoed |

### Known Metadata Attributes (from `printMetaData` in test file)
| Attribute Name | Description | Always Present |
|----------------|-------------|----------------|
| `@createUser` | Username of the user who created the key | Yes (if key exists) |
| `@createTime` | Timestamp when the key was created | Yes (if key exists) |
| `@editTime` | Timestamp of the last edit | Only after first update |
| `@editBy` | Username of the last editor | Only after first update |

---

## 5. Error Handling

### Server-Side Errors
| Condition | Expected Behavior | Notes |
|-----------|-------------------|-------|
| `StoreName` empty, no default store configured | Empty response with no pairs | Server may return exceptions via `Exceptions` field |
| Authentication required but `UserSpecific=true` with no auth | Empty pairs or server exception | Depends on server auth configuration |
| Internal store access failure | ESP exception in response | Rare in normal operation |

### Client-Side Errors
| Condition | Expected Behavior | Notes |
|-----------|-------------------|-------|
| `null` connection | `NullPointerException` or `AxisFault` at stub invocation | Client does not guard against null connection |
| `RemoteException` | Caught, stack trace printed, empty `Properties` returned | Swallowed — no exception propagated to caller |
| `EspSoapFault` | Caught, stack trace printed, empty `Properties` returned | Swallowed — no exception propagated to caller |
| Server returns ESP exceptions | `ArrayOfEspExceptionWrapper` thrown | Handled via `handleEspExceptions` |

---

## 6. Existing Dataset Analysis

The `fetchKeyMetaData` method operates on WsStore key-value entries — not on HPCC distributed file system datasets. None of the benchmark datasets are applicable because this method does not read HPCC files; it retrieves key metadata from the ESP store service.

| Dataset Name | Applicable? | Reason |
|--------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | DFS file dataset; WsStore operates independently of the HPCC file system |
| `~benchmark::string::100MB` | No | DFS file dataset; not applicable to key-value store operations |
| `~benchmark::integer::20KB` | No | DFS file dataset; not applicable to key-value store operations |
| `~benchmark::all_types::superfile` | No | DFS file dataset; not applicable to key-value store operations |
| `~benchmark::integer::20kb::key` | No | DFS index file; not applicable to key-value store operations |

All test cases for this method use WsStore key-value entries created dynamically within the test setup (via `setValue`), which are the appropriate "dataset" for this service.

---

## 7. Test Case Plan

> Only scenarios not covered by existing tests are included below.

### A. Core Functionality Tests

---

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Fetch metadata for a freshly created global key in the standard test store and verify core metadata properties are present |
| **Input Data** | Pre-condition: `client.setValue(storename, namespace, "meta.test.key", "somevalue", true)` <br> `storename`: `WsClientTestStore`, `namespace`: `Junittests`, `key`: `meta.test.key`, `global`: `true` |
| **Dataset** | N/A — WsStore key created dynamically in test setup |
| **Expected Output** | `Properties` object is not null; contains `@createUser` and `@createTime` properties |
| **Pass Criteria** | - Returned `Properties` is not null <br> - `props.containsKey("@createUser")` is `true` <br> - `props.containsKey("@createTime")` is `true` <br> - `@createUser` is non-empty <br> - `@createTime` is non-empty <br> - No exception thrown |
| **Notes** | This fills the gap of verifying specific metadata field presence on a standard (non-encoded) store using the default `client`. Uses `storename`/`namespace` from the test class's system properties. |

---

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations — metadata after update |
| **Description** | Fetch metadata for a key that has been updated at least once, and verify that `@editTime` and `@editBy` properties appear |
| **Input Data** | Pre-condition: <br> 1. `client.setValue(storename, namespace, "meta.edit.key", "initial", true)` <br> 2. `client.setValue(storename, namespace, "meta.edit.key", "updated", true)` <br> Then: `fetchKeyMetaData(storename, namespace, "meta.edit.key", true)` |
| **Dataset** | N/A — WsStore key created/updated dynamically |
| **Expected Output** | `Properties` contains `@createUser`, `@createTime`, `@editTime`, and `@editBy` |
| **Pass Criteria** | - Returned `Properties` is not null <br> - `props.containsKey("@editTime")` is `true` <br> - `props.containsKey("@editBy")` is `true` <br> - `@editTime` is non-empty <br> - No exception thrown |
| **Notes** | Verifies that the metadata tracking system correctly records edit information after a key update. |

---

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations — user-specific key |
| **Description** | Fetch metadata for a user-specific (non-global) key using `global=false` |
| **Input Data** | Pre-condition: `client.setValue(storename, namespace, "meta.user.key", "uservalue", false)` <br> `fetchKeyMetaData(storename, namespace, "meta.user.key", false)` |
| **Dataset** | N/A — WsStore key created dynamically |
| **Expected Output** | `Properties` is not null; contains `@createUser` and `@createTime` |
| **Pass Criteria** | - Returned `Properties` is not null <br> - `props.containsKey("@createUser")` is `true` <br> - No exception thrown |
| **Notes** | This test must be skipped when `targetHPCCAuthenticates == false` using `Assume.assumeTrue(targetHPCCAuthenticates)`. |

---

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-004 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflow — response echo-back |
| **Description** | Verify that the response correctly echoes back the `StoreName`, `Namespace`, and `Key` fields from the request |
| **Input Data** | Pre-condition: `client.setValue(storename, namespace, "echo.test.key", "echovalue", true)` <br> `fetchKeyMetaData(storename, namespace, "echo.test.key", true)` |
| **Dataset** | N/A — WsStore key created dynamically |
| **Expected Output** | The underlying response object has `storeName == storename`, `namespace == namespace`, `key == "echo.test.key"` |
| **Pass Criteria** | - Method completes without exception <br> - Returned `Properties` is not null <br> - `@createUser` is present (confirming a valid response was received) |
| **Notes** | The Java method only returns the `Properties` (pairs), not the echoed fields. This test validates the round-trip worked correctly by asserting the metadata is present and valid, confirming the correct key was targeted. A deeper assertion would require inspecting the raw response, which is beyond the current API surface. |

---

### B. Edge Case Tests

---

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — null storename |
| **Description** | Invoke `fetchKeyMetaData` with `null` storename; server should fall back to the default store |
| **Input Data** | Pre-condition: a key must exist in the default store's namespace. <br> `fetchKeyMetaData(null, namespace, "some.key", true)` |
| **Dataset** | N/A — relies on the server's default store having a pre-existing key |
| **Expected Output** | No exception thrown; `Properties` returned (may be empty if no key exists in default store) |
| **Pass Criteria** | - No `NullPointerException` or unexpected exception thrown <br> - Returned `Properties` is not null |
| **Notes** | Tests the server-side default store fallback logic. If no default store is configured, the response may contain ESP exceptions. |

---

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — non-existent key |
| **Description** | Fetch metadata for a key that does not exist in the store; expect empty (not null) `Properties` |
| **Input Data** | `fetchKeyMetaData(storename, namespace, "nonexistent.key.xyz987", true)` <br> (No prior `setValue` call for this key) |
| **Dataset** | N/A |
| **Expected Output** | `Properties` object is returned, is not null, and is empty (no entries) |
| **Pass Criteria** | - Returned `Properties` is not null <br> - `props.isEmpty()` is `true` <br> - No exception thrown |
| **Notes** | The server always echoes back the request fields and returns `true`, so the client should receive an empty Pairs array for a non-existent key. Verifies the client handles the null/empty `Pairs_type1` gracefully. |

---

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — empty string key |
| **Description** | Invoke `fetchKeyMetaData` with an empty string `""` as the key |
| **Input Data** | `fetchKeyMetaData(storename, namespace, "", true)` |
| **Dataset** | N/A |
| **Expected Output** | `Properties` returned (likely empty); no exception propagated to caller |
| **Pass Criteria** | - No exception escapes from the method <br> - Returned `Properties` is not null |
| **Notes** | Tests graceful handling of an empty key string. The server is not expected to have a key with name `""`, so metadata will likely be empty. |

---

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-004 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — non-existent namespace |
| **Description** | Fetch metadata using a namespace that does not exist in the store |
| **Input Data** | `fetchKeyMetaData(storename, "nonexistent.namespace.xyz987", "somekey", true)` |
| **Dataset** | N/A |
| **Expected Output** | `Properties` returned is empty; no exception thrown |
| **Pass Criteria** | - Returned `Properties` is not null <br> - No exception propagated to caller |
| **Notes** | Validates the client handles an empty pairs response for a missing namespace. |

---

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-005 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs — key with special characters (dot-separated) |
| **Description** | Fetch metadata for a key whose name contains dots (e.g., `files.rowperpage.default`) — a common naming convention in WsStore |
| **Input Data** | Pre-condition: `client.setValue(storename, namespace, "files.rowperpage.default", "50", true)` <br> `fetchKeyMetaData(storename, namespace, "files.rowperpage.default", true)` |
| **Dataset** | N/A |
| **Expected Output** | `Properties` is not null and contains `@createUser` and `@createTime` |
| **Pass Criteria** | - Returned `Properties` is not null <br> - `props.containsKey("@createUser")` is `true` <br> - No exception thrown |
| **Notes** | Dot-separated key names are a standard convention (e.g., for ECL playground settings). This verifies the metadata retrieval works for real-world key naming patterns using the standard `client`. |

---

### C. Error Handling Tests

---

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — non-existent store name |
| **Description** | Invoke `fetchKeyMetaData` with a store name that does not exist on the server |
| **Input Data** | `fetchKeyMetaData("NonExistentStoreName_XYZ987", namespace, "somekey", true)` |
| **Dataset** | N/A |
| **Expected Output** | Either: (a) `Properties` returned empty without exception, or (b) `ArrayOfEspExceptionWrapper` thrown |
| **Pass Criteria** | - If no exception: returned `Properties` is not null <br> - If exception: it is an `ArrayOfEspExceptionWrapper` with a meaningful message <br> - No unexpected `RuntimeException` or `NullPointerException` |
| **Notes** | Server behavior for a non-existent store is implementation-defined. This test documents and verifies whichever behavior is implemented. The test should use a try/catch for `ArrayOfEspExceptionWrapper` and accept either outcome. |

---

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — user-specific key on non-authenticating server |
| **Description** | Attempt to fetch user-specific key metadata (`global=false`) when the target HPCC cluster does not authenticate users |
| **Input Data** | `fetchKeyMetaData(storename, namespace, "user.test", false)` <br> Precondition: `targetHPCCAuthenticates == false` |
| **Dataset** | N/A |
| **Expected Output** | `Properties` returned is empty (no user-specific data stored when auth is disabled) |
| **Pass Criteria** | - Returned `Properties` is not null <br> - No exception propagated <br> - Test is only meaningful when `targetHPCCAuthenticates == false` (use `Assume.assumeFalse(targetHPCCAuthenticates)`) |
| **Notes** | When authentication is disabled, `UserSpecific=true` lookups should return empty results since user-specific data cannot be meaningfully stored or retrieved. |

---

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors — null key parameter |
| **Description** | Invoke `fetchKeyMetaData` with `null` as the key parameter |
| **Input Data** | `fetchKeyMetaData(storename, namespace, null, true)` |
| **Dataset** | N/A |
| **Expected Output** | Either: (a) returns not-null empty `Properties` without exception, or (b) throws a well-defined exception (`ArrayOfEspExceptionWrapper` or checked exception) |
| **Pass Criteria** | - No `NullPointerException` escapes the method uncaught <br> - Behavior is deterministic (either empty result or declared exception) |
| **Notes** | The client passes `null` directly to the Axis2 request via `request.setKey(null)`. This tests the safety of the null flow through serialization and server-side handling. The `RemoteException` and `EspSoapFault` are caught internally and result in an empty `Properties`, so the likely outcome is an empty result. |

---

## 8. New Dataset Specifications

No new HPCC DFS datasets are required for this method's test cases. All tests operate on WsStore key-value entries created dynamically during test execution using `client.setValue(...)` as a pre-condition.

**Dynamic test data requirements summary:**

| Test ID | Pre-condition Required |
|---------|----------------------|
| CFT-001 | `setValue(storename, namespace, "meta.test.key", "somevalue", true)` |
| CFT-002 | `setValue(...)` twice for `"meta.edit.key"` |
| CFT-003 | `setValue(storename, namespace, "meta.user.key", "uservalue", false)` |
| CFT-004 | `setValue(storename, namespace, "echo.test.key", "echovalue", true)` |
| ECT-001 | A key must pre-exist in the server's default store (may be environment-dependent) |
| ECT-002 | None (key must NOT exist) |
| ECT-003 | None |
| ECT-004 | None |
| ECT-005 | `setValue(storename, namespace, "files.rowperpage.default", "50", true)` |
| EHT-001 | None |
| EHT-002 | None (use `Assume.assumeFalse(targetHPCCAuthenticates)`) |
| EHT-003 | None |

All dynamic data is self-contained within the test setup and does not require external dataset generation scripts.


---
*Generated: 2026-02-24*

---

# WsStore `fetchValue` Method — Test Case Analysis

**Generated:** 2026-02-24  
**Service:** WsStore  
**Java Client:** `HPCCWsStoreClient.fetchValue()`  
**ESP Method:** `Fetch` (maps to `onFetch` → `CDALIKVStore::fetch`)  

---

## 1. Method Summary

### Purpose
`fetchValue` retrieves a stored string value associated with a specific key within a named namespace inside a named store. It is the primary read operation of the WsStore key/value service.

### Role Within Service
It is one of the core CRUD operations alongside `setValue`, `deleteValue`, and `deleteNamespace`. It provides point-lookup access to individual key/value pairs stored in the DALI-backed key/value store.

### Inputs

| Parameter | Type | Description |
|-----------|------|-------------|
| `storename` | `String` | Name of the WsStore to query. If empty/null the server falls back to the configured default store. |
| `namespace` | `String` | Namespace within the store. Must be non-empty on the server or a `MakeStringException` is thrown. |
| `key` | `String` | Key to look up within the namespace. Must be non-empty on the server or a `MakeStringException` is thrown. |
| `global` | `boolean` | `true` = global store (any user); `false` = user-specific (requires authenticated user on server). |

### Outputs
- Returns a `String` value if the key exists.
- Returns `null` if the key does not exist in the namespace (server returns `false`, response `Value` is not set, Java returns `null`).
- Throws `ArrayOfEspExceptionWrapper` if ESP-level exceptions are present in the response.
- Returns `null` and logs errors on `RemoteException` or `EspSoapFault` (no re-throw).

### Side Effects
- Read-only; no state is modified.

---

## 2. Existing Test Coverage Analysis

The following tests in `WSStoreClientTest.java` call `fetchValue` directly:

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|--------------------|---------------|-------|
| `a3setEncryptedTest` | CFT | Fetch of an encrypted global value after setting with AES cipher | `storename`, `namespace`, key=`"global.encrypted.test"`, global=`true` | Return is non-null (encrypted string) | Primary purpose is `setValueEncrypted`; `fetchValue` is used to verify write |
| `a3setEncryptedCustomTest` | CFT | Fetch of a value encrypted with custom cipher (SHA1/AES) after setting | `storename`, `namespace`, key=`"global.encrypted.custom.test"`, global=`true` | Return is non-null | Primary purpose is custom encrypt; `fetchValue` used as read verification |
| `a3fetchInvalidKeyTest` | EHT | Fetch with a key that does not exist in the namespace | `storename`, `namespace`, key=`"invalid.global.test"`, global=`true` | Return is `null` | Only dedicated `fetchValue`-centric test in the file |
| `b4fetchEncodedKeyTest` | ECT | Fetch using a key name containing a special character (`@`) from encoded store | `defaultEncodedStoreName`, `defaultEncodedNS`, key=`"encod@ble"`, global=`true` | Return equals `"whatever"` | Tests URL-encoded key names |
| `b4setEncryptedTest` | CFT | Fetch of encrypted value in encoded-name store after setting | `defaultEncodedStoreName`, `defaultEncodedNS`, key=`"global.encrypted.test"`, global=`true` | Return is non-null | Primary purpose is encryption in encoded store; `fetchValue` read-back |
| `b4setEncryptedCustomTest` | CFT | Fetch of custom-cipher encrypted value in encoded store | `defaultEncodedStoreName`, `defaultEncodedNS`, key=`"global.encrypted.custom.test"`, global=`true` | Return is non-null | Same as above with custom cipher |
| `a5deleteValueTest` | CFT | Fetch a plain value before and after deletion (global and user-specific) | `storename`, `namespace`, key=`"testkey"`, global=`true`; key=`"user.testkey"`, global=`false` | Pre-delete returns `"testvalue"`; post-delete returns `null` | Covers plain value fetch (global=true) and user-specific fetch (global=false when auth available). Primary purpose is deleteValue. |

### Coverage Summary

- **Total existing test methods that exercise `fetchValue`:** 7
- **Core Functionality Tests covered:**
  - Fetch of an existing global value (plain string) — covered indirectly in `a5deleteValueTest`
  - Fetch of an encrypted global value — covered in `a3setEncryptedTest`, `a3setEncryptedCustomTest`, `b4setEncryptedTest`, `b4setEncryptedCustomTest`
  - Fetch of a user-specific value (`global=false`) — covered in `a5deleteValueTest` (when target authenticates)
- **Edge Case Tests covered:**
  - Fetch with special-character key name — covered in `b4fetchEncodedKeyTest`
  - Fetch with special-character store name and namespace — covered via encoded store tests
- **Error Handling Tests covered:**
  - Fetch with a non-existent key (returns null) — covered in `a3fetchInvalidKeyTest`

### Gaps Identified

1. **No dedicated basic-operation test** — There is no test whose primary purpose is verifying `fetchValue` returns the correct plain-text value for an existing key; it is only tested as a side effect in `a5deleteValueTest`.
2. **Empty storename (default store fallback)** — No test verifies that passing an empty/null storename causes the server to use its default store.
3. **Empty or null namespace** — No test verifies the server error when an empty namespace is provided.
4. **Empty or null key** — No test verifies the server error when an empty key is provided.
5. **Non-existent store** — No test verifies behavior when the requested store does not exist.
6. **Non-existent namespace** — No test verifies server exception thrown when namespace does not exist (distinct from non-existent key).
7. **Value with special characters** — No test verifies values containing XML/HTML special characters, whitespace, Unicode, or newlines are returned correctly.
8. **Very large value** — No test verifies retrieval of a value near the store's `MaxValueSize`.
9. **null/invalid connection** — No test verifies behavior with a null or unreachable connection.

---

## 3. Request Structure

The Java `fetchValue` method constructs a `FetchRequest` with the following fields:

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|---------------------|-------|
| `StoreName` | `string` | No (server uses default store if empty) | Name of the WsStore to query | Non-empty string; may contain URL-encodable characters | Server falls back to `m_defaultStore` if absent |
| `Namespace` | `string` | **Yes** | Namespace within the store | Non-empty string; server throws if empty | Server treats empty namespace as fatal error |
| `Key` | `string` | **Yes** | The key whose value to retrieve | Non-empty string; server throws if empty | Keys are URL-encoded internally (DALI tree path safe) |
| `UserSpecific` | `boolean` | No (default `false`) | Set to `true` to restrict to per-user data | `true`/`false` | Java parameter `global=true` maps to `UserSpecific=false` |

### Field Dependencies
- When `UserSpecific=true` (i.e., `global=false`), the server requires an authenticated user context. On an unauthenticated HPCC cluster, a non-global fetch will fail.

### Default Behavior for Optional Fields
- `StoreName` empty → server uses its configured default store.
- `UserSpecific` defaults to `false` (global query).

---

## 4. Server Behavior and Responses

### Request Processing Flow (`onFetch` → `CDALIKVStore::fetch`)

1. Extract `storename` from request; if empty, substitute `m_defaultStore`.
2. Encode the store name for safe DALI tree path.
3. If `!global && !user`: throw exception (user required for non-global access).
4. If `namespace` is empty: throw exception.
5. Connect to DALI KV store XPATH for the store.
6. If connection fails (store not found): throw exception.
7. Build XPATH for global or user subtree + namespace.
8. If namespace node does not exist in store tree: throw exception.
9. Encode key name; if key node does not exist: return `false`.
10. If key exists: set `value` in response buffer and return `true`.
11. If `success == true`: `resp.setValue(value)`.
12. If `success == false`: response `Value` is not set (serialized as nil/absent per `[nil_remove]` IDL annotation).

### Valid Response Scenarios

| Scenario | `Value` in Response | Java Return |
|----------|--------------------|-----------:|
| Key found | The stored string value | Non-null `String` |
| Key not found (namespace exists) | Not set (`nil_remove`) | `null` |

### Invalid/Error Response Scenarios

| Scenario | Server Behavior | Java Client Handling |
|----------|----------------|---------------------|
| Namespace is empty | `MakeStringException` thrown → `EspSoapFault` | Logged, returns `null` |
| Key is empty | `MakeStringException` thrown → `EspSoapFault` | Logged, returns `null` |
| Store not found (DALI connect fails) | `MakeStringException` thrown → `EspSoapFault` | Logged, returns `null` |
| Namespace does not exist in store | `MakeStringException` thrown → `EspSoapFault` | Logged, returns `null` |
| Non-global without authenticated user | `MakeStringException` thrown → `EspSoapFault` | Logged, returns `null` |
| ESP-level exceptions in response | `response.getExceptions() != null` | `ArrayOfEspExceptionWrapper` thrown |

---

## 5. Error Handling

### Server-Side Errors

| Error Condition | Server Action | Error Message (approximate) |
|-----------------|---------------|-----------------------------|
| Empty storename and no default configured | Exception | `"DALI Keystore fetch(): Store name not provided"` |
| Non-global fetch without authenticated user | Exception | `"DALI Keystore fetch(): Attempting to fetch non-global entry but requester name not provided"` |
| Empty namespace | Exception | `"DALI Keystore fetch: key not provided!"` *(misleading message — it is the namespace check)* |
| Empty key | Exception | `"DALI Keystore fetch: Key not provided!"` |
| Store doesn't exist (no DALI connection) | Exception | `"DALI Keystore fetch: Unable to connect to DALI KeyValue store path '%s'"` |
| Namespace node doesn't exist | Exception | `"DALI Keystore fetch: invalid namespace '%s' detected!"` |
| Key node doesn't exist (valid namespace) | Returns `false` | No exception — value not set in response |

### Client-Side Errors

| Error Condition | Client Behavior |
|-----------------|----------------|
| `RemoteException` during stub call | Logged; returns `null` (no re-throw) |
| `EspSoapFault` during stub call | Logged; returns `null` (no re-throw) |
| ESP exceptions in response | Throws `ArrayOfEspExceptionWrapper` |
| Stub not initialized (`verifyStub()` fails) | Throws `Exception` |

---

## 6. Existing Dataset Analysis

`fetchValue` is a key/value store operation — it does not read HPCC distributed datasets (logical files). The benchmark datasets (DFS files) are not applicable to this method.

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | HPCC DFS file dataset; WsStore is a separate key/value system |
| `~benchmark::string::100MB` | No | HPCC DFS file dataset; not applicable to WsStore |
| `~benchmark::integer::20KB` | No | HPCC DFS file dataset; not applicable to WsStore |
| `~benchmark::all_types::superfile` | No | HPCC DFS superfile; not applicable to WsStore |
| `~benchmark::integer::20kb::key` | No | HPCC DFS index; not applicable to WsStore |

Test data for `fetchValue` is generated by calling `setValue` in the test setup/preceding test steps.

---

## 7. Test Case Plan

> **Note:** All test cases below address gaps identified in Section 2. Tests already covered by existing methods are excluded. All test cases are integration tests against a live HPCC cluster (no mocks). All tests should be placed in `WSStoreClientTest.java` and must extend `BaseRemoteTest`. Tests should use the existing `storename` and `namespace` constants or set up their own transient store/namespace.

---

### A. Core Functionality Tests

---

#### CFT-001 — Basic Fetch of an Existing Plain-Text Value

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Verify that `fetchValue` returns the correct string value for an existing plain-text key (dedicated test, primary purpose). |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: `"fetchValueTest.basic"`, `global`: `true`. Pre-condition: call `setValue(storename, namespace, "fetchValueTest.basic", "hello-world", true)` in the test. |
| **Dataset** | N/A — data created via `setValue` within the test |
| **Expected Output** | `fetchValue(...)` returns `"hello-world"` |
| **Pass Criteria** | - Return value is not null<br>- Return value equals `"hello-world"`<br>- No exception thrown |
| **Notes** | Cleanup: call `deleteValue` at the end of the test. Dedicated CFT for read — distinct from `a5deleteValueTest` whose primary focus is deletion. |

---

#### CFT-002 — Fetch Reflects Updated Value After Re-Set

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflow |
| **Description** | Set a value, overwrite it with a new value, verify `fetchValue` returns the latest value. |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: `"fetchValueTest.overwrite"`, `global`: `true`. First set `"original"`, then set `"updated"`. |
| **Dataset** | N/A — data created via `setValue` within the test |
| **Expected Output** | After first set: `fetchValue` returns `"original"`. After second set: `fetchValue` returns `"updated"`. |
| **Pass Criteria** | - First fetch returns `"original"` (not null)<br>- Second fetch returns `"updated"` (not null)<br>- No exception thrown |
| **Notes** | Cleanup: `deleteValue` at end of test. Verifies WsStore last-write-wins semantics. |

---

### B. Edge Case Tests

---

#### ECT-001 — Fetch Value With Empty StoreName (Default Store Fallback)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Optional Parameters |
| **Description** | Verify that passing an empty `storename` causes the server to use its configured default store. |
| **Input Data** | `storename`: `""` (empty string), `namespace`: `defaultNS`, `key`: valid pre-existing key, `global`: `true`. Pre-condition: set a value in the default store namespace. |
| **Dataset** | N/A |
| **Expected Output** | Returns the expected value if the default store exists and contains the key; or returns null (or no exception from Java) if the default store is not configured. |
| **Pass Criteria** | - No exception is thrown from the Java client<br>- Result is either the expected value (default store found) or null (default store not configured) — test verifies the fallback behavior rather than asserting a specific value |
| **Notes** | Test should document current default store name (if any) from the HPCC cluster configuration. If no default store is configured, server throws — Java client returns null. |

---

#### ECT-002 — Fetch Value Containing Special Characters

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Verify that a value containing XML/HTML special characters, Unicode, and whitespace is returned correctly and without corruption. |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: `"fetchValueTest.specialchars"`, `global`: `true`. Value: `"Hello <World> & \"Copilot\" \u00e9\u00e0 \n\t"` |
| **Dataset** | N/A |
| **Expected Output** | `fetchValue` returns the exact string stored — `"Hello <World> & \"Copilot\" \u00e9\u00e0 \n\t"` |
| **Pass Criteria** | - Return is not null<br>- Return value equals the original string character-for-character<br>- No exception thrown |
| **Notes** | Tests encoding/decoding fidelity through the SOAP/Axis2 stack. Cleanup: `deleteValue`. |

---

#### ECT-003 — Fetch Value at Maximum Allowed Size

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Performance Limits / Boundary Values |
| **Description** | Verify that a value at the store's maximum allowed size (default `MaxValueSize=1024` bytes) is stored and retrieved correctly. |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: `"fetchValueTest.maxsize"`, `global`: `true`. Value: a string of exactly 1024 ASCII characters (e.g., `"A".repeat(1024)`). |
| **Dataset** | N/A |
| **Expected Output** | `fetchValue` returns the 1024-character string |
| **Pass Criteria** | - Return is not null<br>- Return value length equals 1024<br>- Return value equals the original string<br>- No exception thrown |
| **Notes** | The `MaxValueSize` is set at store creation time (default 1024 per IDL). Cleanup: `deleteValue`. |

---

### C. Error Handling Tests

---

#### EHT-001 — Fetch With Empty Namespace

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Missing Required Field |
| **Description** | Verify client behavior when `namespace` is an empty string. Server should throw a `MakeStringException`; Java client should catch it and return null without propagating. |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `""` (empty), `key`: `"anykey"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | `fetchValue` returns `null` (client catches `EspSoapFault` and logs) |
| **Pass Criteria** | - No `ArrayOfEspExceptionWrapper` thrown<br>- No unhandled exception propagates to the test<br>- Return value is `null` |
| **Notes** | The server error message says `"DALI Keystore fetch: key not provided!"` even for the namespace check — this is a known misleading server-side message. Test asserts graceful degradation. |

---

#### EHT-002 — Fetch With Empty Key

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Missing Required Field |
| **Description** | Verify client behavior when `key` is an empty string. Server throws `MakeStringException`; Java client should catch and return null. |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: `""` (empty), `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | `fetchValue` returns `null` |
| **Pass Criteria** | - No unhandled exception propagates<br>- Return value is `null` |
| **Notes** | Distinct from EHT-001 (empty namespace). Both are server-side required fields. |

---

#### EHT-003 — Fetch From Non-Existent Store

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Resource Not Found |
| **Description** | Verify client behavior when the specified store does not exist on the server. Server fails to connect to DALI path and throws; Java client should catch and return null. |
| **Input Data** | `storename`: `"NonExistentStore_XYZ_12345"`, `namespace`: `defaultNS`, `key`: `"somekey"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | `fetchValue` returns `null` (client catches `EspSoapFault`) |
| **Pass Criteria** | - No `ArrayOfEspExceptionWrapper` thrown<br>- No unhandled exception propagates<br>- Return value is `null` |
| **Notes** | Ensure the store name used is truly non-existent. |

---

#### EHT-004 — Fetch From Non-Existent Namespace

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Resource Not Found |
| **Description** | Verify client behavior when the store exists but the specified namespace does not. Server throws `"DALI Keystore fetch: invalid namespace '%s' detected!"`; Java client should catch and return null. |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `"NonExistentNamespace_XYZ_99999"`, `key`: `"somekey"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | `fetchValue` returns `null` |
| **Pass Criteria** | - No `ArrayOfEspExceptionWrapper` thrown<br>- No unhandled exception propagates<br>- Return value is `null` |
| **Notes** | Distinct from EHT-003 (store-level not-found) and from `a3fetchInvalidKeyTest` (namespace exists but key does not). |

---

#### EHT-005 — Fetch User-Specific Value on Unauthenticated Cluster

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-005 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Permission / Authorization |
| **Description** | Verify that calling `fetchValue` with `global=false` on an HPCC cluster that does not authenticate results in a graceful failure (null return or no exception). |
| **Input Data** | `storename`: `defaultStoreName`, `namespace`: `defaultNS`, `key`: `"user.test"`, `global`: `false` |
| **Dataset** | N/A |
| **Expected Output** | `fetchValue` returns `null` when cluster does not authenticate |
| **Pass Criteria** | - `Assume.assumeFalse(targetHPCCAuthenticates)` — skip if cluster does authenticate<br>- Return value is `null`<br>- No unhandled exception propagates |
| **Notes** | Uses existing `targetHPCCAuthenticates` flag pattern already in the test class. Complements the authenticated path in `a5deleteValueTest`. |

---

#### EHT-006 — Fetch With Null Connection (Stub Not Initialized)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-006 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors — Invalid Connection |
| **Description** | Verify that `fetchValue` throws or fails gracefully when the client is constructed with a null or unreachable connection. |
| **Input Data** | Create `HPCCWsStoreClient` with `Connection` pointing to an unreachable host (e.g., `"http://localhost:19999"`). Call `fetchValue(defaultStoreName, defaultNS, "anykey", true)`. |
| **Dataset** | N/A |
| **Expected Output** | Either an `Exception` is thrown (e.g., from `verifyStub()`), or `fetchValue` returns `null` after catching the communication error. |
| **Pass Criteria** | - No silent success (must not return a valid value)<br>- Client does not crash the JVM<br>- Exception or null returned as documented |
| **Notes** | Test must create a separate local client instance — do not use the shared `client` field. |

---

## 8. New Dataset Specifications

No new HPCC DFS datasets are required for these test cases. All test data is created programmatically using `setValue` calls within the tests themselves. Test cleanup should use `deleteValue` to remove keys after verification.

**Test Data Management Pattern:**

```java
// Setup
client.setValue(storename, namespace, "fetchValueTest.basic", "hello-world", true);

// Execute
String result = client.fetchValue(storename, namespace, "fetchValueTest.basic", true);

// Assert
Assert.assertNotNull(result);
Assert.assertEquals("hello-world", result);

// Cleanup
client.deleteValue(storename, namespace, "fetchValueTest.basic", true);
```

All new test methods should follow the alphabetical-ordering naming convention already established in `WSStoreClientTest.java` (e.g., `a4fetchBasicValueTest`, `a4fetchSpecialCharValueTest`) so they execute in logical sequence relative to the existing `a2setTest` / `a3*` / `a4deleteTest` group.


---
*Generated: 2026-02-24*

---

# WsStore — `fetchValueEncrypted` Test Case Analysis

**Generated:** 2026-02-24  
**Target Class:** `org.hpccsystems.ws.client.HPCCWsStoreClient`  
**Target Methods:**  
- `fetchValueEncrypted(String storename, String namespace, String key, boolean global, Cipher cipher)`  
- `fetchValueEncrypted(String storename, String namespace, String key, boolean global, String secretKey)`  
**Test File:** `wsclient/src/test/java/org/hpccsystems/ws/client/WSStoreClientTest.java`

---

## 1. Method Summary

`fetchValueEncrypted` provides a client-side convenience method for retrieving and decrypting a value that was previously stored in encrypted form via `setValueEncrypted`. It is a thin wrapper over `fetchValue` that adds a decryption step.

**Two overloads exist:**

### Overload A — Cipher-based
```java
public String fetchValueEncrypted(String storename, String namespace, String key,
        boolean global, Cipher cipher) throws Exception, ArrayOfEspExceptionWrapper
```
1. Calls `fetchValue(storename, namespace, key, global)` to retrieve the raw (encrypted) string from the server.
2. If the value is non-null and non-empty, calls `CryptoHelper.decrypt(value, cipher)` and returns the plaintext.
3. If the value is null or empty, throws `Exception("Could not fetch value")`.

### Overload B — SecretKey-based (convenience wrapper)
```java
public String fetchValueEncrypted(String storename, String namespace, String key,
        boolean global, String secretKey) throws Exception, ArrayOfEspExceptionWrapper
```
Delegates to Overload A, creating a default cipher from `secretKey` using `CryptoHelper.createDefaultCipher(secretKey, false)` (SHA-512/AES key derivation). This is compatible with values stored by `setValueEncrypted(…, String secretKey)`.

> ⚠️ **Known Bug in Overload B**: The current implementation contains a parameter-ordering mistake:
> ```java
> return fetchValueEncrypted(storename, namespace, secretKey, global,
>         CryptoHelper.createDefaultCipher(secretKey, false));
> ```
> The variable `secretKey` is passed as the `key` argument and the actual `key` argument is silently dropped. Any test exercising this overload will fetch using `secretKey` as the lookup key, not the intended key.

**Role within the service:** Encryption and decryption are entirely client-side. The server stores the encrypted ciphertext as a regular string value; the server has no knowledge of the encryption. `fetchValueEncrypted` makes the client responsible for holding the correct cipher/key.

**Inputs:** `storename`, `namespace`, `key` (identifies the stored entry), `global` (`true` = globally visible, `false` = user-specific), and either a `Cipher` object or a `String` secret key.

**Outputs:** The plaintext (decrypted) string, or an exception if the key is missing or decryption fails.

**Side effects:** None beyond a read operation on the server.

---

## 2. Existing Test Coverage Analysis

The following tests in `WSStoreClientTest.java` call `fetchValueEncrypted`:

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| `a3setEncryptedTest` | CFT — Basic Operation | Fetch and decrypt a globally-scoped value using a default AES/SHA-512 Cipher object, from the default (non-encoded) store | `storename = "WsClientTestStore"`, `namespace = "Junittests"`, `key = "global.encrypted.test"`, `global = true`, `cipher = aesDecryptCipher` (AES, SHA-512 key) | Result non-null; matches result of a separate local `CryptoHelper.decrypt()` call | Depends on a preceding `setValueEncrypted` call in the same test; uses Cipher overload (A) |
| `a3setEncryptedCustomTest` | CFT — Custom Cipher | Fetch and decrypt a globally-scoped value using a custom SHA-1/AES Cipher object, from the default store | `storename = "WsClientTestStore"`, `namespace = "Junittests"`, `key = "global.encrypted.custom.test"`, `global = true`, `cipher = somedecryptcipher` (AES, SHA-1 key) | Result non-null; matches result of a separate local `CryptoHelper.decrypt()` call | Uses `DigestAlgorithmType.SHA1`; verifies alternative key-derivation works; uses Cipher overload (A) |
| `b4setEncryptedTest` | CFT — URL-Encoded Names | Fetch and decrypt a globally-scoped value using a default AES/SHA-512 Cipher object, from a URL-encoded store name/namespace | `storename = "WsCli@ntT_estStore"`, `namespace = "Junit_t@ests"`, `key = "global.encrypted.test"`, `global = true`, `cipher = aesDecryptCipher` | Result non-null; matches locally decrypted value | Verifies URL-encoded store/namespace names are handled correctly; uses Cipher overload (A) |
| `b4setEncryptedCustomTest` | CFT — Custom Cipher + URL-Encoded Names | Fetch and decrypt a globally-scoped value using a custom SHA-1/AES Cipher, from a URL-encoded store name/namespace | `storename = "WsCli@ntT_estStore"`, `namespace = "Junit_t@ests"`, `key = "global.encrypted.custom.test"`, `global = true`, `cipher = somedecryptcipher` (AES, SHA-1 key) | Result non-null; matches locally decrypted value | Uses Cipher overload (A) with URL-encoded names |

**Coverage Summary:**

- **Total existing test methods exercising `fetchValueEncrypted`:** 4
- **Core Functionality Tests covered:** 4
  - Default AES cipher, global scope, default store (×2 regular + encoded)
  - Custom SHA-1 AES cipher, global scope, default store (×2 regular + encoded)
- **Edge Case Tests covered:** 0
- **Error Handling Tests covered:** 0
- **Gaps identified:**
  1. `fetchValueEncrypted` with `String secretKey` overload (Overload B) is **never exercised** by a `@Test` method (only a dead-code helper at line 144–146); the underlying bug in Overload B (wrong argument order) is also untested.
  2. User-specific (`global = false`) fetch after a user-specific `setValueEncrypted` — only conditionally set in `a3setEncryptedTest`, never fetched with `fetchValueEncrypted`.
  3. Fetching a key that does not exist (or was never set encrypted) → expecting `Exception("Could not fetch value")`.
  4. Fetching with a mismatched (wrong) Cipher/key → decryption should fail or produce garbage.
  5. Fetching with a `null` Cipher passed to Overload A.
  6. Fetching with a `null` or empty `storename`, `namespace`, or `key`.
  7. Fetching a key that holds an empty string value (edge case for null/empty check).
  8. Fetching via a null / invalid connection.
  9. Verifying decrypted value content is equal to the original plaintext (not just non-null).

---

## 3. Request Structure

`fetchValueEncrypted` itself has no dedicated server-side request — it reuses the underlying `Fetch` web-service call via `fetchValue`. The server-side request is `FetchRequest`:

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|----------------------|-------|
| `StoreName` | `String` | No (falls back to default store if empty) | Name of the key-value store | Non-empty string; may contain URL-encodable chars | Mapped from `storename` parameter |
| `Namespace` | `String` | Yes (in practice) | Logical grouping within the store | Non-empty string; may contain URL-encodable chars | Mapped from `namespace` parameter |
| `Key` | `String` | Yes | Identifier for the stored entry | Non-empty string | Mapped from `key` parameter |
| `UserSpecific` | `bool` | No (defaults to `false`) | If `true`, the key is private to the authenticated user | `true` / `false` | Mapped from `!global`; if HPCC has no auth, user-specific keys may behave like global |

**Additional client-side parameters (not transmitted to the server):**

| Parameter | Type | Required | Description |
|-----------|------|----------|-------------|
| `cipher` | `javax.crypto.Cipher` | Yes (Overload A) | Initialized decrypt-mode cipher; must match the cipher used at store time |
| `secretKey` | `String` | Yes (Overload B) | Raw secret key string; `CryptoHelper.createDefaultCipher` derives an AES key via SHA-512 |

**Field dependencies:**
- `UserSpecific = true` requires the target HPCC cluster to authenticate users; on an unauthenticated cluster, user-specific data may not be stored/retrieved correctly.
- The `cipher` / `secretKey` must exactly correspond to what was used during `setValueEncrypted`, otherwise the decryption step produces garbled output or throws.

---

## 4. Server Behavior and Responses

The server-side handler (`CwsstoreEx::onFetch`) performs:

1. Resolves `storename` — falls back to the configured default store if `storename` is empty/null.
2. Determines the effective user from the ESP context (`context.queryUserId()`).
3. Calls the store provider's `fetch(storename, namespace, key, value, secuser, isGlobal)`.
4. If successful, sets `resp.setValue(value)` and returns `true`.
5. If the key is not found, the value buffer is empty; `resp.setValue()` is not called, so `FetchResponse.getValue()` returns `null`.

**Encryption is entirely client-side.** The server stores and returns the ciphertext string as-is; it has no awareness that the value is encrypted.

**Valid response types:**

| Response Scenario | `FetchResponse.getValue()` | Client behavior |
|-------------------|---------------------------|-----------------|
| Key found, value stored | Non-null, non-empty encrypted string | Decrypted and returned |
| Key not found | `null` | `fetchValueEncrypted` throws `Exception("Could not fetch value")` |
| Key found but value is empty string | `""` | `fetchValueEncrypted` throws `Exception("Could not fetch value")` (empty string guard) |
| ESP exception (auth failure, store not found) | N/A | `ArrayOfEspExceptionWrapper` thrown by `handleEspExceptions` |
| Network/SOAP error | N/A | `RemoteException` or `EspSoapFault` caught and logged; `fetchValue` returns `null`, then `fetchValueEncrypted` throws `Exception("Could not fetch value")` |

---

## 5. Error Handling

### Server-Side Errors
| Error Condition | Server Action | Client Behavior |
|-----------------|---------------|-----------------|
| `StoreName` is empty and no default store configured | Fetch fails | `fetchValue` returns `null` → `Exception("Could not fetch value")` |
| `Namespace` or `Key` is missing / not found | Value not populated in response | `fetchValue` returns `null` → `Exception("Could not fetch value")` |
| User not authenticated but `UserSpecific = true` | Server may use empty user context | Value may be fetched/not found depending on server config |
| Authorization failure (WsStoreAccess:READ) | ESP exception | `ArrayOfEspExceptionWrapper` thrown |
| Internal store provider failure | `onFetch` returns `false` | `fetchValue` returns `null` → `Exception("Could not fetch value")` |

### Client-Side Errors
| Error Condition | Client Behavior |
|-----------------|-----------------|
| `cipher` is `null` (Overload A) | `CryptoHelper.decrypt` throws `NullPointerException` or similar |
| `secretKey` is `null` or empty (Overload B) | `CryptoHelper.createDefaultCipher(null, false)` throws `Exception` |
| Cipher is in encrypt mode instead of decrypt mode | `CryptoHelper.decrypt` throws `javax.crypto.IllegalBlockSizeException` or `BadPaddingException` |
| Cipher key mismatch (different key from what was used to encrypt) | `CryptoHelper.decrypt` throws `BadPaddingException` / returns garbled data |
| `storename`, `namespace`, or `key` is `null` | `fetchValue` propagates `NullPointerException` or server returns no value |
| Null / invalid connection | `stub` is null or `RemoteException` thrown; `fetchValue` returns `null` → `Exception("Could not fetch value")` |
| Overload B bug: wrong `key` used | Fetches using `secretKey` string as the lookup key, not the intended `key` | Method returns wrong value or throws |

---

## 6. Existing Dataset Analysis

`fetchValueEncrypted` operates on key-value pairs stored in the WsStore service, not on HPCC file datasets. The benchmark file datasets (HPCC distributed files) are not relevant to this method.

| Dataset Name | Applicable? | Reason |
|--------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | This method reads from WsStore key-value pairs, not HPCC file datasets |
| `~benchmark::string::100MB` | No | Same reason — WsStore is a key-value service, not a file system service |
| `~benchmark::integer::20KB` | No | Same reason |
| `~benchmark::all_types::superfile` | No | Same reason |
| `~benchmark::integer::20kb::key` | No | Same reason |

All test data for this method must be created via `setValueEncrypted` or `setValue` calls in the test setup phase itself.

---

## 7. Test Case Plan

> **Reminder**: Test cases CFT-001 through CFT-004 (covered by existing tests `a3setEncryptedTest`, `a3setEncryptedCustomTest`, `b4setEncryptedTest`, `b4setEncryptedCustomTest`) are **excluded** from this plan as they are already covered.

---

### A. Core Functionality Tests

---

#### CFT-001 — SecretKey String Overload: Fetch and Decrypt Global Value

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Verify that `fetchValueEncrypted(storename, namespace, key, global=true, secretKey)` (Overload B) successfully decrypts and returns a value that was stored with `setValueEncrypted(storename, namespace, key, value, global=true, secretKey)` |
| **Input Data** | `storename`: `"WsClientTestStore"`, `namespace`: `"Junittests"`, `key`: `"fve.secretkey.global.test"`, `global`: `true`, `secretKey`: random 12-byte UTF-8 string. Prior setup: call `setValueEncrypted(storename, namespace, key, "plaintextsecret", true, secretKey)` |
| **Dataset** | N/A — WsStore key-value data created in test setup |
| **Expected Output** | Returned string equals `"plaintextsecret"` |
| **Pass Criteria** | - No exception thrown<br>- Returned value is not null<br>- Returned value equals the original plaintext `"plaintextsecret"` |
| **Notes** | This is the primary test for Overload B. If the known bug (secretKey passed as key argument) is present, the test will fail or throw `Exception("Could not fetch value")` because the lookup key will be the secretKey string, not `"fve.secretkey.global.test"`. This test will therefore also serve as a regression/bug-detection test. |

---

#### CFT-002 — Cipher Overload: Fetch and Decrypt User-Specific Value

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflow |
| **Description** | Verify that a user-specific (`global = false`) encrypted value set via `setValueEncrypted` can be correctly fetched and decrypted with `fetchValueEncrypted` using the same Cipher |
| **Input Data** | `storename`: `"WsClientTestStore"`, `namespace`: `"Junittests"`, `key`: `"fve.user.encrypted.test"`, `global`: `false`, `cipher`: AES/SHA-512 decrypt cipher. Prior setup: call `setValueEncrypted(storename, namespace, key, "usersecret", false, aesEncryptCipher)` |
| **Dataset** | N/A — WsStore key-value data created in test setup |
| **Expected Output** | Returned string equals `"usersecret"` |
| **Pass Criteria** | - No exception thrown<br>- Returned value is not null<br>- Returned value equals `"usersecret"`<br>- Value is only accessible to the authenticated user (non-global) |
| **Notes** | Only runs when `targetHPCCAuthenticates` is `true`; wrap with `Assume.assumeTrue(targetHPCCAuthenticates)`. Uses Cipher overload (A). |

---

#### CFT-003 — Verify Decrypted Value Content Matches Original Plaintext

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Verify that the value returned by `fetchValueEncrypted` exactly matches the original plaintext string (as an end-to-end correctness check for both set and fetch) using a variety of sensitive content strings |
| **Input Data** | Three iterations: `value1 = "simple"`, `value2 = "s3cr3t!@#$%^&*()"` (special chars), `value3 = "a very long sensitive value that has more than 64 characters of content inside it"` (long string). Each stored via `setValueEncrypted` with a fresh AES cipher and retrieved via `fetchValueEncrypted` with the corresponding decrypt cipher. |
| **Dataset** | N/A |
| **Expected Output** | Each decrypted value matches the original plaintext |
| **Pass Criteria** | - No exception thrown for any iteration<br>- `decryptedValue.equals(originalPlaintext)` for each value |
| **Notes** | Tests content integrity across different plaintext forms, including special characters and long strings. |

---

### B. Edge Case Tests

---

#### ECT-001 — Fetch After Setting Value with SecretKey Overload of `setValueEncrypted`, Then Decrypting with Equivalent Cipher

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Optional Parameters / Overload Compatibility |
| **Description** | Verify that a value stored via `setValueEncrypted(…, String secretKey)` (which uses `CryptoHelper.encryptSHA512AES`) can be correctly decrypted by `fetchValueEncrypted(…, Cipher cipher)` when the cipher is constructed with `CryptoHelper.createDefaultCipher(secretKey, false)` |
| **Input Data** | `storename`: `"WsClientTestStore"`, `namespace`: `"Junittests"`, `key`: `"fve.crossoverload.test"`, `global`: `true`, `secretKey`: random 12-byte string. Steps: (1) `setValueEncrypted(…, "crosstext", true, secretKey)`; (2) create `cipher = CryptoHelper.createDefaultCipher(secretKey, false)`; (3) call `fetchValueEncrypted(…, cipher)` |
| **Dataset** | N/A |
| **Expected Output** | Returned value equals `"crosstext"` |
| **Pass Criteria** | - No exception<br>- Value equals `"crosstext"` |
| **Notes** | Validates that the two encryption paths (`encryptSHA512AES` and `createDefaultCipher`) use identical key derivation and are interoperable. |

---

#### ECT-002 — Fetch with Empty String `storename` (Default Store Fallback)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values / Optional Parameters |
| **Description** | Verify behavior when an empty `storename` is provided; the server should fall back to the configured default store |
| **Input Data** | First store a value in the default store via `setValueEncrypted("", namespace, "fve.empty.store.test", "storetestvalue", true, cipher)`. Then call `fetchValueEncrypted("", namespace, "fve.empty.store.test", true, cipher)` |
| **Dataset** | N/A |
| **Expected Output** | If the server has a default store, value is returned and decrypted successfully; otherwise an exception is thrown |
| **Pass Criteria** | - If default store exists: no exception; returned value equals `"storetestvalue"`<br>- If no default store: an exception is thrown (either `ArrayOfEspExceptionWrapper` or `Exception`) |
| **Notes** | Server behavior: `if (!storename || !*storename) storename = m_defaultStore.get();`. Behavior depends on server configuration. |

---

#### ECT-003 — Fetch a Value Set as a Non-Encrypted Plain String via `fetchValueEncrypted`

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Verify that attempting to decrypt a value that was stored as plain (unencrypted) text results in a decryption failure exception rather than returning a garbled string silently |
| **Input Data** | Store a plain value via `setValue(storename, namespace, "fve.plaintext.test", "notencrypted", true)`. Then call `fetchValueEncrypted(storename, namespace, "fve.plaintext.test", true, aesDecryptCipher)` |
| **Dataset** | N/A |
| **Expected Output** | An exception is thrown (e.g., `javax.crypto.IllegalBlockSizeException` or `javax.crypto.BadPaddingException` from the `CryptoHelper.decrypt` call) |
| **Pass Criteria** | - An exception is thrown<br>- The method does NOT silently return garbled data |
| **Notes** | Validates that the method's error propagation for cryptographic errors works as expected. |

---

### C. Error Handling Tests

---

#### EHT-001 — Fetch Non-Existent Key → `Exception("Could not fetch value")`

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors / Resource Not Found |
| **Description** | Verify that calling `fetchValueEncrypted` for a key that has never been stored throws an `Exception` with the message `"Could not fetch value"` |
| **Input Data** | `storename`: `"WsClientTestStore"`, `namespace`: `"Junittests"`, `key`: `"fve.nonexistent.key.xyz123"`, `global`: `true`, valid decrypt cipher |
| **Dataset** | N/A |
| **Expected Output** | `Exception` with message `"Could not fetch value"` |
| **Pass Criteria** | - `Exception` is thrown<br>- Exception message contains `"Could not fetch value"` |
| **Notes** | The server returns `null` (or no value) for a missing key; `fetchValueEncrypted` checks `if (value != null && !value.isEmpty())` and throws if false. |

---

#### EHT-002 — Fetch with Wrong Cipher (Key Mismatch)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs / Client-Side Errors |
| **Description** | Verify that using the wrong Cipher (different key from the one used to encrypt) causes a decryption exception to propagate to the caller |
| **Input Data** | Store a value with `encryptCipher` using `secretKey1`. Retrieve it with a `decryptCipher` created from a different `secretKey2`. Both ciphers are valid AES/SHA-512 ciphers, just with different keys. |
| **Dataset** | N/A |
| **Expected Output** | An exception is thrown (typically `javax.crypto.BadPaddingException` wrapped in a general `Exception`) |
| **Pass Criteria** | - An exception is thrown<br>- Method does NOT return a value |
| **Notes** | Tests that the AES-ECB decryption detects the key mismatch. Note: AES in ECB mode may not always throw on key mismatch (it returns garbled data); document actual behavior. If no exception is thrown, a separate assertion that the result doesn't equal the original plaintext is acceptable. |

---

#### EHT-003 — Fetch with `null` Cipher (Overload A)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Verify that passing `null` as the `Cipher` argument to `fetchValueEncrypted` (Overload A) causes an appropriate exception |
| **Input Data** | Store a value normally with `setValueEncrypted`. Then call `fetchValueEncrypted(storename, namespace, key, true, (Cipher) null)` |
| **Dataset** | N/A |
| **Expected Output** | An exception is thrown (either `NullPointerException` from `CryptoHelper.decrypt` or an `Exception` from the method itself) |
| **Pass Criteria** | - An exception is thrown<br>- Method does NOT return a value |
| **Notes** | Tests null-safety of the cipher parameter. |

---

#### EHT-004 — Fetch with `null` or Empty `key`

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Verify that passing `null` or an empty string as the `key` argument results in an exception rather than a silent failure |
| **Input Data** | Call `fetchValueEncrypted(storename, namespace, null, true, cipher)` and separately `fetchValueEncrypted(storename, namespace, "", true, cipher)` |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown (either `Exception("Could not fetch value")` because the server returns nothing for a null/empty key, or an earlier validation exception) |
| **Pass Criteria** | - An exception is thrown for each null/empty key input |
| **Notes** | The server does not appear to validate an empty key; it will simply find no matching entry, so `fetchValue` returns `null`, and `fetchValueEncrypted` throws `Exception("Could not fetch value")`. |

---

#### EHT-005 — Fetch with `null` `storename`

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-005 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Verify behavior when `storename` is `null`; expected to either fall back to the default store or throw an exception |
| **Input Data** | Call `fetchValueEncrypted(null, namespace, "somekey", true, cipher)` |
| **Dataset** | N/A |
| **Expected Output** | Either the server falls back to a default store and returns a value (if the key exists there), or an exception is thrown |
| **Pass Criteria** | - If default store exists and key is present: value is returned<br>- If no default store: `Exception` is thrown |
| **Notes** | Server behavior: `if (!storename || !*storename) storename = m_defaultStore.get()`. A Java `null` string is serialized as empty/absent in the SOAP request. |

---

#### EHT-006 — Fetch with `null` `namespace`

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-006 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Verify behavior when `namespace` is `null` |
| **Input Data** | Call `fetchValueEncrypted(storename, null, "somekey", true, cipher)` |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown (server returns no value for a null namespace, or ESP error thrown) |
| **Pass Criteria** | - An exception is thrown |
| **Notes** | A null namespace will result in a null `FetchRequest.namespace`, which the server processes as an empty namespace lookup. The key will not be found, so `fetchValueEncrypted` throws. |

---

#### EHT-007 — SecretKey Overload Bug Confirmation / Regression Test

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-007 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors / Invalid Inputs |
| **Description** | Confirm the known parameter-order bug in `fetchValueEncrypted(…, String secretKey)` Overload B: the implementation currently passes `secretKey` as the `key` argument instead of the actual `key`. This test should fail until the bug is fixed, serving as a regression guard. |
| **Input Data** | `storename`: `"WsClientTestStore"`, `namespace`: `"Junittests"`, `key`: `"fve.bug.test.key"`, `secretKey`: `"mysecret"`, `global`: `true`. First call `setValueEncrypted(storename, namespace, "fve.bug.test.key", "secret_data", true, "mysecret")`. |
| **Dataset** | N/A |
| **Expected Output** | **After bug fix:** returns `"secret_data"`. **With current buggy code:** throws `Exception("Could not fetch value")` because the lookup key is `"mysecret"` (the secretKey string), not `"fve.bug.test.key"`. |
| **Pass Criteria** | Returned value equals `"secret_data"` (this verifies the bug is fixed) |
| **Notes** | Reference: `HPCCWsStoreClient.java` line 445: `return fetchValueEncrypted(storename, namespace, secretKey, global, ...)` should be `return fetchValueEncrypted(storename, namespace, key, global, ...)`. Mark with `@Ignore` or note as `expectedToFail` until the bug is fixed. |

---

## 8. New Dataset Specifications

No new HPCC file datasets are required for any of these test cases. All test data is created dynamically within the tests using `setValueEncrypted` or `setValue` calls to populate WsStore key-value pairs before the fetch-and-decrypt assertions are made.

Test setup / teardown pattern (consistent with existing tests in `WSStoreClientTest.java`):

```java
// Setup — store an encrypted value before fetching
Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);
Assert.assertTrue(client.setValueEncrypted(storename, namespace, key, plaintext, global, encryptCipher));

// Teardown — delete the test key (use existing deleteValue support if available)
// ... or rely on the a4deleteTest / b5deleteTest ordering
```


---
*Generated: 2026-02-24*

---

# WsStore.listNSKeys — Test Case Analysis

**Generated:** 2026-02-24  
**Method:** `HPCCWsStoreClient.listNSKeys`  
**ESP Service Method:** `WsStore.ListKeys`  
**Test File:** `WSStoreClientTest.java`

---

## 1. Method Summary

### Purpose

`listNSKeys` retrieves all key names stored within a specified namespace of a named HPCC key/value store. It returns the list as a `String[]` array of decoded key names.

### Role Within Service

This method is part of the WsStore key/value store service, which provides lightweight persistent or session-scoped storage within an HPCC Systems cluster. `listNSKeys` is used to enumerate the keys available in a given namespace, which enables callers to discover what data is available before fetching or deleting individual entries.

### Inputs

| Parameter   | Type      | Description                                                                                     |
|-------------|-----------|--------------------------------------------------------------------------------------------------|
| `storename` | `String`  | Name of the target store. If `null` or empty, the server falls back to the configured default store. |
| `namespace` | `String`  | The namespace within the store. Must be non-null and non-empty; server throws if missing.       |
| `global`    | `boolean` | When `true`, fetches globally-scoped keys (`UserSpecific=false`). When `false`, fetches keys belonging to the authenticated user (`UserSpecific=true`). |

### Outputs

- Returns `String[]` array of key names (possibly empty array), or `null` if a `RemoteException` or `EspSoapFault` is caught.
- Response also echoes back `StoreName` and `Namespace` for reference (not surfaced by the Java method).

### Side Effects

- No data is created or modified.
- Logs errors to the logger on `RemoteException` or `EspSoapFault`.
- Throws `ArrayOfEspExceptionWrapper` if the server returns ESP-level exceptions (e.g., validation failures).
- Throws checked `Exception` for stub verification failure.

---

## 2. Existing Test Coverage Analysis

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| `a6listNSKeysTest` | CFT | Basic global scope listing after setting known keys | `storename=WsClientTestStore`, `namespace=Junittests`, `global=true`; pre-populates key1/key2/key3 | Response not null, length ≥ 3, all three known keys present | Only global scope tested; namespace pre-populated by the same test |

### Coverage Summary

- **Total existing test methods for `listNSKeys`:** 1
- **Core Functionality Tests covered:** 1 — basic global listing with pre-seeded keys
- **Edge Case Tests covered:** 0
- **Error Handling Tests covered:** 0
- **Gaps identified:**
  1. User-specific (non-global) scope (`global=false`)
  2. Null/empty `storename` — server falls back to default store
  3. Empty `namespace` string — server should throw `MakeStringException`
  4. Non-existent store name — server throws or returns empty
  5. Non-existent namespace within a valid store — server throws `MakeStringException` ("invalid namespace detected")
  6. Namespace with zero keys (empty but valid namespace created via `setValue` then all keys deleted)
  7. Keys with special characters in names (encoded store/namespace scenarios using `@`, `_`, etc.)
  8. Response echoes back correct `StoreName` and `Namespace` (not currently validated)
  9. Invalid / null connection — client-side stub verification failure
  10. Large number of keys in namespace (performance/boundary)

---

## 3. Request Structure

### `ListKeysRequest` Fields

| Field Name     | Type      | Required | Description                                                                                          | Valid Range / Format                   | Notes                                                                                          |
|----------------|-----------|----------|------------------------------------------------------------------------------------------------------|----------------------------------------|------------------------------------------------------------------------------------------------|
| `StoreName`    | `string`  | No       | Name of the store to query                                                                           | Any non-empty string                   | If not provided (null or empty), the server uses the configured default store. If no default is configured and name is empty, the server throws "Store name not provided". |
| `Namespace`    | `string`  | Yes      | Namespace within the store whose keys should be listed                                               | Any non-empty string                   | Server throws `MakeStringException` with code -1 if empty or null.                            |
| `UserSpecific` | `boolean` | No       | When `true`, only keys for the authenticated user are returned; when `false`, global keys are returned | `true` / `false`; default is `false` | Java wrapper inverts logic: `UserSpecific = !global`                                           |

### Field Dependencies

- `UserSpecific=true` requires an authenticated user context (non-empty `userId` in the ESP context). If the user name is empty when `UserSpecific=true`, the server throws "Attempting to fetch non-global keys but requester name not provided".
- When `StoreName` is empty, the server substitutes `m_defaultStore`. If `m_defaultStore` is also empty, the request fails.

### Default Behavior for Optional Fields

- `StoreName`: falls back to server-configured default store when omitted.
- `UserSpecific`: defaults to `false` (global scope).

---

## 4. Server Behavior and Responses

### Processing Logic (`CwsstoreEx::onListKeys` in `ws_storeService.cpp`)

1. Reads `Namespace`, `StoreName`, and `UserSpecific` from the request.
2. If `StoreName` is empty, substitutes `m_defaultStore` (the configured default store).
3. Calls `m_storeProvider->fetchKeySet(keys, storename, ns, secuser, global)`.
4. `CDALIKVStore::fetchKeySet` logic:
   - Throws if `storename` is still empty.
   - Throws if `global=false` and the user name is empty.
   - Throws if `namespace` is empty or null.
   - Connects to DALI SDS path for the store; throws if connection fails.
   - Constructs xpath to `Global/<encodedNS>/*` (global) or `<encodedUser>/<encodedNS>/*` (user-specific).
   - Throws `MakeStringException(-1, "...invalid namespace '%s' detected!")` if the xpath matches no property tree node.
   - Iterates matching child elements, decodes names, and appends to `keyset`.
5. Sets `KeySet`, `Namespace`, and `StoreName` on the response.
6. Returns `true` (no ESP-level exceptions are set by this method under normal conditions; server-side C++ exceptions become SOAP faults).

### Valid Response Types

| Scenario | Response |
|----------|----------|
| Namespace exists with keys | `KeySet` contains all decoded key names |
| Namespace exists with no keys | `KeySet` is empty or null (no children in xpath) |
| Store not found | SOAP fault / exception thrown |
| Namespace not found | SOAP fault: "invalid namespace '%s' detected!" |

### Response Fields

| Field       | Description                                     |
|-------------|-------------------------------------------------|
| `StoreName` | Echoed back — the store name actually used      |
| `Namespace` | Echoed back — the namespace as provided         |
| `KeySet`    | Array of decoded key names; may be null/empty   |

---

## 5. Error Handling

### Server-Side Errors

| Error Condition | Mechanism | Error Message / Code |
|-----------------|-----------|----------------------|
| `StoreName` empty and no default store configured | `MakeStringException(-1, ...)` → SOAP Fault | "DALI Keystore fetchKeySet(): Store name not provided" |
| `UserSpecific=true` with empty user name | `MakeStringException(-1, ...)` → SOAP Fault | "DALI Keystore fetchKeySet(): Attempting to fetch non-global keys but requester name not provided" |
| `Namespace` empty or null | `MakeStringException(-1, ...)` → SOAP Fault | "DALI Keystore fetchKeySet: Namespace not provided!" |
| Store name not found in DALI | `MakeStringException(-1, ...)` → SOAP Fault | "DALI Keystore fetchKeySet: Unable to connect to DALI KeyValue store path '%s'" |
| Namespace does not exist in the store | `MakeStringException(-1, ...)` → SOAP Fault | "DALI Keystore fetchKeySet: invalid namespace '%s' detected!" |
| DALI offline / unreachable | `ensureAttachedToDali()` throws | Exception from dali layer |
| Insufficient permissions | ESP auth check (`WsStoreAccess:READ`) | HTTP 403 / SOAP fault |

### Client-Side Error Handling (Java)

| Error Condition | Java Behavior |
|-----------------|---------------|
| Server returns ESP exceptions | `handleEspExceptions(...)` → throws `ArrayOfEspExceptionWrapper` |
| `RemoteException` | Caught, logged; method returns `null` |
| `EspSoapFault` | Caught, logged; method returns `null` |
| Stub not initialized | `verifyStub()` throws `Exception` |
| Null connection passed to `get()` | `initWSStoreStub` will fail to create stub; `initErrMessage` set; `verifyStub()` will throw |

---

## 6. Existing Dataset Analysis

The `listNSKeys` method operates on the HPCC WsStore key/value store — not on DFS logical files or ECL datasets. Benchmark file datasets are not relevant.

| Dataset Name | Applicable? | Reason |
|---|---|---|
| `~benchmark::all_types::200KB` | No | WsStore is a key/value store service; it does not use DFS logical files |
| `~benchmark::string::100MB` | No | Not applicable to WsStore operations |
| `~benchmark::integer::20KB` | No | Not applicable to WsStore operations |
| `~benchmark::all_types::superfile` | No | Not applicable to WsStore operations |
| `~benchmark::integer::20kb::key` | No | Not applicable to WsStore operations |

All test cases use the live WsStore service. Test data (keys/values) is seeded programmatically using `HPCCWsStoreClient.setValue()` prior to listing.

---

## 7. Test Case Plan

> All test cases below address **gaps** identified in Section 2. The only existing test (`a6listNSKeysTest`) covers basic global listing — none of the following duplicate that scenario.

---

### A. Core Functionality Tests

---

#### CFT-001 — User-Specific (Non-Global) Scope

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | List keys stored under the authenticated user's scope (`global=false`) in the default store/namespace |
| **Input Data** | Pre-seed: `setValue(storename, namespace, "user.key1", "v1", false)`, `setValue(storename, namespace, "user.key2", "v2", false)` <br>Call: `listNSKeys(storename, namespace, false)` |
| **Dataset** | N/A — WsStore key/value seeded programmatically |
| **Expected Output** | `String[]` containing at least `"user.key1"` and `"user.key2"` |
| **Pass Criteria** | - Return value is not null<br>- Array length ≥ 2<br>- `"user.key1"` and `"user.key2"` are present in the result<br>- No exception thrown |
| **Notes** | Requires authenticated connection (`BaseRemoteTest.connection`). Assumed skip if `targetHPCCAuthenticates == false`. Keys set as user-specific must not appear in global listing (verify cross-contamination is absent). |

---

#### CFT-002 — Null StoreName Falls Back to Default Store

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Default Parameter Behavior |
| **Description** | When `storename` is `null`, the server falls back to the configured default store; the method should succeed if a default store exists |
| **Input Data** | Pre-seed: `setValue(null, namespace, "fallback.key", "fval", true)` if possible, or use the existing default store <br>Call: `listNSKeys(null, namespace, true)` |
| **Dataset** | N/A |
| **Expected Output** | Non-null `String[]`; `"fallback.key"` present (or at least the call succeeds without exception when the namespace has keys) |
| **Pass Criteria** | - No exception thrown<br>- Result is not null<br>- If a default store is configured and the namespace has keys, keys are returned |
| **Notes** | The default store name is server-configured. If no default store is set, the server throws "Store name not provided". Test should handle this gracefully with `Assume` or try/catch. |

---

#### CFT-003 — Empty String StoreName Falls Back to Default Store

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Default Parameter Behavior |
| **Description** | When `storename` is an empty string `""`, the server substitutes the default store — same fallback path as null |
| **Input Data** | Call: `listNSKeys("", namespace, true)` (namespace pre-seeded with at least one key) |
| **Dataset** | N/A |
| **Expected Output** | Non-null `String[]` if default store is configured; exception/null if no default store |
| **Pass Criteria** | - If default store configured: returns non-null array with known key<br>- If no default store: throws or returns null without crashing the JVM |
| **Notes** | Shares setup with CFT-002. These two together verify both null and empty string handling. |

---

#### CFT-004 — Keys with Special Characters in Names (Encoded Store/Namespace)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-004 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | List keys from a namespace whose name and store name contain special characters (`@`, `_`), exercising the ptree name encoding/decoding path |
| **Input Data** | Pre-seed via `encodedUserClient.setValue(defaultEncodedStoreName, defaultEncodedNS, "encod@ble", "v", true)` <br>Call: `encodedUserClient.listNSKeys(defaultEncodedStoreName, defaultEncodedNS, true)` |
| **Dataset** | N/A |
| **Expected Output** | `String[]` containing `"encod@ble"` (key name round-tripped through encode/decode) |
| **Pass Criteria** | - Return value not null<br>- `"encod@ble"` present in result array<br>- Key name is returned exactly as stored (not encoded) |
| **Notes** | Uses `encodedUserClient` and `defaultEncodedStoreName = "WsCli@ntT_estStore"`, `defaultEncodedNS = "Junit_t@ests"`. Should be skipped (`Assume.assumeNotNull(encodedUserClient)`) if encoded client is unavailable. |

---

#### CFT-005 — Global and User-Specific Keys Are Correctly Scoped (No Cross-Contamination)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-005 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflows |
| **Description** | Verify that a key set with `global=true` does not appear in the user-specific listing, and vice versa |
| **Input Data** | `setValue(storename, namespace, "scope.global", "gv", true)` and `setValue(storename, namespace, "scope.user", "uv", false)` <br>Call both: `listNSKeys(storename, namespace, true)` and `listNSKeys(storename, namespace, false)` |
| **Dataset** | N/A |
| **Expected Output** | Global listing contains `"scope.global"` but not `"scope.user"`. User-specific listing contains `"scope.user"` but not `"scope.global"`. |
| **Pass Criteria** | - Global result has `"scope.global"`, does not have `"scope.user"`<br>- User result has `"scope.user"`, does not have `"scope.global"` |
| **Notes** | Requires authenticated session. Skip if `targetHPCCAuthenticates == false`. |

---

### B. Edge Case Tests

---

#### ECT-001 — Namespace With No Keys (Empty Namespace)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | List keys from a namespace that has been created (via `setValue` then all values deleted) but currently has no keys |
| **Input Data** | 1. `setValue(storename, "EmptyNS_test", "tempkey", "v", true)` <br> 2. `deleteValue(storename, "EmptyNS_test", "tempkey", true)` <br> 3. `listNSKeys(storename, "EmptyNS_test", true)` |
| **Dataset** | N/A |
| **Expected Output** | `null` or empty `String[]` (0 elements) — server returns no `KeySet` children when namespace is empty |
| **Pass Criteria** | - No exception thrown<br>- Result is either null or has length 0 |
| **Notes** | After deleting all keys, the namespace node itself may be removed from the property tree. If so, the server will throw "invalid namespace detected", which should also be considered acceptable behavior. Document whichever is observed. |

---

#### ECT-002 — Large Number of Keys in Namespace

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Performance Limits |
| **Description** | Seed a large number of keys (50+) into a namespace and verify all are returned |
| **Input Data** | Loop: `setValue(storename, "BulkNS_test", "bulkkey_" + i, "v" + i, true)` for i in 0..49 <br>Call: `listNSKeys(storename, "BulkNS_test", true)` |
| **Dataset** | N/A |
| **Expected Output** | `String[]` of length 50, containing all keys `"bulkkey_0"` through `"bulkkey_49"` |
| **Pass Criteria** | - No exception thrown<br>- Result length == 50<br>- All expected key names are present |
| **Notes** | Cleanup: delete namespace `"BulkNS_test"` after test using `deleteNamespace`. |

---

#### ECT-003 — Keys With Dot-Notation Names

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Verify that keys using dot-notation (common in existing tests, e.g. `"files.rowperpage.default"`) are correctly returned by `listNSKeys` |
| **Input Data** | Pre-seed: `setValue(storename, namespace, "files.rowperpage.default", "50", true)` <br>Call: `listNSKeys(storename, namespace, true)` |
| **Dataset** | N/A |
| **Expected Output** | Result array contains `"files.rowperpage.default"` exactly |
| **Pass Criteria** | - No exception thrown<br>- `"files.rowperpage.default"` found in result |
| **Notes** | Dot-notation keys are already used elsewhere in the test class; this specifically validates them through the list path. |

---

### C. Error Handling Tests

---

#### EHT-001 — Empty Namespace String

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Missing Required Field |
| **Description** | Calling `listNSKeys` with an empty string `""` as the namespace should result in a server-side exception ("Namespace not provided!") |
| **Input Data** | `listNSKeys(storename, "", true)` |
| **Dataset** | N/A |
| **Expected Output** | Either: `ArrayOfEspExceptionWrapper` thrown, OR method returns `null` (if the SOAP fault is caught internally) |
| **Pass Criteria** | - No unhandled runtime exception or JVM crash<br>- Either `ArrayOfEspExceptionWrapper` is thrown OR return value is `null`<br>- If `ArrayOfEspExceptionWrapper` thrown, message contains "Namespace" |
| **Notes** | Server throws `MakeStringException(-1, "DALI Keystore fetchKeySet: Namespace not provided!")`. This becomes an `EspSoapFault`, which the client catches and logs, returning `null`. |

---

#### EHT-002 — Null Namespace

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Null Value |
| **Description** | Calling `listNSKeys` with `null` as the namespace |
| **Input Data** | `listNSKeys(storename, null, true)` |
| **Dataset** | N/A |
| **Expected Output** | `null` returned or `ArrayOfEspExceptionWrapper` thrown |
| **Pass Criteria** | - No `NullPointerException` from client code<br>- Method returns `null` or throws `ArrayOfEspExceptionWrapper` |
| **Notes** | Server-side treats null namespace as empty, which triggers "Namespace not provided!" fault. |

---

#### EHT-003 — Non-Existent Store Name

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Resource Not Found |
| **Description** | Calling `listNSKeys` with a store name that does not exist on the server |
| **Input Data** | `listNSKeys("NonExistentStore_" + System.currentTimeMillis(), namespace, true)` |
| **Dataset** | N/A |
| **Expected Output** | `null` returned (SOAP fault caught internally) or `ArrayOfEspExceptionWrapper` thrown |
| **Pass Criteria** | - No unhandled exception<br>- Method returns `null` or throws `ArrayOfEspExceptionWrapper`<br>- Message references the store or DALI path |
| **Notes** | Server throws "Unable to connect to DALI KeyValue store path" when store not found in DALI. |

---

#### EHT-004 — Non-Existent Namespace in Valid Store

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Resource Not Found |
| **Description** | Calling `listNSKeys` with a namespace that does not exist within an existing, valid store |
| **Input Data** | `listNSKeys(storename, "namespace_does_not_exist_" + System.currentTimeMillis(), true)` |
| **Dataset** | N/A |
| **Expected Output** | `null` returned or `ArrayOfEspExceptionWrapper` thrown with message containing "invalid namespace" |
| **Pass Criteria** | - No unhandled exception<br>- Method returns `null` or throws `ArrayOfEspExceptionWrapper` |
| **Notes** | Server throws `MakeStringException(-1, "DALI Keystore fetchKeySet: invalid namespace '%s' detected!")` when the xpath does not match. |

---

#### EHT-005 — Invalid Connection (Uninitialized Client)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-005 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors — Invalid Connection |
| **Description** | Calling `listNSKeys` on a client whose stub failed to initialize (bad host/port) should throw an exception from `verifyStub()` |
| **Input Data** | Create `HPCCWsStoreClient.get("http", "invalid.host.invalid", "9999", "user", "pass")`, then call `listNSKeys(storename, namespace, true)` |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown from `verifyStub()` |
| **Pass Criteria** | - `Exception` is thrown<br>- Exception message references the connection or stub initialization failure |
| **Notes** | `verifyStub()` is called at the start of `listNSKeys`; it will throw if `stub` is null (which happens when `AxisFault` was caught in `initWSStoreStub`). |

---

#### EHT-006 — User-Specific Listing on Unauthenticated Connection

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-006 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Authorization |
| **Description** | Calling `listNSKeys` with `global=false` (user-specific) on a connection where the server does not authenticate; the context user will be empty, triggering "requester name not provided" |
| **Input Data** | Use a connection with no credentials (if `targetHPCCAuthenticates == false`): `listNSKeys(storename, namespace, false)` |
| **Dataset** | N/A |
| **Expected Output** | `null` returned or `ArrayOfEspExceptionWrapper` thrown |
| **Pass Criteria** | - No unhandled exception<br>- Method returns `null` or throws `ArrayOfEspExceptionWrapper` |
| **Notes** | Only applicable when `targetHPCCAuthenticates == false`. Skip using `Assume.assumeFalse(targetHPCCAuthenticates)`. |

---

## 8. New Dataset Specifications

No new ECL datasets are required for any test case in this analysis. All test data is created programmatically using `HPCCWsStoreClient.setValue()` against the live WsStore service, and cleaned up using `deleteValue()` or `deleteNamespace()` as appropriate.

---

## Summary

| Category | Test ID | Description |
|----------|---------|-------------|
| CFT | CFT-001 | User-specific (non-global) scope listing |
| CFT | CFT-002 | Null storename falls back to default store |
| CFT | CFT-003 | Empty string storename falls back to default store |
| CFT | CFT-004 | Keys with special characters (encoded store/namespace) |
| CFT | CFT-005 | Global and user-specific scopes are isolated |
| ECT | ECT-001 | Namespace with no keys (boundary) |
| ECT | ECT-002 | Large number of keys (50+) |
| ECT | ECT-003 | Keys with dot-notation names |
| EHT | EHT-001 | Empty namespace string → server error |
| EHT | EHT-002 | Null namespace → server error |
| EHT | EHT-003 | Non-existent store name → server error |
| EHT | EHT-004 | Non-existent namespace in valid store → server error |
| EHT | EHT-005 | Invalid connection / uninitialized stub → client error |
| EHT | EHT-006 | User-specific listing on unauthenticated connection |

**Total new test cases: 14** (0 duplicating the existing `a6listNSKeysTest`)


---
*Generated: 2026-02-24*

---

# WsStore `listNamespaces` Method — Test Case Analysis

**Generated:** 2026-02-24  
**Service:** `WsStore`  
**Java Client:** `HPCCWsStoreClient`  
**Test File:** `WSStoreClientTest.java`

---

## 1. Method Summary

### Purpose
`listNamespaces` retrieves all namespaces that exist within a named key-value store. A namespace is a logical grouping of key-value pairs within a store. This method returns an array of namespace name strings.

### Role Within the Service
This is a read-only discovery method used to enumerate namespaces in a store before performing namespace-level operations (e.g., `listNSKeys`, `fetchAllNSKeys`, `setValue`, `deleteNamespace`). It is a prerequisite step in many workflows that need to iterate over all namespaces within a store.

### Inputs
| Parameter | Java Type | Required | Description |
|-----------|-----------|----------|-------------|
| `storename` | `String` | Recommended | Name of the target store. If null/empty, the server falls back to the configured default store. |
| `global` | `boolean` | Yes | When `true`, retrieves global (all-user) namespaces (`UserSpecific=false`). When `false`, retrieves namespaces specific to the authenticated user (`UserSpecific=true`). |

### Outputs
Returns `String[]` — an array of namespace name strings. Returns `null` if the response contains no namespaces element (server returns empty/no namespaces). Returns `null` on `RemoteException` or `EspSoapFault` (errors are logged, not re-thrown).

### Side Effects
None — this is a read-only operation. No store state is created, modified, or deleted.

### Version / Auth Requirement
Requires `WsStoreAccess:READ` permission (from IDL: `[auth_feature("WsStoreAccess:READ")]`).

---

## 2. Existing Test Coverage Analysis

### Existing Tests for `listNamespaces`

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| `listNamespaces` | CFT – Basic Operation | Global namespaces listing (`global=true`) against the default test store | `storename=storename` (system property defaulting to `"WsClientTestStore"`), `global=true` | Result not null; iterates all namespaces, calls `listNamespaceKeys` and `fetchAllNSKeys` for each | Asserts not null; actual namespace count not verified |
| `listNamespaces` | CFT – Authenticated User | User-specific namespaces listing (`global=false`) when target HPCC authenticates | `storename=storename`, `global=false` | Result not null; iterates all per-user namespaces | Only executed if `targetHPCCAuthenticates == true`; skipped silently otherwise |

### Coverage Summary
- **Total existing test methods:** 1 (the `listNamespaces` test covers 2 scenarios in one method)
- **Core Functionality Tests covered:** 2
  - Global namespaces listing
  - User-specific namespaces listing (conditional on authentication)
- **Edge Case Tests covered:** 0
- **Error Handling Tests covered:** 0

### Gaps Identified
The following scenarios are **NOT** covered by existing tests:
1. Listing namespaces for a **non-existent store name** — expected behavior not verified
2. Listing namespaces with an **empty/null store name** — relies on server default store fallback, not explicitly tested
3. Listing namespaces when the store **contains no namespaces** — null/empty array return value handling
4. Listing namespaces with an **invalid connection** (null stub / disconnected) — exception propagation not tested
5. Verifying **namespace count and exact names** after known namespaces have been created — no assertion on specific namespace values
6. Listing namespaces after **multiple namespaces** have been seeded with data — validates completeness of returned list
7. **User-specific namespaces isolation** — verify a user's namespaces do NOT appear in global listing and vice versa
8. Listing namespaces on a store with **encoded/special characters** in the store name (the test suite has an encoded store `WsCli@ntT_estStore` but `listNamespaces` is not called against it)

---

## 3. Request Structure

### ListNamespacesRequest Fields

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|---------------------|-------|
| `StoreName` | `string` | No | Name of the store to query namespaces from | Non-empty string; must match an existing store name | If empty/null, server uses configured default store. If no default exists, behavior is undefined. |
| `UserSpecific` | `bool` | No | Whether to return only namespaces for the requesting user | `true` or `false`; default = `false` | In Java: `request.setUserSpecific(!global)` — Java `global=true` maps to `UserSpecific=false` (fetch all). Java `global=false` maps to `UserSpecific=true` (fetch user-specific only). |

### Field Dependencies
- When `UserSpecific=true`, the server uses the authenticated user identity from the request context (`context.queryUserId()`). Unauthenticated requests with `UserSpecific=true` may return an empty namespace list or behave unexpectedly.
- `StoreName` is logically required — an empty store name relies on the server's default store configuration, which may not be present in all deployments.

### Default Behavior
- `UserSpecific` defaults to `false` (server-side), meaning global namespaces are returned by default.
- Empty `StoreName` triggers default store fallback on the server (`m_defaultStore`).

---

## 4. Server Behavior and Responses

### Server-Side Logic (`onListNamespaces` in `ws_storeService.cpp`)
1. Retrieves the authenticated user identity from the request context.
2. Creates a `CSecureUser` from the context user ID.
3. Reads `StoreName` from the request.
4. If `StoreName` is empty/null AND a default store is configured (`m_defaultStore`), uses the default store name.
5. Calls `m_storeProvider->fetchAllNamespaces(namespaces, storename, secuser.get(), !req.getUserSpecific())` — note the inversion: passes `!UserSpecific` as the `global` parameter to the provider.
6. Sets the `Namespaces` array and `StoreName` on the response.
7. Returns `true` (no explicit error conditions — errors in the store provider would be uncaught at this level).

### Valid Responses

| Scenario | Response Content | Notes |
|----------|-----------------|-------|
| Namespaces exist in store | `Namespaces` array with one or more namespace strings, `StoreName` echoed back | Normal case |
| Store exists but has no namespaces | `Namespaces` null or empty array, `StoreName` echoed back | Java client returns `null` (no null guard on empty array) |
| Empty `StoreName` + default store configured | `Namespaces` from default store, `StoreName` = default store name | Transparent fallback |

### Invalid / Error Responses

| Scenario | Server Behavior | Java Client Behavior |
|----------|----------------|---------------------|
| Store does not exist | Store provider may return empty/null namespaces or throw | Java returns `null` or logs error |
| Empty `StoreName` + no default store | Provider called with empty storename; behavior is implementation-defined | Likely `null` returned |
| `RemoteException` | Network/communication failure | Caught, logged, returns `null` |
| `EspSoapFault` | SOAP-level fault from the server | Caught, logged, returns `null` |
| ESP exceptions in response | `handleEspExceptions` throws `ArrayOfEspExceptionWrapper` | Caller must handle this checked exception |

---

## 5. Error Handling

### Server-Side Errors
| Error Type | Trigger Condition | Server Response | Notes |
|------------|------------------|-----------------|-------|
| No matching store | Store name not found in provider | Empty namespace list (no ESP exception thrown at this layer) | Server does not throw an explicit error for unknown stores |
| Store provider failure | Internal store engine error | May propagate as uncaught exception → SOAP fault | Depends on store provider implementation |
| Auth failure | `WsStoreAccess:READ` permission denied | ESP exception in response | Handled by `handleEspExceptions` |

### Client-Side Errors
| Error Type | Trigger Condition | Client Behavior | Notes |
|------------|------------------|----------------|-------|
| `ArrayOfEspExceptionWrapper` | Server returns ESP exceptions | Re-thrown to caller via `handleEspExceptions` | Caller must declare `throws ArrayOfEspExceptionWrapper` |
| `RemoteException` | Network issue, connection refused | Caught, logged at ERROR level, returns `null` | Error is swallowed; caller cannot distinguish from empty result |
| `EspSoapFault` | SOAP fault from server | Caught, logged at ERROR level, returns `null` | Same swallowing behavior as RemoteException |
| `NullPointerException` (stub not initialized) | `verifyStub()` not called (indirect) | `verifyStub()` is NOT called in `listNamespaces` | Unlike some other methods, this method does not call `verifyStub()` |
| Null return vs empty array | Server returns no namespaces | Returns `null`, not empty array | Callers must null-check before iterating |

---

## 6. Existing Dataset Analysis

The `listNamespaces` method operates on the WsStore key-value store system, not on HPCC logical file datasets (DFS). It does not read from or operate on file-based datasets. Therefore, the standard benchmark datasets are not applicable to this method's test cases.

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | WsStore operates on key-value namespaces, not DFS files |
| `~benchmark::string::100MB` | No | WsStore operates on key-value namespaces, not DFS files |
| `~benchmark::integer::20KB` | No | WsStore operates on key-value namespaces, not DFS files |
| `~benchmark::all_types::superfile` | No | WsStore operates on key-value namespaces, not DFS files |
| `~benchmark::integer::20kb::key` | No | WsStore operates on key-value namespaces, not DFS files |

Test data for `listNamespaces` is created by:
- Pre-creating stores using `createStore()`
- Pre-seeding namespaces using `setValue()` (which implicitly creates a namespace when a key-value pair is stored in it)

---

## 7. Test Case Plan

> Only test cases for scenarios **NOT** covered by existing tests are defined below.
> The existing `listNamespaces()` test covers: global namespace listing and (conditionally) user-specific namespace listing.

---

### A. Core Functionality Tests

---

#### CFT-001 — List Namespaces After Known Namespaces Are Created

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation — Verifying Completeness |
| **Description** | After seeding a store with a known set of namespaces (via `setValue`), verify that `listNamespaces` returns all expected namespace names with exact matching. |
| **Input Data** | `storename`: `"WsClientTestStore"`, `global`: `true`. Pre-condition: call `setValue(storename, "ns1", "key1", "val1", true)`, `setValue(storename, "ns2", "key2", "val2", true)`, `setValue(storename, "ns3", "key3", "val3", true)` to create 3 known namespaces. |
| **Dataset** | Not applicable — uses WsStore key-value operations |
| **Expected Output** | `String[]` containing at minimum `"ns1"`, `"ns2"`, `"ns3"` |
| **Pass Criteria** | - Return value is not null<br>- Array length ≥ 3<br>- `"ns1"`, `"ns2"`, `"ns3"` are all present in the returned array |
| **Notes** | This closes the gap where existing tests do not assert specific namespace values. The store must be created before this test (depends on `a1createStoreTest`). Clean up by deleting seeded namespaces after the test. |

---

#### CFT-002 — List Namespaces with Empty Store Name (Default Store Fallback)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Default Behavior — Omitted Optional Field |
| **Description** | Call `listNamespaces` with an empty string as the store name. The server should fall back to the configured default store and return namespaces from it. |
| **Input Data** | `storename`: `""` (empty string), `global`: `true` |
| **Dataset** | Not applicable |
| **Expected Output** | Either a non-null `String[]` (if default store has namespaces) or `null` (if default store is empty) — but no exception thrown |
| **Pass Criteria** | - No `ArrayOfEspExceptionWrapper` is thrown<br>- No `Exception` is thrown<br>- If default store exists, result may be null or a valid array — no crash |
| **Notes** | The server uses `m_defaultStore` as a fallback when `StoreName` is empty. In a standard HPCC test deployment, a default store ("HPCCStore" or similar) is typically configured. The test should simply verify graceful handling without an exception. |

---

#### CFT-003 — List Namespaces on Store with Encoded Characters in Store Name

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations — Special Characters in Store Name |
| **Description** | Call `listNamespaces` targeting the encoded-name store (`WsCli@ntT_estStore`), which is created in `b1createEncodedStoreTest`. Verify namespaces in that store are listed correctly. |
| **Input Data** | `storename`: `"WsCli@ntT_estStore"` (the `defaultEncodedStoreName` constant), `global`: `true`. Pre-condition: encoded store must be created and have at least one namespace seeded via `setValue`. |
| **Dataset** | Not applicable |
| **Expected Output** | `String[]` containing at least the namespace used in the encoded store tests (e.g., `"Junit_t@ests"`) |
| **Pass Criteria** | - Return value is not null<br>- Expected encoded namespace name is present in the result array |
| **Notes** | The existing test suite creates `WsCli@ntT_estStore` and `Junit_t@ests` namespace but never calls `listNamespaces` on it. This test should run after `b1createEncodedStoreTest` and `b3setEncodedTest`. |

---

### B. Edge Case Tests

---

#### ECT-001 — List Namespaces on Store With No Namespaces

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — Empty Store |
| **Description** | Create a brand new store with no key-value pairs set in it, then call `listNamespaces`. Verify that the method handles an empty/null result without throwing an exception. |
| **Input Data** | `storename`: `"WsClientEmptyStoreTest"` (a newly created store with no values set), `global`: `true` |
| **Dataset** | Not applicable |
| **Expected Output** | `null` (server returns no `Namespaces` element when the store is empty) |
| **Pass Criteria** | - No exception is thrown<br>- Return value is `null` (acceptable) or an empty array<br>- Test does not fail on null iteration |
| **Notes** | Setup: call `createStore("WsClientEmptyStoreTest", "Empty store for testing", "TEST")` before this test. Teardown: clean up the store if a delete store API exists, otherwise leave it. This test validates the null return contract documented in the client code. |

---

#### ECT-002 — User-Specific Namespaces Are Isolated From Global Namespaces

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Optional Parameters — UserSpecific Isolation |
| **Description** | Seed a global namespace and a user-specific namespace in the same store. Verify that `global=true` does not return the user-specific namespace, and `global=false` returns user-specific namespaces. |
| **Input Data** | `storename`: `"WsClientTestStore"`. Pre-conditions:<br>1. `setValue(storename, "globalNS", "gkey", "gval", true)` — creates a global namespace<br>2. `setValue(storename, "userNS", "ukey", "uval", false)` — creates a user-specific namespace |
| **Dataset** | Not applicable |
| **Expected Output** | `listNamespaces(storename, true)` returns `"globalNS"` but NOT `"userNS"`. `listNamespaces(storename, false)` returns `"userNS"`. |
| **Pass Criteria** | - Global listing does not contain `"userNS"`<br>- User-specific listing contains `"userNS"`<br>- If authentication is disabled, skip this test with `Assume.assumeTrue(targetHPCCAuthenticates)` |
| **Notes** | Requires `targetHPCCAuthenticates == true`. Use `Assume.assumeTrue(targetHPCCAuthenticates)` to skip gracefully on unauthenticated clusters. |

---

#### ECT-003 — List Namespaces Returns Multiple Distinct Namespace Names

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — Multiple Namespaces |
| **Description** | Seed a store with a larger set of namespaces (e.g., 10) and verify all are returned correctly, with no duplicates. |
| **Input Data** | `storename`: `"WsClientTestStore"`, `global`: `true`. Pre-condition: use a loop to call `setValue(storename, "ns_" + i, "key", "val", true)` for `i` in 1..10 |
| **Dataset** | Not applicable |
| **Expected Output** | `String[]` of length ≥ 10 containing all 10 namespace names `"ns_1"` through `"ns_10"` |
| **Pass Criteria** | - Return value is not null<br>- All 10 seeded namespace names are present<br>- No duplicate names in the result (convert to `Set`, compare size) |
| **Notes** | Use `Arrays.asList(nss)` and check `contains()` for each expected namespace name. Clean up all 10 namespaces after the test using `deleteNamespace`. |

---

### C. Error Handling Tests

---

#### EHT-001 — List Namespaces for Non-Existent Store Name

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side — Resource Not Found |
| **Description** | Call `listNamespaces` with a store name that does not exist. Verify the client handles the server response gracefully without crashing. |
| **Input Data** | `storename`: `"ThisStoreDefinitelyDoesNotExist_XYZ_12345"`, `global`: `true` |
| **Dataset** | Not applicable |
| **Expected Output** | `null` or empty `String[]` — no exception thrown |
| **Pass Criteria** | - No `ArrayOfEspExceptionWrapper` is thrown<br>- No unhandled `Exception` is thrown<br>- Return value is `null` or empty array (both acceptable) |
| **Notes** | The server does not currently throw an ESP exception for unknown store names; it simply returns empty namespaces. This test verifies graceful degradation. |

---

#### EHT-002 — List Namespaces With Null Store Name

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Null Parameter |
| **Description** | Call `listNamespaces` passing `null` as the store name. Verify that the client and server both handle `null` gracefully (no NullPointerException client-side; server falls back to default store or returns gracefully). |
| **Input Data** | `storename`: `null`, `global`: `true` |
| **Dataset** | Not applicable |
| **Expected Output** | Either `null` or a valid `String[]` — no exception thrown |
| **Pass Criteria** | - No `NullPointerException` thrown by the client<br>- No `ArrayOfEspExceptionWrapper` thrown<br>- Method returns without crashing (result may be null or valid namespaces from default store) |
| **Notes** | The Java client calls `request.setStoreName(storename)` with null directly. The Axis2 stub should serialize null as absent/empty. The server then applies default store fallback. |

---

#### EHT-003 — List Namespaces User-Specific Without Authentication

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side — Auth/Permission Issue |
| **Description** | On a cluster that does NOT authenticate, call `listNamespaces` with `global=false` (UserSpecific=true). Verify the method does not throw an exception and returns gracefully (likely returns empty namespaces since there is no authenticated user context). |
| **Input Data** | `storename`: `"WsClientTestStore"`, `global`: `false` |
| **Dataset** | Not applicable |
| **Expected Output** | `null` or empty `String[]` without throwing an exception |
| **Pass Criteria** | - Only execute this test when `targetHPCCAuthenticates == false` (`Assume.assumeFalse(targetHPCCAuthenticates)`)<br>- No exception thrown<br>- Result is `null` or empty array |
| **Notes** | This is the counterpart to the existing test which *skips* the user-specific case when auth is disabled. This test explicitly validates behavior in that unauthenticated scenario. |

---

#### EHT-004 — List Namespaces With Uninitialized/Null Client

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side — Invalid Connection |
| **Description** | Attempt to call `listNamespaces` on an `HPCCWsStoreClient` that was constructed with an invalid/unreachable host. Verify the method catches the connection error and returns gracefully. |
| **Input Data** | Create a client with `HPCCWsStoreClient.get("http", "invalid.host.that.does.not.exist", "8010", "user", "pass")`. Call `listNamespaces("WsClientTestStore", true)`. |
| **Dataset** | Not applicable |
| **Expected Output** | `null` — `RemoteException` is caught and logged internally |
| **Pass Criteria** | - No unhandled exception propagates to the caller<br>- Return value is `null`<br>- Test completes without hanging (connection timeout should be short — set timeout to ~3000ms) |
| **Notes** | Use the `get(protocol, host, port, user, pass, timeout)` factory method with a short timeout (e.g., 3000ms) to avoid test hanging. The `RemoteException` catch block in `listNamespaces` swallows the error and returns `null`. |

---

## 8. New Dataset Specifications

The `listNamespaces` method operates exclusively on WsStore key-value data. **No new file-based datasets are required** for any of the test cases defined above.

All test data is created programmatically using WsStore API calls (`createStore`, `setValue`) and cleaned up using (`deleteNamespace`, `deleteValue`) as part of test setup and teardown.

### Test Data Setup Summary

| Test ID | Setup Required | Cleanup Required |
|---------|---------------|-----------------|
| CFT-001 | `setValue` × 3 to create `ns1`, `ns2`, `ns3` | `deleteNamespace` × 3 |
| CFT-002 | None (relies on server default store) | None |
| CFT-003 | Depends on `b1createEncodedStoreTest` and `b3setEncodedTest` being ordered earlier | None (encoded store tests handle their own cleanup) |
| ECT-001 | `createStore("WsClientEmptyStoreTest", ...)` | Ideally delete store (if supported) |
| ECT-002 | `setValue` global + user-specific | `deleteNamespace` × 2 |
| ECT-003 | `setValue` × 10 to create `ns_1` through `ns_10` | `deleteNamespace` × 10 |
| EHT-001 | None | None |
| EHT-002 | None | None |
| EHT-003 | None (conditional on `!targetHPCCAuthenticates`) | None |
| EHT-004 | None (uses invalid host client) | None |


---
*Generated: 2026-02-24*

---

# WsStore `listStores` Method — Test Case Analysis

**Generated:** 2026-02-24  
**Service:** `WsStore`  
**Java Client:** `HPCCWsStoreClient`  
**Test File:** `WSStoreClientTest.java`

---

## 1. Method Summary

### Purpose
`listStores` retrieves a list of all key-value stores registered in the HPCC DALI-backed key-value store system. Each store entry includes metadata such as name, type, description, owner, creation time, maximum value size, and whether it is designated as the default store.

### Role Within the Service
This is a read-only discovery method. It allows callers to enumerate available stores prior to performing store-specific operations (e.g., `setValue`, `fetchValue`, `listNamespaces`). It is typically called to confirm a store exists or to build a UI listing of stores.

### Inputs
| Parameter | Java Type | Required | Description |
|-----------|-----------|----------|-------------|
| `nameFilter` | `String` | No | Wildcard filter on store name (defaults to `*` server-side if null/empty) |
| `typeFilter` | `String` | No | Wildcard filter on store type |
| `ownerFilter` | `String` | No | Wildcard filter on store owner (createUser) |

A no-argument convenience overload `listStores()` delegates to `listStores(null, null, null)`.

### Outputs
Returns `StoreInfoWrapper[]` — an array of store metadata objects. Returns an empty array (never `null`) when no stores match or when the server returns no stores.

### Side Effects
None — this is a read-only operation. It does not create, modify, or delete any server-side state.

### Version Requirement
Requires server API version ≥ 1.02 (`min_ver("1.02")`). Requires `WsStoreAccess:READ` permission.

---

## 2. Existing Test Coverage Analysis

### Existing Tests for `listStores`

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| `listStoresTest` | CFT | Basic operation — list all stores (no filter) | No filters (calls `listStores()` convenience method) | Response not null; test store `storename` found in list | Verifies at least the pre-created test store appears |
| `listStoresWithFilterTest` | CFT | Name filter applied; type filter applied separately | nameFilter=`storename`, then typeFilter=`"TEST"` | Name-filtered results contain/match filter; type-filtered results printed (no strict assertion on type field) | Weak assertion on type filter — only prints results, does not assert type field on returned stores |

### Coverage Summary
- **Total existing test methods:** 2
- **Core Functionality Tests covered:** 2 — basic no-filter listing; name and type filter
- **Edge Case Tests covered:** 0
- **Error Handling Tests covered:** 0
- **Gaps identified:**
  1. `ownerFilter` parameter is never tested
  2. No test combining multiple filters simultaneously (nameFilter + typeFilter, nameFilter + ownerFilter, all three)
  3. No wildcard pattern filter tests (e.g., partial name with `*`)
  4. No test verifying a filter that matches zero stores (empty result set)
  5. `listStoresWithFilterTest` does not strictly assert that returned stores match the `typeFilter` — only prints results
  6. No verification of `StoreInfoWrapper` field values (type, description, owner, createTime, maxValSize, isDefault)
  7. No test verifying the `isDefault` field is set correctly on the default store
  8. No test with null/empty string explicitly passed to the three-argument overload (distinct from the no-arg overload test)
  9. No error handling tests (invalid connection, unauthenticated access)
  10. No test confirming an empty array is returned (not null) when filters match nothing

---

## 3. Request Structure

### `ListStoresRequest` Fields

| Field Name | Java Setter | Type | Required | Description | Valid Range / Format | Notes |
|------------|-------------|------|----------|-------------|---------------------|-------|
| `NameFilter` | `setNameFilter(String)` | `string` | No | Wildcard filter on store name | Any string; supports `*` and `?` wildcards | Server defaults to `"*"` (match all) if null or empty |
| `TypeFilter` | `setTypeFilter(String)` | `string` | No | Wildcard filter on store type | Any string; supports `*` and `?` wildcards | Ignored if null or empty — all types returned |
| `OwnerFilter` | `setOwnerFilter(String)` | `string` | No | Wildcard filter on store owner (createUser) | Any string; supports `*` and `?` wildcards | Ignored if null or empty — all owners returned |

### Field Dependencies
- All three fields are independent and optional.
- Filters are applied as AND conditions server-side: a store must match all non-empty filters to be included.
- The Java client only sets a field on the request if the value is non-null AND non-empty (`!nameFilter.isEmpty()`).

### Default Behavior for Optional Fields
- If no fields are set, all stores visible to the authenticated user are returned.
- `nameFilter` on the server defaults to `"*"` (wildcard-match-all) when empty/null.
- `typeFilter` and `ownerFilter` are skipped entirely when empty/null.

---

## 4. Server Behavior and Responses

### Server-Side Processing (`CwsstoreEx::onListStores`)
1. Extracts the authenticated user context (`context.queryUserId()`).
2. Reads `NameFilter`, `OwnerFilter`, and `TypeFilter` from the request.
3. Delegates to `m_storeProvider->getStores(namefilter, ownerfilter, typefilter, secuser)`.
4. `CDALIKVStore::getStores` connects to the DALI SDS path and iterates all stores:
   - **Name filter**: Applied using `wildcardmatch(namefilter, name)`. Defaults to `"*"` if empty.
   - **Owner filter**: Applied using `wildcardmatch(ownerfilter, owner)` only if ownerfilter is non-empty.
   - **Type filter**: Applied using `wildcardmatch(typefilter, type)` only if typefilter is non-empty.
5. For each matching store, populates a `StoreInfo` with: `name`, `type`, `description`, `owner` (createUser), `createTime`, `maxValSize`, and `isDefault` (compared case-insensitively against server's configured default store name).
6. Returns populated `Stores` array in response.

### Valid Responses

| Scenario | Response |
|----------|----------|
| Stores exist and match filters | `Stores` array populated with `StoreInfo` entries |
| No stores match filters | `Stores` array is empty (or absent — client returns empty `StoreInfoWrapper[]`) |
| Server has no stores at all | `Stores` array is empty; client returns empty `StoreInfoWrapper[]` |

### Response Fields (`StoreInfoWrapper`)

| Field | Type | Source | Notes |
|-------|------|--------|-------|
| `name` | `String` | `@name` attribute | Store identifier |
| `type` | `String` | `@type` attribute | User-defined store type |
| `description` | `String` | `@description` attribute | Free-text description |
| `owner` | `String` | `@createUser` attribute | Username of the store creator |
| `createTime` | `String` | `@createTime` attribute | ISO-style timestamp of creation |
| `maxValSize` | `String` | `@maxValSize` attribute | Maximum value size in bytes (as string) |
| `isDefault` | `boolean` | Server config comparison | `true` if this store is the server-configured default |

---

## 5. Error Handling

### Server-Side Errors

| Condition | Behavior |
|-----------|----------|
| DALI connection failure | `MakeStringException(-1, "DALI Keystore fetch: Unable to connect to DALI KeyValue store path '%s'")` — propagated as SOAP fault |
| `WsStoreAccess:READ` permission denied | ESP framework rejects the request with an authorization error before reaching the method |
| API version < 1.02 | Method not available; returns SOAP fault or version mismatch error |

### Client-Side Errors

| Condition | Client Behavior |
|-----------|-----------------|
| `RemoteException` from Axis2 | Caught, logged via `log.error()`, returns empty `StoreInfoWrapper[]` |
| `EspSoapFault` | Caught, logged via `log.error()`, returns empty `StoreInfoWrapper[]` |
| ESP exceptions in response | Detected via `response.getExceptions() != null`; throws `ArrayOfEspExceptionWrapper` via `handleEspExceptions()` |
| Null connection / AxisFault during stub creation | Propagated as `Exception` to the caller |

**Important:** `RemoteException` and `EspSoapFault` are silently swallowed — the method returns an empty array rather than propagating the error. This means connection failures are indistinguishable from "zero stores found" at the return value level.

---

## 6. Existing Dataset Analysis

`listStores` is a metadata/administrative API. It operates on store definitions in DALI, not on HPCC logical files or datasets. Therefore, none of the benchmark file datasets are directly applicable to testing this method.

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | This method does not read HPCC file data; it queries store metadata from DALI |
| `~benchmark::string::100MB` | No | Same reason — not a file-based operation |
| `~benchmark::integer::20KB` | No | Same reason — not a file-based operation |
| `~benchmark::all_types::superfile` | No | Same reason — not a file-based operation |
| `~benchmark::integer::20kb::key` | No | Same reason — not a file-based operation |

Test setup relies on stores created via `client.createStore(...)` in `WSStoreClientTest` setup logic. No external dataset preparation is needed.

---

## 7. Test Case Plan

> Only test cases for **gaps identified in Section 2** are defined below. `listStoresTest` (basic list all) and `listStoresWithFilterTest` (name filter, type filter basic pass) already exist and are **not** duplicated here.

---

### A. Core Functionality Tests

---

#### CFT-001 — Owner Filter Applied

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Call `listStores` with `ownerFilter` set to the current test user; verify matching stores are returned and have the expected owner |
| **Input Data** | `nameFilter`: `null`, `typeFilter`: `null`, `ownerFilter`: current authenticated username (from `BaseRemoteTest`) |
| **Dataset** | N/A — uses DALI store metadata created by test setup |
| **Expected Output** | Non-null array; each returned `StoreInfoWrapper.getOwner()` matches (or contains) the ownerFilter value |
| **Pass Criteria** | - Response is not null<br>- All returned stores have owner equal to the filtered user<br>- No exceptions thrown |
| **Notes** | Depends on the test store being created by the test user. The test store created in `createStoreTest` is owned by the connection user. |

---

#### CFT-002 — All Three Filters Combined

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Complete Request |
| **Description** | Call `listStores` with all three filters set simultaneously to values that should match the test store |
| **Input Data** | `nameFilter`: `storename`, `typeFilter`: `"TEST"`, `ownerFilter`: current authenticated username |
| **Dataset** | N/A — DALI store metadata |
| **Expected Output** | Array containing the test store; store fields match all three filter criteria |
| **Pass Criteria** | - Response not null<br>- Test store found in results<br>- `store.getName()` matches storename<br>- `store.getType()` equals `"TEST"`<br>- `store.getOwner()` matches the test user<br>- No exceptions thrown |
| **Notes** | Tests the AND-semantics of multiple simultaneous filters |

---

#### CFT-003 — Verify StoreInfoWrapper Field Completeness

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Call `listStores()` and verify that the returned `StoreInfoWrapper` objects have all expected fields populated for the known test store |
| **Input Data** | No filters — `listStores()` |
| **Dataset** | N/A — DALI store metadata |
| **Expected Output** | Test store entry has non-null/non-empty `name`, `type`, `owner`, `createTime`; `maxValSize` is a parseable integer string |
| **Pass Criteria** | - `store.getName()` is not null or empty<br>- `store.getType()` is not null or empty<br>- `store.getOwner()` is not null or empty<br>- `store.getCreateTime()` is not null or empty<br>- `store.getMaxValSize()` is parseable as an integer > 0<br>- No exceptions thrown |
| **Notes** | Explicitly validates the field mapping in `StoreInfoWrapper` from the raw `StoreInfo` Axis2 object |

---

#### CFT-004 — Verify IsDefault Field

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-004 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Call `listStores()` and verify that at most one store has `isDefault = true`; if a default store is configured on the server, it should be flagged |
| **Input Data** | No filters — `listStores()` |
| **Dataset** | N/A — DALI store metadata |
| **Expected Output** | At most one store in the result has `isDefault == true` |
| **Pass Criteria** | - Count of stores where `getIsDefault() == true` is 0 or 1<br>- No exceptions thrown |
| **Notes** | The `isDefault` flag is set by server config comparison; test cluster may or may not have a default configured. This test validates the constraint is not violated. |

---

#### CFT-005 — Explicit Null/Empty Filters on Three-Argument Overload

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-005 |
| **Category** | Core Functionality |
| **Subcategory** | Basic Operation |
| **Description** | Call `listStores(null, null, null)` directly (three-argument overload) and verify identical results to the no-argument convenience method |
| **Input Data** | `nameFilter`: `null`, `typeFilter`: `null`, `ownerFilter`: `null` |
| **Dataset** | N/A — DALI store metadata |
| **Expected Output** | Same non-null result as `listStores()`; test store present |
| **Pass Criteria** | - Response not null<br>- Result array length ≥ result from `listStores()`<br>- Test store found in list<br>- No exceptions thrown |
| **Notes** | Distinguishes between the convenience overload and explicit null passing to the parametrized overload |

---

#### CFT-006 — Type Filter Strict Assertion

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-006 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Call `listStores(null, "TEST", null)` and verify that ALL returned stores have `type == "TEST"` (strict assertion) — the existing `listStoresWithFilterTest` only prints results without asserting |
| **Input Data** | `nameFilter`: `null`, `typeFilter`: `"TEST"`, `ownerFilter`: `null` |
| **Dataset** | N/A — DALI store metadata |
| **Expected Output** | All returned stores have `getType()` equal to `"TEST"` |
| **Pass Criteria** | - Response not null<br>- For each store: `store.getType()` equals `"TEST"` (or result is empty if no TEST stores exist)<br>- No exceptions thrown |
| **Notes** | Strengthens the weak assertion in the existing `listStoresWithFilterTest`. The test store created in setup has type `"TEST"`. |

---

### B. Edge Case Tests

---

#### ECT-001 — Filter With No Matching Stores (Empty Result)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Call `listStores` with a `nameFilter` that matches no existing stores; verify an empty array (not null) is returned |
| **Input Data** | `nameFilter`: `"NONEXISTENT_STORE_XYZZY_12345"`, `typeFilter`: `null`, `ownerFilter`: `null` |
| **Dataset** | N/A — DALI store metadata |
| **Expected Output** | Empty `StoreInfoWrapper[]` array (length 0) |
| **Pass Criteria** | - Response is not null<br>- `stores.length == 0`<br>- No exceptions thrown |
| **Notes** | Verifies the client correctly handles a valid but empty response (no NPE on null `Stores` in response) |

---

#### ECT-002 — Wildcard Pattern in NameFilter

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Call `listStores` with a wildcard pattern in the `nameFilter` (e.g., `"WsClient*"`) that should match the test store |
| **Input Data** | `nameFilter`: `"WsClient*"`, `typeFilter`: `null`, `ownerFilter`: `null` |
| **Dataset** | N/A — DALI store metadata |
| **Expected Output** | Array containing the test store (whose default name starts with `"WsClient"`) |
| **Pass Criteria** | - Response not null<br>- Test store found in results<br>- All returned store names start with `"WsClient"`<br>- No exceptions thrown |
| **Notes** | Server uses `wildcardmatch()` for filtering; verifies wildcard semantics are passed through correctly |

---

#### ECT-003 — Empty String Filters Behave Like Null Filters

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Call `listStores("", "", "")` and verify results are identical to calling `listStores()` — empty strings should be treated as "no filter" |
| **Input Data** | `nameFilter`: `""`, `typeFilter`: `""`, `ownerFilter`: `""` |
| **Dataset** | N/A — DALI store metadata |
| **Expected Output** | Same non-null result as `listStores()` |
| **Pass Criteria** | - Response not null<br>- Test store found in list<br>- Result count matches or exceeds result count from `listStores()`<br>- No exceptions thrown |
| **Notes** | The Java client checks `!nameFilter.isEmpty()` before setting the request field; empty strings are not sent to the server, making them equivalent to null |

---

#### ECT-004 — Owner Filter Wildcard Pattern

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-004 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Call `listStores` with a wildcard `ownerFilter` (e.g., partial username with `*`) to verify wildcard matching works for owner field |
| **Input Data** | `nameFilter`: `null`, `typeFilter`: `null`, `ownerFilter`: first 3 characters of the test username + `"*"` |
| **Dataset** | N/A — DALI store metadata |
| **Expected Output** | Array containing at least the test store (assuming the owner's name matches the wildcard) |
| **Pass Criteria** | - Response not null<br>- Test store owner starts with the prefix used in the wildcard<br>- No exceptions thrown |
| **Notes** | Requires knowing at least the first few characters of the test user's username |

---

#### ECT-005 — Type Filter With Non-Matching Owner Filter Combination

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-005 |
| **Category** | Edge Case |
| **Subcategory** | Optional Parameters |
| **Description** | Call `listStores` with a valid type filter but an owner filter that matches no user; verify no stores are returned |
| **Input Data** | `nameFilter`: `null`, `typeFilter`: `"TEST"`, `ownerFilter`: `"NONEXISTENT_USER_ZZZZ"` |
| **Dataset** | N/A — DALI store metadata |
| **Expected Output** | Empty `StoreInfoWrapper[]` array |
| **Pass Criteria** | - Response not null<br>- `stores.length == 0`<br>- No exceptions thrown |
| **Notes** | Tests AND-semantics: even with a valid typeFilter, non-matching ownerFilter excludes all stores |

---

### C. Error Handling Tests

---

#### EHT-001 — Invalid Connection Returns Empty Array

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Create an `HPCCWsStoreClient` with an invalid host/port and call `listStores()`; verify the method does not throw and returns an empty array |
| **Input Data** | Client created with `Connection` pointing to `http://invalid.host.example.com:8010`; no filters |
| **Dataset** | N/A |
| **Expected Output** | Empty `StoreInfoWrapper[]` returned (not null); no exception propagated to the caller |
| **Pass Criteria** | - No exception thrown by `listStores()`<br>- Return value is not null<br>- Return value is empty array |
| **Notes** | The method catches `RemoteException` and `EspSoapFault` internally and returns an empty array. Confirms silent failure behavior is intentional. |

---

#### EHT-002 — Unauthorized Access (Wrong Credentials)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Call `listStores()` using a client created with incorrect credentials on an authenticated cluster; verify appropriate error behavior |
| **Input Data** | Client created with connection using invalid username/password; no filters |
| **Dataset** | N/A |
| **Expected Output** | Either `ArrayOfEspExceptionWrapper` thrown (if ESP exceptions returned) or empty array (if caught as `EspSoapFault`) |
| **Pass Criteria** | - Either an `ArrayOfEspExceptionWrapper` or `Exception` is thrown, OR<br>- Method returns empty array<br>- No NullPointerException or unexpected runtime exception |
| **Notes** | Use `Assume.assumeTrue(targetHPCCAuthenticates)` to only run this on authenticated clusters. The test should verify the failure mode is graceful. |

---

#### EHT-003 — Null Client/Stub Not Initialized

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Attempt to call `listStores()` on a client instance where the underlying stub cannot be initialized (null connection string) |
| **Input Data** | `HPCCWsStoreClient.get(null)` or connection with null host |
| **Dataset** | N/A |
| **Expected Output** | `Exception` or `AxisFault` thrown during client construction or during method invocation |
| **Pass Criteria** | - An exception is thrown (not silently swallowed)<br>- Exception message is meaningful<br>- No unexpected NullPointerException in unexpected code paths |
| **Notes** | Tests the behavior of the client factory method with invalid input before the method is even called |

---

## 8. New Dataset Specifications

No new HPCC datasets are required for testing `listStores`. This method operates exclusively on DALI key-value store metadata, not on logical files or record sets.

**Test Data Requirements (DALI Stores):**

The following stores should exist in DALI before tests run (managed by `createStoreTest` or equivalent `@BeforeClass` setup):

| Store Name | Type | Description | Owner | Purpose |
|------------|------|-------------|-------|---------|
| `storename` (default: `WsClientTestStore`) | `TEST` | Store strictly for WsClient tests | Test user | Used by most `listStores` filter tests |

No ECL scripts or dataset generation is required for `listStores` testing.


---
*Generated: 2026-02-24*

---

# WsStore `ping` Method — Test Case Analysis

**Generated:** 2026-02-24  
**Service:** `HPCCWsStoreClient`  
**Method:** `ping()`  
**Test File:** `WSStoreClientTest.java`

---

## 1. Method Summary

### Purpose

`ping()` is a lightweight connectivity/health-check method that verifies whether the WsStore ESP service endpoint is reachable and responsive. It is the simplest method in the service — it carries no parameters and no meaningful payload in either direction.

### Role Within the Service

It serves as a "heartbeat" or liveness probe. Callers can use it to pre-validate connectivity before performing heavier operations, or to monitor service availability.

### Inputs

None — `WsstorePingRequest` is an empty SOAP envelope element (`<xsd:complexType><xsd:all/></xsd:complexType>`).

### Outputs

- **Return type:** `boolean`
  - `true` — the stub was initialized and the service responded without throwing an exception.
  - `false` — the stub was initialized but an exception occurred during the remote call (logged at ERROR level, not rethrown).

### Side Effects

- Logs a SOAP-level error if the remote call fails.
- Calls `verifyStub()` before executing — this **throws `Exception`** (not a return of `false`) if the internal Axis2 stub is `null` or was never initialized.

---

## 2. Existing Test Coverage Analysis

### Existing Tests Found

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|--------------------|---------------|-------|
| `ping()` (line 773, `WSStoreClientTest.java`) | CFT — Basic Operation | Successful ping against a live, reachable, correctly-authenticated HPCC cluster | No request fields; uses the default `client` created from `connString` / `hpccUser` / `hpccPass` system properties | `client.ping()` returns `true`; no exception escapes | Catches both `AxisFault` and `Exception` and calls `Assert.fail()` if either is thrown |

### Coverage Summary

- **Total existing test methods:** 1
- **Core Functionality Tests covered:** 1 — basic successful ping with a valid, live connection
- **Edge Case Tests covered:** 0
- **Error Handling Tests covered:** 0

### Gaps Identified

The following scenarios are **not** covered by the existing test:

1. **Stub not initialized** — `verifyStub()` throws `Exception` when the internal stub is `null`; the method therefore throws (not returns `false`). No test verifies this contract.
2. **Invalid host** — a client constructed with an unreachable/non-existent hostname; the `stub.ping()` call should throw (caught internally), making `ping()` return `false`.
3. **Bad port / wrong endpoint** — a client whose endpoint port is wrong (e.g., `9999`) so TCP connection is refused; expects `false` return.
4. **Wrong credentials** — a client with invalid username/password (if the service enforces authentication) should return `false` or throw an `AxisFault` (wrapped to `false`).
5. **Return value is `false` (not exception)** — no test verifies the `false`-return branch of `ping()`; existing test only verifies the `true` path.

---

## 3. Request Structure

`WsstorePingRequest` (WSDL: `wsstorePingRequest`) is an **empty** complex type.

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|----------------------|-------|
| *(none)* | — | — | The request carries no fields | — | Serialized as an empty XML element |

### Field Dependencies

None.

### Default Behavior for Optional Fields

Not applicable — there are no fields.

---

## 4. Server Behavior and Responses

### Server-Side Processing

The `Ping` operation is defined in the WsStore WSDL but is **not** declared as a named `ESPmethod` inside the `ws_store.ecm` IDL. It is a standard ESP infrastructure method automatically provided by the ESP framework for every service. The server simply returns an HTTP 200 with an empty `wsstorePingResponse` body when the service process is running and able to handle requests.

### Valid Responses

| Response | Meaning |
|----------|---------|
| HTTP 200, empty `wsstorePingResponse` body | Service is reachable and healthy; `ping()` returns `true` |

### Invalid / Error Responses

| Response | Cause | `ping()` Return Value |
|----------|-------|----------------------|
| TCP connection refused / timeout | Host unreachable, wrong port, firewall | `false` (exception caught internally) |
| HTTP 401 / 403 | Authentication/authorization failure (if enforced) | `false` (AxisFault caught) |
| HTTP 500 | Internal server error | `false` (exception caught) |
| Stub is `null` | Client not properly initialized | Throws `Exception` (propagated, **not** caught internally) |

---

## 5. Error Handling

### Server-Side Errors

| Error Condition | Expected Behavior |
|-----------------|-------------------|
| Service down / port closed | `ping()` returns `false` |
| Authentication required, wrong credentials | `ping()` returns `false` (AxisFault logged) |
| Internal server error (HTTP 500) | `ping()` returns `false` (exception logged) |

### Client-Side Errors

| Error Condition | Expected Behavior |
|-----------------|-------------------|
| `stub == null` (client not initialized) | `verifyStub()` throws `Exception` — propagates to caller |
| Malformed endpoint URL | `AxisFault` at SOAP dispatch time → caught → `false` |
| Network timeout | `RemoteException` or `AxisFault` caught → `false` |

**Important distinction:** The `verifyStub()` path (null stub) results in a **thrown exception**, not a `false` return. Tests must account for this difference.

---

## 6. Existing Dataset Analysis

The `ping` method carries no data payload in either direction. It does not reference any HPCC file, cluster, namespace, or key. **No dataset is required for any `ping` test case.**

| Dataset Name | Applicable? | Reason |
|--------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | `ping` does not read or write any file or dataset |
| `~benchmark::string::100MB` | No | Same reason |
| `~benchmark::integer::20KB` | No | Same reason |
| `~benchmark::all_types::superfile` | No | Same reason |
| `~benchmark::integer::20kb::key` | No | Same reason |

---

## 7. Test Case Plan

> Only test cases for **gaps** identified in Section 2 are defined below. The existing `ping()` test already covers the basic success scenario (`CFT-001` equivalent) and must **not** be duplicated.

---

### A. Core Functionality Tests

#### CFT-001 — *Already covered by existing `ping()` test. Do not duplicate.*

---

### B. Edge Case Tests

#### ECT-001

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Verify `ping()` returns `false` (does not throw) when the client is configured with a valid but unreachable host |
| **Input Data** | Construct `HPCCWsStoreClient` using a `Connection` pointing to a non-routable IP address (e.g., `http://10.255.255.1:8010`) with a very short connect timeout so the test does not hang |
| **Dataset** | N/A |
| **Expected Output** | `ping()` returns `false`; no exception propagates to the caller |
| **Pass Criteria** | - `ping()` returns `false` without throwing<br>- No `Exception` escapes the method |
| **Notes** | Set `connection.setConnectTimeoutMilli(500)` so the test completes quickly. Use `HPCCWsStoreClient.get(badConnection)` to obtain the client. This exercises the internal catch block that converts exceptions to `false`. |

---

#### ECT-002

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Verify `ping()` returns `false` when the host is reachable but the port is wrong (connection refused) |
| **Input Data** | Construct a `Connection` using the same valid host as the default test connection but with port `9999` (or another closed port); set a short connect timeout |
| **Dataset** | N/A |
| **Expected Output** | `ping()` returns `false`; no exception propagates |
| **Pass Criteria** | - `ping()` returns `false` without throwing<br>- No `Exception` escapes the method |
| **Notes** | Reuse `connString` host; replace port via `new Connection("http://<host>:9999")`. Relies on the internal `catch (Exception e)` block returning `false`. |

---

### C. Error Handling Tests

#### EHT-001

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors — null/invalid connection |
| **Description** | Verify that `ping()` throws `Exception` (propagated from `verifyStub()`) when called on a client whose internal stub is `null` |
| **Input Data** | Obtain an `HPCCWsStoreClient` instance that has a null stub — achievable via `HPCCWsStoreClient.get(null)` or by passing a `Connection` constructed with `null` URL so that the stub initialization fails |
| **Dataset** | N/A |
| **Expected Output** | `ping()` throws `Exception` with a message containing `"WS Client Stub not available"` |
| **Pass Criteria** | - An `Exception` is thrown<br>- Exception message contains `"WS Client Stub not available"` or equivalent null-stub indicator<br>- The thrown type is `Exception` (not merely a subclass suppressed internally) |
| **Notes** | `verifyStub()` is called **before** the try/catch in `ping()`. Because the exception is thrown outside the try block, it propagates to the caller. This is a critical contract distinction from the `false`-return path. |

---

#### EHT-002

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — authentication failure |
| **Description** | Verify `ping()` returns `false` when the service requires authentication and the client supplies wrong credentials |
| **Input Data** | Construct a `Connection` using the valid host/port from `connString` with deliberately invalid credentials: username `"invaliduser"`, password `"wrongpassword"` |
| **Dataset** | N/A |
| **Expected Output** | `ping()` returns `false` |
| **Pass Criteria** | - `ping()` returns `false`<br>- No exception propagates to the caller<br>- Test is skipped via `Assume.assumeTrue(targetHPCCAuthenticates)` if the target cluster does not enforce authentication |
| **Notes** | Use `Assume.assumeTrue(targetHPCCAuthenticates)` to skip on unauthenticated clusters (consistent with other authentication-dependent tests in the class). The `AxisFault` from the server should be caught and converted to `false`. |

---

## 8. New Dataset Specifications

**None required.** The `ping` method does not interact with any HPCC data files, clusters, namespaces, or keys. All test cases (ECT-001, ECT-002, EHT-001, EHT-002) operate purely at the connection/stub level and need no data pre-loaded on the server.


---
*Generated: 2026-02-24*

---

# WsStore `setValue` Method — Test Case Analysis

**Generated:** 2026-02-24  
**Target Class:** `HPCCWsStoreClient`  
**Target Method:** `setValue(String storename, String namespace, String key, String value, boolean global)`  
**Test File:** `WSStoreClientTest.java`

---

## 1. Method Summary

### Purpose
`setValue` stores a key-value pair in a named namespace within an HPCC WsStore store. It allows callers to persist string-typed data under a structured path of `storeName → namespace → key`, with optional per-user or global scope.

### Role Within the Service
This is the primary write operation in the WsStore service. It is the foundation for all data persistence in the key-value store. The encrypted variants (`setValueEncrypted`) are wrappers around this method.

### Inputs
| Parameter | Type | Description |
|-----------|------|-------------|
| `storename` | `String` | Name of the store to write to; if null/empty, the server uses the default store |
| `namespace` | `String` | Logical grouping within the store (required by server) |
| `key` | `String` | Key name within the namespace |
| `value` | `String` | String value to associate with the key |
| `global` | `boolean` | `true` = store globally (shared); `false` = store per-user (user-specific) |

### Outputs
- Returns `true` if the server reports success
- Returns `false` if a `RemoteException` or `EspSoapFault` is caught
- Throws `ArrayOfEspExceptionWrapper` if the server returns ESP-level exceptions
- Throws `Exception` for other unexpected conditions

### Side Effects
- Creates the key-value pair if it does not exist (with creation timestamp and creator metadata)
- Overwrites an existing key-value pair if it already exists (updating edit timestamp and editor metadata)
- All writes are committed to DALI

---

## 2. Existing Test Coverage Analysis

### Existing Tests That Call `setValue` Directly

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| `a2setTest` | CFT | Basic global key-value set | Multiple keys: `global.test=success`, `files.rowperpage.default=50`, `ecl.playground.sample.default=Java Simple`; global=true | `assertTrue(setValue(...))` | Also tests user-specific keys if auth is enabled |
| `a2setTest` | CFT | User-specific key-value set | `user.test=success`, `dp-thor_160-jim::tutorialperson-wuid=W20190710-114239`; global=false | `assertTrue(setValue(...))` | Skipped when target HPCC does not authenticate |
| `a2setTest` | CFT | Overwrite existing global key | Sets `global.test=success` twice | `assertTrue(setValue(...))` both times | Second call overwrites the first |
| `a4deleteTest` | CFT | Set as pre-condition for delete | `WsClient.global.test=success` (global), `WsClient.user.test=success` (user-specific) | `assertTrue(setValue(...))` | Used as setup; not validating set result independently |
| `a5deleteValueTest` | CFT | Round-trip: set then fetch | `testkey=testvalue` (global), `user.testkey=user.testvalue` (user-specific) | Set returns true; fetchValue returns exact value set | Verifies value is retrievable after set |
| `a6listNSKeysTest` | CFT | Set multiple keys for listing | `key1=value1`, `key2=value2`, `key3=value3` (global) | All three setValue calls return true | Used as setup for listNSKeys test |
| `b3setEncodedTest` | CFT | Set with encoded store/namespace names | Store `WsCli@ntT_estStore`, NS `Junit_t@ests`; keys including `encod@ble` with special chars | `assertTrue(setValue(...))` | Tests URL-encoded store names, namespaces, and keys with special characters |
| `b3setEncodedTest` | ECT | Key with special characters (`@`) | Key: `encod@ble`, value: `whatever` | `assertTrue(setValue(...))` | Covers special-character keys |
| `b3setEncodedTest` | ECT | Very short key | Key: `a`, value: `ddfa` | `assertTrue(setValue(...))` | Covers minimal-length key |

### Coverage Summary
- **Total existing test methods that call `setValue` directly:** 4 (`a2setTest`, `a4deleteTest`, `a5deleteValueTest`, `a6listNSKeysTest`, `b3setEncodedTest`)
- **Core Functionality Tests covered:**
  - Global key set (basic operation)
  - User-specific key set (requires auth)
  - Overwrite existing key
  - Round-trip set + fetch validation
  - Set multiple keys
  - Set with encoded/special-character store, namespace, key names
- **Edge Case Tests covered:**
  - Short key (single character)
  - Special characters in key (`@`)
  - Special characters in store/namespace names
- **Error Handling Tests covered:** None — no existing test explicitly tests invalid inputs, missing required fields, or server-side validation errors

### Gaps Identified
1. **EHT — Empty/null storename**: No test verifies behavior when `storename` is null or empty (server falls back to default store or throws)
2. **EHT — Empty/null namespace**: No test verifies the server-side exception when namespace is empty/null
3. **EHT — Empty/null key**: No test verifies behavior with an empty or null key
4. **ECT — Null value**: No test stores a null/empty string value
5. **ECT — Very large value**: No test stores a value that approaches or exceeds the store's `MaxValSize`
6. **ECT — Unicode/multi-byte value**: No test stores a Unicode string value
7. **ECT — Value with special characters**: No test stores a value containing XML/special characters that may require escaping
8. **CFT — Overwrite verification**: No test verifies the fetched value changes after an overwrite (round-trip overwrite)
9. **EHT — Invalid connection**: No test verifies graceful failure when the client is initialized with an invalid endpoint
10. **EHT — Unauthorized user-specific set**: No test verifies the error when a non-authenticated user attempts a user-specific set

---

## 3. Request Structure

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|---------------------|-------|
| `StoreName` | `string` | Optional | Name of the target store | Any non-empty string; special chars encoded via `encodePTreeName` | If empty, server uses configured default store; if no default, throws exception |
| `Namespace` | `string` | **Required** | Logical grouping of keys within the store | Any non-empty string; special chars encoded | Server throws if empty: `"DALI Keystore set(): namespace not provided"` |
| `Key` | `string` | **Required (implicit)** | Identifier for the value within the namespace | Any string; special chars encoded via `encodePTreeName` | If empty, behaviour is implementation-defined (DALI uses it as the XPath node name) |
| `Value` | `string` | Optional | The string value to store | Any string up to `MaxValSize` bytes | If `MaxValSize > 0` and value length exceeds it, server throws |
| `UserSpecific` | `boolean` | Optional | If `true`, stores under the current user's scope; if `false`, stores globally | `true` / `false` | Default is `false` (global). Java client inverts the `global` parameter: `setUserSpecific(!global)` |

### Field Dependencies
- When `UserSpecific=true`, the request context must include a valid authenticated user. If no user is present, the server throws: `"DALI Keystore set(): Attempting to set non-global entry but owner name not provided"`.
- When `StoreName` is empty, the server falls back to `m_defaultStore`. If neither is provided, the DALI store provider throws.

### Default Behavior for Optional Fields
- `StoreName`: defaults to the server-configured default store
- `UserSpecific`: defaults to `false` (global scope)
- `Value`: no default; empty string is a valid value (stores empty string)

---

## 4. Server Behavior and Responses

### Processing Logic (from `CwsstoreEx::onSet` and `CDALIKVStore::set`)

1. If `StoreName` is empty/null, substitute the server's default store name
2. Encode the store name for DALI XPath
3. If `UserSpecific=true` and no authenticated user is present, throw an exception
4. If `Namespace` is empty/null, throw an exception
5. Encode the namespace name for DALI XPath
6. Ensure DALI connectivity (throws if offline)
7. Connect to DALI using `RTM_LOCK_WRITE`; throw if the store path does not exist
8. Check `MaxValSize`: if the value length exceeds it, throw an exception
9. Locate or create the owner tree (`global` or encoded lower-case user name)
10. Locate or create the namespace tree (setting `@createTime` on first create)
11. Encode the key for DALI XPath
12. If the key does not exist: create new node, set `@createTime` and `@createUser`
13. If the key exists: update the value, set `@editTime` and `@editBy`
14. Commit changes to DALI
15. Return `true`

### Valid Response
| Field | Type | Value |
|-------|------|-------|
| `Success` | `boolean` | `true` — value was stored successfully |

### Invalid / Error Responses
| Condition | Server Behavior |
|-----------|-----------------|
| Store name empty, no default store | Throws `MakeStringException` → SOAP fault |
| Namespace empty/null | Throws `MakeStringException` → SOAP fault |
| `UserSpecific=true` with no authenticated user | Throws `MakeStringException` → SOAP fault |
| Value exceeds `MaxValSize` | Throws `MakeStringException` → SOAP fault |
| DALI offline/unavailable | Throws from `ensureAttachedToDali()` |
| DALI store path not found | Throws `MakeStringException` (store does not exist) |

---

## 5. Error Handling

### Server-Side Errors

| Error Condition | Server Message | Client Behavior |
|----------------|----------------|-----------------|
| Empty store name (no default) | `"DALI Keystore set(): Store name not provided"` | Caught as `EspSoapFault` or `RemoteException`; client returns `false` |
| Empty namespace | `"DALI Keystore set(): namespace not provided"` | Caught as `EspSoapFault`; client returns `false` |
| User-specific with no user | `"DALI Keystore set(): Attempting to set non-global entry but owner name not provided"` | Caught as `EspSoapFault`; client returns `false` |
| Value too large | `"DALI Keystore set(): Size of the value exceeds maximum size allowed (N)"` | Caught as `EspSoapFault`; client returns `false` |
| DALI unavailable | Internal DALI error | Caught as `RemoteException`; client returns `false` |
| Store not found in DALI | `"DALI Keystore set(): Unable to connect to DALI KeyValue store path '...'"` | Caught as `EspSoapFault`; client returns `false` |

### Client-Side Errors

| Error Condition | Client Behavior |
|----------------|-----------------|
| ESP exceptions in response | `handleEspExceptions()` called → throws `ArrayOfEspExceptionWrapper` |
| `RemoteException` | Logged; `false` returned |
| `EspSoapFault` | Logged; `false` returned |
| `verifyStub()` fails (null/invalid stub) | Throws `Exception` before request is made |

---

## 6. Existing Dataset Analysis

The WsStore `setValue` method stores arbitrary string key-value pairs in HPCC's in-memory/DALI-backed key-value store. It does **not** operate on HPCC logical files or datasets. Therefore, none of the benchmark datasets are applicable as inputs to `setValue` itself.

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | setValue operates on key-value string pairs, not logical HPCC files |
| `~benchmark::string::100MB` | No | Not used; setValue does not read from HPCC datasets |
| `~benchmark::integer::20KB` | No | Not used; setValue does not read from HPCC datasets |
| `~benchmark::all_types::superfile` | No | Not used; setValue does not read from HPCC datasets |
| `~benchmark::integer::20kb::key` | No | Not used; setValue does not read from HPCC datasets |

All test data for `setValue` is provided directly as string parameters to the method call. No external HPCC datasets are required.

---

## 7. Test Case Plan

> Only test cases for scenarios **not already covered** by existing tests are listed below (see Section 2 for existing coverage).

---

### A. Core Functionality Tests

#### CFT-001 — Overwrite Existing Value (Round-Trip Verification)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflow — Overwrite Verification |
| **Description** | Set a key-value pair, then overwrite it with a different value, then verify the fetched value reflects the new (overwritten) value |
| **Input Data** | `storename`: `WsClientTestStore`, `namespace`: `Junittests`, `key`: `overwrite.test`, first `value`: `originalValue`, second `value`: `updatedValue`, `global`: `true` |
| **Dataset** | N/A — inline string data |
| **Expected Output** | Both `setValue` calls return `true`; `fetchValue` returns `"updatedValue"` after second set; `fetchKeyMetaData` shows `@editTime` is populated |
| **Pass Criteria** | - First `setValue` returns `true`<br>- Second `setValue` returns `true`<br>- `fetchValue(storename, namespace, "overwrite.test", true)` equals `"updatedValue"` (not `"originalValue"`)<br>- Key metadata contains `@editTime` attribute after overwrite |
| **Notes** | Validates that the DALI store correctly replaces the old value and updates edit metadata. Existing `a2setTest` sets the same key twice but never verifies the fetched value changes. |

---

#### CFT-002 — Set Empty String Value

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variation — Empty Value |
| **Description** | Store an empty string (`""`) as the value for a key and verify it can be retrieved |
| **Input Data** | `storename`: `WsClientTestStore`, `namespace`: `Junittests`, `key`: `empty.value.test`, `value`: `""`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | `setValue` returns `true`; `fetchValue` returns an empty string or null (server-dependent via `[nil_remove]`) |
| **Pass Criteria** | - `setValue` does not throw an exception<br>- `setValue` returns `true`<br>- No `ArrayOfEspExceptionWrapper` thrown |
| **Notes** | The `FetchResponse` IDL uses `[nil_remove]` on `Value`, meaning an empty/null stored value may return null from `fetchValue`. Test should tolerate either `""` or `null` from fetch. |

---

### B. Edge Case Tests

#### ECT-001 — Unicode / Multi-byte Value

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs — Unicode Value |
| **Description** | Store a value containing Unicode characters (e.g., accented letters, CJK characters, emoji) and verify the exact string is preserved after retrieval |
| **Input Data** | `storename`: `WsClientTestStore`, `namespace`: `Junittests`, `key`: `unicode.value.test`, `value`: `"café ☕ 日本語"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | `setValue` returns `true`; `fetchValue` returns `"café ☕ 日本語"` exactly |
| **Pass Criteria** | - `setValue` returns `true` without exception<br>- `fetchValue` returns the exact Unicode string (character-for-character match) |
| **Notes** | Tests that the SOAP/XML transport and DALI storage preserves multi-byte UTF-8 content. |

---

#### ECT-002 — Value with XML Special Characters

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs — XML-Special Characters in Value |
| **Description** | Store a value containing XML special characters (`<`, `>`, `&`, `"`, `'`) and verify the exact string is preserved |
| **Input Data** | `storename`: `WsClientTestStore`, `namespace`: `Junittests`, `key`: `xml.chars.value.test`, `value`: `"<tag attr=\"val\">content & more</tag>"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | `setValue` returns `true`; `fetchValue` returns the raw unescaped string `<tag attr="val">content & more</tag>` |
| **Pass Criteria** | - `setValue` returns `true` without exception<br>- Fetched value equals the original string with unescaped special characters |
| **Notes** | Tests Axis2 XML serialization/deserialization handles entity encoding transparently. |

---

#### ECT-003 — Large Value Approaching MaxValSize

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values — Large Value |
| **Description** | Store a large string value (e.g., 64 KB of repeated characters) and verify it is accepted and retrievable, provided the store's `MaxValSize` is either 0 (unlimited) or large enough |
| **Input Data** | `storename`: `WsClientTestStore`, `namespace`: `Junittests`, `key`: `large.value.test`, `value`: 65,536-character string of `"A"`, `global`: `true` |
| **Dataset** | N/A — value generated programmatically: `"A".repeat(65536)` |
| **Expected Output** | `setValue` returns `true` (assuming unlimited `MaxValSize`); `fetchValue` returns the full 65,536-character string |
| **Pass Criteria** | - `setValue` returns `true`<br>- `fetchValue` returns a string of length 65,536 |
| **Notes** | Requires the test store to have `MaxValSize = 0` (unlimited). If `MaxValSize` is configured, this test may need adjustment. Add a setup step to create the store with `MaxValSize = 0`. |

---

#### ECT-004 — Key with Whitespace Characters

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-004 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs — Whitespace in Key |
| **Description** | Store a value using a key that contains whitespace (spaces, tabs) and verify the round-trip works correctly |
| **Input Data** | `storename`: `WsClientTestStore`, `namespace`: `Junittests`, `key`: `"key with spaces"`, `value`: `"spaced out"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | `setValue` returns `true`; `fetchValue` returns `"spaced out"` when queried with key `"key with spaces"` |
| **Pass Criteria** | - `setValue` returns `true`<br>- `fetchValue` with exact same key returns `"spaced out"` |
| **Notes** | DALI encodes key names via `encodePTreeName`. This tests that spaces are properly encoded and decoded transparently. |

---

#### ECT-005 — Namespace with Special Characters

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-005 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs — Special Characters in Namespace |
| **Description** | Store a value in a namespace that contains special characters (dots, hyphens, forward slashes) and verify the round-trip |
| **Input Data** | `storename`: `WsClientTestStore`, `namespace`: `"test.namespace-v1/sub"`, `key`: `"mykey"`, `value`: `"myvalue"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | `setValue` returns `true`; `fetchValue` with same namespace returns `"myvalue"` |
| **Pass Criteria** | - `setValue` returns `true`<br>- `fetchValue` returns `"myvalue"` without exception |
| **Notes** | Namespace is encoded via `encodePTreeName`. Forward slashes are a common edge case for XPath-based stores. |

---

### C. Error Handling Tests

#### EHT-001 — Empty Namespace

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Missing Required Field |
| **Description** | Attempt to set a value with an empty namespace string and verify the server rejects the request |
| **Input Data** | `storename`: `WsClientTestStore`, `namespace`: `""`, `key`: `"testkey"`, `value`: `"testvalue"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | Server throws `"DALI Keystore set(): namespace not provided"`; client catches and returns `false` or throws `ArrayOfEspExceptionWrapper` |
| **Pass Criteria** | - `setValue` does NOT return `true`<br>- Either returns `false` OR throws `ArrayOfEspExceptionWrapper`<br>- No unexpected Java exceptions propagate uncaught |
| **Notes** | The server-side validation explicitly checks for empty namespace. |

---

#### EHT-002 — Null Namespace

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Null Required Field |
| **Description** | Attempt to set a value with a null namespace and verify graceful handling |
| **Input Data** | `storename`: `WsClientTestStore`, `namespace`: `null`, `key`: `"testkey"`, `value`: `"testvalue"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | Server treats null namespace as empty and throws; client returns `false` or throws `ArrayOfEspExceptionWrapper` |
| **Pass Criteria** | - `setValue` does NOT return `true`<br>- Either returns `false` or throws `ArrayOfEspExceptionWrapper`<br>- No `NullPointerException` thrown on the client side |
| **Notes** | Axis2 may serialize null as omitted element; server receives empty/missing namespace. |

---

#### EHT-003 — Non-existent Store Name

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Resource Not Found |
| **Description** | Attempt to set a value in a store that does not exist on the server and verify the request fails gracefully |
| **Input Data** | `storename`: `"NonExistentStore_XYZ_12345"`, `namespace`: `"testns"`, `key`: `"testkey"`, `value`: `"testvalue"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | Server throws: `"DALI Keystore set(): Unable to connect to DALI KeyValue store path '...'"` or similar; client returns `false` |
| **Pass Criteria** | - `setValue` does NOT return `true`<br>- Either returns `false` or throws `ArrayOfEspExceptionWrapper`<br>- No unexpected Java uncaught exceptions |
| **Notes** | Ensure the store name used does not accidentally exist on the test server. |

---

#### EHT-004 — Value Exceeds MaxValSize

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Validation Failure |
| **Description** | Create a store with a small `MaxValSize`, then attempt to store a value that exceeds that limit and verify the server rejects it |
| **Input Data** | Store created with `MaxValSize = 10`; `key`: `"toolarge"`, `value`: `"This value is definitely longer than 10 characters"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | Server throws: `"DALI Keystore set(): Size of the value exceeds maximum size allowed (10)"`; client catches and returns `false` |
| **Pass Criteria** | - `setValue` does NOT return `true`<br>- Returns `false` or throws `ArrayOfEspExceptionWrapper` |
| **Notes** | Requires creating a separate test store with a defined `MaxValSize` constraint. May need special store setup. Check if `createStore` supports `MaxValSize` configuration; if not, this test may require manual server-side store setup. |

---

#### EHT-005 — User-Specific Set on Unauthenticated Connection

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-005 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors — Permission/Authorization Issue |
| **Description** | When the target HPCC cluster does not require authentication, attempt a user-specific `setValue` (`global=false`) and verify it fails gracefully |
| **Input Data** | `storename`: `WsClientTestStore`, `namespace`: `Junittests`, `key`: `"unauthenticated.user.key"`, `value`: `"testvalue"`, `global`: `false` on a non-authenticated HPCC cluster |
| **Dataset** | N/A |
| **Expected Output** | Server throws: `"DALI Keystore set(): Attempting to set non-global entry but owner name not provided"` (or similar); client returns `false` |
| **Pass Criteria** | - `setValue` with `global=false` does NOT return `true` when HPCC does not authenticate<br>- Either returns `false` or throws `ArrayOfEspExceptionWrapper` |
| **Notes** | Use `Assume.assumeFalse(targetHPCCAuthenticates)` to only run this test on non-authenticated clusters. Complements existing `a2setTest` which skips user-specific tests when not authenticated. |

---

#### EHT-006 — Invalid / Unreachable Connection

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-006 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors — Invalid Connection |
| **Description** | Create an `HPCCWsStoreClient` with an unreachable host and verify that `setValue` fails gracefully without throwing an uncaught exception |
| **Input Data** | Connection to `http://invalid-host-xyz.nonexistent:8010`; any valid method parameters |
| **Dataset** | N/A |
| **Expected Output** | `setValue` returns `false` or throws a descriptive `Exception`; no unhandled stack trace |
| **Pass Criteria** | - `setValue` does not return `true`<br>- Either returns `false` or throws an exception with a meaningful message<br>- No `NullPointerException` from client internals |
| **Notes** | The stub initialization may fail silently and set `initErrMessage`. Calling `setValue` on a client with a null stub will cause `verifyStub()` to throw. Test should catch and assert on the exception type or message. |

---

#### EHT-007 — Empty Key

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-007 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs — Empty Key |
| **Description** | Attempt to set a value using an empty string key and observe server/client behavior |
| **Input Data** | `storename`: `WsClientTestStore`, `namespace`: `Junittests`, `key`: `""`, `value`: `"testvalue"`, `global`: `true` |
| **Dataset** | N/A |
| **Expected Output** | Server may either reject the request or store the value under an empty key node; client should not throw an uncaught exception |
| **Pass Criteria** | - `setValue` does not throw an unexpected uncaught exception<br>- If the call succeeds (`true`), a subsequent `fetchValue` with empty key should retrieve `"testvalue"`<br>- If the call fails, it returns `false` or throws `ArrayOfEspExceptionWrapper` |
| **Notes** | Server behavior with an empty key is not explicitly validated in the DALI implementation. DALI's `encodePTreeName` with an empty string may produce unexpected XPath. This test documents actual behavior. |

---

## 8. New Dataset Specifications

No new HPCC datasets are required for any test case in this analysis. All `setValue` tests use inline string parameters only.

---

## Appendix: Test Execution Order Notes

Tests in `WSStoreClientTest.java` use `@FixMethodOrder(MethodSorters.NAME_ASCENDING)`. New test methods must be named appropriately to ensure they execute after the store creation (`a1createStoreTest`) and before deletion tests (`z91deleteNSTest`).

Suggested method naming for new tests:
- CFT-001: `a2setValueOverwriteVerificationTest`
- CFT-002: `a2setValueEmptyStringValueTest`
- ECT-001: `a2setValueUnicodeValueTest`
- ECT-002: `a2setValueXmlSpecialCharsValueTest`
- ECT-003: `a2setValueLargeValueTest`
- ECT-004: `a2setValueKeyWithWhitespaceTest`
- ECT-005: `a2setValueNamespaceWithSpecialCharsTest`
- EHT-001: `a2setValueEmptyNamespaceTest`
- EHT-002: `a2setValueNullNamespaceTest`
- EHT-003: `a2setValueNonExistentStoreTest`
- EHT-004: `a2setValueExceedsMaxValSizeTest`
- EHT-005: `a2setValueUserSpecificUnauthenticatedTest`
- EHT-006: `a2setValueInvalidConnectionTest`
- EHT-007: `a2setValueEmptyKeyTest`


---
*Generated: 2026-02-24*

---

# WsStore `setValueEncrypted` Method — Test Case Analysis

**Generated:** 2026-02-24  
**Target Class:** `HPCCWsStoreClient`  
**Target Methods:**
- `setValueEncrypted(String storename, String namespace, String key, String value, boolean global, Cipher cipher)`
- `setValueEncrypted(String storename, String namespace, String key, String value, boolean global, String secretKey)`  
**Test File:** `WSStoreClientTest.java`

---

## 1. Method Summary

### Purpose
`setValueEncrypted` encrypts a plaintext value client-side before storing it in the HPCC WsStore key-value store. Two overloads exist:
1. **Cipher-based overload**: Accepts a pre-constructed `javax.crypto.Cipher` object (encryption mode), encrypts the value using `CryptoHelper.encrypt(value, cipher)`, then delegates to `setValue`.
2. **Secret-key-string overload**: Accepts a raw `String` secret key, derives an AES key via SHA-512 digest using `CryptoHelper.encryptSHA512AES(value, secretKey)`, then delegates to `setValue`.

### Role Within the Service
`setValueEncrypted` is a client-side convenience wrapper around `setValue`. The server (`onSet`) is entirely unaware that the stored value is encrypted — it stores the (already-encrypted) string exactly as provided. Decryption must be performed client-side by the caller (via `fetchValueEncrypted` or manually with `CryptoHelper.decrypt`).

### Inputs

| Parameter | Type | Description |
|-----------|------|-------------|
| `storename` | `String` | Name of the store; if null/empty, the server uses the default store |
| `namespace` | `String` | Logical grouping within the store |
| `key` | `String` | Key name within the namespace |
| `value` | `String` | Plaintext value to encrypt and store |
| `global` | `boolean` | `true` = store globally (shared); `false` = store per-user |
| `cipher` | `javax.crypto.Cipher` _(overload 1)_ | Pre-initialized encryption-mode cipher; caller is responsible for creating and keeping the matching decrypt cipher |
| `secretKey` | `String` _(overload 2)_ | Raw string secret key; internally processed via SHA-512 → AES-128 key derivation |

### Outputs
- Returns `true` if `setValue` (and thus the server) reports success
- Returns `false` if `setValue` returns `false` (i.e., `RemoteException` or `EspSoapFault` was caught internally)
- Throws `Exception` if `CryptoHelper.encrypt` or `CryptoHelper.encryptSHA512AES` fails (e.g., cipher in wrong mode, null cipher), or if `setValue` throws
- Throws `ArrayOfEspExceptionWrapper` if the server returns ESP-level exceptions

### Side Effects
- The plaintext `value` is **never sent over the network**; only the Base64-encoded ciphertext is transmitted and stored
- The encryption/decryption key material is never sent to the server; the caller is solely responsible for key management
- Storage and overwrite behavior is identical to `setValue` — the server creates/overwrites the key with the ciphertext
- All writes are committed to DALI on the server

### Client-Side Encryption Details

**Overload 1 (`Cipher cipher`):**
- Calls `CryptoHelper.encrypt(value, cipher)` which:
  - Converts value to UTF-8 bytes
  - Calls `cipher.doFinal(...)` to encrypt
  - Base64-encodes the ciphertext
  - Returns the Base64 string for storage
- The caller must have created the cipher with `Cipher.ENCRYPT_MODE`; passing a decrypt-mode cipher will produce incorrect results or throw

**Overload 2 (`String secretKey`):**
- Calls `CryptoHelper.encryptSHA512AES(value, secretKey)` which:
  - Derives `SecretKeySpec` via `createSHA512AESSecretKey(secretKey)`:
    - Digests `secretKey` with SHA-512
    - Takes first 16 bytes as AES-128 key material
  - Creates an AES cipher in encrypt mode
  - Encrypts and Base64-encodes the result

---

## 2. Existing Test Coverage Analysis

### Existing Tests That Call `setValueEncrypted`

| Existing Test Method Name | Test Category | Scenario Covered | Input Data Summary | Pass Criteria | Notes |
|---------------------------|---------------|------------------|---------------------|---------------|-------|
| `a3setEncryptedTest` | CFT | Global store with default AES cipher (Cipher overload) | Store: `defaultStoreName`, NS: `defaultNS`, key: `global.encrypted.test`, value: `mysensitivedata`, global=true | `assertTrue(setValueEncrypted(...))` | Also verifies stored ciphertext is non-null via `fetchValue` |
| `a3setEncryptedTest` | CFT | Global store with secret key string (secretKey overload) | Store: `defaultStoreName`, NS: `defaultNS`, key: `global.encrypted.secretkey.test`, value: `privateinfo`, global=true | `assertTrue(setValueEncrypted(...))` | Proves secretKey overload stores successfully |
| `a3setEncryptedTest` | CFT | User-specific store with default AES cipher (Cipher overload) | Store: `defaultStoreName`, NS: `defaultNS`, key: `WsClient.user.encrypted.test`, value: `moresensitivedata`, global=false | `assertTrue(setValueEncrypted(...))` | Skipped when HPCC does not authenticate |
| `a3setEncryptedTest` | CFT | User-specific store with secret key string (secretKey overload) | Store: `defaultStoreName`, NS: `defaultNS`, key: `WsClient.user.encrypted.secretkey.test`, value: `moreprivateinfo`, global=false | `assertTrue(setValueEncrypted(...))` | Skipped when HPCC does not authenticate |
| `a3setEncryptedTest` | CFT | Round-trip: encrypt-store-fetch-decrypt (Cipher overload) | Stores `mysensitivedata`, fetches ciphertext, decrypts locally and via `fetchValueEncrypted`; compares both decrypted values | Decrypted values match original plaintext | Validates that the stored ciphertext is correctly decryptable |
| `a3setEncryptedCustomTest` | CFT | Custom cipher (SHA-1 + AES) via `Cipher` overload | Custom `SecretKeySpec` using `DigestAlgorithmType.SHA1`, `cipherAlgo=AES`; global=true | `assertTrue(setValueEncrypted(...))` | Tests non-default digest algorithm |
| `a3setEncryptedCustomTest` | CFT | Round-trip with custom cipher | Stores with custom encrypt cipher, fetches, decrypts via `fetchValueEncrypted` and locally | Both decrypted values are not null and equal | Validates custom cipher round-trip |
| `b4setEncryptedTest` | CFT | Global store with default AES cipher — encoded store/namespace | Store: `defaultEncodedStoreName` (`WsCli@ntT_estStore`), NS: `defaultEncodedNS` (`Junit_t@ests`), key: `global.encrypted.test`, value: `mysensitivedata`, global=true | `assertTrue(setValueEncrypted(...))` | Same as `a3setEncryptedTest` but with URL-encoded store/NS names |
| `b4setEncryptedTest` | CFT | Global store with secret key string — encoded store/namespace | As above, secretKey overload, key: `global.encrypted.secretkey.test`, value: `privateinfo`, global=true | `assertTrue(setValueEncrypted(...))` | Encoded store/NS variant |
| `b4setEncryptedTest` | CFT | User-specific — encoded store/namespace, Cipher overload | global=false, encoded store/NS | `assertTrue(setValueEncrypted(...))` | Skipped when HPCC does not authenticate |
| `b4setEncryptedTest` | CFT | User-specific — encoded store/namespace, secretKey overload | global=false, encoded store/NS | `assertTrue(setValueEncrypted(...))` | Skipped when HPCC does not authenticate |
| `b4setEncryptedTest` | CFT | Round-trip: encoded store/namespace — Cipher overload | As above | Decrypted values match | Validates round-trip with encoded store/NS |
| `b4setEncryptedCustomTest` | CFT | Custom cipher (SHA-1 + AES) — encoded store/namespace | Same cipher setup as `a3setEncryptedCustomTest`, encoded store/NS | `assertTrue(setValueEncrypted(...))` | Encoded store/NS variant of custom cipher test |
| `b4setEncryptedCustomTest` | CFT | Round-trip with custom cipher — encoded store/namespace | Stores, fetches, decrypts via `fetchValueEncrypted` and locally | Both decrypted values equal | Validates custom cipher round-trip with encoded names |

### Coverage Summary
- **Total existing test methods:** 4 (`a3setEncryptedTest`, `a3setEncryptedCustomTest`, `b4setEncryptedTest`, `b4setEncryptedCustomTest`)
- **Core Functionality Tests covered:**
  - Global key set using Cipher overload (both default and custom cipher)
  - Global key set using secretKey-string overload
  - User-specific key set using both overloads (conditional on auth)
  - Round-trip: set encrypted → fetch ciphertext → decrypt locally and via client
  - Custom digest algorithm (SHA-1) with AES cipher
  - Encoded (special-character) store and namespace names
- **Edge Case Tests covered:**
  - Custom cipher algorithm (non-default SHA-1 digest)
  - URL-encoded/special-character store and namespace names
- **Error Handling Tests covered:** None — no existing test validates error conditions (invalid cipher, null parameters, wrong cipher mode, etc.)

### Gaps Identified
1. **EHT — Null cipher (Cipher overload)**: No test passes `null` as the cipher; should throw `Exception`
2. **EHT — Decrypt-mode cipher (Cipher overload)**: No test passes a cipher initialized in `DECRYPT_MODE`; `CryptoHelper.encrypt` will throw a `javax.crypto.IllegalBlockSizeException` or similar
3. **EHT — Null/empty secretKey (secretKey overload)**: No test passes `null` or empty string as the secret key
4. **EHT — Null value**: No test attempts to encrypt and store a `null` plaintext value
5. **ECT — Empty string value**: No test stores an empty string `""` as the plaintext value
6. **ECT — Very long plaintext value**: No test stores a large value (approaching `MaxValSize` after encryption/Base64 expansion)
7. **ECT — Unicode/multi-byte value**: No test encrypts and stores a Unicode string (e.g., emoji, CJK characters)
8. **ECT — Value containing special characters**: No test encrypts a value containing XML-special characters (`<`, `>`, `&`, `"`)
9. **EHT — Null/empty storename**: No test verifies behavior with null/empty storename (falls back to default store per server logic)
10. **EHT — Null/empty namespace**: No test verifies exception when namespace is null/empty
11. **EHT — Null/empty key**: No test verifies behavior with a null or empty key
12. **ECT — Overwrite with different encryption key**: No test verifies that overwriting an encrypted key with a different key/cipher produces the newly-encrypted value
13. **EHT — Invalid connection**: No test verifies graceful failure when using an invalid endpoint
14. **ECT — Very short secret key**: No test uses a 1-character secret key string (edge for SHA-512 key derivation)
15. **ECT — Binary-like secret key (non-UTF8 bytes)**: No test uses a secret key derived from random bytes (though `a3setEncryptedTest` does use random bytes — however the key is derived as UTF-8 string, testing this edge case explicitly has value)

---

## 3. Request Structure

`setValueEncrypted` calls `setValue` which constructs a `SetRequest`. The server-side IDL is:

```
ESPrequest SetRequest
{
    string StoreName;
    string Namespace;
    string Key;
    string Value;       // contains the encrypted/Base64 value
    bool   UserSpecific(false);
};

ESPresponse [exceptions_inline] SetResponse
{
    bool Success;
};
```

| Field Name | Type | Required | Description | Valid Range / Format | Notes |
|------------|------|----------|-------------|---------------------|-------|
| `StoreName` | `string` | No | Store name; falls back to configured default if empty/null | Non-empty string; store must exist or be a configured default | Server silently uses default if not provided |
| `Namespace` | `string` | Yes (effectively) | Logical grouping within the store | Non-empty string | Server-side storage path uses this as a hierarchy segment |
| `Key` | `string` | Yes (effectively) | Key within the namespace | Non-empty string | Empty key behavior is undefined/server-dependent |
| `Value` | `string` | No | The encrypted, Base64-encoded ciphertext | Arbitrary string (Base64 chars); max size governed by store's `MaxValSize` (default: 1024 bytes) | Client encrypts before setting; server stores as-is |
| `UserSpecific` | `bool` | No | `true` = user-scoped; `false` = global | Default: `false` | Maps from Java `global` param as `!global` |

### Field Dependencies
- If `StoreName` is empty, the server uses `m_defaultStore`; if that is also unset, behavior is undefined
- `UserSpecific=true` requires the user to be authenticated; on unauthenticated HPCC clusters, user-specific operations may fail or store under an empty username

### Important Note on Value Size
The encrypted Base64 output is approximately `⌈(inputBytes + 16 padding) / 3⌉ × 4` characters. The default `MaxValSize` is **1024 bytes**. A plaintext value near ~700 characters may produce encrypted output that exceeds the default limit.

---

## 4. Server Behavior and Responses

### Server-Side Logic (`onSet`)
The server (C++, `CwsstoreEx::onSet`) does **not** know or care that the value is encrypted:
1. Reads `StoreName`, `Namespace`, `Key`, `Value`, `UserSpecific` from the request
2. If `StoreName` is empty and a default store is configured, uses the default
3. Calls `m_storeProvider->set(storename, ns, key, value, secuser, !req.getUserSpecific())`
4. Sets `resp.setSuccess(...)` with the provider's return value
5. Always returns `true` (HTTP 200); failures manifest as `Success=false` or ESP exceptions in the response

### Valid Responses
| Response | Meaning |
|----------|---------|
| `Success=true` | Key-value pair was created or updated successfully |
| `Success=false` | Provider returned false (e.g., store not found, provider error) |

### ESP Exception Conditions
The server may return an inline ESP exception (wrapped by `ArrayOfEspExceptionWrapper`) for:
- Authorization failures (`WsStoreAccess:WRITE` permission required)
- Invalid store/namespace/key combinations that the provider rejects

### Authorization
The `Set` method requires `WsStoreAccess:WRITE` permission. User-specific storage additionally uses the authenticated user identity from context.

---

## 5. Error Handling

### Client-Side Errors (Before Network Call)

| Condition | Behavior | Exception Type |
|-----------|----------|----------------|
| `cipher` is `null` | `CryptoHelper.encrypt` will throw `NullPointerException` | `NullPointerException` / `Exception` |
| `cipher` is in `DECRYPT_MODE` | `cipher.doFinal(...)` throws `IllegalStateException` or `IllegalBlockSizeException` | `Exception` |
| `secretKey` is `null` | `MessageDigest.update(null)` throws `NullPointerException` or `IllegalArgumentException` during key derivation | `Exception` |
| `secretKey` is empty string | Key derivation may succeed (all-zero digest prefix) but produces a weak/predictable key; no exception thrown | — |
| `value` is `null` | `cipher.doFinal(null.getBytes(...))` throws `NullPointerException` in `CryptoHelper.encrypt` | `NullPointerException` / `Exception` |
| Connection fails | `setValue` catches `RemoteException` / `EspSoapFault` and returns `false` | Returns `false` (no exception propagated) |

### Server-Side Errors

| Condition | Behavior |
|-----------|----------|
| Missing `WRITE` authorization | Server returns `ArrayOfEspException` with authorization error |
| Store does not exist and no default store | `Success=false` or ESP exception |
| Value exceeds `MaxValSize` | `Success=false` or exception from the store provider |
| Empty namespace or key | Undefined / provider-specific; may succeed or return error |

### Client-Side Handling in `setValue`
- `RemoteException`: caught, printed, returns `false`
- `EspSoapFault`: caught, printed, returns `false`
- Non-null `response.getExceptions()`: throws `ArrayOfEspExceptionWrapper`

---

## 6. Existing Dataset Analysis

`setValueEncrypted` stores arbitrary string key-value pairs in the HPCC WsStore — it does not interact with HPCC file system datasets (DFS, Thor, etc.). The benchmark datasets are irrelevant for this method.

| Dataset Name | Applicable? | Reason |
|-------------|-------------|--------|
| `~benchmark::all_types::200KB` | No | WsStore key-value storage is independent of HPCC logical file datasets; this method stores arbitrary strings, not dataset records |
| `~benchmark::string::100MB` | No | Same reason; no dataset I/O involved |
| `~benchmark::integer::20KB` | No | Same reason |
| `~benchmark::all_types::superfile` | No | Same reason |
| `~benchmark::integer::20kb::key` | No | Same reason |

All test inputs for this method are self-contained strings (storename, namespace, key, plaintext value, and key material) created inline in the test.

---

## 7. Test Case Plan

All test cases below address gaps identified in Section 2 — none duplicate existing tests.

---

### A. Core Functionality Tests

#### CFT-001 — Overwrite encrypted key with a different cipher

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-001 |
| **Category** | Core Functionality |
| **Subcategory** | Typical Workflow |
| **Description** | Verify that overwriting an existing encrypted key with a different AES cipher produces the new ciphertext (not the old one) |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `overwrite.encrypted.test`<br>Round 1: plaintext=`firstvalue`, cipher1 (random 12-byte key1)<br>Round 2: plaintext=`secondvalue`, cipher2 (different random 12-byte key2) |
| **Dataset** | N/A — no file dataset required |
| **Expected Output** | Both `setValueEncrypted` calls return `true`; `fetchValue` after round 2 returns a ciphertext decryptable only with cipher2 (decryption with cipher1 fails or returns wrong value) |
| **Pass Criteria** | - Both set calls return `true`<br>- Fetched ciphertext after round 2 decrypts to `secondvalue` with cipher2<br>- Decrypting with cipher1 does **not** produce `secondvalue` (key rotation works) |
| **Notes** | Requires a functional HPCC cluster. Uses `fetchValueEncrypted` for both decrypt attempts. |

---

#### CFT-002 — Empty string plaintext value (Cipher overload)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-002 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Verify that an empty string `""` can be encrypted and stored, and that after fetching and decrypting the result is an empty string |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `empty.value.cipher.test`, value: `""`, global=true<br>Cipher: default AES cipher from random 12-byte key |
| **Dataset** | N/A |
| **Expected Output** | `setValueEncrypted` returns `true`; `fetchValueEncrypted` returns `""` (empty string after decryption) |
| **Pass Criteria** | - Return value is `true`<br>- `fetchValueEncrypted` result is not null<br>- `fetchValueEncrypted` result is an empty string `""` |
| **Notes** | AES block cipher with padding can encrypt an empty input. Tests edge case for zero-length plaintexts. |

---

#### CFT-003 — Empty string plaintext value (secretKey overload)

| Field | Description |
|-------|-------------|
| **Test ID** | CFT-003 |
| **Category** | Core Functionality |
| **Subcategory** | Data Variations |
| **Description** | Verify that an empty string `""` can be encrypted with the secretKey overload and round-tripped |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `empty.value.secretkey.test`, value: `""`, global=true<br>secretKey: `"somesecret"` |
| **Dataset** | N/A |
| **Expected Output** | `setValueEncrypted` returns `true`; `fetchValueEncrypted` (secretKey overload) returns `""` |
| **Pass Criteria** | - Return value is `true`<br>- `fetchValueEncrypted` result equals `""` |
| **Notes** | Mirrors CFT-002 but for the secretKey overload. |

---

### B. Edge Case Tests

#### ECT-001 — Unicode / multi-byte character value (Cipher overload)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-001 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Verify that a Unicode plaintext value (containing emoji and CJK characters) survives the encrypt → store → fetch → decrypt round-trip |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `unicode.encrypted.test`, value: `"Hello 🌍 世界 日本語"`, global=true<br>Cipher: default AES cipher from random 12-byte key |
| **Dataset** | N/A |
| **Expected Output** | `setValueEncrypted` returns `true`; `fetchValueEncrypted` returns `"Hello 🌍 世界 日本語"` |
| **Pass Criteria** | - Return value is `true`<br>- Decrypted value exactly equals the original Unicode string<br>- No `UnsupportedEncodingException` or encoding corruption |
| **Notes** | `CryptoHelper.encrypt` converts to UTF-8 bytes before encryption; the round-trip must preserve multi-byte sequences. |

---

#### ECT-002 — Unicode / multi-byte character value (secretKey overload)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-002 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Same as ECT-001 but using the secretKey overload |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `unicode.secretkey.encrypted.test`, value: `"Hello 🌍 世界 日本語"`, global=true<br>secretKey: `"unicodesecret"` |
| **Dataset** | N/A |
| **Expected Output** | `setValueEncrypted` returns `true`; `fetchValueEncrypted` (secretKey overload) returns original Unicode string |
| **Pass Criteria** | - Return value is `true`<br>- Decrypted value exactly equals the original Unicode string |
| **Notes** | Mirrors ECT-001 for secretKey overload. |

---

#### ECT-003 — Value containing XML-special characters (Cipher overload)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-003 |
| **Category** | Edge Case |
| **Subcategory** | Unusual Valid Inputs |
| **Description** | Verify that XML-special characters in the plaintext (`<`, `>`, `&`, `"`, `'`) survive the encrypt → store → fetch → decrypt round-trip |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `xml.special.encrypted.test`, value: `"<tag>&\"value'</tag>"`, global=true<br>Cipher: default AES cipher |
| **Dataset** | N/A |
| **Expected Output** | `setValueEncrypted` returns `true`; decrypted value exactly equals `"<tag>&\"value'</tag>"` |
| **Pass Criteria** | - Return value is `true`<br>- Decrypted value equals original (no XML escaping corruption) |
| **Notes** | The encrypted Base64 output should not contain raw XML characters; this tests that any SOAP XML serialization does not corrupt the Base64 ciphertext. |

---

#### ECT-004 — Very short secret key (1 character, secretKey overload)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-004 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Verify that a 1-character secret key string succeeds (SHA-512 key derivation handles minimal input) |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `short.key.secretkey.test`, value: `"sensitivedata"`, global=true<br>secretKey: `"x"` |
| **Dataset** | N/A |
| **Expected Output** | `setValueEncrypted` returns `true`; `fetchValueEncrypted` (secretKey overload with `"x"`) returns `"sensitivedata"` |
| **Pass Criteria** | - No exception during key derivation<br>- Return value is `true`<br>- Round-trip decryption succeeds |
| **Notes** | Tests the lower boundary of secret key length for the SHA-512 AES key derivation path. |

---

#### ECT-005 — Very long plaintext value approaching MaxValSize (Cipher overload)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-005 |
| **Category** | Edge Case |
| **Subcategory** | Performance Limits / Boundary Values |
| **Description** | Verify behavior when the plaintext is long enough that the resulting Base64-encoded ciphertext approaches the store's `MaxValSize` (default 1024 bytes). The ciphertext will be ~33% larger than the plaintext; a ~700-character plaintext will produce ~960-byte ciphertext. |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `largevalue.encrypted.test`, value: 700-char ASCII string (`"A".repeat(700)`), global=true<br>Cipher: default AES cipher |
| **Dataset** | N/A |
| **Expected Output** | `setValueEncrypted` returns `true` (assuming 1024-byte limit with some margin); round-trip decryption produces the original 700-char string |
| **Pass Criteria** | - No exception<br>- Return value is `true`<br>- Decrypted value equals 700-char input |
| **Notes** | If the store was created with a larger `MaxValSize`, the test should still pass. If it fails due to size, the failure message itself is meaningful. |

---

#### ECT-006 — Plaintext value exceeding MaxValSize after encryption (Cipher overload)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-006 |
| **Category** | Edge Case |
| **Subcategory** | Boundary Values |
| **Description** | Verify that storing a plaintext whose encrypted Base64 result **exceeds** `MaxValSize` (default 1024 bytes; ~750+ char plaintext) results in a graceful failure (false return or exception), not a silent data corruption |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `oversize.encrypted.test`, value: 1000-char ASCII string (`"B".repeat(1000)`), global=true<br>Cipher: default AES cipher |
| **Dataset** | N/A |
| **Expected Output** | `setValueEncrypted` returns `false` OR throws `Exception`/`ArrayOfEspExceptionWrapper` |
| **Pass Criteria** | - Method does not return `true`<br>- No silent truncation of the stored value |
| **Notes** | The exact behavior (false vs. exception) depends on the server's store provider. The test should assert `assertFalse` or catch the expected exception. Depends on the store created by the test suite having the default `MaxValSize=1024`. |

---

#### ECT-007 — SHA-256 custom digest algorithm (secretKey-derived via `createSecretKey`, Cipher overload)

| Field | Description |
|-------|-------------|
| **Test ID** | ECT-007 |
| **Category** | Edge Case |
| **Subcategory** | Data Variations |
| **Description** | Verify that a custom Cipher created using `DigestAlgorithmType.SHA256` (instead of the existing SHA-1 and default SHA-512 tests) successfully encrypts and round-trips |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `sha256.cipher.encrypted.test`, value: `"sha256encrypted"`, global=true<br>SecretKeySpec via `CryptoHelper.createSecretKey(key, DigestAlgorithmType.SHA256, "AES")`<br>Cipher via `CryptoHelper.createCipher(secretKeySpec, "AES", true)` |
| **Dataset** | N/A |
| **Expected Output** | `setValueEncrypted` returns `true`; decrypted value equals `"sha256encrypted"` |
| **Pass Criteria** | - No exception<br>- Return value is `true`<br>- Round-trip decryption matches original plaintext |
| **Notes** | Existing tests cover SHA-1 (`a3setEncryptedCustomTest`) and implicitly SHA-512 (default). SHA-256 is not yet tested. |

---

### C. Error Handling Tests

#### EHT-001 — Null cipher (Cipher overload)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-001 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Verify that passing `null` as the `Cipher` parameter throws an exception (not silently stores null or empty) |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `null.cipher.test`, value: `"somevalue"`, global=true<br>cipher: `null` |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown (likely `NullPointerException` from `CryptoHelper.encrypt` when calling `cipher.doFinal(...)`) |
| **Pass Criteria** | - An exception is thrown<br>- No value is stored (or an invalid value is stored but exception propagates to caller) |
| **Notes** | This tests defensive programming. The test should use `try/catch` and assert that an exception is thrown, or use `@Test(expected=Exception.class)`. |

---

#### EHT-002 — Decrypt-mode cipher passed to Cipher overload

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-002 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Verify that passing a `Cipher` initialized in `DECRYPT_MODE` to `setValueEncrypted` throws an exception (passing a decryption cipher where encryption is expected) |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `decrypt.mode.cipher.test`, value: `"somevalue"`, global=true<br>cipher: `CryptoHelper.createDefaultCipher(secretKey, false)` (decrypt mode) |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown from `CryptoHelper.encrypt` (e.g., `IllegalStateException` or `IllegalBlockSizeException`) |
| **Pass Criteria** | - An exception is thrown<br>- The exception is of type `Exception` or a `javax.crypto.*` exception subclass |
| **Notes** | This is a defensive test for API misuse — callers must pass an encrypt-mode cipher. |

---

#### EHT-003 — Null secretKey (secretKey overload)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-003 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Verify that passing `null` as the `secretKey` string throws an exception |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `null.secretkey.test`, value: `"somevalue"`, global=true<br>secretKey: `null` |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown during key derivation in `CryptoHelper.encryptSHA512AES` → `createSHA512AESSecretKey(null)` → `MessageDigest` with null input |
| **Pass Criteria** | - An exception is thrown before any network call<br>- Exception type is `Exception` or `NullPointerException` |
| **Notes** | Tests the null-guard boundary of the secretKey derivation path. |

---

#### EHT-004 — Null plaintext value (Cipher overload)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-004 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Verify that passing `null` as the plaintext `value` to the Cipher overload throws an exception (not silently storing null/empty) |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `null.value.cipher.test`, value: `null`, global=true<br>cipher: valid encrypt-mode cipher |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown from `CryptoHelper.encrypt` when calling `value.getBytes("UTF-8")` on a null reference |
| **Pass Criteria** | - An exception is thrown<br>- Exception type is `NullPointerException` or `Exception` |
| **Notes** | Tests null-safety of the encryption path. |

---

#### EHT-005 — Null plaintext value (secretKey overload)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-005 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Verify that passing `null` as the plaintext `value` to the secretKey overload throws an exception |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `null.value.secretkey.test`, value: `null`, global=true<br>secretKey: `"somesecret"` |
| **Dataset** | N/A |
| **Expected Output** | `Exception` thrown from `CryptoHelper.encryptSHA512AES` when attempting to encode/encrypt a null value |
| **Pass Criteria** | - An exception is thrown<br>- Exception type is `NullPointerException` or `Exception` |
| **Notes** | Mirrors EHT-004 for the secretKey overload. |

---

#### EHT-006 — Empty string secretKey (secretKey overload)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-006 |
| **Category** | Error Handling |
| **Subcategory** | Invalid Inputs |
| **Description** | Verify behavior when the secretKey is an empty string `""`. Key derivation may succeed (producing a deterministic, zero-based AES key), or may throw depending on JCA implementation. |
| **Input Data** | Store: `defaultStoreName`, NS: `defaultNS`, key: `empty.secretkey.test`, value: `"testvalue"`, global=true<br>secretKey: `""` |
| **Dataset** | N/A |
| **Expected Output** | Either (a) `setValueEncrypted` succeeds and round-trip decrypt with `""` recovers `"testvalue"`, OR (b) an exception is thrown during key derivation |
| **Pass Criteria** | - No silent data corruption (if successful, round-trip must work)<br>- If exception thrown, it must propagate to caller (not swallowed) |
| **Notes** | Documents and validates the edge behavior; an empty secret key is a security concern but should not cause silent failure. |

---

#### EHT-007 — Null storename (Cipher overload, falls back to default store)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-007 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Behavior |
| **Description** | Verify that passing `null` as `storename` results in the server using its configured default store (not an error), and the value is stored and retrievable |
| **Input Data** | storename: `null`, NS: `defaultNS`, key: `null.store.encrypted.test`, value: `"nullstorevalue"`, global=true<br>cipher: valid encrypt-mode cipher |
| **Dataset** | N/A |
| **Expected Output** | `setValueEncrypted` returns `true` (server uses default store); `fetchValueEncrypted` with `null` storename returns the original plaintext |
| **Pass Criteria** | - Return value is `true`<br>- Decrypted round-trip recovers original plaintext |
| **Notes** | Server logic: `if (!storename || !*storename) storename = m_defaultStore`. This tests fallback to default store. |

---

#### EHT-008 — Invalid/non-existent storename

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-008 |
| **Category** | Error Handling |
| **Subcategory** | Server-Side Errors |
| **Description** | Verify that attempting to write to a non-existent store that is not the default store results in `false` or an exception |
| **Input Data** | storename: `"NonExistentStore_XYZ_12345"`, NS: `defaultNS`, key: `badstore.encrypted.test`, value: `"shouldfail"`, global=true<br>cipher: valid encrypt-mode cipher |
| **Dataset** | N/A |
| **Expected Output** | `setValueEncrypted` returns `false` OR throws `Exception`/`ArrayOfEspExceptionWrapper` |
| **Pass Criteria** | - Method does not return `true`<br>- No exception is silently swallowed |
| **Notes** | Server behavior depends on the store provider implementation. |

---

#### EHT-009 — Invalid connection (bad endpoint)

| Field | Description |
|-------|-------------|
| **Test ID** | EHT-009 |
| **Category** | Error Handling |
| **Subcategory** | Client-Side Errors |
| **Description** | Verify that `setValueEncrypted` returns `false` (or throws) when the underlying `HPCCWsStoreClient` is connected to an invalid endpoint |
| **Input Data** | Client created from a `Connection` to `http://invalid.host.example.com:9999`<br>storename: `defaultStoreName`, NS: `defaultNS`, key: `badconn.encrypted.test`, value: `"somevalue"`, global=true<br>cipher: valid encrypt-mode cipher |
| **Dataset** | N/A |
| **Expected Output** | `setValueEncrypted` returns `false` (connection failure caught as `RemoteException`) |
| **Pass Criteria** | - Method returns `false` OR throws a meaningful exception<br>- No unhandled exception causes test infrastructure failure |
| **Notes** | Tests that the `RemoteException` catch block in `setValue` handles network failures gracefully. |

---

## 8. New Dataset Specifications

No new HPCC file datasets are required for any test case in this analysis. All test inputs for `setValueEncrypted` are self-contained string parameters (storename, namespace, key, plaintext, and cipher/secretKey) created programmatically within the test methods.


---
*Generated: 2026-02-24*

# Plan: Full-Service Test Generation Mode

## Summary

Update `TestGeneratorAgent.py` to support generating tests for an **entire service** (all business methods) when `METHOD_NAME` is omitted from the CLI. The existing single-method flow remains unchanged when `METHOD_NAME` is provided.

---

## 1. CLI Changes

**File:** `TestGeneratorAgent.py` — `parse_arguments()`

Make `METHOD_NAME` a positional-optional argument:

```python
parser.add_argument("METHOD_NAME", nargs='?', default=None,
                    help="Name of the method to test. If omitted, generates tests for ALL business methods.")
```

Add a derived boolean for readability:

```python
FULL_SERVICE_MODE = (METHOD_NAME is None)
```

**Output directory naming** when in full-service mode:

```
{SERVICE_NAME}_FullServiceTestGeneration_{DATESTAMP}/
```

vs current single-method:

```
{SERVICE_NAME}_{METHOD_NAME}TestGeneration_{DATESTAMP}/
```

---

## 2. New Step 0: Service Discovery & Dependency Analysis

### Purpose
Before analyzing individual methods, perform a service-level pass that:
1. Discovers all **business methods** in `HPCC{ServiceName}Client.java` (excludes factory methods like `get(...)`, infrastructure like `getServiceURI()`, `getDefaultStub()`, constructors)
2. Analyzes **inter-method dependencies** (e.g., `fetchValueEncrypted` calls `fetchValue`; `setValueEncrypted` calls `setValue`; CRUD ordering)
3. Produces a **Service Dependency Analysis** document consumed by subsequent per-method steps

### New Prompt: `ServiceAnalysisPrompt.md`

Template variables: `${ServiceName}`, `${HPCC_SOURCE_DIR}`

The prompt instructs the AI to:

1. Read `HPCC{ServiceName}Client.java` and extract all public non-static, non-infrastructure methods
2. For each method, record:
   - Method signature
   - What other client methods it calls internally
   - What server-side state it creates/reads/updates/deletes
3. Build a dependency graph:
   - **Data dependencies:** method A must run before method B (e.g., `createStore` before `setValue`)
   - **Internal call dependencies:** method A delegates to method B (e.g., `fetchValueEncrypted` → `fetchValue`)
4. Classify methods into functional groups (e.g., Store Management, Key-Value CRUD, Encrypted Operations, Listing/Query)
5. Provide **test independence guidelines:**
   - Each test method should create its own test data (unique store/namespace/key names) and clean up after itself
   - Tests should NOT rely on execution order or state from other tests
   - Where a method depends on preconditions (e.g., `fetchValue` needs data set by `setValue`), the test should perform its own setup
   - Shared constants (store names, namespace names) should use test-method-unique suffixes

### Output

Two files are produced:

**1. Markdown Analysis:**
```
{SERVICE_NAME}.ServiceAnalysis_{DATESTAMP}.md
```
Contains:
- Method inventory table (name, signature, group, dependencies)
- Dependency graph (textual)
- Functional groupings
- Test independence guidelines
- Recommended method analysis order (topological sort by dependency)

**2. Method List JSON:**
```
{SERVICE_NAME}.MethodList_{DATESTAMP}.json
```

Structured, machine-readable method list that the Python orchestrator loads directly — no markdown parsing required.

```json
{
  "service": "WSStore",
  "clientClass": "HPCCWsStoreClient",
  "methods": [
    {
      "name": "ping",
      "signature": "boolean ping()",
      "group": "Health",
      "callsOtherMethods": [],
      "serverStateEffect": "Read",
      "analysisOrder": 1
    },
    {
      "name": "createStore",
      "signature": "boolean createStore(String storename, String description, String type)",
      "group": "Store Management",
      "callsOtherMethods": [],
      "serverStateEffect": "Create",
      "analysisOrder": 2
    }
  ]
}
```

The `methods` array is sorted by `analysisOrder` (topological/dependency order). The Python orchestrator iterates this array directly for Steps 1 and 2.

### Implementation in Python

```python
def run_service_discovery(service_name, output_dir, datestamp):
    """Step 0: Discover methods and analyze inter-method dependencies."""
    service_analysis_file = os.path.join(output_dir, f"{service_name}.ServiceAnalysis_{datestamp}.md")
    method_list_file = os.path.join(output_dir, f"{service_name}.MethodList_{datestamp}.json")
    copilot_generate(
        SERVICE_ANALYSIS_PROMPT_FILE,
        service_analysis_file,
        {
            "ServiceName": service_name,
            "METHOD_LIST_FILE": method_list_file,
        }
    )
    return service_analysis_file, method_list_file


def load_method_list(method_list_file):
    """Load the ordered method list from the Step 0 JSON output."""
    with open(method_list_file, 'r') as f:
        data = json.load(f)
    # Return method names in analysis order
    methods = sorted(data["methods"], key=lambda m: m["analysisOrder"])
    return [m["name"] for m in methods]
```

---

## 3. Updated Step 1: Per-Method Analysis (Looped)

### Changes

The service analysis document is passed as **additional context** into each per-method `MethodAnalysisPrompt.md` invocation. The existing prompt template is not modified — the context is appended by the Python orchestrator.

For each method discovered in Step 0:

```python
for method_name in discovered_methods:
    analysis_file = os.path.join(output_dir, f"{service_name}.{method_name}Analysis_{datestamp}.md")
    copilot_generate(
        PROMPT_FILE,  # existing MethodAnalysisPrompt.md
        analysis_file,
        {"ServiceName": service_name, "MethodName": method_name}
    )
```

The `copilot_generate` function already appends HPCC source context. We add the service analysis content as additional context in the prompt assembly. The existing `MethodAnalysisPrompt.md` already handles "Existing Test Coverage Analysis" — it will analyze the existing `WSStoreClientTest.java` and identify what's covered per method.

### Method list source

The Python script loads the ordered method list from the JSON file produced in Step 0 (`{SERVICE_NAME}.MethodList_{DATESTAMP}.json`) using `load_method_list()`. This avoids fragile markdown parsing entirely.

If the JSON file is missing or malformed, fall back to a `grep`-based extraction of public method names from the client Java file:

```python
def discover_methods_from_source(client_file_path):
    """Fallback: extract public business method names from the client Java source."""
    # grep for public methods, exclude static/infrastructure
    ...
```

---

## 4. Updated Step 2: Per-Method Test Generation (Looped)

### Changes

For each method, the existing `TestGenerationPrompt.md` is invoked with:
- The per-method analysis file (from Step 1)
- The service dependency analysis (from Step 0) — appended as context
- Additional instruction: "All tests go into `{SERVICE_NAME}ClientTest.java`. Use unique test data identifiers per test method."

Each invocation produces:
- Test code appended/merged into the single test file
- A **per-method metadata JSON** file

### Metadata Aggregation

After all methods are processed, the per-method metadata files are merged into a single aggregated file:

```
{SERVICE_NAME}.TestMetadata_{DATESTAMP}.json
```

Structure:

```json
{
  "service": "WSStore",
  "mode": "full-service",
  "testClass": "WSStoreClientTest",
  "methods": ["ping", "listNamespaces", "listNSKeys", ...],
  "tests": [
    {"testName": "...", "method": "ping", "description": "...", ...},
    {"testName": "...", "method": "listNamespaces", "description": "...", ...}
  ]
}
```

The `"method"` field is added to each test entry so results can be grouped by method in reports.

---

## 5. Steps 3 & 4: Build & Test (Mostly Unchanged)

### Step 3: Build
No changes. Build happens once after all test code is generated. The existing compilation fix loop works as-is.

### Step 4: Test Execution
Minor changes:
- `TEST_FILE_GLOB` remains `**/{SERVICE_NAME}ClientTest.java`
- Tests are loaded from the aggregated metadata JSON
- The failure analysis prompt receives all context as before
- Reports reference "Full Service" instead of a single method name

### Reporting Changes
- `FAILURE_ANALYSIS_FILE` name uses service name only (no method):
  `{SERVICE_NAME}.FailureAnalysis_{DATESTAMP}.md`
- Final report covers all methods
- UnverifiedServerIssues report covers all methods
- The `${METHOD_NAME}` variable in report prompts becomes `"AllMethods"` or the specific method from failure context

---

## 6. File & Variable Changes Summary

### New Files

| File | Purpose |
|------|---------|
| `ServiceAnalysisPrompt.md` | Step 0 prompt for service-level discovery & dependency analysis |

### Modified Files

| File | Changes |
|------|---------|
| `TestGeneratorAgent.py` | CLI arg change, Step 0 orchestration, method loop for Steps 1-2, metadata aggregation, full-service output dir |
| `TestGenerationPrompt.md` | Add `${SERVICE_ANALYSIS_FILE}` variable for dependency context; add `${METHOD_NAME}` to per-test metadata entries |

### Unchanged Files

| File | Reason |
|------|--------|
| `MethodAnalysisPrompt.md` | Service context appended by Python, not template change |
| `BatchFailureAnalysisPrompt.md` | Works on test file + failure report, method-agnostic |
| `FixTestCompilationPrompt.md` | Works on compilation errors, method-agnostic |
| `FinalReportPrompt.md` | Uses `${METHOD_NAME}` which becomes `"AllMethods"` |
| `UnverifiedServerIssuesReportPrompt.md` | Same — `${METHOD_NAME}` becomes `"AllMethods"` |

---

## 7. Detailed Python Flow (Full-Service Mode)

```
if FULL_SERVICE_MODE:
    OUTPUT_DIR = f"{SERVICE_NAME}_FullServiceTestGeneration_{DATESTAMP}"

    # Step 0: Service Discovery & Dependency Analysis
    service_analysis_file, method_list_file = run_service_discovery(SERVICE_NAME, OUTPUT_DIR, DATESTAMP)
    try:
        methods = load_method_list(method_list_file)
    except (FileNotFoundError, json.JSONDecodeError, KeyError) as e:
        print(f"⚠️  Could not load method list JSON: {e}. Falling back to source extraction.")
        methods = discover_methods_from_source(client_java_path)

    # Step 1: Per-Method Analysis (sequential)
    method_analysis_files = {}
    for method in methods:
        analysis_file = run_method_analysis(SERVICE_NAME, method, service_analysis_file)
        method_analysis_files[method] = analysis_file

    # Step 2: Per-Method Test Generation (sequential)
    method_metadata_files = {}
    for method in methods:
        metadata_file = run_test_generation(SERVICE_NAME, method,
                                            method_analysis_files[method],
                                            service_analysis_file)
        method_metadata_files[method] = metadata_file

    # Aggregate metadata
    aggregated_metadata = aggregate_metadata(method_metadata_files)

    # Step 3: Build (unchanged)
    run_build_loop()

    # Step 4: Test Execution (uses aggregated metadata)
    run_test_loop(aggregated_metadata)

else:
    # Existing single-method flow (unchanged)
    ...
```

---

## 8. Service Analysis Prompt Design (`ServiceAnalysisPrompt.md`)

The prompt must produce **two outputs**:
1. A markdown analysis file (human-readable, passed as context to later steps)
2. A JSON method list file at `${METHOD_LIST_FILE}` (machine-readable, consumed by the Python orchestrator)

Key sections the **markdown** output must contain:

### A. Method Inventory

| # | Method Name | Signature | Group | Calls Other Methods | Server State Effect |
|---|-------------|-----------|-------|---------------------|---------------------|
| 1 | `ping` | `boolean ping()` | Health | None | Read |
| 2 | `createStore` | `boolean createStore(String, String, String)` | Store Mgmt | None | Create |
| 3 | `setValue` | `boolean setValue(String, String, String, String, boolean)` | KV CRUD | None | Create/Update |
| 4 | `fetchValue` | `String fetchValue(String, String, String, boolean)` | KV CRUD | None | Read |
| 5 | `fetchValueEncrypted` | `String fetchValueEncrypted(...)` | Encrypted Ops | `fetchValue` | Read |
| ... | ... | ... | ... | ... | ... |

### B. Dependency Graph

```
createStore ──> setValue ──> fetchValue
                         ──> fetchValueEncrypted (wraps fetchValue)
                         ──> fetchKeyMetaData
                         ──> fetchAllNSKeys
                         ──> listNSKeys
                         ──> deleteValue
               listNamespaces
               deleteNamespace
listStores
ping
```

### C. Functional Groups

1. **Health:** `ping`
2. **Store Management:** `createStore`, `listStores`
3. **KV CRUD:** `setValue`, `fetchValue`, `fetchAllNSKeys`, `listNSKeys`, `fetchKeyMetaData`, `deleteValue`
4. **Encrypted Operations:** `setValueEncrypted`, `fetchValueEncrypted`
5. **Namespace Management:** `listNamespaces`, `deleteNamespace`

### D. Test Independence Guidelines

- Each test creates a uniquely-named store/namespace (e.g., `"testStore_" + methodName + "_" + randomSuffix`)
- Each test performs its own setup (e.g., a `fetchValue` test calls `setValue` first within the test body)
- Each test cleans up after itself in a `finally` block or `@After` method
- Tests must NOT depend on `@FixMethodOrder` execution ordering for correctness
- Shared helper methods (e.g., `createTestStore()`, `cleanupStore()`) should be extracted into the test class

### E. Recommended Analysis Order

Methods should be analyzed in dependency order so that the test generator understands prerequisite operations:

1. `ping`
2. `createStore`
3. `listStores`
4. `setValue`
5. `setValueEncrypted`
6. `fetchValue`
7. `fetchValueEncrypted`
8. `fetchKeyMetaData`
9. `fetchAllNSKeys`
10. `listNSKeys`
11. `listNamespaces`
12. `deleteValue`
13. `deleteNamespace`

---

## 9. Implementation Order

1. **Create `ServiceAnalysisPrompt.md`** — the new prompt template
2. **Update `parse_arguments()`** — make `METHOD_NAME` optional
3. **Add helper functions:**
   - `load_method_list(method_list_file)` — load ordered method names from Step 0 JSON output
   - `discover_methods_from_source(client_file)` — fallback grep-based discovery
   - `aggregate_metadata(method_metadata_files)` — merge per-method JSON into one
4. **Add full-service orchestration** — the `if FULL_SERVICE_MODE` branch
5. **Update `TestGenerationPrompt.md`** — add `${SERVICE_ANALYSIS_FILE}` variable, add `"method"` field to metadata schema
6. **Update report variable handling** — `METHOD_NAME` defaults to `"AllMethods"` in full-service mode
7. **Test with `WSStore`** — end-to-end validation

---

## 10. Risk Considerations

| Risk | Mitigation |
|------|------------|
| Copilot fails to create the method list JSON or produces malformed JSON | Fallback to grep-based source extraction; validate JSON schema on load |
| Sequential Copilot calls for 13 methods is slow | Acceptable per decision; can parallelize later |
| Multiple Copilot calls editing same test file may conflict | Each method's tests use unique method names; Copilot appends rather than replaces |
| Method list JSON has wrong method names or missing entries | Cross-validate against grep-based source extraction; prompt instructs strict naming from source |
| Existing tests in file may confuse per-method generation | `MethodAnalysisPrompt` already has "Existing Test Coverage Analysis" section that handles this |

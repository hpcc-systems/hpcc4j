# WsWorkunits.fastWURefresh Expected Test Results

**Generated:** 2026-01-13  
**Target Method:** `HPCCWsWorkUnitsClient.fastWURefresh(WorkunitWrapper wu)`  
**Test File Location:** `wsclient/src/test/java/org/hpccsystems/ws/client/WSWorkunitsTest.java`

---

## Test Execution Summary

This document describes the expected outcomes for each test method implemented for the `fastWURefresh` method. Tests are categorized into Core Functionality Tests (CFT), Edge Case Tests (ECT), and Error Handling Tests (EHT).

---

## Core Functionality Tests

### CFT-001: testFastWURefreshCompletedWorkunit

**Test Method:** `testFastWURefreshCompletedWorkunit()`

**Purpose:** Verify that fastWURefresh correctly refreshes a workunit in completed state and updates all data fields.

**Expected Behavior:**
- Workunit created successfully with simple ECL output
- Workunit completes within timeout period
- `fastWURefresh` executes without throwing exceptions
- Workunit wrapper is updated with correct data:
  - WUID matches the created workunit
  - State is "completed"
  - Owner field is populated
  - Jobname matches "FastRefreshTest_Completed"
- Workunit is successfully deleted in cleanup

**Pass Criteria:**
- ✓ No exceptions thrown
- ✓ `wu.getWuid()` returns correct WUID
- ✓ `wu.getState()` equals "completed" (case-insensitive)
- ✓ `wu.getOwner()` is not null
- ✓ `wu.getJobname()` equals "FastRefreshTest_Completed"

**Expected Outcome:** PASS

---

### CFT-002: testFastWURefreshRunningWorkunit

**Test Method:** `testFastWURefreshRunningWorkunit()`

**Purpose:** Verify that fastWURefresh can refresh a workunit while it is in running/submitted state.

**Expected Behavior:**
- Long-running workunit created with LOOP statement
- `fastWURefresh` called shortly after submission
- State captured is "running", "submitted", or "completed" (if it finished quickly)
- Workunit data fields populated correctly
- If state changed during refresh, fullWURefresh should be triggered
- Workunit is aborted and deleted in cleanup

**Pass Criteria:**
- ✓ No exceptions thrown
- ✓ `wu.getWuid()` returns correct WUID
- ✓ `wu.getState()` is "running", "submitted", or "completed"
- ✓ Workunit fields populated appropriately for the state

**Expected Outcome:** PASS

**Notes:** State may vary based on cluster speed. All three states are acceptable.

---

### CFT-003: testFastWURefreshFailedWorkunit

**Test Method:** `testFastWURefreshFailedWorkunit()`

**Purpose:** Verify that fastWURefresh correctly handles workunits in failed state.

**Expected Behavior:**
- Workunit created with ECL that causes failure (division by zero)
- Workunit enters failed or error state
- `fastWURefresh` executes without throwing client exceptions
- State is "failed" or "completed" (server may handle division by zero differently)
- Error information available in workunit

**Pass Criteria:**
- ✓ No client exceptions thrown
- ✓ `wu.getWuid()` returns correct WUID
- ✓ `wu.getState()` is "failed" or "completed"
- ✓ Workunit metadata populated

**Expected Outcome:** PASS

**Notes:** Some HPCC versions may handle division by zero as error or warning, resulting in "completed" state. Either outcome is acceptable.

---

### CFT-004: testFastWURefreshDetectStateChange

**Test Method:** `testFastWURefreshDetectStateChange()`

**Purpose:** Verify that state change detection triggers fullWURefresh to fetch complete workunit details.

**Expected Behavior:**
- Workunit created and immediately refreshed (state: submitted/compiled)
- After delay, second refresh detects state change
- `fullWURefresh` triggered by state change
- Final refresh after completion shows state as "completed"
- Complete workunit details available after state change

**Pass Criteria:**
- ✓ No exceptions thrown
- ✓ First and second states are not null
- ✓ Final state is "completed"
- ✓ State progression is logical (submitted → running/completed)

**Expected Outcome:** PASS

**Notes:** This test validates the core logic of detecting state changes and triggering full refresh.

---

### CFT-005: testFastWURefreshWorkunitWithResults

**Test Method:** `testFastWURefreshWorkunitWithResults()`

**Purpose:** Verify that fastWURefresh handles workunits with multiple results correctly.

**Expected Behavior:**
- Workunit created with three OUTPUT statements
- Workunit completes successfully
- `fastWURefresh` updates basic workunit information
- State is "completed"
- Owner and metadata populated

**Pass Criteria:**
- ✓ No exceptions thrown
- ✓ `wu.getState()` equals "completed"
- ✓ `wu.getOwner()` is not null
- ✓ Workunit refresh completes successfully

**Expected Outcome:** PASS

**Notes:** fastWURefresh focuses on basic state info, not full result details. Full results available after fullWURefresh triggered by state change.

---

### CFT-006: testFastWURefreshCompiledWorkunit

**Test Method:** `testFastWURefreshCompiledWorkunit()`

**Purpose:** Verify that fastWURefresh handles compiled but unsubmitted workunits.

**Expected Behavior:**
- Workunit created but not executed
- State is "created", "compiled", or similar non-running state
- `fastWURefresh` executes successfully
- State is NOT "running" or "completed"

**Pass Criteria:**
- ✓ No exceptions thrown
- ✓ `wu.getWuid()` returns correct WUID
- ✓ `wu.getState()` is not null
- ✓ State is not "running" or "completed"

**Expected Outcome:** PASS

**Notes:** Exact state name may vary by HPCC version ("created", "compiled", "unknown").

---

### CFT-008: testFastWURefreshMultipleConsecutiveRefreshes

**Test Method:** `testFastWURefreshMultipleConsecutiveRefreshes()`

**Purpose:** Verify that multiple consecutive fastWURefresh calls on the same workunit are stable.

**Expected Behavior:**
- Workunit created and completed
- Five consecutive `fastWURefresh` calls executed
- All calls succeed without errors
- WUID and state remain consistent across all calls
- No performance degradation

**Pass Criteria:**
- ✓ All 5 refresh calls complete without exception
- ✓ WUID remains consistent
- ✓ State remains "completed" throughout

**Expected Outcome:** PASS

**Notes:** Tests idempotency and stability of refresh operation.

---

## Edge Case Tests

### ECT-001: testFastWURefreshNonExistentWUID

**Test Method:** `testFastWURefreshNonExistentWUID()`

**Purpose:** Verify graceful handling of non-existent WUID with valid format.

**Expected Behavior:**
- Workunit wrapper created with WUID "W20990101-000000-1" (far future date)
- `fastWURefresh` either:
  - Completes silently with no update, OR
  - Throws `ArrayOfEspExceptionWrapper` with "not found" message
- No unexpected exceptions (NPE, etc.)

**Pass Criteria:**
- ✓ No `NullPointerException` or unexpected exceptions
- ✓ If exception thrown, message indicates "not found" or "unknown"
- ✓ Method completes without hanging

**Expected Outcome:** PASS

**Notes:** Both silent failure and exception are acceptable responses.

---

### ECT-002: testFastWURefreshMalformedWUID

**Test Method:** `testFastWURefreshMalformedWUID()`

**Purpose:** Verify handling of improperly formatted WUIDs.

**Expected Behavior:**
- Four different invalid WUID formats tested:
  - "INVALID"
  - "W12345" (incomplete)
  - "X20240115-123456-1" (wrong prefix)
  - "W2024-01-15-12:34:56" (wrong format)
- Each attempt either completes silently or throws appropriate exception
- No server crashes or JVM errors

**Pass Criteria:**
- ✓ No server crash or JVM error
- ✓ Each invalid WUID either ignored or rejected with exception
- ✓ Exceptions (if thrown) indicate validation or format errors

**Expected Outcome:** PASS

**Notes:** Server-side validation behavior may vary by HPCC version.

---

### ECT-003: testFastWURefreshEmptyWUID

**Test Method:** `testFastWURefreshEmptyWUID()`

**Purpose:** Verify handling of empty WUID string.

**Expected Behavior:**
- Workunit wrapper created with empty string WUID
- `fastWURefresh` either completes silently or throws validation exception
- No `NullPointerException`

**Pass Criteria:**
- ✓ No `NullPointerException`
- ✓ Method completes or throws appropriate exception
- ✓ If exception thrown, indicates validation error

**Expected Outcome:** PASS

---

### ECT-004: testFastWURefreshNullWUID

**Test Method:** `testFastWURefreshNullWUID()`

**Purpose:** Verify handling of null WUID in workunit wrapper.

**Expected Behavior:**
- Workunit wrapper created without setting WUID (null)
- `fastWURefresh` throws exception:
  - `NullPointerException` most likely
  - OR `ArrayOfEspExceptionWrapper` for validation error
  - OR other `Exception`
- Clear error indication

**Pass Criteria:**
- ✓ Exception thrown (NPE, validation error, or other)
- ✓ No JVM crash
- ✓ Error message is clear

**Expected Outcome:** PASS

**Notes:** Current implementation should add input validation to provide better error message.

---

### ECT-005: testFastWURefreshVeryLongJobname

**Test Method:** `testFastWURefreshVeryLongJobname()`

**Purpose:** Verify handling of workunit with extremely long jobname (1000 characters).

**Expected Behavior:**
- Workunit created with 1000-character jobname
- Workunit completes successfully
- `fastWURefresh` executes without error
- Jobname stored/retrieved correctly (possibly truncated by server)

**Pass Criteria:**
- ✓ Workunit created successfully
- ✓ `fastWURefresh` completes without exception
- ✓ State is "completed"
- ✓ Jobname is populated (may be truncated)

**Expected Outcome:** PASS

**Notes:** Server may truncate very long jobnames based on database field limits.

---

### ECT-006: testFastWURefreshSpecialCharactersInMetadata

**Test Method:** `testFastWURefreshSpecialCharactersInMetadata()`

**Purpose:** Verify correct handling of UTF-8 and special characters in workunit metadata.

**Expected Behavior:**
- Workunit created with UTF-8 characters and XML entities in jobname
- Special characters: Chinese characters, pilcrow (¶), XML entities (<, >, &, ")
- Workunit completes successfully
- `fastWURefresh` preserves character encoding
- No encoding errors

**Pass Criteria:**
- ✓ Workunit created successfully
- ✓ `fastWURefresh` completes without exception
- ✓ State is "completed"
- ✓ Jobname is populated with correct encoding

**Expected Outcome:** PASS

**Notes:** Character preservation depends on server-side encoding configuration.

---

### ECT-008: testFastWURefreshImmediatelyAfterCreation

**Test Method:** `testFastWURefreshImmediatelyAfterCreation()`

**Purpose:** Verify that fastWURefresh can be called immediately after workunit creation.

**Expected Behavior:**
- Workunit created but not submitted
- Immediate `fastWURefresh` call
- State is "created", "compiled", or similar
- Basic metadata populated

**Pass Criteria:**
- ✓ No exceptions thrown
- ✓ WUID matches created workunit
- ✓ State is populated

**Expected Outcome:** PASS

**Notes:** Tests timing edge case where workunit may still be initializing.

---

## Error Handling Tests

### EHT-001: testFastWURefreshNullWorkunitWrapper

**Test Method:** `testFastWURefreshNullWorkunitWrapper()`

**Purpose:** Verify proper exception handling when null WorkunitWrapper is passed.

**Expected Behavior:**
- `fastWURefresh` called with null parameter
- `NullPointerException` or `IllegalArgumentException` thrown
- Clear error message
- No JVM crash

**Pass Criteria:**
- ✓ Exception thrown (NPE or IllegalArgumentException)
- ✓ No JVM crash
- ✓ Clear error indication

**Expected Outcome:** PASS

**Notes:** Client should add input validation for better error messages.

---

### EHT-007: testFastWURefreshServerReturnsEmptyResponse

**Test Method:** `testFastWURefreshServerReturnsEmptyResponse()`

**Purpose:** Verify graceful handling of empty server responses.

**Expected Behavior:**
- Non-existent WUID queried
- Server may return null workunits array
- Client handles null arrays gracefully
- No `NullPointerException`

**Pass Criteria:**
- ✓ No `NullPointerException`
- ✓ Method completes or throws appropriate exception
- ✓ If exception thrown, it's `ArrayOfEspExceptionWrapper` (acceptable)

**Expected Outcome:** PASS

**Notes:** Tests defensive coding against null response arrays.

---

### EHT-009: testFastWURefreshConcurrentCalls

**Test Method:** `testFastWURefreshConcurrentCalls()`

**Purpose:** Verify thread-safety when multiple threads refresh the same workunit simultaneously.

**Expected Behavior:**
- 10 threads simultaneously call `fastWURefresh` on same WorkunitWrapper
- All threads complete successfully
- No race conditions, deadlocks, or corruption
- Final workunit state is consistent

**Pass Criteria:**
- ✓ All 10 threads complete within 30 seconds
- ✓ No exceptions thrown by any thread
- ✓ No `ConcurrentModificationException`
- ✓ WUID remains valid after all calls

**Expected Outcome:** PASS

**Notes:** The `updateState()` method is synchronized, so concurrent calls should be safe.

---

### EHT-014: testFastWURefreshDeletedWorkunit

**Test Method:** `testFastWURefreshDeletedWorkunit()`

**Purpose:** Verify handling when attempting to refresh a deleted workunit.

**Expected Behavior:**
- Workunit created, completed, then deleted
- `fastWURefresh` called on deleted WUID
- Either:
  - Completes silently with no update, OR
  - Throws `ArrayOfEspExceptionWrapper` with "not found" message
- No unexpected errors

**Pass Criteria:**
- ✓ No unexpected exceptions
- ✓ If exception thrown, message indicates "not found" or "unknown"
- ✓ Method completes gracefully

**Expected Outcome:** PASS

**Notes:** Behavior may vary based on server configuration and deletion timing.

---

## Summary of Expected Outcomes

| Test Category | Total Tests | Expected PASS | Expected SKIP | Expected FAIL |
|---------------|-------------|---------------|---------------|---------------|
| Core Functionality | 7 | 7 | 0 | 0 |
| Edge Cases | 7 | 7 | 0 | 0 |
| Error Handling | 4 | 4 | 0 | 0 |
| **TOTAL** | **18** | **18** | **0** | **0** |

---

## Notes on Test Execution

### Prerequisites
- HPCC cluster accessible at configured endpoint
- Valid credentials configured
- Thor cluster available and operational
- Sufficient permissions to create, query, and delete workunits

### Expected Test Duration
- **Fast tests** (< 5 seconds): ECT-001, ECT-002, ECT-003, ECT-004, EHT-001, EHT-007
- **Medium tests** (5-15 seconds): CFT-001, CFT-003, CFT-005, CFT-006, CFT-008, ECT-005, ECT-006, ECT-008, EHT-014
- **Slower tests** (15-60 seconds): CFT-002, CFT-004, EHT-009
- **Total estimated time**: 3-5 minutes for all tests

### Cleanup
All tests include proper cleanup in `finally` blocks to delete created workunits. Tests are isolated and do not depend on execution order (except inheriting from `@FixMethodOrder` which orders by method name).

### Platform Variations
Some test outcomes may vary slightly based on:
- HPCC platform version
- Server configuration
- Cluster performance
- Network latency

All tests are designed to accept reasonable variations while validating core functionality.

---

**Generated:** 2026-01-13  
**Document Version:** 1.0

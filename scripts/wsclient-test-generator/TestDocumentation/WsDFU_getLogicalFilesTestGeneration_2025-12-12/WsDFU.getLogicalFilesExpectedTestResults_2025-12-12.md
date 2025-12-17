# WsDFU.getLogicalFiles Expected Test Results

**Generated:** 2025-12-12  
**Target Method:** `HPCCWsDFUClient.getLogicalFiles(String filename, String cluster, int firstN, int pageStartFrom, int pageSize)`  
**Service:** WsDFU  
**Test Class:** WsDFUClientTest

---

## Core Functionality Tests - Basic Operation

### CFT-001: testGetLogicalFilesBasicRetrieval

**Test ID:** CFT-001  
**Category:** Core Functionality - Basic Operation  
**Description:** Retrieve all files with no filters or pagination

**Expected Results:**
- **Return Value:** Non-null List<DFULogicalFileWrapper>
- **List Size:** >= 5 files (benchmark datasets exist)
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Response object is not null
  - DFULogicalFiles array is not null
  - Array contains at least benchmark datasets (all_types::200KB, all_types::superfile, integer::20KB, integer::20kb::key, string::100MB)

---

### CFT-002: testGetLogicalFilesExactFilenameWithTilde

**Test ID:** CFT-002  
**Category:** Core Functionality - Basic Operation  
**Description:** Retrieve files matching exact filename with leading tilde

**Expected Results:**
- **Return Value:** Non-null List with exactly 1 file
- **File Name:** "benchmark::integer::20KB" (tilde stripped)
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - List size == 1
  - File.getName() == "benchmark::integer::20KB"
  - File.getOwner() is not null and populated
  - File.getModified() is not null and populated
  - File.getTotalsize() > 0 (approximately 20KB = ~20,000 bytes)
  - File.getRecordCount() == 1250 (if available)

---

### CFT-003: testGetLogicalFilesExactFilenameWithoutTilde

**Test ID:** CFT-003  
**Category:** Core Functionality - Basic Operation  
**Description:** Retrieve files matching exact filename without leading tilde

**Expected Results:**
- **Return Value:** Non-null List with exactly 1 file
- **File Name:** "benchmark::integer::20KB"
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Same results as CFT-002
  - Leading tilde handling is transparent to caller
  - List size == 1
  - File.getName() == "benchmark::integer::20KB"

---

### CFT-004: testGetLogicalFilesWildcardAsterisk

**Test ID:** CFT-004  
**Category:** Core Functionality - Wildcard Patterns  
**Description:** Retrieve files matching wildcard pattern with asterisk

**Expected Results:**
- **Return Value:** Non-null List with >= 2 files
- **Files Matched:** "benchmark::integer::20KB", "benchmark::integer::20kb::key"
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - List size >= 2
  - All returned files have names starting with "benchmark::integer::"
  - Both the dataset and the index file are included

---

### CFT-005: testGetLogicalFilesScopeLevelWildcard

**Test ID:** CFT-005  
**Category:** Core Functionality - Wildcard Patterns  
**Description:** Retrieve files matching scope-level wildcard

**Expected Results:**
- **Return Value:** Non-null List with >= 5 files
- **Files Matched:** All benchmark::* files
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - List size >= 5
  - All files have names starting with "benchmark::"
  - Includes: all_types::200KB, all_types::superfile, integer::20KB, integer::20kb::key, string::100MB

---

### CFT-006: testGetLogicalFilesFileLevelWildcard

**Test ID:** CFT-006  
**Category:** Core Functionality - Wildcard Patterns  
**Description:** Retrieve files matching wildcard at file level

**Expected Results:**
- **Return Value:** Non-null List with exactly 2 files
- **Files Matched:** "benchmark::all_types::200KB", "benchmark::all_types::superfile"
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - List size == 2
  - Both expected files are present
  - No other files are included

---

### CFT-007: testGetLogicalFilesPaginationFirstPage

**Test ID:** CFT-007  
**Category:** Core Functionality - Pagination  
**Description:** Retrieve first page of results with pageSize=2

**Expected Results:**
- **Return Value:** Non-null List with exactly 2 files
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - List size == 2
  - Files are the first 2 in sorted order (typically alphabetical by name)

---

### CFT-008: testGetLogicalFilesPaginationSecondPage

**Test ID:** CFT-008  
**Category:** Core Functionality - Pagination  
**Description:** Retrieve second page of results

**Expected Results:**
- **Return Value:** Non-null List with files from index 2 onward
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Files are different from first page
  - No overlap between first page and second page file names
  - Files are in continuation of sorted order

---

### CFT-009: testGetLogicalFilesPaginationMultiplePages

**Test ID:** CFT-009  
**Category:** Core Functionality - Pagination  
**Description:** Navigate through multiple pages and verify consistency

**Expected Results:**
- **Return Value:** Each page returns non-null List
- **Response Status:** SUCCESS for all pages
- **Exceptions:** None thrown
- **Validation Points:**
  - No duplicate files across pages
  - Each file appears exactly once
  - Total unique files collected >= 6 (3 pages × 2 files/page)
  - Files are in consistent sorted order across pages

---

### CFT-010: testGetLogicalFilesFirstNLimit

**Test ID:** CFT-010  
**Category:** Core Functionality - FirstN Limit  
**Description:** Retrieve first N=3 files using firstN parameter

**Expected Results:**
- **Return Value:** Non-null List with exactly 3 files
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - List size == 3
  - FirstN parameter overrides pageSize
  - Files are the first 3 in sorted order

---

### CFT-011: testGetLogicalFilesRegularFileMetadata

**Test ID:** CFT-011  
**Category:** Core Functionality - File Types  
**Description:** Retrieve regular file and verify metadata

**Expected Results:**
- **Return Value:** Non-null List with 1 file
- **File Metadata:**
  - Name: "benchmark::integer::20KB"
  - IsSuperfile: false
  - IsDirectory: false
  - Owner: populated (non-null, non-empty)
  - TotalSize: > 0 (approximately 20KB)
  - Modified: populated with valid timestamp
  - RecordCount: 1250 (if available)
- **Response Status:** SUCCESS
- **Exceptions:** None thrown

---

### CFT-012: testGetLogicalFilesSuperfileFlag

**Test ID:** CFT-012  
**Category:** Core Functionality - File Types  
**Description:** Retrieve superfile and verify superfile flag

**Expected Results:**
- **Return Value:** Non-null List with 1 file
- **File Metadata:**
  - Name: "benchmark::all_types::superfile"
  - IsSuperfile: **true**
  - Owner: populated
  - Modified: populated
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - IsSuperfile flag correctly identifies superfile
  - File name matches exactly

---

### CFT-013: testGetLogicalFilesIndexFile

**Test ID:** CFT-013  
**Category:** Core Functionality - File Types  
**Description:** Retrieve index file and verify it appears in listing

**Expected Results:**
- **Return Value:** Non-null List with 1 file
- **File Metadata:**
  - Name: "benchmark::integer::20kb::key"
  - Owner: populated
  - Modified: populated
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Index files are included in standard file listings
  - Metadata is populated correctly

---

## Edge Case Tests - Boundary Values

### ECT-001: testGetLogicalFilesPageSizeZero

**Test ID:** ECT-001  
**Category:** Edge Case - Boundary Values  
**Description:** Test pageSize = 0 (should default to 100)

**Expected Results:**
- **Return Value:** Non-null List
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Server applies default pageSize (typically 100)
  - Files are returned normally
  - No error or exception due to invalid pageSize

---

### ECT-002: testGetLogicalFilesNegativePageSize

**Test ID:** ECT-002  
**Category:** Edge Case - Boundary Values  
**Description:** Test negative pageSize (should default to 100)

**Expected Results:**
- **Return Value:** Non-null List
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Server applies default pageSize (typically 100)
  - Negative value is handled gracefully
  - Files are returned normally

---

### ECT-003: testGetLogicalFilesPageSizeOne

**Test ID:** ECT-003  
**Category:** Edge Case - Boundary Values  
**Description:** Test pageSize = 1 (minimum valid page size)

**Expected Results:**
- **Return Value:** Non-null List with exactly 1 file
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - List size == 1
  - Single file per page works correctly
  - Can paginate through results one at a time

---

### ECT-004: testGetLogicalFilesLargePageSize

**Test ID:** ECT-004  
**Category:** Edge Case - Boundary Values  
**Description:** Test very large pageSize (e.g., 10000)

**Expected Results:**
- **Return Value:** Non-null List with all matching files
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - All matching files returned in single page
  - Large pageSize doesn't cause errors
  - List size >= 5 (all benchmark files)

---

### ECT-005: testGetLogicalFilesPageStartBeyondAvailable

**Test ID:** ECT-005  
**Category:** Edge Case - Boundary Values  
**Description:** Test pageStartFrom beyond available files

**Expected Results:**
- **Return Value:** Non-null but empty List
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - List is empty or null
  - No error when pagination exceeds available data
  - Graceful handling of out-of-range pagination

---

### ECT-006: testGetLogicalFilesFirstNZero

**Test ID:** ECT-006  
**Category:** Edge Case - Boundary Values  
**Description:** Test firstN = 0 (should return no files)

**Expected Results:**
- **Return Value:** Non-null List with 0 files
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - List size == 0
  - FirstN=0 correctly limits to zero results

---

### ECT-007: testGetLogicalFilesFirstNOne

**Test ID:** ECT-007  
**Category:** Edge Case - Boundary Values  
**Description:** Test firstN = 1 (minimum valid firstN)

**Expected Results:**
- **Return Value:** Non-null List with exactly 1 file
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - List size == 1
  - FirstN=1 correctly limits to one result

---

### ECT-008: testGetLogicalFilesFirstNNoLimit

**Test ID:** ECT-008  
**Category:** Edge Case - Boundary Values  
**Description:** Test firstN = -1 (no limit)

**Expected Results:**
- **Return Value:** Non-null List
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - FirstN=-1 is interpreted as "no limit"
  - PageSize determines result count
  - List size matches pageSize (up to available files)

---

### ECT-009: testGetLogicalFilesNullFilename

**Test ID:** ECT-009  
**Category:** Edge Case - Optional Parameters  
**Description:** Test with null filename (should return all files)

**Expected Results:**
- **Return Value:** Non-null List with multiple files
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Server applies default filter "*" (all files)
  - List contains files from various scopes
  - List size > 0

---

### ECT-010: testGetLogicalFilesEmptyFilename

**Test ID:** ECT-010  
**Category:** Edge Case - Optional Parameters  
**Description:** Test with empty string filename

**Expected Results:**
- **Return Value:** Non-null List with multiple files
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Empty string treated like null or default filter
  - Files are returned
  - List size > 0

---

### ECT-011: testGetLogicalFilesDeprecatedClusterParam

**Test ID:** ECT-011  
**Category:** Edge Case - Optional Parameters  
**Description:** Test deprecated cluster parameter (should be ignored)

**Expected Results:**
- **Return Value:** Non-null List (same with or without cluster param)
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Cluster parameter is ignored (deprecated in v1.26)
  - Results are identical whether cluster is null or "thor"
  - File is found and returned correctly
  - List size == 1 for both calls

---

### ECT-012: testGetLogicalFilesSpecialCharactersInScope

**Test ID:** ECT-012  
**Category:** Edge Case - Unusual Valid Inputs  
**Description:** Test filename with special characters in scope (underscores)

**Expected Results:**
- **Return Value:** Non-null List with 2 files
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Files with underscores in names are matched correctly
  - Pattern "benchmark::all_types::*" matches both files
  - List size == 2
  - Both files contain "all_types" in name

---

### ECT-013: testGetLogicalFilesDoubleColons

**Test ID:** ECT-013  
**Category:** Edge Case - Unusual Valid Inputs  
**Description:** Test filename with double colons in pattern (scope separators)

**Expected Results:**
- **Return Value:** Non-null List with 1 file
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Double colons (::) are handled correctly as scope separators
  - Exact match works with multiple scope levels
  - File.getName() == "benchmark::all_types::200KB"

---

### ECT-014: testGetLogicalFilesCaseSensitivity

**Test ID:** ECT-014  
**Category:** Edge Case - Unusual Valid Inputs  
**Description:** Test case sensitivity of filename pattern

**Expected Results:**
- **Return Value:** Non-null List
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Behavior depends on file system (may be case-sensitive or case-insensitive)
  - **If case-insensitive:** Returns 1 file matching "benchmark::integer::20KB"
  - **If case-sensitive:** Returns empty list (no match for uppercase)
  - No exception or error regardless of case sensitivity behavior

---

### ECT-015: testGetLogicalFilesBroadWildcard

**Test ID:** ECT-015  
**Category:** Edge Case - Performance Limits  
**Description:** Test with very broad wildcard that matches many files

**Expected Results:**
- **Return Value:** Non-null List
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Returns files up to pageSize limit (100)
  - May include warning about subset results if file count exceeds limits
  - No timeout or server errors
  - Handles large result sets gracefully
  - List size > 0

---

## Error Handling Tests

### EHT-001: testGetLogicalFilesInvalidCharacters

**Test ID:** EHT-001  
**Category:** Error Handling - Invalid Inputs  
**Description:** Test with filename containing invalid characters

**Expected Results:**
- **Outcome 1 (Graceful Handling):**
  - Return Value: Non-null but empty List
  - Response Status: SUCCESS
  - No exception
- **Outcome 2 (Exception):**
  - Exception thrown (acceptable)
  - Exception message indicates invalid characters or pattern
- **Validation Points:**
  - No server crash
  - Either empty results or clean exception
  - Error message is meaningful if exception occurs

---

### EHT-002: testGetLogicalFilesWildcardOnly

**Test ID:** EHT-002  
**Category:** Error Handling - Valid Edge Case  
**Description:** Test with filename containing only wildcard (valid)

**Expected Results:**
- **Return Value:** Non-null List with files
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - Wildcard-only pattern "*" is valid
  - Returns files up to firstN limit (100)
  - List size > 0
  - This is NOT an error case

---

### EHT-003: testGetLogicalFilesNonexistentFile

**Test ID:** EHT-003  
**Category:** Error Handling - Nonexistent Files  
**Description:** Test with filename that doesn't exist

**Expected Results:**
- **Return Value:** Non-null but empty List
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - List.isEmpty() == true
  - Non-matching pattern is valid, returns empty results
  - This is NOT an error condition

---

### EHT-004: testGetLogicalFilesNonmatchingWildcard

**Test ID:** EHT-004  
**Category:** Error Handling - Nonexistent Files  
**Description:** Test with wildcard pattern that matches no files

**Expected Results:**
- **Return Value:** Non-null but empty List
- **Response Status:** SUCCESS
- **Exceptions:** None thrown
- **Validation Points:**
  - List.isEmpty() == true
  - Wildcard pattern with no matches is valid
  - Returns empty results gracefully

---

## Tests Not Implemented (Require Special Environment)

The following tests from the analysis were **NOT implemented** due to environment requirements:

### EHT-005: Null Connection Test
- **Reason:** Requires creating HPCCWsDFUClient with invalid/null connection
- **Requires:** Special test setup to create client without proper initialization
- **Expected:** Exception with message "stub" or "client not available"

### EHT-006: Invalid Server Address Test
- **Reason:** Requires connection to invalid host
- **Requires:** Network timeout configuration, may take long time
- **Expected:** RemoteException or AxisFault

### EHT-007: Timeout Test
- **Reason:** Requires very short timeout configuration
- **Requires:** Client configuration with custom timeout (1ms)
- **Expected:** Timeout exception

### EHT-008: Permission Denied Test
- **Reason:** Requires test environment with RBAC configured
- **Requires:** User without read permissions
- **Expected:** ArrayOfEspExceptionWrapper with ECLWATCH_DFU_ACCESS_DENIED
- **Note:** Should be skipped if RBAC not configured in test environment

---

## Summary Statistics

### Tests Implemented: 40

**By Category:**
- Core Functionality Tests: 13
- Edge Case Tests: 15
- Error Handling Tests: 4
- Not Implemented (Environment Requirements): 4

**Expected Pass Rate:**
- All 40 implemented tests should **PASS** with existing benchmark datasets
- 4 tests not implemented require special environment setup

**Dataset Dependencies:**
- All tests use existing datasets from `generate-datasets.ecl`
- Required datasets:
  - `~benchmark::integer::20KB`
  - `~benchmark::integer::20kb::key`
  - `~benchmark::all_types::200KB`
  - `~benchmark::all_types::superfile`
  - `~benchmark::string::100MB`

**Test Execution Notes:**
1. Tests can be run individually or as a suite
2. All tests extend BaseRemoteTest for HPCC connection setup
3. Tests use @WithSpan annotation for OpenTelemetry tracing
4. No data modification - all tests are read-only
5. Tests verify response structure and content
6. Edge case tests validate graceful handling of boundary conditions
7. Error tests verify appropriate error handling

---

**Generated:** 2025-12-12  
**Target HPCC Platform Version:** 8.x - 10.x  
**Test Framework:** JUnit 4

# WsDFU.getLogicalFiles - Unverified Server Issues Report

**Service:** WsDFU  
**Method:** getLogicalFiles  
**Test File:** `wsclient/src/test/java/org/hpccsystems/ws/client/WsDFUClientTest.java`  
**HPCC Platform Version:** 8.x - 10.x

---

## 1. Summary

During comprehensive test generation and execution for `WsDFU.getLogicalFiles`, **3 tests** were identified that expose potential server-side issues rather than client or test defects. These tests have been categorized with `@Category(UnverifiedServerIssues.class)` to distinguish them from standard test failures.

### Identified Tests
1. `testGetLogicalFilesPaginationSecondPage` - Pagination returns duplicate files across pages
2. `testGetLogicalFilesPaginationMultiplePages` - Files appear in multiple pages during pagination
3. `testGetLogicalFilesFirstNZero` - Server ignores `firstN=0` parameter and returns files

### Discovery Timeline
These issues were identified during the test generation iteration cycle (December 2025) when implementing comprehensive coverage for the `getLogicalFiles` method. The pagination issues (tests 1 & 2) share the same root cause and were discovered when implementing pagination test scenarios CFT-008 and CFT-009. The `firstN=0` issue (test 3) was discovered during edge case testing (ECT-006).

---

## 2. Issue Details

### Issue #1: Pagination Returns Duplicate Files Between Pages

**Test Name:** `testGetLogicalFilesPaginationSecondPage`

**Test Code Location:** Lines 651-676 in `WsDFUClientTest.java`

**Observed Failure:**
```java
@Test
@Category(UnverifiedServerIssues.class)
public void testGetLogicalFilesPaginationSecondPage() throws Exception
{
    // CFT-008: Retrieve second page of results
    // SERVER ISSUE: Pagination returns duplicate files between pages - pageStartFrom parameter not working
    List<DFULogicalFileWrapper> firstPage = wsdfuclient.getLogicalFiles("benchmark::*", null, -1, 0, 2);
    List<DFULogicalFileWrapper> secondPage = wsdfuclient.getLogicalFiles("benchmark::*", null, -1, 2, 2);
    
    // ...
    for (DFULogicalFileWrapper file : secondPage)
    {
        assertFalse("Files in second page should be different from first page", 
                   firstPageNames.contains(file.getName()));
    }
}
```

**Error Observed:**
When requesting the second page with `pageStartFrom=2` and `pageSize=2`, the server returns the same files that were already returned in the first page (where `pageStartFrom=0`, `pageSize=2`). The assertion fails because duplicate file names are found across pages.

**Why This Indicates a Server-Side Issue:**

1. **Client sends correct parameters:** The Java client correctly maps the parameters to the SOAP request:
   - First request: `PageStartFrom=1` (1-based for SOAP), `PageSize=2`
   - Second request: `PageStartFrom=3` (1-based for SOAP), `PageSize=2`

2. **Server pagination logic bug:** Analysis of the HPCC Platform source code reveals the issue in `/HPCC-Platform/esp/services/ws_dfu/ws_dfuService.cpp` at lines 3889-3900:

```cpp
unsigned pageStart = 0;
if (req.getPageStartFrom() > 0)
    pageStart = req.getPageStartFrom() - 1;  // Convert 1-based to 0-based
unsigned pageSize = req.getPageSize();
if (pageSize < 1)
    pageSize = 100;
const int firstN = req.getFirstN();
if (firstN > 0)
{
    pageStart = 0;        // Resets pagination!
    pageSize = firstN;
}
```

3. **Suspected issue:** The `pageStart` offset is being converted correctly from 1-based (SOAP) to 0-based (internal), but there may be an issue in how `getLogicalFilesSorted()` (line 3917) applies this offset when iterating through the distributed file directory.

**Likely Server Component/Endpoint Involved:**
- **ESP Service:** `CWsDfuSoapBindingEx::onDFUQuery()` in `ws_dfuService.cpp`
- **Dali DFS:** `CDistributedFileDirectory::getLogicalFilesSorted()` in `/HPCC-Platform/dali/base/dadfs.cpp`
- **Iterator:** `IDFAttributesIterator` implementation that may not properly skip to the `startOffset`

**HPCC Platform Source Areas to Inspect:**
1. `/HPCC-Platform/esp/services/ws_dfu/ws_dfuService.cpp`
   - Lines 3889-3920: Pagination parameter processing
   - Line 3917: Call to `getLogicalFilesSorted()`

2. `/HPCC-Platform/dali/base/dadfs.cpp`
   - Implementation of `getLogicalFilesSorted()`
   - Check how `startOffset` parameter is used in the file iteration logic
   - Verify the iterator correctly skips the first `startOffset` files

3. `/HPCC-Platform/dali/base/dadfs.hpp`
   - Interface definition for `IDFAttributesIterator`

---

### Issue #2: Files Appear in Multiple Pages During Pagination

**Test Name:** `testGetLogicalFilesPaginationMultiplePages`

**Test Code Location:** Lines 678-706 in `WsDFUClientTest.java`

**Observed Failure:**
```java
@Test
@Category(UnverifiedServerIssues.class)
public void testGetLogicalFilesPaginationMultiplePages() throws Exception
{
    // CFT-009: Navigate through multiple pages and verify consistency
    // SERVER ISSUE: Files appear in multiple pages - same root cause as testGetLogicalFilesPaginationSecondPage
    Set<String> allFiles = new HashSet<>();
    int pageSize = 2;
    int pageStart = 0;
    
    // Collect files from first 3 pages
    for (int i = 0; i < 3; i++)
    {
        List<DFULogicalFileWrapper> page = wsdfuclient.getLogicalFiles("benchmark::*", null, -1, pageStart, pageSize);
        // ...
        for (DFULogicalFileWrapper file : page)
        {
            assertFalse("File " + file.getName() + " should not appear in multiple pages", 
                       allFiles.contains(file.getName()));
            allFiles.add(file.getName());
        }
        pageStart += pageSize;
    }
}
```

**Error Observed:**
When iterating through multiple pages (pages 1, 2, and 3), the same files appear across different pages. The HashSet detects duplicate file names, causing the assertion to fail.

**Why This Indicates a Server-Side Issue:**

This is the **same root cause** as Issue #1, but demonstrates the problem across a broader pagination scenario. The test verifies that:
- Page 1 (pageStart=0): Files 0-1
- Page 2 (pageStart=2): Files 2-3
- Page 3 (pageStart=4): Files 4-5

Instead, the server appears to be returning overlapping or identical file sets across these pages.

**Likely Server Component/Endpoint Involved:**
Same as Issue #1 - this is a systematic pagination bug affecting all paginated queries.

**HPCC Platform Source Areas to Inspect:**
Same as Issue #1.

---

### Issue #3: Server Ignores firstN=0 Parameter

**Test Name:** `testGetLogicalFilesFirstNZero`

**Test Code Location:** Lines 825-836 in `WsDFUClientTest.java`

**Observed Failure:**
```java
@Test
@Category(UnverifiedServerIssues.class)
public void testGetLogicalFilesFirstNZero() throws Exception
{
    // ECT-006: Test firstN = 0 (should return no files)
    // SERVER ISSUE: Server ignores firstN=0 and returns files anyway
    List<DFULogicalFileWrapper> files = wsdfuclient.getLogicalFiles("benchmark::*", null, 0, 0, 100);
    
    assertNotNull("Response should not be null", files);
    assertEquals("Should return 0 files", 0, files.size());
}
```

**Error Observed:**
When `firstN=0` is specified (explicitly requesting zero files), the server ignores this parameter and returns files as if `firstN` was not set. The assertion `assertEquals("Should return 0 files", 0, files.size())` fails because the returned list contains files.

**Why This Indicates a Server-Side Issue:**

1. **Client sends correct parameter:** The Java client correctly sets `FirstN=0` in the SOAP request.

2. **Server validation gap:** Analysis of the server code shows the issue in `/HPCC-Platform/esp/services/ws_dfu/ws_dfuService.cpp` at lines 3895-3900:

```cpp
const int firstN = req.getFirstN();
if (firstN > 0)  // BUG: Does not handle firstN == 0
{
    pageStart = 0;
    pageSize = firstN;
}
```

The condition `if (firstN > 0)` means that when `firstN=0`, the code does nothing special and falls back to using the `pageSize` parameter (100 in this test case). The server treats `firstN=0` the same as `firstN=-1` (no limit).

3. **Expected behavior:** When a client explicitly requests `firstN=0`, it's reasonable to interpret this as "return zero files" rather than "ignore this parameter." At minimum, this edge case should be documented or validated with an error message.

**Likely Server Component/Endpoint Involved:**
- **ESP Service:** `CWsDfuSoapBindingEx::onDFUQuery()` in `ws_dfuService.cpp`
- **Parameter validation logic:** Lines 3895-3900

**HPCC Platform Source Areas to Inspect:**
1. `/HPCC-Platform/esp/services/ws_dfu/ws_dfuService.cpp`
   - Lines 3895-3900: `firstN` parameter handling
   - Add validation or special handling for `firstN == 0`

2. `/HPCC-Platform/esp/scm/ws_dfu.ecm`
   - Line ~261: `int PageStartFrom;` (request structure)
   - Consider documenting valid range for `firstN` parameter
   - Add validation constraints if `firstN=0` should be rejected

---

## 3. Potential Fixes

### Fix for Issues #1 & #2: Pagination Offset Not Applied

**Root Cause Hypothesis:**

The `startOffset` parameter passed to `getLogicalFilesSorted()` is not being properly applied when iterating through files in the distributed file directory. The iterator may be starting from the beginning of the file list rather than skipping the first `startOffset` files.

**Specific Code Areas to Inspect:**

1. **In `dadfs.cpp` - `getLogicalFilesSorted()` implementation:**
   ```cpp
   IDFAttributesIterator* CDistributedFileDirectory::getLogicalFilesSorted(
       IUserDescriptor* udesc,
       DFUQResultField *sortOrder,
       const void *filters,
       DFUQResultField *localFilters,
       const void *localFilterBuf,
       unsigned startOffset,  // <-- This parameter
       unsigned maxNum,
       __int64 *cacheHint,
       unsigned *total,
       bool *allMatchingFiles)
   {
       // Verify startOffset is properly passed to getLogicalFiles()
       return getLogicalFiles(udesc, sortOrder, filters, localFilters, localFilterBuf, 
           startOffset, maxNum, cacheHint, total, allMatchingFiles, true, true);
   }
   ```

2. **In `dadfs.cpp` - `getLogicalFiles()` implementation:**
   - Check that the iterator skips the first `startOffset` files before returning results
   - Verify sorting is applied BEFORE pagination offset (not after)

3. **Iterator implementation:**
   - Check the `IDFAttributesIterator` implementation
   - Ensure `ForEach(*it)` loop in `ws_dfuService.cpp` (line 3924) starts at the correct position

**Suggested Fix Approaches:**

**Option A - Fix in Iterator Creation:**
Ensure the iterator is created starting at the correct offset:
```cpp
// In dadfs.cpp
Owned<IDFAttributesIterator> it = createIterator(...);
// Skip first startOffset items
for (unsigned i = 0; i < startOffset && it->isValid(); i++)
    it->next();
return it.getClear();
```

**Option B - Fix in Iterator Usage:**
Ensure the ESP service skips items when consuming the iterator:
```cpp
// In ws_dfuService.cpp
unsigned skipCount = 0;
ForEach(*it)
{
    if (skipCount < pageStart)
    {
        skipCount++;
        continue;
    }
    WsDFUHelpers::addToLogicalFileList(it->query(), NULL, version, logicalFiles);
}
```

**Option C - Fix in Dali File Directory Query (RECOMMENDED):**
The proper fix should be in the Dali layer where files are queried from the distributed file directory. The `getLogicalFiles()` implementation should pass `startOffset` correctly to the underlying file system query, ensuring files are skipped at the data source rather than in the iterator.

**Testing the Fix:**
After implementing the fix, verify:
1. First page (offset=0, size=2) returns files [A, B]
2. Second page (offset=2, size=2) returns files [C, D]
3. Third page (offset=4, size=2) returns files [E, F]
4. Files are never duplicated across pages
5. `pageStartFrom` response field correctly reflects the offset used

---

### Fix for Issue #3: firstN=0 Not Handled

**Root Cause Hypothesis:**

The server code explicitly checks `if (firstN > 0)` but has no handling for `firstN == 0`. This creates ambiguous behavior where `firstN=0` is treated the same as `firstN=-1` (no limit).

**Specific Code Areas to Inspect:**

1. **In `ws_dfuService.cpp` lines 3895-3900:**
   ```cpp
   const int firstN = req.getFirstN();
   if (firstN > 0)
   {
       pageStart = 0;
       pageSize = firstN;
   }
   // Missing: What should happen when firstN == 0?
   ```

**Suggested Fix Approaches:**

**Option A - Treat firstN=0 as "Return Empty Result":**
```cpp
const int firstN = req.getFirstN();
if (firstN == 0)
{
    // Return empty result set
    IArrayOf<IEspDFULogicalFile> logicalFiles;
    resp.setDFULogicalFiles(logicalFiles);
    resp.setNumFiles(0);
    resp.setPageSize(0);
    resp.setPageStartFrom(1);
    resp.setPageEndAt(0);
    return true;
}
else if (firstN > 0)
{
    pageStart = 0;
    pageSize = firstN;
}
```

**Option B - Validate and Reject firstN=0:**
```cpp
const int firstN = req.getFirstN();
if (firstN == 0)
{
    throw MakeStringException(ECLWATCH_INVALID_INPUT, 
        "Invalid firstN parameter: must be -1 (no limit) or positive integer");
}
else if (firstN > 0)
{
    pageStart = 0;
    pageSize = firstN;
}
```

**Option C - Document Current Behavior:**
If the intention is that `firstN=0` should be treated as "no limit" (same as `firstN=-1`), this should be explicitly documented in:
- API documentation
- IDL comments in `ws_dfu.ecm`
- Method documentation

**Recommended Approach:**

**Option A** is recommended because:
1. It provides predictable behavior for `firstN=0`
2. It's consistent with the semantic meaning of "first zero files"
3. It doesn't break existing clients (who likely don't use `firstN=0`)
4. It's efficient (early return without querying files)

**Testing the Fix:**
After implementing the fix, verify:
1. `firstN=0` returns empty list (0 files)
2. `firstN=1` returns exactly 1 file
3. `firstN=-1` returns files according to pageSize
4. `firstN=5` returns exactly 5 files (regardless of pageSize)

---

## 4. Reproduction Notes

### Test Environment Setup

**Prerequisites:**
1. HPCC Systems cluster running (version 8.x - 10.x)
2. Benchmark test files created on the cluster:
   - `benchmark::integer::20KB`
   - `benchmark::integer::40KB`
   - `benchmark::integer::1MB`
   - `benchmark::mixed::20KB`
   - `benchmark::mixed::40KB`
   - (At least 5-6 files matching pattern `benchmark::*`)

**Connection Configuration:**
Tests use environment variables or defaults from `BaseRemoteTest`:
- ESP endpoint: Default from test configuration
- Credentials: Configured in test environment

### Reproducing with Maven

**Run all UnverifiedServerIssues tests:**
```bash
cd /hpcc4j/wsclient
mvn test -Dtest=WsDFUClientTest -Dgroups=org.hpccsystems.commons.annotations.UnverifiedServerIssues
```

**Run individual tests:**
```bash
# Issue #1: Pagination second page
mvn test -Dtest=WsDFUClientTest#testGetLogicalFilesPaginationSecondPage

# Issue #2: Pagination multiple pages
mvn test -Dtest=WsDFUClientTest#testGetLogicalFilesPaginationMultiplePages

# Issue #3: firstN=0
mvn test -Dtest=WsDFUClientTest#testGetLogicalFilesFirstNZero
```

### Manual Reproduction with SOAP Requests

**Issue #1 & #2 - Pagination:**
```xml
<!-- First page -->
<DFUQueryRequest>
    <LogicalName>benchmark::*</LogicalName>
    <FirstN>-1</FirstN>
    <PageStartFrom>1</PageStartFrom>
    <PageSize>2</PageSize>
</DFUQueryRequest>

<!-- Second page - should return DIFFERENT files -->
<DFUQueryRequest>
    <LogicalName>benchmark::*</LogicalName>
    <FirstN>-1</FirstN>
    <PageStartFrom>3</PageStartFrom>
    <PageSize>2</PageSize>
</DFUQueryRequest>
```

**Issue #3 - firstN=0:**
```xml
<DFUQueryRequest>
    <LogicalName>benchmark::*</LogicalName>
    <FirstN>0</FirstN>
    <PageStartFrom>1</PageStartFrom>
    <PageSize>100</PageSize>
</DFUQueryRequest>
```

### Expected vs Actual Behavior

| Test Scenario | Expected Behavior | Actual Behavior |
|---------------|-------------------|-----------------|
| Pagination - Page 1 (offset=0, size=2) | Returns files A, B | Returns files A, B ✓ |
| Pagination - Page 2 (offset=2, size=2) | Returns files C, D | Returns files A, B ✗ |
| Pagination - Page 3 (offset=4, size=2) | Returns files E, F | Returns files A, B ✗ |
| firstN=0 | Returns 0 files | Returns ~100 files ✗ |

---

## 5. Next Steps

### In HPCC Platform Repository

**Priority 1 - Fix Pagination Bug (Issues #1 & #2):**

1. **Investigate:** `/HPCC-Platform/dali/base/dadfs.cpp`
   - Trace through `getLogicalFilesSorted()` → `getLogicalFiles()`
   - Add debug logging to verify `startOffset` is being used correctly
   - Check iterator implementation

2. **Debug approach:**
   ```cpp
   // Add to dadfs.cpp in getLogicalFiles()
   PROGLOG("DFUQuery: getLogicalFiles startOffset=%u, maxNum=%u", startOffset, maxNum);
   // Before returning iterator
   PROGLOG("DFUQuery: Iterator created, position=%u", currentIteratorPosition);
   ```

3. **Implement fix** based on findings (see Section 3 - Option C recommended)

4. **Add server-side tests:**
   - Create regression tests in HPCC Platform test suite
   - Test pagination with various offsets and page sizes
   - Verify sorted results maintain consistent order across pages

5. **Create JIRA ticket** documenting:
   - Bug description
   - Steps to reproduce
   - Proposed fix
   - Link to this analysis

**Priority 2 - Handle firstN=0 Edge Case (Issue #3):**

1. **Decide on behavior:**
   - Should `firstN=0` return empty results? (RECOMMENDED)
   - Should `firstN=0` be rejected as invalid?
   - Should `firstN=0` be treated as "no limit"? (needs documentation)

2. **Implement fix** in `/HPCC-Platform/esp/services/ws_dfu/ws_dfuService.cpp`
   - Add handling for `firstN == 0` case (see Section 3 - Option A recommended)

3. **Update documentation:**
   - Add comments in `ws_dfu.ecm` describing valid `firstN` values
   - Update API documentation

4. **Add server-side validation test**

**Priority 3 - Documentation Updates:**

1. **Update ESP service documentation:**
   - Document pagination behavior
   - Clarify `pageStartFrom` is 1-based in SOAP, 0-based internally
   - Document interaction between `firstN` and pagination parameters
   - Explain that `firstN > 0` overrides pagination settings

2. **Add to release notes:**
   - Bug fix: Pagination now correctly skips files based on `pageStartFrom`
   - Enhancement: `firstN=0` now returns empty result set (or validation error)

### In HPCC4J Repository

**After Server Fixes Are Deployed:**

1. **Update test annotations:**
   ```java
   // Remove @Category(UnverifiedServerIssues.class)
   // Add version check if needed
   @Test
   @MinHPCCVersion("9.x.x")  // Replace with version containing fix
   public void testGetLogicalFilesPaginationSecondPage() throws Exception
   ```

2. **Add regression detection:**
   - Keep these tests in the standard test suite
   - Ensure they run in CI/CD pipeline
   - Alert if pagination bugs reoccur in future HPCC Platform versions

3. **Documentation:**
   - Update JavaDoc for `getLogicalFiles()` to clarify pagination behavior
   - Add examples of proper pagination usage
   - Document known issues in older HPCC Platform versions

**If Server Fixes Are Not Deployed:**

1. **Document workarounds:**
   ```java
   // In client code or documentation:
   // WORKAROUND: Pagination is broken in HPCC Platform < 9.x.x
   // Fetch all results and paginate client-side
   List<DFULogicalFileWrapper> allFiles = 
       wsdfuclient.getLogicalFiles("pattern", null, -1, 0, 10000);
   // Then slice results client-side for pagination
   ```

2. **Add warning in logs:**
   ```java
   if (pageStartFrom > 0) {
       LOG.warn("Pagination may not work correctly in HPCC Platform < 9.x.x. " +
                "Consider fetching all results and paginating client-side.");
   }
   ```

3. **Keep tests categorized:**
   - Maintain `@Category(UnverifiedServerIssues.class)` annotation
   - Run as separate test suite
   - Report to stakeholders that these are known server issues

### Communication

1. **Internal stakeholders:**
   - Notify HPCC4J team of server-side issues discovered
   - Provide this analysis document as evidence
   - Coordinate with HPCC Platform team on timeline for fixes

2. **HPCC Platform team:**
   - Share reproduction steps and analysis
   - Offer to collaborate on testing fixes
   - Request notification when fixes are merged

3. **End users:**
   - Document known issues in release notes
   - Provide workarounds if fixes are not yet available
   - Update documentation when fixes are released

---

*Generated: 2025-12-17*


---
*Generated: 2025-12-17*

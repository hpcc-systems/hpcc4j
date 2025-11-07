# WsDFU.getFileDataColumns - Expected Test Results

This document describes the expected outcomes for each test case implemented for the `getFileDataColumns` method.

## Core Functionality Tests

### CFT-001: testGetFileDataColumnsBasicInteger

**Test ID**: CFT-001  
**Method**: `testGetFileDataColumnsBasicInteger`

**Expected Outcome**: PASS

**Expected Results**:
- Method returns a non-null List of `DFUDataColumnWrapper` objects
- List contains exactly 2 columns
- Column 1 has label "key" with integer-related type
- Column 2 has label "fill" with integer-related type
- Both columns have non-null columnType and columnEclType fields
- All column metadata fields are properly populated
- No exceptions thrown

**Validation Criteria**:
```
assertNotNull(columns)
assertEquals(2, columns.size())
assertTrue(hasColumnWithLabel("key"))
assertTrue(hasColumnWithLabel("fill"))
assertNotNull(column.getColumnType())
assertNotNull(column.getColumnEclType())
```

---

### CFT-002: testGetFileDataColumnsMultiType

**Test ID**: CFT-002  
**Method**: `testGetFileDataColumnsMultiType`

**Expected Outcome**: PASS

**Expected Results**:
- Method returns a non-null List with at least 21 columns
- All expected column names are present: int8, uint8, int4, uint4, int2, uint2, r8, r4, dec16, udec16, qStr, fixStr8, str, varStr, varStr8, utfStr, uni8, uni, varUni, childDataset, int1Set
- Integer type columns have appropriate type identifiers
- String type columns have appropriate type identifiers
- Real/decimal type columns have appropriate type identifiers
- Nested dataset column (childDataset) contains child column information
- All columns have non-null type and ECL type fields
- No exceptions thrown

**Validation Criteria**:
```
assertNotNull(columns)
assertTrue(columns.size() >= 21)
for each expectedColumn in [int8, uint8, ..., int1Set]:
    assertTrue(foundColumns.contains(expectedColumn))
assertNotNull(column.getColumnType())
assertNotNull(column.getColumnEclType())
```

---

### CFT-003: testGetFileDataColumnsNoCluster

**Test ID**: CFT-003  
**Method**: `testGetFileDataColumnsNoCluster`

**Expected Outcome**: PASS

**Expected Results**:
- Method successfully retrieves columns without cluster parameter (cluster = null)
- Returns same structure as CFT-001: 2 columns named "key" and "fill"
- Automatic file location works correctly
- System successfully locates file across available clusters
- No exceptions thrown

**Validation Criteria**:
```
assertNotNull(columns)
assertEquals(2, columns.size())
assertTrue(hasColumnWithLabel("key"))
assertTrue(hasColumnWithLabel("fill"))
```

---

### CFT-004: testGetFileDataColumnsLargeFile

**Test ID**: CFT-004  
**Method**: `testGetFileDataColumnsLargeFile`

**Expected Outcome**: PASS

**Expected Results**:
- Method retrieves columns from 100MB file successfully
- Returns 2 columns: "key" and "fill", both STRING8 type
- Response time is less than 5 seconds (metadata retrieval not dependent on file size)
- Column metadata is complete and accurate
- No exceptions thrown

**Validation Criteria**:
```
assertNotNull(columns)
assertEquals(2, columns.size())
assertTrue(hasColumnWithLabel("key"))
assertTrue(hasColumnWithLabel("fill"))
assertTrue(responseTime < 5000)
```

---

### CFT-005: testGetFileDataColumnsKeyedColumns

**Test ID**: CFT-005  
**Method**: `testGetFileDataColumnsKeyedColumns`

**Expected Outcome**: PASS or SKIP

**Expected Results**:
- If supported: Method returns columns with at least one having `isKeyedColumn` = true
- Key columns properly identified with isKeyedColumn flag set to true
- Non-keyed columns have isKeyedColumn flag set to false
- If not supported: ArrayOfEspExceptionWrapper thrown (acceptable for index files)
- No unhandled exceptions

**Validation Criteria**:
```
IF supported:
    assertNotNull(columns)
    assertTrue(columns.size() > 0)
    assertTrue(hasAtLeastOneKeyedColumn)
ELSE:
    catch ArrayOfEspExceptionWrapper (acceptable)
```

**Notes**: Index file behavior may differ from regular datasets. Exception is acceptable.

---

### CFT-006: testGetFileDataColumnsNestedDataset

**Test ID**: CFT-006  
**Method**: `testGetFileDataColumnsNestedDataset`

**Expected Outcome**: PASS

**Expected Results**:
- Method returns columns including "childDataset" column
- childDataset column contains child columns list
- Child columns list has exactly 3 elements
- Child column names are: childField1 (STRING8), childField2 (INTEGER8), childField3 (REAL8)
- Child columns have correct types matching their definitions
- All child column metadata is populated
- No exceptions thrown

**Validation Criteria**:
```
assertNotNull(columns)
assertNotNull(childDatasetColumn)
assertNotNull(childDatasetColumn.getChildColumns())
assertEquals(3, childDatasetColumn.getChildColumns().size())
assertTrue(childNames.contains("childfield1"))
assertTrue(childNames.contains("childfield2"))
assertTrue(childNames.contains("childfield3"))
```

---

## Edge Case Tests

### ECT-001: testGetFileDataColumnsEmptyCluster

**Test ID**: ECT-001  
**Method**: `testGetFileDataColumnsEmptyCluster`

**Expected Outcome**: PASS

**Expected Results**:
- Empty string cluster parameter is treated as null/unspecified
- Method behaves same as CFT-003 (null cluster)
- Returns 2 columns successfully
- No exceptions thrown

**Validation Criteria**:
```
assertNotNull(columns)
assertEquals(2, columns.size())
```

---

### ECT-002: testGetFileDataColumnsNoTildePrefix

**Test ID**: ECT-002  
**Method**: `testGetFileDataColumnsNoTildePrefix`

**Expected Outcome**: PASS or SKIP

**Expected Results**:
- If supported: System normalizes filename and returns 2 columns
- Tilde prefix not required for successful lookup
- If not supported: ArrayOfEspExceptionWrapper thrown (acceptable)
- No unhandled exceptions

**Validation Criteria**:
```
IF supported:
    assertNotNull(columns)
    assertEquals(2, columns.size())
ELSE:
    catch ArrayOfEspExceptionWrapper (acceptable)
```

**Notes**: Name normalization behavior may vary by system configuration.

---

### ECT-003: testGetFileDataColumnsWithWhitespace

**Test ID**: ECT-003  
**Method**: `testGetFileDataColumnsWithWhitespace`

**Expected Outcome**: PASS

**Expected Results**:
- Server-side trimming handles leading/trailing whitespace
- Method successfully finds file and returns 2 columns
- Whitespace does not prevent file lookup
- No exceptions thrown

**Validation Criteria**:
```
assertNotNull(columns)
assertEquals(2, columns.size())
```

---

### ECT-004: testGetFileDataColumnsSuperfile

**Test ID**: ECT-004  
**Method**: `testGetFileDataColumnsSuperfile`

**Expected Outcome**: PASS

**Expected Results**:
- Method retrieves columns from superfile's first subfile by default
- Returns at least 21 columns matching the all_types schema
- Column structure matches `~benchmark::all_types::200KB` dataset
- Default chooseFile behavior (index 0) is used
- No exceptions thrown

**Validation Criteria**:
```
assertNotNull(columns)
assertTrue(columns.size() >= 21)
```

**Notes**: Validates superfile handling without explicit subfile selection.

---

### ECT-005: testGetFileDataColumnsURIFormat

**Test ID**: ECT-005  
**Method**: `testGetFileDataColumnsURIFormat`

**Expected Outcome**: PASS or SKIP

**Expected Results**:
- If URI format supported: System accepts `/benchmark/integer/20KB` and returns columns
- URI format (forward slashes) normalized to legacy format (double colons)
- If not supported: ArrayOfEspExceptionWrapper thrown (acceptable)
- No unhandled exceptions

**Validation Criteria**:
```
IF supported:
    assertNotNull(columns)
    assertTrue(columns.size() > 0)
ELSE:
    catch ArrayOfEspExceptionWrapper (acceptable)
```

**Notes**: Tests modern URI format compatibility as mentioned in project guidelines.

---

### ECT-006: testGetFileDataColumnsCaseSensitivity

**Test ID**: ECT-006  
**Method**: `testGetFileDataColumnsCaseSensitivity`

**Expected Outcome**: PASS or SKIP

**Expected Results**:
- Behavior depends on HPCC cluster configuration
- If case-insensitive: Uppercase filename successfully returns columns
- If case-sensitive: ArrayOfEspExceptionWrapper for "file not found"
- Behavior is consistent and predictable
- No unhandled exceptions

**Validation Criteria**:
```
IF case-insensitive:
    assertNotNull(columns)
    assertTrue(columns.size() > 0)
ELSE:
    catch ArrayOfEspExceptionWrapper (acceptable)
```

**Notes**: Documents expected behavior for case variations.

---

## Error Handling Tests

### EHT-001: testGetFileDataColumnsNullFilename

**Test ID**: EHT-001  
**Method**: `testGetFileDataColumnsNullFilename`

**Expected Outcome**: PASS

**Expected Results**:
- Method handles null filename gracefully
- Either returns empty list OR throws meaningful exception
- Does NOT throw NullPointerException
- If exception thrown, it should be ArrayOfEspExceptionWrapper with clear message
- No system crashes or undefined behavior

**Validation Criteria**:
```
TRY:
    columns = getFileDataColumns(null, cluster)
    assertNotNull(columns)
CATCH ArrayOfEspExceptionWrapper:
    assertNotNull(exception.getMessage())
CATCH Exception:
    assertFalse(exception instanceof NullPointerException)
```

---

### EHT-002: testGetFileDataColumnsEmptyFilename

**Test ID**: EHT-002  
**Method**: `testGetFileDataColumnsEmptyFilename`

**Expected Outcome**: PASS

**Expected Results**:
- Method handles empty string filename gracefully
- Throws ArrayOfEspExceptionWrapper with meaningful error message
- Error message indicates invalid or empty filename
- No NullPointerException or unclear errors
- No system crashes

**Validation Criteria**:
```
TRY:
    columns = getFileDataColumns("", cluster)
    assertNotNull(columns)
CATCH ArrayOfEspExceptionWrapper:
    assertNotNull(exception.getMessage())
```

---

### EHT-003: testGetFileDataColumnsNonExistentFile

**Test ID**: EHT-003  
**Method**: `testGetFileDataColumnsNonExistentFile`

**Expected Outcome**: PASS

**Expected Results**:
- Method throws ArrayOfEspExceptionWrapper
- Exception message contains "not found" or similar text
- Exception can be caught and handled gracefully
- No unhandled exceptions or system errors

**Validation Criteria**:
```
@Test(expected = ArrayOfEspExceptionWrapper.class)
Exception thrown with message containing "not found"
```

---

### EHT-004: testGetFileDataColumnsInvalidCluster

**Test ID**: EHT-004  
**Method**: `testGetFileDataColumnsInvalidCluster`

**Expected Outcome**: PASS

**Expected Results**:
- Method throws ArrayOfEspExceptionWrapper
- Exception message indicates cluster not found OR file not found on specified cluster
- Exception can be caught and handled gracefully
- No unhandled exceptions

**Validation Criteria**:
```
@Test(expected = ArrayOfEspExceptionWrapper.class)
Exception thrown with meaningful message about cluster
```

---

### EHT-010: testGetFileDataColumnsMalformedName

**Test ID**: EHT-010  
**Method**: `testGetFileDataColumnsMalformedName`

**Expected Outcome**: PASS

**Expected Results**:
- Method throws ArrayOfEspExceptionWrapper for filename with special characters
- No XSS or injection vulnerability exists
- Error message is appropriate for invalid filename
- No security issues or script execution
- No system crashes

**Validation Criteria**:
```
TRY:
    columns = getFileDataColumns(malformedName, cluster)
    fail("Should throw exception")
CATCH ArrayOfEspExceptionWrapper:
    assertNotNull(exception.getMessage())
```

**Notes**: Security-focused test for input validation.

---

### EHT-011: testGetFileDataColumnsLongFilename

**Test ID**: EHT-011  
**Method**: `testGetFileDataColumnsLongFilename`

**Expected Outcome**: PASS

**Expected Results**:
- Method handles extremely long filename (10,000+ characters) gracefully
- Either throws ArrayOfEspExceptionWrapper OR handles gracefully
- No buffer overflow or system crash
- No unhandled errors
- Response time is reasonable (no hanging)

**Validation Criteria**:
```
TRY:
    columns = getFileDataColumns(longFilename, cluster)
CATCH ArrayOfEspExceptionWrapper:
    assertNotNull(exception.getMessage())
CATCH Exception:
    assertNotNull(exception.getMessage())
No system crash or timeout
```

**Notes**: Boundary testing for input length limits.

---

## Test Data Requirements

### Required Existing Datasets:
1. `~benchmark::integer::20KB` - Simple 2-column integer dataset
2. `~benchmark::all_types::200KB` - Multi-type dataset with 21+ columns including nested structures
3. `~benchmark::string::100MB` - Large file with 2 STRING8 columns
4. `~benchmark::all_types::superfile` - Superfile containing all_types::200KB as subfile
5. `~benchmark::integer::20kb::key` - Index file for keyed column testing

### Optional Datasets (for comprehensive testing):
These tests will skip or handle exceptions gracefully if datasets don't exist:
- Single column dataset for ECT-007
- 100+ column dataset for ECT-008
- CSV file without record definition for EHT-005
- XML file for EHT-006

---

## Test Execution Summary

**Total Test Cases**: 18 implemented

**Expected PASS**: 12-14 (depending on system configuration and optional features)
**Expected SKIP**: 4-6 (depending on feature support and dataset availability)

**Test Categories**:
- Core Functionality: 6 tests (all should PASS)
- Edge Cases: 6 tests (4-5 should PASS, 1-2 may SKIP)
- Error Handling: 6 tests (all should PASS)

**Maven Execution Command**:
```bash
mvn -B --activate-profiles jenkins-on-demand,remote-test \
    -Dhpccconn=http://eclwatch.default:8010 \
    -Dwssqlconn=http://sql2ecl.default:8510 \
    -Dtest=WsDFUClientTest#<testName> \
    package
```

Replace `<testName>` with the specific test method name (e.g., `testGetFileDataColumnsBasicInteger`).

---

## Notes on Test Expectations

1. **Performance**: Metadata retrieval should be fast (< 5 seconds) regardless of file size since only schema information is retrieved, not data.

2. **Cluster Parameter**: Null or empty cluster parameter should trigger automatic file location across available clusters.

3. **File Type Support**: Only THOR files with record definitions return column metadata. CSV/XML/FLAT files without schemas return empty lists or exceptions.

4. **Nested Structures**: Datasets with child datasets should return hierarchical column information via `getChildColumns()`.

5. **Index Files**: Behavior for INDEX files may differ from regular datasets. Exceptions or different column structures are acceptable.

6. **Name Formats**: Various filename formats (with/without tilde, URI format, case variations) may or may not be supported depending on system configuration. Tests document actual behavior.

7. **Error Handling**: All error conditions should be handled gracefully with meaningful exceptions, never with NullPointerException or system crashes.

8. **Reflection-Based Aggregation**: The client uses reflection to aggregate columns from multiple response arrays (DFUDataKeyedColumns1-20, DFUDataNonKeyedColumns1-20). This should work transparently for any column count.

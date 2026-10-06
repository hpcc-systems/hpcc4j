## 🔍 File Search Strategy

> ⚠️ **Important**: File and directory names may differ in capitalisation or have minor naming differences from what is expected. **Always use fuzzy/case-insensitive searches** — never assume an exact path is correct.
>
> ⚠️ **Always search from the project root directories provided in the context above** (HPCC4J Project Root and HPCC Platform Source Root). Do NOT use `.` as a search root — the script may be run from a different directory and `.` will not be the project root.

**When locating test result files or any other artifacts:**

1. **Use `find -iname` from the HPCC4J project root** (case-insensitive), not from `.`:
   ```bash
   find <HPCC4J_PROJECT_ROOT> -iname "*TestResults_Iteration*" -type f
   find <HPCC4J_PROJECT_ROOT> -iname "*BatchAnalysis*" -type f
   find <HPCC4J_PROJECT_ROOT> -iname "*FailureReport*" -type f
   ```

2. **Try multiple name variants** if the first search returns nothing:
   - With and without the `Ws`/`WS` prefix
   - All-lowercase, PascalCase variants
   - Partial name globs

3. **Use `grep -ril` from the project root** to find files by content if name-based search fails.

4. **Never give up after one failed search** — try at least 3 different variants/strategies before treating a file as missing.

---

Create a final comprehensive test report for ${SERVICE_NAME}.${METHOD_NAME} that includes:

1. **Test Execution Summary**
   - Total iterations: ${ITERATION}
   - Total tests in suite: ${TOTAL_TESTS}
   - Final test status: ${FINAL_PASSED} passed, ${FINAL_FAILED} failed
   - Test metadata file: ${TEST_METADATA_FILE}
   - Latest results file: ${LATEST_RESULTS_FILE}
   - **Total lines of Java test code generated** (count all non-blank, non-comment lines in the
     generated test class)

2. **Test Category Breakdown**
   - Count tests per category: CFT, ECT, EHT, CNT
   - Environment requirements matrix: which environments each test targets

3. **Server Issues Identified**
   For each distinct server-side issue found (tests annotated `@Category(UnverifiedServerIssues.class)`):
   - **Issue title** (1 sentence)
   - **Affected test(s)**: list of test method names
   - **Symptom**: exact error/exception observed
   - **Likely cause**: hypothesis for the root cause in the server implementation
   - **Suggested server-side fix**: brief description

4. **Client Issues Fixed**
   For each client-side fix applied during the test-fix iterations:
   - **Fix description**: what was wrong and how it was corrected
   - **Affected test(s)**: list of test method names
   - **Fix type**: test logic / API usage / data setup / compilation

5. **Issue Categories**
   - List all tests with @Category(UnverifiedClientIssues.class)
   - List all tests with @Category(UnverifiedServerIssues.class)
   - List all tests that were fixed and now pass

6. **Detailed Findings**
   - Client-side issues discovered and resolved
   - Server-side issues discovered (unresolved)
   - Test case problems corrected

7. **Individual Test Results**
   For each test, include:
   - Test name, label (CFT-001-MethodName), and category
   - Pass/Fail status
   - Required environments
   - Description and expected outcome
   - Any issues or notes

8. **Recommendations**
   - Priority items for client-side fixes
   - Priority items for server-side fixes
   - Test coverage improvements

9. **Next Steps**
   - Actions required before merging
   - Items requiring manual investigation
   - Follow-up work needed

Review all test result files (*TestResults_Iteration*.json) and analysis files to compile this report.

**IMPORTANT**: Include a datestamp at the end of the report:
```markdown
---
*Generated: ${DATESTAMP}*
```

Save this report to: ${FINAL_REPORT_PATH}

Create a final comprehensive test report for ${SERVICE_NAME}.${METHOD_NAME} that includes:

1. **Test Execution Summary**
   - Total iterations: ${ITERATION}
   - Total tests in suite: ${TOTAL_TESTS}
   - Final test status: ${FINAL_PASSED} passed, ${FINAL_FAILED} failed
   - Test metadata file: ${TEST_METADATA_FILE}
   - Latest results file: ${LATEST_RESULTS_FILE}

2. **Issue Categories**
   - List all tests with @Category(UnverifiedClientIssues.class)
   - List all tests with @Category(UnverifiedServerIssues.class)
   - List all fixed tests

3. **Detailed Findings**
   - Client-side issues discovered
   - Server-side issues discovered
   - Test case problems corrected

4. **Individual Test Results**
   For each test, include:
   - Test name and category
   - Pass/Fail status
   - Description and expected outcome
   - Any issues or notes

5. **Client side Fixes**
    - Summary of fixes made to the Java client code

6. **Recommendations**
   - Priority items for client-side fixes
   - Priority items for server-side fixes
   - Test coverage improvements

7. **Next Steps**
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

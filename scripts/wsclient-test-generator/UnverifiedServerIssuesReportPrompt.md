Create a separate report for **Unverified Server Issues** found while testing ${SERVICE_NAME}.${METHOD_NAME}.

This report must be generated **only** when there are tests categorized with `@Category(UnverifiedServerIssues.class)`.

## Inputs

- Service: `${SERVICE_NAME}`
- Method: `${METHOD_NAME}`
- Test file: `${TEST_FILE_PATH}`
- Unverified server-issue tests:
${UNVERIFIED_SERVER_TESTS}

- Review supporting artifacts in `${OUTPUT_DIR}`:
  - `*FailureReport_Iteration*_${DATESTAMP}.md`
  - `*BatchAnalysis_Iteration*_${DATESTAMP}.md`
  - `*TestResults_Iteration*_${DATESTAMP}.json`
  - `${ANALYSIS_FILE}`

## What to Produce

Write a markdown report that documents:

1. **Summary**
   - How many UnverifiedServerIssues tests were identified
   - Which iterations surfaced them (if determinable)

2. **Issue Details (per test)**
   For each test in the list:
   - Test name
   - Observed failure/error (quote the relevant snippet)
   - Why it indicates a server-side issue (not a client/test defect)
   - Likely server component / endpoint involved
   - Links to likely HPCC Platform source areas to inspect (paths under `${HPCC_SOURCE_DIR}`)

3. **Potential Fixes**
   - Concrete hypotheses for root cause
   - Specific code areas/functions to inspect
   - Suggested fix approaches (validation, response shaping, error handling, edge-case logic)

4. **Reproduction Notes**
   - Any datasets or prerequisites implied by the tests/metadata
   - How to reproduce with Maven commands already used by the agent

5. **Next Steps**
   - What to do in HPCC Platform
   - What to do in HPCC4J (if anything)

**IMPORTANT**: Include a datestamp at the end of the report:
```markdown
---
*Generated: ${DATESTAMP}*
```

Save this report to: ${UNVERIFIED_SERVER_REPORT_PATH}

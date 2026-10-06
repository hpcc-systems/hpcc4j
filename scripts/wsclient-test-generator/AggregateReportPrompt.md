## 🔍 File Search Strategy

> ⚠️ **Important**: File and directory names may differ in capitalisation or have minor naming differences from what is expected. **Always use fuzzy/case-insensitive searches** — never assume an exact path is correct.
>
> ⚠️ **Always search from the project root directories provided in the context above** (HPCC4J Project Root and HPCC Platform Source Root). Do NOT use `.` as a search root — the script may be run from a different directory and `.` will not be the project root.

**When locating per-environment result files:**

1. **Use `find -iname` from the HPCC4J project root** (case-insensitive), not from `.`:
   ```bash
   find <HPCC4J_PROJECT_ROOT> -iname "*FinalReport_*" -type f
   find <HPCC4J_PROJECT_ROOT> -iname "*TestResults_Iteration*" -type f
   find <HPCC4J_PROJECT_ROOT> -iname "*UnverifiedServerIssuesReport*" -type f
   ```

2. **Try multiple name variants** if the first search returns nothing:
   - With and without the `Ws`/`WS` prefix
   - All-lowercase, PascalCase variants
   - Partial name globs

3. **Use `grep -ril` from the project root** to find files by content if name-based search fails.

4. **Never give up after one failed search** — try at least 3 different variants/strategies before treating a file as missing.

---

Create a unified cross-environment aggregate test report for **${SERVICE_NAME}** that consolidates
results from all environments tested during this run (dated **${DATESTAMP}**).

## Inputs

The following per-environment result files were produced during this run. **Read all of them** before
writing the report.

### Per-environment FinalReport files
${PER_ENV_FINAL_REPORTS}

### Per-environment TestResults JSON files (use the highest iteration number per env)
${PER_ENV_RESULTS_JSONS}

### Per-environment UnverifiedServerIssues reports (may be empty)
${PER_ENV_SERVER_ISSUE_FILES}

All files above are located in: `${OUTPUT_DIR}`

---

## What to Produce

Write the aggregate report to: `${OUTPUT_DIR}/${SERVICE_NAME}.AllEnvAggregateReport_${DATESTAMP}.md`

The report must include all of the following sections:

---

### 1. Executive Summary

- Service name and test run date
- List of environments tested (containerized, baremetal, secure, etc.)
- Total unique tests across all environments
- Overall pass rate per environment (table)
- Number of server-side issues discovered (deduplicated across envs)
- Number of client-side fixes applied

---

### 2. Cross-Environment Coverage Matrix

A table where:
- **Rows** = individual test names
- **Columns** = environment names
- **Cells** = ✅ PASS, ❌ FAIL, ⚠️ CATEGORIZED (UnverifiedServerIssues or UnverifiedClientIssues), ➖ NOT RUN

Include the test's `category` label (e.g. CFT-001, EHT-003) next to each test name.

---

### 3. Per-Environment Summary

For each environment, a brief section:
- **Environment name** and description
- Total tests run, passed, failed, categorized
- Number of iterations before final state
- Any environment-specific behaviour worth noting

---

### 4. Server-Side Issues (Deduplicated)

For each distinct server-side issue found across all environments:
- **Issue ID** (e.g. SI-001, SI-002)
- **Affected tests** (list all test names across all envs exhibiting this issue)
- **Environments affected** (e.g. baremetal, secure)
- **Symptom**: exact error / exception text observed
- **Likely cause**: hypothesis for the root cause in the server implementation
- **Suggested fix**: brief description of what should be changed server-side
- **Priority**: Critical / High / Medium / Low

> Deduplicate: if the same error appears in multiple environments for the same test, count it as ONE issue.

---

### 5. Client-Side Fixes Applied

For each client-side fix that was applied during the test-fix iterations:
- **Fix description**: what was wrong and how it was corrected
- **Affected tests**: list of test method names
- **Fix type**: test logic / API usage / data setup / compilation / assertion
- **Environment(s)**: which env(s) surfaced this fix

---

### 6. Issue Category Summary

A concise listing of all tests by annotation category:
- Tests with `@Category(UnverifiedClientIssues.class)` — list name + environment(s)
- Tests with `@Category(UnverifiedServerIssues.class)` — list name + environment(s)
- Tests that were fixed and now pass consistently across all required envs

---

### 7. Detailed Individual Test Results

For each unique test in the suite:
- **Test name** and label (e.g. CFT-001-methodName)
- **Category** (CoreFunctionalityTests / EdgeCaseTests / ErrorHandlingTests / ConnectivityTests)
- **Required environments** (`environmentRequirements` field)
- **Per-env status** (pass/fail/categorized/not-run)
- **Description** and expected outcome
- **Notes**: any per-env differences in behaviour

---

### 8. Recommendations

Prioritised list of actions:
1. Server-side fixes required before this service can be considered stable
2. Client-side / test improvements for next iteration
3. Test coverage gaps (missing scenarios or environment combinations)
4. Environments-specific issues that warrant investigation

---

### 9. Next Steps

- Actions required before merging the generated test class
- Which server-side bugs should be filed as issues
- Any follow-up test generation needed

---

**IMPORTANT**: Include a datestamp footer at the end of the report:
```
---
*Generated: ${DATESTAMP}*
```

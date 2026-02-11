---
id: jira-HPCC4J-699
title: HPCC4J-699 – Spark-HPCC test suite needs to generate FailedTests file
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-699"
project: HPCC4J
key: HPCC4J-699
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-03-19
updated: 2025-05-02
resolved: 2025-05-02
components:   - Spark
fixVersions:
  - 9.12.0
  - 9.10.26
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: high
tags:
- jira
- change-log
- rationale
pull_requests: []
---
## Outcome (from JIRA)
Spark-HPCC test suite needs to generate FailedTests file

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Add TestListener to Spark-HPCC to allow for generation of failed tests list"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Add Spark-HPCC failed test file to test suite in 9.10.x"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

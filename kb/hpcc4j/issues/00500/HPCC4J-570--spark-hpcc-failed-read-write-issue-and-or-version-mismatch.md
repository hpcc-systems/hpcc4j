---
id: jira-HPCC4J-570
title: "HPCC4J-570 – Spark-HPCC: Failed Read / Write Issue and / or version mismatch"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-570"
project: HPCC4J
key: HPCC4J-570
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-01-25
updated: 2024-08-15
resolved: 2024-08-15
components:   - Spark
fixVersions: []
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
Spark-HPCC: Failed Read / Write Issue and / or version mismatch

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Spark-HPCC 9.2.x, HPCC 8.10, Spark 3.4.1"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Connection / job start successful"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Meta-data transfer succeeds"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "No errors in logs"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Failure in both custom PySpark code and repo examples"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

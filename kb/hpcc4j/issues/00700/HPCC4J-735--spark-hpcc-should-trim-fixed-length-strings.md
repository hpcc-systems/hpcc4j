---
id: jira-HPCC4J-735
title: HPCC4J-735 – spark-hpcc should trim fixed length strings
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-735"
project: HPCC4J
key: HPCC4J-735
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-08-15
updated: 2025-09-23
resolved: null
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
---
## Outcome (from JIRA)
spark-hpcc should trim fixed length strings

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The default for spark-hpcc should be to trim all strings. This option is already implemented in hpcc4j and only needs to be exposed to the spark interface."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

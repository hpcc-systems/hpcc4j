---
id: jira-HPCC4J-472
title: HPCC4J-472 – WSSQLClient should only use wrapped objects
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-472"
project: HPCC4J
key: HPCC4J-472
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-07-15
updated: 2022-07-19
resolved: 2022-07-19
components:   - WSClient
fixVersions:   - 8.8.0
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
WSSQLClient should only use wrapped objects

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "executePreparedSQL should use wrapped NamedPair"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

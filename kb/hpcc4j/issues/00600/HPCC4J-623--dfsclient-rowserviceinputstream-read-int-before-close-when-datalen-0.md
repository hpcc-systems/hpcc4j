---
id: jira-HPCC4J-623
title: "HPCC4J-623 – DFSClient: RowServiceInputStream read int before close when dataLen == 0"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-623"
project: HPCC4J
key: HPCC4J-623
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-08-01
updated: 2024-08-01
resolved: 2024-08-01
components: []
fixVersions:
  - 9.2.110
  - 9.4.84
  - 9.6.36
  - 9.8.10
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
DFSClient: RowServiceInputStream read int before close when dataLen == 0

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

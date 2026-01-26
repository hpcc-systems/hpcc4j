---
id: jira-HPCC4J-138
title: HPCC4J-138 – Create DAFILESRV client subproject
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-138"
project: HPCC4J
key: HPCC4J-138
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-11-08
updated: 2019-03-05
resolved: 2019-01-22
components:   - BuildPackaging
fixVersions:   - 7.2.0
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
Create DAFILESRV client subproject

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Create new \"dafilsrvclient\" JAPI subproject. Logic will provide DFU file access via WsDFU + DAFILESRV. To be extended by Spark-HPCC"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

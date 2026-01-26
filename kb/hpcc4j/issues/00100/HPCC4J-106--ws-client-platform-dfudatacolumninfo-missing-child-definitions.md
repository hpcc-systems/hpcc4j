---
id: jira-HPCC4J-106
title: HPCC4J-106 – ws.client.platform.DFUDataColumnInfo missing child definitions
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-106"
project: HPCC4J
key: HPCC4J-106
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-10-06
updated: 2018-07-18
resolved: 2018-07-18
components:   - WSClient
fixVersions:   - 1.4.0
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
ws.client.platform.DFUDataColumnInfo missing child definitions

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The child definitions should be returned by getChildColumns() but are not. \u00a0The childColumns member is a List but is not being populated."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-280
title: "HPCC4J-280 – DFSClient: RowServiceInputStream Should use cursor for subsequent requests by default"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-280"
project: HPCC4J
key: HPCC4J-280
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-02-19
updated: 2020-02-19
resolved: 2020-02-19
components:   - dfsclient
fixVersions:   - 7.6.30
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
DFSClient: RowServiceInputStream Should use cursor for subsequent requests by default

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Change RowServiceInputStream to use the cursor by default."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

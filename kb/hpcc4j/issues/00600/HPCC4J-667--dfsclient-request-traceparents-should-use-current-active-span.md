---
id: jira-HPCC4J-667
title: "HPCC4J-667 – DFSClient: Request traceparents should use current active span"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-667"
project: HPCC4J
key: HPCC4J-667
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-12-03
updated: 2024-12-10
resolved: 2024-12-10
components:   - dfsclient
fixVersions:   - 9.8.46
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
DFSClient: Request traceparents should use current active span

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "RowServiceInputStream is currently using the top level read span as the trace parent it sends to the row service with requests. This is a hold over from when individual requests were traced as events instead of batched requests."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

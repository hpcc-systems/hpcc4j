---
id: jira-HPCC4J-609
title: "HPCC4J-609 – DFSReadWriteTest: Increase delimited dataset sizes"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-609"
project: HPCC4J
key: HPCC4J-609
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-05-30
updated: 2024-06-17
resolved: 2024-06-17
components:   - dfsclient
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
DFSReadWriteTest: Increase delimited dataset sizes

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Need to increase the size of the delimited test files, so that they require more than one read request."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

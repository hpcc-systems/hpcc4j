---
id: jira-HPCC4J-595
title: HPCC4J-595 – Enhance error logging in BinaryRecordReader & RowServiceInputStream
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-595"
project: HPCC4J
key: HPCC4J-595
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-04-18
updated: 2024-05-21
resolved: 2024-05-21
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
Enhance error logging in BinaryRecordReader & RowServiceInputStream

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "It is difficult to know precisely why a read failed from a certain node. Include additional information when throwing errors from these classes' methods to make it easier to determine how and why an error occurred."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

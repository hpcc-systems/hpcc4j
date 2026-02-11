---
id: jira-HPCC4J-325
title: "HPCC4J-325 – DFSClient: BinaryRecordReader not correctly handling integer overflow for non standard types"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-325"
project: HPCC4J
key: HPCC4J-325
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-08-28
updated: 2020-09-15
resolved: 2020-09-15
components:   - dfsclient
fixVersions:   - 7.10.x
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
DFSClient: BinaryRecordReader not correctly handling integer overflow for non standard types

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Non-standard integers (3,5,6,7) are not overflowing as would be expected."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

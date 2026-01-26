---
id: jira-HPCC4J-556
title: "HPCC4J-556 – DFSClient: Undefined behavior when closing file reader early"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-556"
project: HPCC4J
key: HPCC4J-556
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-11-16
updated: 2023-11-20
resolved: 2023-11-20
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
DFSClient: Undefined behavior when closing file reader early

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Closing a DFSClient HPCCRemoteFileReader before the entire file has been read has varying and undefined behavior depending on when the file reader is closed."}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "In most situations an early close won't cause an issue and will result in a partial reading of the file, however there are edge cases that can cause records to be corrupted."}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The file reader can also report that there are still records available to read after being closed because the inputstream still has data available."}]}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Defined behavior:"}]}, {"type": "bulletList", "content": [{"type": "listItem", "c

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

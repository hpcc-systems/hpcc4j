---
id: jira-HPCC4J-240
title: "HPCC4J-240 – DFSClient: RowServiceInputStream should prefetch data on a background thread"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-240"
project: HPCC4J
key: HPCC4J-240
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-10-11
updated: 2020-02-07
resolved: 2020-02-07
components:   - dfsclient
fixVersions:   - 7.6.26
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
DFSClient: RowServiceInputStream should prefetch data on a background thread

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "RowServiceInputStream should prefetch data on a background thread as a performance improvement. It might be beneficial to allow the prefetch operations to be run by a shared thread for all RowServiceInputStreams"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-282
title: "HPCC4J-282 – DFSClient: RowServiceInputStream prefetch thread exiting before end of stream"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-282"
project: HPCC4J
key: HPCC4J-282
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-02-20
updated: 2020-03-03
resolved: 2020-03-03
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
DFSClient: RowServiceInputStream prefetch thread exiting before end of stream

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Prefetch thread can exit early in a race condition causing record building thread to lock up."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

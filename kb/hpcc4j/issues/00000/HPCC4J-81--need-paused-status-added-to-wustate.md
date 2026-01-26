---
id: jira-HPCC4J-81
title: HPCC4J-81 – Need PAUSED status added to WUState
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-81"
project: HPCC4J
key: HPCC4J-81
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-07-20
updated: 2017-08-31
resolved: 2017-08-03
components:   - WSClient
fixVersions:   - 1.2.0
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
Need PAUSED status added to WUState

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The status \"Paused\" in later versions of the platform isn't reflected in WUState. This is causing problems in HIPIE when trying to get paused workunits."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

## Related
- 01. Relates: HPCC4J-86
- 01. Relates: HPCC4J-82

---
id: jira-HPCC4J-120
title: HPCC4J-120 – Multiple sub-file support for Get File Metadata
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-120"
project: HPCC4J
key: HPCC4J-120
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-07-05
updated: 2018-07-13
resolved: 2018-07-13
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
Multiple sub-file support for Get File Metadata

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The current implementation throws an exception when there are more than one sub-file. \u00a0We need to have a way to handle multiple sub-files well enough to get the sub-file list."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

## Related
- 02. Blocks: HPCC-20039

---
id: jira-HPCC4J-160
title: HPCC4J-160 – Add missing methods to HPCCWsDFUClient and DFUCreateFileWrapper
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-160"
project: HPCC4J
key: HPCC4J-160
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-03-15
updated: 2019-03-15
resolved: 2019-03-15
components: []
fixVersions:   - 7.2.0
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
Add missing methods to HPCCWsDFUClient and DFUCreateFileWrapper

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "HPCCWsDFUClient is missing a createFile method without a partitions map, and DFUCreateFileWrapper is missing a getFileAccessInfo method"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-439
title: HPCC4J-439 – add isTlkIndex() method to HPCCFIle
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-439"
project: HPCC4J
key: HPCC4J-439
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-10-11
updated: 2021-10-18
resolved: 2021-10-18
components:   - dfsclient
fixVersions:   - 8.4.6
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
add isTlkIndex() method to HPCCFIle

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "add a method to HPCCFile to determine whether the file being read is an index that has a tlk partition."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

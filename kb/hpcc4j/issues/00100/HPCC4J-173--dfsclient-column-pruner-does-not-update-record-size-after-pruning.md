---
id: jira-HPCC4J-173
title: "HPCC4J-173 – DFSClient: Column pruner does not update record size after pruning."
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-173"
project: HPCC4J
key: HPCC4J-173
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-04-12
updated: 2019-04-17
resolved: 2019-04-17
components:   - dfsclient
fixVersions:   - 7.2.6
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
DFSClient: Column pruner does not update record size after pruning.

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Column pruner does update the record size after pruning. This could probably be set to 0 if records were pruned to force dafilesrv to calculate record length"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

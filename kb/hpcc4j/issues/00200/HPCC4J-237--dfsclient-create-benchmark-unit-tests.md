---
id: jira-HPCC4J-237
title: "HPCC4J-237 – DFSClient: Create benchmark unit tests"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-237"
project: HPCC4J
key: HPCC4J-237
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-10-04
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
DFSClient: Create benchmark unit tests

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Benchmark unit tests should be created to more easily track the affect of changes on performance. Tests should cover reading and writing with a number of different record layouts."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

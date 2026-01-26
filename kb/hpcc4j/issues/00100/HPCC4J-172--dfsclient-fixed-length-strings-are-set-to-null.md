---
id: jira-HPCC4J-172
title: "HPCC4J-172 – DFSClient: Fixed length strings are set to null"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-172"
project: HPCC4J
key: HPCC4J-172
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
DFSClient: Fixed length strings are set to null

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Reading a dataset with fixed length strings results in null values."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

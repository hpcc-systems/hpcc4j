---
id: jira-HPCC4J-7
title: HPCC4J-7 – HPCCWsDFUClient.getDatasetFields returns a single STRING Field1 field for files with child datasets
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-7"
project: HPCC4J
key: HPCC4J-7
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2015-06-11
updated: 2015-11-03
resolved: 2015-11-03
components:   - WSClient
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
HPCCWsDFUClient.getDatasetFields returns a single STRING Field1 field for files with child datasets

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The ArrayList of DFUDataColumns returns a single item of type STRING named Field1 for any dataset that contains a field that's a child dataset"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

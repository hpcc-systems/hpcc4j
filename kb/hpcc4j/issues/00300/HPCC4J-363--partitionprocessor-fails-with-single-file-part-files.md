---
id: jira-HPCC4J-363
title: HPCC4J-363 – PartitionProcessor fails with single file part files
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-363"
project: HPCC4J
key: HPCC4J-363
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-11-19
updated: 2020-12-01
resolved: 2020-12-01
components:   - dfsclient
fixVersions:   - 7.12.x
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
PartitionProcessor fails with single file part files

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Partition processor throws an array out of bounds exception when processing files with a single partition."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

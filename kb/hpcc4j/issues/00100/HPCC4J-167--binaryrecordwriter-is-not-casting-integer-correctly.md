---
id: jira-HPCC4J-167
title: HPCC4J-167 – BinaryRecordWriter is not casting Integer correctly
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-167"
project: HPCC4J
key: HPCC4J-167
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-03-29
updated: 2019-04-01
resolved: 2019-04-01
components:   - dfsclient
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
BinaryRecordWriter is not casting Integer correctly

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "BinaryRecordWriter is not casting non Long integer types correctly"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

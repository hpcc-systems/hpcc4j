---
id: jira-HPCC4J-277
title: HPCC4J-277 – NPEs in BinaryRecordWriter
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-277"
project: HPCC4J
key: HPCC4J-277
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-02-07
updated: 2020-02-11
resolved: 2020-02-11
components:   - dfsclient
fixVersions:   - 7.6.28
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
NPEs in BinaryRecordWriter

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "BinaryRecordWriter.writeField() is failing with NPEs if null Strings, Integer or Long objects are passed in."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Strings should be checked before methods on them are called, and null Integer/Long/Booleans should default to 0/0/false."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

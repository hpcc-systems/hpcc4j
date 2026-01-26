---
id: jira-HPCC4J-284
title: "HPCC4J-284 – Spark: File writer has issues writing String1 fields"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-284"
project: HPCC4J
key: HPCC4J-284
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-02-21
updated: 2024-04-08
resolved: 2020-03-10
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
Spark: File writer has issues writing String1 fields

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "File writer seems to expect an EOS character on String1 fields when writing. This causes an index out of range error."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

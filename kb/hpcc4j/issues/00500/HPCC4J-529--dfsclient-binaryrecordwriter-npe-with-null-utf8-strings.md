---
id: jira-HPCC4J-529
title: "HPCC4J-529 – DFSClient: BinaryRecordWriter NPE with null UTF8 strings"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-529"
project: HPCC4J
key: HPCC4J-529
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-08-07
updated: 2023-08-11
resolved: 2023-08-11
components:   - dfsclient
fixVersions:   - 9.2.12
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
DFSClient: BinaryRecordWriter NPE with null UTF8 strings

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Passing in a UTF8 string field to BinaryRecordWriter causes an NPE"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "CalculateFieldSize is not correctly handling the potential for null strings"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Should examine other code paths in BinaryRecordWriter for potential NPEs"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

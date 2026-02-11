---
id: jira-HPCC4J-459
title: HPCC4J-459 – Provide DFUQuery FileType enumerated value
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-459"
project: HPCC4J
key: HPCC4J-459
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-05-18
updated: 2022-05-19
resolved: 2022-05-19
components:   - WSClient
fixVersions:   - 8.6.30
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
Provide DFUQuery FileType enumerated value

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Provide mechanism to enumerate DFUQuery's FileType's valid values"}, {"type": "hardBreak"}, {"type": "text", "text": "\"Superfiles Only\", \"Logical Files Only\", \"Not in Superfiles\""}]}, {"type": "paragraph", "content": [{"type": "text", "text": "DFUQueryRequestWrapper request=new DFUQueryRequestWrapper();"}, {"type": "hardBreak"}, {"type": "text", "text": "request.setFileType"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

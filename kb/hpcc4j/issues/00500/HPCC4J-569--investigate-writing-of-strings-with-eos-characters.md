---
id: jira-HPCC4J-569
title: HPCC4J-569 – Investigate writing of strings with EOS characters
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-569"
project: HPCC4J
key: HPCC4J-569
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-01-17
updated: 2024-02-02
resolved: 2024-02-02
components:   - dfsclient
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
Investigate writing of strings with EOS characters

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently writing a string with an EOS character will truncate the string at the EOS character"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Determine proper writing of mid-string EOS characters"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Likely only truncate in var-string case"}]}]}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

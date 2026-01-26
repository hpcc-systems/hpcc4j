---
id: jira-HPCC4J-193
title: "HPCC4J-193 – dfsclient: Handle case where FLAGS field is not provided"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-193"
project: HPCC4J
key: HPCC4J-193
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-05-16
updated: 2019-05-23
resolved: 2019-05-23
components:   - dfsclient
fixVersions:   - 7.2.16
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
dfsclient: Handle case where FLAGS field is not provided

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "{{[ERROR] "}, {"type": "text", "text": "Tests", "marks": [{"type": "textColor", "attrs": {"color": "#c82829"}}]}, {"type": "text", "text": " "}, {"type": "text", "text": "run", "marks": [{"type": "textColor", "attrs": {"color": "#c82829"}}]}, {"type": "text", "text": ":"}, {"type": "text", "text": "1", "marks": [{"type": "textColor", "attrs": {"color": "#718c00"}}]}, {"type": "text", "text": ", Failures: "}, {"type": "text", "text": "1", "marks": [{"type": "textColor", "attrs": {"color": "#f5871f"}}]}, {"type": "text", "text": ", Errors: "}, {"type": "text", "text": "0", "marks": [{"type": "textColor", "attrs": {"color": "#f5871f"}}]}, {"type": "text", "text": ", Skipped: "}, {"type": "text", "text": "0", "marks": [{"type": "textColor", "attrs": {"color": "#f5871f"}}]}, {"type": "text", "text": ", Time elapsed: "}, {"type": "te

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-772
title: HPCC4J-772 – Backport incorrectly versioned WsWorkunits.ECLException.Cost
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-772"
project: HPCC4J
key: HPCC4J-772
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2026-01-06
updated: 2026-01-23
resolved: null
components:   - WSClient
fixVersions:
  - 9.14.48
  - 10.0.22
  - 9.12.68
  - 9.10.92
labels: []
applies_to: hpcc4j: >= 9.14.48
audience: developer
confidence: high
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Backport incorrectly versioned WsWorkunits.ECLException.Cost

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Summary:", "marks": [{"type": "strong"}]}, {"type": "hardBreak"}, {"type": "text", "text": "ESP server introduced a new field "}, {"type": "text", "text": "Cost", "marks": [{"type": "code"}]}, {"type": "text", "text": " in "}, {"type": "text", "text": "ECLException", "marks": [{"type": "code"}]}, {"type": "text", "text": " but incorrectly versioned it to an older interface version, causing client-side failures."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Description:", "marks": [{"type": "strong"}]}, {"type": "hardBreak"}, {"type": "text", "text": "A not so recent change on the ESP server added a new field named "}, {"type": "text", "text": "Cost", "marks": [{"type": "code"}]}, {"type": "text", "text": " to the "}, {"type": "text", "text": "ECLException", "marks": [{"type": "code"}]}, {"type": "text", "text": " structure. However, this change was mistakenly/erroneo

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

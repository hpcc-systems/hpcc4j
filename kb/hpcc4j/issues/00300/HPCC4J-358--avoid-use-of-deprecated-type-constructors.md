---
id: jira-HPCC4J-358
title: HPCC4J-358 – Avoid use of deprecated type constructors
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-358"
project: HPCC4J
key: HPCC4J-358
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-11-18
updated: 2021-01-19
resolved: 2021-01-19
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
Avoid use of deprecated type constructors

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Several instances of deprecated constructor usage such as:"}, {"type": "hardBreak"}, {"type": "text", "text": "return new Long(0);"}, {"type": "hardBreak"}, {"type": "text", "text": "return new Double(1.1);"}, {"type": "hardBreak"}, {"type": "text", "text": "return new Boolean(false);"}, {"type": "hardBreak"}, {"type": "text", "text": "Should be avoided per:"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "@deprecated"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "It is rarely appropriate to use this constructor. The static factory"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "{@link #valueOf(boolean)} is generally a better choice, as it is"}]}]}, {"type": "listItem", "content": [{"type": "paragrap

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

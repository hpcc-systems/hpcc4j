---
id: jira-HPCC4J-543
title: HPCC4J-543 – Empty compressed file test failure
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-543"
project: HPCC4J
key: HPCC4J-543
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-09-07
updated: 2024-06-17
resolved: 2024-06-17
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
Empty compressed file test failure

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Empty compressed file test seems to be causing the Github actions to stall and timeout after 6 hrs"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The test executes locally without issue"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-579
title: HPCC4J-579 – DFSClient prefetch hot loop
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-579"
project: HPCC4J
key: HPCC4J-579
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-02-21
updated: 2024-02-28
resolved: 2024-02-28
components: []
fixVersions:
  - 9.2.66
  - 9.4.40
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
DFSClient prefetch hot loop

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The prefetch thread can enter a hot loop where it doesn't sleep"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The conditions for the hot loop depends on the read size, buffer size and bandwidth coming from dafilesrv.\u00a0"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Adding a short sleep after each fetch check seems to alleviate this issue"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Further testing and checks for potential hot loops on the construction side needed"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

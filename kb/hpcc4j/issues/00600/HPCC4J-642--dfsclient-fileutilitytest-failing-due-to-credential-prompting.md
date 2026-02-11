---
id: jira-HPCC4J-642
title: HPCC4J-642 – DFSClient FileUtilityTest failing due to credential prompting
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-642"
project: HPCC4J
key: HPCC4J-642
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-09-12
updated: 2024-12-17
resolved: 2024-12-16
components:   - dfsclient
fixVersions:
  - 9.8.46
  - 9.6.72
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
DFSClient FileUtilityTest failing due to credential prompting

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Add a -non-interactive flag to FileUtility to prevent prompting"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Update file utility test to add -non-interactive"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

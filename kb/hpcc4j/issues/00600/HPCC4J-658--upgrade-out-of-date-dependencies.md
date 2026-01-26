---
id: jira-HPCC4J-658
title: HPCC4J-658 – Upgrade out-of-date dependencies
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-658"
project: HPCC4J
key: HPCC4J-658
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-10-25
updated: 2024-10-29
resolved: 2024-10-29
components: []
fixVersions:
  - 9.2.134
  - 9.4.108
  - 9.6.60
  - 9.8.34
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
Upgrade out-of-date dependencies

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Axis 2 is pulling in out of date dependencies, if possible we should override the version of the dependencies Axis2 pulls in or exclude them"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

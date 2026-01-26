---
id: jira-HPCC4J-639
title: HPCC4J-639 – DFSClient Add concurrent connection startup limit
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-639"
project: HPCC4J
key: HPCC4J-639
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-09-10
updated: 2024-09-25
resolved: 2024-09-25
components:   - dfsclient
fixVersions:   - 9.8.26
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
DFSClient Add concurrent connection startup limit

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Add an optional parameter to limit the number of concurrent connections started up at one time"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "This should fix issues where starting up connections too quickly could potentially overwhelm TCP congestion control"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

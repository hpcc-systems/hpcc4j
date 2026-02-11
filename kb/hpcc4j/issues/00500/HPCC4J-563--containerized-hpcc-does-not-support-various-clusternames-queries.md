---
id: jira-HPCC4J-563
title: HPCC4J-563 – Containerized HPCC does not support various clusternames queries
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-563"
project: HPCC4J
key: HPCC4J-563
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-12-19
updated: 2024-06-17
resolved: 2024-06-17
components:   - WSClient
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
Containerized HPCC does not support various clusternames queries

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "determine why\u00a0"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WsClientTest.testAvailableClusterGroups"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WsClientTest.testGetAvailableRoxieClusterNames"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WsClientTest.testGetAvailableThorClusterNames"}]}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "are invalid in containerized mode and find alternative."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

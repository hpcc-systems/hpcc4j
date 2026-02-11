---
id: jira-HPCC4J-511
title: HPCC4J-511 – Test failures in containerized environment
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-511"
project: HPCC4J
key: HPCC4J-511
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-05-23
updated: 2023-12-19
resolved: 2023-12-19
components: []
fixVersions:   - 9.4.10
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
Test failures in containerized environment

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "DFSIndexTest.biasedIntTest"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "FileSprayClientTest.testSprayCSV"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "FileSprayClientTest.testDespray"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WsClientTest.testAvailableClusterGroups"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WsClientTest.testGetAvailableRoxieClusterNames"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WsClientTest.testGetAvailableThorClusterNames"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WsFil

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

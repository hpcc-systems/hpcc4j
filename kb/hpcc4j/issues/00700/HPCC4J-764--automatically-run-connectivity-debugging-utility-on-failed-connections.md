---
id: jira-HPCC4J-764
title: HPCC4J-764 – Automatically run connectivity debugging utility on failed connections
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-764"
project: HPCC4J
key: HPCC4J-764
status: New
statusCategory: To Do
resolution: null
created: 2025-11-14
updated: 2025-11-14
resolved: null
components: []
fixVersions: []
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Automatically run connectivity debugging utility on failed connections

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When a connection fails either in WsClient or DFSClient we should automatically run the connection debug utility"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The connection debug utility should use the Java connectivity testing functionality"}]}]}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.

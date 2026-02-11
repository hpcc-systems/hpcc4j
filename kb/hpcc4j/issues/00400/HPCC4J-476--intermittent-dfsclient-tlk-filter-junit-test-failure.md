---
id: jira-HPCC4J-476
title: HPCC4J-476 – intermittent DFSClient TLK filter JUNIT test failure
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-476"
project: HPCC4J
key: HPCC4J-476
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-07-29
updated: 2023-11-09
resolved: 2023-11-09
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
intermittent DFSClient TLK filter JUNIT test failure

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "DFSClient TLK filter JUNIT test intermittently fails:"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "[INFO] Running org.hpccsystems.dfs.client.DFSIndexTest "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Num file parts: 1 "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Time to create batch record reader: 19ms "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Starting tlk filter test. "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Key: 0 Search value: 3 found: false "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text"

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

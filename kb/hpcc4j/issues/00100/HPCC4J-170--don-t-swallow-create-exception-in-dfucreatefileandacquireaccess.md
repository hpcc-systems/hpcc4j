---
id: jira-HPCC4J-170
title: "HPCC4J-170 – Don't swallow create exception in DFUCreateFileAndAcquireAccess"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-170"
project: HPCC4J
key: HPCC4J-170
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-04-09
updated: 2019-04-17
resolved: 2019-04-17
components:   - WSClient
fixVersions:   - 7.2.6
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
Don't swallow create exception in DFUCreateFileAndAcquireAccess

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "While tracing down an issue in wsDFU I discovered the following scenario in HPCCWsDFUClient.CreateFileAndAcquireAccess:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "if", "marks": [{"type": "strong"}]}, {"type": "text", "text": " (resp == "}, {"type": "text", "text": "null", "marks": [{"type": "strong"}]}, {"type": "text", "text": " || resp.getAccessInfo() == "}, {"type": "text", "text": "null", "marks": [{"type": "strong"}]}, {"type": "text", "text": ")"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0 {"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0 "}, {"type": "text", "text": "throw", "marks": [{"type": "strong"}]}, {"type": "te

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

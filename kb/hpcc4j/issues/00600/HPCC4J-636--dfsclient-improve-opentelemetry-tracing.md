---
id: jira-HPCC4J-636
title: "HPCC4J-636 – DFSClient: Improve Opentelemetry tracing"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-636"
project: HPCC4J
key: HPCC4J-636
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-08-29
updated: 2024-09-04
resolved: 2024-09-04
components:   - dfsclient
fixVersions:
  - 9.6.46
  - 9.8.20
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
DFSClient: Improve Opentelemetry tracing

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Track read requests in spans instead of events"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Batch read requests into a single span of {BATCH_SIZE} requests"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Improve span naming"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Remove redundant information, reduce name length"}]}]}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

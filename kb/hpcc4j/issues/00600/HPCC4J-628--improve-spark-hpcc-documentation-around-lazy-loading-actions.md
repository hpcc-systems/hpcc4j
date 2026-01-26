---
id: jira-HPCC4J-628
title: HPCC4J-628 – Improve Spark-HPCC documentation around lazy loading & actions
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-628"
project: HPCC4J
key: HPCC4J-628
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-08-16
updated: 2024-09-17
resolved: 2024-09-17
components:   - Spark
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
Improve Spark-HPCC documentation around lazy loading & actions

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Original Issue:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Spark "}, {"type": "text", "text": "DataFrame.count", "marks": [{"type": "code"}]}, {"type": "text", "text": " very inefficient"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Spark "}, {"type": "text", "text": ".count", "marks": [{"type": "code"}]}, {"type": "text", "text": " takes much longer than it should. Can this be queried much more efficiently using metadata? It looks like a full scan of all the data is happening to get a simple count. The screenshot below is counting the following file: "}, {"type": "text", "text": "path=\"thor_data400::key::bipv2_best::built::linkids\"", "marks": [{"type": "code"}]}, {"type": "hardBreak"}]}, {"type": "mediaSingle", "attrs": {"layout": "align-start"}, "content": [{"type": "media", "attrs": {"type": "file", "id": "9c927b26-b62a-479a-8329-0293992782

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

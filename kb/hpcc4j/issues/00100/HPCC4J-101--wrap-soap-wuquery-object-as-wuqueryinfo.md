---
id: jira-HPCC4J-101
title: HPCC4J-101 – Wrap soap WUQuery object as WUQueryInfo
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-101"
project: HPCC4J
key: HPCC4J-101
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-09-20
updated: 2018-06-22
resolved: 2018-06-22
components:   - WSClient
fixVersions:   - 1.2.2
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
Wrap soap WUQuery object as WUQueryInfo

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Wrap HPCCWsWorkunitsClient public methods that take a WUQuery object with a soap-agnostic WUQueryInfo."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-102
title: HPCC4J-102 – NPE in HPCCWsWorkunitsClient.searchQueries()
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-102"
project: HPCC4J
key: HPCC4J-102
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
NPE in HPCCWsWorkunitsClient.searchQueries()

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "if filtertype is null, npe is thrown"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

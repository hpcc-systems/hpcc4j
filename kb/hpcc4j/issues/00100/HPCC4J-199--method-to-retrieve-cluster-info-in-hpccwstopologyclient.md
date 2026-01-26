---
id: jira-HPCC4J-199
title: HPCC4J-199 – Method to retrieve cluster info in HPCCWsTopologyClient
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-199"
project: HPCC4J
key: HPCC4J-199
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-05-21
updated: 2019-09-16
resolved: 2019-09-16
components:   - WSClient
fixVersions:   - 7.6.0
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
Method to retrieve cluster info in HPCCWsTopologyClient

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently we have to access the soap proxy directly to retrieve cluster information from the HPCCWsTopologyClient platform class. It would be useful to have a method that returned this info."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

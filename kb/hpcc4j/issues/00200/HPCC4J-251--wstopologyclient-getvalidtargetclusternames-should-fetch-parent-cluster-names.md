---
id: jira-HPCC4J-251
title: HPCC4J-251 – WsTopologyClient.getValidTargetClusterNames should fetch parent cluster names
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-251"
project: HPCC4J
key: HPCC4J-251
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-11-01
updated: 2024-04-08
resolved: 2019-11-05
components:   - WSClient
fixVersions:   - 7.6.8
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
WsTopologyClient.getValidTargetClusterNames should fetch parent cluster names

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WsTopologyClient.getValidTargetClusterNames currently interrogates the tptargetclusterinfo children types to evaluate if valid targetcluster, but mistakenly provides the child's cluster name. Fix provides the current parent targetcluster name instead "}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

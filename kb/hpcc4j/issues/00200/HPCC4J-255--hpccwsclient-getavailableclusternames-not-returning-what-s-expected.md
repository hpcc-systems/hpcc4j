---
id: jira-HPCC4J-255
title: "HPCC4J-255 – HPCCWsClient.getAvailableClusterNames not returning what's expected"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-255"
project: HPCC4J
key: HPCC4J-255
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-11-18
updated: 2019-12-10
resolved: 2019-12-10
components: []
fixVersions:   - 7.6.16
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
HPCCWsClient.getAvailableClusterNames not returning what's expected

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "I\u2019m trying to get a list of cluster names and I\u2019m not getting the expected response. I suspect the issue is in ws client\u2019s hipie.getConnection(connectionName).getPlatform().getWsClient().getAvailableClusterNames(\"thor\") function"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "hipie.getConnection(connectionName).getPlatform().getWsClient().getAvailableClusterGroups() correctly returns hthor, thor and roxie but when I try to call getAvailableClusterNames(\u201cthor\u201d) it returns thor instead of mythor."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "In the attached screenshot you can see the thor group has a cluster named mythor which is what I\u2019m expecting to be returned."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

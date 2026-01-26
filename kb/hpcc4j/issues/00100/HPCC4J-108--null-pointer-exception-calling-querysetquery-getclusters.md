---
id: jira-HPCC4J-108
title: HPCC4J-108 – Null pointer exception calling querysetquery.getClusters()
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-108"
project: HPCC4J
key: HPCC4J-108
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-11-10
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
Null pointer exception calling querysetquery.getClusters()

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "In QueryResult.java, at line 36, an NPE occurs if a query is not published to any clusters and is suspended:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ClusterQueryState[] rawclusters=qr.getClusters();"}, {"type": "hardBreak"}, {"type": "text", "text": "for (org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ClusterQueryState rawc:rawclusters) {"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Need to wrap this in a null check"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

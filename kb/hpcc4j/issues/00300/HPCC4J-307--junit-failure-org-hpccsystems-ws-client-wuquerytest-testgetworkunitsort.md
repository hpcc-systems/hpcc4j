---
id: jira-HPCC4J-307
title: "HPCC4J-307 – Junit failure:  org.hpccsystems.ws.client.WUQueryTest.testGetWorkunitSort"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-307"
project: HPCC4J
key: HPCC4J-307
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-05-06
updated: 2020-05-14
resolved: 2020-05-14
components:   - WSClient
fixVersions:   - 7.8.14
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
Junit failure:  org.hpccsystems.ws.client.WUQueryTest.testGetWorkunitSort

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "org.hpccsystems.ws.client.WUQueryTest.testGetWorkunitSort"}, {"type": "hardBreak"}, {"type": "text", "text": "Failing for the past 46 builds (Since #0 )"}, {"type": "hardBreak"}, {"type": "text", "text": "Took 0.18 sec."}, {"type": "hardBreak"}, {"type": "text", "text": "add description"}, {"type": "hardBreak"}, {"type": "text", "text": "Error Message"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "descending jobname in wrong order:WsSQL PreparedQuery Job then testGetWorkunitByAppName"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Stacktrace"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "java.lang.AssertionError: descending jobname in wrong order:WsSQL PreparedQuery Job then testGetWorkunitByAppName"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.hpccsystems.ws.client.WUQueryTest.testGetWorkunitSort(WUQueryTest.java:95)"}]

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-200
title: HPCC4J-200 – WsDFU hash assumes all members are initialized
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-200"
project: HPCC4J
key: HPCC4J-200
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-05-29
updated: 2019-06-13
resolved: 2019-06-13
components:   - WSClient
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
WsDFU hash assumes all members are initialized

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Result from junit:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "testRegressionRecordStructures(org.hpccsystems.ws.client.platform.RampsDevRegressionTest) Time elapsed: 0.039 sec <<< ERROR!"}, {"type": "hardBreak"}, {"type": "text", "text": "java.lang.NullPointerException"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.hpccsystems.ws.client.HPCCWsDFUClient.hashCode(HPCCWsDFUClient.java:930)"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.hpccsystems.ws.client.utils.DataSingletonCollection.get(DataSingletonCollection.java:30)"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.hpccsystems.ws.client.HPCCWsClient.getWsDFUClient(HPCCWsClient.java:451)"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.hpccsystems.ws.client.platform.Platform.getWsDfuClient(Platform.java:860)"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.hp

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

## Related
- 01. Relates: HPCC4J-201

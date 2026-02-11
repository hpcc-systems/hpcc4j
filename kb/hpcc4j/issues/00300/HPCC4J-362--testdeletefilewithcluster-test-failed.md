---
id: jira-HPCC4J-362
title: HPCC4J-362 – testDeleteFileWithCluster test failed
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-362"
project: HPCC4J
key: HPCC4J-362
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-11-19
updated: 2020-11-30
resolved: 2020-11-30
components:   - WSClient
fixVersions:   - 7.12.x
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
testDeleteFileWithCluster test failed

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Failed"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "org.hpccsystems.ws.client.WsDFUClientTest.testDeleteFileWithCluster"}, {"type": "hardBreak"}, {"type": "text", "text": "Failing for the past 6 builds (Since Unstable#237 )"}, {"type": "hardBreak"}, {"type": "text", "text": "Took 5 sec."}, {"type": "hardBreak"}, {"type": "text", "text": "add description"}, {"type": "hardBreak"}, {"type": "text", "text": "Stacktrace"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "java.lang.AssertionError"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.hpccsystems.ws.client.WsDFUClientTest.testDeleteFileWithCluster(WsDFUClientTest.java:323)"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

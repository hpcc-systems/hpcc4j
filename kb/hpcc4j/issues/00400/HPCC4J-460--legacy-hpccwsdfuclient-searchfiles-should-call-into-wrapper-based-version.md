---
id: jira-HPCC4J-460
title: "HPCC4J-460 – Legacy HPCCWsDFUClient::searchfiles should call into wrapper based version"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-460"
project: HPCC4J
key: HPCC4J-460
status: Resolved
statusCategory: Done
resolution: Duplicate
created: 2022-05-18
updated: 2022-05-19
resolved: 2022-05-19
components: []
fixVersions:   - 8.6.30
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
Legacy HPCCWsDFUClient::searchfiles should call into wrapper based version

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Legacy method ("}, {"type": "text", "text": "https://github.com/hpcc-systems/hpcc4j/blob/11bb4c2f8e661a140bada770b38422faa2dc87d9/wsclient/src/main/java/org/hpccsystems/ws/client/HPCCWsDFUClient.java#L1247", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/blob/11bb4c2f8e661a140bada770b38422faa2dc87d9/wsclient/src/main/java/org/hpccsystems/ws/client/HPCCWsDFUClient.java#L1247"}}]}, {"type": "text", "text": ") should populate DFUQueryRequestWrapper and call into wrapper based version ("}, {"type": "text", "text": "https://github.com/hpcc-systems/hpcc4j/blob/11bb4c2f8e661a140bada770b38422faa2dc87d9/wsclient/src/main/java/org/hpccsystems/ws/client/HPCCWsDFUClient.java#L1306", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/blob/11bb4c2f8e661a140bada770b38422faa2dc87d9/wsclient/src/main/java/org/hpccsystems/ws/client/

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.

---
id: jira-HPCC4J-139
title: HPCC4J-139 – Intermittent Exception in monitorWuToCompletion
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-139"
project: HPCC4J
key: HPCC4J-139
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-11-19
updated: 2019-04-01
resolved: 2019-04-01
components:   - WSClient
fixVersions:   - 7.2.x
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
Intermittent Exception in monitorWuToCompletion

{"type": "doc", "version": 1, "content": [{"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "java.lang.Exception: Error attempting to refresh WU W20181116-104512\r\n        at org.hpccsystems.ws.client.HPCCWsWorkUnitsClient.monitorWUToCompletion\r\n(HPCCWsWorkUnitsClient.java:1841)\r\n        at org.hpccsystems.ws.client.HPCCWsWorkUnitsClient.compileWUFromECL(HPCC\r\nWsWorkUnitsClient.java:1475)\r\n        at org.hpcc.HIPIE.utils.HPCCConnection.compileECLPackage(HPCCConnection.\r\njava:1260)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Occasionally this exception will be thrown, but the cause is not attached to the thrown exception, so I don't know why it's happening:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/hpcc-systems/HPCC-JAPIs/blob/d13e17

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

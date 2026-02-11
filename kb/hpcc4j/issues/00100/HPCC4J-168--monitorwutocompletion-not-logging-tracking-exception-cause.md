---
id: jira-HPCC4J-168
title: HPCC4J-168 – monitorWuToCompletion Not Logging / Tracking Exception Cause
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-168"
project: HPCC4J
key: HPCC4J-168
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-04-02
updated: 2019-04-03
resolved: 2019-04-03
components:   - WSClient
fixVersions:   - 7.2.0.1
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
monitorWuToCompletion Not Logging / Tracking Exception Cause

{"type": "doc", "version": 1, "content": [{"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "java.lang.Exception: Error attempting to refresh WU W20181116-104512\r\n        at org.hpccsystems.ws.client.HPCCWsWorkUnitsClient.monitorWUToCompletion\r\n(HPCCWsWorkUnitsClient.java:1841)\r\n        at org.hpccsystems.ws.client.HPCCWsWorkUnitsClient.compileWUFromECL(HPCC\r\nWsWorkUnitsClient.java:1475)\r\n        at org.hpcc.HIPIE.utils.HPCCConnection.compileECLPackage(HPCCConnection.\r\njava:1260)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Occasionally this exception will be thrown, but the cause is not attached to the thrown exception, so I don't know why it's happening: "}, {"type": "text", "text": "https://github.com/hpcc-systems/HPCC-JAPIs/blob/d13e17df0e7328ad1ba71b35b51bd2080dd808c0/wsclient/src/main/java/org/hpccsystems/ws/client/HPCCWsWorkUnitsClient.java#L1838-L1841", "marks": [{"type": "link", "attrs": {"href": "https://

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

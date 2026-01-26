---
id: jira-HPCC4J-253
title: HPCC4J-253 – Compilation error with wsclient tests
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-253"
project: HPCC4J
key: HPCC4J-253
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-11-07
updated: 2019-11-07
resolved: 2019-11-07
components:   - WSClient
fixVersions:   - 7.6.10
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
Compilation error with wsclient tests

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "11:19:35 [ERROR] COMPILATION ERROR : "}, {"type": "hardBreak"}, {"type": "text", "text": "11:19:35 [INFO] -------------------------------------------------------------\r"}, {"type": "hardBreak"}, {"type": "text", "text": "11:19:35 [ERROR] /mnt/disk1/jenkins2/workspace/Java-Projects-7.6.10-rc1/HPCC-JAPIs/wsclient/src/test/java/org/hpccsystems/ws/client/WSStoreClientTest.java:[96,22] cannot find symbol"}, {"type": "hardBreak"}, {"type": "text", "text": "11:19:35   symbol:   method fetchValueEncrypted(java.lang.String,java.lang.String,java.lang.String,boolean,java.lang.String)"}, {"type": "hardBreak"}, {"type": "text", "text": "11:19:35   location: variable client of type org.hpccsystems.ws.client.HPCCWsStoreClient"}, {"type": "hardBreak"}, {"type": "text", "text": "11:19:35 [ERROR] /mnt/disk1/jenkins2/workspace/Java-Projects-7.6.10-rc1/HPCC-JAPIs/wsclient/src/test/java/org/hpccsystems/ws

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

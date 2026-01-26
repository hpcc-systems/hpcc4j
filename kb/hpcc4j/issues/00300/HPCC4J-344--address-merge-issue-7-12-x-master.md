---
id: jira-HPCC4J-344
title: HPCC4J-344 – Address merge issue 7.12.x->master
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-344"
project: HPCC4J
key: HPCC4J-344
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-10-22
updated: 2020-10-22
resolved: 2020-10-22
components:   - WSClient
fixVersions:   - 7.13.x
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
Address merge issue 7.12.x->master

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.0:compile (default-compile) on project wsclient: Compilation failure: Compilation failure:"}, {"type": "hardBreak"}, {"type": "text", "text": "[ERROR] /C:/assignments/GIT/HPCC4J/wsclient/src/main/java/org/hpccsystems/ws/client/wrappers/wsworkunits/WsWorkunitsClientStubWrapper.java:[103,31] major has private access in org.hpccsystems.ws.client.platform.Version"}, {"type": "hardBreak"}, {"type": "text", "text": "[ERROR] /C:/assignments/GIT/HPCC4J/wsclient/src/main/java/org/hpccsystems/ws/client/wrappers/wsworkunits/WsWorkunitsClientStubWrapper.java:[103,61] minor has private access in org.hpccsystems.ws.client.platform.Version"}, {"type": "hardBreak"}, {"type": "text", "text": "[ERROR] /C:/assignments/GIT/HPCC4J/wsclient/src/main/java/org/hpccsystems/ws/client/wrappers/wsworkunits/WsWorkunitsClientStubWrapp

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

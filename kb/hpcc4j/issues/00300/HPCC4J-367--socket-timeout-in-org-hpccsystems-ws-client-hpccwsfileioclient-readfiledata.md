---
id: jira-HPCC4J-367
title: HPCC4J-367 – socket timeout in org.hpccsystems.ws.client.HPCCWsFileIOClient.readFileData
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-367"
project: HPCC4J
key: HPCC4J-367
status: Resolved
statusCategory: Done
resolution: Invalid
created: 2020-12-02
updated: 2024-04-08
resolved: 2020-12-04
components: []
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
socket timeout in org.hpccsystems.ws.client.HPCCWsFileIOClient.readFileData

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "\u00a0When downloading a large file using readFileData you encounter timeouts, below is an example of the error my application received back."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "{{Target: C!:48374 -> <REDACTED IP>:<REDACTED PORT> (124), Raised in: jsocket.cpp, line 1788"}, {"type": "hardBreak"}, {"type": "text", "text": "2020-12-02 09:54:06 ERROR Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is org.hpccsystems.mini.core.exception.MiniAppException: ERROR(302) Error retrieving file <REDACTED FILE PATH/NAME> on cluster http://<REDACTED URL>t:8010/ lz <REDACTED LZ NAME>:Could Not ReadFiledata:timeout expired"}, {"type": "hardBreak"}, {"type": "text", "text": "Target: C!:48374 -> <REDACTED IP>:7100 (124), Raised in: jsocket.cpp, line 1788"}, {"type": "hardBreak"}, {"type": "

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.

---
id: jira-HPCC4J-381
title: HPCC4J-381 – testFetchDropzonesBadURL returning valid dropzone when expecting null
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-381"
project: HPCC4J
key: HPCC4J-381
status: Resolved
statusCategory: Done
resolution: Invalid
created: 2021-02-09
updated: 2024-04-08
resolved: 2021-02-16
components:   - WSClient
fixVersions: []
labels:   - Bug
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
testFetchDropzonesBadURL returning valid dropzone when expecting null

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Error:  testfetchDropZonesBadURL(org.hpccsystems.ws.client.FileSprayClientTest)  Time elapsed: 0.016 s  <<< FAILURE!"}, {"type": "hardBreak"}, {"type": "text", "text": "java.lang.AssertionError: expected null, but was:<[DropZoneWrapper [name = mydropzone, netAddress = ., path = /var/lib/HPCCSystems/mydropzone, computer = ServerList, linux = true]]>"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.hpccsystems.ws.client.FileSprayClientTest.testfetchDropZonesBadURL(FileSprayClientTest.java:309)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Yet the code is passing \"invalidserver:8010\" as the url.  This shouldn't be resolved to \".\" and a valid dropzone path."}]}]}

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.

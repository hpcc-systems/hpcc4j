---
id: jira-HPCC4J-121
title: HPCC4J-121 – Platform.get() returns a platform with a different user
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-121"
project: HPCC4J
key: HPCC4J-121
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-07-18
updated: 2018-07-24
resolved: 2018-07-24
components:   - WSClient
fixVersions:
  - 1.4.0
  - 1.2.6
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
Platform.get() returns a platform with a different user

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Platform.get(protocol, server,port,user,password) is supposed to return a matching platform from the DataSingletonCollection<Platform> All variable in platform."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "If you call Platform.get with the same protocol, server and port but a different username, the platform returned by the first .get call is returned."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "This is because of DataSingleton's unique get() method.\u00a0 It only checks Platform.hashcode(), which returns the hash of server,port and protocol."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "This is causing issues in clients (dsp/hipie) using 1.2.4."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "DataSingleton should be switched out for something better in the next release."}]}, {"type": "paragraph", "content": [{

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-257
title: HPCC4J-257 – static ORIGINALURL improperly set
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-257"
project: HPCC4J
key: HPCC4J-257
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-11-25
updated: 2019-12-09
resolved: 2019-12-09
components:   - WSClient
fixVersions:   - 7.6.16
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
static ORIGINALURL improperly set

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We came across a bug where HPCCWsAttributesClient was using port 8010, even though it had been initialized with no port and should have been using 8145 by default."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Turns out this is thanks to ORIGINALURL, a static variable in BaseHPCCWsClient.  This static variable is updated in the constructors for HPCCFileSprayClient, HPCCWsDfuClient and HPCCWsFileIOClient.  If you initialize a FileSprayClient/DfuClient/WsFileIOClient class with a connection that has port 8010 and then initialize a WsAttributesClient with port 8145, the attributes client's \"original port\" is set to 8010 due to prior assignment of ORIGINALURL."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "You can recreate the issue with this code:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "HPCCFileSprayClient fsclient=HPCCFileSp

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

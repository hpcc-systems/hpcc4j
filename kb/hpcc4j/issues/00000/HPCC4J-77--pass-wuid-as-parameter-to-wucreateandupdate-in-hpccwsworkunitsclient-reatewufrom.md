---
id: jira-HPCC4J-77
title: HPCC4J-77 – pass wuid as parameter to WUCreateAndUpdate in HPCCWsWorkunitsClient.reateWUFromECL
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-77"
project: HPCC4J
key: HPCC4J-77
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-04-05
updated: 2017-05-01
resolved: 2017-05-01
components:   - WSClient
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
pass wuid as parameter to WUCreateAndUpdate in HPCCWsWorkunitsClient.reateWUFromECL

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "This allows one to create a wuid with WUCreate, which can then be set as the wuid sent into CreateAndRunWUFromEcl.  The call can be made asynchronously and the wuid passed back to the end user, rather than having to wait for the compile/submit/run to complete. Better percieved performance."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

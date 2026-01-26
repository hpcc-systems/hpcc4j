---
id: jira-HPCC4J-242
title: HPCC4J-242 – NPE in HPCCWsWorkUnitsClient.compileWUFromECL
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-242"
project: HPCC4J
key: HPCC4J-242
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-10-15
updated: 2019-10-21
resolved: 2019-10-21
components:   - WSClient
fixVersions:   - 7.6.6
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
NPE in HPCCWsWorkUnitsClient.compileWUFromECL

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "in this method, for (ECLExceptionWrapper ex : res.getExceptions().getECLException())   is throwing an NPE if res.getExceptions() is null."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "I checked through the codebase and this is the only place where getExceptions() isn't being null checked."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

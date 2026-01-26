---
id: jira-HPCC4J-47
title: HPCC4J-47 – Allow for direct WURunResponse to caller from createAndRunWUFromECL
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-47"
project: HPCC4J
key: HPCC4J-47
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2016-05-13
updated: 2016-05-13
resolved: 2016-05-13
components:   - WSClient
fixVersions:   - Later
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
Allow for direct WURunResponse to caller from createAndRunWUFromECL

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We will be making createAndRunWUFromECL() public, instead of private."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

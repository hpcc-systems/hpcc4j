---
id: jira-HPCC4J-42
title: "HPCC4J-42 – When creating and running a workunit, errors on submit aren't caught"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-42"
project: HPCC4J
key: HPCC4J-42
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2016-04-08
updated: 2016-05-16
resolved: 2016-05-16
components:   - WSClient
fixVersions:   - 0.6.4
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
When creating and running a workunit, errors on submit aren't caught

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "when running a workunit, compile is doing a compile and then calling run without checking for compile errors first in the submitted wu"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

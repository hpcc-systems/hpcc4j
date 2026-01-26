---
id: jira-HPCC4J-254
title: "HPCC4J-254 – HPCCWsWorkUnitsClient: getWUInfo throws NPE for deleted workunit"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-254"
project: HPCC4J
key: HPCC4J-254
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-11-18
updated: 2019-11-19
resolved: 2019-11-19
components:   - WSClient
fixVersions:   - 7.6.12
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
HPCCWsWorkUnitsClient: getWUInfo throws NPE for deleted workunit

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WUInfoResponseWrapper throws NPE when we try to retrieve workunit info of a deleted workunit"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-116
title: HPCC4J-116 – Add additional spray parameters
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-116"
project: HPCC4J
key: HPCC4J-116
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-05-04
updated: 2018-11-06
resolved: 2018-10-24
components:   - WSClient
fixVersions:   - 7.0.0
labels:
  - Developer70
  - Post70RC1
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
Add additional spray parameters

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently the spray functions do not include all documented parameters for variable, fixed, and XML.\u00a0 Several of these parameters will be needed in upcoming versions of Hipie.\u00a0 One specifically is encrypt but it would be useful to have all parameters accessible."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

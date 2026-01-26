---
id: jira-HPCC4J-297
title: HPCC4J-297 – Generated wrappers should not instantiate fields automatically
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-297"
project: HPCC4J
key: HPCC4J-297
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-04-23
updated: 2020-04-29
resolved: 2020-04-29
components:   - WSClient
fixVersions:   - 7.8.8
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
Generated wrappers should not instantiate fields automatically

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Generated wrappers tend to instantiate field even is wrapped object's counterpart field is null."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

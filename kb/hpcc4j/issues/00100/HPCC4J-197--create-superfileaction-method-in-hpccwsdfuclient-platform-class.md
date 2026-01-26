---
id: jira-HPCC4J-197
title: HPCC4J-197 – Create superfileAction method in HpccWsDFUClient platform class
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-197"
project: HPCC4J
key: HPCC4J-197
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-05-21
updated: 2019-09-25
resolved: 2019-09-25
components:   - WSClient
fixVersions:   - 7.6.0
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
Create superfileAction method in HpccWsDFUClient platform class

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently HIPIE and salt have to access the soap proxy directly to remove superfiles, etc."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "It would be useful to have a method in HPCCWsDFUClient to call instead."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

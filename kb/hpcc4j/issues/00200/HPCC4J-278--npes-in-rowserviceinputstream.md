---
id: jira-HPCC4J-278
title: HPCC4J-278 – NPEs in RowServiceInputStream
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-278"
project: HPCC4J
key: HPCC4J-278
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-02-07
updated: 2020-02-12
resolved: 2020-02-12
components:   - dfsclient
fixVersions:   - 7.6.28
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
NPEs in RowServiceInputStream

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When reading a file from a cluster that has been unevenly distributed, where some filepart sizes are 0, NPEs occur when acessing a null dis value."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

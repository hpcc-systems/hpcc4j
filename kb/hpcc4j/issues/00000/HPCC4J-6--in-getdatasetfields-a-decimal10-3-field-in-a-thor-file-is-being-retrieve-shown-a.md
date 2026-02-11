---
id: jira-HPCC4J-6
title: HPCC4J-6 – in getDatasetFields, a decimal10_3 field in a thor file is being retrieve & shown as a REAL field
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-6"
project: HPCC4J
key: HPCC4J-6
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2015-06-11
updated: 2024-04-08
resolved: 2015-08-10
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
in getDatasetFields, a decimal10_3 field in a thor file is being retrieve & shown as a REAL field

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Example: dashboard cluster, "}, {"type": "text", "text": "https://216.19.105.2:18010/#/stub/Files-DL/LogicalFiles-DL/mythorxxbirtxxcustomers-DL/Source", "marks": [{"type": "link", "attrs": {"href": "https://216.19.105.2:18010/#/stub/Files-DL/LogicalFiles-DL/mythorxxbirtxxcustomers-DL/Source"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "This is related to "}, {"type": "text", "text": "https://hpccsystems.atlassian.net/browse/HPCC-12213", "marks": [{"type": "link", "attrs": {"href": "https://hpccsystems.atlassian.net/browse/HPCC-12213"}}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

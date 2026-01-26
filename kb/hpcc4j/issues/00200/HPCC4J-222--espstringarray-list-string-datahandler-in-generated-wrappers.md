---
id: jira-HPCC4J-222
title: HPCC4J-222 – EspStringArray->List<String>, DataHandler in generated wrappers
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-222"
project: HPCC4J
key: HPCC4J-222
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-08-28
updated: 2019-09-05
resolved: 2019-09-05
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
EspStringArray->List<String>, DataHandler in generated wrappers

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When generating wrappers for axis classes, replace EspStringArray with List<String>.  Also, replace dataHandler objects in axis generated classes with Strings in the wrappers."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

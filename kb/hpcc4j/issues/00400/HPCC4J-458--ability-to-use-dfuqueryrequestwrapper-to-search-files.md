---
id: jira-HPCC4J-458
title: HPCC4J-458 – Ability to use DFUQueryRequestWrapper to search files
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-458"
project: HPCC4J
key: HPCC4J-458
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-05-18
updated: 2022-05-19
resolved: 2022-05-19
components:   - WSClient
fixVersions:   - 8.6.30
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
Ability to use DFUQueryRequestWrapper to search files

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The vault team wants to be able to retrieve a list of superfiles in a cluster. Unfortunately, although there is already a dfuQueryRequestWrapper class that lets the user filter by superfiles, there's no method to search files in the DFUClient that takes this wrapper class."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

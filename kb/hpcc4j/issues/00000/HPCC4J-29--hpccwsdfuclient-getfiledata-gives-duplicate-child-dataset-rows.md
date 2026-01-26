---
id: jira-HPCC4J-29
title: HPCC4J-29 – HPCCWsDFUClient.getFileData gives duplicate child dataset rows 
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-29"
project: HPCC4J
key: HPCC4J-29
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2015-10-13
updated: 2015-11-12
resolved: 2015-11-12
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
HPCCWsDFUClient.getFileData gives duplicate child dataset rows 

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "HPCCWsDFUClient.getFileData returns rows of child dataset in a nodelist containing parent rows in addition to having them nested inside parent's rows."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

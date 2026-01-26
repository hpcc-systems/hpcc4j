---
id: jira-HPCC4J-273
title: HPCC4J-273 – Overload HPCCWsDFUClient.searchFiles(String logicalFilename, String cluster)  to take pagenum and pagesize parameters
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-273"
project: HPCC4J
key: HPCC4J-273
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-01-30
updated: 2020-02-06
resolved: 2020-02-06
components:   - WSClient
fixVersions:   - 7.6.24-0
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
Overload HPCCWsDFUClient.searchFiles(String logicalFilename, String cluster)  to take pagenum and pagesize parameters

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We need to be able to specify the page size and starting point when searching files."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

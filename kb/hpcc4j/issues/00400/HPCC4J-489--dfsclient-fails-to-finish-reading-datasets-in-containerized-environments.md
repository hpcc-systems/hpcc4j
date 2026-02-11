---
id: jira-HPCC4J-489
title: "HPCC4J-489 – DFSClient: fails to finish reading datasets in containerized environments"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-489"
project: HPCC4J
key: HPCC4J-489
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-08-17
updated: 2025-01-03
resolved: 2022-09-27
components:   - dfsclient
fixVersions:   - 8.8.16
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
DFSClient: fails to finish reading datasets in containerized environments

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The RowServiceInputStream appears to be continually waiting for data on the socket that never arrives."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

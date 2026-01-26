---
id: jira-HPCC4J-542
title: "HPCC4J-542 – DFSClient: Create JUnit to test file part copy retry"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-542"
project: HPCC4J
key: HPCC4J-542
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-09-06
updated: 2023-11-07
resolved: 2023-11-07
components:   - dfsclient
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
DFSClient: Create JUnit to test file part copy retry

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Create a test that ensures that read failure will result in retrying with the backup file part copy location will occur"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

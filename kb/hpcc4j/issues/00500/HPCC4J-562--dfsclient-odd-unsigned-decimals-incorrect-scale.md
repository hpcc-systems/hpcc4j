---
id: jira-HPCC4J-562
title: "HPCC4J-562 – DFSClient: Odd unsigned decimals incorrect scale"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-562"
project: HPCC4J
key: HPCC4J-562
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-12-13
updated: 2024-10-03
resolved: 2023-12-18
components:   - dfsclient
fixVersions:
  - 9.2.128
  - 9.4.102
  - 9.6.54
  - 9.8.28
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
DFSClient: Odd unsigned decimals incorrect scale

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Odd unsigned decimal fields are being converted to BigDecimals with a scale that is off by one"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

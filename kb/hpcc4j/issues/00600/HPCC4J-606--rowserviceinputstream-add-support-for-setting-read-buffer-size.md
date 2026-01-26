---
id: jira-HPCC4J-606
title: "HPCC4J-606 – RowServiceInputStream: Add support for setting read buffer size"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-606"
project: HPCC4J
key: HPCC4J-606
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-05-28
updated: 2025-02-25
resolved: 2025-02-25
components:   - dfsclient
fixVersions:   - 9.10.8
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
RowServiceInputStream: Add support for setting read buffer size

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Allow read buffer to be set independently of the read request size. Should allow read buffer size to be reduced to below read request size to improve memory utilization."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

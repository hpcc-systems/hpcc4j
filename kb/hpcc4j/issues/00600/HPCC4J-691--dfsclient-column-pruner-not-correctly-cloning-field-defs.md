---
id: jira-HPCC4J-691
title: "HPCC4J-691 – DFSClient: Column pruner not correctly cloning field defs"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-691"
project: HPCC4J
key: HPCC4J-691
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-02-10
updated: 2025-02-12
resolved: 2025-02-12
components:   - dfsclient
fixVersions:
  - 9.2.158
  - 9.4.132
  - 9.6.84
  - 9.8.60
  - 9.10.6
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
DFSClient: Column pruner not correctly cloning field defs

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "DFSClient column pruner in at least once edge case is currently returning a field definition without cloning the field definition."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

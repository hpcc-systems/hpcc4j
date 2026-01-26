---
id: jira-HPCC4J-678
title: HPCC4J-678 – Build deployment scripts should skip integration tests
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-678"
project: HPCC4J
key: HPCC4J-678
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-01-13
updated: 2025-01-21
resolved: 2025-01-13
components:   - BuildPackaging
fixVersions:
  - 9.10.0
  - 9.2.148
  - 9.4.122
  - 9.6.74
  - 9.8.48
  - 9.2.150
  - 9.4.124
  - 9.6.76
  - 9.8.50
  - 9.4.126
  - 9.6.78
  - 9.8.54
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
Build deployment scripts should skip integration tests

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Spark-HPCC uses integration tests as its remote tests instead of creating a specific RemoteTest profile. As such the deployment step runs the integration test and fails due to an HPCC cluster not being available."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

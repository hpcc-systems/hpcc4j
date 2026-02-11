---
id: jira-HPCC4J-613
title: HPCC4J-613 – Spark-hpcc connector trace context propagation
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-613"
project: HPCC4J
key: HPCC4J-613
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-06-07
updated: 2024-08-22
resolved: 2024-08-22
components:   - Spark
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
Spark-hpcc connector trace context propagation

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Ensure Spark/hpcc connector doesn\u2019t drop any available Otel trace/span information, and passes along information to any remote service "}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

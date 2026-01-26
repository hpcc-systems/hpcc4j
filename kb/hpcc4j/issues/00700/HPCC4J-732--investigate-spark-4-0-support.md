---
id: jira-HPCC4J-732
title: HPCC4J-732 – Investigate Spark 4.0 Support
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-732"
project: HPCC4J
key: HPCC4J-732
status: New
statusCategory: To Do
resolution: null
created: 2025-08-04
updated: 2025-08-18
resolved: null
components:   - Spark
fixVersions: []
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Investigate Spark 4.0 Support

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "With Spark 4.0\u2019s recent release we will likely need to drop Spark 2.0 support due to scala version incompatibility."}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.

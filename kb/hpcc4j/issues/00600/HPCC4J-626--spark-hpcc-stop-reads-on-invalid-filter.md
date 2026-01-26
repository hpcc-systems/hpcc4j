---
id: jira-HPCC4J-626
title: "HPCC4J-626 – Spark-HPCC: Stop reads on invalid filter"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-626"
project: HPCC4J
key: HPCC4J-626
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-08-15
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
Spark-HPCC: Stop reads on invalid filter

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We currently rely on the unhandledFilters() API to filter out invalid filters. However, this only catches invalid filters at granular basis and not filters that are invalid due to combinations."}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We also have a check for invalid filters during the actual read, that adds a warning that the filter wasn\u2019t applied"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The invalid filter message can be missed so invalid filters should instead prevent reads from continuing forward"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-393
title: HPCC4J-393 – Enable execution of spark connector remote tests
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-393"
project: HPCC4J
key: HPCC4J-393
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-03-12
updated: 2021-03-31
resolved: 2021-03-31
components:   - Spark
fixVersions:   - 8.0.0
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
Enable execution of spark connector remote tests

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Github actions and Jenkins builds should stand up a simple spark instance to test spark connector remote tests against."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

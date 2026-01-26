---
id: jira-HPCC4J-527
title: "HPCC4J-527 – Spark-HPCC: Maven deploy shouldn't run integration tests"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-527"
project: HPCC4J
key: HPCC4J-527
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-07-24
updated: 2023-07-25
resolved: 2023-07-25
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
Spark-HPCC: Maven deploy shouldn't run integration tests

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Recent changes moved / created integration tests that run during the mvn verify step"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The verify step is also run during mvn deploy"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The deploy scripts are not setup to initialize a testing environment so integration tests should be disabled in that environment"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Adding a property to the release profile used during deployment should correct the issue."}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

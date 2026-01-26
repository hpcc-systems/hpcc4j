---
id: jira-HPCC4J-427
title: HPCC4J-427 – Spark-hpcc on merge flow should wait for HPCC4J workflow success
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-427"
project: HPCC4J
key: HPCC4J-427
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-08-26
updated: 2024-04-08
resolved: 2021-09-14
components:   - BuildPackaging
fixVersions:   - 7.2.x
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
Spark-hpcc on merge flow should wait for HPCC4J workflow success

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The spark-hpcc \"onmerge\" workflow is triggering every time a new branch/tag is created, but not waiting on its dependencies to complete, thereby causing false-negative build results and notifications to the person committing the tag."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Consider limiting the trigger criteria, and/or adding a wait on an external event:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/marketplace/actions/wait-on-check#a-real-world-scenario", "marks": [{"type": "link", "attrs": {"href": "https://github.com/marketplace/actions/wait-on-check#a-real-world-scenario"}}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

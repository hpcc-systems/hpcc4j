---
id: jira-HPCC4J-677
title: HPCC4J-677 – Spark-HPCC nullptr exception on connection failure
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-677"
project: HPCC4J
key: HPCC4J-677
status: New
statusCategory: To Do
resolution: null
created: 2025-01-13
updated: 2025-09-30
resolved: null
components:   - Spark
fixVersions: []
labels:   - CopilotCandidate
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
pull_requests: []
---
## Outcome (from JIRA)
Spark-HPCC nullptr exception on connection failure

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Spark-HPCC can throw a nullptr exception if it cannot connect to the target HPCC cluster. This nullptr exception to should be corrected, and an appropriate error message generated."}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.

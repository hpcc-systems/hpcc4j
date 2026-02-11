---
id: jira-HPCC4J-479
title: "HPCC4J-479 – Spark-HPCC: Intermittent failure when attempting to read a file part"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-479"
project: HPCC4J
key: HPCC4J-479
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-08-05
updated: 2023-06-07
resolved: 2023-06-07
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
Spark-HPCC: Intermittent failure when attempting to read a file part

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "An internal user ran into an issue while using the Spark-HPCC connector where reading a file part will fail intermittently based. Error code seems to indicate the access token has expired, but the failure occurs well before the token could have expired."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "The failure is not linked to a specific node and does not always occur, but in the users setup occurs frequently enough to prevent the dataset from being read in most cases."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

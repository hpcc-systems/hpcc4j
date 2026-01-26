---
id: jira-HPCC4J-176
title: "HPCC4J-176 – Spark-HPCC: Choose primary file part based on locality"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-176"
project: HPCC4J
key: HPCC4J-176
status: Merge Pending
statusCategory: In Progress
resolution: Fixed
created: 2018-11-26
updated: 2025-10-15
resolved: 2019-04-17
components:   - dfsclient
fixVersions:   - 7.2.6
labels: []
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
Spark-HPCC: Choose primary file part based on locality

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Due to how Spark uses preferred partition locations, often times a reading job will be assigned to the secondary source for a file part. However, in PlainConnection.java we always attempt to connect to the primary file part source first. This causes a non-local read. PlainConnection.java should prioritize local reads over the primary source."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-400
title: HPCC4J-400 – Upgrade HPCC-Spark version from 2.11 to 2.12
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-400"
project: HPCC4J
key: HPCC4J-400
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-09-15
updated: 2021-04-09
resolved: 2021-04-09
components:   - Spark
fixVersions:   - 8.0.6
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
Upgrade HPCC-Spark version from 2.11 to 2.12

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "There are a lot of new features in Spark 3.+ java jars, which only have scala 2.12 support.\u00a0 Can the thor spark-hpcc component be upgraded from 2.11 to 2.12 so that we can use the latest java dependencies for spark-ml, spark-sql and spark-core with it?"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

## Related
- 01. Relates: HPCC-24768

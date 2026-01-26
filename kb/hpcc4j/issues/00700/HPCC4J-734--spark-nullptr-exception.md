---
id: jira-HPCC4J-734
title: HPCC4J-734 – Spark Nullptr Exception
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-734"
project: HPCC4J
key: HPCC4J-734
status: New
statusCategory: To Do
resolution: null
created: 2025-08-13
updated: 2025-08-13
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
Spark Nullptr Exception

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "System info:"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "java 17"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "spark 3.5.0"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "spark-hpcc-9.14.10-1-jar-with-dependencies.jar"}]}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "org.apache.spark.SparkException: Job aborted due to stage failure: Task 0 in stage 1.0 failed 4 times, most recent failure: Lost task 0.3 in stage 1.0 (TID 1213) (10.107.13.22 executor 0): java.lang.NullPointerException: Cannot invoke \"scala.collection.Iterator.map(scala.Function1)\" because \"iterator\" is null"}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.

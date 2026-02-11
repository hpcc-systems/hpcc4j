---
id: jira-HPCC4J-467
title: HPCC4J-467 – HTTPPreemptive Auth forces non-null user name
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-467"
project: HPCC4J
key: HPCC4J-467
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-06-27
updated: 2022-06-29
resolved: 2022-06-29
components:   - WSClient
fixVersions:   - 8.8.0
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
HTTPPreemptive Auth forces non-null user name

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "{{: java.lang.RuntimeException: Unable to translate HPCC record defintion to Spark schema:Could not fetch 'benchmark::integer::20kb' info from WsDFU ESP due to wsdfuclient init error: WS Client Stub not available."}, {"type": "hardBreak"}, {"type": "text", "text": "Username may not be null"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0 \u00a0at org.hpccsystems.spark.datasource.HpccRelation.schema(HpccRelation.java:77)"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0 \u00a0at org.apache.spark.sql.execution.datasources.DataSource.resolveRelation(DataSource.scala:440)"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0 \u00a0at org.apache.spark.sql.DataFrameReader.loadV1Source(DataFrameReader.scala:228)"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0 \u00a0at org.apache.spark.sql.DataFrameRe

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

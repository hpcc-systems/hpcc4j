---
id: jira-HPCC4J-382
title: HPCC4J-382 – Pushdown filters in Spark Connector
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-382"
project: HPCC4J
key: HPCC4J-382
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-02-09
updated: 2021-03-09
resolved: 2021-03-09
components:   - Spark
fixVersions:   - 7.12.x
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
Pushdown filters in Spark Connector

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "I'm getting questions about \"push down\" filtering with the Spark HPCC Connector."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "I'm trying to get clarification from the engineer here at the client."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://spark.apache.org/docs/latest/sql-data-sources-parquet.html", "marks": [{"type": "link", "attrs": {"href": "https://spark.apache.org/docs/latest/sql-data-sources-parquet.html"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "This page shows:"}]}, {"type": "table", "attrs": {"isNumberColumnEnabled": false, "layout": "default"}, "content": [{"type": "tableRow", "content": [{"type": "tableCell", "attrs": {}, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "spark.sql.parquet.*filterPushdown*",

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

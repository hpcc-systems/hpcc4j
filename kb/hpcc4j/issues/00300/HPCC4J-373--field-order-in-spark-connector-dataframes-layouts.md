---
id: jira-HPCC4J-373
title: HPCC4J-373 – Field order in Spark Connector dataframes/layouts
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-373"
project: HPCC4J
key: HPCC4J-373
status: Resolved
statusCategory: Done
resolution: Done
created: 2021-01-06
updated: 2024-04-08
resolved: 2021-02-03
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
Field order in Spark Connector dataframes/layouts

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Getting a question from an on-site user at my client, as follows:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "The connector fails on DataFrame calls that access file content when the order of field elements in the ECL record do not match the order of elements in the DataFrame created by the connector."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "I the following example, DataFrame calls like show, count, and select on view fail."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "ECL record:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "codeBlock", "content": [{"type": "text", "text": "RECORD\r\nstring4 field1;\r\nboolean field2;\r\nstring8 field3;\r\nEND;"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.

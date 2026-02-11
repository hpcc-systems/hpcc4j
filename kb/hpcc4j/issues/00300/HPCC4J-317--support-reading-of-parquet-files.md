---
id: jira-HPCC4J-317
title: HPCC4J-317 – Support reading of Parquet files
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-317"
project: HPCC4J
key: HPCC4J-317
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-09-27
updated: 2021-01-19
resolved: 2021-01-19
components:   - dfsclient
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
Support reading of Parquet files

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Add support for reading Parquet files into HPCC. This could potential be accomplished via the in progress HDFS connector. This would require any Parquet files to be an HDFS cluster accessible by HPCC>"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-271
title: HPCC4J-271 – Spark binary should not be downloaded at build-time
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-271"
project: HPCC4J
key: HPCC4J-271
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-01-13
updated: 2020-09-25
resolved: 2020-09-25
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
Spark binary should not be downloaded at build-time

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Noticed that spark is downloaded at build-time:"}, {"type": "hardBreak"}, {"type": "text", "text": "[ 86%] Performing download step (download, verify and extract) for 'fetch-spark-source'"}, {"type": "hardBreak"}, {"type": "text", "text": "\u2013 Downloading..."}, {"type": "hardBreak"}, {"type": "text", "text": "dst='/home/hadoop/GIT/HPCC-build/downloads/spark-2.4.3-bin-hadoop2.7.tgz'"}, {"type": "hardBreak"}, {"type": "text", "text": "timeout='300 seconds'"}, {"type": "hardBreak"}, {"type": "text", "text": "\u2013 Using src='"}, {"type": "text", "text": "https://archive.apache.org/dist/spark/spark-2.4.3/spark-2.4.3-bin-hadoop2.7.tgz", "marks": [{"type": "link", "attrs": {"href": "https://archive.apache.org/dist/spark/spark-2.4.3/spark-2.4.3-bin-hadoop2.7.tgz"}}]}, {"type": "text", "text": "'"}, {"type": "hardBreak"}, {"type": "text", "text": "\u2013 [download 0% complete]"}, {"type":

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

## Related
- 01. Relates: HPCC-24359

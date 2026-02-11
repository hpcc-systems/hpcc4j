---
id: jira-HPCC4J-661
title: HPCC4J-661 – Error when using a narrow filter with spark-hpcc connector
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-661"
project: HPCC4J
key: HPCC4J-661
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-11-05
updated: 2025-05-06
resolved: 2025-05-06
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
Error when using a narrow filter with spark-hpcc connector

{"type": "doc", "version": 1, "content": [{"type": "heading", "attrs": {"level": 4}, "content": [{"type": "text", "text": "Summary"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "I am trying to read a business header file and push down a filter to pick out information on 1 seleid, but I get a "}, {"type": "text", "text": "NoSuchElementException", "marks": [{"type": "code"}]}, {"type": "text", "text": " error."}]}, {"type": "heading", "attrs": {"level": 4}, "content": [{"type": "text", "text": "PySpark code"}]}, {"type": "codeBlock", "attrs": {"language": "python"}, "content": [{"type": "text", "text": "DATALAND_PROD = \"https://eclwatch-hpcc.us-dataland-prod.azure.lnrsg.io:443\"\n\ndf1 = spark.read.load(\n    format=\"hpcc\",\n    host=DATALAND_PROD,\n    path=\"thor_data400::bipv2::internal_linking::built::clean\",\n    filter=\"seleid = 96565\",\n    username=username,\n    password=password,\n    fileaccesstimeout=7200,\n    useTLK=\"false\",\n)\n\ndf1.limit(10).sho

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

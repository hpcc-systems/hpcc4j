---
id: jira-HPCC4J-610
title: HPCC4J-610 – `fp` field converted to `void` type in spark
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-610"
project: HPCC4J
key: HPCC4J-610
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-06-06
updated: 2024-09-24
resolved: 2024-09-24
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
`fp` field converted to `void` type in spark

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Using following code to read a superfile with fp field:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://eclwatch-hpcc.us-prod400thor-prod.azure.lnrsg.io/esp/files/index.html#/files/data/thor_data400::key::bipv2_best::qa::linkids", "marks": [{"type": "link", "attrs": {"href": "https://eclwatch-hpcc.us-prod400thor-prod.azure.lnrsg.io/esp/files/index.html#/files/data/thor_data400::key::bipv2_best::qa::linkids"}}]}]}, {"type": "codeBlock", "content": [{"type": "text", "text": "spark.read.load(\n    format=\"hpcc\",\n    host = \"https://eclwatch-hpcc.us-prod400thor-prod.azure.lnrsg.io:443\",\n    username=\"gravesee\",\n    password=pw,\n    path = \"thor_data400::key::bipv2_best::qa::linkids\",\n    fileaccesstimeout=7200,\n    limitperfilepart=10,\n    projectlist=\"fp\"\n)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Produces the following sc

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-420
title: HPCC4J-420 – HpccRelation should declare an equals function
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-420"
project: HPCC4J
key: HPCC4J-420
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-05-18
updated: 2021-06-08
resolved: 2021-06-08
components:   - Spark
fixVersions:   - 8.0.20
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
HpccRelation should declare an equals function

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "HpccRelation should declare an equals function to allow cached datasets created by the relation to be reused if they match an existing in memory dataset."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

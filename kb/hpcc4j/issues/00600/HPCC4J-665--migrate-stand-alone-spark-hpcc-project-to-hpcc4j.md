---
id: jira-HPCC4J-665
title: HPCC4J-665 – Migrate stand-alone Spark-hpcc project to hpcc4j
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-665"
project: HPCC4J
key: HPCC4J-665
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-11-06
updated: 2025-04-22
resolved: 2025-04-22
components:
  - BuildPackaging
  - Spark
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
Migrate stand-alone Spark-hpcc project to hpcc4j

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Consolidate existing stand-alone project \u201cspark-hpcc\u201d into hpcc4j project as a sub-project managed by the hpcc4j pom."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "The major advantage of this change is the dependence on locally built sub-projects  (commons-hpcc, wsclient, dfsclient)  which allows spark-hpcc to be built without a timed dependency on remote projects."}]}, {"type": "paragraph"}, {"type": "paragraph", "content": [{"type": "text", "text": "Required changes: "}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Spark-hpcc repo labeled dormant "}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Spark-hpcc repo toplevel readme should clearly report migration and include link to new location"}]}]}, {"type": "listItem", "co

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

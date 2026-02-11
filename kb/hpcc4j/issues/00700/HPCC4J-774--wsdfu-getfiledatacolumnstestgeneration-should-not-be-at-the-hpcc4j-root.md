---
id: jira-HPCC4J-774
title: HPCC4J-774 – WsDFU_getFileDataColumnsTestGeneration should not be at the hpcc4j root
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-774"
project: HPCC4J
key: HPCC4J-774
status: New
statusCategory: To Do
resolution: null
created: 2026-01-07
updated: 2026-01-07
resolved: null
components:   - BuildPackaging
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
WsDFU_getFileDataColumnsTestGeneration should not be at the hpcc4j root

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WsDFU_getFileDataColumnsTestGeneration", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/tree/master/WsDFU_getFileDataColumnsTestGeneration"}}]}, {"type": "text", "text": " seems to have been misplaced at the root of hpcc4j"}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.

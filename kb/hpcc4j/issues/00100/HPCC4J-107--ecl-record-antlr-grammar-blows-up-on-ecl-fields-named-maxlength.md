---
id: jira-HPCC4J-107
title: "HPCC4J-107 – ecl record antlr grammar blows up on ecl fields named \"maxlength\""
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-107"
project: HPCC4J
key: HPCC4J-107
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-10-18
updated: 2018-06-22
resolved: 2018-06-22
components:   - WSClient
fixVersions:   - 1.2.2
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
ecl record antlr grammar blows up on ecl fields named "maxlength"

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "the antlr grammar fails when it comes across a field named \"maxlength\". need to update the grammar."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-425
title: HPCC4J-425 – Javadoc build break in 8.2.x
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-425"
project: HPCC4J
key: HPCC4J-425
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-08-05
updated: 2021-09-14
resolved: 2021-09-14
components:   - WSClient
fixVersions:   - 8.2.x
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
Javadoc build break in 8.2.x

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Javadoc test seems to be failing in 8.2.x"}, {"type": "hardBreak"}, {"type": "text", "text": "It seems there are 2 warning types being reported as errors:"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "warning: no description for @throws", "marks": [{"type": "textColor", "attrs": {"color": "#ff0000"}}, {"type": "em"}]}, {"type": "text", "text": " "}, {"type": "hardBreak"}, {"type": "text", "text": "and"}, {"type": "hardBreak"}, {"type": "text", "text": "warning - Tag @link: can't find record_defs in XYZ", "marks": [{"type": "textColor", "attrs": {"color": "#ff0000"}}, {"type": "em"}]}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

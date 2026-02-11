---
id: jira-HPCC4J-714
title: HPCC4J-714 – test-against-platform fails waiting on eclwatch pod
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-714"
project: HPCC4J
key: HPCC4J-714
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-04-30
updated: 2025-05-13
resolved: null
components:   - BuildPackaging
fixVersions: []
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: high
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
test-against-platform fails waiting on eclwatch pod

{"type": "doc", "version": 1, "content": [{"type": "table", "attrs": {"isNumberColumnEnabled": false, "layout": "center", "localId": "edcba198-3b1c-4307-99a9-c2119e6d93a0"}, "content": [{"type": "tableRow", "content": [{"type": "tableCell", "attrs": {}, "content": [{"type": "paragraph"}]}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": " ", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/actions/runs/14759700488/job/41437072639#annotation:10:18"}}]}, {"type": "text", "text": "Wait for ECLWatch Startup", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/actions/runs/14759700488/job/41437072639#annotation:10:18"}}, {"type": "strong"}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Process completed with exit code 1."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Thank you for installing the HPCC chart version 9.10.24 using image \"hpccsystems/platform-core:9.10.24\""

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-674
title: HPCC4J-674 – Baremetal github action uses soon to be deprecated set-output
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-674"
project: HPCC4J
key: HPCC4J-674
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-12-17
updated: 2025-01-07
resolved: 2025-01-07
components:   - BuildPackaging
fixVersions:
  - 9.2.148
  - 9.4.122
  - 9.6.74
  - 9.8.48
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
Baremetal github action uses soon to be deprecated set-output

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "See warning annotations here: "}]}, {"type": "paragraph", "content": [{"type": "inlineCard", "attrs": {"url": "https://github.com/hpcc-systems/hpcc4j/actions/runs/12359160194"}}, {"type": "text", "text": " "}]}, {"type": "paragraph"}, {"type": "paragraph", "content": [{"type": "text", "text": "test-against-platform", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/actions/runs/12359160194/job/34491262111#step:6:107"}}, {"type": "strong"}]}, {"type": "text", "text": " ", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/actions/runs/12359160194/job/34491262111#step:6:107"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "The `set-output` command is deprecated and will be disabled soon. Please upgrade to using Environment Files. For more information see: "}, {"type": "inlineCard", "attrs": {"url": "h

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

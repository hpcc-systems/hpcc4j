---
id: jira-HPCC4J-624
title: HPCC4J-624 – RowServiceInputStream handle read before close cleanup
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-624"
project: HPCC4J
key: HPCC4J-624
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-08-01
updated: 2024-08-02
resolved: 2024-08-02
components: []
fixVersions:
  - 9.2.110
  - 9.4.84
  - 9.6.36
  - 9.8.10
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
RowServiceInputStream handle read before close cleanup

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Various cleanup changes based on this PR:"}]}, {"type": "paragraph", "content": [{"type": "inlineCard", "attrs": {"url": "https://github.com/hpcc-systems/hpcc4j/pull/730/files"}}, {"type": "text", "text": " "}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

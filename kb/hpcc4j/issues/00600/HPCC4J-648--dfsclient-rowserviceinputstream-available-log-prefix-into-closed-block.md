---
id: jira-HPCC4J-648
title: HPCC4J-648 – DFSClient RowServiceInputStream available() log prefix into closed block
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-648"
project: HPCC4J
key: HPCC4J-648
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-09-18
updated: 2024-09-18
resolved: 2024-09-18
components:   - dfsclient
fixVersions:
  - 9.8.22
  - 9.6.48
  - 9.4.96
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
DFSClient RowServiceInputStream available() log prefix into closed block

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "A log line prefix was added to parts of the RowServiceInputStream to improve logging see: "}, {"type": "inlineCard", "attrs": {"url": "https://hpccsystems.atlassian.net/browse/HPCC4J-595"}}, {"type": "text", "text": " "}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "available() may be called often and the prefix is being constructed even if not used and could affect performance so it should be moved into the closed block where it is being used."}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-440
title: "HPCC4J-440 – Process valid TLKs - currently dropping \"empty\" TLKs"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-440"
project: HPCC4J
key: HPCC4J-440
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-10-26
updated: 2022-01-13
resolved: 2022-01-13
components:   - dfsclient
fixVersions:   - 8.4.24
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
Process valid TLKs - currently dropping "empty" TLKs

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Proper fix for issue reported in "}, {"type": "text", "text": "https://hpccsystems.atlassian.net/browse/JAPI-438", "marks": [{"type": "link", "attrs": {"href": "https://hpccsystems.atlassian.net/browse/JAPI-438"}}]}, {"type": "text", "text": " needed."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Current work-around drops \"empty\" TLKs"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

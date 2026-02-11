---
id: jira-HPCC4J-342
title: "HPCC4J-342 – Can't write DATAXX fields with dfsclient"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-342"
project: HPCC4J
key: HPCC4J-342
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-10-19
updated: 2020-10-20
resolved: 2020-10-20
components:   - dfsclient
fixVersions:   - 7.12.4
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
Can't write DATAXX fields with dfsclient

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When writing a DATA field that has a length defined, the write appears to complete with no errors but the file is not available."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "http://10.173.147.1:8010/", "marks": [{"type": "link", "attrs": {"href": "http://10.173.147.1:8010/"}}]}, {"type": "text", "text": "\u00a0 file ~test::datatypes"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

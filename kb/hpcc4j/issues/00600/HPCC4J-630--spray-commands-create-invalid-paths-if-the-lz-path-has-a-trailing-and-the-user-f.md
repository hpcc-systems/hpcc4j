---
id: jira-HPCC4J-630
title: "HPCC4J-630 – Spray* commands create invalid paths if the LZ path has a trailing '/' and the user file paths have a leading '/'"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-630"
project: HPCC4J
key: HPCC4J-630
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-08-16
updated: 2024-08-23
resolved: 2024-08-23
components: []
fixVersions:
  - 9.6.42
  - 9.8.16
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
Spray* commands create invalid paths if the LZ path has a trailing '/' and the user file paths have a leading '/'

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When calling the spray commands (e.g. sprayVariable) the path sent to the esp service is invalidly constructed, if the LZ path has a trailing \u201c/\u201d and the user file path has a leading \u201c/\u201d."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "e.g. if the LZ path is \u201c/\u201d and the user file path is \u201c/ap6/somefile\u201d, hpcc4j creates and sends \u201c//ap6/somefile\u201d."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "This is interpreted as a UNC path, i.e. the esp service sees this as //<host>/somefile and the security validation reject it because \u201cap6\u201d is unknown in this LZ."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

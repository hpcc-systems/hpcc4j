---
id: jira-HPCC4J-326
title: HPCC4J-326 – Provide option to report summary of file stream warns/errs
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-326"
project: HPCC4J
key: HPCC4J-326
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-09-03
updated: 2020-09-21
resolved: 2020-09-21
components:   - dfsclient
fixVersions:   - 7.10.x
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
Provide option to report summary of file stream warns/errs

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Repetitive warnings/errors reported to log could be considered noise, and might impact performance. Provide option to report summary instead."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Relates to JAPI-218 "}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-327
title: HPCC4J-327 – Provide option to utilize larger Java data types to avoid overflow
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-327"
project: HPCC4J
key: HPCC4J-327
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-09-03
updated: 2020-10-19
resolved: 2020-10-19
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
Provide option to utilize larger Java data types to avoid overflow

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "As reported in JAPI-218, certain ECL datatypes might not map directly to native Java datatypes. Provide option to utilize larger data types to represent those ECL datatypes. "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Relates to JAPI-218"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

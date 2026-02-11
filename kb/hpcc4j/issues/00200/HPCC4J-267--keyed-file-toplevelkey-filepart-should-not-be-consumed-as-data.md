---
id: jira-HPCC4J-267
title: HPCC4J-267 – Keyed file toplevelkey filepart should not be consumed as data
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-267"
project: HPCC4J
key: HPCC4J-267
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-12-18
updated: 2020-01-13
resolved: 2020-01-13
components:   - dfsclient
fixVersions:   - 7.4.18
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
Keyed file toplevelkey filepart should not be consumed as data

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently, the fileaccess response from wsdfu reports all file part information + the top level key  as a regular file part. Until the ESP provides indication of file part type, the n+1 file part of a keyed file should be considered metadata and not consumed as data."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

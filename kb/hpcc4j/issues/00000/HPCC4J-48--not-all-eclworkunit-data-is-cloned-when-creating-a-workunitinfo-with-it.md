---
id: jira-HPCC4J-48
title: HPCC4J-48 – Not all ECLWorkunit data is cloned when creating a WorkunitInfo with it
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-48"
project: HPCC4J
key: HPCC4J-48
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2016-06-01
updated: 2016-06-13
resolved: 2016-06-13
components:   - WSClient
fixVersions: []
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
Not all ECLWorkunit data is cloned when creating a WorkunitInfo with it

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The helpers and some other information is not being grabbed when creating a WorkunitInfo object from an ECLWorkunit object."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

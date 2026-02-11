---
id: jira-HPCC4J-34
title: HPCC4J-34 – Update wsClient to contain soap services in HPCC version 1.56
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-34"
project: HPCC4J
key: HPCC4J-34
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2015-11-13
updated: 2016-01-21
resolved: 2016-01-21
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
Update wsClient to contain soap services in HPCC version 1.56

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "HIPIE needs to be able to delete query files via soap services, but the current HPCC-JAPI interface doesn't include the WUQueryFiles service."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Can WSClient be updated with the latest soap interface for HPCC 1.56 or greater, that has this service in it?"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "HIPIE enhancement "}, {"type": "text", "text": "https://github.com/hpcc-systems/HIPIE/issues/1142", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/HIPIE/issues/1142"}}]}, {"type": "text", "text": " is dependent on this."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

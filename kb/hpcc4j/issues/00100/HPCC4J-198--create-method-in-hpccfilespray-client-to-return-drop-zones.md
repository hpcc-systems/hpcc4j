---
id: jira-HPCC4J-198
title: HPCC4J-198 – Create method in HPCCFileSpray client to return drop zones
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-198"
project: HPCC4J
key: HPCC4J-198
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-05-21
updated: 2019-09-16
resolved: 2019-09-16
components:   - WSClient
fixVersions:   - 7.6.0
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
Create method in HPCCFileSpray client to return drop zones

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently Salt/HIPIE have to access the soap proxy directly to retrieve drop zone information. It would be useful to have a method in the platform class that returned this information."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

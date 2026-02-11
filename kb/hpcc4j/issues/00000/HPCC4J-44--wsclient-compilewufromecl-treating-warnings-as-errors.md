---
id: jira-HPCC4J-44
title: HPCC4J-44 – wsclient compileWUFromECL treating warnings as errors
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-44"
project: HPCC4J
key: HPCC4J-44
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2016-04-19
updated: 2016-04-19
resolved: 2016-04-19
components:   - WSClient
fixVersions:   - 0.6.4
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
wsclient compileWUFromECL treating warnings as errors

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Recent change to this method fails if errors exist for the workunit. Warnings are included as errors. The check for errors needs to be updated."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

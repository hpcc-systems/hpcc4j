---
id: jira-HPCC4J-361
title: "HPCC4J-361 – Ability to \"restart\" a file read"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-361"
project: HPCC4J
key: HPCC4J-361
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-11-18
updated: 2020-12-04
resolved: 2020-12-04
components:   - dfsclient
fixVersions:   - 7.12.12
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
Ability to "restart" a file read

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When reading large files from hpcc there's a potential for the connection failing/dropping/timing out. If possible it would be very useful to be able to \"resume\" a file transfer from a given point."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "For instance, when transferring the boca header files (multiple tb) from hpcc to azure/oracle/etc."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

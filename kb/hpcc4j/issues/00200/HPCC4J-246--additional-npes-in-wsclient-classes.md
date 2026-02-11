---
id: jira-HPCC4J-246
title: HPCC4J-246 – Additional NPEs in wsclient classes
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-246"
project: HPCC4J
key: HPCC4J-246
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-10-22
updated: 2019-10-25
resolved: 2019-10-25
components:   - WSClient
fixVersions:   - 7.6.6
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
Additional NPEs in wsclient classes

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Integration testing in the tardis code uncovered a few more npe exceptions in the wsclient code:"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "HPCCWSWorkunitsClient.createWorkunit(), resp.getExceptions() needs to be checked for null"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "ECLSourceFileWrapper.setSourceFiles(), eclSourceFiles needs to be checked for null"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "WUCreateAndUpdateWrapper, convert  addDrilldownFields, protectedOrig and _protected from Boolean to boolean to avoid NPEs when setting boolean raw soap fields"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

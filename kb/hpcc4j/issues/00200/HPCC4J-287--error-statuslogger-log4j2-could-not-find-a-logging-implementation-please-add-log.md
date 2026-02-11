---
id: jira-HPCC4J-287
title: HPCC4J-287 – ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-287"
project: HPCC4J
key: HPCC4J-287
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-03-30
updated: 2020-04-20
resolved: 2020-04-20
components:   - BuildPackaging
fixVersions:   - 7.8.4
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
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Error reported in log at runtime:"}, {"type": "hardBreak"}, {"type": "text", "text": "ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console..."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

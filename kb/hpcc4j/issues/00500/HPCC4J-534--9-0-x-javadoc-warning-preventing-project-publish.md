---
id: jira-HPCC4J-534
title: HPCC4J-534 – 9.0.x Javadoc warning preventing project publish
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-534"
project: HPCC4J
key: HPCC4J-534
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-08-16
updated: 2023-08-21
resolved: 2023-08-21
components:
  - BuildPackaging
  - Spark
fixVersions:   - 9.0.x
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
9.0.x Javadoc warning preventing project publish

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Javadoc Warnings "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Warning:  /home/runner/work/hpcc4j/hpcc4j/wsclient/src/main/java/org/hpccsystems/ws/client/HPCCWsWorkUnitsClient.java:796: warning: @return has already been specified "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Warning:  * @return - ECLWorkunit object with information pertaining to the WU"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

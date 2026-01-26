---
id: jira-HPCC4J-544
title: HPCC4J-544 – WUQueryTest junit failure
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-544"
project: HPCC4J
key: HPCC4J-544
status: Resolved
statusCategory: Done
resolution: Cannot Reproduce
created: 2023-09-26
updated: 2023-12-07
resolved: 2023-12-07
components:   - WSClient
fixVersions:   - 9.4.x
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
WUQueryTest junit failure

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "[INFO] Running org.hpccsystems.ws.client.WUQueryTest "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Error:  Tests run: 2, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 10.242 s <<< FAILURE! - in org.hpccsystems.ws.client.WUQueryTest "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Error:  testGetWorkunitSort(org.hpccsystems.ws.client.WUQueryTest) Time elapsed: 0.039 s <<< ERROR! "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1 "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.hpccsystems.ws.client.WUQueryTest.testGetWorkunitSort(WUQueryTest.java:63) "}, {"

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.

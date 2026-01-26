---
id: jira-HPCC4J-392
title: HPCC4J-392 – Master branch contains junit failure
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-392"
project: HPCC4J
key: HPCC4J-392
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-03-11
updated: 2021-03-12
resolved: 2021-03-12
components:   - BuildPackaging
fixVersions:   - 7.12.38
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
Master branch contains junit failure

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Github actions remote test fails with following error:"}, {"type": "hardBreak"}, {"type": "text", "text": "Error:  Tests run: 15, Failures: 1, Errors: 0, Skipped: 1, Time elapsed: 5.747 s <<< FAILURE! - in org.hpccsystems.ws.client.FileSprayClientTest "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Error:  testSprayCSV(org.hpccsystems.ws.client.FileSprayClientTest) Time elapsed: 0.047 s <<< FAILURE! "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "java.lang.AssertionError "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "at org.hpccsystems.ws.client.FileSprayClientTest.testSprayCSV(FileSprayClientTest.java:200)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "par

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

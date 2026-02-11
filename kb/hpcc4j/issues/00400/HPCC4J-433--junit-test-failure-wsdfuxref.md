---
id: jira-HPCC4J-433
title: HPCC4J-433 – Junit test failure WsDFUXRef
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-433"
project: HPCC4J
key: HPCC4J-433
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-09-28
updated: 2021-10-05
resolved: 2021-10-05
components:   - WSClient
fixVersions:   - 8.4.2
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
Junit test failure WsDFUXRef

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Error:  Errors: "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Error:  WsDFUXRefClientTest.A1_testXRefBuild \u00bb ExceptionInInitializer "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Error:  WsDFUXRefClientTest.A2_testXRefList \u00bb NoClassDefFound Could not initialize cla... "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Error:  WsDFUXRefClientTest.Z9_testXRefBuildCancel \u00bb NoClassDefFound Could not initial... "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Error:  WsDFUXRefClientTest.testCleanDirectories \u00bb NoClassDefFound Could not initializ... "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "h

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

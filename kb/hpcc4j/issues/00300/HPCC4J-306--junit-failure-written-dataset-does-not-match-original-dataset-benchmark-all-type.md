---
id: jira-HPCC4J-306
title: "HPCC4J-306 – Junit failure: Written dataset does not match original dataset: ~benchmark::all_types::200kb-copy13"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-306"
project: HPCC4J
key: HPCC4J-306
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-05-06
updated: 2020-05-12
resolved: 2020-05-12
components:   - dfsclient
fixVersions:   - 7.8.14
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
Junit failure: Written dataset does not match original dataset: ~benchmark::all_types::200kb-copy13

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Regression"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "org.hpccsystems.dfs.client.DFSReadWriteTest.integrationReadWriteBackTest"}, {"type": "hardBreak"}, {"type": "text", "text": "Failing for the past 1 build (Since Unstable#59 )"}, {"type": "hardBreak"}, {"type": "text", "text": "Took 0.52 sec."}, {"type": "hardBreak"}, {"type": "text", "text": "add description"}, {"type": "hardBreak"}, {"type": "text", "text": "Error Message"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Written dataset does not match original dataset: ~benchmark::all_types::200kb-copy13"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Stacktrace"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "java.lang.AssertionError: Written dataset does not match original dataset: ~benchmark::all_types::200kb-copy13"}, {"type": "hardBreak"}, {"type": "text", "

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

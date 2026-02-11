---
id: jira-HPCC4J-332
title: HPCC4J-332 – Synchronize wsclient with latest ESP interfaces
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-332"
project: HPCC4J
key: HPCC4J-332
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-09-21
updated: 2020-09-29
resolved: 2020-09-29
components:   - WSClient
fixVersions:   - 7.12.2
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
Synchronize wsclient with latest ESP interfaces

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "wsclient 7.10.x   hpcc 7.10.x  hpcc master"}, {"type": "hardBreak"}, {"type": "text", "text": "wsdfu 151           155          155"}, {"type": "hardBreak"}, {"type": "text", "text": "filespray 117       119          120"}, {"type": "hardBreak"}, {"type": "text", "text": "packageproc 103     104          104"}, {"type": "hardBreak"}, {"type": "text", "text": "wscmc 121           123          123"}, {"type": "hardBreak"}, {"type": "text", "text": "wssql 105(mislabel) 305          305"}, {"type": "hardBreak"}, {"type": "text", "text": "wsstore 101         102          102"}, {"type": "hardBreak"}, {"type": "text", "text": "wsworkunits 156-175 178          179  (178 restructured for compile time mem consumption, could cause issues)"}, {"type": "hardBreak"}, {"type": "text", "text": "wstopology 128    130          1.30"}, {"type": "hardBreak"}, {"type": "text", "text": "ws_codesign (new)

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-416
title: HPCC4J-416 – Provide option to compress requests (provide guard against maxrequestentity)
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-416"
project: HPCC4J
key: HPCC4J-416
status: Resolved
statusCategory: Done
resolution: Timed Out
created: 2021-05-06
updated: 2024-04-08
resolved: 2023-02-09
components:   - WSClient
fixVersions: []
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
Provide option to compress requests (provide guard against maxrequestentity)

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Provide option to compress ESP requests, which can help avoid maxrequestsentitylengh cap at ESP side."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "ECLCMD.exe provides template:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/hpcc-systems/HPCC-Platform/blob/68b1de87bd6ec7d065e496d699524a6ff650dcaa/ecl/eclcmd/eclcmd_core.cpp#L98", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/HPCC-Platform/blob/68b1de87bd6ec7d065e496d699524a6ff650dcaa/ecl/eclcmd/eclcmd_core.cpp#L98"}}]}]}]}

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.

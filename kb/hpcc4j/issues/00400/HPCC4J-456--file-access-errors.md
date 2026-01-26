---
id: jira-HPCC4J-456
title: HPCC4J-456 – File Access Errors
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-456"
project: HPCC4J
key: HPCC4J-456
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-05-03
updated: 2024-04-08
resolved: 2022-05-19
components: []
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
File Access Errors

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "I am getting Create access denied errors though the user has write access."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "2022-05-03 09:52:48 DEBUG PoolingHttpClientConnectionManager:344 - Connection [id: 1][route: {s}->https://ramps-dev.hpcc.risk.regn.net:18010]\u00a0can be kept alive indefinitely"}, {"type": "hardBreak"}, {"type": "text", "text": "2022-05-03 09:52:48 DEBUG DefaultManagedHttpClientConnection:88 - http-outgoing-1: set socket timeout to 0"}, {"type": "hardBreak"}, {"type": "text", "text": "2022-05-03 09:52:48 DEBUG PoolingHttpClientConnectionManager:351 - Connection released: [id: 1][route: {s}->https://ramps-dev.hpcc.risk.regn.net:18010][total\u00a0available: 1; route allocated: 1 of 2; total allocated: 1 of 20]"}, {"type": "hardBreak"}, {"type": "text", "text": "2022-05-03 09:52:

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

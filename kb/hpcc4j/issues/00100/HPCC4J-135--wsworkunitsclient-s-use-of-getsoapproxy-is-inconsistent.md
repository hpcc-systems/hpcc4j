---
id: jira-HPCC4J-135
title: "HPCC4J-135 – WsWorkUnitsClient's use of getSoapProxy is inconsistent"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-135"
project: HPCC4J
key: HPCC4J-135
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-11-01
updated: 2019-01-15
resolved: 2019-01-15
components:   - WSClient
fixVersions:   - 7.2.0
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
WsWorkUnitsClient's use of getSoapProxy is inconsistent

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Some methods utilize the getsoapproxy method, some access the member var\u00a0wsWorkunitsServiceSoapProxy directly instead. We should ensure proper use of the method/member var. Also, the method should perhaps be renamed to \"ensureSoapProxy\""}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

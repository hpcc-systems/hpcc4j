---
id: jira-HPCC4J-213
title: HPCC4J-213 – WsWorkunitsClientSoapProxyWrapper.WUCreateAndUpdate fails against a 7.4.x cluster
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-213"
project: HPCC4J
key: HPCC4J-213
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-07-03
updated: 2019-07-08
resolved: 2019-07-08
components:   - WSClient
fixVersions:   - 7.4.2
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
WsWorkunitsClientSoapProxyWrapper.WUCreateAndUpdate fails against a 7.4.x cluster

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "useVersion1_74() needs to handle 7.4.x clusters as well as 7.2.x clusters"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

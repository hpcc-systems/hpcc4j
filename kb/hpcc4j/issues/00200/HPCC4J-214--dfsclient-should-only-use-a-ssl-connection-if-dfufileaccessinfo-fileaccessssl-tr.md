---
id: jira-HPCC4J-214
title: HPCC4J-214 – Dfsclient should only use a SSL connection if DFUFileAccessInfo.fileAccessSSL = true
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-214"
project: HPCC4J
key: HPCC4J-214
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-07-05
updated: 2019-07-08
resolved: 2019-07-08
components:   - dfsclient
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
Dfsclient should only use a SSL connection if DFUFileAccessInfo.fileAccessSSL = true

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "I believe at the moment it is assumed that dafilesrv is configured with SSL, that isn't necessarily the case though."}, {"type": "hardBreak"}, {"type": "text", "text": "Dfsclient should use an SSL connection if the DFUFileAccessInfo has fileAccessSSL=true, and otherwise use a plain connection."}]}, {"type": "paragraph", "content": [{"type": "mention", "attrs": {"id": "712020:66778395-f7b6-4a38-b705-cf2616f89dd6", "text": "@Rodrigo Pastrana", "accessLevel": ""}}, {"type": "mention", "attrs": {"id": "712020:53a36fd5-41dc-4f77-8493-82b0dac697ad", "text": "@James McMullan", "accessLevel": ""}}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

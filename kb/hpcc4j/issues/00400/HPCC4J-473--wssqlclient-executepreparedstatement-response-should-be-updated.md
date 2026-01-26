---
id: jira-HPCC4J-473
title: HPCC4J-473 – WsSQLClient executepreparedStatement response should be updated
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-473"
project: HPCC4J
key: HPCC4J-473
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-07-18
updated: 2022-07-19
resolved: 2022-07-19
components:   - WSClient
fixVersions:   - 8.8.0
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
WsSQLClient executepreparedStatement response should be updated

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "ws_workunits_struct.ECLWorkunit", "marks": [{"type": "textColor", "attrs": {"color": "#000000"}}]}, {"type": "text", "text": " has changed, causing HPCC > 8.8.0 responses to include unknown fields:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Executing: Select * from benchmark::string::100MB as mytable ; on Cluster: hthor"}, {"type": "hardBreak"}, {"type": "text", "text": "ERROR HPCCWsSQLClient HPCCWsSQL.executeSQLFullResponse encountered RemoteException."}, {"type": "hardBreak"}, {"type": "text", "text": "Unexpected subelement {urn:hpccsystems:ws:wssql}ExecuteCost"}, {"type": "hardBreak"}, {"type": "text", "text": "Executing: Select * from benchmark::string::100MB as mytable ; on Cluster: hthor"}, {"type": "hardBreak"}, {"type": "text", "text": "ERROR HPCCWsSQLClient HPCCWsSQL.executeSQLFullRes

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

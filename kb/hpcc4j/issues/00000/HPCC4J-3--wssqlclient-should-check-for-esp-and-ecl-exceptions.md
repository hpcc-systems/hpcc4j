---
id: jira-HPCC4J-3
title: HPCC4J-3 – WSSQLclient should check for ESP and ECL Exceptions 
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-3"
project: HPCC4J
key: HPCC4J-3
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2015-04-23
updated: 2015-08-10
resolved: 2015-08-10
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
WSSQLclient should check for ESP and ECL Exceptions 

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "This may occur due to SQL statements having similar ECL naming conventions."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Problem Example:"}, {"type": "hardBreak"}, {"type": "text", "text": "UNEXPECTED (failure): Could not find result schema || 004InnerJoinTest || SELECT * from \"regress::multi::dg_flat_evens\" inner join \"regress::multi::dg_var\" on true"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Solution Example:"}, {"type": "hardBreak"}, {"type": "text", "text": "EXECUTED AS EXPECTED || 004InnerJoinTest || SELECT * from \"regress::multi::dg_flat_evens\" inner join \"regress::single::wordindex\" on true"}]}, {"type": "paragraph", "content": [{"type": "mention", "attrs": {"id": "712020:d54761f2-bbc6-4635-9f0e-5b6d86343f97", "text": "@Lorraine Chapman", "accessLevel": ""}}, {"type": "mention", "attrs": {"id": "712020:1bc24f23-a355-4807-acc5-2f7

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

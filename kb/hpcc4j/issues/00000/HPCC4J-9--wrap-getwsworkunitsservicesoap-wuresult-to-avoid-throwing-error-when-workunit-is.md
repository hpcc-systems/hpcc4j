---
id: jira-HPCC4J-9
title: HPCC4J-9 – Wrap getWsWorkunitsServiceSoap().WUResult() to avoid throwing error when workunit is archived 
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-9"
project: HPCC4J
key: HPCC4J-9
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2015-06-11
updated: 2015-08-10
resolved: 2015-07-30
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
Wrap getWsWorkunitsServiceSoap().WUResult() to avoid throwing error when workunit is archived 

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Create a wrapper method in HPCCWsWorkunitsClient, getWuResult(WUResult params), that calls"}, {"type": "hardBreak"}, {"type": "text", "text": "getSoapProxy().getWsWorkunitsServiceSoap().WUResult(params);"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "It should check if the workunit is archived, and if it is, call WUAction with ActionType restore for the workunit before getting the result."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Needed to fix DSP Issue"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

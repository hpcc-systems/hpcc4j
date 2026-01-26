---
id: jira-HPCC4J-98
title: HPCC4J-98 – New methods in HPCCWsWorkunitsClient for handling service queries
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-98"
project: HPCC4J
key: HPCC4J-98
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-09-13
updated: 2017-09-19
resolved: 2017-09-19
components:   - WSClient
fixVersions:   - 1.2.2
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
New methods in HPCCWsWorkunitsClient for handling service queries

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "To avoid having users of HPCC-JAPI call getSoapProxy() in HPCCWsWorkunitsClient, the following additional methods for handling roxie services and queries are proposed:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "public List<QueryResult> searchQueries(QuerySetFilterType filtertype, String filtervalue, String querySetName, String clustername)"}]}]}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "public List<QueryResult> listQueries(String queryid, String queryname, String clustername, String querysetname, Integer pageSize,Integer pageStartFrom, Boolean activated, String filename,Boolean descending)"}]}]}]}, {"type": "bulletList", "content": [{"type

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

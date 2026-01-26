---
id: jira-HPCC4J-331
title: HPCC4J-331 – NPE thrown in ListQueries
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-331"
project: HPCC4J
key: HPCC4J-331
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-09-17
updated: 2020-09-29
resolved: 2020-09-29
components:   - WSClient
fixVersions:   - 7.10.x
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
NPE thrown in ListQueries

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When calling ListQueries and returning no queries that match, an NPE is thrown here because getQuerysetQueries() is null. We need a null check there."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "QuerySetQuery[] queries = response.getQuerysetQueries().getQuerySetQuery();"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Encountered this when calling HpccWsWorkunitService.listQueries(null,null,null,\"roxie2\",1000,0, false, null, null);"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

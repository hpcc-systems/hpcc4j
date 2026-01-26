---
id: jira-HPCC4J-262
title: HPCC4J-262 – deleteFiles Ignores Cluster
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-262"
project: HPCC4J
key: HPCC4J-262
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-12-12
updated: 2019-12-20
resolved: 2019-12-18
components:   - WSClient
fixVersions:   - 7.6.18
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
deleteFiles Ignores Cluster

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "https://github.com/hpcc-systems/HPCC-JAPIs/blob/master/wsclient/src/main/java/org/hpccsystems/ws/client/HPCCWsDFUClient.java#L883-L925", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/HPCC-JAPIs/blob/master/wsclient/src/main/java/org/hpccsystems/ws/client/HPCCWsDFUClient.java#L883-L925"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "HPCCWsDRUClient ignores the passed in cluster and therefore deletes on all clusters regardless of what is passed.  "}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

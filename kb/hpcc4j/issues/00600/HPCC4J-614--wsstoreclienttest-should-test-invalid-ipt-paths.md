---
id: jira-HPCC4J-614
title: HPCC4J-614 – WsStoreClientTest should test invalid IPT paths
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-614"
project: HPCC4J
key: HPCC4J-614
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-06-11
updated: 2024-08-22
resolved: 2024-08-22
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
WsStoreClientTest should test invalid IPT paths

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Attempting to use a username containing '@' and perhaps other characters causes issues in wsstore, add test cases for this."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

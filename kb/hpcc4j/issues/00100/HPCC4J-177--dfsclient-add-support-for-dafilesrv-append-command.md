---
id: jira-HPCC4J-177
title: "HPCC4J-177 – DFSClient: Add support for dafilesrv append command"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-177"
project: HPCC4J
key: HPCC4J-177
status: Resolved
statusCategory: Done
resolution: "Won't Fix"
created: 2019-04-17
updated: 2024-04-08
resolved: 2020-03-10
components:   - dfsclient
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
DFSClient: Add support for dafilesrv append command

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Dafilesrv now supports an append writing mode. This will allow DFSClients to write to a single filepart from multiple locations. Synchronization will need to be handled by the client but should allow for clients such as Spark-HPCC to write a dataset to an HPCC cluster with a different cardinality without having to re-partition first."}]}]}

## Agent guidance
- Avoid this approach; rationale documented in the JIRA ticket.

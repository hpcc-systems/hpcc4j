---
id: jira-HPCC4J-122
title: HPCC4J-122 – Not all field modifiers supported in DFUDataColumnInfo
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-122"
project: HPCC4J
key: HPCC4J-122
status: Resolved
statusCategory: Done
resolution: "Won't Fix"
created: 2018-07-20
updated: 2019-02-26
resolved: 2019-02-26
components:   - WSClient
fixVersions:   - 7.2.0
labels:   - Post70RC1
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
Not all field modifiers supported in DFUDataColumnInfo

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "org.hpccsystems.ws.client.platform.DFUDataColumnInfo doesn\u2019t support the following Field Modifiers"}, {"type": "hardBreak"}, {"type": "text", "text": "DEFAULT(value)", "marks": [{"type": "strong"}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "VIRTUAL( fileposition )", "marks": [{"type": "strong"}]}, {"type": "text", "text": " "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "VIRTUAL( localfileposition )", "marks": [{"type": "strong"}]}, {"type": "text", "text": " "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "VIRTUAL( logicalfilename )", "marks": [{"type": "strong"}]}, {"type": "text", "text": "\u00a0 "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "BLOB", "marks": [{"type": "strong"}]}, {"type": "text", "text": " "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "See:", "marks": [{"type": "stron

## Agent guidance
- Avoid this approach; rationale documented in the JIRA ticket.

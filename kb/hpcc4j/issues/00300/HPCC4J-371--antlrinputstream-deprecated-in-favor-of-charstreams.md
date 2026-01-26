---
id: jira-HPCC4J-371
title: HPCC4J-371 – ANTLRInputStream deprecated in favor of CharStreams
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-371"
project: HPCC4J
key: HPCC4J-371
status: New
statusCategory: To Do
resolution: null
created: 2021-01-05
updated: 2024-04-08
resolved: null
components:   - WSClient
fixVersions: []
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
pull_requests: []
---
## Outcome (from JIRA)
ANTLRInputStream deprecated in favor of CharStreams

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Our CaseControlStringStream that implements ANTLRInputStream is throwing warnings because ANTLRInputStream is deprecated in 4.7 in favor of CharStreams."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "CharStreams is marked as final so we can't inherit it the same way that we're doing with ANTLRInputStream."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Issue can be found in /wsclient/src/main/java/org/hpccsystems/ws/client/antlr/CaseControlStringStream.java"}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.

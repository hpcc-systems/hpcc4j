---
id: jira-HPCC4J-454
title: HPCC4J-454 – Error writing some tardis data with BigDecimal type to hpcc
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-454"
project: HPCC4J
key: HPCC4J-454
status: Resolved
statusCategory: Done
resolution: Invalid
created: 2022-03-22
updated: 2024-04-08
resolved: 2022-03-28
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
Error writing some tardis data with BigDecimal type to hpcc

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When writing some tardis records that have a record meta containing BigDecimals and sized strings, the write appears to succeed but when you go to the file in ecl watch, no data appears."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Here is a self-contained test that will generate the problem:"}]}, {"type": "mediaGroup", "content": [{"type": "media", "attrs": {"type": "file", "id": "69f5bd40-a279-4fd8-9f6c-9d6ee6977672", "collection": ""}}]}]}

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.

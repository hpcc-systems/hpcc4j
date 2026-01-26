---
id: jira-HPCC4J-437
title: HPCC4J-437 – TLK Indexes not filtering partitions as expected
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-437"
project: HPCC4J
key: HPCC4J-437
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-10-14
updated: 2022-01-07
resolved: 2022-01-07
components:   - dfsclient
fixVersions:   - 8.4.24
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
TLK Indexes not filtering partitions as expected

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "So I have a cluster (alpha-dev) that is on platform version 7.12, and which the test index integration tests in dfsclient DFUIndexTest work against.\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "However when I try to filter an index on alpha dev on a key value, still no matching partitions are is coming back. I\u2019ve verified that HPCCFile is getting a TLK partition."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Here\u2019s the test I\u2019m running:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "HPCCFile file = new HPCCFile(\"thor::key::cd::vehicle_history::ownership::20211013::idl\","}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0\u00a0 "}, {"type": "text", "text": "http://alpha_dev_thor_esp.risk.regn.net:8010

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-540
title: HPCC4J-540 – Publish error writing to 9.2 cluster
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-540"
project: HPCC4J
key: HPCC4J-540
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-08-30
updated: 2023-09-11
resolved: 2023-09-11
components:   - dfsclient
fixVersions:   - 9.2.22
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
Publish error writing to 9.2 cluster

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When trying to write to an hpcc cluster running version internal_9.0.34-rc1, with hpcc4j 9.2.12-1, the following error occurs:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "ERROR BaseHPCCWsClient ArrayOfEspExceptionWrapper: Error publishing DFU file: 'benchmark::integer::20kb-copy13.1.wsdfucreate.tmp|thor200_90_a|thor200_90_a|false|flat'"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "EspException: Audience: user Source: CSoapResponseBinding Message: 2023-08-30 15:45:00 GMT: Some physical parts do not exists, for logical file : [unattached]"}, {"type": "hardBreak"}, {"type": "text", "text": "ArrayOfEspExceptionWrapper: Error publishing DFU file: 'benchmark::integer::20kb-copy13.1.wsdfucreate.tmp|thor200_90_a|thor200_90_a|false|flat'"}, {"type": "h

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

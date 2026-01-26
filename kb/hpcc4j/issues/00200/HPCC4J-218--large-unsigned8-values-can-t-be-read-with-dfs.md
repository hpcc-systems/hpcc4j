---
id: jira-HPCC4J-218
title: "HPCC4J-218 – large unsigned8 values can't be read with dfs"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-218"
project: HPCC4J
key: HPCC4J-218
status: Resolved
statusCategory: Done
resolution: "Won't Fix"
created: 2019-08-20
updated: 2024-04-08
resolved: 2020-01-13
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
large unsigned8 values can't be read with dfs

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "I\u2019m attempting to read file thor_data400::key::watercraft::20180404::linkids  on cluster "}, {"type": "text", "text": "http://10.173.14.207:8010", "marks": [{"type": "link", "attrs": {"href": "http://10.173.14.207:8010/"}}]}, {"type": "text", "text": " with dfs."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "I\u2019m getting repeated warnings that the field persistent_record_id has an invalid unsigned value:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u201cDetected possible unsigned value overflow in field 'persistent_record_id'.\u201d"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Looking at the source for BinaryRecordReader getUnsigned(), this could be because the bytes being retrieved are being cast to a long. Long\u2019s max value is 9,223,372,036,854,775,807, while hpcc UNSIGNED8 max value is 18,446,744,073,709,551,615

## Agent guidance
- Avoid this approach; rationale documented in the JIRA ticket.

---
id: jira-HPCC4J-339
title: HPCC4J-339 – Check for BigDecimal type in writeField
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-339"
project: HPCC4J
key: HPCC4J-339
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-10-14
updated: 2020-10-16
resolved: 2020-10-16
components: []
fixVersions:   - 7.12.4
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
Check for BigDecimal type in writeField

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "in the switch fieldtype in BinaryRecordWriter, can you add a check for BigDecimal values as well as BigInteger? Some of our data to be written to long unsigned8 fields will be coming in in BigDecimal format."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Something like"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "else if (fieldValue instanceof BigDecimal)"}, {"type": "hardBreak"}, {"type": "text", "text": "{"}, {"type": "hardBreak"}, {"type": "text", "text": "value = ((BigDecimal) fieldValue).longValue();"}, {"type": "hardBreak"}, {"type": "text", "text": "}"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "I can make this change myself if you tell me which branch to submit the PR to and whic

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-351
title: HPCC4J-351 – Byte overflow in BinaryRecordReader STRINGXX fields containing unicode
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-351"
project: HPCC4J
key: HPCC4J-351
status: Resolved
statusCategory: Done
resolution: "Won't Do"
created: 2020-11-06
updated: 2020-12-01
resolved: 2020-12-01
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
Byte overflow in BinaryRecordReader STRINGXX fields containing unicode

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When reading data from hpcc and writing it to oracle I found that some fields containing odd characters had more bytes than the string field allowed."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "STRING120 field company_name was returning strings that were 121 or 122 bytes long for field values like"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "'2005 MAXWELL LANE CONDOMINIUMS OWNERS\u00c6 ASSOCIATION '"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "'RUBY\u00c3\ufffdS BATH BOUTIQUE, INC. '"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "'VICTORIA\u00e2\ufffd\ufffdS SECRET STORES, LLC '"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "You can recreate this issue with the following code:"}]}, {"type": "paragraph", "content": [{"ty

## Agent guidance
- Follow documented outcome; gate by fixVersions if applicable.

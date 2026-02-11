---
id: jira-HPCC4J-191
title: "HPCC4J-191 – Spark-HPCC: Unsigned8 allow integer overflow for IDs"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-191"
project: HPCC4J
key: HPCC4J-191
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-05-01
updated: 2019-05-23
resolved: 2019-05-23
components:   - dfsclient
fixVersions:   - 7.2.14
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
Spark-HPCC: Unsigned8 allow integer overflow for IDs

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Java does not support an unsigned integer type so reading unsigned8 values from HPCC may cause an integer overflow. Currently BinaryRecordReader checks for this and throws an exception if an integer value will overflow."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "However, unsigned8 values are often used as unique IDs in datasets, in which case overflowing would be acceptable as the overflowed value will still be unique. An option should be exposed to end users to allow them to control if integer overflowing should be allowed when reading a file. It would be good if this could be controlled on a per-column basis."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

## Related
- 01. Relates: HPCC-22125

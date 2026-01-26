---
id: jira-HPCC4J-743
title: "HPCC4J-743 – Spark: Expose Unsigned8 to Decimal option"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-743"
project: HPCC4J
key: HPCC4J-743
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-08-28
updated: 2025-09-05
resolved: null
components:   - Spark
fixVersions:   - 9.14.18
labels: []
applies_to: hpcc4j: >= 9.14.18
audience: developer
confidence: high
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Spark: Expose Unsigned8 to Decimal option

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Spark does not have unsigned types. Unsigned values in HPCC data that exceed what a long type can represent should be converted to string. Today, these values are mis-interpreted when converted to Java types. "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "This "}, {"type": "text", "text": "nid", "marks": [{"type": "code"}]}, {"type": "text", "text": " field of this file is a good example: "}, {"type": "text", "text": "https://eclwatch-hpcc.us-prod400thor-prod.azure.lnrsg.io/esp/files/index.html#/files/data/thor_data400::base::emailage_ingest::20250818", "marks": [{"type": "link", "attrs": {"href": "https://eclwatch-hpcc.us-prod400thor-prod.azure.lnrsg.io/esp/files/index.html#/files/data/thor_data400::base::emailage_ingest::20250818"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "I don\u2019t believe spark can represent any HPCC type greater than u

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-118
title: HPCC4J-118 – platform/DFUFileDetailInfo does not copy isCompressed value
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-118"
project: HPCC4J
key: HPCC4J-118
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-05-04
updated: 2018-06-22
resolved: 2018-06-22
components:   - WSClient
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
platform/DFUFileDetailInfo does not copy isCompressed value

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The platform/DFUFileDetailInfo class is missing:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "this.setIsCompressed(base.getIsCompressed);", "marks": [{"type": "code"}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "in the copy() method."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

## Related
- 02. Blocks: HPCC-19611

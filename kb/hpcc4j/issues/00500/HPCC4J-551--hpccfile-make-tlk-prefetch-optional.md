---
id: jira-HPCC4J-551
title: HPCC4J-551 – HPCCFile Make TLK Prefetch Optional
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-551"
project: HPCC4J
key: HPCC4J-551
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-10-26
updated: 2023-11-07
resolved: 2023-11-07
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
HPCCFile Make TLK Prefetch Optional

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When reading an index file the PartitionProcessor automatically reads the TLK of the index file to allow some client side filtering to occur. "}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently this happens regardless of whether or not the PartitionProcessor will be used."}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "A flag should be introduced to make this prefetching optional or perhaps only done on-demand"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

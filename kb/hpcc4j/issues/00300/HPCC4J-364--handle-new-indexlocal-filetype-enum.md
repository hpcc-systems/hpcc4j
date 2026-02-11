---
id: jira-HPCC4J-364
title: HPCC4J-364 – handle new INDEXLOCAL filetype enum
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-364"
project: HPCC4J
key: HPCC4J-364
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-11-20
updated: 2020-11-20
resolved: 2020-11-20
components:   - dfsclient
fixVersions:   - 7.12.10
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
handle new INDEXLOCAL filetype enum

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When reading file data from wsDFUAccessV2, for some files the type returned is INDEXLOCAL. This isn't in the dfu partition filetype list."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Adding it in to the enum appears to resolve the issue."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "These two values were added to ws_dfu.ecm two months ago:"}, {"type": "hardBreak"}, {"type": "text", "text": "IndexLocal(\"IndexLocal\"),"}, {"type": "hardBreak"}, {"type": "text", "text": "IndexPartitioned(\"IndexPartitioned\"),"}, {"type": "hardBreak"}, {"type": "text", "text": "as part of a TLK enhancement."}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

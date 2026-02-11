---
id: jira-HPCC4J-644
title: HPCC4J-644 – FileUtilityTest atomic record count false sharing
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-644"
project: HPCC4J
key: HPCC4J-644
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-09-16
updated: 2024-09-17
resolved: 2024-09-17
components:   - dfsclient
fixVersions:
  - 9.8.22
  - 9.6.48
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
FileUtilityTest atomic record count false sharing

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "FileUtility currently increments an atomic counter after constructing each record"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "This can lead to contention on that atomic due to false sharing between CPU cores when reading with many threads"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Code should be updated to increment that atomic counter only once per file part instead of once per record"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

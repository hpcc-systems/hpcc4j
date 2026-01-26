---
id: jira-HPCC4J-320
title: HPCC4J-320 – Add getOriginalFileMetadata() to HPCCFile
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-320"
project: HPCC4J
key: HPCC4J-320
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-07-24
updated: 2020-08-17
resolved: 2020-08-17
components:   - dfsclient
fixVersions:   - 7.10.x
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
Add getOriginalFileMetadata() to HPCCFile

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Add a getOriginalFileMetadata() method to HPCCFile. the first time it calls it calls dfuClient.getFileDetails() and stashes the resulting wrapper in the HPCCFile to return during future calls."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

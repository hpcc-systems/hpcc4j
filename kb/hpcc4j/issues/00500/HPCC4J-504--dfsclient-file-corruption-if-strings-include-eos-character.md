---
id: jira-HPCC4J-504
title: "HPCC4J-504 – DFSClient: File corruption if strings include EOS character"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-504"
project: HPCC4J
key: HPCC4J-504
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-02-21
updated: 2023-04-24
resolved: 2023-04-24
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
DFSClient: File corruption if strings include EOS character

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Strings that include the EOS character can cause files to be unreadable."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

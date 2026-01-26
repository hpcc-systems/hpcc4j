---
id: jira-HPCC4J-186
title: HPCC4J-186 – DFSClient should reject requests for unsupported file types
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-186"
project: HPCC4J
key: HPCC4J-186
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-04-28
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
DFSClient should reject requests for unsupported file types

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "DFUFileAccess2 is scheduled to return the file type: "}, {"type": "text", "text": "https://hpccsystems.atlassian.net/browse/HPCC-22029", "marks": [{"type": "link", "attrs": {"href": "https://hpccsystems.atlassian.net/browse/HPCC-22029"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Dfsclient should explicitly reject access to unsupported file types."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

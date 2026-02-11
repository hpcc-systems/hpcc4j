---
id: jira-HPCC4J-109
title: HPCC4J-109 – HPCCWsDFUClient getFileInfo method needs to accept flags for Bin Type Info and JSON type info
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-109"
project: HPCC4J
key: HPCC4J-109
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2017-11-13
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
HPCCWsDFUClient getFileInfo method needs to accept flags for Bin Type Info and JSON type info

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Need an HPCCWsDFUClient.getFileInfo method that accepts Boolean flags for binary and json layout information to be returned."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Current signature will be retained, but implementation will call the new expanded method. \u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

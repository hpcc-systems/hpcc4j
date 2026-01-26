---
id: jira-HPCC4J-209
title: HPCC4J-209 – DFSFileType equality is comparing string pointers
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-209"
project: HPCC4J
key: HPCC4J-209
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-06-27
updated: 2019-07-08
resolved: 2019-07-08
components: []
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
DFSFileType equality is comparing string pointers

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "DFSFileType equals() is currently comparing string pointers for equality instead of using String.equals(). However, DFSFileType should probably be restructured and changed into an enum."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-552
title: HPCC4J-552 – DFSClient File Utility Support Reading Individual File Parts
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-552"
project: HPCC4J
key: HPCC4J-552
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-11-07
updated: 2023-11-09
resolved: 2023-11-09
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
DFSClient File Utility Support Reading Individual File Parts

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "When debugging issues with large files it is helpful to be able to read individual file parts"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Add support to the file utility to make this easy to do"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

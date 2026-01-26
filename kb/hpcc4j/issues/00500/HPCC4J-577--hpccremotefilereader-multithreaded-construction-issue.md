---
id: jira-HPCC4J-577
title: HPCC4J-577 – HPCCRemoteFileReader Multithreaded Construction issue
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-577"
project: HPCC4J
key: HPCC4J-577
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-02-09
updated: 2024-05-13
resolved: 2024-05-13
components:   - dfsclient
fixVersions:
  - 9.4.58
  - 9.6.10
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
HPCCRemoteFileReader Multithreaded Construction issue

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Opening HPCCRemoteFileReaders on multiple threads seems to cause socket operation timeouts in some environments"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Initial thought was that this was related to too many simultaneous connections to dafilesrv but that doesn't seem to cause an issue upon further testing"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

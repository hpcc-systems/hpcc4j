---
id: jira-HPCC4J-470
title: "HPCC4J-470 – DFSClient: Index field types handled incorrectly"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-470"
project: HPCC4J
key: HPCC4J-470
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-07-13
updated: 2022-07-29
resolved: 2022-07-29
components: []
fixVersions:   - 8.8.2
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
DFSClient: Index field types handled incorrectly

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently we treat index files as if they have the same data format as a standard Thor file. There are some edge cases where this is not correct, an example are integers are biased inside of Index files and need to be \"unbiased\" in DFSClient or dafilesrv during the reading process."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-208
title: HPCC4J-208 – File type must be specified when creating file in dfu client createFileAndAcquireAccess() method
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-208"
project: HPCC4J
key: HPCC4J-208
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-06-21
updated: 2019-07-08
resolved: 2019-07-08
components:   - WSClient
fixVersions:   - 7.4.0
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
File type must be specified when creating file in dfu client createFileAndAcquireAccess() method

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "the platform's being updated so that creating a file without specifying a type will throw an error ("}, {"type": "text", "text": "https://hpccsystems.atlassian.net/browse/HPCC-22401", "marks": [{"type": "link", "attrs": {"href": "https://hpccsystems.atlassian.net/browse/HPCC-22401"}}]}, {"type": "text", "text": ")."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "HPCCWsDFUClient.createFileAndAcquireAccess() will need to specify  a default dfuFileType if none is passed in, and createFile() needs to pass a filetype when calling createFileAndAcquireAccess()."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

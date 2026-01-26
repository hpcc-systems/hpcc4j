---
id: jira-HPCC4J-274
title: HPCC4J-274 – Add ability to delete drop zone files into HPCCFileSprayClient
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-274"
project: HPCC4J
key: HPCC4J-274
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-01-31
updated: 2020-02-10
resolved: 2020-02-10
components:   - WSClient
fixVersions:   - 7.6.28
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
Add ability to delete drop zone files into HPCCFileSprayClient

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "There is not a function in HPCCFileSprayClient.java to delete drop zone files. Should just need to implement FileSprayStub.java's function to delete files."}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "deleteDropZoneFiles(org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDropZoneFilesRequest deleteDropZoneFilesRequest47)"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

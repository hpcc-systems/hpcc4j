---
id: jira-HPCC4J-117
title: HPCC4J-117 – Dropzone - getting physical files
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-117"
project: HPCC4J
key: HPCC4J-117
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2018-05-04
updated: 2018-11-07
resolved: 2018-11-07
components: []
fixVersions:   - 7.0.0
labels:   - Post70RC1
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
Dropzone - getting physical files

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "In the current implementation there exists two different DropZone objects each one contains different parameters.\u00a0 These should really be rolled up into a single object."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Intially I had tried to use dropzone.getFiles() function is just stubbed out and returns an empty list."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Currently to get the physical files from a dropzone you have to use code as follows.\u00a0 Since the Dropzone from the fetchLocalDropZones() function doesn't have OS you have to get it by calling platform.getDropZone(\"mydropzone\").getValue()).getOS()"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Platform platform = connection.getPlatform();"}, {"type": "hardBreak"}, {"type": "text", "text": "HPCCWsClient connector = platform.getWsClient();"}, {"type": "hardBreak"}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

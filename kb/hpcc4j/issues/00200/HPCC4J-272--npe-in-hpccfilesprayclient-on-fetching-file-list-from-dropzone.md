---
id: jira-HPCC4J-272
title: HPCC4J-272 – NPE in HPCCFileSprayClient on fetching file list from dropzone
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-272"
project: HPCC4J
key: HPCC4J-272
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-01-22
updated: 2020-02-07
resolved: 2020-02-07
components: []
fixVersions:   - 7.6.26
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
NPE in HPCCFileSprayClient on fetching file list from dropzone

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "code such as"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "connector.getFileSprayService().listFiles(zone.getNetAddress()"}, {"type": "text", "text": ",", "marks": [{"type": "textColor", "attrs": {"color": "#cc7832"}}]}, {"type": "text", "text": " "}, {"type": "text", "text": "zone.getPath()", "marks": [{"type": "textColor", "attrs": {"color": "#6a8759"}}]}, {"type": "text", "text": ",", "marks": [{"type": "textColor", "attrs": {"color": "#cc7832"}}]}, {"type": "text", "text": " zone.getLinux())"}]}, {"type": "paragraph", "content": [{"type": "text", "text": ";"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Throws a NPE on", "marks": [{"type": "textColor", "attrs": {"color": "#cc7832"}}]}]}, {"type": "paragraph", "content": [{"type": "text", "text": "PhysicalFileStruct[] physicalFileStruct = resp.getFiles().getPhysicalFileStruct()"}, {"type": "text"

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

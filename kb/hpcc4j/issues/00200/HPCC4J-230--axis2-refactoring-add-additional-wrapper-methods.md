---
id: jira-HPCC4J-230
title: "HPCC4J-230 – Axis2 refactoring: add additional wrapper methods"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-230"
project: HPCC4J
key: HPCC4J-230
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2019-09-18
updated: 2019-09-24
resolved: 2019-09-24
components:   - WSClient
fixVersions:   - 7.6.0
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
Axis2 refactoring: add additional wrapper methods

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "\u2022\tChange HPCCFileSprayClient to return a List<PhysicalStructFileWrapper> instead of PhysicalStructFileWrapper[], and a List<DropZoneWrapper> instead of DropZoneWrapper[]"}, {"type": "hardBreak"}, {"type": "text", "text": "\u2022\tAdd WorkunitWrapper.setExceptions that takes an ArrayOfECLExceptionWrapper as method parameter"}, {"type": "hardBreak"}, {"type": "text", "text": "\u2022\tAdd HPCCFileSprayClient.copyFile(to,from,override)"}, {"type": "hardBreak"}, {"type": "text", "text": "\u2022\tAdd DeleteSuperfileSubfiles(String superfile, List<String> subfiles) to HPCCWsDFUClient"}, {"type": "hardBreak"}, {"type": "text", "text": "\u2022\tAdd HPCCWsPackageProcessClient.getPackageMapById(String packageMapName)"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

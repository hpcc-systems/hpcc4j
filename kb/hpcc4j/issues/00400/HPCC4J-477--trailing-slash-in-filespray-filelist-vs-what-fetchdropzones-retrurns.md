---
id: jira-HPCC4J-477
title: HPCC4J-477 – trailing slash in FileSpray/FileList vs what fetchDropZones retrurns
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-477"
project: HPCC4J
key: HPCC4J-477
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-08-02
updated: 2022-08-18
resolved: 2022-08-17
components:   - WSClient
fixVersions:   - 8.8.6
labels:   - Anybody
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
trailing slash in FileSpray/FileList vs what fetchDropZones retrurns

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "fetchDropZones(connector.getServerHost())"}, {"type": "hardBreak"}, {"type": "text", "text": "returns the file path with no trailing slash however in newer versions of the platform calls to "}, {"type": "text", "text": "FileSpray/FileList?ver_=1.2&form", "marks": [{"type": "link", "attrs": {"href": "https://ramps-dev.hpcc.risk.regn.net:18010/FileSpray/FileList?ver_=1.2&form"}}]}, {"type": "text", "text": " require the path to have a trailing slash.\u00a0 It would be helpful if the HPCCFileSprayClient::fetchDropZones results included the file path that the other calls needed (with the trailing slash)"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

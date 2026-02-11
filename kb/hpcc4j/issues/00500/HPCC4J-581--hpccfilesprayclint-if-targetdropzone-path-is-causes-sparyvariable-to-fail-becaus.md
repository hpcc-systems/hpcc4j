---
id: jira-HPCC4J-581
title: HPCC4J-581 – HPCCFileSprayClint if targetDropZone path is / causes sparyVariable to fail because it builds it as //path
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-581"
project: HPCC4J
key: HPCC4J-581
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-02-29
updated: 2024-03-11
resolved: 2024-03-11
components: []
fixVersions:
  - 9.0.90
  - 9.2.68
  - 9.4.42
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
HPCCFileSprayClint if targetDropZone path is / causes sparyVariable to fail because it builds it as //path

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "'''"}, {"type": "hardBreak"}, {"type": "text", "text": "Platform platform = connection.getPlatform();"}, {"type": "hardBreak"}, {"type": "text", "text": "HPCCWsClient connector = platform.getWsClient();"}, {"type": "hardBreak"}, {"type": "text", "text": "HPCCFileSprayClient fileSprayClient = connector.getFileSprayClient();"}, {"type": "hardBreak"}, {"type": "text", "text": "List<DropZoneWrapper> targetDropZones = fileSprayClient.fetchLocalDropZones();"}, {"type": "hardBreak"}, {"type": "text", "text": "DropZoneWrapper targetDropZone = null;"}, {"type": "hardBreak"}, {"type": "text", "text": "DropZoneWrapper targetDropZone = null;"}, {"type": "hardBreak"}, {"type": "text", "text": "for (DropZoneWrapper dz : targetDropZones) {"}, {"type": "hardBreak"}, {"type": "text", "text": "if (dz.getName().equals(\"myDropZone\"))"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "{ tar

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

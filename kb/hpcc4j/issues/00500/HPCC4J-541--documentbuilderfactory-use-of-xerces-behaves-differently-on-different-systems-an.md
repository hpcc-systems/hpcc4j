---
id: jira-HPCC4J-541
title: HPCC4J-541 – DocumentBuilderFactory use of xerces behaves differently on different systems, and dependency is hard to make sure it is the expected version
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-541"
project: HPCC4J
key: HPCC4J-541
status: New
statusCategory: To Do
resolution: null
created: 2023-09-01
updated: 2024-04-08
resolved: null
components: []
fixVersions: []
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
pull_requests: []
---
## Outcome (from JIRA)
DocumentBuilderFactory use of xerces behaves differently on different systems, and dependency is hard to make sure it is the expected version

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "[2:06 PM] Chambers, Joseph (RIS-ATL)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "mediaSingle", "attrs": {"layout": "center"}, "content": [{"type": "media", "attrs": {"type": "file", "id": "f671576b-2430-4ae3-8426-d28de1647784", "collection": "", "height": 183, "width": 200}}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[2:07 PM] Pastrana, Rodrigo (RIS-BCT)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "k, so that xerces is outdated"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[2:08 PM] Chambers, Joseph (RIS-ATL)"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "how can you tell?"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "[2:08 PM] Pastrana, Rodrigo (RIS-BCT)"}]}, {"type": "paragrap

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.

---
id: jira-HPCC4J-713
title: "HPCC4J-713 – DFSClient: Add support for writing indexes"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-713"
project: HPCC4J
key: HPCC4J-713
status: New
statusCategory: To Do
resolution: null
created: 2025-04-30
updated: 2025-09-23
resolved: null
components:   - dfsclient
fixVersions: []
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
DFSClient: Add support for writing indexes

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "This will rely on new features in both dafilesrv / esp that have not been created. It will also require the data to be sorted prior to writing."}]}, {"type": "paragraph", "content": [{"type": "text", "text": "See: "}, {"type": "inlineCard", "attrs": {"url": "https://hpccsystems.atlassian.net/browse/HPCC-33806"}}, {"type": "text", "text": " "}]}, {"type": "paragraph", "content": [{"type": "inlineCard", "attrs": {"url": "https://hpccsystems.atlassian.net/browse/HPCC-34042"}}, {"type": "text", "text": " "}]}]}

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.

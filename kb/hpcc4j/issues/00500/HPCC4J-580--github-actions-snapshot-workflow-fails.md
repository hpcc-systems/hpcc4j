---
id: jira-HPCC4J-580
title: "HPCC4J-580 – Github Actions: Snapshot workflow fails"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-580"
project: HPCC4J
key: HPCC4J-580
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-02-22
updated: 2024-02-22
resolved: 2024-02-22
components:   - BuildPackaging
fixVersions:
  - 9.2.64
  - 9.4.38
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
Github Actions: Snapshot workflow fails

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Snapshot publish workflow is using an unsupported JDK development version need at least 9+ to build, even though we target Java 8 for deployment"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-729
title: HPCC4J-729 – Streamline javadoc github action by avoiding test scope
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-729"
project: HPCC4J
key: HPCC4J-729
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-06-24
updated: 2025-06-25
resolved: null
components:   - BuildPackaging
fixVersions:
  - 9.6.120
  - 9.8.96
  - 9.10.42
  - 9.12.16
labels: []
applies_to: hpcc4j: >= 9.6.120
audience: developer
confidence: high
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Streamline javadoc github action by avoiding test scope

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Avoid performing mvn install on dfsclient to avoid pulling wsclient test jar"}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

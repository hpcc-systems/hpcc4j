---
id: jira-HPCC4J-715
title: HPCC4J-715 – Upgrade HPCC4j to use newer version of the getPODS method.
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-715"
project: HPCC4J
key: HPCC4J-715
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-05-08
updated: 2025-06-18
resolved: null
components: []
fixVersions:   - 9.12.6
labels: []
applies_to: hpcc4j: >= 9.12.6
audience: developer
confidence: high
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Upgrade HPCC4j to use newer version of the getPODS method.

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "The "}, {"type": "text", "text": "getPODs", "marks": [{"type": "code"}]}, {"type": "text", "text": "call has a version bump which is a lot easier on the k8s host."}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

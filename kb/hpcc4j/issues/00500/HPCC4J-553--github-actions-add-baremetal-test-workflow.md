---
id: jira-HPCC4J-553
title: "HPCC4J-553 – Github Actions: Add baremetal test workflow"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-553"
project: HPCC4J
key: HPCC4J-553
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2023-11-09
updated: 2024-02-01
resolved: 2024-02-01
components: []
fixVersions:
  - 9.4.32
  - 9.2.58
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
Github Actions: Add baremetal test workflow

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "We are currently only testing against containerized environments"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "There have been a number of discrepancies between containerized and baremetal behaviors that warrant adding tests for baremetal as well"}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

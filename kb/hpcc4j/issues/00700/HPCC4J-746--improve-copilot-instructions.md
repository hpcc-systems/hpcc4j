---
id: jira-HPCC4J-746
title: HPCC4J-746 – Improve copilot instructions
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-746"
project: HPCC4J
key: HPCC4J-746
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-09-30
updated: 2025-10-15
resolved: null
components:   - BuildPackaging
fixVersions:   - 0.2.0
labels: []
applies_to: hpcc4j: >= 0.2.0
audience: developer
confidence: high
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
Improve copilot instructions

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Ensure the "}, {"type": "text", "text": "hpcc4j", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/tree/master"}}]}, {"type": "text", "text": "/"}, {"type": "text", "text": ".github", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/tree/master/.github"}}]}, {"type": "text", "text": "/PULL_REQUEST_TEMPLATE.md checklist is honored"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Copilot should determine if the change causes users to reconfigure or restructure their code, and if so, a mark-down blurb should be provided to be added to the project wiki"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "ensure pull requests are prefixed with HPCC4J- follo

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

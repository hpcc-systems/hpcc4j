---
id: jira-HPCC4J-466
title: HPCC4J-466 – Github action Rebase step fails due to unknown identity
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-466"
project: HPCC4J
key: HPCC4J-466
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-06-14
updated: 2022-07-14
resolved: 2022-07-14
components:   - BuildPackaging
fixVersions:   - 8.8.2
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
Github action Rebase step fails due to unknown identity

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Github actions fail on rebase step due to unknown identity:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Run git rebase origin/candidate-8.8.x "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Rebasing (1/1) "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "Committer identity unknown "}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}, {"type": "hardBreak"}, {"type": "text", "text": "\u00a0"}]}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph"}, {"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph"}, {"type": "bulletList", "content": [{"type": "

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

---
id: jira-HPCC4J-495
title: HPCC4J-495 – Address github actions warnings
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-495"
project: HPCC4J
key: HPCC4J-495
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2022-11-03
updated: 2025-04-22
resolved: 2025-04-22
components:   - BuildPackaging
fixVersions: []
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
Address github actions warnings

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Several hpcc4j related github actions are reporting the following warnings:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "test-against-platform", "marks": [{"type": "strong"}, {"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/actions/runs/3382778406/jobs/5618041386"}}]}, {"type": "text", "text": " ", "marks": [{"type": "link", "attrs": {"href": "https://github.com/hpcc-systems/hpcc4j/actions/runs/3382778406/jobs/5618041386"}}]}, {"type": "hardBreak"}, {"type": "text", "text": "Node.js 12 actions are deprecated. For more information see: "}, {"type": "text", "text": "https://github.blog/changelog/2022-09-22-github-actions-all-actions-will-begin-running-on-node16-instead-of-node12/", "marks": [{"type": "link", "attrs": {"href": "https://github.blog/changelog/2022-09-22-gith

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

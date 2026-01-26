---
id: jira-HPCC4J-683
title: HPCC4J-683 – CandidateBranchBuild actions fail due to outdated plugin
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-683"
project: HPCC4J
key: HPCC4J-683
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-02-04
updated: 2025-02-04
resolved: 2025-02-04
components:   - BuildPackaging
fixVersions:
  - 9.10.4
  - 9.2.156
  - 9.4.130
  - 9.6.82
  - 9.8.58
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
CandidateBranchBuild actions fail due to outdated plugin

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "inlineCard", "attrs": {"url": "https://github.com/hpcc-systems/hpcc4j/actions/runs/13140711342/job/36666991475"}}, {"type": "text", "text": " "}]}, {"type": "paragraph"}, {"type": "paragraph", "content": [{"type": "text", "text": "Error: This request has been automatically failed because it uses a deprecated version of `actions/cache: v2`. Please update your workflow to use v3/v4 of actions/cache to avoid interruptions. Learn more: "}, {"type": "inlineCard", "attrs": {"url": "https://github.blog/changelog/2024-12-05-notice-of-upcoming-releases-and-breaking-changes-for-github-actions/#actions-cache-v1-v2-and-actions-toolkit-cache-package-closing-down"}}, {"type": "text", "text": " "}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

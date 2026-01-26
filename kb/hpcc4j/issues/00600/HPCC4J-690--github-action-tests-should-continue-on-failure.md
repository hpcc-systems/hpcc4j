---
id: jira-HPCC4J-690
title: HPCC4J-690 – Github action tests should continue on failure
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-690"
project: HPCC4J
key: HPCC4J-690
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2025-02-07
updated: 2025-03-19
resolved: 2025-03-19
components:   - BuildPackaging
fixVersions:
  - 9.2.168
  - 9.4.142
  - 9.6.94
  - 9.8.70
  - 9.10.16
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
Github action tests should continue on failure

{"type": "doc", "version": 1, "content": [{"type": "bulletList", "content": [{"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Individual test failures should not cause the entire test suite to stop"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Individual test failures should either be added as annotations on the GitHub action run or as a comment on the pull request"}]}]}, {"type": "listItem", "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Info on creating annotations:"}, {"type": "inlineCard", "attrs": {"url": "https://docs.github.com/en/actions/writing-workflows/choosing-what-your-workflow-does/workflow-commands-for-github-actions"}}, {"type": "text", "text": " "}]}]}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

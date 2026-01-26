---
id: jira-HPCC4J-663
title: HPCC4J-663 – CodeQL Action version needs to be upgraded to v3
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-663"
project: HPCC4J
key: HPCC4J-663
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2024-11-06
updated: 2024-12-02
resolved: 2024-12-02
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
CodeQL Action version needs to be upgraded to v3

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": " Analyze (java) CodeQL Action v2 will be deprecated on December 5th, 2024. Please update all occurrences of the CodeQL Action in your workflow files to v3. For more information, see "}, {"type": "inlineCard", "attrs": {"url": "https://github.blog/changelog/2024-01-12-code-scanning-deprecation-of-codeql-action-v2/"}}, {"type": "text", "text": " "}]}]}

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.

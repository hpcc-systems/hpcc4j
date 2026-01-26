---
id: jira-HPCC4J-321
title: HPCC4J-321 – Refactor all JAPI references to hpcc4j
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-321"
project: HPCC4J
key: HPCC4J-321
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2020-07-24
updated: 2020-09-24
resolved: 2020-09-24
components:   - BuildPackaging
fixVersions:   - 7.12.x
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
Refactor all JAPI references to hpcc4j

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "-\tRename repo"}, {"type": "hardBreak"}, {"type": "text", "text": "-\tUpdate top level readme.md"}, {"type": "hardBreak"}, {"type": "text", "text": "-\tChange JIRA project name, and jira issue prefix"}, {"type": "hardBreak"}, {"type": "text", "text": "-\tRename top level pom artifact name"}, {"type": "hardBreak"}, {"type": "text", "text": "-\tRename github actions"}, {"type": "hardBreak"}, {"type": "text", "text": "-\tUpdate pull request template"}, {"type": "hardBreak"}, {"type": "text", "text": "-\tVarious entries in poms"}, {"type": "hardBreak"}, {"type": "text", "text": "-\tUpdate Project Docs"}, {"type": "hardBreak"}, {"type": "text", "text": "-\tUpdate HPCC portal: "}, {"type": "text", "text": "https://hpccsystems.com/download/third-party-integrations/JAPI", "marks": [{"type": "link", "attrs": {"href": "https://hpccsystems.com/download/third-party-integrations/JAPI"}}]}, {"type":

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
